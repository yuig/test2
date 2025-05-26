package wo2;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130673a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f130674b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f130675c;

    public c(OutputStream out, i0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f130674b = out;
        this.f130675c = timeout;
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i13 = this.f130673a;
        Object obj = this.f130674b;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                c0 c0Var = (c0) this.f130675c;
                eVar.j();
                try {
                    c0Var.close();
                    Unit unit = Unit.f80348a;
                    if (eVar.k()) {
                        throw eVar.l(null);
                    }
                    return;
                } catch (IOException e13) {
                    if (!eVar.k()) {
                        throw e13;
                    }
                    throw eVar.l(e13);
                } finally {
                    eVar.k();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
        int i13 = this.f130673a;
        Object obj = this.f130674b;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                c0 c0Var = (c0) this.f130675c;
                eVar.j();
                try {
                    c0Var.flush();
                    Unit unit = Unit.f80348a;
                    if (eVar.k()) {
                        throw eVar.l(null);
                    }
                    return;
                } catch (IOException e13) {
                    if (!eVar.k()) {
                        throw e13;
                    }
                    throw eVar.l(e13);
                } finally {
                    eVar.k();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // wo2.c0
    public final i0 timeout() {
        switch (this.f130673a) {
            case 0:
                return (e) this.f130674b;
            default:
                return (i0) this.f130675c;
        }
    }

    public final String toString() {
        switch (this.f130673a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c0) this.f130675c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f130674b) + ')';
        }
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        int i13 = this.f130673a;
        Object obj = this.f130674b;
        Object obj2 = this.f130675c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                b.b(source.f130711b, 0L, j13);
                while (j13 > 0) {
                    z zVar = source.f130710a;
                    Intrinsics.f(zVar);
                    long j14 = 0;
                    while (true) {
                        if (j14 < 65536) {
                            j14 += zVar.f130754c - zVar.f130753b;
                            if (j14 >= j13) {
                                j14 = j13;
                            } else {
                                zVar = zVar.f130757f;
                                Intrinsics.f(zVar);
                            }
                        }
                    }
                    e eVar = (e) obj;
                    c0 c0Var = (c0) obj2;
                    eVar.j();
                    try {
                        c0Var.write(source, j14);
                        Unit unit = Unit.f80348a;
                        if (eVar.k()) {
                            throw eVar.l(null);
                        }
                        j13 -= j14;
                    } catch (IOException e13) {
                        if (!eVar.k()) {
                            throw e13;
                        }
                        throw eVar.l(e13);
                    } finally {
                        eVar.k();
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                b.b(source.f130711b, 0L, j13);
                while (j13 > 0) {
                    ((i0) obj2).f();
                    z zVar2 = source.f130710a;
                    Intrinsics.f(zVar2);
                    int min = (int) Math.min(j13, zVar2.f130754c - zVar2.f130753b);
                    ((OutputStream) obj).write(zVar2.f130752a, zVar2.f130753b, min);
                    int i14 = zVar2.f130753b + min;
                    zVar2.f130753b = i14;
                    long j15 = min;
                    j13 -= j15;
                    source.f130711b -= j15;
                    if (i14 == zVar2.f130754c) {
                        source.f130710a = zVar2.a();
                        a0.a(zVar2);
                    }
                }
                return;
        }
    }

    public c(d0 d0Var, c cVar) {
        this.f130674b = d0Var;
        this.f130675c = cVar;
    }
}
