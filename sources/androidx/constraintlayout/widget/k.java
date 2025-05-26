package androidx.constraintlayout.widget;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f17763a;

    /* renamed from: b, reason: collision with root package name */
    public String f17764b;

    /* renamed from: c, reason: collision with root package name */
    public final n f17765c;

    /* renamed from: d, reason: collision with root package name */
    public final m f17766d;

    /* renamed from: e, reason: collision with root package name */
    public final l f17767e;

    /* renamed from: f, reason: collision with root package name */
    public final o f17768f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f17769g;

    /* renamed from: h, reason: collision with root package name */
    public j f17770h;

    public k() {
        n nVar = new n();
        nVar.f17829a = false;
        nVar.f17830b = 0;
        nVar.f17831c = 0;
        nVar.f17832d = 1.0f;
        nVar.f17833e = Float.NaN;
        this.f17765c = nVar;
        m mVar = new m();
        mVar.f17816a = false;
        mVar.f17817b = -1;
        mVar.f17818c = 0;
        mVar.f17819d = null;
        mVar.f17820e = -1;
        mVar.f17821f = 0;
        mVar.f17822g = Float.NaN;
        mVar.f17823h = Float.NaN;
        mVar.f17824i = Float.NaN;
        mVar.f17825j = -1;
        mVar.f17826k = null;
        mVar.f17827l = -3;
        mVar.f17828m = -1;
        this.f17766d = mVar;
        l lVar = new l();
        lVar.f17773a = false;
        lVar.f17775b = false;
        lVar.f17781e = -1;
        lVar.f17783f = -1;
        lVar.f17785g = -1.0f;
        lVar.f17787h = true;
        lVar.f17789i = -1;
        lVar.f17791j = -1;
        lVar.f17793k = -1;
        lVar.f17795l = -1;
        lVar.f17797m = -1;
        lVar.f17799n = -1;
        lVar.f17801o = -1;
        lVar.f17803p = -1;
        lVar.f17805q = -1;
        lVar.f17806r = -1;
        lVar.f17807s = -1;
        lVar.f17808t = -1;
        lVar.f17809u = -1;
        lVar.f17810v = -1;
        lVar.f17811w = -1;
        lVar.f17812x = 0.5f;
        lVar.f17813y = 0.5f;
        lVar.f17814z = null;
        lVar.A = -1;
        lVar.B = 0;
        lVar.C = 0.0f;
        lVar.D = -1;
        lVar.E = -1;
        lVar.F = -1;
        lVar.G = 0;
        lVar.H = 0;
        lVar.I = 0;
        lVar.f17772J = 0;
        lVar.K = 0;
        lVar.L = 0;
        lVar.M = 0;
        lVar.N = Integer.MIN_VALUE;
        lVar.O = Integer.MIN_VALUE;
        lVar.P = Integer.MIN_VALUE;
        lVar.Q = Integer.MIN_VALUE;
        lVar.R = Integer.MIN_VALUE;
        lVar.S = Integer.MIN_VALUE;
        lVar.T = Integer.MIN_VALUE;
        lVar.U = -1.0f;
        lVar.V = -1.0f;
        lVar.W = 0;
        lVar.X = 0;
        lVar.Y = 0;
        lVar.Z = 0;
        lVar.f17774a0 = 0;
        lVar.f17776b0 = 0;
        lVar.f17778c0 = 0;
        lVar.f17780d0 = 0;
        lVar.f17782e0 = 1.0f;
        lVar.f17784f0 = 1.0f;
        lVar.f17786g0 = -1;
        lVar.f17788h0 = 0;
        lVar.f17790i0 = -1;
        lVar.f17798m0 = false;
        lVar.f17800n0 = false;
        lVar.f17802o0 = true;
        lVar.f17804p0 = 0;
        this.f17767e = lVar;
        o oVar = new o();
        oVar.f17835a = false;
        oVar.f17836b = 0.0f;
        oVar.f17837c = 0.0f;
        oVar.f17838d = 0.0f;
        oVar.f17839e = 1.0f;
        oVar.f17840f = 1.0f;
        oVar.f17841g = Float.NaN;
        oVar.f17842h = Float.NaN;
        oVar.f17843i = -1;
        oVar.f17844j = 0.0f;
        oVar.f17845k = 0.0f;
        oVar.f17846l = 0.0f;
        oVar.f17847m = false;
        oVar.f17848n = 0.0f;
        this.f17768f = oVar;
        this.f17769g = new HashMap();
    }

    public static void b(k kVar, ConstraintHelper constraintHelper, int i13, Constraints.LayoutParams layoutParams) {
        kVar.g(i13, layoutParams);
        if (constraintHelper instanceof Barrier) {
            l lVar = kVar.f17767e;
            lVar.f17790i0 = 1;
            Barrier barrier = (Barrier) constraintHelper;
            lVar.f17786g0 = barrier.f17643i;
            lVar.f17792j0 = barrier.k();
            lVar.f17788h0 = barrier.f17645k.f120165z0;
        }
    }

    public final void d(ConstraintLayout.LayoutParams layoutParams) {
        l lVar = this.f17767e;
        layoutParams.f17663e = lVar.f17789i;
        layoutParams.f17665f = lVar.f17791j;
        layoutParams.f17667g = lVar.f17793k;
        layoutParams.f17669h = lVar.f17795l;
        layoutParams.f17671i = lVar.f17797m;
        layoutParams.f17673j = lVar.f17799n;
        layoutParams.f17675k = lVar.f17801o;
        layoutParams.f17677l = lVar.f17803p;
        layoutParams.f17679m = lVar.f17805q;
        layoutParams.f17681n = lVar.f17806r;
        layoutParams.f17683o = lVar.f17807s;
        layoutParams.f17690s = lVar.f17808t;
        layoutParams.f17691t = lVar.f17809u;
        layoutParams.f17692u = lVar.f17810v;
        layoutParams.f17693v = lVar.f17811w;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = lVar.G;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = lVar.H;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = lVar.I;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = lVar.f17772J;
        layoutParams.A = lVar.S;
        layoutParams.B = lVar.R;
        layoutParams.f17695x = lVar.O;
        layoutParams.f17697z = lVar.Q;
        layoutParams.E = lVar.f17812x;
        layoutParams.F = lVar.f17813y;
        layoutParams.f17685p = lVar.A;
        layoutParams.f17687q = lVar.B;
        layoutParams.f17689r = lVar.C;
        layoutParams.G = lVar.f17814z;
        layoutParams.T = lVar.D;
        layoutParams.U = lVar.E;
        layoutParams.I = lVar.U;
        layoutParams.H = lVar.V;
        layoutParams.K = lVar.X;
        layoutParams.f17654J = lVar.W;
        layoutParams.W = lVar.f17798m0;
        layoutParams.X = lVar.f17800n0;
        layoutParams.L = lVar.Y;
        layoutParams.M = lVar.Z;
        layoutParams.P = lVar.f17774a0;
        layoutParams.Q = lVar.f17776b0;
        layoutParams.N = lVar.f17778c0;
        layoutParams.O = lVar.f17780d0;
        layoutParams.R = lVar.f17782e0;
        layoutParams.S = lVar.f17784f0;
        layoutParams.V = lVar.F;
        layoutParams.f17659c = lVar.f17785g;
        layoutParams.f17655a = lVar.f17781e;
        layoutParams.f17657b = lVar.f17783f;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = lVar.f17777c;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = lVar.f17779d;
        String str = lVar.f17796l0;
        if (str != null) {
            layoutParams.Y = str;
        }
        layoutParams.Z = lVar.f17804p0;
        layoutParams.setMarginStart(lVar.L);
        layoutParams.setMarginEnd(lVar.K);
        layoutParams.a();
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k kVar = new k();
        kVar.f17767e.a(this.f17767e);
        kVar.f17766d.a(this.f17766d);
        kVar.f17765c.a(this.f17765c);
        kVar.f17768f.a(this.f17768f);
        kVar.f17763a = this.f17763a;
        kVar.f17770h = this.f17770h;
        return kVar;
    }

    public final void f(int i13, ConstraintLayout.LayoutParams layoutParams) {
        this.f17763a = i13;
        int i14 = layoutParams.f17663e;
        l lVar = this.f17767e;
        lVar.f17789i = i14;
        lVar.f17791j = layoutParams.f17665f;
        lVar.f17793k = layoutParams.f17667g;
        lVar.f17795l = layoutParams.f17669h;
        lVar.f17797m = layoutParams.f17671i;
        lVar.f17799n = layoutParams.f17673j;
        lVar.f17801o = layoutParams.f17675k;
        lVar.f17803p = layoutParams.f17677l;
        lVar.f17805q = layoutParams.f17679m;
        lVar.f17806r = layoutParams.f17681n;
        lVar.f17807s = layoutParams.f17683o;
        lVar.f17808t = layoutParams.f17690s;
        lVar.f17809u = layoutParams.f17691t;
        lVar.f17810v = layoutParams.f17692u;
        lVar.f17811w = layoutParams.f17693v;
        lVar.f17812x = layoutParams.E;
        lVar.f17813y = layoutParams.F;
        lVar.f17814z = layoutParams.G;
        lVar.A = layoutParams.f17685p;
        lVar.B = layoutParams.f17687q;
        lVar.C = layoutParams.f17689r;
        lVar.D = layoutParams.T;
        lVar.E = layoutParams.U;
        lVar.F = layoutParams.V;
        lVar.f17785g = layoutParams.f17659c;
        lVar.f17781e = layoutParams.f17655a;
        lVar.f17783f = layoutParams.f17657b;
        lVar.f17777c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
        lVar.f17779d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
        lVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        lVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        lVar.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        lVar.f17772J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        lVar.M = layoutParams.D;
        lVar.U = layoutParams.I;
        lVar.V = layoutParams.H;
        lVar.X = layoutParams.K;
        lVar.W = layoutParams.f17654J;
        lVar.f17798m0 = layoutParams.W;
        lVar.f17800n0 = layoutParams.X;
        lVar.Y = layoutParams.L;
        lVar.Z = layoutParams.M;
        lVar.f17774a0 = layoutParams.P;
        lVar.f17776b0 = layoutParams.Q;
        lVar.f17778c0 = layoutParams.N;
        lVar.f17780d0 = layoutParams.O;
        lVar.f17782e0 = layoutParams.R;
        lVar.f17784f0 = layoutParams.S;
        lVar.f17796l0 = layoutParams.Y;
        lVar.O = layoutParams.f17695x;
        lVar.Q = layoutParams.f17697z;
        lVar.N = layoutParams.f17694w;
        lVar.P = layoutParams.f17696y;
        lVar.S = layoutParams.A;
        lVar.R = layoutParams.B;
        lVar.T = layoutParams.C;
        lVar.f17804p0 = layoutParams.Z;
        lVar.K = layoutParams.getMarginEnd();
        lVar.L = layoutParams.getMarginStart();
    }

    public final void g(int i13, Constraints.LayoutParams layoutParams) {
        f(i13, layoutParams);
        this.f17765c.f17832d = layoutParams.f17699r0;
        float f13 = layoutParams.f17702u0;
        o oVar = this.f17768f;
        oVar.f17836b = f13;
        oVar.f17837c = layoutParams.f17703v0;
        oVar.f17838d = layoutParams.f17704w0;
        oVar.f17839e = layoutParams.f17705x0;
        oVar.f17840f = layoutParams.f17706y0;
        oVar.f17841g = layoutParams.f17707z0;
        oVar.f17842h = layoutParams.A0;
        oVar.f17844j = layoutParams.B0;
        oVar.f17845k = layoutParams.C0;
        oVar.f17846l = layoutParams.D0;
        oVar.f17848n = layoutParams.f17701t0;
        oVar.f17847m = layoutParams.f17700s0;
    }
}
