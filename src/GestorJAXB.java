
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import tallercoche_binding.Taller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class GestorJAXB {

    //lista
    Taller miCoche;
    Unmarshaller u;
    JAXBContext contexto;

    public int abrirXML_JAXB() {
        try {
            contexto = JAXBContext.newInstance(Taller.class);
            u = contexto.createUnmarshaller();

            miCoche = (Taller) u.unmarshal(new File("taller_coche.xml"));
            File miFile = new File("taller_coche.xml");
            System.out.println(miFile.getAbsolutePath());

            return 1;
        } catch (Exception e) {

            return -1;
        }

    }

    public int cerrarXML_JAXB() {
        try {
            Marshaller m = contexto.createMarshaller();
            m.marshal(miCoche, new File("taller_coche.xml"));
            return 1;
        } catch (Exception e) {
        }
        return -1;
    }

    public String recorrerJAXB() {
        String cadena_resultado = "";
        List<Taller.Coche> iCoche = miCoche.getCoche();

        for (int i = 0; i < iCoche.size(); i++) {
            Taller.Coche cocheAuxiliar = iCoche.get(i);
            List<Taller.Coche.Propietario> iPropietario = iCoche.get(i).getPropietario();
            Taller.Coche.Asunto iAsunto = iCoche.get(i).getAsunto();

            cadena_resultado = cadena_resultado + "\nCliente nuevo\n" + "\nVehiculo: " + cocheAuxiliar.getMatricula();
            cadena_resultado = cadena_resultado + "\nfecha de la entrada: " + cocheAuxiliar.getFechaEntrada();
            cadena_resultado = cadena_resultado + "\nLa marca del vehiculo es: " + cocheAuxiliar.getMarca();
            for (int j = 0; j < iPropietario.size(); j++) {
                cadena_resultado = cadena_resultado + "\nPropietario: \n" + "\nDNI: " + iPropietario.get(j).getDni();
                cadena_resultado = cadena_resultado + "\nNombre: " + iPropietario.get(j).getNombre();
                cadena_resultado = cadena_resultado + "\nPrimer Apellido: " + iPropietario.get(j).getPrimerApellido();
                cadena_resultado = cadena_resultado + "\nSegundo Apellido: " + iPropietario.get(j).getSegundoApellido();
            }
            cadena_resultado = cadena_resultado + "\nAsunto: \n" + "Mecanico: " + iAsunto.getMecanico().getValue();
            cadena_resultado = cadena_resultado + "\nCon el Id: " + iAsunto.getMecanico().getId();
            cadena_resultado = cadena_resultado + "\nDescripcion: " + iAsunto.getDescripcion();
            cadena_resultado = cadena_resultado + "\nPrecio: " + cocheAuxiliar.getPrecio();
            cadena_resultado = cadena_resultado + "\nFecha de recogida de vehiculo: " + cocheAuxiliar.getFechaSalida()
                    + "\n--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--\n";
        }
        return cadena_resultado;
    }

    public String sustituyoValores(String contenidoAntiguo, String contenidoNuevo, String dniComprobar,
            String matriculaComprobar) {
        String cadena_resultado = "";
        List<Taller.Coche> iCoche = miCoche.getCoche();
        for (int i = 0; i < iCoche.size(); i++) {
            Taller.Coche cocheAuxiliar = iCoche.get(i);
            List<Taller.Coche.Propietario> iPropietario = cocheAuxiliar.getPropietario();
            for (int j = 0; j < iPropietario.size(); j++) {
                Taller.Coche.Propietario propietarioAuxiliar = iPropietario.get(j);
                if (cocheAuxiliar.getMatricula().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iCoche.get(i).setMatricula(contenidoNuevo);
                } else if (cocheAuxiliar.getFechaEntrada().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iCoche.get(i).setFechaEntrada(contenidoNuevo);
                } else if (cocheAuxiliar.getMarca().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iCoche.get(i).setMarca(contenidoNuevo);
                } else if (cocheAuxiliar.getPrecio().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iCoche.get(i).setPrecio(contenidoNuevo);
                } else if (propietarioAuxiliar.getNombre().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iPropietario.get(j).setNombre(contenidoNuevo);
                } else if (propietarioAuxiliar.getDni().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iPropietario.get(j).setDni(contenidoNuevo);
                } else if (propietarioAuxiliar.getPrimerApellido().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iPropietario.get(j).setPrimerApellido(contenidoNuevo);
                } else if (propietarioAuxiliar.getSegundoApellido().equals(contenidoAntiguo) && propietarioAuxiliar.getDni().equals(dniComprobar)) {
                    iPropietario.get(j).setSegundoApellido(contenidoNuevo);
                }

            }

        }
        for (int i = 0; i < iCoche.size(); i++) {
            Taller.Coche cocheAuxiliar = iCoche.get(i);
            List<Taller.Coche.Propietario> iPropietario = iCoche.get(i).getPropietario();
            Taller.Coche.Asunto iAsunto = iCoche.get(i).getAsunto();

            cadena_resultado = cadena_resultado + "\nCliente nuevo\n" + "\nVehiculo: " + cocheAuxiliar.getMatricula();
            cadena_resultado = cadena_resultado + "\nfecha de la entrada: " + cocheAuxiliar.getFechaEntrada();
            cadena_resultado = cadena_resultado + "\nLa marca del vehiculo es: " + cocheAuxiliar.getMarca();
            for (int j = 0; j < iPropietario.size(); j++) {
                cadena_resultado = cadena_resultado + "\nPropietario: \n" + "\nDNI: " + iPropietario.get(j).getDni();
                cadena_resultado = cadena_resultado + "\nNombre: " + iPropietario.get(j).getNombre();
                cadena_resultado = cadena_resultado + "\nPrimer Apellido: " + iPropietario.get(j).getPrimerApellido();
                cadena_resultado = cadena_resultado + "\nSegundo Apellido: " + iPropietario.get(j).getSegundoApellido();
            }
            cadena_resultado = cadena_resultado + "Asunto: \n" + "\nMecanico: " + iAsunto.getMecanico().getValue();
            cadena_resultado = cadena_resultado + "\nCon el Id: " + iAsunto.getMecanico().getId();
            cadena_resultado = cadena_resultado + "\nDescripcion: " + iAsunto.getDescripcion();
            cadena_resultado=cadena_resultado+ "\nPrecio"+cocheAuxiliar.getPrecio();
            cadena_resultado = cadena_resultado + "\nFecha de recogida de vehiculo: " + cocheAuxiliar.getFechaSalida()
                    + "\n--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--\n";
        }
        System.out.println(cadena_resultado);
        return cadena_resultado;
    }

}
