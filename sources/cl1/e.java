package cl1;

import bp1.h;
import ck2.i;
import fk2.e0;
import fk2.o;
import java.util.concurrent.Callable;
import jk2.y0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import uj2.f;
import uj2.q;
import uj2.t;
import uj2.v;

/* loaded from: classes5.dex */
public final class e extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27989a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27990b;

    public e(Object obj, int i13) {
        this.f27989a = i13;
        this.f27990b = obj;
    }

    @Override // uj2.q
    public final void G(v observer) {
        int i13 = this.f27989a;
        Object obj = this.f27990b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(observer, "observer");
                d dVar = new d(observer);
                ((w) obj).h(dVar);
                observer.b(new a(dVar));
                break;
            case 1:
                ((uj2.b) ((f) obj)).j(new e0(observer));
                break;
            case 2:
                try {
                    Object call = ((Callable) obj).call();
                    i.b(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) call;
                } catch (Throwable th3) {
                    th = th3;
                    h.H(th);
                }
                bk2.d.error(th, observer);
                break;
            case 3:
                ((xp2.a) obj).b(new y0(observer));
                break;
            case 4:
                ((t) obj).d(observer);
                break;
            default:
                ((q) obj).d(new o(observer, 2));
                break;
        }
    }

    public e(w eventManager) {
        this.f27989a = 0;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f27990b = eventManager;
    }
}
