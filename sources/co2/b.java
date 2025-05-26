package co2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28290b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f28289a = i13;
        this.f28290b = obj;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, final Object obj3) {
        int i13 = this.f28289a;
        Object obj4 = this.f28290b;
        switch (i13) {
            case 0:
                final m mVar = (m) obj4;
                final lo2.i iVar = (lo2.i) obj;
                return new kl2.l() { // from class: co2.d
                    @Override // kl2.l
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        fi.b bVar = o.f28336l;
                        Object obj8 = obj3;
                        if (obj8 != bVar) {
                            kg.t.r(mVar.f28322b, obj8, ((lo2.h) iVar).f());
                        }
                        return Unit.f80348a;
                    }
                };
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mo2.h.f87815c;
                ((mo2.h) obj4).c();
                return Unit.f80348a;
        }
    }
}
