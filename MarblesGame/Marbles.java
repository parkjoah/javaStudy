package MarblesGame;

import java.util.*;
public class Marbles{
	public static void main(String[] args){
		
		String welcomeMessage = "Welcome to Marbles!";
		String helpMessage = "In this game there are n marbles in a bag.\nOn each turn, the current player may pick up 1 to k marbles.\nThe player who picks up the last marble loses the game.";
		String optionMessage = "Options: (P)LAY, (H)ELP, (E)XIT. Enter your choice: ";			
		String exitMessage = "Thanks for playing Marbles!";
		
		Scanner scanner = new Scanner(System.in);
		
		//첫 출력
		System.out.println(welcomeMessage);
		System.out.println(helpMessage);
		
		//초기화
		boolean inGame = true;
		boolean hasPlayer = false;
		String player1 = "";
		String player2="";
		int totalMarbles = 0;
		int maxPick = 0;
		String winner = "";
    String currentPlayer = "";
		
		//게임 반복
		while(inGame){
			System.out.print(optionMessage);
			String input = scanner.next().toLowerCase();
			
			//option별 case
			switch(input){
				//play
				case "p":
				case "play":
          //player 이름 1회만 받기
          if(!hasPlayer){
            System.out.print("Enter player 1's name: ");
            for(;;){
              player1 = scanner.next();
              if(!player1.isBlank()){
                break;
              }
            }
            System.out.print("Enter player 2's name: ");
            for(;;){
              player2 = scanner.next();
              if(!player2.isBlank()){
                break;
              }
            }
            hasPlayer = true;
          }
					//totalMarble 설정까지 무한루프
					for(;;){
						System.out.print("Enter the total number of marbles in the bag: ");
						if(scanner.hasNextInt()){
							totalMarbles = scanner.nextInt();
							if(totalMarbles > 0){
								break;
							}else{
								System.out.println(totalMarbles + " is not a valid number of marbles. Try again.");
							}
						}else{
							System.out.println(scanner.next()+" is not a valid number of marbles. Try again.");
						}
					}
					//maxPick 설정까지 무한루프
					for(;;){
						System.out.print("Enter the max number of marbles a player can pick, each turn: ");
						if(scanner.hasNextInt()){
							maxPick = scanner.nextInt();
							if(maxPick > 0 && maxPick <= totalMarbles){
								break;
							}else{
								System.out.println(maxPick + " is not a valid number of marbles. Try again.");
							}
						}else{
							System.out.println(scanner.next()+" is not a valid number of marbles. Try again.");
						}
					}
					//돌아가면서 뽑고 반복하기~
					int pickedNum = 0;
					while(totalMarbles > 0){
						//p1 뽑을때까지
						for(;;){
              currentPlayer = player1;
              if(totalMarbles==0){break;}
							System.out.println("There are " + totalMarbles + " marble(s) in the bag.");
							System.out.print(player1 + ", how many marbles do you want to pick? ");
							if(scanner.hasNextInt()){
								int input2 = scanner.nextInt();
								if (input2 <= maxPick && input2 > 0  && input2<= totalMarbles) {
							    pickedNum = input2;
							    totalMarbles -= pickedNum;
							    winner = player2;
							    break;
							  }else {
							    System.out.println(input2 + " is not a valid number of marbles. Try again.");
							  }
							}else{
								System.out.println(scanner.next() + " is not a valid number of marbles. Try again.");
							}
						}
						//p2 뽑을때까지
						for(;;){
              currentPlayer = player2;
              if(totalMarbles==0){break;}
							System.out.println("There are " + totalMarbles + " marble(s) in the bag.");
							System.out.print(player2 + ", how many marbles do you want to pick? ");
							if(scanner.hasNextInt()){
								int input2 = scanner.nextInt();
								if (input2 <= maxPick && input2 > 0 && input2<= totalMarbles) {
							    pickedNum = input2;
							    totalMarbles -= pickedNum;
							    winner = player1;
							    break;
							  }else {
							    System.out.println(input2 + " is not a valid number of marbles. Try again.");
							  }
							}else{
								System.out.println(scanner.next() + " is not a valid number of marbles. Try again.");
							}
						}
					}
          System.out.println(currentPlayer + " picks up the last marble.");
					System.out.println(winner + " wins!");
					break;
				//help
				case "h":
				case "help":
					System.out.println(helpMessage);
					break;
				//exit
				case "e":
				case "exit":
					System.out.println(exitMessage);
					inGame = false;
					return;
				//그외 설정
				default : 
					System.out.println("Option not recognized.");
			}
		}

		scanner.close();
	}

}