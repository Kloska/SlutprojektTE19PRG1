## Planering - Min idé
Jag ska göra ett clicker spel. I spelet ska man kunna klicka på en tegelsten eller en knapp. Man ska få en
valuta för varje klick, börjar på 1. Med valutan ska man kunna köpa uppgraderingar. Uppgraderingarna ska 
öka valutan man får per klick.

Föremålen ska samlas in genom att figuren som man styr kolliderar med ett fast föremål på en random position
inom en spelplan(ruta).

Viktigt att få fungerande:
- Skapa en spelplan. 
- Sätt ut en tegelsten / knapp
- Gör en event listener för knappen / tegelstenen
- Få event listneren att lägga till med +1 per klick. Viktigt att värdet är en variabel som senare kan ändras
  för att uppgraderingarna ska fungera.
- Skriv ut en text som visar mängden valuta
- Skapa en ny knapp för en uppgradering
- Gör en funktion som för varje klick på uppgraderingsknappen tar bort en viss mängd valuta från tot valuta.
- Gör en funktion som adderar uppgraderingens extra valuta på den nuvarande valutan
Extra:
- Skapa fler uppgraderingar
- Berätta för spelaren om den inte har råd att köpa en uppgradering
- 