package i2;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f71261a = new AtomicReference(q2.n.f102120a);

    /* renamed from: b, reason: collision with root package name */
    public final Object f71262b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Object f71263c;

    public final Object a() {
        long id3 = Thread.currentThread().getId();
        return id3 == c.f71080a ? this.f71263c : ((q2.m) this.f71261a.get()).b(id3);
    }

    public final void b(Object obj) {
        long id3 = Thread.currentThread().getId();
        if (id3 == c.f71080a) {
            this.f71263c = obj;
            return;
        }
        synchronized (this.f71262b) {
            q2.m mVar = (q2.m) this.f71261a.get();
            if (mVar.d(id3, obj)) {
                return;
            }
            this.f71261a.set(mVar.c(id3, obj));
            Unit unit = Unit.f80348a;
        }
    }
}
