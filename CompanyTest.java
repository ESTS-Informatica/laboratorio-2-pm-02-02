

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    
    private Company company;
    
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        company = new Company();
        company.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        company.registerClient(new User("António Francisco", "922222222", "tochico@hotmail.com"));
        company.registerSeller(new User("Fernando Fernandes", "966777101", "fefe@remax.pt"));
        company.registerSeller(new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt"));
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
        company = null;
    }
    
     @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    @Test
    public void testRegisterClient() {
        User client = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        assertTrue(company.registerClient(client));
        assertTrue(company.getClients().contains(client));
    }
    
    @Test
    public void testRegisterClients() {
        User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
        assertTrue(company.getClients().contains(client1));
        assertTrue(company.getClients().contains(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        User client = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        assertTrue(company.registerClient(client));
        assertFalse(company.registerClient(client));
        assertEquals(6, company.getClients().size());
    }
    
    @Test
    public void testRegisterClientNull() {
        assertFalse(company.registerClient(null));
        assertEquals(0, company.getClients().size());
    }
}
