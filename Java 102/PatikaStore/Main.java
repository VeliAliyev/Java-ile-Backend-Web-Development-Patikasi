import java.util.Scanner;

public class Main {

    public static void addNotebook(Store patikaStore){
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün bilgilerini giriniz: ");

        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Markası: ");
        String brandName = input.nextLine();
        int index = 0;
        for(Brand brand : patikaStore.getBrands()){
                if(brand.getName().equals(brandName))
                    index = patikaStore.getBrands().indexOf(brand);
        }

        System.out.println("Adı: ");
        String name = input.nextLine();

        System.out.println("Fiyatı: ");
        int price = input.nextInt();

        System.out.println("İndirim oranı: ");
        Double discount = input.nextDouble();

        System.out.println("Stok: ");
        int stock = input.nextInt();

        input.nextLine();

        System.out.println("Rengi: ");
        String color = input.nextLine();

        System.out.println("RAM'ı: ");
        int ram = input.nextInt();

        System.out.println("Depolama: ");
        int memory = input.nextInt();

        System.out.println("Ekran boyutu: ");
        Double display = input.nextDouble();

        patikaStore.addProduct(new Notebook(patikaStore.getBrands().get(index), id, name, price, discount,
                stock, color, ram, memory, display));

        System.out.println("Yeni Ürün Eklendi!\n");

    }

    public static void addPhone(Store patikaStore){
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün bilgilerini giriniz: ");

        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Markası: ");
        String brandName = input.nextLine();
        int index = 0;
        for(Brand brand : patikaStore.getBrands()){
            if(brand.getName().equals(brandName))
                index = patikaStore.getBrands().indexOf(brand);
        }

        System.out.println("Adı: ");
        String name = input.nextLine();

        System.out.println("Fiyatı: ");
        int price = input.nextInt();

        System.out.println("İndirim oranı: ");
        Double discount = input.nextDouble();

        System.out.println("Stok: ");
        int stock = input.nextInt();
        input.nextLine();
        System.out.println("Rengi: ");
        String color = input.nextLine();

        System.out.println("RAM'ı: ");
        int ram = input.nextInt();

        System.out.println("Depolama: ");
        int memory = input.nextInt();

        System.out.println("Ekran boyutu: ");
        Double display = input.nextDouble();

        System.out.println("Batarya kapasitesi: ");
        Double battery = input.nextDouble();

        System.out.println("Kamera: ");
        Double camera = input.nextDouble();

        patikaStore.addProduct(new Phone(patikaStore.getBrands().get(index), id, name, price, discount,
                stock, color, ram, memory, display, battery, camera));

        System.out.println("Yeni Ürün Eklendi!\n");

    }

    public static void deleteNotebook(int id, Store patikaStore){

        for(Product product : patikaStore.getProducts()){

            if(product instanceof Notebook && product.getId() == id){
                patikaStore.getProducts().remove(product);
                break;
            }
        }
    }

    public static void deletePhone(int id, Store patikaStore){

        for(Product product : patikaStore.getProducts()){

            if(product instanceof Phone && product.getId() == id){
                patikaStore.getProducts().remove(product);
                break;
            }
        }
    }

    public static void printManagementPanel(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
    }

    public static void printMenu(){
        System.out.println("1 - Ürünler");
        System.out.println("2 - Ürün Ekle");
        System.out.println("3 - Ürün Sil");
        System.out.println("0 - Çıkış Yap");
    }
    public static void printNotebooks(Store patikaStore){

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-25s | %-10s | %-7s | %-8s | %-5s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("-------------------------------------------------------------------------------------");
        for(Product product : patikaStore.getProducts()) {
            if (product instanceof Notebook) {

                System.out.format("| %-3s | %-25s | %-10s | %-7s | %-8d | %-5s | %-5d |%n",
                        product.getId(), product.getBrand().getName()+ " " + product.getName(), product.getPrice() + " TL",
                        product.getBrand().getName(), ((Notebook) product).getMemory(), ((Notebook) product).getDisplayInches(),
                        ((Notebook) product).getRam());

            }
        }
        System.out.println("-------------------------------------------------------------------------------------");

    }
    public static void printPhones(Store patikaStore){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-30s | %-10s | %-7s | %-8s | %-5s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("------------------------------------------------------------------------------------------");
        for(Product product : patikaStore.getProducts()) {
            if (product instanceof Phone) {

                System.out.format("| %-3s | %-30s | %-10s | %-7s | %-8d | %-5s | %-5d |%n",
                        product.getId(), product.getBrand().getName()+ " " + product.getName(), product.getPrice()+ " TL",
                        product.getBrand().getName(), ((Phone) product).getMemory(), ((Phone) product).getDisplayInches(),
                        ((Phone) product).getRam());

            }
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Store patikaStore = new Store("PatikaStore");

        patikaStore.addBrand(new Brand("1", "Samsung"));
        patikaStore.addBrand(new Brand("2", "Lenovo"));
        patikaStore.addBrand(new Brand("3", "Apple"));
        patikaStore.addBrand(new Brand("4", "Huawei"));
        patikaStore.addBrand(new Brand("5", "Casper"));
        patikaStore.addBrand(new Brand("6", "Asus"));
        patikaStore.addBrand(new Brand("7", "HP"));
        patikaStore.addBrand(new Brand("8", "Xiaomi"));
        patikaStore.addBrand(new Brand("9", "Monster"));


        ///--------------------NOTEBOOKS----------------///

        patikaStore.addProduct(new Notebook(patikaStore.getBrands().get(3), 1, "Matebook 14", 7000.0, 0,
                100, "Black", 16, 512, 14.0));

        patikaStore.addProduct(new Notebook(patikaStore.getBrands().get(1), 2, "V14 IGL", 3699.0, 0,
                100, "White", 8, 1024, 14.0));

        patikaStore.addProduct(new Notebook(patikaStore.getBrands().get(5), 3, "Tuf Gaming", 8199.0, 0,
                100, "Black", 32, 2048, 15.6));

        ///--------------------PHONES----------------///

        patikaStore.addProduct(new Phone(patikaStore.getBrands().get(0),1, "GALAXY A51", 3199.0, 0,
                100, "Black", 6, 128, 6.5, 4000, 32) {
        });

        patikaStore.addProduct(new Phone(patikaStore.getBrands().get(2), 2, "Iphone 11 64 GB", 7379.0, 0,
                100, "Blue", 6, 64, 6.1, 3046.0, 5));

        patikaStore.addProduct(new Phone(patikaStore.getBrands().get(7), 3, "Redmi Note 10 Pro 8GB", 4012.0, 0,
                100, "White", 12, 128, 6.5, 4000.0, 35));

        Scanner scanner = new Scanner(System.in);


        int choice;
        while (true){

            printManagementPanel();

            choice = scanner.nextInt();

            if (choice == 0)
                break;

            System.out.println("Tercihiniz : " + choice);

            if (choice == 3){

                for(Brand brand : patikaStore.getBrands()){
                    System.out.println("- " + brand.getName());
                }
            }

            else if (choice == 1){


                while (true){
                    printMenu();
                    choice = scanner.nextInt();

                    if (choice == 0)
                        break;

                    if(choice == 1){
                        printNotebooks(patikaStore);
                    }

                    else if (choice == 2){
                        addNotebook(patikaStore);
                    }

                    else if (choice == 3){

                        System.out.println("Ürün id'yi giriniz: ");

                        int id = scanner.nextInt();
                        deleteNotebook(id, patikaStore);
                        System.out.println("Ürün Silindi!\n");
                    }

                }

            }

            else if (choice == 2){

                while (true){
                    printMenu();
                    choice = scanner.nextInt();

                    if (choice == 0)
                        break;

                    if(choice == 1){
                        printPhones(patikaStore);
                    }

                    else if (choice == 2){
                        addPhone(patikaStore);
                    }

                    else if (choice == 3){

                        System.out.println("Ürün id'yi giriniz: ");

                        int id = scanner.nextInt();
                        deletePhone(id, patikaStore);
                        System.out.println("Ürün Silindi!\n");
                    }

                }

            }

        }

    }
}
