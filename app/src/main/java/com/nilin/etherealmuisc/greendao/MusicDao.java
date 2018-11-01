package com.nilin.etherealmuisc.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nilin.etherealmuisc.Music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC".
*/
public class MusicDao extends AbstractDao<Music, Long> {

    public static final String TABLENAME = "MUSIC";

    /**
     * Properties of entity Music.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Song = new Property(1, String.class, "song", false, "SONG");
        public final static Property Singer = new Property(2, String.class, "singer", false, "SINGER");
        public final static Property Path = new Property(3, String.class, "path", false, "PATH");
    }


    public MusicDao(DaoConfig config) {
        super(config);
    }
    
    public MusicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SONG\" TEXT," + // 1: song
                "\"SINGER\" TEXT," + // 2: singer
                "\"PATH\" TEXT);"); // 3: path
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_MUSIC_SONG ON \"MUSIC\"" +
                " (\"SONG\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Music entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String song = entity.getSong();
        if (song != null) {
            stmt.bindString(2, song);
        }
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(3, singer);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(4, path);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Music entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String song = entity.getSong();
        if (song != null) {
            stmt.bindString(2, song);
        }
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(3, singer);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(4, path);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Music readEntity(Cursor cursor, int offset) {
        Music entity = new Music( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // song
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // singer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // path
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Music entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSong(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSinger(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Music entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Music entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Music entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}