package t3_cuadernodeprecios;
import javax.swing.JOptionPane;
public class T3_TiendadeRopaJframe extends javax.swing.JFrame {
    private T3_Tienda T3_miTienda;
    public T3_TiendadeRopaJframe() {
        initComponents();
        T3_Producto[] catalogo = {
            new T3_Camisa("Camisa Roja", 29.99),
            new T3_Pantalon("Pantalón Azul", 39.99)
        };
        T3_miTienda = new T3_Tienda(catalogo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        catalogoTextArea = new javax.swing.JTextArea();
        actualizarPrecioButton = new javax.swing.JButton();
        mostrarCatalogoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        catalogoTextArea.setColumns(20);
        catalogoTextArea.setRows(5);
        jScrollPane1.setViewportView(catalogoTextArea);

        actualizarPrecioButton.setText("ActualizarCatalogo");
        actualizarPrecioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPrecioButtonActionPerformed(evt);
            }
        });

        mostrarCatalogoButton.setText("MostrarCatalogo");
        mostrarCatalogoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCatalogoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(mostrarCatalogoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(actualizarPrecioButton)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(mostrarCatalogoButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizarPrecioButton)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarPrecioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPrecioButtonActionPerformed
        String nombre = JOptionPane.showInputDialog("Nombre del producto a actualizar:");
        double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio:"));
        T3_miTienda.actualizarPrecio(nombre, nuevoPrecio);
    }//GEN-LAST:event_actualizarPrecioButtonActionPerformed

    private void mostrarCatalogoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCatalogoButtonActionPerformed
                    String catalogo = T3_miTienda.getCatalogo();
        catalogoTextArea.setText(catalogo);
    }//GEN-LAST:event_mostrarCatalogoButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T3_TiendadeRopaJframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarPrecioButton;
    private javax.swing.JTextArea catalogoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarCatalogoButton;
    // End of variables declaration//GEN-END:variables
}
