package ko2;

import ao2.f0;
import ao2.m0;
import ho2.r;

/* loaded from: classes2.dex */
public final class f extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final f f80328d = new f(l.f80338e, l.f80334a, l.f80336c, l.f80337d);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        m0.m(i13);
        return i13 >= l.f80336c ? str != null ? new r(this, str) : this : super.m(i13, str);
    }

    @Override // ao2.f0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
