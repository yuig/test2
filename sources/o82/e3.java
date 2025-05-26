package o82;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f93573r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i3 f93574s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(i3 i3Var, bl2.c cVar) {
        super(2, cVar);
        this.f93574s = i3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e3 e3Var = new e3(this.f93574s, cVar);
        e3Var.f93573r = obj;
        return e3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e3) create((a0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a0 multiSectionDisplayState = (a0) this.f93573r;
        y0 e13 = multiSectionDisplayState.e();
        i3 i3Var = this.f93574s;
        i3Var.W8(e13);
        q2 q2Var = i3Var.f93624w0;
        if (q2Var == null) {
            Intrinsics.r("compositeAdapter");
            throw null;
        }
        s12.a registerViews = new s12.a(i3Var, 24);
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(registerViews, "registerViews");
        List list = multiSectionDisplayState.f93524a;
        int size = list.size();
        androidx.recyclerview.widget.l lVar = q2Var.f93701i;
        int size2 = size - lVar.D().size();
        int i13 = 0;
        if (size2 > 0) {
            for (int i14 = 0; i14 < size2; i14++) {
                b3 b3Var = new b3(q2Var.f93697e, (n) q2Var.f93700h.invoke(), q2Var.f93698f, q2Var.f93699g, 16);
                registerViews.invoke(b3Var);
                lVar.C(b3Var);
            }
        } else if (size2 < 0) {
            int i15 = size2 * (-1);
            for (int i16 = 0; i16 < i15; i16++) {
                androidx.recyclerview.widget.b2 b2Var = (androidx.recyclerview.widget.b2) lVar.D().get(lVar.D().size() - 1);
                android.support.v4.media.a aVar2 = (android.support.v4.media.a) lVar.f19473e;
                int j13 = aVar2.j(b2Var);
                if (j13 != -1) {
                    androidx.recyclerview.widget.i1 i1Var = (androidx.recyclerview.widget.i1) ((List) aVar2.f15841e).get(j13);
                    int d2 = aVar2.d(i1Var);
                    ((List) aVar2.f15841e).remove(j13);
                    ((androidx.recyclerview.widget.l) aVar2.f15837a).o(d2, i1Var.f19451e);
                    Iterator it = ((List) aVar2.f15839c).iterator();
                    while (it.hasNext()) {
                        RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                        if (recyclerView != null) {
                            b2Var.u(recyclerView);
                        }
                    }
                    i1Var.f19449c.B(i1Var.f19452f);
                    i1Var.f19447a.dispose();
                    aVar2.c();
                }
            }
        }
        for (Object obj2 : list) {
            int i17 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            y0 y0Var = (y0) obj2;
            List D = lVar.D();
            Intrinsics.checkNotNullExpressionValue(D, "getAdapters(...)");
            Object U = CollectionsKt.U(i13, D);
            b3 b3Var2 = U instanceof b3 ? (b3) U : null;
            if (b3Var2 != null) {
                b3Var2.f93541f.A(y0Var).b(b3Var2);
            }
            i13 = i17;
        }
        return Unit.f80348a;
    }
}
