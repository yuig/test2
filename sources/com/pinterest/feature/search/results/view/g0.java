package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n3;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.z0;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class g0 extends LinearLayout implements h61.d, af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f47786l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f47787a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47788b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f47789c;

    /* renamed from: d, reason: collision with root package name */
    public final n3 f47790d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f47791e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f47792f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f47793g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f47794h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f47795i;

    /* renamed from: j, reason: collision with root package name */
    public final ao2.j0 f47796j;

    /* renamed from: k, reason: collision with root package name */
    public yq0.z f47797k;

    public g0(Context context, SearchGridMultiSectionFragment searchGridMultiSectionFragment, androidx.lifecycle.u uVar) {
        super(context);
        if (!this.f47788b) {
            this.f47788b = true;
            jb jbVar = (jb) ((h0) generatedComponent());
            oa oaVar = jbVar.f113483a;
            z0 experimentsActivator = (z0) oaVar.D0.get();
            Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
            this.f47789c = (m60.w) oaVar.f113885r0.get();
            this.f47790d = jbVar.f113485c.h6();
        }
        this.f47791e = searchGridMultiSectionFragment;
        View.inflate(getContext(), l42.d.view_search_your_boards_container, this);
        this.f47792f = (GestaltText) findViewById(l42.b.search_your_boards_title);
        this.f47794h = (GestaltText) findViewById(l42.b.search_my_pins_title);
        RecyclerView recyclerView = (RecyclerView) findViewById(l42.b.board_carousel);
        this.f47793g = recyclerView;
        this.f47795i = (LinearLayout) findViewById(l42.b.your_boards_container);
        setOrientation(1);
        recyclerView.R2(this.f47790d.f(new cr.d(11), hf0.b.f69004d));
        recyclerView.m(new eb2.k(0, 0, pk.a0.K(8, getResources()), 0));
        this.f47796j = uVar;
    }

    public final void a(boolean z13) {
        k3.R1(this.f47795i, true);
        k3.R1(this.f47793g, z13);
        this.f47792f.i(new bp.d(z13, 8));
        this.f47794h.i(new oo0.b(15));
    }

    @Override // sq0.b0
    public final void addItemVisibilityChangeListener(sq0.z zVar) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47787a == null) {
            this.f47787a = new ye2.o(this);
        }
        return this.f47787a;
    }

    @Override // sq0.b0
    public final void displayError(Throwable th3) {
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47787a == null) {
            this.f47787a = new ye2.o(this);
        }
        return this.f47787a.generatedComponent();
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF73409e1() {
        return null;
    }

    @Override // sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return hf0.b.f69004d;
    }

    @Override // sq0.b0
    public final sq0.d0 getRecyclerAdapter() {
        return this.f47797k;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getS0() {
        return a4.USER_FYP;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getQ0() {
        return d4.USER;
    }

    @Override // sq0.b0
    public final void initializeAdapter(sq0.e0 e0Var) {
        vq0.i dataSourceProvider = new vq0.i((c71.a0) e0Var);
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        ao2.j0 scope = this.f47796j;
        Intrinsics.checkNotNullParameter(scope, "scope");
        yq0.z zVar = new yq0.z(dataSourceProvider, scope, 12);
        this.f47797k = zVar;
        zVar.G(43, new lr.d(this, 2));
        this.f47793g.H2(this.f47797k);
    }

    @Override // sq0.b0
    public final void resetRecyclerScrollListener() {
    }

    @Override // sq0.b0
    public final void setLoadMoreListener(sq0.w wVar) {
    }

    @Override // yk1.r
    public final void setPinalytics(nx.d0 d0Var) {
    }

    @Override // sq0.b0
    public final void setRefreshListener(sq0.a0 a0Var) {
    }

    @Override // sq0.b0
    public final void setRefreshing(boolean z13) {
    }

    @Override // sq0.b0
    public final void setShowPaginationSpinner(boolean z13) {
    }
}
