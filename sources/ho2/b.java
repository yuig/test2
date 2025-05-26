package ho2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69748a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69749b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(b bVar) {
        this._prev$volatile = bVar;
    }

    public final void a() {
        f69749b.set(this, null);
    }

    public final b c() {
        Object obj = f69748a.get(this);
        if (obj == a.f69743a) {
            return null;
        }
        return (b) obj;
    }

    public final b d() {
        return (b) f69749b.get(this);
    }

    public abstract boolean e();

    public final boolean f() {
        return c() == null;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        b c13;
        if (f()) {
            return;
        }
        while (true) {
            b d2 = d();
            while (true) {
                atomicReferenceFieldUpdater = f69749b;
                if (d2 == null || !d2.e()) {
                    break;
                } else {
                    d2 = (b) atomicReferenceFieldUpdater.get(d2);
                }
            }
            b c14 = c();
            Intrinsics.f(c14);
            while (c14.e() && (c13 = c14.c()) != null) {
                c14 = c13;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(c14);
            } while (!d7.g.B(atomicReferenceFieldUpdater, c14, obj, ((b) obj) == null ? null : d2));
            if (d2 != null) {
                f69748a.set(d2, c14);
            }
            if (!c14.e() || c14.f()) {
                if (d2 == null || !d2.e()) {
                    return;
                }
            }
        }
    }
}
