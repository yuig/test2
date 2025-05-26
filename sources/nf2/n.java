package nf2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final lh2.b f90505a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f90506b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f90507c;

    public n(lh2.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f90505a = logger;
        this.f90506b = new AtomicBoolean(false);
        this.f90507c = new AtomicBoolean(false);
    }

    public final boolean a() {
        if (this.f90506b.get()) {
            return true;
        }
        synchronized (this.f90506b) {
            if (!this.f90506b.get()) {
                try {
                    try {
                        c0.d.M2("load-embrace-native-lib");
                        System.loadLibrary("embrace-native");
                        Unit unit = Unit.f80348a;
                        c0.d.N();
                        this.f90506b.set(true);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            c0.d.N();
                            throw th4;
                        }
                    }
                } catch (UnsatisfiedLinkError e13) {
                    if (this.f90507c.getAndSet(true)) {
                        return false;
                    }
                    ((lh2.e) this.f90505a).b(lh2.g.NATIVE_READ_FAIL, e13);
                    return false;
                }
            }
        }
        return true;
    }
}
