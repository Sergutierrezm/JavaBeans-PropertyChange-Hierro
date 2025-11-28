ControlHierroJavaBeans

Descripción

Proyecto en Java que utiliza JavaBeans y PropertyChange para monitorizar cambios en el nivel de hierro de una persona.
Permite detectar automáticamente si el hierro supera un umbral determinado y notificar mediante un mensaje en consola.

⸻

Funcionalidades
	•	Guardar datos de una persona (nombre y nivel de hierro).
	•	Registrar listeners que reaccionan ante cambios en el nivel de hierro.
	•	Notificar si el hierro supera 10 con un mensaje de aviso.
	•	Usar JavaBeans con PropertyChangeSupport y PropertyChangeListener.

⸻

Estructura del proyecto
	•	Persona.java → Bean fuente que contiene la propiedad hierro y dispara eventos.
	•	ControlAnalisis.java → Bean receptor que implementa PropertyChangeListener y recibe notificaciones de cambios.
	•	Hospital.java → Clase principal (main) donde se crean las personas, se registran listeners y se prueban los cambios.

⸻

Notas
	•	Se usa PropertyChangeSupport para notificar automáticamente los cambios en las propiedades.
	•	PropertyChangeListener permite separar la lógica de control de la lógica de la persona.
