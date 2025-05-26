package com.pinterest.feature.search.results.goldstandard.views;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.api.model.sf0;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l42.b;
import l42.d;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pq1.f;
import t61.a;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/search/results/goldstandard/views/GoldStandardImageAndTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "t61/a", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GoldStandardImageAndTextView extends ConstraintLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47644f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f47645a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIcon f47646b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47647c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47648d;

    /* renamed from: e, reason: collision with root package name */
    public a f47649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardImageAndTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_image_and_text_view, this);
        View findViewById = findViewById(b.image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47645a = (WebImageView) findViewById;
        View findViewById2 = findViewById(b.sound_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47646b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(b.title_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47647c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.duration_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47648d = (GestaltText) findViewById4;
        setPaddingRelative(0, getResources().getDimensionPixelOffset(r0.margin_quarter), 0, 0);
    }

    public final void L(sf0 sf0Var) {
        WebImageView webImageView = this.f47645a;
        webImageView.setBackgroundDrawable(null);
        webImageView.clear();
        c.X0(webImageView);
        t.O(this.f47646b);
        GestaltText gestaltText = this.f47647c;
        a0.p(gestaltText, "");
        GestaltText gestaltText2 = this.f47648d;
        a0.p(gestaltText2, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String F = a0.q0(context) ? sf0Var.F() : sf0Var.G();
        if (F != null) {
            c.U1(webImageView);
            this.f47645a.V1(F, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        String H = sf0Var.H();
        String text = H != null ? H : "";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = Color.parseColor(a0.q0(context2) ? sf0Var.C() : sf0Var.D());
        Intrinsics.checkNotNullParameter(text, "text");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor);
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
        a0.q(gestaltText, c.h2(spannableString));
        Intrinsics.checkNotNullParameter(text, "text");
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(parseColor);
        SpannableString spannableString2 = new SpannableString(text);
        spannableString2.setSpan(foregroundColorSpan2, 0, text.length(), 0);
        a0.q(gestaltText2, c.h2(spannableString2));
        boolean[] zArr = sf0Var.f41910q;
        if (zArr.length <= 8 || !zArr[8]) {
            return;
        }
        String string = getResources().getString(f.compact_minute_with_space);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText2, j1.U(string, new Object[]{sf0Var.B()}));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardImageAndTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_image_and_text_view, this);
        View findViewById = findViewById(b.image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47645a = (WebImageView) findViewById;
        View findViewById2 = findViewById(b.sound_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47646b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(b.title_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47647c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.duration_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47648d = (GestaltText) findViewById4;
        setPaddingRelative(0, getResources().getDimensionPixelOffset(r0.margin_quarter), 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardImageAndTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_image_and_text_view, this);
        View findViewById = findViewById(b.image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47645a = (WebImageView) findViewById;
        View findViewById2 = findViewById(b.sound_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47646b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(b.title_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47647c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.duration_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47648d = (GestaltText) findViewById4;
        setPaddingRelative(0, getResources().getDimensionPixelOffset(r0.margin_quarter), 0, 0);
    }
}
