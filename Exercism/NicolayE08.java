package java_basic_programming;

public class BlackjackEnum {

    enum Card {
        TWO(2), THREE(3), FOUR(4),
        FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10),
        OTHER(0), ACE(11);

        private int valueType;

        private Card(int valueType) {
            this.valueType = valueType;
        }

        public int getValueType() {
            return valueType;
        }
    }

    public int parseCard(String card) {
        return Card.valueOf(card.toUpperCase()).getValueType();
    }

    public boolean isBlackjack(String card1, String card2) {
        return Card.valueOf(card1.toUpperCase()).getValueType() +
                Card.valueOf(card2.toUpperCase()).getValueType() == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack) {
            return "P";
        } else if(dealerScore < 10) {
            return "W";
        } else {
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if((handScore >= 12 && handScore <= 16) && dealerScore < 7){
            return "S";
        } else if(handScore >= 17) {
            return "S";
        }
        return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    public static void main(String[] args) {
        BlackjackEnum blackjack = new BlackjackEnum();
        System.out.println(blackjack.firstTurn("two", "nine", "queen").equals("H"));
    }
}
