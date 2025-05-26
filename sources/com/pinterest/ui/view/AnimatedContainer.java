package com.pinterest.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ck2.i;
import ha2.j;
import hb2.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import n.e;
import org.jetbrains.annotations.NotNull;
import ua2.v;
import uk2.f;
import wj2.c;
import ye2.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/ui/view/AnimatedContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AnimatedContainer extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f52663g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f52664a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f52665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52666c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52667d;

    /* renamed from: e, reason: collision with root package name */
    public int f52668e;

    /* renamed from: f, reason: collision with root package name */
    public final f f52669f;

    public /* synthetic */ AnimatedContainer(m mVar) {
        this(mVar, null);
    }

    public final void a() {
        if (this.f52667d) {
            this.f52667d = false;
            this.f52669f.c(Boolean.FALSE);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f52664a;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.f52665b;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams());
        layoutParams.height = 0;
        setLayoutParams(layoutParams);
        setAlpha(0.0f);
        this.f52667d = false;
    }

    public final void c(int i13) {
        this.f52668e = i13;
    }

    public final void d() {
        if (this.f52667d) {
            return;
        }
        this.f52667d = true;
        this.f52669f.c(Boolean.TRUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52666c = getResources().getInteger(u0.anim_speed);
        this.f52667d = true;
        getViewTreeObserver().addOnGlobalLayoutListener(new e(this, 11));
        f fVar = new f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f52669f = fVar;
        fVar.l(100L, TimeUnit.MILLISECONDS, c.a()).F(new v(11, new j(this, 11)), new v(12, b.f68536j), i.f27923c, i.f27924d);
    }
}
