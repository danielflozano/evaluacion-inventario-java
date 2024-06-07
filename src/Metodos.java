import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodos {
	ArrayList<String> listaProductos = new ArrayList<>();
	ArrayList<Integer> listaCantidad = new ArrayList<>();
		
	
	public void construirMenu () {
		agregarProducto();
		actualizarCantidad();
	}
	
	// Este Metodo va a permitir agregar nuevos productos
	
	private void agregarProducto() {
		
		System.out.println("*****Agregar un Nuevo Producto*****");
		int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que va a registrar"));
		
		for (int i = 0; i < numProductos; i++) {
			String producto = JOptionPane.showInputDialog("Ingrese el producto " + (i+1));
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " + producto));
			if (listaProductos.contains(producto)) {
				JOptionPane.showMessageDialog(null, "El producto que intenta registrar ya existe en la base de datos, "
						+ "por favor ingrese un nuevo producto");
				i--;
			} else {
				
				listaProductos.add(producto);
				listaCantidad.add(cantidad);
			}
		}
		System.out.println("Registro el producto de manera exitosa");
		System.out.println(listaProductos);
		System.out.println(listaCantidad);
		
	}
	
	private void actualizarCantidad() {
		
		String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto que desea realizar");
		
		for (int i = 0; i < listaProductos.size(); i++) {
			if (listaProductos.get(i).equals(producto)) {
				
				listaProductos.remove(i);
				listaCantidad.remove(i);
				
			} else {
				System.out.println("EL producto no existe");
			}
		}
		System.out.println(listaProductos);
		System.out.println(listaCantidad);
				
	}

}
