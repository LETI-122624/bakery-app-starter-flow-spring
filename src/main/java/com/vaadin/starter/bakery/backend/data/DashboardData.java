package com.vaadin.starter.bakery.backend.data;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.starter.bakery.backend.data.entity.Product;

/**
 * Representa os dados do painel de controlo (dashboard) da aplicação.
 * <p>
 * Contém estatísticas de entregas, vendas e produtos para o período atual,
 * permitindo ao sistema apresentar métricas de desempenho e relatórios visuais.
 * </p>
 *
 * <p>Inclui:</p>
 * <ul>
 *   <li>Estatísticas globais de entregas</li>
 *   <li>Lista de entregas mensais e anuais</li>
 *   <li>Vendas por mês</li>
 *   <li>Entregas de produtos</li>
 * </ul>
 * 
 * @author Rodrigo
 * @version 1.0
 */
public class DashboardData {

    /** Estatísticas globais de entregas. */
    private DeliveryStats deliveryStats;

    /** Número de entregas realizadas em cada dia do mês atual. */
    private List<Number> deliveriesThisMonth;

    /** Número total de entregas realizadas ao longo do ano. */
    private List<Number> deliveriesThisYear;

    /** Vendas mensais, onde cada linha representa um mês e as colunas representam métricas de vendas. */
    private Number[][] salesPerMonth;

    /** Mapa que associa produtos ao número de entregas correspondentes. */
    private LinkedHashMap<Product, Integer> productDeliveries;

    /**
     * Obtém as estatísticas globais de entregas.
     * 
     * @return objeto {@link DeliveryStats} com as estatísticas das entregas
     */
    public DeliveryStats getDeliveryStats() {
        return deliveryStats;
    }

    /**
     * Define as estatísticas globais de entregas.
     * 
     * @param deliveryStats objeto {@link DeliveryStats} com as novas estatísticas
     */
    public void setDeliveryStats(DeliveryStats deliveryStats) {
        this.deliveryStats = deliveryStats;
    }

    /**
     * Obtém a lista de entregas realizadas neste mês.
     * 
     * @return lista com o número de entregas diárias do mês atual
     */
    public List<Number> getDeliveriesThisMonth() {
        return deliveriesThisMonth;
    }

    /**
     * Define a lista de entregas realizadas neste mês.
     * 
     * @param deliveriesThisMonth lista com o número de entregas diárias
     */
    public void setDeliveriesThisMonth(List<Number> deliveriesThisMonth) {
        this.deliveriesThisMonth = deliveriesThisMonth;
    }

    /**
     * Obtém a lista de entregas realizadas ao longo do ano.
     * 
     * @return lista com o número de entregas anuais
     */
    public List<Number> getDeliveriesThisYear() {
        return deliveriesThisYear;
    }

    /**
     * Define a lista de entregas realizadas ao longo do ano.
     * 
     * @param deliveriesThisYear lista com o número de entregas anuais
     */
    public void setDeliveriesThisYear(List<Number> deliveriesThisYear) {
        this.deliveriesThisYear = deliveriesThisYear;
    }

    /**
     * Define os dados de vendas mensais.
     * 
     * @param salesPerMonth matriz com as vendas por mês
     */
    public void setSalesPerMonth(Number[][] salesPerMonth) {
        this.salesPerMonth = salesPerMonth;
    }

    /**
     * Obtém os dados de vendas para um determinado mês.
     * 
     * @param i índice do mês (0 = janeiro, 11 = dezembro)
     * @return vetor com as vendas do mês especificado
     */
    public Number[] getSalesPerMonth(int i) {
        return salesPerMonth[i];
    }

    /**
     * Obtém o mapa de entregas de produtos.
     * 
     * @return {@link LinkedHashMap} que associa cada {@link Product} ao número de entregas
     */
    public LinkedHashMap<Product, Integer> getProductDeliveries() {
        return productDeliveries;
    }

    /**
     * Define o mapa de entregas de produtos.
     * 
     * @param productDeliveries {@link LinkedHashMap} com produtos e respetivos números de entregas
     */
    public void setProductDeliveries(LinkedHashMap<Product, Integer> productDeliveries) {
        this.productDeliveries = productDeliveries;
    }

}
