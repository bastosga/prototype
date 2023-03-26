package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteOficinaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        ClienteOficina ClienteOficina = new ClienteOficina(123, "ClienteOficina Original", new Endereco("Rua A", 1));

        ClienteOficina ClienteOficinaClone = ClienteOficina.clone();
        ClienteOficinaClone.setlogin(456);
        ClienteOficinaClone.setNome("ClienteOficina Clonado");
        ClienteOficinaClone.getEndereco().setNumero(2);

        assertEquals("ClienteOficina{login=123, nome='ClienteOficina Original', endereco=Endereco{logradouro='Rua A', numero=2}",ClienteOficina.toString());
        assertEquals("ClienteOficina{login=456, nome='ClienteOficina Clonado', endereco=Endereco{logradouro='Rua A', numero=2}", ClienteOficinaClone.toString());
    }
}