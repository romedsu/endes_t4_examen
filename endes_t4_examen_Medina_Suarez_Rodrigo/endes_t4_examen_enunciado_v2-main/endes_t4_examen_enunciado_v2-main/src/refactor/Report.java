package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        imprimirTitulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        imprimirConclusion();

    }

    private static void imprimirTitulo() {
        System.out.println("Título del Reporte");
    }

    private static void imprimirConclusion() {
        System.out.println("Conclusión del Reporte");
    }
    
    
}