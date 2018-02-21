public class Variables {

    public static void main(String[] args)
    {
        int pizzas = 6;
        int personas = 3;
        int pizzasPorPersona = pizzas / personas;

        System.out.printf("Si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n",
                pizzas, personas, pizzasPorPersona);

        String auto = "Renault";
        double velocidad = 90.5;
        System.out.printf("El auto %s se desplaza a %f km/h\n", auto  , velocidad);

        int precioLeche = 14;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double precioTotal = precioLeche + precioJamon + precioHuevo;

        System.out.printf("El precio total es %f\n", precioTotal);
    }
}
