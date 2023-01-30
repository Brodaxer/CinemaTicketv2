class TicketSystem {
    private int tickedCount = 0;
    Ticket createTicket(Person person, Movie movie) {

        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (person.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            tickedCount++;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return new Ticket(tickedCount, person, movie);
        }
    }
}
