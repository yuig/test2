package b11;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20978e = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f20979a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20980b;

    /* renamed from: c, reason: collision with root package name */
    public float f20981c;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f20982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i13, Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20979a = i13;
        this.f20980b = 300L;
        this.f20981c = i13 == 3 ? 1.0f : 0.0f;
    }

    public static void d(d dVar) {
        if (dVar.a()) {
            dVar.b(false, true);
        } else {
            dVar.b(true, true);
        }
    }

    public final boolean a() {
        int i13 = this.f20979a;
        return i13 == 2 || i13 == 3;
    }

    public final void b(boolean z13, boolean z14) {
        if (z13 == a()) {
            return;
        }
        if (!z14) {
            c(z13 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimator = this.f20982d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20982d = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f20981c, z13 ? 1.0f : 0.0f);
        ofFloat.setInterpolator(new q6.b());
        ofFloat.setDuration(ofFloat.getDuration());
        ofFloat.addUpdateListener(new androidx.media3.ui.c(this, 12));
        ofFloat.addListener(new c(this, z13 ? 1 : 0));
        ofFloat.start();
        this.f20982d = ofFloat;
    }

    public final void c(float f13) {
        float f14 = this.f20981c;
        if (f14 == f13) {
            return;
        }
        float f15 = f13 - f14;
        if (f13 == 0.0f) {
            this.f20979a = 0;
        } else if (f13 == 1.0f) {
            this.f20979a = 3;
        } else if (f15 < 0.0f) {
            this.f20979a = 1;
        } else if (f15 > 0.0f) {
            this.f20979a = 2;
        }
        setVisibility(this.f20979a == 0 ? 8 : 0);
        this.f20981c = f13;
        requestLayout();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f20982d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int measuredHeight = getMeasuredHeight();
        setVisibility((this.f20981c == 0.0f && measuredHeight == 0) ? 8 : 0);
        setMeasuredDimension(getMeasuredWidth(), measuredHeight - (measuredHeight - ml2.c.c(measuredHeight * this.f20981c)));
    }
}
