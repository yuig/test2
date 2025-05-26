package zy;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import h32.e4;
import h32.h2;
import h32.h4;
import h32.z1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final z f143100a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.r f143101b;

    /* renamed from: c, reason: collision with root package name */
    public final h2 f143102c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f143103d;

    public o0(z pinImpressionHelper, u50.r eventIntake, h2 pinImpressionType) {
        Intrinsics.checkNotNullParameter(pinImpressionHelper, "pinImpressionHelper");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(pinImpressionType, "pinImpressionType");
        this.f143100a = pinImpressionHelper;
        this.f143101b = eventIntake;
        this.f143102c = pinImpressionType;
        this.f143103d = new ArrayList();
    }

    @Override // zy.m
    public final void a(RecyclerView recyclerView, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            KeyEvent.Callback view = (View) it.next();
            z zVar = this.f143100a;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            long currentTimeMillis = 1000000 * System.currentTimeMillis();
            if (view instanceof qa2.f0) {
                f30 S = com.bumptech.glide.d.S(((qa2.f0) view).getInternalCell());
                Boolean d53 = S != null ? S.d5() : null;
                if (d53 != null && d53.booleanValue()) {
                    qa2.h0 internalCell = ((qa2.f0) view).getInternalCell();
                    if (com.bumptech.glide.d.U(internalCell) != null) {
                        zVar.a(internalCell, h4.V_APP_ACTIVE, currentTimeMillis, z13);
                    }
                }
            }
        }
    }

    @Override // zy.m
    public final void b(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : impressions) {
            if (obj instanceof nx.c0) {
                z1 source = ((nx.c0) obj).f92383a;
                Intrinsics.checkNotNullParameter(source, "source");
                arrayList.add(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f143102c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0));
            } else if (obj instanceof z1) {
                z1 source2 = (z1) obj;
                Intrinsics.checkNotNullParameter(source2, "source");
                arrayList.add(new z1(source2.f67478a, source2.f67480b, source2.f67482c, source2.f67484d, source2.f67486e, source2.f67488f, source2.f67490g, source2.f67492h, source2.f67494i, this.f143102c, source2.f67498k, source2.f67500l, source2.f67502m, source2.f67503n, source2.f67504o, source2.f67505p, source2.f67506q, source2.f67507r, source2.f67508s, source2.f67509t, source2.f67510u, source2.f67511v, source2.f67512w, source2.f67513x, source2.f67514y, source2.f67515z, source2.A, source2.B, source2.C, source2.D, source2.E, source2.F, source2.G, source2.H, source2.I, source2.f67477J, source2.K, source2.L, source2.M, source2.N, source2.O, source2.P, source2.Q, source2.R, source2.S, source2.T, source2.U, source2.V, source2.W, source2.X, source2.Y, source2.Z, source2.f67479a0, source2.f67481b0, source2.f67483c0, source2.f67485d0, source2.f67487e0, source2.f67489f0, source2.f67491g0, source2.f67493h0, source2.f67495i0, source2.f67497j0, source2.f67499k0, source2.f67501l0));
            }
        }
        if (!arrayList.isEmpty()) {
            this.f143101b.a(new h(arrayList));
        }
    }

    @Override // zy.m
    public final void c(Object impression) {
        z1 z1Var;
        Intrinsics.checkNotNullParameter(impression, "impression");
        boolean z13 = impression instanceof nx.c0;
        ArrayList arrayList = this.f143103d;
        if (z13) {
            nx.c0 c0Var = (nx.c0) impression;
            z1 source = c0Var.f92383a;
            Intrinsics.checkNotNullParameter(source, "source");
            z1 z1Var2 = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f143102c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, c0Var.f92383a.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
            arrayList.add(new nx.c0(z1Var2, c0Var.f92384b));
            z1Var = z1Var2;
        } else {
            if (!(impression instanceof z1)) {
                return;
            }
            this.f143100a.getClass();
            ArrayList arrayList2 = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            Long valueOf = Long.valueOf(currentTimeMillis);
            Boolean bool = Boolean.FALSE;
            arrayList2.add(new e4(h4.V_TOP, bool, valueOf));
            arrayList2.add(new e4(h4.V_BOTTOM, bool, Long.valueOf(currentTimeMillis)));
            z1 source2 = (z1) impression;
            Intrinsics.checkNotNullParameter(source2, "source");
            z1 z1Var3 = new z1(source2.f67478a, source2.f67480b, source2.f67482c, source2.f67484d, source2.f67486e, source2.f67488f, source2.f67490g, source2.f67492h, source2.f67494i, this.f143102c, source2.f67498k, source2.f67500l, source2.f67502m, source2.f67503n, source2.f67504o, source2.f67505p, arrayList2, source2.f67507r, source2.f67508s, source2.f67509t, source2.f67510u, source2.f67511v, source2.f67512w, source2.f67513x, source2.f67514y, source2.f67515z, source2.A, source2.B, source2.C, source2.D, source2.E, source2.F, source2.G, source2.H, source2.I, source2.f67477J, source2.K, source2.L, source2.M, source2.N, source2.O, source2.P, source2.Q, source2.R, source2.S, source2.T, source2.U, source2.V, source2.W, source2.X, source2.Y, source2.Z, source2.f67479a0, source2.f67481b0, source2.f67483c0, source2.f67485d0, source2.f67487e0, source2.f67489f0, source2.f67491g0, source2.f67493h0, source2.f67495i0, source2.f67497j0, source2.f67499k0, source2.f67501l0);
            arrayList.add(new nx.c0(z1Var3));
            z1Var = z1Var3;
        }
        this.f143101b.a(new d(z1Var));
    }

    @Override // zy.m
    public final void d() {
        ArrayList arrayList = this.f143103d;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.size();
        this.f143101b.a(new f(new ArrayList(arrayList)));
        arrayList.clear();
    }

    @Override // zy.m
    public final void e(Object impression) {
        z1 i13;
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof nx.c0) {
            i13 = i(((nx.c0) impression).f92383a);
        } else if (!(impression instanceof z1)) {
            return;
        } else {
            i13 = i((z1) impression);
        }
        this.f143101b.a(new g(i13));
    }

    @Override // zy.m
    public final void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            KeyEvent.Callback view = (View) it.next();
            this.f143100a.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            if (view instanceof qa2.f0) {
                ((qa2.f0) view).getInternalCell().setPercentageVisible(0);
            }
        }
    }

    @Override // zy.m
    public final void g(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : impressions) {
            if (obj instanceof nx.c0) {
                nx.c0 c0Var = (nx.c0) obj;
                arrayList.add(new nx.c0(i(c0Var.f92383a), c0Var.f92384b));
            } else if (obj instanceof z1) {
                arrayList.add(new nx.c0(i((z1) obj)));
            }
        }
        this.f143103d.addAll(arrayList);
        if (!arrayList.isEmpty()) {
            this.f143101b.a(new e(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zy.m
    public final void h(RecyclerView recyclerView) {
        String str;
        Iterator it;
        qa2.h0 h0Var;
        String str2 = "recyclerView";
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it2 = d7.b.O(recyclerView).iterator();
        while (it2.hasNext()) {
            KeyEvent.Callback view = (View) it2.next();
            z zVar = this.f143100a;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, str2);
            Intrinsics.checkNotNullParameter(view, "view");
            if (view instanceof qa2.f0) {
                f30 S = com.bumptech.glide.d.S(((qa2.f0) view).getInternalCell());
                Boolean d53 = S != null ? S.d5() : null;
                if (d53 != null && d53.booleanValue()) {
                    qa2.f0 f0Var = (qa2.f0) view;
                    qa2.h0 internalCell = f0Var.getInternalCell();
                    if (com.bumptech.glide.d.U(internalCell) == null) {
                        str = str2;
                        it = it2;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() * 1000000;
                        int[] iArr = new int[2];
                        internalCell.getLocationOnScreen(iArr);
                        double d2 = iArr[1];
                        double viewHeight = internalCell.getViewHeight() + d2;
                        int[] iArr2 = new int[2];
                        recyclerView.getLocationOnScreen(iArr2);
                        double paddingTop = recyclerView.getPaddingTop() + iArr2[1];
                        str = str2;
                        it = it2;
                        double height = (recyclerView.getHeight() + paddingTop) - recyclerView.getPaddingBottom();
                        boolean z13 = paddingTop <= d2 && d2 <= height;
                        boolean z14 = paddingTop <= viewHeight && viewHeight <= height;
                        if (z13 != internalCell.getH0()) {
                            h0Var = internalCell;
                            h0Var.setTopVisible(z13);
                            zVar.a(h0Var, h4.V_TOP, currentTimeMillis, z13);
                        } else {
                            h0Var = internalCell;
                        }
                        if (z14 != h0Var.getG0()) {
                            h0Var.setBottomVisible(z14);
                            zVar.a(h0Var, h4.V_BOTTOM, currentTimeMillis, z14);
                        }
                    }
                    qa2.h0 internalCell2 = f0Var.getInternalCell();
                    if (com.bumptech.glide.d.U(internalCell2) != null) {
                        int n03 = internalCell2.getN0();
                        int d13 = (int) ((qc2.d) zVar.f143124a).d((View) f0Var, recyclerView, null);
                        internalCell2.setPercentageVisible(d13);
                        long currentTimeMillis2 = System.currentTimeMillis() * 1000000;
                        boolean z15 = n03 < d13;
                        if (z.b(z.f143123e, n03, d13)) {
                            zVar.a(internalCell2, h4.V_50, currentTimeMillis2, z15);
                        }
                        if (z.b(z.f143122d, n03, d13)) {
                            zVar.a(internalCell2, h4.V_80, currentTimeMillis2, z15);
                        }
                        if (z.b(z.f143121c, n03, d13)) {
                            zVar.a(internalCell2, h4.V_100, currentTimeMillis2, z15);
                        }
                    }
                    str2 = str;
                    it2 = it;
                }
            }
            str = str2;
            it = it2;
            str2 = str;
            it2 = it;
        }
    }

    public final z1 i(z1 source) {
        if (source.f67496j != null) {
            return source;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f143102c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
    }
}
