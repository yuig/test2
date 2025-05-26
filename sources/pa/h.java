package pa;

import a.cb;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f99357h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f99358a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.b f99359b;

    /* renamed from: c, reason: collision with root package name */
    public final oa.c f99360c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99361d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99362e;

    /* renamed from: f, reason: collision with root package name */
    public final qa.a f99363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final h1.b dbRef, final oa.c callback, boolean z13) {
        super(context, str, null, callback.f93835a, new DatabaseErrorHandler() { // from class: pa.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                oa.c callback2 = oa.c.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                h1.b dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i13 = h.f99357h;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                c db3 = bk.f.S(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db3, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db3 + ".path");
                SQLiteDatabase sQLiteDatabase = db3.f99351a;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        oa.c.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db3.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            oa.c.a((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            oa.c.a(path2);
                        }
                    }
                }
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f99358a = context;
        this.f99359b = dbRef;
        this.f99360c = callback;
        this.f99361d = z13;
        this.f99363f = new qa.a(context.getCacheDir(), str == null ? cb.g("randomUUID().toString()") : str, false);
    }

    public final oa.b a(boolean z13) {
        qa.a aVar = this.f99363f;
        try {
            aVar.a((this.f99364g || getDatabaseName() == null) ? false : true);
            this.f99362e = false;
            SQLiteDatabase e13 = e(z13);
            if (!this.f99362e) {
                c c13 = c(e13);
                aVar.b();
                return c13;
            }
            close();
            oa.b a13 = a(z13);
            aVar.b();
            return a13;
        } catch (Throwable th3) {
            aVar.b();
            throw th3;
        }
    }

    public final c c(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return bk.f.S(this.f99359b, sqLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        qa.a aVar = this.f99363f;
        try {
            aVar.a(aVar.f103194a);
            super.close();
            this.f99359b.f66449b = null;
            this.f99364g = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z13) {
        if (z13) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase e(boolean z13) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z14 = this.f99364g;
        Context context = this.f99358a;
        if (databaseName != null && !z14 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return d(z13);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return d(z13);
            } catch (Throwable th3) {
                super.close();
                if (th3 instanceof e) {
                    e eVar = th3;
                    Throwable cause = eVar.getCause();
                    int i13 = g.f99356a[eVar.a().ordinal()];
                    if (i13 == 1) {
                        throw cause;
                    }
                    if (i13 == 2) {
                        throw cause;
                    }
                    if (i13 == 3) {
                        throw cause;
                    }
                    if (i13 == 4) {
                        throw cause;
                    }
                    if (!(cause instanceof SQLiteException)) {
                        throw cause;
                    }
                } else {
                    if (!(th3 instanceof SQLiteException)) {
                        throw th3;
                    }
                    if (databaseName == null || !this.f99361d) {
                        throw th3;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return d(z13);
                } catch (e e13) {
                    throw e13.getCause();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        boolean z13 = this.f99362e;
        oa.c cVar = this.f99360c;
        if (!z13 && cVar.f93835a != db3.getVersion()) {
            db3.setMaxSqlCacheSize(1);
        }
        try {
            cVar.b(c(db3));
        } catch (Throwable th3) {
            throw new e(f.ON_CONFIGURE, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f99360c.c(c(sqLiteDatabase));
        } catch (Throwable th3) {
            throw new e(f.ON_CREATE, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db3, int i13, int i14) {
        Intrinsics.checkNotNullParameter(db3, "db");
        this.f99362e = true;
        try {
            this.f99360c.d(c(db3), i13, i14);
        } catch (Throwable th3) {
            throw new e(f.ON_DOWNGRADE, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        if (!this.f99362e) {
            try {
                this.f99360c.e(c(db3));
            } catch (Throwable th3) {
                throw new e(f.ON_OPEN, th3);
            }
        }
        this.f99364g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i13, int i14) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f99362e = true;
        try {
            this.f99360c.f(c(sqLiteDatabase), i13, i14);
        } catch (Throwable th3) {
            throw new e(f.ON_UPGRADE, th3);
        }
    }
}
