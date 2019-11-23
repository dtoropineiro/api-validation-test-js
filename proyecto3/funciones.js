function Sumar(a,b) {
	return a + b;
}

function Producto(a,b) {
    var c = 20;
    return a*b*c;
}

console.log(Sumar(40,25));
console.log(Producto(7,8));

var Persona = {
    nombre: "Juan",
    apellido: "Perez",
    telefono: 900199703,
    email: "juan.perez@gmail.com"
    }

function getPersona(){
    return Persona;
}

console.log(getPersona());