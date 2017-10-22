package Hearingapp;

public class Ear {

private Double freq500hz, freq1000hz, freq2000hz, freq4000hz;

  public Ear(Double freq500hz, Double freq1000hz, Double freq2000hz, Double freq4000hz) {
	  this.freq500hz = freq500hz;
	  this.freq1000hz = freq1000hz;
	  this.freq2000hz = freq2000hz;
	  this.freq4000hz = freq4000hz;
  }

  public Double getLossThisEar() {
	  return (freq500hz + freq1000hz + freq2000hz + freq4000hz);
  }

  public Double getTotalLoss(Ear nextEar) {
    Double oneLoss = getLossThisEar();
    Double twoLoss = nextEar.getLossThisEar();
    if(oneLoss > twoLoss) {
      return ((oneLoss - twoLoss) / 4.0) + twoLoss;
    } else {
      return ((twoLoss - oneLoss) / 4.0) + oneLoss;
    }
  } 
}
