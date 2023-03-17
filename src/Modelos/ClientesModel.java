package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ClientesModel {
Queue<MedicoUno> ListaClientes = new LinkedList();
Queue<MedicoUno> ListaMedico2 = new LinkedList();

    public void EncolarCliente(String ape, String nom)
    {
        MedicoUno nuevoCliente = new MedicoUno(ape, nom);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "EL PACIENTE SERÁ ATENDIDO POR EL MEDICO UNO");
        
    }
    
    public void MedicoDos(String ape, String nom)
    {
        MedicoUno nuevoCliente = new MedicoUno(ape, nom);
        this.ListaMedico2.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "EL PACIENTE SERÁ ATENDIDO POR EL MEDICO DOS");
        
    }
    
    
    
public Queue ListarClientes()
{
    return this.ListaClientes;
}

public Queue ListaMedico2()
{
    return this.ListaMedico2;
}

public void DesEncolar()
{
    this.ListaClientes.poll();
    this.ListaMedico2.poll();
}

}

