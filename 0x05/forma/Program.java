public class Program {
    FormaGeometrica formaGeometrica = new FormaGeometrica();

            try {
        System.out.printf("Area: %d", formaGeometrica.area());
    } catch (Exception e) {
        System.out.println(e);
    }
}

}
