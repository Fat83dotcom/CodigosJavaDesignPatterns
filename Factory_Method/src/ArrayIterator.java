import java.util.ArrayList;

public class ArrayIterator {
    public ArrayIterator(ArrayList<ItemPedido> itens) {
    }

    public void removeItensInvaldos(ArrayList<ItemPedido> itens) {
        ArrayIterator<ItemPedido> cursor = new ArrayIterator(itens);

        while (cursor.hasNext()) {
            ItemPedido item = cursor.next();
            if (! isValido(item)) {
                cursor.remove(item);
            }
        }
    }

    public boolean isValido(ItemPedido item) {
        return (item.getQuantidade() > 0 && item.getQuantidade() < 100);
    }
}
