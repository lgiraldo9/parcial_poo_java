
void main(String[] args){
    //se crea la Biblioteca
    Biblioteca biblioteca = new Biblioteca("Biblioteca Unisalamanca");

    // se crea el autor

    Autor autor1 = new Autor("Gabriel Garcia Marquez","Colombiano", 1927);
    Autor autor2 = new Autor("Antoine de Saint-Exupéry","Frances", 1900);

    // se crea el libro o revista
    Libro libro1 = new Libro("L01","Los Cuentos de Mama Grande",1962,true,157 ,"Ficcion Literaria",autor1);
    Libro libro2 = new Libro("L02", "Cien Años de Soledad", 1967, true, 471 , "Novela", autor1);
    Libro libro3 = new Libro("L03","Antoine de Saint-Exupéry",1943,true,120 ,"novela corta",autor2);
    Revista revista1 = new Revista("R01", "National Geographic", 2023, true, 45 , "Mensual", "ISSN-1234");

    //se cra el socio

    Socio socio1 = new Socio("1045742349 ","Luis Gonzalo Giraldo Garcia ", 0.0);
    Socio socio2 = new Socio("987654321 ", "Ana González ", 0.0);

    //se crea l prestamo del libro o la revista
    Prestamo prestamo1 = new Prestamo("2025-04-01", 0, libro1, false, 7, socio1);
    Prestamo prestamo2 = new Prestamo("2025-04-05", 0, revista1, false, 5, socio1);
    Prestamo prestamo3 = new Prestamo("2025-04-10", 0, libro2, false, 10, socio2);


    //se agrega l material o socios a la biblioteca
    biblioteca.agregarMaterial(libro1);
    biblioteca.agregarMaterial(libro2);
    biblioteca.agregarMaterial(revista1);
    biblioteca.agregarSocio(socio1);
    biblioteca.agregarSocio(socio2);

    //se agrega el prestamo a cada socio
    socio1.agregarPrestamo(prestamo1);
    socio1.agregarPrestamo(prestamo2);
    socio2.agregarPrestamo(prestamo3);

    //se muestra la devolucion  con retrasa
    prestamo1.devolver(10);
    System.out.println("Multa de " + socio1.getNombre() + ": $" + prestamo2.calcularMulta());


    //mostramos todos los datos
    biblioteca.mostrarCatalogo();
    biblioteca.mostrarSocio();
    socio1.mostrarPrestamo();
    socio2.mostrarPrestamo();
}