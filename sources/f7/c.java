package f7;

import a7.j0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import d7.n0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f61210a = 0;

    static {
        j0.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i13, String str) {
        try {
            if (!n0.m0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i13), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i14 = query.getInt(0);
                query.close();
                return i14;
            } finally {
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i13, String str, int i14) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i13));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i14));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }
}
