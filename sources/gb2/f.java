package gb2;

import com.pinterest.api.model.iw;
import dl1.b0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import jk2.j1;
import jk2.x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;
import wa2.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f64747a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final uk2.d f64748b = s1.h("create(...)");

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedBlockingDeque f64749c = new LinkedBlockingDeque();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f64750d = y0.b(new Pair(p.STATE_UNDO_UNFOLLOWED_BOARD, p.STATE_UNFOLLOWED_BOARD));

    public static x a() {
        Intrinsics.checkNotNullParameter(i.class, "clazz");
        int i13 = 4;
        r42.k kVar = new r42.k(i13, new e82.l(i.class, i13));
        uk2.d dVar = f64748b;
        dVar.getClass();
        x xVar = new x(new j1(dVar, kVar, 0), new b0(10, e.f64746i), 2);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        return xVar;
    }

    public static void c(l state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LinkedBlockingDeque linkedBlockingDeque = f64749c;
        synchronized (linkedBlockingDeque) {
            f fVar = f64747a;
            fVar.b(state);
            if (state instanceof i) {
                p pVar = (p) f64750d.get(((i) state).f64754b);
                if (pVar != null) {
                    linkedBlockingDeque.removeIf(new iw(15, new ha2.j(pVar, 10)));
                }
            }
            linkedBlockingDeque.offer(state);
            synchronized (fVar) {
                if (linkedBlockingDeque.size() - 20 > 0) {
                    linkedBlockingDeque.takeFirst();
                }
            }
            f64748b.c(CollectionsKt.F0(linkedBlockingDeque));
            Unit unit = Unit.f80348a;
        }
    }

    public final synchronized void b(l state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = f64749c.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (Intrinsics.d(((l) it.next()).a(), state.a())) {
                it.remove();
            }
        }
    }
}
