package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="enregistrements")
public class Enregistrement {
	
	@Id String META_ID ;
		
		Double bp ;
		Double hr ;
		String patientId ;
		Double rr ;
		Double spo2 ;
		Double temp ;
		String time ;
		int prediction ;
		
		
		public String getMETA_ID() {
			return META_ID;
		}
		public void setMETA_ID(String mETA_ID) {
			META_ID = mETA_ID;
		}
		public Double getBp() {
			return bp;
		}
		public void setBp(Double bp) {
			this.bp = bp;
		}
		public Double getHr() {
			return hr;
		}
		public void setHr(Double hr) {
			this.hr = hr;
		}
		public String getPatientId() {
			return patientId;
		}
		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}
		public Double getRr() {
			return rr;
		}
		public void setRr(Double rr) {
			this.rr = rr;
		}
		public Double getSpo2() {
			return spo2;
		}
		public void setSpo2(Double spo2) {
			this.spo2 = spo2;
		}
		public Double getTemp() {
			return temp;
		}
		public void setTemp(Double temp) {
			this.temp = temp;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public int getPrediction() {
			return prediction;
		}
		public void setPrediction(int prediction) {
			this.prediction = prediction;
		}

}
