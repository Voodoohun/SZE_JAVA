public String kereses(String s,Status tipus){
		//kiir eseten kitorolni
		StringBuffer eredmeny = new StringBuffer();
		
		// ha a kiir metodust hasznalod
		//eredmeny.delete(0, eredmeny.length());
		
		int i=0;
		Eszkoz e;
		if(treeset.isEmpty()){
			eredmeny.append("Nincs elem a halmazban!");
		}
		else{
			Iterator<Eszkoz> it = treeset.iterator();
			eredmeny.append("Kereses az alabbi elemre: "+s+" az alabbi tipusok kozott: "+tipus+"\n");
			while(it.hasNext()){
				e= it.next();
				if( (e.getNev()).equals(s) && (e.getTipus()).equals(tipus) ){
					eredmeny.append(e);
					i=1;
					break;
				}
			}
			if(i==0) eredmeny.append("Nincs talalat!");
		}
		return eredmeny+"\n";
	}
