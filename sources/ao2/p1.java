package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public class p1 extends a2 implements x {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(o1 o1Var) {
        super(true);
        boolean z13 = true;
        N(o1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a2.f20112b;
        s sVar = (s) atomicReferenceFieldUpdater.get(this);
        t tVar = sVar instanceof t ? (t) sVar : null;
        if (tVar != null) {
            a2 h10 = tVar.h();
            while (!h10.I()) {
                s sVar2 = (s) atomicReferenceFieldUpdater.get(h10);
                t tVar2 = sVar2 instanceof t ? (t) sVar2 : null;
                if (tVar2 != null) {
                    h10 = tVar2.h();
                }
            }
            this.f20190c = z13;
        }
        z13 = false;
        this.f20190c = z13;
    }

    @Override // ao2.a2
    public final boolean I() {
        return this.f20190c;
    }

    @Override // ao2.a2
    public final boolean J() {
        return true;
    }

    public final boolean e0() {
        return Q(Unit.f80348a);
    }
}
