package h7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f67888c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final f7.a f67889a;

    /* renamed from: b, reason: collision with root package name */
    public String f67890b;

    public h(f7.b bVar) {
        this.f67889a = bVar;
    }

    public final HashMap a() {
        try {
            this.f67890b.getClass();
            Cursor query = this.f67889a.getReadableDatabase().query(this.f67890b, f67888c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new g(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    public final void b(long j13) {
        f7.a aVar = this.f67889a;
        try {
            String hexString = Long.toHexString(j13);
            this.f67890b = "ExoPlayerCacheFileMetadata" + hexString;
            if (f7.c.a(aVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    f7.c.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f67890b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f67890b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th3) {
                    writableDatabase.endTransaction();
                    throw th3;
                }
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public final void c(Set set) {
        this.f67890b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f67889a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f67890b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th3) {
                writableDatabase.endTransaction();
                throw th3;
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public final void d(String str, long j13, long j14) {
        this.f67890b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f67889a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j13));
            contentValues.put("last_touch_timestamp", Long.valueOf(j14));
            writableDatabase.replaceOrThrow(this.f67890b, null, contentValues);
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }
}
