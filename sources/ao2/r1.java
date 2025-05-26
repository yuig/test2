package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r1 extends ho2.l implements x0, l1 {

    /* renamed from: d, reason: collision with root package name */
    public a2 f20198d;

    @Override // ao2.l1
    public final f2 b() {
        return null;
    }

    @Override // ao2.x0
    public final void dispose() {
        a2 h10 = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a2.f20111a;
            Object obj = atomicReferenceFieldUpdater.get(h10);
            if (obj instanceof r1) {
                if (obj != this) {
                    return;
                }
                z0 z0Var = b2.f20122g;
                while (!atomicReferenceFieldUpdater.compareAndSet(h10, obj, z0Var)) {
                    if (atomicReferenceFieldUpdater.get(h10) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof l1) || ((l1) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ho2.l.f69770a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof ho2.s) {
                    ho2.l lVar = ((ho2.s) obj2).f69786a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                ho2.l lVar2 = (ho2.l) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ho2.l.f69772c;
                ho2.s sVar = (ho2.s) atomicReferenceFieldUpdater3.get(lVar2);
                if (sVar == null) {
                    sVar = new ho2.s(lVar2);
                    atomicReferenceFieldUpdater3.set(lVar2, sVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, sVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                lVar2.d();
                return;
            }
        }
    }

    public o1 getParent() {
        return h();
    }

    public final a2 h() {
        a2 a2Var = this.f20198d;
        if (a2Var != null) {
            return a2Var;
        }
        Intrinsics.r("job");
        throw null;
    }

    public abstract boolean i();

    @Override // ao2.l1
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th3);

    @Override // ho2.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + m0.y(this) + "[job@" + m0.y(h()) + ']';
    }
}
