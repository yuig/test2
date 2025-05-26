package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qf1.z;
import we1.a2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabHeroModule;", "Landroid/widget/FrameLayout;", "Lch1/b;", "Lnx/v;", "Lh32/c3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabHeroModule extends FrameLayout implements ch1.b, v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48653f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48654a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48655b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48656c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatarGroup f48657d;

    /* renamed from: e, reason: collision with root package name */
    public dh1.e f48658e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TodayTabHeroModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ch1.b
    public final void A6(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f48654a.loadUrl((String) imageUrls.get(0));
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48658e = eVar;
    }

    @Override // ch1.b
    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f48655b.i(new z(text, 17));
    }

    @Override // ch1.b
    public final void d() {
        a0.p(this.f48656c, "");
        this.f48655b.i(b.f48702s);
        this.f48657d.setVisibility(8);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48658e;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48658e;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48656c, text);
    }

    @Override // ch1.b
    public final void v(List avatarList) {
        Intrinsics.checkNotNullParameter(avatarList, "avatarList");
        this.f48657d.a(new w1.g(avatarList, 23));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabHeroModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.hero_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.usecase_module_hero_constraint_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(o92.b.usecase_hero_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48654a = (WebImageView) findViewById2;
        Intrinsics.checkNotNullExpressionValue(findViewById(o92.b.usecase_module_hero_image_overlay), "findViewById(...)");
        View findViewById3 = findViewById(o92.b.usecase_module_hero_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48655b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(o92.b.usecase_module_hero_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48656c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(o92.b.usecase_module_hero_text_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(o92.b.usecase_module_hero_see_more_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        View findViewById7 = findViewById(o92.b.usecase_module_facepile);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48657d = (GestaltAvatarGroup) findViewById7;
        setOnClickListener(new a2(this, 12));
    }
}
