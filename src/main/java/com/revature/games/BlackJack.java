package com.revature.games;

/**
 * Pseudo code
 * 
 *  - card values
 *  use 6 decks - 52 cards each https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=6
 *  cards one through ten, value = card number
 *  ace of all suits', value = 1 or 11
 *  jack/queen/king, value = 10
 *  
 *  - placing a bet
 *  player has a wallet value saved in the database
 *  player places a bet, minimum of $25 worth of chips(credits) maybe
 *  
 *  - dealing the cards
 *  the dealer gets 2 cards. one card face up, one card face down.
 *  each player gets 2 cards. both cards face up
 *  maybe store the cards in a small array
 *  if someone has blackjack (ace and card with value of 10) they automatically win and do not have a turn
 *  if dealer's face up card is an ace, ask players if they want insurance (they bet another 1/2 of their current bet and keep their money if dealer has blackjack)
 *  
 *  - write a method for the players' turns starting with player on the right to left
 *  ask to hit, stand, or double
 *  if a player has a two cards of the same value (ex: queen of hearts & queen of spades, they have the option to *split* along with hit or stand). 
 *  Split means they player will double their bet and split their 2 initially dealt cards into two separate bets and be dealt two more cards 
 *  (ex. the player receives 2 more cards, lets say 9 of clubs and 4 of diamonds. so now the player has two bets, queen of hearts + 9 of clubs, queen of spades + 4 of diamonds)
 *  if hit, deal one card. player can continue to hit until card values >= 21 or player selects stand
 *  if player busts (cards value over 21) they lose and move on to the next player
 *  if stand, move on to next player until all players have went and then move on to dealer's turn
 *  if double, the player doubles their bet, gets dealt one more card and ends their turn
 *  
 *  - method for dealer's turn
 *  if dealer's cards value is < 17, hit until cards value >= 21
 *  check if dealer's card value > players' card value
 *  if dealer's card value > players' card value, dealer wins, player loses his/her bet money
 *  if dealer's card value < players' card value, player wins and gets their bet + bet back. (ex: they bet $25, they get $50 back)
 *  if dealer busts (card value over 21), players win
 *  if dealer's card value = players' card value, it is a push and the player gets their bet back but does not win any money.
 *
 * 
 * @author Long
 *
 */

public class BlackJack {

}
