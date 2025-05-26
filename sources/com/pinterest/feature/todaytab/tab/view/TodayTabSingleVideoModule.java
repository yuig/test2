package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import so.oa;
import so.w8;
import so.wa;
import we1.a2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabSingleVideoModule;", "Landroid/widget/FrameLayout;", "Lch1/b;", "Lnx/v;", "Lh32/c3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabSingleVideoModule extends FrameLayout implements ch1.b, v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48671h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48672a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f48673b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48674c;

    /* renamed from: d, reason: collision with root package name */
    public final TodayTabVideoView f48675d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48676e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f48677f;

    /* renamed from: g, reason: collision with root package name */
    public dh1.e f48678g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TodayTabSingleVideoModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48678g = eVar;
    }

    @Override // ch1.b
    public final void S5(wy0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        String t03 = dl2.b.t0(creator);
        LinearLayout linearLayout = this.f48673b;
        linearLayout.setVisibility(0);
        this.f48672a.loadUrl(t03);
        String Z2 = creator.Z2();
        if (Z2 != null) {
            linearLayout.setVisibility(0);
            a0.p(this.f48674c, Z2);
        }
    }

    @Override // ch1.b
    public final void d() {
        a0.p(this.f48676e, "");
        this.f48673b.setVisibility(8);
        a0.p(this.f48674c, "");
        this.f48672a.H2(b.f48706w);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f48675d);
    }

    @Override // ch1.b
    public final void h2(f30 pin, d4 d4Var, a4 a4Var) {
        Intrinsics.checkNotNullParameter(pin, "videoPin");
        HashMap hashMap = this.f48677f;
        g0 g0Var = g0.TODAY_ARTICLE;
        TodayTabVideoView todayTabVideoView = this.f48675d;
        todayTabVideoView.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        wk2.a aVar = todayTabVideoView.f48688c;
        if (aVar == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        w8 w8Var = ((wa) aVar.get()).f114694a;
        uk1.e eVar = (uk1.e) w8Var.f114689b.f113702ga.get();
        oa oaVar = w8Var.f114689b;
        dh1.g gVar = new dh1.g(eVar, (uj2.q) oaVar.f113947u9.get(), (pb0.a) oaVar.f113834o1.get(), (d1) oaVar.f113730i2.get(), (ur.a) oaVar.Kb.get(), g0Var, hashMap);
        yk1.j.a().d(todayTabVideoView, gVar);
        gVar.f55014g = pin;
        gVar.f55015h = 0;
        bc2.q videoTracks = dl2.b.S0(pin, null);
        PinterestVideoView pinterestVideoView = todayTabVideoView.f48689d;
        if (videoTracks != null) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            oc2.i.g(pinterestVideoView, new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), null, 6);
        }
        pinterestVideoView.K0.V1(bs1.c.y0(pin), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48678g;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48678g;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48676e, text);
    }

    @Override // ch1.b
    public final void p2(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f48677f = auxData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabSingleVideoModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.single_video_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.single_video_module_creator_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48672a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(o92.b.single_video_module_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48673b = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(o92.b.single_video_module_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48674c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(o92.b.single_video_module_video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48675d = (TodayTabVideoView) findViewById4;
        View findViewById5 = findViewById(o92.b.single_video_module_title);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48676e = (GestaltText) findViewById5;
        setOnClickListener(new a2(this, 15));
    }
}
