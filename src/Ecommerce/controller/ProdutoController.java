package Ecommerce.controller;

import Ecommerce.model.modeloPanela;
import Ecommerce.model.modeloFrigideira;
import Ecommerce.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController implements ProdutoRepository {
    private List<modeloPanela> listaPanelas;
    private List<modeloFrigideira> listaFrigideiras;

    public ProdutoController() {
        this.listaPanelas = new ArrayList<>();
        this.listaFrigideiras = new ArrayList<>();
    }

    @Override
    public List<modeloPanela> listarPanelas() {
        return listaPanelas;
    }

    @Override
    public List<modeloFrigideira> listarFrigideiras() {
        return listaFrigideiras;
    }

    @Override
    public modeloPanela procurarPanelaPorId(int id) {
        for (modeloPanela panela : listaPanelas) {
            if (panela.getId() == id) {
                return panela;
            }
        }
        return null;
    }

    @Override
    public modeloFrigideira procurarFrigideiraPorId(int id) {
        for (modeloFrigideira frigideira : listaFrigideiras) {
            if (frigideira.getId() == id) {
                return frigideira;
            }
        }
        return null;
    }

    @Override
    public void cadastrarPanela(modeloPanela panela) {
        listaPanelas.add(panela);
    }

    @Override
    public void cadastrarFrigideira(modeloFrigideira frigideira) {
        listaFrigideiras.add(frigideira);
    }

    @Override
    public void atualizarPanela(modeloPanela panela) {
        for (modeloPanela p : listaPanelas) {
            if (p.getId() == panela.getId()) {
                p.setNome(panela.getNome());
                p.setMaterial(panela.getMaterial());
                p.setPreco(panela.getPreco());
                p.setQuantidade(panela.getQuantidade());
                break;
            }
        }
    }

    @Override
    public void atualizarFrigideira(modeloFrigideira frigideira) {
        for (modeloFrigideira f : listaFrigideiras) {
            if (f.getId() == frigideira.getId()) {
                f.setNome(frigideira.getNome());
                f.setMaterial(frigideira.getMaterial());
                f.setPreco(frigideira.getPreco());
                f.setQuantidade(frigideira.getQuantidade());
                break;
            }
        }
    }

    @Override
    public void deletarPanela(int id) {
        listaPanelas.removeIf(panela -> panela.getId() == id);
    }

    @Override
    public void deletarFrigideira(int id) {
        listaFrigideiras.removeIf(frigideira -> frigideira.getId() == id);
    }
}
		
		
		

	