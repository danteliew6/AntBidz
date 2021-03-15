package AntbidzTeam3.AntBidz.bootstrap;

import AntbidzTeam3.AntBidz.model.Author;
import AntbidzTeam3.AntBidz.model.Book;
import AntbidzTeam3.AntBidz.model.Publisher;
import AntbidzTeam3.AntBidz.repositories.AuthorRepository;
import AntbidzTeam3.AntBidz.repositories.BookRepository;
import AntbidzTeam3.AntBidz.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("New York");
        publisher.setState("FL");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");

        Book sampleBook = new Book("Domain Driven Design", "123123");

        eric.getBooks().add(sampleBook);
        sampleBook.getAuthors().add(eric);

        sampleBook.setPublisher(publisher);
        publisher.getBooks().add(sampleBook);

        authorRepository.save(eric);
        bookRepository.save(sampleBook);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development", "12312432524" );

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books:" + bookRepository.count());
        System.out.println("Publisher Number of books " + publisher.getBooks().size());
    }
}
