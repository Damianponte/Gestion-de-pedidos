Sistema de Gestión de Pedidos de Comida a Domicilio

Este proyecto implementa un sistema de gestión de pedidos para una empresa de reparto de comida a domicilio. Permite administrar usuarios (clientes y repartidores), pedidos y productos, así como la asignación automática de repartidores.

Descripción del sistema

La aplicación gestiona:

Usuarios, que pueden ser:
Clientes
Repartidores
Pedidos realizados por clientes
Productos incluidos en cada pedido
Asignación de repartidores a pedidos
Tipos de usuarios
Cliente
Puede crear pedidos
Puede tener múltiples pedidos asociados
Repartidor
Tiene una zona de reparto
Tiene un estado:
Disponible
Ocupado
Puede encargarse de varios pedidos solo si está disponible
Pedidos

Cada pedido incluye:

Identificador único
Fecha del pedido
Estado:
Pendiente
En reparto
Entregado
Cancelado
Cliente asociado
Repartidor asignado (puede ser null al inicio)
Lista de productos
Reglas de negocio
No se pueden añadir productos duplicados
No se puede asignar un repartidor si el pedido no tiene productos
Solo se puede entregar un pedido si está en estado “en reparto”
Productos

Cada producto contiene:

Nombre
Precio
Categoría (bebida, comida, postre, etc.)

El total del pedido se calcula automáticamente.

Lógica del sistema
El cliente crea un pedido añadiendo productos
El pedido se puede asignar a un repartidor si está disponible
Al asignarse:
El pedido pasa a estado “en reparto”
El repartidor pasa a estado “ocupado”
Al entregarse:
El pedido pasa a estado “entregado”
El repartidor vuelve a estar “disponible”
Tecnologías utilizadas
Java
Eclipse IDE
Programación orientada a objetos (POO)
Diagrama de clases

El diagrama de clases fue realizado con diagrams.net.

Archivo incluido en el repositorio:
