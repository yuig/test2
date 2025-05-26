package tj;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f117807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f117809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f117810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f117811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f117812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f117813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f117814h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f117815i;

    public m(q qVar, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Matrix matrix) {
        this.f117815i = qVar;
        this.f117807a = f13;
        this.f117808b = f14;
        this.f117809c = f15;
        this.f117810d = f16;
        this.f117811e = f17;
        this.f117812f = f18;
        this.f117813g = f19;
        this.f117814h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q qVar = this.f117815i;
        qVar.f117844u.setAlpha(gj.a.b(this.f117807a, this.f117808b, 0.0f, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = qVar.f117844u;
        float f13 = this.f117809c;
        float f14 = this.f117810d;
        floatingActionButton.setScaleX(gj.a.a(f13, f14, floatValue));
        qVar.f117844u.setScaleY(gj.a.a(this.f117811e, f14, floatValue));
        float f15 = this.f117812f;
        float f16 = this.f117813g;
        qVar.f117838o = gj.a.a(f15, f16, floatValue);
        float a13 = gj.a.a(f15, f16, floatValue);
        Matrix matrix = this.f117814h;
        qVar.a(a13, matrix);
        qVar.f117844u.setImageMatrix(matrix);
    }
}
