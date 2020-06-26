# TallerSolid

### Principios de diseño que han sido violentados: 

#### Literal 1
Debido a que las clases Helado y Pastel tienen implementaciones y necesidades similares lo correcto es tener una clase padre de la cual puedan heredar comportamientos. Con la implementación inicial se puede notar que se viola el principio de diseño LSP ya que se puede hacer uso de la herencia sin inducir fallos en el sistema.

#### Literal 2
En esta sección se viola el princpio SRP ya que las operaciones de agregar o quitar un aderezo pueden ser perfectamente abarcadas como parte de la responsabilidad de la clase Postre, no es necesario recurrir a nuevas clases para ese objetivo.

#### Literal 3
Se viola el principio SRP ya que los métodos calcularPrecioFinal() y  showPrecioFinal() no guardan relacion con la responsabilidades para las que han sido destinadas las clases Helado y Pastel, por lo tanto lo ideal es tener una nueva clase que se encargue de estos procesos. 

#### Literal 4
Se viola el principio SRP ya que cada tipo de aderezo debe tener su propia clase que se encargue de asignarle un nombre. Además se viola el principio OCP ya que la clase abstracta Aderezo debería estar abierta a la modificación desde las subclases para permitir crear nuevos tipos de Aderezo sin tener que modificar la clase padre - principal. Y DIP ya que los tipos de aderezos no deberian depender entre ellas.

#### Literal 5
La función de usarPastel() en la clase LecheDeslactosada lanza una excepción, puesto que hereda de la clase leche que la obliga a implementar el método. Sin embargo este no es usado. Violando de esta forma el principio LSP de SOLID.
Se creó una clase que hace las veces de interfaz LecheDes implementando a la clase LecheEntera. De esta forma se puede dar la posibilidad a que existan tipos de leche que se puede usar en distintos postres.

