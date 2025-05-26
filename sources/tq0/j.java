package tq0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import h32.e4;
import h32.h2;
import h32.h4;
import h32.i0;
import h32.z1;
import java.util.ArrayList;
import java.util.Iterator;
import kb.k0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.c0;
import nx.d0;
import nx.d1;
import nx.o0;
import qa2.h0;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final int f119012k = h4.V_100.value();

    /* renamed from: l, reason: collision with root package name */
    public static final int f119013l = h4.V_80.value();

    /* renamed from: m, reason: collision with root package name */
    public static final int f119014m = h4.V_50.value();

    /* renamed from: c, reason: collision with root package name */
    public final h2 f119015c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f119016d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f119017e;

    /* renamed from: f, reason: collision with root package name */
    public final zs1.a f119018f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f119019g;

    /* renamed from: h, reason: collision with root package name */
    public final qc2.d f119020h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f119021i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f119022j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d0 pinalytics, h2 pinImpressionType, pb0.a clock, o0 pinalyticsManager, d1 trackingParamAttacher, f0 impressionDebugUtils) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinImpressionType, "pinImpressionType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(impressionDebugUtils, "impressionDebugUtils");
        this.f119015c = pinImpressionType;
        this.f119016d = pinalyticsManager;
        this.f119017e = trackingParamAttacher;
        this.f119018f = impressionDebugUtils;
        this.f119019g = new ArrayList();
        this.f119020h = new qc2.d();
        this.f119021i = new int[2];
        this.f119022j = new int[2];
    }

    public static boolean s(int i13, int i14, int i15) {
        if (i14 != i15) {
            return (i14 < i13 && i15 >= i13) || (i14 >= i13 && i15 < i13);
        }
        return false;
    }

    @Override // tq0.b
    public final void i() {
        this.f119019g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tq0.b
    public final void j(RecyclerView recyclerView, View view) {
        pb0.a aVar;
        qa2.f0 f0Var;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof qa2.f0) {
            f30 S = com.bumptech.glide.d.S(((qa2.f0) view).getInternalCell());
            Boolean d53 = S != null ? S.d5() : null;
            if (d53 != null && d53.booleanValue()) {
                qa2.f0 f0Var2 = (qa2.f0) view;
                h0 internalCell = f0Var2.getInternalCell();
                z1 U = com.bumptech.glide.d.U(internalCell);
                pb0.a aVar2 = this.f118988a;
                if (U == null) {
                    f0Var = f0Var2;
                    aVar = aVar2;
                } else {
                    long a13 = ((pb0.g) aVar2).a();
                    int[] iArr = this.f119022j;
                    internalCell.getLocationOnScreen(iArr);
                    double d2 = iArr[1];
                    double viewHeight = internalCell.getViewHeight() + d2;
                    int[] iArr2 = this.f119021i;
                    recyclerView.getLocationOnScreen(iArr2);
                    double paddingTop = recyclerView.getPaddingTop() + iArr2[1];
                    aVar = aVar2;
                    f0Var = f0Var2;
                    double height = (recyclerView.getHeight() + paddingTop) - recyclerView.getPaddingBottom();
                    boolean z13 = paddingTop <= d2 && d2 <= height;
                    boolean z14 = paddingTop <= viewHeight && viewHeight <= height;
                    if (z13 != internalCell.getH0()) {
                        internalCell.setTopVisible(z13);
                        r(internalCell, h4.V_TOP, a13, z13);
                    }
                    if (z14 != internalCell.getG0()) {
                        internalCell.setBottomVisible(z14);
                        r(internalCell, h4.V_BOTTOM, a13, z14);
                    }
                }
                h0 internalCell2 = f0Var.getInternalCell();
                if (com.bumptech.glide.d.U(internalCell2) == null) {
                    return;
                }
                int n03 = internalCell2.getN0();
                int d13 = (int) this.f119020h.d((View) f0Var, recyclerView, null);
                internalCell2.setPercentageVisible(d13);
                long a14 = ((pb0.g) aVar).a();
                boolean z15 = n03 < d13;
                if (s(f119014m, n03, d13)) {
                    r(internalCell2, h4.V_50, a14, z15);
                }
                if (s(f119013l, n03, d13)) {
                    r(internalCell2, h4.V_80, a14, z15);
                }
                if (s(f119012k, n03, d13)) {
                    r(internalCell2, h4.V_100, a14, z15);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tq0.b
    public final void k(RecyclerView recyclerView, View view, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        long a13 = ((pb0.g) this.f118988a).a();
        if (view instanceof qa2.f0) {
            f30 S = com.bumptech.glide.d.S(((qa2.f0) view).getInternalCell());
            Boolean d53 = S != null ? S.d5() : null;
            if (d53 != null && d53.booleanValue()) {
                h0 internalCell = ((qa2.f0) view).getInternalCell();
                if (com.bumptech.glide.d.U(internalCell) != null) {
                    r(internalCell, h4.V_APP_ACTIVE, a13, z13);
                }
            }
        }
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        boolean z13 = impression instanceof c0;
        ArrayList arrayList = this.f119019g;
        o0 o0Var = this.f119016d;
        if (z13) {
            c0 c0Var = (c0) impression;
            z1 source = c0Var.f92383a;
            Intrinsics.checkNotNullParameter(source, "source");
            z1 pinImpression = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f119015c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, c0Var.f92383a.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
            arrayList.add(new c0(pinImpression, c0Var.f92384b));
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
            o0Var.h(pinImpression);
            return;
        }
        if (impression instanceof z1) {
            ArrayList arrayList2 = new ArrayList();
            long a13 = ((pb0.g) this.f118988a).a();
            Long valueOf = Long.valueOf(a13);
            Boolean bool = Boolean.FALSE;
            arrayList2.add(new e4(h4.V_TOP, bool, valueOf));
            arrayList2.add(new e4(h4.V_BOTTOM, bool, Long.valueOf(a13)));
            z1 source2 = (z1) impression;
            Intrinsics.checkNotNullParameter(source2, "source");
            z1 pinImpression2 = new z1(source2.f67478a, source2.f67480b, source2.f67482c, source2.f67484d, source2.f67486e, source2.f67488f, source2.f67490g, source2.f67492h, source2.f67494i, this.f119015c, source2.f67498k, source2.f67500l, source2.f67502m, source2.f67503n, source2.f67504o, source2.f67505p, arrayList2, source2.f67507r, source2.f67508s, source2.f67509t, source2.f67510u, source2.f67511v, source2.f67512w, source2.f67513x, source2.f67514y, source2.f67515z, source2.A, source2.B, source2.C, source2.D, source2.E, source2.F, source2.G, source2.H, source2.I, source2.f67477J, source2.K, source2.L, source2.M, source2.N, source2.O, source2.P, source2.Q, source2.R, source2.S, source2.T, source2.U, source2.V, source2.W, source2.X, source2.Y, source2.Z, source2.f67479a0, source2.f67481b0, source2.f67483c0, source2.f67485d0, source2.f67487e0, source2.f67489f0, source2.f67491g0, source2.f67493h0, source2.f67495i0, source2.f67497j0, source2.f67499k0, source2.f67501l0);
            arrayList.add(new c0(pinImpression2));
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(pinImpression2, "pinImpression");
            o0Var.h(pinImpression2);
        }
    }

    @Override // tq0.b
    public final void m(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        boolean z13 = impression instanceof c0;
        o0 o0Var = this.f119016d;
        if (z13) {
            z1 pinImpression = t(((c0) impression).f92383a);
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
            o0Var.a(pinImpression);
            return;
        }
        if (impression instanceof z1) {
            z1 pinImpression2 = t((z1) impression);
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(pinImpression2, "pinImpression");
            o0Var.a(pinImpression2);
        }
    }

    @Override // tq0.b
    public final void n(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        ArrayList impressions2 = new ArrayList();
        for (Object obj : impressions) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                impressions2.add(new c0(t(c0Var.f92383a), c0Var.f92384b));
            } else if (obj instanceof z1) {
                impressions2.add(new c0(t((z1) obj)));
            }
        }
        this.f119019g.addAll(impressions2);
        if (!impressions2.isEmpty()) {
            o0 o0Var = this.f119016d;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(impressions2, "impressions");
            Iterator it = impressions2.iterator();
            while (it.hasNext()) {
                o0Var.h(((c0) it.next()).f92383a);
            }
        }
    }

    @Override // tq0.b
    public final void o(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        ArrayList impressions2 = new ArrayList();
        for (Object obj : impressions) {
            if (obj instanceof c0) {
                z1 source = ((c0) obj).f92383a;
                Intrinsics.checkNotNullParameter(source, "source");
                impressions2.add(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f119015c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0));
            } else if (obj instanceof z1) {
                z1 source2 = (z1) obj;
                Intrinsics.checkNotNullParameter(source2, "source");
                impressions2.add(new z1(source2.f67478a, source2.f67480b, source2.f67482c, source2.f67484d, source2.f67486e, source2.f67488f, source2.f67490g, source2.f67492h, source2.f67494i, this.f119015c, source2.f67498k, source2.f67500l, source2.f67502m, source2.f67503n, source2.f67504o, source2.f67505p, source2.f67506q, source2.f67507r, source2.f67508s, source2.f67509t, source2.f67510u, source2.f67511v, source2.f67512w, source2.f67513x, source2.f67514y, source2.f67515z, source2.A, source2.B, source2.C, source2.D, source2.E, source2.F, source2.G, source2.H, source2.I, source2.f67477J, source2.K, source2.L, source2.M, source2.N, source2.O, source2.P, source2.Q, source2.R, source2.S, source2.T, source2.U, source2.V, source2.W, source2.X, source2.Y, source2.Z, source2.f67479a0, source2.f67481b0, source2.f67483c0, source2.f67485d0, source2.f67487e0, source2.f67489f0, source2.f67491g0, source2.f67493h0, source2.f67495i0, source2.f67497j0, source2.f67499k0, source2.f67501l0));
            }
        }
        if (!impressions2.isEmpty()) {
            o0 o0Var = this.f119016d;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(impressions2, "impressions");
            Iterator it = impressions2.iterator();
            while (it.hasNext()) {
                o0Var.a((z1) it.next());
            }
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f119019g;
        if (qb0.b.o(arrayList)) {
            return;
        }
        arrayList.size();
        ArrayList pinImpressions = new ArrayList(arrayList);
        o0 o0Var = this.f119016d;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        d0 pinalytics = this.f118989b;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinImpressions, "pinImpressions");
        d1 trackingParamAttacher = this.f119017e;
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        i0 p13 = pinalytics.p();
        if (p13 == null) {
            Intrinsics.checkNotNullExpressionValue(new xj2.e(ck2.i.f27922b), "empty(...)");
        } else {
            Intrinsics.checkNotNullExpressionValue(tk2.e.f118015a.b(new k0(o0Var, pinalytics, pinImpressions, trackingParamAttacher, p13, 1)), "scheduleDirect(...)");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tq0.b
    public final void q(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof qa2.f0) {
            ((qa2.f0) view).getInternalCell().setPercentageVisible(0);
        }
    }

    public final void r(h0 h0Var, h4 h4Var, long j13, boolean z13) {
        e4 visibleEvent = new e4(h4Var, Boolean.valueOf(z13), Long.valueOf(j13));
        h0Var.addVisibilityEvent(visibleEvent);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        h0Var.getE0();
        this.f119018f.getClass();
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
    }

    public final z1 t(z1 source) {
        if (source.f67496j != null) {
            return source;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, this.f119015c, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
    }
}
