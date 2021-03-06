/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.atencion;

import Controlador.ControladorSolicitudNumero;
import Controlador.Interfaces.VistaSolicitudNumero;
import Modelo.Datos.Area;
import Modelo.Datos.Atencion;
import Excepciones.AvisosException;
import Modelo.Datos.Cliente;
import Modelo.Datos.Sector;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SolicitudNumero extends javax.swing.JFrame implements VistaSolicitudNumero {

    private Area area;
    private Cliente cliente;
    private Sector sector;
    private Atencion atencion;

    private ControladorSolicitudNumero controlador;

    public SolicitudNumero(Area area) {
        initComponents();
        this.area = area;
        this.controlador = new ControladorSolicitudNumero(this);
        cargarNombreArea();
        cargarSector();
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSectores = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNumero = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblSector = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SOLICITUD DE NÚMEROS - AREA:");

        jLabel2.setText("Ingresar Cédula de Identidad");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstSectores);

        jLabel3.setText("Seleccionar sector");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setText("Su número:");

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 0, 0));
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setText("Nombre:");

        btnNumero.setText("Solicitar número");
        btnNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha:");

        jLabel8.setText("Hora:");

        jLabel9.setText("Sector:");

        lblNombreCliente.setText("jLabel10");

        lblFecha.setText("jLabel10");

        lblHora.setText("jLabel10");

        lblSector.setText("jLabel10");

        lblArea.setText("jLabel10");

        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        jScrollPane2.setViewportView(txtDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblArea))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnNumero)))
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(155, 155, 155)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel9)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblSector))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(lblHora))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel7)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(lblFecha))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblNombreCliente))))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(lblArea))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnNumero))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(lblNombreCliente))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(lblFecha))
                                                                .addGap(14, 14, 14)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(lblHora))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(lblSector))))
                                                .addGap(11, 11, 11)
                                                .addComponent(jScrollPane2)
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void btnNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroActionPerformed
        sector = (Sector) lstSectores.getSelectedValue();
        controlador.loginCliente(txtCedula.getText(), sector);
    }//GEN-LAST:event_btnNumeroActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSector;
    private javax.swing.JList lstSectores;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables


    public void cargarSector() {
        controlador.obtenerSectores(area);
    }

    @Override
    public void cargarSectores(List<Sector> sectores) {
        lstSectores.setListData(sectores.toArray());
    }

    public void cargarNombreArea() {
        lblArea.setText(area.getNomArea());
    }

    @Override
    public void errorLogin(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void ingresarCliente(Cliente cliente, Atencion atencion) {
        this.setCliente(cliente);
        this.setAtencion(atencion);
        cargarDatosAtencion();
    }

    public void cargarDatosAtencion() {
        String fechaSolicitud = new SimpleDateFormat("dd/MM/yyyy").format(atencion.getFechaSolicitudNumero());
        String horaSolicitud = new SimpleDateFormat("hh:mm").format(atencion.getFechaSolicitudNumero());
        String info = "*Información del Cliente \n _____________________" + "\n"
                + "*Nombre Cliente:" + cliente.getNombreCompleto() + "\n"
                + "*Número:" + atencion.getNumero() + "\n"
                + "*Fecha:" + fechaSolicitud + "\n" + "*Hora Solicitado:" + horaSolicitud + "\n"
                + "*Nombre del Sector:" + (atencion.getSector().getNomSector()) + "\n _____________________";

        txtDatos.setText(info);
    }
}
