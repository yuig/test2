package z7;

import a7.o0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.StreamKey;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import d7.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements v {

    /* renamed from: d, reason: collision with root package name */
    public static final String f140900d = g(3, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f140901e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", AnimatedTarget.PROPERTY_STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* renamed from: a, reason: collision with root package name */
    public final f7.a f140902a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f140903b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f140904c;

    public b(f7.b bVar) {
        this.f140902a = bVar;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i13 = n0.f53866a;
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("\\.", -1);
            bf.b.t(split.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        }
        return arrayList;
    }

    public static d e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String r13 = o0.r(cursor.getString(1));
        ArrayList a13 = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, parse, r13, a13, blob, cursor.getString(4), cursor.getBlob(5), null);
        j jVar = new j();
        jVar.f140953a = cursor.getLong(13);
        jVar.f140954b = cursor.getFloat(12);
        int i13 = cursor.getInt(6);
        return new d(downloadRequest, i13, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i13 == 4 ? cursor.getInt(11) : 0, jVar);
    }

    public static d f(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        DownloadRequest downloadRequest = new DownloadRequest(string, parse, o0.r("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown"), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5), null);
        j jVar = new j();
        jVar.f140953a = cursor.getLong(13);
        jVar.f140954b = cursor.getFloat(12);
        int i13 = cursor.getInt(6);
        return new d(downloadRequest, i13, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i13 == 4 ? cursor.getInt(11) : 0, jVar);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        }
        StringBuilder sb3 = new StringBuilder("state IN (");
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (i13 > 0) {
                sb3.append(',');
            }
            sb3.append(iArr[i13]);
        }
        sb3.append(')');
        return sb3.toString();
    }

    public static ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!n0.m0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", AnimatedTarget.PROPERTY_STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(f(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void b() {
        synchronized (this.f140903b) {
            if (this.f140904c) {
                return;
            }
            try {
                int a13 = f7.c.a(this.f140902a.getReadableDatabase(), 0, "");
                if (a13 != 3) {
                    SQLiteDatabase writableDatabase = this.f140902a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        f7.c.b(writableDatabase, 0, "", 3);
                        ArrayList h10 = a13 == 2 ? h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = h10.iterator();
                        while (it.hasNext()) {
                            j((d) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th3) {
                        writableDatabase.endTransaction();
                        throw th3;
                    }
                }
                this.f140904c = true;
            } catch (SQLException e13) {
                throw new DatabaseIOException((Throwable) e13);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.f140902a.getReadableDatabase().query("ExoPlayerDownloads", f140901e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    public final d d(String str) {
        b();
        try {
            Cursor c13 = c("id = ?", new String[]{str});
            try {
                if (c13.getCount() == 0) {
                    c13.close();
                    return null;
                }
                c13.moveToNext();
                d e13 = e(c13);
                c13.close();
                return e13;
            } finally {
            }
        } catch (SQLiteException e14) {
            throw new DatabaseIOException((Throwable) e14);
        }
    }

    public final void i(d dVar) {
        b();
        try {
            j(dVar, this.f140902a.getWritableDatabase());
        } catch (SQLiteException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    public final void j(d dVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = dVar.f140908a.f18833e;
        if (bArr == null) {
            bArr = n0.f53868c;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f140908a.f18829a);
        contentValues.put("mime_type", dVar.f140908a.f18831c);
        contentValues.put("uri", dVar.f140908a.f18830b.toString());
        List list = dVar.f140908a.f18832d;
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < list.size(); i13++) {
            StreamKey streamKey = (StreamKey) list.get(i13);
            sb3.append(streamKey.f18747a);
            sb3.append('.');
            sb3.append(streamKey.f18748b);
            sb3.append('.');
            sb3.append(streamKey.f18749c);
            sb3.append(',');
        }
        if (sb3.length() > 0) {
            sb3.setLength(sb3.length() - 1);
        }
        contentValues.put("stream_keys", sb3.toString());
        contentValues.put("custom_cache_key", dVar.f140908a.f18834f);
        contentValues.put("data", dVar.f140908a.f18835g);
        contentValues.put(AnimatedTarget.PROPERTY_STATE, Integer.valueOf(dVar.f140909b));
        contentValues.put("start_time_ms", Long.valueOf(dVar.f140910c));
        contentValues.put("update_time_ms", Long.valueOf(dVar.f140911d));
        contentValues.put("content_length", Long.valueOf(dVar.f140912e));
        contentValues.put("stop_reason", Integer.valueOf(dVar.f140913f));
        contentValues.put("failure_reason", Integer.valueOf(dVar.f140914g));
        contentValues.put("percent_downloaded", Float.valueOf(dVar.f140915h.f140954b));
        contentValues.put("bytes_downloaded", Long.valueOf(dVar.f140915h.f140953a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public final void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AnimatedTarget.PROPERTY_STATE, (Integer) 0);
            this.f140902a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AnimatedTarget.PROPERTY_STATE, (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f140902a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    public final void m(int i13, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i13));
            this.f140902a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f140900d + " AND id = ?", new String[]{str});
        } catch (SQLException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }
}
