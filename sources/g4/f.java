package g4;

import j1.x0;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final p f63457a;

    /* renamed from: b, reason: collision with root package name */
    public final s f63458b;

    /* renamed from: c, reason: collision with root package name */
    public final x f63459c;

    /* renamed from: d, reason: collision with root package name */
    public final i f63460d;

    /* renamed from: e, reason: collision with root package name */
    public final o f63461e;

    public f(bk.f fVar, a aVar) {
        x xVar = g.f63462a;
        i iVar = new i(g.f63463b);
        o oVar = new o();
        this.f63457a = fVar;
        this.f63458b = aVar;
        this.f63459c = xVar;
        this.f63460d = iVar;
        this.f63461e = oVar;
    }

    public final z a(w wVar) {
        z zVar;
        x xVar = this.f63459c;
        x0 x0Var = new x0(25, this, wVar);
        synchronized (xVar.f63484a) {
            zVar = (z) xVar.f63485b.a(wVar);
            if (zVar != null) {
                if (!((y) zVar).f63487b) {
                }
            }
            try {
                zVar = (z) x0Var.invoke(new x0(26, xVar, wVar));
                synchronized (xVar.f63484a) {
                    try {
                        if (xVar.f63485b.a(wVar) == null && ((y) zVar).f63487b) {
                            xVar.f63485b.b(wVar, zVar);
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Exception e13) {
                throw new IllegalStateException("Could not load font", e13);
            }
        }
        return zVar;
    }

    public final z b(e eVar, l lVar, int i13, int i14) {
        s sVar = this.f63458b;
        sVar.getClass();
        l a13 = sVar.a(lVar);
        this.f63457a.getClass();
        return a(new w(eVar, a13, i13, i14, null));
    }
}
