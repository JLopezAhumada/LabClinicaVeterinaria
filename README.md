# Laboratorio Clínica Veterinaria

Proyecto de IntelliJ con las clases Animal, Perro, Gato, Ave, Conejo, Clinica y las interfaces Vacunable y Asegurable. Para probarlo se abre la carpeta en IntelliJ y se ejecuta Main.

## Respuestas

**¿Qué pasa si hago new Animal("Luna", 3, "Carlos")?**
No deja. Java marca el error apenas lo escribes, antes de ejecutar, porque Animal es abstracta y no se pueden crear objetos de ella.

**¿Por qué los atributos de Animal son protected?**
Para que Perro, Gato y Ave los puedan usar directo. Si fueran private las hijas no los verían, y si fueran public cualquiera los podría cambiar desde afuera.

**¿Por qué el costo de consulta no se puede escribir en Animal?**
Porque cada especie cobra distinto. Animal no sabe cuánto cobrar, por eso solo lo declara y cada hija lo resuelve.

**Preguntas de las subclases**
Cada una tiene su propio dato además de los heredados (raza, esEsterilizado y pesoGramos). Al constructor del padre se le llama con super(...). La anotación que se usa es @Override. Y Java obliga a escribir el costo de consulta porque en Animal está como abstracto y si no se escribe la clase no compila.

**¿Por qué Vacunable es una interfaz y no un método en Animal?**
Porque no todos los animales se vacunan, el ave por ejemplo no. Si estuviera en Animal todos tendrían que hacerlo. Con la interfaz, si mañana se vacunan peces o reptiles, solo se les agrega y ya.

**¿Por qué Clinica puede implementar Asegurable sin ser un animal?**
Porque una interfaz no pide ser de ninguna familia, solo pide cumplir los métodos. La herencia dice lo que algo es y la interfaz dice lo que algo puede hacer.

**Mapa del sistema**

| Clase   | Extiende | Implementa             | Abstracta |
|---------|----------|------------------------|-----------|
| Animal  | nada     | nada                   | Sí        |
| Perro   | Animal   | Vacunable y Asegurable | No        |
| Gato    | Animal   | Vacunable y Asegurable | No        |
| Ave     | Animal   | nada                   | No        |
| Clinica | nada     | Asegurable             | No        |

**¿Cómo sabe imprimirFicha() qué costo mostrar si está en el padre?**
Porque Java mira el objeto real que hay en ese momento. Si es un perro usa el costo del perro, si es un gato el del gato, y así.

**¿Por qué el ave no puede llamar registrarVacuna()?**
Porque Ave no tiene ese método. Si lo intentas el compilador dice que no encuentra el método (cannot find symbol).

**¿Por qué el perro cabe en Animal[] y también en Asegurable[]?**
Porque el perro es un Animal y además cumple con Asegurable. En el primer arreglo se ve como animal de la clínica y en el segundo como algo que se puede asegurar.

**¿Cuántas líneas cambié para agregar Conejo?**
Ninguna clase vieja se tocó. Solo se creó Conejo y en el Main se agregó el conejo al arreglo, que es crear el objeto y ponerlo en la lista.
