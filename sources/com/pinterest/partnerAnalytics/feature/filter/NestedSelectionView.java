package com.pinterest.partnerAnalytics.feature.filter;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.w;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import px1.e;
import px1.q;
import px1.v;
import px1.y;
import so.jb;
import sp2.k;
import ye2.o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/filter/NestedSelectionView;", "Landroid/widget/LinearLayout;", "Lm60/t;", "Lpx1/v;", "event", "", "onMessageEvent", "(Lpx1/v;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NestedSelectionView extends LinearLayout implements t, c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f50192h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f50193a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50194b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f50195c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50196d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50197e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f50198f;

    /* renamed from: g, reason: collision with root package name */
    public final w f50199g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedSelectionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f50193a == null) {
            this.f50193a = new o(this);
        }
        return this.f50193a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f50193a == null) {
            this.f50193a = new o(this);
        }
        return this.f50193a.generatedComponent();
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(v event) {
        String str;
        q qVar;
        q qVar2;
        if (event == null || (qVar2 = event.f101702a) == null || (str = qVar2.f101682b) == null) {
            str = "";
        }
        a0.p(this.f50196d, str);
        if (event != null && (qVar = event.f101702a) != null) {
            this.f50198f.invoke(qVar);
        }
        w wVar = this.f50199g;
        if (wVar != null) {
            wVar.j(this);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedSelectionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f50194b) {
            this.f50194b = true;
            this.f50199g = (w) ((jb) ((y) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f50198f = e.f101646y;
        View.inflate(context, com.pinterest.partnerAnalytics.e.nested_selection_view, this);
        View findViewById = findViewById(d.container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50195c = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(d.tvSelectionTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50197e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.tvSelectionOption);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50196d = (GestaltText) findViewById3;
    }
}
