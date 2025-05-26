package z7;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Cursor f140899a;

    public a(Cursor cursor) {
        this.f140899a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f140899a.close();
    }
}
