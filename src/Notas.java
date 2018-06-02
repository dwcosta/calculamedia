
public class Notas {
	private float p1;
	private float p2;
	private float t1;
	private float media;
	public float getP1() {
		return p1;
	}
	public void setP1(float p1) {
		this.p1 = p1;
	}
	public float getP2() {
		return p2;
	}
	public void setP2(float p2) {
		this.p2 = p2;
	}
	public float getT1() {
		return t1;
	}
	public void setT1(float t1) {
		this.t1 = t1;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float p1, float p2, float t) {
		this.media = (p1+p2+t)/3;
	}
}
