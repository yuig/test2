package ho2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69773a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69773a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int a13 = oVar.a(obj);
            if (a13 == 0) {
                return true;
            }
            if (a13 == 1) {
                o e13 = oVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, e13) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (a13 == 2) {
                return false;
            }
        }
    }

    public final int b() {
        o oVar = (o) f69773a.get(this);
        oVar.getClass();
        long j13 = o.f69776f.get(oVar);
        return (((int) ((j13 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j13))) & 1073741823;
    }

    public final Object c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69773a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            Object f13 = oVar.f();
            if (f13 != o.f69777g) {
                return f13;
            }
            o e13 = oVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, e13) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
