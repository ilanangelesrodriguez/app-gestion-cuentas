# app-gestion-cuentas

Trabajo para el curso de Arquitectura de Software.

## Documentación Javadoc

Puedes encontrar la documentación Javadoc [aquí](docs/javadoc/index.html).

## Enlace al Prototipo

Puedes ver el prototipo del proyecto en Figma haciendo clic en el siguiente enlace:

[Ver Prototipo en Figma](https://www.figma.com/file/JfoVSL9LVqCq5h5YedZwvh/AS_Aguilar-Angeles-Due%C3%B1as-Hurtado?type=design&node-id=1%3A6&mode=design&t=ZGCmtxFeZnJDvhjC-1)

## Requisitos Previos

- Java 8 o superior.
- Maven.

## Instalación

Proporciona instrucciones claras sobre cómo instalar y configurar el proyecto. Por ejemplo:

1. Clona este repositorio en tu máquina local:

`git clone https://github.com/tuusuario/tuproyecto.git`

2. Navega al directorio del proyecto:
`cd tuproyecto`

## Uso

Explica cómo utilizar el proyecto y proporciona ejemplos de uso. Por ejemplo:

- Ejecuta la aplicación con el siguiente comando:

``java -jar MiApp.jar``


- Abre la aplicación en tu navegador web: [http://localhost:3000](http://localhost:3000)

## Contribución

Si deseas contribuir al proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu contribución: `git checkout -b feature/nueva-caracteristica`.
3. Realiza tus cambios y realiza commits significativos.
4. Envía una solicitud de extracción (pull request) a la rama principal del proyecto.

## Estructura de Ramas

Este proyecto sigue una estructura de ramas inspirada en GitFlow, utilizando las ramas principales `main` y `develop`.

- **`main`:** La rama principal que refleja el estado de producción. Cada confirmación en esta rama debería representar una versión estable del software.

- **`develop`:** La rama de desarrollo principal. Es la rama de integración para nuevas características y correcciones de errores antes de ser fusionadas en la rama `main`.

## Flujo de Trabajo

1. **Desarrollo de Funcionalidades:**
   - Para trabajar en una nueva característica, crea una rama a partir de `develop`:
     ```bash
     git checkout -b nombre-de-la-funcionalidad develop
     ```
   - Una vez terminada la funcionalidad, fusiona de nuevo con `develop`.

2. **Preparación para Lanzamiento:**
   - Cuando estés listo para lanzar una nueva versión, crea una rama de lanzamiento:
     ```bash
     git checkout -b release/1.0.0 develop
     ```
   - Realiza correcciones y pruebas necesarias en la rama de lanzamiento y, cuando esté listo, fusiona con `main` y `develop`.

3. **Corrección de Problemas en Producción:**
   - Si surge un problema crítico en producción, crea una rama de hotfix:
     ```bash
     git checkout -b hotfix/nombre-del-hotfix main
     ```
   - Realiza correcciones y pruebas necesarias en la rama de hotfix y, cuando esté listo, fusiona con `main` y `develop`.


## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).

## Contacto

- Aguilar Villafana, Juan José - [juanjitoaguilarv@gmail.com](mailto:juanjitoaguilarv@gmail.com)
- Angeles Rodriguez, Ilan Néstor - [ilanangelesrodriguez@gmail.com](mailto:ilanangelesrodriguez@gmail.com)
- Dueñas Blas, Jhosep - [Joseph160704@gmail.com](mailto:Joseph160704@gmail.com)
- Hurtado Ramos, Ronald - [maxx1212_2@hotmail.com](mailto:maxx1212_2@hotmail.com)
- [Enlace al Repositorio en GitHub](https://github.com/ilanangelesrodriguez/app-gestion-cuentas)


