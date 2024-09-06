private List<HistoricoEntity> removerCarrosDuplicados(List<HistoricoEntity> carros) {

		

		if (Objects.nonNull(carros)

				&& !carros.isEmpty()) {

			Set<String> filtrados = new HashSet<>();

			return carros.stream()

			    .filter(c -> filtrados.add(

			        c.getCarro().getId() + "-" + 

			        c.getCarro().getCor().getId() + "-" + 

			        c.getCarro().getPlaca().getId() + "-" + 

			        c.getCarro().getAnoFabricacao().getId() + "-" + 

			        c.getCarro().getChassi().getId()

			    ))

			    .collect(Collectors.toList());

		}	
		return carros;

	}
