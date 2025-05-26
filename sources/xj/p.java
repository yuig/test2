package xj;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.appcompat.app.j0;
import androidx.appcompat.widget.v2;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class p extends j0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f135141k = {533, 567, 850, 750};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f135142l = {1267, 1000, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    public static final v2 f135143m = new v2(19, Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f135144c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f135145d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f135146e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f135147f;

    /* renamed from: g, reason: collision with root package name */
    public int f135148g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f135149h;

    /* renamed from: i, reason: collision with root package name */
    public float f135150i;

    /* renamed from: j, reason: collision with root package name */
    public va.c f135151j;

    public p(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f135148g = 0;
        this.f135151j = null;
        this.f135147f = linearProgressIndicatorSpec;
        this.f135146e = new Interpolator[]{AnimationUtils.loadInterpolator(context, fj.a.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, fj.a.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, fj.a.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, fj.a.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void B() {
        this.f135148g = 0;
        Iterator it = ((List) this.f16057b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).f135122c = this.f135147f.f135076c[0];
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void l() {
        ObjectAnimator objectAnimator = this.f135144c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void t() {
        B();
    }

    @Override // androidx.appcompat.app.j0
    public final void v(b bVar) {
        this.f135151j = bVar;
    }

    @Override // androidx.appcompat.app.j0
    public final void w() {
        ObjectAnimator objectAnimator = this.f135145d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        l();
        if (((l) this.f16056a).isVisible()) {
            this.f135145d.setFloatValues(this.f135150i, 1.0f);
            this.f135145d.setDuration((long) ((1.0f - this.f135150i) * 1800.0f));
            this.f135145d.start();
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void y() {
        int i13 = 1;
        int i14 = 0;
        ObjectAnimator objectAnimator = this.f135144c;
        v2 v2Var = f135143m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, v2Var, 0.0f, 1.0f);
            this.f135144c = ofFloat;
            ofFloat.setDuration(BaseRecyclerCellView.CAROUSEL_ANIMATION_DELAY);
            this.f135144c.setInterpolator(null);
            this.f135144c.setRepeatCount(-1);
            this.f135144c.addListener(new o(this, i14));
        }
        if (this.f135145d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, v2Var, 1.0f);
            this.f135145d = ofFloat2;
            ofFloat2.setDuration(BaseRecyclerCellView.CAROUSEL_ANIMATION_DELAY);
            this.f135145d.setInterpolator(null);
            this.f135145d.addListener(new o(this, i13));
        }
        B();
        this.f135144c.start();
    }

    @Override // androidx.appcompat.app.j0
    public final void z() {
        this.f135151j = null;
    }
}
