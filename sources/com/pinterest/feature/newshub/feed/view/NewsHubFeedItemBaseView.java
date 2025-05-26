package com.pinterest.feature.newshub.feed.view;

import af2.c;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.makeramen.RoundedImageView;
import com.pinterest.feature.newshub.view.content.NewsHubHeaderIconContainerView;
import com.pinterest.feature.newshub.view.content.NewsHubImpressionContainer;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import eo1.f;
import java.util.Date;
import java.util.Map;
import jc0.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.h2;
import lp.k;
import m60.w;
import mx0.b;
import nu1.a;
import org.jetbrains.annotations.NotNull;
import pb0.d;
import rx0.h;
import so.jb;
import so.oa;
import so.s8;
import ux0.e;
import x02.w1;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/newshub/feed/view/NewsHubFeedItemBaseView;", "Lcom/pinterest/feature/newshub/view/content/NewsHubImpressionContainer;", "Lmx0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class NewsHubFeedItemBaseView extends NewsHubImpressionContainer implements b, c {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f46800q = 0;

    /* renamed from: b, reason: collision with root package name */
    public o f46801b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46802c;

    /* renamed from: d, reason: collision with root package name */
    public a f46803d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f46804e;

    /* renamed from: f, reason: collision with root package name */
    public h2 f46805f;

    /* renamed from: g, reason: collision with root package name */
    public w f46806g;

    /* renamed from: h, reason: collision with root package name */
    public d f46807h;

    /* renamed from: i, reason: collision with root package name */
    public mx0.a f46808i;

    /* renamed from: j, reason: collision with root package name */
    public e f46809j;

    /* renamed from: k, reason: collision with root package name */
    public View f46810k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltText f46811l;

    /* renamed from: m, reason: collision with root package name */
    public NewsHubHeaderIconContainerView f46812m;

    /* renamed from: n, reason: collision with root package name */
    public View f46813n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltIconButton f46814o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubFeedItemBaseView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        this.f46815p = true;
    }

    @Override // mx0.b
    public void I1(String textCacheKey, String headerText, Map textMappings, Date date) {
        SpannableString spannableString;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(textCacheKey, "textCacheKey");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(textMappings, "textMappings");
        e eVar = this.f46809j;
        if (eVar == null) {
            Intrinsics.r("textInteractor");
            throw null;
        }
        SpannableString spannableString2 = new SpannableString(eVar.a(textCacheKey, headerText, textMappings));
        spannableString2.setSpan(new TextAppearanceSpan(getContext(), f.LegoText_WithPadding_Size200), 0, spannableString2.length(), 33);
        if (date != null) {
            e eVar2 = this.f46809j;
            if (eVar2 == null) {
                Intrinsics.r("textInteractor");
                throw null;
            }
            spannableString = new SpannableString(eVar2.b(date, pb0.b.STYLE_COMPACT));
        } else {
            spannableString = new SpannableString("");
        }
        spannableString.setSpan(new TextAppearanceSpan(getContext(), av1.e.lego_news_hub_time_since_text), 0, spannableString.length(), 33);
        CharSequence concat = TextUtils.concat(spannableString2, " ", spannableString);
        if (date != null) {
            e eVar3 = this.f46809j;
            if (eVar3 == null) {
                Intrinsics.r("textInteractor");
                throw null;
            }
            charSequence = eVar3.b(date, pb0.b.STYLE_NORMAL);
        } else {
            charSequence = null;
        }
        GestaltText gestaltText = this.f46811l;
        if (gestaltText == null) {
            Intrinsics.r("headerTextView");
            throw null;
        }
        gestaltText.i(new rx0.f(concat, spannableString2, charSequence));
        View view = this.f46810k;
        if (view != null) {
            view.setContentDescription(concat);
        } else {
            Intrinsics.r("contentView");
            throw null;
        }
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        a().d(new v(new k(configuration), false, 0L, 30));
    }

    public final w a() {
        w wVar = this.f46806g;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final void b() {
        if (this.f46802c) {
            return;
        }
        this.f46802c = true;
        jb jbVar = (jb) ((h) generatedComponent());
        s8 s8Var = jbVar.f113485c;
        this.f46803d = (a) s8Var.f114462r.get();
        oa oaVar = jbVar.f113483a;
        this.f46804e = (w1) oaVar.Te.get();
        this.f46805f = s8Var.c6();
        this.f46806g = (w) oaVar.f113885r0.get();
        this.f46807h = oaVar.j2();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46801b == null) {
            this.f46801b = new o(this);
        }
        return this.f46801b;
    }

    public final void e(String url, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = this.f46812m;
        if (newsHubHeaderIconContainerView == null) {
            Intrinsics.r("headerIconContainerView");
            throw null;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        ProportionalImageView proportionalImageView = newsHubHeaderIconContainerView.f46828b;
        if (z13) {
            proportionalImageView.i2(true);
        } else {
            proportionalImageView.i2(false);
            proportionalImageView.U1(av1.a.news_hub_corner_radius);
        }
        boolean h10 = z.h(url, "gif", false);
        RoundedImageView roundedImageView = newsHubHeaderIconContainerView.f46827a;
        LottieAnimationView lottieAnimationView = newsHubHeaderIconContainerView.f46829c;
        if (h10) {
            bs1.c.R1(proportionalImageView, false);
            bs1.c.R1(roundedImageView, true);
            bs1.c.R1(lottieAnimationView, false);
            roundedImageView.U1(av1.a.news_hub_corner_radius);
            com.bumptech.glide.b.f(newsHubHeaderIconContainerView.getContext()).d().K(url).a(new de.h().b()).G(roundedImageView);
        } else if (z.h(url, "json", false)) {
            bs1.c.R1(proportionalImageView, false);
            bs1.c.R1(roundedImageView, false);
            bs1.c.R1(lottieAnimationView, true);
            lottieAnimationView.s2(url);
            lottieAnimationView.k2();
        } else {
            bs1.c.R1(proportionalImageView, true);
            bs1.c.R1(roundedImageView, false);
            bs1.c.R1(lottieAnimationView, false);
            proportionalImageView.loadUrl(url);
        }
        bs1.c.R1(newsHubHeaderIconContainerView.f46830d, false);
        bs1.c.R1(newsHubHeaderIconContainerView.f46831e, false);
    }

    @Override // mx0.b
    public void e0(boolean z13) {
        View view = this.f46813n;
        if (view != null) {
            bs1.c.R1(view, z13);
        }
    }

    public final void g() {
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = this.f46812m;
        if (newsHubHeaderIconContainerView != null) {
            bs1.c.R1(newsHubHeaderIconContainerView, true);
        } else {
            Intrinsics.r("headerIconContainerView");
            throw null;
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46801b == null) {
            this.f46801b = new o(this);
        }
        return this.f46801b.generatedComponent();
    }

    @Override // mx0.b
    public void m2(boolean z13) {
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubFeedItemBaseView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        this.f46815p = true;
    }
}
