package Controladores;

import Modelos.MedicoUno;
import Modelos.ClientesModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class ListaController implements ActionListener{
frmListas VistaLista;
ClientesModel ModeloClientes;

    public ListaController(frmListas VistaLista, ClientesModel ModeloClientes) {
        this.VistaLista = VistaLista;
        this.ModeloClientes = ModeloClientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaLista.btnMedico2.addActionListener(this);
        this.VistaLista.btnMedico1.addActionListener(this);
        //LEVANTAR LA VISTA LISTAs
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnMedico1)
        {
            this.ModeloClientes.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
                    this.VistaLista.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<MedicoUno> listaLocal = this.ModeloClientes.ListarClientes();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(MedicoUno MiListaClientes: listaLocal)
                {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
                    this.VistaLista.txtMedicouno.setText(Cadena);
                }
        }    
        
        
        
        
        
        if(e.getSource()==this.VistaLista.btnMedico2)
        {
            this.ModeloClientes.MedicoDos(this.VistaLista.txtApellidos.getText(), 
                    this.VistaLista.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<MedicoUno> listaLocal = this.ModeloClientes.ListaMedico2();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(MedicoUno MiListaClientes: listaLocal)
                {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
                    this.VistaLista.txtMedico2.setText(Cadena);
                }
        }   
        
    }
}
