package pa;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j implements oa.g {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f99372a;

    public j(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99372a = delegate;
    }

    @Override // oa.g
    public final void M1(int i13) {
        this.f99372a.bindNull(i13);
    }

    @Override // oa.g
    public final void N(int i13, double d2) {
        this.f99372a.bindDouble(i13, d2);
    }

    @Override // oa.g
    public final void c1(int i13, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99372a.bindString(i13, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f99372a.close();
    }

    @Override // oa.g
    public final void u1(int i13, long j13) {
        this.f99372a.bindLong(i13, j13);
    }

    @Override // oa.g
    public final void y1(int i13, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99372a.bindBlob(i13, value);
    }
}
