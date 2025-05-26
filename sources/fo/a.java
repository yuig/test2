package fo;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import wo2.m;

/* loaded from: classes.dex */
public abstract class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final go.a f62728a;

    public a(go.a transport) {
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.f62728a = transport;
    }

    public abstract void a(m mVar);

    public abstract void c(byte b13);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f62728a.close();
    }

    public abstract void d(double d2);

    public abstract void e(String str, int i13, byte b13);

    public abstract void f(short s13);

    public abstract void g(int i13);

    public abstract void h(long j13);

    public abstract void k(byte b13, int i13);

    public abstract void m(String str);
}
