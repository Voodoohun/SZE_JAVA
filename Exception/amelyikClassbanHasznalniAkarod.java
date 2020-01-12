 public void felvesz(String tulajdonos,String rendszam){
        try{
            if(jorendszam(rendszam)){
                Jarmu j1=new Jarmu(tulajdonos,rendszam);
                nyilv.add(j1);
             }else{ throw new HibasRendszamException();

             }
        }catch (HibasRendszamException h){
                System.err.println("Rossz rendszam!");
                System.out.println(h + rendszam );
                System.exit(-1);
        }

    }
