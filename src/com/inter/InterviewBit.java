package com.inter;

public class InterviewBit {
	InterviewBit ib;
	public static void main(String[] args) {
		InterviewBit ibgc1 = new InterviewBit();
		InterviewBit ibgc2 = new InterviewBit();
		ibgc1.ib = ibgc2;
		ibgc2.ib = ibgc1;
		ibgc1 = null;
		ibgc2 = null;
		
	}

}
