package ao2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class c extends r1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20123h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final m f20124e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f20125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f20126g;

    public c(e eVar, o oVar) {
        this.f20126g = eVar;
        this.f20124e = oVar;
    }

    @Override // ao2.r1
    public final boolean i() {
        return false;
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        m mVar = this.f20124e;
        if (th3 != null) {
            fi.b f13 = mVar.f(th3);
            if (f13 != null) {
                mVar.x(f13);
                d dVar = (d) f20123h.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f20135b;
        e eVar = this.f20126g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            p0[] p0VarArr = eVar.f20136a;
            ArrayList arrayList = new ArrayList(p0VarArr.length);
            for (p0 p0Var : p0VarArr) {
                arrayList.add(p0Var.getCompleted());
            }
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(arrayList);
        }
    }
}
