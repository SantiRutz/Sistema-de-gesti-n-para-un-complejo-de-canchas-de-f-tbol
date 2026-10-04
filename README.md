# El Potrero – Sistema de reservas de canchas

TPI de Programación II – Comisión 2 – UTN Villa María

Sistema para administrar los turnos del complejo de canchas de fútbol El Potrero.

## Integrantes

- Santino Cuevas Rutz
- Jonathan Coman
- Tomás Ortiz
- Alan Chirino

## Sprint 0 – Análisis del problema

El Potrero tiene 4 canchas: 2 de fútbol 5 y 2 de fútbol 7. Hoy anota los turnos en un cuaderno y por WhatsApp, y eso genera reservas superpuestas y pérdida de información.

En el Sprint 0 definimos:

- el problema del cliente y el objetivo del sistema
- las reglas de negocio: horario de 8 a 24, recargo nocturno del 20 % desde las 20, seña del 30 % y descuento del 10 % para clientes frecuentes
- el glosario y los estados de una reserva
- un primer diseño con 10 clases y 4 enumeraciones

## Sprint 1 – Modelo y primera versión

La cátedra nos marcó que eran muchas clases, así que simplificamos el diseño a 6 clases:

| Clase | Qué hace |
| --- | --- |
| Complejo | Guarda las listas y acepta una reserva solo si la cancha está libre |
| Reserva | Calcula el precio de la cancha, el descuento, el total y la seña |
| DetalleReserva | Guarda un servicio extra y su cantidad |
| Cliente | Datos del cliente y si es frecuente |
| Cancha | Número, tipo y precio por hora |
| ServicioExtra | Pelota, pecheras, parrilla y su precio |

La clase Main muestra un ejemplo: Juan reserva la cancha 1 de 19 a 21 con 1 pelota y 2 pecheras. Paga 21.800 en total, con una seña de 6.540.

## Cómo probarlo

1. Descargar el repositorio y abrir la carpeta como proyecto en BlueJ
2. Tocar Compilar
3. Clic derecho en Main y elegir void main
