package ao2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20196e;

    /* renamed from: f, reason: collision with root package name */
    public final o f20197f;

    public r(o oVar, int i13) {
        this.f20196e = i13;
        this.f20197f = oVar;
    }

    @Override // ao2.r1
    public final boolean i() {
        switch (this.f20196e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        int i13 = this.f20196e;
        o oVar = this.f20197f;
        switch (i13) {
            case 0:
                Throwable t13 = oVar.t(h());
                if (oVar.z()) {
                    bl2.c cVar = oVar.f20184d;
                    Intrinsics.g(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    ho2.e eVar = (ho2.e) cVar;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ho2.e.f69753h;
                        Object obj = atomicReferenceFieldUpdater.get(eVar);
                        fi.b bVar = ho2.f.f69759b;
                        if (Intrinsics.d(obj, bVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, bVar, t13)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != bVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                oVar.cancel(t13);
                if (!oVar.z()) {
                    oVar.r();
                    break;
                }
                break;
            default:
                Object obj2 = a2.f20111a.get(h());
                if (!(obj2 instanceof z)) {
                    xk2.q qVar = xk2.s.f135225b;
                    oVar.resumeWith(b2.b(obj2));
                    break;
                } else {
                    xk2.q qVar2 = xk2.s.f135225b;
                    oVar.resumeWith(ue.c.m(((z) obj2).f20242a));
                    break;
                }
        }
    }
}
