package tj;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import bk.a0;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import oi.u6;

/* loaded from: classes3.dex */
public abstract class q {
    public static final q6.a B = gj.a.f65169c;
    public static final int C = fj.c.motionDurationLong2;
    public static final int D = fj.c.motionEasingEmphasizedInterpolator;
    public static final int E = fj.c.motionDurationMedium1;
    public static final int F = fj.c.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f117823J = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_enabled};
    public static final int[] L = new int[0];
    public a5.b A;

    /* renamed from: a, reason: collision with root package name */
    public bk.o f117824a;

    /* renamed from: b, reason: collision with root package name */
    public bk.i f117825b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f117826c;

    /* renamed from: d, reason: collision with root package name */
    public b f117827d;

    /* renamed from: e, reason: collision with root package name */
    public LayerDrawable f117828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117829f;

    /* renamed from: g, reason: collision with root package name */
    public float f117830g;

    /* renamed from: h, reason: collision with root package name */
    public float f117831h;

    /* renamed from: i, reason: collision with root package name */
    public float f117832i;

    /* renamed from: j, reason: collision with root package name */
    public int f117833j;

    /* renamed from: k, reason: collision with root package name */
    public Animator f117834k;

    /* renamed from: l, reason: collision with root package name */
    public gj.f f117835l;

    /* renamed from: m, reason: collision with root package name */
    public gj.f f117836m;

    /* renamed from: n, reason: collision with root package name */
    public float f117837n;

    /* renamed from: p, reason: collision with root package name */
    public int f117839p;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f117841r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f117842s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f117843t;

    /* renamed from: u, reason: collision with root package name */
    public final FloatingActionButton f117844u;

    /* renamed from: v, reason: collision with root package name */
    public final u6 f117845v;

    /* renamed from: o, reason: collision with root package name */
    public float f117838o = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f117840q = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f117846w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public final RectF f117847x = new RectF();

    /* renamed from: y, reason: collision with root package name */
    public final RectF f117848y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final Matrix f117849z = new Matrix();

    public q(FloatingActionButton floatingActionButton, u6 u6Var) {
        this.f117844u = floatingActionButton;
        this.f117845v = u6Var;
        m.h hVar = new m.h(13);
        s sVar = (s) this;
        hVar.p(G, d(new o(sVar, 2)));
        int i13 = 1;
        hVar.p(H, d(new o(sVar, i13)));
        hVar.p(I, d(new o(sVar, i13)));
        hVar.p(f117823J, d(new o(sVar, i13)));
        hVar.p(K, d(new o(sVar, 3)));
        hVar.p(L, d(new o(sVar, 0)));
        this.f117837n = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(o oVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(oVar);
        valueAnimator.addUpdateListener(oVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f13, Matrix matrix) {
        matrix.reset();
        if (this.f117844u.getDrawable() == null || this.f117839p == 0) {
            return;
        }
        RectF rectF = this.f117847x;
        RectF rectF2 = this.f117848y;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i13 = this.f117839p;
        rectF2.set(0.0f, 0.0f, i13, i13);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i14 = this.f117839p;
        matrix.postScale(f13, f13, i14 / 2.0f, i14 / 2.0f);
    }

    public final AnimatorSet b(gj.f fVar, float f13, float f14, float f15) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f13};
        FloatingActionButton floatingActionButton = this.f117844u;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        fVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f14);
        fVar.f("scale").a(ofFloat2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 == 26) {
            n nVar = new n();
            nVar.f117816a = new FloatEvaluator();
            ofFloat2.setEvaluator(nVar);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f14);
        fVar.f("scale").a(ofFloat3);
        if (i13 == 26) {
            n nVar2 = new n();
            nVar2.f117816a = new FloatEvaluator();
            ofFloat3.setEvaluator(nVar2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f117849z;
        a(f15, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new gj.e(), new l(this), new Matrix(matrix));
        fVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        kotlin.jvm.internal.r.f0(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f13, float f14, float f15, int i13, int i14) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f117844u;
        ofFloat.addUpdateListener(new m(this, floatingActionButton.getAlpha(), f13, floatingActionButton.getScaleX(), f14, floatingActionButton.getScaleY(), this.f117838o, f15, new Matrix(this.f117849z)));
        arrayList.add(ofFloat);
        kotlin.jvm.internal.r.f0(animatorSet, arrayList);
        animatorSet.setDuration(tb.f.c0(floatingActionButton.getContext(), i13, floatingActionButton.getContext().getResources().getInteger(fj.h.material_motion_duration_long_1)));
        animatorSet.setInterpolator(tb.f.d0(floatingActionButton.getContext(), i14, gj.a.f65168b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int i13 = 0;
        if (this.f117829f) {
            int i14 = this.f117833j;
            FloatingActionButton floatingActionButton = this.f117844u;
            i13 = Math.max((i14 - floatingActionButton.e(floatingActionButton.f32630d)) / 2, 0);
        }
        int max = Math.max(i13, (int) Math.ceil(e() + this.f117832i));
        int max2 = Math.max(i13, (int) Math.ceil(r0 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13);

    public abstract void h();

    public abstract void i(int[] iArr);

    public abstract void j(float f13, float f14, float f15);

    public final void k() {
        ArrayList arrayList = this.f117843t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                com.google.android.material.bottomappbar.b bVar = iVar.f117794a;
                bVar.getClass();
                BottomAppBar bottomAppBar = bVar.f32276a;
                bk.i iVar2 = bottomAppBar.V;
                FloatingActionButton floatingActionButton = iVar.f117795b;
                iVar2.u((floatingActionButton.getVisibility() == 0 && bottomAppBar.f32251b0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void l() {
        ArrayList arrayList = this.f117843t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                com.google.android.material.bottomappbar.b bVar = iVar.f117794a;
                bVar.getClass();
                BottomAppBar bottomAppBar = bVar.f32276a;
                if (bottomAppBar.f32251b0 == 1) {
                    FloatingActionButton floatingActionButton = iVar.f117795b;
                    float translationX = floatingActionButton.getTranslationX();
                    float f13 = bottomAppBar.K().f32287e;
                    bk.i iVar2 = bottomAppBar.V;
                    if (f13 != translationX) {
                        bottomAppBar.K().f32287e = translationX;
                        iVar2.invalidateSelf();
                    }
                    float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.K().f32286d != max) {
                        com.google.android.material.bottomappbar.f K2 = bottomAppBar.K();
                        if (max < 0.0f) {
                            K2.getClass();
                            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                        }
                        K2.f32286d = max;
                        iVar2.invalidateSelf();
                    }
                    iVar2.u(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void m(bk.o oVar) {
        this.f117824a = oVar;
        bk.i iVar = this.f117825b;
        if (iVar != null) {
            iVar.Y0(oVar);
        }
        Object obj = this.f117826c;
        if (obj instanceof a0) {
            ((a0) obj).Y0(oVar);
        }
        b bVar = this.f117827d;
        if (bVar != null) {
            bVar.f117783o = oVar;
            bVar.invalidateSelf();
        }
    }

    public abstract boolean n();

    public abstract void o();

    public final void p() {
        Rect rect = this.f117846w;
        f(rect);
        com.bumptech.glide.d.s(this.f117828e, "Didn't initialize content background");
        boolean n13 = n();
        u6 u6Var = this.f117845v;
        if (n13) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f117828e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f117828e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                u6Var.getClass();
            }
        }
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        ((FloatingActionButton) u6Var.f95225b).f32635i.set(i13, i14, i15, i16);
        FloatingActionButton floatingActionButton = (FloatingActionButton) u6Var.f95225b;
        int i17 = floatingActionButton.f32632f;
        floatingActionButton.setPadding(i13 + i17, i14 + i17, i15 + i17, i16 + i17);
    }
}
