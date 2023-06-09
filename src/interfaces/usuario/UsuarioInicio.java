package interfaces.usuario;

import clases.Persona;
import interfaces.Inicio;
import interfaces.chat.BuscarChats;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioInicio {
    private JPanel usuarioInicio;
    private JButton btnGenerarPedido;
    private JButton btnEstadoPaquete;
    private JButton btnCancelarEntrega;
    private JButton btnCambiarDatosEnvio;
    private JTextField txtNombreFIjo;
    private JButton btnCerrarSesion;
    private JButton btnChat;


    public UsuarioInicio(Persona p) {
        txtNombreFIjo.setText(p.getNombre());
        /*
         Redirecciona a interfaz inicio
         */
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new Inicio().getPanel());
                este.revalidate();
            }
        });
        /*
            Redirecciona a interfaz usuario envio
         */
        btnGenerarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new UsuarioEnvio(p).getUsuarioEnvio());
                este.revalidate();
            }
        });
        /*
        Redirecciona a interfaz estado Paquete
         */
        btnEstadoPaquete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new estadoPaquete(p).getEstadoPaquete());
                este.revalidate();
            }
        });
        /**
         * Redirecciona a interfaz cancelar entrega
         */
        btnCancelarEntrega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new cancelEntrega(p).getCancelEntrega());
                este.revalidate();
            }
        });
        /**
         * Redirecciona a interfaz cambiar datos envio
         */
        btnCambiarDatosEnvio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new CambiarDatosEnvio(p).getCambiarDatosEnvio());
                este.revalidate();
            }
        });
        btnChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame este = (JFrame) SwingUtilities.getWindowAncestor(usuarioInicio);
                este.setContentPane(new BuscarChats(p).getBuscarChat());
                este.revalidate();
            }
        });
    }

    /*
            Metodo get del panel
        */
    public JPanel getUsuarioInicio() {
        return usuarioInicio;
    }

}
