package xo;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.gestalt.text.GestaltText;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes3.dex */
public final class q extends LinearLayout implements se0.k, af2.c {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f135531w = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f135532a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f135533b;

    /* renamed from: c, reason: collision with root package name */
    public PinterestSwipeRefreshLayout f135534c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f135535d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f135536e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f135537f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f135538g;

    /* renamed from: h, reason: collision with root package name */
    public BoardPermissionSettingCell f135539h;

    /* renamed from: i, reason: collision with root package name */
    public RelativeLayout f135540i;

    /* renamed from: j, reason: collision with root package name */
    public x0 f135541j;

    /* renamed from: k, reason: collision with root package name */
    public gi.m f135542k;

    /* renamed from: l, reason: collision with root package name */
    public m60.w f135543l;

    /* renamed from: m, reason: collision with root package name */
    public z12.a f135544m;

    /* renamed from: n, reason: collision with root package name */
    public z12.f f135545n;

    /* renamed from: o, reason: collision with root package name */
    public h12.a f135546o;

    /* renamed from: p, reason: collision with root package name */
    public f12.a f135547p;

    /* renamed from: q, reason: collision with root package name */
    public b60.b f135548q;

    /* renamed from: r, reason: collision with root package name */
    public ek2.j f135549r;

    /* renamed from: s, reason: collision with root package name */
    public v7 f135550s;

    /* renamed from: t, reason: collision with root package name */
    public bp.g f135551t;

    /* renamed from: u, reason: collision with root package name */
    public bp.f f135552u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f135553v;

    @Override // se0.k
    public final void V1() {
        bp.g gVar = this.f135551t;
        if (gVar != null) {
            gVar.E();
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f135532a == null) {
            this.f135532a = new ye2.o(this);
        }
        return this.f135532a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f135532a == null) {
            this.f135532a = new ye2.o(this);
        }
        return this.f135532a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        v7 v7Var;
        super.onAttachedToWindow();
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f135534c;
        pinterestSwipeRefreshLayout.f44880n = this;
        int i13 = 1;
        androidx.recyclerview.widget.c0 c0Var = new androidx.recyclerview.widget.c0(this, 1);
        RecyclerView recyclerView = this.f135535d;
        recyclerView.o(c0Var);
        ar0.g gVar = new ar0.g(recyclerView.f19242n);
        gVar.f20379f = new sq0.w() { // from class: xo.m
            @Override // sq0.w
            public final void loadMoreData() {
                bp.g gVar2 = q.this.f135551t;
                if (gVar2 != null) {
                    gVar2.D().a();
                }
            }
        };
        recyclerView.o(gVar);
        n nVar = new n(pinterestSwipeRefreshLayout, gVar);
        if (this.f135552u != null && (v7Var = this.f135550s) != null) {
            this.f135551t = kh2.w.i0(v7Var) ? new bp.l(this.f135550s, this.f135552u, nVar, this.f135544m, this.f135546o) : new bp.o(this.f135550s, this.f135552u, nVar, this.f135545n, this.f135547p);
        }
        recyclerView.H2(this.f135551t);
        v7 v7Var2 = this.f135550s;
        int i14 = 0;
        if (v7Var2 != null) {
            wy0 activeUser = com.bumptech.glide.d.Q(this.f135548q);
            Intrinsics.checkNotNullParameter(v7Var2, "<this>");
            Intrinsics.checkNotNullParameter(activeUser, "activeUser");
            if (!kh2.d.D0(activeUser.getUid(), v7Var2)) {
                this.f135536e.i(new j(i14));
                k3.R1(this.f135540i, true);
            }
        }
        V1();
        v7 v7Var3 = this.f135550s;
        if (v7Var3 != null) {
            this.f135549r = (ek2.j) this.f135541j.Q(v7Var3.getUid()).F(new a(this, i13), new l(i14), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ek2.j jVar = this.f135549r;
        if (jVar != null && !jVar.isDisposed()) {
            ek2.j jVar2 = this.f135549r;
            jVar2.getClass();
            bk2.c.dispose(jVar2);
        }
        super.onDetachedFromWindow();
    }
}
