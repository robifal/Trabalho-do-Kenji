#!/bin/bash

# Cores para output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
CYAN='\033[0;36m'
NC='\033[0m' # No Color

echo -e "${CYAN}╔════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║   COMPILADOR E EXECUTOR DE TESTES         ║${NC}"
echo -e "${CYAN}║   Sistema: Sinal Verde                    ║${NC}"
echo -e "${CYAN}╚════════════════════════════════════════════╝${NC}"
echo ""

# Verificar se Java está instalado
if ! command -v java &> /dev/null; then
    echo -e "${RED}[ERRO] Java não encontrado!${NC}"
    echo "Instale Java com:"
    echo "  Ubuntu/Debian: sudo apt install openjdk-21-jdk"
    echo "  Fedora: sudo dnf install java-21-openjdk-devel"
    echo "  Arch: sudo pacman -S jdk-openjdk"
    exit 1
fi

# Verificar se javac está instalado
if ! command -v javac &> /dev/null; then
    echo -e "${RED}[ERRO] javac não encontrado!${NC}"
    echo "Instale o JDK completo (não apenas JRE)"
    exit 1
fi

echo -e "${YELLOW}[1/3] Limpando arquivos compilados anteriores...${NC}"
if [ -d "bin" ]; then
    rm -rf bin
fi
mkdir -p bin
echo -e "${GREEN}  ✓ Diretório bin criado${NC}"

echo ""
echo -e "${YELLOW}[2/3] Compilando código...${NC}"

# Compilar exceções
echo "  - Compilando exceções..."
javac -d bin -encoding UTF-8 ../exceptions/*.java
if [ $? -ne 0 ]; then
    echo -e "${RED}  ✗ Erro ao compilar exceções${NC}"
    exit 1
fi

# Compilar classes de negócio
echo "  - Compilando classes de negócio..."
javac -d bin -encoding UTF-8 -cp bin src/ExeceptionImplementas/*.java
if [ $? -ne 0 ]; then
    echo -e "${RED}  ✗ Erro ao compilar classes de negócio${NC}"
    exit 1
fi

# Compilar testes
echo "  - Compilando testes..."
javac -d bin -encoding UTF-8 -cp bin src/testes/*.java
if [ $? -ne 0 ]; then
    echo -e "${RED}  ✗ Erro ao compilar testes${NC}"
    exit 1
fi

echo -e "${GREEN}  ✓ Compilação concluída com sucesso!${NC}"

echo ""
echo -e "${YELLOW}[3/3] Executando testes...${NC}"
echo "════════════════════════════════════════════"
echo ""

# Executar testes
java -cp bin testes.TestRunner
TEST_RESULT=$?

echo ""
echo "════════════════════════════════════════════"
if [ $TEST_RESULT -eq 0 ]; then
    echo -e "${GREEN}✓ Execução concluída com sucesso!${NC}"
else
    echo -e "${RED}✗ Alguns testes falharam${NC}"
fi

echo ""
exit $TEST_RESULT