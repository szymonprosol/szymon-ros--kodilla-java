package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private SalesService salesService;
    private SalesRepository salesRepository;

    public ProductOrderService(final InformationService informationService,
                            final SalesService salesService,
                            final SalesRepository salesRepository) {
        this.informationService = informationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public SalesDto process(final SaleRequest saleRequest) {
        boolean isSaled = salesService.sale(saleRequest.getUser(), saleRequest.getUser().getUserPrice(), saleRequest.getPrice(), saleRequest.getIsAvailable());
        if (isSaled) {
            informationService.inform(saleRequest.getUser());
            salesRepository.saleCreate(saleRequest.getUser());
            return new SalesDto(saleRequest.getUser(), true);
        } else {
            return new SalesDto(saleRequest.getUser(), false);
        }
    }
}
