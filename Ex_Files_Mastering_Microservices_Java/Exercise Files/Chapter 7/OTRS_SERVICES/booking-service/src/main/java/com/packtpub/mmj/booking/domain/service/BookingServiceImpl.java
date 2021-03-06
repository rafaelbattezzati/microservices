package com.packtpub.mmj.booking.domain.service;

import com.packtpub.mmj.booking.domain.model.entity.Booking;
import com.packtpub.mmj.booking.domain.model.entity.Entity;
import com.packtpub.mmj.booking.domain.repository.BookingRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author
 */
@Service("bookingService")
public class BookingServiceImpl extends BaseService<Booking, String>
        implements BookingService {

    private BookingRepository<Booking, String> bookingRepository;

    /**
     *
     * @param bookingRepository
     */
    @Autowired
    public BookingServiceImpl(BookingRepository<Booking, String> bookingRepository) {
        super(bookingRepository);
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking add(Booking booking) throws Exception {
        return super.add(booking);
    }

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Collection<Booking> findByName(String name) throws Exception {
        return bookingRepository.findByName(name);
    }

    /**
     *
     * @param booking
     * @throws Exception
     */
    @Override
    public void update(Booking booking) throws Exception {
        bookingRepository.update(booking);
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    @Override
    public void delete(String id) throws Exception {
        bookingRepository.remove(id);
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Entity findById(String id) throws Exception {
        return bookingRepository.get(id);
    }

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Collection<Booking> findByCriteria(Map<String, ArrayList<String>> name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
