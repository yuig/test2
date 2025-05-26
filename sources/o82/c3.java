package o82;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c3 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final a f93551a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.o f93552b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f93553c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f93554d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f93555e;

    public c3(a diffCalculator) {
        Intrinsics.checkNotNullParameter(diffCalculator, "diffCalculator");
        this.f93551a = diffCalculator;
        this.f93552b = new a7.o(true);
        this.f93553c = new LinkedHashMap();
        this.f93554d = new LinkedHashMap();
        this.f93555e = new y0(null, null, false, 7);
    }

    @Override // o82.n
    public final androidx.recyclerview.widget.w A(y0 sectionDisplayState) {
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        y0 y0Var = this.f93555e;
        this.f93555e = sectionDisplayState;
        androidx.recyclerview.widget.w e13 = androidx.recyclerview.widget.a0.e(new xk1.a(y0Var, this));
        Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
        return e13;
    }

    @Override // o82.n
    public final void F2(int i13, y2 legacyMvpBinder) {
        Intrinsics.checkNotNullParameter(legacyMvpBinder, "legacyMvpBinder");
        this.f93552b.j(i13, legacyMvpBinder);
    }

    @Override // sq0.e0
    public final int a() {
        return this.f93555e.f93756a.size();
    }

    @Override // o82.n
    public final String getItemId(int i13) {
        return ((u0) this.f93555e.f93756a.get(i13)).f93723c;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((u0) this.f93555e.f93756a.get(i13)).f93722b;
    }

    @Override // o82.n
    public final void p1(int i13, b displayStateBinder) {
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        this.f93553c.put(Integer.valueOf(i13), displayStateBinder);
    }

    @Override // o82.n
    public final void q2(int i13, Function1 vmStateConverter) {
        Intrinsics.checkNotNullParameter(vmStateConverter, "vmStateConverter");
        this.f93554d.put(Integer.valueOf(i13), vmStateConverter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o82.n
    public final void v2(View itemView, int i13) {
        l82.i0 i0Var;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        l82.i0 i0Var2 = ((u0) this.f93555e.f93756a.get(i13)).f93721a;
        y2 y2Var = (y2) this.f93552b.g(getItemViewType(i13));
        if (y2Var != null && (itemView instanceof yk1.n)) {
            yk1.n nVar = (yk1.n) itemView;
            Object invoke = y2Var.f93763b.invoke(i0Var2);
            vq0.h hVar = y2Var.f93762a;
            hVar.c(nVar, invoke, i13);
            String g13 = hVar.g(i13, invoke);
            if (g13 == null || !(!kotlin.text.z.j(g13))) {
                return;
            }
            View view = nVar instanceof View ? (View) nVar : null;
            if (view == null) {
                return;
            }
            view.setContentDescription(g13);
            return;
        }
        int itemViewType = getItemViewType(i13);
        Intrinsics.checkNotNullParameter(itemView, "<this>");
        Object tag = itemView.getTag(b3.f93539l);
        wt1.d dVar = tag instanceof wt1.d ? (wt1.d) tag : null;
        Object obj = this.f93553c.get(Integer.valueOf(itemViewType));
        if (dVar == null || obj == null) {
            return;
        }
        b bVar = (b) obj;
        Function1 function1 = (Function1) this.f93554d.get(Integer.valueOf(itemViewType));
        if (function1 != null && (i0Var = (l82.i0) function1.invoke(i0Var2)) != null) {
            i0Var2 = i0Var;
        }
        u50.o b13 = dVar.b(i0Var2, false);
        if (b13 != null) {
            bVar.d(itemView, b13, dVar.c());
        }
    }

    public /* synthetic */ c3() {
        this(new kp.n(0));
    }
}
