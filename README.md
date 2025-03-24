#Programación Orientada a Objetos I 🤓

### 📌 Descripción
Este es un proyecto en el cual se compilan las primeras sesiones de Programación Orientada a Objetos I. Encontrarás diferentes ejercicios relacionados con la creación de clases, gestión de propiedades, constructores, métodos y herencia. 

### 📋 Requisitos

- Puedes trabajar en IDEs como NeatBeans o Eclipse. 

### 📄 Contenido
- PostIt.
- Rectangulo.
- Animal.
- Counter.
- Vehiculo.
- Point.
- Vector.
- Person.
- Reloj.

### 📜 Código de ejemplo
```java

  // 1. Propiedades
  private static boolean tieneCanasto = true; 
  private int marcha;

  //2. Constructores
  public Bici (double peso, String matricula, double velocidad) {
      super("rojo", 30, 2, peso, matricula, velocidad);
      //Las sevicis por defecto son rojas
      marcha = 1;
  }

  //3. Métodos
  public int cambioMarcha (){
      return marcha = marcha < 10 ? marcha + 1 : 10;
   }

```

### ✨ Autor
- **Angie Amado** - [GitHub](https://github.com/angieah17)

