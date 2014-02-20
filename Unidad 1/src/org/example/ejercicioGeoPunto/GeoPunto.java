package org.example.ejercicioGeoPunto;

class GeoPunto {
	private double latitud;
	private double longitud;
	
	public GeoPunto(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public String toString() {
		return "(" + latitud + ", "+ longitud + ")";
	}
	
	double distancia(GeoPunto punto) {
		final double RADIO_TIERRA = 6371000; // en metros
		double dLat = Math.toRadians(latitud - punto.latitud);
		double dLon = Math.toRadians(longitud - punto.longitud);
		double lat1 = Math.toRadians(punto.latitud);
		double lat2 = Math.toRadians(latitud);
		double a = 	Math.sin(dLat/2) * Math.sin(dLat/2) +
					Math.sin(dLon/2) * Math.sin(dLon/2) *
					Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return c * RADIO_TIERRA; 
	}
}
