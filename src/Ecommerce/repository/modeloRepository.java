package Ecommerce.repository;

public class modeloRepository {

	import Ecommerce.model.modeloPanela;
	import Ecommerce.model.modeloFrigideira;

	import java.util.List;

	public interface modeloRepository {
	    List<modeloPanela> listarPanelas();
	    
	    List<modeloFrigideira> listarFrigideiras();
	    
	    modeloPanela procurarPanelaPorId(int id);
	    modeloFrigideira procurarFrigideiraPorId(int id);
	    
	    
	    void cadastrarPanela(modeloPanela panela);
	    void cadastrarFrigideira(modeloFrigideira frigideira);
	    void atualizarPanela(modeloPanela panela);
	    void atualizarFrigideira(modeloFrigideira frigideira);
	    void deletarPanela(int id);
	    void deletarFrigideira(int id);
	}