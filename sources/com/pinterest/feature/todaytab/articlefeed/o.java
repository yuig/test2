package com.pinterest.feature.todaytab.articlefeed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.u;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import nx.v;
import uj2.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class o extends LinearLayout implements yk1.d, v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f48637m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f48638a;

    /* renamed from: b, reason: collision with root package name */
    public final yk1.j f48639b;

    /* renamed from: c, reason: collision with root package name */
    public final n70.o f48640c;

    /* renamed from: d, reason: collision with root package name */
    public final q f48641d;

    /* renamed from: e, reason: collision with root package name */
    public final w f48642e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f48643f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f48644g;

    /* renamed from: h, reason: collision with root package name */
    public wy0 f48645h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f48646i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f48647j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f48648k;

    /* renamed from: l, reason: collision with root package name */
    public final yg1.d f48649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, u scope, yk1.j mvpBinder, n70.o todayTabArticleFeedPinalytics, q networkStateStream, w eventManager, x2 userRepository) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(todayTabArticleFeedPinalytics, "todayTabArticleFeedPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f48638a = scope;
        this.f48639b = mvpBinder;
        this.f48640c = todayTabArticleFeedPinalytics;
        this.f48641d = networkStateStream;
        this.f48642e = eventManager;
        this.f48643f = userRepository;
        this.f48644g = new ArrayList();
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_medium);
        gestaltText.setPaddingRelative(dimensionPixelOffset, gestaltText.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_vertical_xlarge), dimensionPixelOffset, 0);
        GestaltText i13 = gestaltText.i(i.f48623q);
        this.f48646i = i13;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        int dimensionPixelOffset2 = gestaltText2.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_medium);
        int dimensionPixelOffset3 = gestaltText2.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_vertical_medium);
        gestaltText2.setLineSpacing(0.0f, 1.5f);
        gestaltText2.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset2, 0);
        GestaltText i14 = gestaltText2.i(i.f48622p);
        this.f48647j = i14;
        FrameLayout frameLayout = new FrameLayout(context);
        int dimensionPixelOffset4 = frameLayout.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_small);
        frameLayout.setPaddingRelative(dimensionPixelOffset4, frameLayout.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_large), dimensionPixelOffset4, 0);
        frameLayout.setVisibility(8);
        frameLayout.setClipToPadding(false);
        this.f48648k = frameLayout;
        yg1.d dVar = new yg1.d(context, g0.TODAY_ARTICLE_SECTION_FOLLOWING_MODULE);
        int dimensionPixelOffset5 = dVar.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_medium);
        dVar.setPaddingRelative(dimensionPixelOffset5, dVar.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_vertical_medium), dimensionPixelOffset5, 0);
        dVar.setVisibility(8);
        this.f48649l = dVar;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(i13);
        addView(i14);
        addView(dVar);
        addView(frameLayout);
    }

    public final zg1.c a(f30 f30Var, zg1.a aVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d0 d0Var = this.f48640c.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        zg1.c cVar = new zg1.c(context, f30Var, aVar, d0Var, this.f48641d);
        this.f48644g.add(cVar);
        return cVar;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return this.f48644g;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }
}
