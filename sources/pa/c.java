package pa;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.lifecycle.n1;
import kl2.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements oa.b {

    /* renamed from: b */
    public static final String[] f99349b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c */
    public static final String[] f99350c = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f99351a;

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99351a = delegate;
    }

    @Override // oa.b
    public final void B(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f99351a.execSQL(sql);
    }

    @Override // oa.b
    public final Cursor G0(oa.h query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final zn1.e eVar = new zn1.e(query, 2);
        Cursor rawQueryWithFactory = this.f99351a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: pa.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                m tmp0 = eVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.c(), f99350c, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // oa.b
    public final boolean R1() {
        return this.f99351a.inTransaction();
    }

    @Override // oa.b
    public final Cursor T0(final oa.h query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        String sql = query.c();
        String[] selectionArgs = f99350c;
        Intrinsics.f(cancellationSignal);
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: pa.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                oa.h query2 = oa.h.this;
                Intrinsics.checkNotNullParameter(query2, "$query");
                Intrinsics.f(sQLiteQuery);
                query2.a(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        SQLiteDatabase sQLiteDatabase = this.f99351a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // oa.b
    public final boolean Z1() {
        SQLiteDatabase sQLiteDatabase = this.f99351a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final void a(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f99351a.execSQL(sql, bindArgs);
    }

    public final Cursor c(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return G0(new oa.a(query));
    }

    @Override // oa.b
    public final void c0() {
        this.f99351a.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f99351a.close();
    }

    public final int d(String table, int i13, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb3 = new StringBuilder("UPDATE ");
        sb3.append(f99349b[i13]);
        sb3.append(table);
        sb3.append(" SET ");
        int i14 = 0;
        for (String str2 : values.keySet()) {
            sb3.append(i14 > 0 ? "," : "");
            sb3.append(str2);
            objArr2[i14] = values.get(str2);
            sb3.append("=?");
            i14++;
        }
        if (objArr != null) {
            for (int i15 = size; i15 < length; i15++) {
                objArr2[i15] = objArr[i15 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb3.append(" WHERE ");
            sb3.append(str);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        oa.i i16 = i1(sb4);
        n1.d(i16, objArr2);
        return ((k) i16).f99373b.executeUpdateDelete();
    }

    @Override // oa.b
    public final void e0() {
        this.f99351a.beginTransactionNonExclusive();
    }

    @Override // oa.b
    public final oa.i i1(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f99351a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new k(compileStatement);
    }

    @Override // oa.b
    public final boolean isOpen() {
        return this.f99351a.isOpen();
    }

    @Override // oa.b
    public final void p0() {
        this.f99351a.endTransaction();
    }

    @Override // oa.b
    public final void x() {
        this.f99351a.beginTransaction();
    }
}
