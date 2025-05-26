package hb2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.r0;
import m60.s0;
import m60.u0;
import m60.x0;
import q5.b1;

/* loaded from: classes4.dex */
public final class t extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f68606m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f68607a;

    /* renamed from: b, reason: collision with root package name */
    public final View f68608b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f68609c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f68610d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f68611e;

    /* renamed from: f, reason: collision with root package name */
    public ValueAnimator f68612f;

    /* renamed from: g, reason: collision with root package name */
    public ValueAnimator f68613g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68614h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68615i;

    /* renamed from: j, reason: collision with root package name */
    public final int f68616j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f68617k;

    /* renamed from: l, reason: collision with root package name */
    public final long f68618l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, View container) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f68607a = container;
        int i13 = q0.offline_indicator_background_offline;
        Object obj = d5.a.f53679a;
        this.f68614h = context.getColor(i13);
        int color = context.getColor(q0.offline_indicator_background_online);
        this.f68615i = color;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.offline_indicator_min_height);
        this.f68616j = dimensionPixelSize;
        this.f68618l = getResources().getInteger(u0.anim_speed);
        View.inflate(context, tr.c.layout_offline_indicator, this);
        View findViewById = findViewById(tr.b.offline_status_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f68608b = findViewById;
        View findViewById2 = findViewById(tr.b.offline_status_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f68609c = gestaltText;
        View findViewById3 = findViewById(tr.b.offline_status_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f68610d = (ImageView) findViewById3;
        findViewById.setBackgroundColor(color);
        gestaltText.measure(0, 0);
        this.f68616j = Math.max(gestaltText.getMeasuredHeight() + gestaltText.getLineHeight(), dimensionPixelSize);
    }

    public final void a(long j13, boolean z13) {
        final int i13 = 1;
        int i14 = this.f68616j;
        final int i15 = 0;
        int i16 = z13 ? 0 : i14;
        if (!z13) {
            i14 = 0;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i16, i14);
        this.f68612f = ofInt;
        long j14 = this.f68618l;
        if (ofInt != null) {
            ofInt.setDuration(j14);
            ofInt.setStartDelay(j13);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hb2.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f68605b;

                {
                    this.f68605b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator anim) {
                    int i17 = i15;
                    t this$0 = this.f68605b;
                    switch (i17) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(anim, "anim");
                            Object animatedValue = anim.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) animatedValue).intValue();
                            this$0.getClass();
                            View view = this$0.f68607a;
                            androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(view.getLayoutParams());
                            ((ViewGroup.MarginLayoutParams) cVar).topMargin = intValue;
                            view.setLayoutParams(cVar);
                            View view2 = this$0.f68608b;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view2.getLayoutParams());
                            layoutParams.height = intValue;
                            view2.setLayoutParams(layoutParams);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(anim, "anim");
                            Object animatedValue2 = anim.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            float floatValue = ((Float) animatedValue2).floatValue();
                            this$0.f68609c.setAlpha(floatValue);
                            this$0.f68610d.setAlpha(floatValue);
                            break;
                    }
                }
            });
            ofInt.start();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z13 ? 0.0f : 1.0f, z13 ? 1.0f : 0.0f);
        this.f68613g = ofFloat;
        if (ofFloat != null) {
            long j15 = j14 / 2;
            ofFloat.setDuration(j15);
            if (!z13) {
                j15 = 0;
            }
            ofFloat.setStartDelay(j13 + j15);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hb2.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f68605b;

                {
                    this.f68605b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator anim) {
                    int i17 = i13;
                    t this$0 = this.f68605b;
                    switch (i17) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(anim, "anim");
                            Object animatedValue = anim.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) animatedValue).intValue();
                            this$0.getClass();
                            View view = this$0.f68607a;
                            androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(view.getLayoutParams());
                            ((ViewGroup.MarginLayoutParams) cVar).topMargin = intValue;
                            view.setLayoutParams(cVar);
                            View view2 = this$0.f68608b;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view2.getLayoutParams());
                            layoutParams.height = intValue;
                            view2.setLayoutParams(layoutParams);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(anim, "anim");
                            Object animatedValue2 = anim.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            float floatValue = ((Float) animatedValue2).floatValue();
                            this$0.f68609c.setAlpha(floatValue);
                            this$0.f68610d.setAlpha(floatValue);
                            break;
                    }
                }
            });
            ofFloat.start();
        }
    }

    public final void b() {
        if (this.f68617k) {
            this.f68617k = false;
            ValueAnimator valueAnimator = this.f68611e;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator valueAnimator2 = this.f68612f;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            ValueAnimator valueAnimator3 = this.f68613g;
            if (valueAnimator3 != null) {
                valueAnimator3.end();
            }
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            ValueAnimator ofArgb = ValueAnimator.ofArgb(this.f68614h, this.f68615i);
            this.f68611e = ofArgb;
            if (ofArgb != null) {
                ofArgb.setDuration(getResources().getInteger(u0.anim_speed_fastest));
                ofArgb.addUpdateListener(new b1(6, this, f0Var));
                ofArgb.addListener(new ir.b(this, 13));
                this.f68611e = ofArgb;
                ofArgb.start();
            }
        }
    }

    public final void c() {
        if (this.f68617k) {
            return;
        }
        this.f68617k = true;
        ValueAnimator valueAnimator = this.f68611e;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.f68612f;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        ValueAnimator valueAnimator3 = this.f68613g;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
        this.f68608b.setBackgroundColor(this.f68614h);
        this.f68610d.setImageResource(s0.ic_offline_indicator_nonpds);
        pk.a0.q(this.f68609c, bs1.c.j2(new String[0], x0.offline_indicator));
        a(0L, true);
    }
}
