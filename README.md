# Coffee Or Tea Machine

##
 - [x] Stwórz aplikacje do robienia kawy lub herbaty w rozmiarze S, M, L.
 - [x] Do tego można wybrać dodatki (Różne w zależności od rodzaju napoju mleko / cukier / miód etc.).
 - [ ] Twoja aplikacja, w klasie main w zależności od rodzaju wybranego napoju powinna wywołać inny serwis przygotowujący. 
W tym celu stwórz Interface o nazwie „Drink Interface” który udostępni cztery metody:
order (wywołującą pozostałe trzy)
chooseSize
chooseAdditions 
calculatePrice.
 - [x] Metody te mają wczytywać bądź wyświetlać użytkownikowi informacje.
 - [ ] W metodzie chooseAdditions użytkownik powinien mieć możliwość wyboru tylko dodatków, przewidzianych do danego typu napoju.
 - [ ] Metoda order() powinna posiadać tylko jedną implementację na cały projekt.
 - [x] Cena napoju uzależniona jest od rozmiaru (szczegóły dowolne), na herbatę natomiast są zniżki.
 - [x] Stwórz Interface o nazwie „Reduce Interface”, który przyjmuje kod (String) i zwraca % zniżki na zamówienie.
 - [x] Następnie Stwórz drugi projekt, a w nim serwis który będzie implementował ten Interface i tam obsłuż wyjątki takie jak „Niepoprawny kod” albo „Kod uległ przedawnieniu”.
 - [x] Listę kodów i zniżki procentowe możesz zapisać w formie enumów.
 - [ ] Po każdym zamówieniu dopisz do pliku Orders.txt dane nowego zamówienia, wraz z naliczoną zniżką.
 - [x] Jak połączyć dwa projekty ze sobą?
W obu projektach wykonaj mvn clean compile install package co wygeneruje je w lokalnym repozytorium Mavena. Następnie w plikach pom.xml dodaj do nich nawzajem dependencję. 
