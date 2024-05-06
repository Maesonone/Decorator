public class Cafe implements BebidaInterface {
    @Override
    public String getDescription() {
        return "Café";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}

// Decorador abstracto
abstract class Decorador implements BebidaInterface {
    protected BebidaInterface bebida;

    public Decorador(BebidaInterface bebida) {
        this.bebida = bebida;
    }

    public String getDescription() {
        return bebida.getDescription();
    }

    public double getCost() {
        return bebida.getCost();
    }
}

// Decorador con leche
class ConLeche extends Decorador {
    public ConLeche(BebidaInterface bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con leche";
    }

    @Override
    public double getCost() {
        return bebida.getCost() + 0.5; // Precio de la leche
    }
}

// Decorador con azúcar
class ConAzucar extends Decorador {
    public ConAzucar(BebidaInterface bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con azúcar";
    }

    @Override
    public double getCost() {
        return bebida.getCost() + 0.3; // Precio del azúcar
    }
}

