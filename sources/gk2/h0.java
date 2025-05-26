package gk2;

import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class h0 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65431b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f65432c;

    public h0(Object obj, int i13) {
        this.f65431b = i13;
        this.f65432c = obj;
    }

    public static void o(xp2.b bVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                ok2.d.complete(bVar);
            } else if (bVar instanceof dk2.a) {
                bVar.d(new v0((dk2.a) bVar, it, 0));
            } else {
                bVar.d(new v0(bVar, it, 1));
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            ok2.d.error(th3, bVar);
        }
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65431b;
        Object obj = this.f65432c;
        switch (i13) {
            case 0:
                try {
                    Object call = ((Callable) obj).call();
                    ck2.i.b(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) call;
                } catch (Throwable th3) {
                    th = th3;
                    bp1.h.H(th);
                }
                ok2.d.error(th, bVar);
                break;
            case 1:
                if (!(bVar instanceof dk2.a)) {
                    bVar.d(new s0(bVar, (Object[]) obj, 1));
                    break;
                } else {
                    bVar.d(new s0((dk2.a) bVar, (Object[]) obj, 0));
                    break;
                }
            default:
                try {
                    o(bVar, ((Iterable) obj).iterator());
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    ok2.d.error(th4, bVar);
                    return;
                }
        }
    }
}
