# 📘 Práctica Parte 1 — Modernización de Código: De Java 8 a Java 17  
### Curso Java 8 → 21 · Parte 1 (Actualizando código legacy)

En esta práctica vas a trabajar sobre un proyecto Java escrito con estilo **Java 8 “clásico”**, con POJOs verbosos, Optional mal utilizado, concatenación de strings, estructuras repetitivas, etc.  
Tu misión será **actualizar progresivamente** este código para adoptar los estándares modernos de **Java 9–17**.

El objetivo es que aprendas a:

- Reconocer patrones antiguos y reemplazarlos.
- Escribir código más limpio, seguro e inmutable.
- Aprovechar las mejoras del lenguaje sin reescribir la arquitectura.

---

## 🧩 Contenido de la práctica

Actualizarás el proyecto aplicando estas mejoras en orden:

1. **Colecciones inmutables** (`List.of`, `Set.of`, `Map.of`)
2. **Optional moderno** (`ifPresentOrElse`, `or`, `stream`)
3. **Inferencia de tipos con `var`**
4. **Switch expressions**
5. **Text blocks (`"""`)**
6. **Records**
7. **Sealed Classes + Pattern Matching (`instanceof` mejorado)**

Al finalizar, tu código parecerá **de 2025** y no de 2014.

---

## 🚀 0. Preparación del entorno (GitHub Codespaces)

Para esta práctica **NO hace falta que instales nada en tu máquina**.  
Trabajaremos directamente en la nube con **GitHub Codespaces**.

### Pasos

1. Entra en el repositorio de la práctica en GitHub.  
2. Haz clic en el botón verde **“Code”**.
3. Selecciona la pestaña **“Codespaces”**.
4. Pulsa **“Create codespace on main”** (o en la rama indicada por el profesor).
5. Espera a que se abra el entorno de desarrollo en el navegador.

El Codespace ya tendrá:

- Java **17** instalado.
- Maven configurado.
- Editor tipo VS Code listo para trabajar.

Para comprobar que todo funciona, abre una terminal en el Codespace y ejecuta:

```bash
mvn -q -DskipTests package
