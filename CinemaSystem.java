class CinemaSystem {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Omen", "horror", 128, 16, 72, 72);
        TicketSystem createTicket = new TicketSystem();
        cinemaInfo cinemaInfo = new cinemaInfo();
        Person person1 = new Person("Jan", "Kowalski", 18);
        Ticket ticket1 = createTicket.createTicket(person1, movie1);
        Person person2 = new Person("Anna", "Zal", 22);
        Ticket ticket2 = createTicket.createTicket(person2, movie1);


        cinemaInfo.printTicket(ticket1);
        cinemaInfo.printTicket(ticket2);
        cinemaInfo.movieInfo(movie1);


    }
}