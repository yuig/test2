package com.pinterest.feature.search.results.hairpattern.view;

import ac2.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import b60.b;
import bk.f;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import dc2.g;
import h32.g0;
import hc2.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import lu.a0;
import m42.c;
import m42.d;
import m60.v0;
import m7.l0;
import nc2.j;
import org.jetbrains.annotations.NotNull;
import x61.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/results/hairpattern/view/HairPatternEducationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kg/p", "searchResultsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HairPatternEducationView extends a0 {

    /* renamed from: h, reason: collision with root package name */
    public static final List f47651h;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f47652d;

    /* renamed from: e, reason: collision with root package name */
    public NestedScrollView f47653e;

    /* renamed from: f, reason: collision with root package name */
    public PinterestVideoView f47654f;

    /* renamed from: g, reason: collision with root package name */
    public b f47655g;

    static {
        v61.b bVar = v61.b.f124216e;
        f47651h = f0.j(v61.b.f124220i, v61.b.f124219h, v61.b.f124218g, v61.b.f124217f, v61.b.f124216e, v61.b.f124221j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HairPatternEducationView(Context context) {
        super(context, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        j();
    }

    public final NestedScrollView g() {
        NestedScrollView nestedScrollView = this.f47653e;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.r("scrollView");
        throw null;
    }

    public final PinterestVideoView i() {
        PinterestVideoView pinterestVideoView = this.f47654f;
        if (pinterestVideoView != null) {
            return pinterestVideoView;
        }
        Intrinsics.r("videoView");
        throw null;
    }

    public final void j() {
        View.inflate(getContext(), d.hair_pattern_education, this);
        View findViewById = findViewById(c.hair_pattern_scroll_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<set-?>");
        this.f47653e = nestedScrollView;
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(c.dismiss_button);
        gestaltIconButton.u(new p(this, 12));
        Object parent = gestaltIconButton.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.post(new a11.p(5, gestaltIconButton, view));
        }
        Integer[] numArr = PinterestVideoView.f52749c1;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PinterestVideoView z13 = f.z(context, null, v0.video_view_simple_with_mute, 10);
        z13.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        z13.D0 = g0.HAIR_PATTERN_FILTERS;
        z13.z(4);
        z13.g0(j.AUTOPLAY_ALWAYS);
        z13.O(false);
        int i13 = 1;
        z13.R = true;
        z13.R(true);
        z13.K0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        z13.K0.V1("https://i.pinimg.com/originals/f1/e8/ab/f1e8abfe1f1e245ccb00d99518e57988.png", (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        z13.setOnClickListener(new e(z13, 0));
        z13.u0(new e1(z13, 3));
        ((GestaltIcon) z13.findViewById(a1.player_mute)).g2(x61.b.f133931m);
        Intrinsics.checkNotNullParameter(z13, "<set-?>");
        this.f47654f = z13;
        ((ViewGroup) findViewById(c.video_container)).addView(i());
        Context context2 = getContext();
        Boolean valueOf = context2 != null ? Boolean.valueOf(pk.a0.q0(context2)) : null;
        View findViewById2 = findViewById(c.patterns_container);
        Intrinsics.g(findViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        for (v61.b bVar : f47651h) {
            int i14 = Intrinsics.d(bVar, v61.b.f124221j) ? m42.e.hair_pattern_bald_alt : bVar.f124222a;
            String str = Intrinsics.d(valueOf, Boolean.TRUE) ? bVar.f124225d : bVar.f124224c;
            int i15 = bVar.f124223b;
            View inflate = LayoutInflater.from(getContext()).inflate(d.hair_pattern_education_item, viewGroup, false);
            ProportionalImageView proportionalImageView = (ProportionalImageView) inflate.findViewById(c.image);
            proportionalImageView.loadUrl(str);
            proportionalImageView.f52576J = 0.78933334f;
            View findViewById3 = inflate.findViewById(c.header);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            Context context3 = inflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            pk.a0.p((GestaltText) findViewById3, bs1.c.d2(context3, i14));
            View findViewById4 = inflate.findViewById(c.description);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            Context context4 = inflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            pk.a0.p((GestaltText) findViewById4, bs1.c.d2(context4, i15));
            viewGroup.addView(inflate);
        }
        g().setOnScrollChangeListener(new b31.c(this, i13));
    }

    public final void k() {
        PinterestVideoView i13 = i();
        Intrinsics.checkNotNullParameter("stop", "msg");
        i13.W(false);
        m mVar = i13.Q;
        if (mVar != null) {
            ((l0) ((g) mVar).f54407a).stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HairPatternEducationView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HairPatternEducationView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 8, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        j();
    }
}
