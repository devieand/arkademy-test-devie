int hitungParkir(int x){

	int bayar = 0;
	
	for ( int i = 0; i<x; i++){
		if (i<2){
			bayar = bayar + 2000;
		} else {
			bayar = bayar + 1000;
		}
	}
	
	if ( bayar > 10000 ){
		bayar = 10000;
	}
	
	return bayar;
	
}