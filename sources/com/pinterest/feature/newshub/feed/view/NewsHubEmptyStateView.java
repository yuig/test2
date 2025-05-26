package com.pinterest.feature.newshub.feed.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.a;
import nx.f0;
import nx.j0;
import nx.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rx0.b;
import so.jb;
import ye2.o;
import zu1.d;
import zu1.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/newshub/feed/view/NewsHubEmptyStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnx/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubEmptyStateView extends ConstraintLayout implements a, c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f46792h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f46793a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46794b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f46795c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f46796d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f46797e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f46798f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f46799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubEmptyStateView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        View.inflate(getContext(), d.view_newshub_empty_state, this);
        f0 f0Var = this.f46795c;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        this.f46796d = ((m) f0Var).a(this);
        View findViewById = findViewById(zu1.c.empty_state_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46797e = (GestaltButton) findViewById;
        View findViewById2 = findViewById(zu1.c.empty_state_primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46798f = (GestaltText) findViewById2;
        View findViewById3 = findViewById(zu1.c.empty_state_secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46799g = (GestaltText) findViewById3;
    }

    public final void L(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f46797e.d(b.f110178j).e(new lq0.o(10, this, listener));
    }

    public final void T(w12.a newsType) {
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        w12.a aVar = w12.a.None;
        GestaltButton gestaltButton = this.f46797e;
        GestaltText gestaltText = this.f46799g;
        GestaltText gestaltText2 = this.f46798f;
        if (newsType == aVar) {
            a0.o(gestaltText2, e.news_hub_empty_state_primary_text_no_filter, new Object[0]);
            a0.o(gestaltText, e.news_hub_empty_state_secondary_text_no_filter, new Object[0]);
            a0.l0(gestaltButton);
        } else {
            a0.o(gestaltText2, e.news_hub_empty_state_primary_text, new Object[0]);
            a0.o(gestaltText, e.news_hub_empty_state_secondary_text, new Object[0]);
            a0.v1(gestaltButton);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46793a == null) {
            this.f46793a = new o(this);
        }
        return this.f46793a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.NEWS_HUB, a4.NEWS_HUB_FEED, null, g0.NOTIFICATION_FILTERS_EMPTY_STATE, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46793a == null) {
            this.f46793a = new o(this);
        }
        return this.f46793a.generatedComponent();
    }

    public final void inject() {
        if (this.f46794b) {
            return;
        }
        this.f46794b = true;
        g3.s1(this, (f0) ((jb) ((rx0.c) generatedComponent())).f113483a.f113747j2.get());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        j0 j0Var = this.f46796d;
        j0Var.getClass();
        j0Var.z(null);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f46796d.onDestroy();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        View.inflate(getContext(), d.view_newshub_empty_state, this);
        f0 f0Var = this.f46795c;
        if (f0Var != null) {
            this.f46796d = ((m) f0Var).a(this);
            View findViewById = findViewById(zu1.c.empty_state_button);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.f46797e = (GestaltButton) findViewById;
            View findViewById2 = findViewById(zu1.c.empty_state_primary_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f46798f = (GestaltText) findViewById2;
            View findViewById3 = findViewById(zu1.c.empty_state_secondary_text);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            this.f46799g = (GestaltText) findViewById3;
            return;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        View.inflate(getContext(), d.view_newshub_empty_state, this);
        f0 f0Var = this.f46795c;
        if (f0Var != null) {
            this.f46796d = ((m) f0Var).a(this);
            View findViewById = findViewById(zu1.c.empty_state_button);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.f46797e = (GestaltButton) findViewById;
            View findViewById2 = findViewById(zu1.c.empty_state_primary_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f46798f = (GestaltText) findViewById2;
            View findViewById3 = findViewById(zu1.c.empty_state_secondary_text);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            this.f46799g = (GestaltText) findViewById3;
            return;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }
}
