package com.pinterest.activity.newshub.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import gq.a;
import gq.d;
import gq.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kx0.v;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/activity/newshub/view/header/NewsHubSectionHeader;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NewsHubSectionHeader extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f34975a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f34976b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34977c;

    /* renamed from: d, reason: collision with root package name */
    public final NewsHubHeaderView f34978d;

    /* renamed from: e, reason: collision with root package name */
    public final NewsHubHeaderView f34979e;

    /* renamed from: f, reason: collision with root package name */
    public View f34980f;

    /* renamed from: g, reason: collision with root package name */
    public View f34981g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubSectionHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(v bind) {
        Intrinsics.checkNotNullParameter(bind, "bind");
        View view = this.f34980f;
        if (view instanceof NewsHubHeaderView) {
            Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.activity.newshub.view.header.NewsHubHeaderView");
            NewsHubHeaderView newsHubHeaderView = (NewsHubHeaderView) view;
            NewsHubMultiUserAvatar _multiUserAvatar = newsHubHeaderView.f34969c;
            Intrinsics.checkNotNullExpressionValue(_multiUserAvatar, "_multiUserAvatar");
            GestaltText _descriptionTv = newsHubHeaderView.f34970d;
            Intrinsics.checkNotNullExpressionValue(_descriptionTv, "_descriptionTv");
            bind.invoke(_multiUserAvatar, _descriptionTv);
        }
    }

    /* renamed from: b, reason: from getter */
    public final GestaltText getF34976b() {
        return this.f34976b;
    }

    /* renamed from: c, reason: from getter */
    public final GestaltText getF34975a() {
        return this.f34975a;
    }

    public final void d(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        a0.q(this.f34975a, c.p2(newText));
    }

    public final void e(boolean z13) {
        int i13 = z13 ? 1 : -1;
        View view = this.f34981g;
        View view2 = this.f34980f;
        float translationY = view.getTranslationY();
        ViewPropertyAnimator animate = this.f34981g.animate();
        float f13 = -i13;
        float f14 = this.f34977c;
        animate.translationYBy(f13 * f14).alpha(0.0f).setListener(new d(view, translationY, i13, this));
        this.f34980f.setTranslationY(i13 * f14);
        this.f34980f.animate().translationYBy(f13 * f14).alpha(1.0f).setListener(new e(view2, 0));
        this.f34981g.setTranslationY(0.0f);
        this.f34981g = this.f34980f;
    }

    public /* synthetic */ NewsHubSectionHeader(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubSectionHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f65964o);
        b.y2(gestaltText);
        this.f34975a = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(a.f65963n);
        b.y2(gestaltText2);
        this.f34976b = gestaltText2;
        Intrinsics.checkNotNullExpressionValue(getResources(), "getResources(...)");
        this.f34977c = a0.K(12, r12);
        setGravity(16);
        int i14 = av1.d.news_hub_detail_item_transition_header_lego;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        addView(gestaltText, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(gestaltText2, layoutParams2);
        gestaltText.i(a.f65961l);
        gestaltText2.i(a.f65962m);
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(i14, (ViewGroup) this, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.activity.newshub.view.header.NewsHubHeaderView");
        NewsHubHeaderView newsHubHeaderView = (NewsHubHeaderView) inflate;
        this.f34978d = newsHubHeaderView;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15, -1);
        layoutParams3.setMarginEnd(getResources().getDimensionPixelSize(r0.margin_half));
        addView(newsHubHeaderView, layoutParams3);
        newsHubHeaderView.setAlpha(0.0f);
        newsHubHeaderView.setVisibility(4);
        View inflate2 = from.inflate(i14, (ViewGroup) this, false);
        Intrinsics.g(inflate2, "null cannot be cast to non-null type com.pinterest.activity.newshub.view.header.NewsHubHeaderView");
        NewsHubHeaderView newsHubHeaderView2 = (NewsHubHeaderView) inflate2;
        this.f34979e = newsHubHeaderView2;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.setMarginEnd(getResources().getDimensionPixelSize(r0.margin_half));
        addView(newsHubHeaderView2, layoutParams4);
        newsHubHeaderView2.setAlpha(0.0f);
        newsHubHeaderView2.setVisibility(4);
        this.f34980f = newsHubHeaderView;
        this.f34981g = gestaltText;
    }
}
