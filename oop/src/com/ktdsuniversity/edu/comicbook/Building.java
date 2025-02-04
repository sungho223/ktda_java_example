package com.ktdsuniversity.edu.comicbook;

public class Building {
	public static void main(String[] args) {
		ComicBook batman = new ComicBook("배트맨", false);
		ComicBook superman = new ComicBook("슈퍼맨", false);
		ComicBook greenLantern = new ComicBook("그린랜턴", false);
		ComicBook joker = new ComicBook("조커", true);

		ComicCafe dcComics = new ComicCafe(0, batman, superman, greenLantern, joker);
		System.out.println("만화카페 보유금액: " + dcComics.getMoney());
		dcComics.printAllBooks();

		dcComics.rentBook("배트맨");
		dcComics.rentBook("배트맨");
		dcComics.rentBook("조커");
		dcComics.rentBook("펭귄맨");

		dcComics.printAllBooks();
		dcComics.returnBook("그린랜턴");
		dcComics.returnBook("배트맨");
		dcComics.returnBook("펭귄맨");

		dcComics.printAllBooks();
		System.out.println("만화카페 보유금액: " + dcComics.getMoney());
	}
}