package bo.com.bolventur.repository.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import bo.com.bolventur.model.Event;

@Dao
public interface EventDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(List<Event> events);

    @Query("SELECT * FROM event_table WHERE category=0 ORDER BY title ASC")
    LiveData<List<Event>> getTab1();

    @Query("SELECT * FROM event_table WHERE category=1 ORDER BY title ASC")
    LiveData<List<Event>> getTab2();

    @Query("SELECT * FROM event_table WHERE category=2 ORDER BY title ASC")
    LiveData<List<Event>> getTab3();

    @Query("SELECT * FROM event_table WHERE category=3 ORDER BY title ASC")
    LiveData<List<Event>> getTab4();

}