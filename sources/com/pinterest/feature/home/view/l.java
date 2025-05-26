package com.pinterest.feature.home.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import xk2.v;

/* loaded from: classes5.dex */
public abstract class l extends FrameLayout implements m, ky.h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45873i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f45874a;

    /* renamed from: b, reason: collision with root package name */
    public final CardView f45875b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f45876c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f45877d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f45878e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f45879f;

    /* renamed from: g, reason: collision with root package name */
    public final e f45880g;

    /* renamed from: h, reason: collision with root package name */
    public f f45881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, d0 pinalytics, j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f45874a = xk2.m.b(i.f45867i);
        View.inflate(context, hz1.b.idea_stream_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(hz1.a.usecase_module_idea_stream_card_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45875b = (CardView) findViewById;
        View findViewById2 = findViewById(hz1.a.usecase_module_idea_stream_constraint_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45876c = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(hz1.a.usecase_module_idea_stream_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45877d = (GestaltText) findViewById3;
        View findViewById4 = findViewById(hz1.a.usecase_module_idea_stream_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45878e = (GestaltText) findViewById4;
        View findViewById5 = findViewById(hz1.a.usecase_module_idea_stream_images_rv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f45879f = recyclerView;
        recyclerView.R2(new PinterestLinearLayoutManager(new cp.b(this, 18), 0, false));
        int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(r0.margin_three_quarter);
        f fVar = new f(dimensionPixelOffset, recyclerView.getResources().getDimensionPixelOffset(r0.margin_half), dimensionPixelOffset, 0);
        this.f45881h = fVar;
        recyclerView.m(fVar);
        e eVar = new e(scope, pinalytics, new h(this, 0));
        this.f45880g = eVar;
        recyclerView.H2(eVar);
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
