# language: es

  Característica: Realizar compras de artículos
  Como un nuevo cliente
  Quiero ingresar a la pagina www.abc.com
  Para realizar una compra de un articulo

  Escenario: Agregar artículos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega un producto al carro
    Entonces el ve los productos listado en el carro de compras

  Esquema del escenario: Agregar artículos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega productos al carro
      | <nombreProducto> | <cantidadAgregar> |
    Entonces el ve los productos listado en el carro de compras

  Ejemplos:
    | nombreProducto | cantidadAgregar |
    | Tapabocas N95  | 100             |