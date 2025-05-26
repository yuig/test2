package com.pinterest.feature.todaytab.tab.view;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.a2;
import ni1.d0;
import ni1.o2;
import ni1.t2;
import qa2.j0;
import uq.w;
import xk2.v;

/* loaded from: classes5.dex */
public final class e extends w {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f48714o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48715d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatar f48716e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f48717f;

    /* renamed from: g, reason: collision with root package name */
    public f30 f48718g;

    /* renamed from: h, reason: collision with root package name */
    public final wa2.m f48719h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f48720i;

    /* renamed from: j, reason: collision with root package name */
    public t2 f48721j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f48722k;

    /* renamed from: l, reason: collision with root package name */
    public final v f48723l;

    /* renamed from: m, reason: collision with root package name */
    public final SbaPinRep f48724m;

    /* renamed from: n, reason: collision with root package name */
    public final o2 f48725n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity context, ao2.j0 scope, nx.d0 pinalytics, boolean z13) {
        super(context, 28);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f48715d = z13;
        wa2.m a13 = a2.a();
        this.f48719h = a13;
        this.f48723l = xk2.m.b(new p91.v(21, this, pinalytics));
        View.inflate(context, hz1.b.portal_story_pin_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(hz1.a.portal_story_pin_view_cell);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        View findViewById2 = findViewById(hz1.a.portal_story_pin_view_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById2;
        this.f48716e = gestaltAvatar;
        gestaltAvatar.H2(b.f48694k);
        j0 j0Var = this.f48720i;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        t2 t2Var = this.f48721j;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, a13, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f48724m = sbaPinRep;
        this.f48725n = o2Var;
        sbaPinRep.addToView(frameLayout);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f48717f != null;
    }
}
