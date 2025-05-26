package h7;

import d7.n0;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class u extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f67932a;

    public final void a(OutputStream outputStream) {
        bf.b.t(this.f67932a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f67932a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f67932a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        if (th == null) {
            return;
        }
        n0.j0(th);
        throw null;
    }
}
