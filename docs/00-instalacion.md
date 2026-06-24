# 00 - Instalacion

## Objetivo

Preparar el ambiente para crear, ejecutar y probar el proyecto Java.

## Definiciones

- **Java JDK**: herramientas necesarias para escribir, compilar y ejecutar programas Java. Incluye `java` y `javac`.
- **JVM**: maquina virtual que ejecuta programas Java.
- **JRE**: entorno para ejecutar Java. En versiones modernas viene integrado dentro del JDK.
- **Apache NetBeans**: entorno grafico donde el alumno puede crear, abrir y ejecutar el proyecto.
- **Maven**: herramienta que organiza el proyecto, descarga dependencias y ejecuta comandos como compilar o probar.
- **MySQL**: motor de base de datos donde guardaremos estudiantes, cursos, inscripciones y notas.
- **MySQL Workbench**: aplicacion grafica para ejecutar scripts SQL manualmente.
- **Git**: herramienta para guardar versiones del codigo.

## Teoria breve

Antes de programar hay que instalar las herramientas. Programar no es solo escribir codigo: tambien es saber ejecutar, probar y revisar lo que hiciste.

Para esta tutoría se usara una instalacion global de Java JDK 17. Es una decision intencional: reduce friccion, permite que NetBeans detecte Java facilmente y se parece al flujo usado en muchos cursos introductorios.

NetBeans no reemplaza al JDK. NetBeans es el IDE; el JDK es lo que permite compilar y ejecutar Java.

## Instalacion en macOS

Decision del curso: instalar Java JDK 17 globalmente con Homebrew.

Instalar Homebrew si no esta instalado:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

Instalar herramientas:

```bash
brew install openjdk@17
brew install maven
brew install git
```

Agregar Java al `PATH` en macOS Apple Silicon:

```bash
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
echo 'export JAVA_HOME="/opt/homebrew/opt/openjdk@17"' >> ~/.zshrc
source ~/.zshrc
```

Agregar Java al `PATH` en macOS Intel:

```bash
echo 'export PATH="/usr/local/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
echo 'export JAVA_HOME="/usr/local/opt/openjdk@17"' >> ~/.zshrc
source ~/.zshrc
```

Verificar:

```bash
java -version
javac -version
mvn -version
git --version
```

Descargar Apache NetBeans desde `https://netbeans.apache.org/`.

Descargar MySQL Workbench desde `https://dev.mysql.com/downloads/workbench/`.

### Desinstalar en macOS

Eliminar Java, Maven y Git instalados con Homebrew:

```bash
brew uninstall openjdk@17
brew uninstall maven
brew uninstall git
```

Quitar las lineas agregadas a `~/.zshrc`:

```txt
export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"
export JAVA_HOME="/opt/homebrew/opt/openjdk@17"
```

O, si el equipo es Intel:

```txt
export PATH="/usr/local/opt/openjdk@17/bin:$PATH"
export JAVA_HOME="/usr/local/opt/openjdk@17"
```

Verificar que Java ya no responde o que no apunta al JDK del curso:

```bash
java -version
which java
```

## Instalacion en Linux

En distribuciones basadas en Ubuntu:

```bash
sudo apt update
sudo apt install openjdk-17-jdk maven git mysql-server
```

Descargar Apache NetBeans desde `https://netbeans.apache.org/`.

Descargar MySQL Workbench desde `https://dev.mysql.com/downloads/workbench/` o usar el paquete disponible para tu distribucion.

## Instalacion en Microsoft Windows

Homebrew no es el camino recomendado para Windows. Para una tutoría, la opcion mas simple es instalar Java globalmente con `winget` o con instalador grafico.

Con `winget`:

```powershell
winget install EclipseAdoptium.Temurin.17.JDK
winget install Apache.NetBeans
winget install Apache.Maven
winget install Git.Git
winget install Oracle.MySQLWorkbench
```

Si `winget` no esta disponible, instalar manualmente:

1. Java JDK 17 desde `https://adoptium.net/`.
2. Apache NetBeans desde `https://netbeans.apache.org/`.
3. Maven desde `https://maven.apache.org/download.cgi` o usar el Maven integrado de NetBeans.
4. Git desde `https://git-scm.com/download/win`.
5. MySQL Workbench desde `https://dev.mysql.com/downloads/workbench/`.

Verificar en PowerShell:

```powershell
java -version
javac -version
mvn -version
git --version
```

### Desinstalar en Microsoft Windows

Si se instalo con `winget`:

```powershell
winget uninstall EclipseAdoptium.Temurin.17.JDK
winget uninstall Apache.NetBeans
winget uninstall Apache.Maven
winget uninstall Git.Git
winget uninstall Oracle.MySQLWorkbench
```

Si se instalo con instaladores graficos:

1. Abrir `Configuracion`.
2. Entrar en `Aplicaciones > Aplicaciones instaladas`.
3. Buscar y desinstalar `Temurin JDK 17`, `Apache NetBeans`, `Apache Maven`, `Git` o `MySQL Workbench`.
4. Revisar variables de entorno si Java sigue apareciendo en terminal.

Verificar:

```powershell
java -version
where java
```

## Ejemplo guiado

Verificar Java y Maven:

```bash
java -version
javac -version
mvn -version
git --version
```

## Practica del alumno

Ejecutar los comandos de verificacion y anotar que version aparece para cada herramienta.

## Revision

- Java responde con una version.
- `javac` responde con una version.
- Maven responde con una version.
- Git responde con una version.
- NetBeans abre correctamente.
- MySQL Workbench abre correctamente.

## Reto para casa

Tomar nota de las versiones instaladas y escribir para que sirve cada herramienta en una frase.
