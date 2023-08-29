Scanner scanner = new Scanner(System.in);
	System.out.println("bankamıza hoşgeldiniz Faiz oranı % 6");
	int anapara,vade;
	System.out.println("Yatırmak istediğiniz tutaru giriniz");
	anapara = scanner.nextInt();
	System.out.println("Paranızı kaç ay vadeli yatırmak istiyorsunuz");
	vade = scanner.nextInt();
	
	double toplampara = anapara;
	double faizOrani= 0.035;
	
	for (int i = 1 ; i <= vade ; i++) {
		toplampara = (toplampara * faizOrani) + toplampara;
	System.out.println(i + ".ayın sonunda toplam para " + toplampara);	
	}
