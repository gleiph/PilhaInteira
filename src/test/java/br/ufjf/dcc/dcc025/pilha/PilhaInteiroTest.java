package br.ufjf.dcc.dcc025.pilha;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilhaInteiroTest {
    
    public PilhaInteiroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void pilhaVaziaTamanho(){
        PilhaInteiro pilha = new PilhaInteiro();
        int actual = pilha.size();
        int expected = 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void pilhaVaziaPeek(){
        PilhaInteiro pilha = new PilhaInteiro();
        assertNull(pilha.peek());
    }
    
    @Test
    public void pilhaComUmPush(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        assertEquals(1, pilha.size());
    }
    
    @Test
    public void pilhaComUmPushUmPopTamanho(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(2);
        int topo = pilha.pop();
        assertEquals(0, pilha.size());
    }
    
    @Test
    public void pilhaComUmPushUmPopValor(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(2);
        int topo = pilha.pop();
        assertEquals(2, topo);
    }
    
    @Test
    public void pilhaComTresPush(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.size());
    }
    
    @Test
    public void pilhaComTresPushUmPopTamanho(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.pop();
        assertEquals(2, pilha.size());
    }
    
    @Test
    public void pilhaComTresPushUmPopValor(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.pop());
    }
    
    @Test
    public void pilhaComTresPushUmPeekTamanho(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.peek();
        assertEquals(3, pilha.size());
    }
    
    @Test
    public void pilhaComTresPushUmPeekValor(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.peek());
    }
    
    @Test
    public void pilhaComTresPushTresPeekValor(){
        PilhaInteiro pilha = new PilhaInteiro();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.peek();
        pilha.peek();
        assertEquals(3, pilha.peek());
    }
    
}
