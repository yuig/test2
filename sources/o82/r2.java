package o82;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r2 implements n, nr0.g {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f93704a;

    public r2(kp.n diffCalculator) {
        c3 delegate = new c3(diffCalculator);
        Intrinsics.checkNotNullParameter(diffCalculator, "diffCalculator");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f93704a = delegate;
    }

    @Override // o82.n
    public final androidx.recyclerview.widget.w A(y0 sectionDisplayState) {
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        return this.f93704a.A(sectionDisplayState);
    }

    @Override // o82.n
    public final void F2(int i13, y2 legacyMvpBinder) {
        Intrinsics.checkNotNullParameter(legacyMvpBinder, "legacyMvpBinder");
        this.f93704a.F2(i13, legacyMvpBinder);
    }

    @Override // sq0.e0
    public final int a() {
        return this.f93704a.a();
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93628b;
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93633g;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        List list = this.f93704a.f93555e.f93756a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((u0) obj).f93722b == i13) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((u0) it.next()).f93724d.f93627a) {
                return false;
            }
        }
        return true;
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93632f;
    }

    @Override // o82.n
    public final String getItemId(int i13) {
        return this.f93704a.getItemId(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.f93704a.getItemViewType(i13);
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93631e;
    }

    @Override // nr0.g
    public final Integer j(int i13) {
        List list = this.f93704a.f93555e.f93756a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((u0) obj).f93722b == i13) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = ((u0) it.next()).f93724d.f93629c;
            if (num != null) {
                arrayList2.add(num);
            }
        }
        List M = CollectionsKt.M(arrayList2);
        if (M.size() != 1) {
            return null;
        }
        Intrinsics.checkNotNullParameter(M, "<this>");
        return (Integer) CollectionsKt.S(M);
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93630d;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return ((u0) this.f93704a.f93555e.f93756a.get(i13)).f93724d.f93627a;
    }

    @Override // o82.n
    public final void p1(int i13, b displayStateBinder) {
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        this.f93704a.p1(i13, displayStateBinder);
    }

    @Override // o82.n
    public final void q2(int i13, Function1 vmStateConverter) {
        Intrinsics.checkNotNullParameter(vmStateConverter, "vmStateConverter");
        this.f93704a.q2(i13, vmStateConverter);
    }

    @Override // o82.n
    public final void v2(View itemView, int i13) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f93704a.v2(itemView, i13);
    }
}
