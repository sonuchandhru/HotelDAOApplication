package hoteldao;

public class HotelFactory {
	public HotelInterface createInstance() {
		return new Hotel_imple();
		}
}
