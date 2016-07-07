String rank[] = new String[13];
for (int i = 0; i < rank.length; i++) {
  rank[i] = "card" + i;
}
List<String> cards = Arrays.asList(rank);
Collections.shuffle(cards);
List<String> selectedCards = cards.subList(0);
