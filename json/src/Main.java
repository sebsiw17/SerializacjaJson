import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class JsonEncodeDemo {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

                obj.put("Imię", "Sebastian");
              obj.put("Nazwisko", "Siwicki");
              obj.put("Wiek", new Integer(17));
              obj.put("Klasa", "4TD");
              obj.put("Nr_w_dzienniku", new Integer(20));
              obj.put("Adres", "ul. Szmaragdowa 2");
              obj.put("Miejscowość", "Gorzów Wielkopolski");
              obj.put("Telefon", "123-456-789");
              obj.put("Mail", "ssiwicki@przyklad.com");


        System.out.println("Czytelne wyświetlenie pliku JSON:");
        System.out.println(obj);


        JSONParser parser = new JSONParser();
        try {
            Object parsedObject = parser.parse(obj.toJSONString());
            JSONObject deserializedObj = (JSONObject) parsedObject;


            System.out.println("\nCzytelne wyświetlenie pliku JSON:");
            System.out.println("Imię: " + deserializedObj.get("Imię"));
            System.out.println("Nazwisko: " + deserializedObj.get("Nazwisko"));
            System.out.println("Wiek: " + deserializedObj.get("Wiek"));
            System.out.println("Klasa: " + deserializedObj.get("Klasa"));
            System.out.println("Nr_w_dzienniku: " + deserializedObj.get("Nr_w_dzienniku"));
            System.out.println("Adres: " + deserializedObj.get("Adres"));
            System.out.println("Miejscowość: " + deserializedObj.get("Miejscowość"));
            System.out.println("Telefon: " + deserializedObj.get("Telefon"));
            System.out.println("Mail: " + deserializedObj.get("Mail"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}