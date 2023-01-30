class cinemaInfo {
    public void printTicket(Ticket ticket) {
        if (ticket.getId() != 0) {
            System.out.println(ticket.getId() + " | " + ticket.getPerson().getFirstName() + " "
                    + ticket.getPerson().getLastName() + " | " + ticket.getMovie().getTitle() + " - "
                    + ticket.getMovie().getType() + " - " + ticket.getMovie().getTime() + "min");
        }
    }

    public void movieInfo(Movie movie) {
        System.out.println("Liczba pozostałych miejsc: " + movie.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie.getMaxSeats() - movie.getFreeSeats()));
    }
}
