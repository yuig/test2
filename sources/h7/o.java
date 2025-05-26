package h7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import androidx.media3.database.DatabaseIOException;
import d7.n0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f67915e = {"id", "key", "metadata"};

    /* renamed from: a, reason: collision with root package name */
    public final f7.a f67916a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f67917b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public String f67918c;

    /* renamed from: d, reason: collision with root package name */
    public String f67919d;

    public o(f7.b bVar) {
        this.f67916a = bVar;
    }

    @Override // h7.q
    public final void a(n nVar, boolean z13) {
        SparseArray sparseArray = this.f67917b;
        int i13 = nVar.f67910a;
        if (z13) {
            sparseArray.delete(i13);
        } else {
            sparseArray.put(i13, null);
        }
    }

    @Override // h7.q
    public final boolean b() {
        try {
            SQLiteDatabase readableDatabase = this.f67916a.getReadableDatabase();
            String str = this.f67918c;
            str.getClass();
            return f7.c.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    @Override // h7.q
    public final void c(HashMap hashMap) {
        SparseArray sparseArray = this.f67917b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f67916a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                try {
                    n nVar = (n) sparseArray.valueAt(i13);
                    if (nVar == null) {
                        j(writableDatabase, sparseArray.keyAt(i13));
                    } else {
                        i(writableDatabase, nVar);
                    }
                } catch (Throwable th3) {
                    writableDatabase.endTransaction();
                    throw th3;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    @Override // h7.q
    public final void d(long j13) {
        String hexString = Long.toHexString(j13);
        this.f67918c = hexString;
        this.f67919d = a.a.j("ExoPlayerCacheIndex", hexString);
    }

    @Override // h7.q
    public final void e(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = this.f67916a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                k(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    i(writableDatabase, (n) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f67917b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th3) {
                writableDatabase.endTransaction();
                throw th3;
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException((Throwable) e13);
        }
    }

    @Override // h7.q
    public final void f(n nVar) {
        this.f67917b.put(nVar.f67910a, nVar);
    }

    @Override // h7.q
    public final void g(HashMap hashMap, SparseArray sparseArray) {
        f7.a aVar = this.f67916a;
        bf.b.t(this.f67917b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
            String str = this.f67918c;
            str.getClass();
            if (f7.c.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    k(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th3) {
                    writableDatabase.endTransaction();
                    throw th3;
                }
            }
            SQLiteDatabase readableDatabase2 = aVar.getReadableDatabase();
            String str2 = this.f67919d;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, f67915e, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i13 = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new n(i13, string, androidx.appcompat.widget.x.b(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i13, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e13) {
            hashMap.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e13);
        }
    }

    @Override // h7.q
    public final void h() {
        f7.a aVar = this.f67916a;
        String str = this.f67918c;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i13 = f7.c.f61210a;
                try {
                    if (n0.m0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e13) {
                    throw new DatabaseIOException((Throwable) e13);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e14) {
            throw new DatabaseIOException((Throwable) e14);
        }
    }

    public final void i(SQLiteDatabase sQLiteDatabase, n nVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        androidx.appcompat.widget.x.c(nVar.f67914e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(nVar.f67910a));
        contentValues.put("key", nVar.f67911b);
        contentValues.put("metadata", byteArray);
        String str = this.f67919d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void j(SQLiteDatabase sQLiteDatabase, int i13) {
        String str = this.f67919d;
        str.getClass();
        sQLiteDatabase.delete(str, "id = ?", new String[]{Integer.toString(i13)});
    }

    public final void k(SQLiteDatabase sQLiteDatabase) {
        String str = this.f67918c;
        str.getClass();
        f7.c.b(sQLiteDatabase, 1, str, 1);
        String str2 = this.f67919d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f67919d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
