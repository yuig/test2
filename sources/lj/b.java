package lj;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bk.e;
import bk.i;
import bk.m;
import bk.o;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.card.MaterialCardView;
import fj.c;
import fj.g;
import fj.l;
import tb.f;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: y, reason: collision with root package name */
    public static final double f83585y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f83586z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f83587a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f83588b;

    /* renamed from: c, reason: collision with root package name */
    public final i f83589c;

    /* renamed from: d, reason: collision with root package name */
    public final i f83590d;

    /* renamed from: e, reason: collision with root package name */
    public int f83591e;

    /* renamed from: f, reason: collision with root package name */
    public int f83592f;

    /* renamed from: g, reason: collision with root package name */
    public int f83593g;

    /* renamed from: h, reason: collision with root package name */
    public int f83594h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f83595i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f83596j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f83597k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f83598l;

    /* renamed from: m, reason: collision with root package name */
    public o f83599m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f83600n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f83601o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f83602p;

    /* renamed from: q, reason: collision with root package name */
    public i f83603q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f83604r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f83605s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f83606t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f83607u;

    /* renamed from: v, reason: collision with root package name */
    public final int f83608v;

    /* renamed from: w, reason: collision with root package name */
    public final int f83609w;

    /* renamed from: x, reason: collision with root package name */
    public float f83610x;

    static {
        f83586z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i13) {
        int i14 = MaterialCardView.f32395o;
        this.f83588b = new Rect();
        this.f83604r = false;
        this.f83610x = 0.0f;
        this.f83587a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, i13, i14);
        this.f83589c = iVar;
        iVar.o(materialCardView.getContext());
        iVar.w();
        m h10 = iVar.f23052a.f23030a.h();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, fj.m.CardView, i13, l.CardView);
        if (obtainStyledAttributes.hasValue(fj.m.CardView_cardCornerRadius)) {
            h10.c(obtainStyledAttributes.getDimension(fj.m.CardView_cardCornerRadius, 0.0f));
        }
        this.f83590d = new i();
        f(h10.a());
        this.f83607u = f.d0(materialCardView.getContext(), c.motionEasingLinearInterpolator, gj.a.f65167a);
        this.f83608v = f.c0(materialCardView.getContext(), c.motionDurationShort2, AdSize.MEDIUM_RECTANGLE_WIDTH);
        this.f83609w = f.c0(materialCardView.getContext(), c.motionDurationShort1, AdSize.MEDIUM_RECTANGLE_WIDTH);
        obtainStyledAttributes.recycle();
    }

    public static float b(bs1.c cVar, float f13) {
        if (cVar instanceof bk.l) {
            return (float) ((1.0d - f83585y) * f13);
        }
        if (cVar instanceof e) {
            return f13 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        bs1.c cVar = this.f83599m.f23091a;
        i iVar = this.f83589c;
        return Math.max(Math.max(b(cVar, iVar.l()), b(this.f83599m.f23092b, iVar.m())), Math.max(b(this.f83599m.f23093c, iVar.i()), b(this.f83599m.f23094d, iVar.h())));
    }

    public final LayerDrawable c() {
        if (this.f83601o == null) {
            int[] iArr = zj.a.f142043a;
            this.f83603q = new i(this.f83599m);
            this.f83601o = new RippleDrawable(this.f83597k, null, this.f83603q);
        }
        if (this.f83602p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f83601o, this.f83590d, this.f83596j});
            this.f83602p = layerDrawable;
            layerDrawable.setId(2, g.mtrl_card_checked_layer_id);
        }
        return this.f83602p;
    }

    public final a d(Drawable drawable) {
        int i13;
        int i14;
        if (this.f83587a.f17053a) {
            int ceil = (int) Math.ceil((gi2.b.g0(r0.f17057e).f60763e * 1.5f) + (g() ? a() : 0.0f));
            i13 = (int) Math.ceil(gi2.b.g0(r0.f17057e).f60763e + (g() ? a() : 0.0f));
            i14 = ceil;
        } else {
            i13 = 0;
            i14 = 0;
        }
        return new a(drawable, i13, i14, i13, i14);
    }

    public final void e(boolean z13, boolean z14) {
        int i13 = 1;
        Drawable drawable = this.f83596j;
        if (drawable != null) {
            if (!z14) {
                drawable.setAlpha(z13 ? 255 : 0);
                this.f83610x = z13 ? 1.0f : 0.0f;
                return;
            }
            float f13 = z13 ? 1.0f : 0.0f;
            float f14 = z13 ? 1.0f - this.f83610x : this.f83610x;
            ValueAnimator valueAnimator = this.f83606t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f83606t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f83610x, f13);
            this.f83606t = ofFloat;
            ofFloat.addUpdateListener(new androidx.media3.ui.c(this, i13));
            this.f83606t.setInterpolator(this.f83607u);
            this.f83606t.setDuration((long) ((z13 ? this.f83608v : this.f83609w) * f14));
            this.f83606t.start();
        }
    }

    public final void f(o oVar) {
        this.f83599m = oVar;
        i iVar = this.f83589c;
        iVar.Y0(oVar);
        iVar.f23074w = !iVar.p();
        i iVar2 = this.f83590d;
        if (iVar2 != null) {
            iVar2.Y0(oVar);
        }
        i iVar3 = this.f83603q;
        if (iVar3 != null) {
            iVar3.Y0(oVar);
        }
    }

    public final boolean g() {
        MaterialCardView materialCardView = this.f83587a;
        return materialCardView.f17054b && this.f83589c.p() && materialCardView.f17053a;
    }

    public final boolean h() {
        View view = this.f83587a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void i() {
        Drawable drawable = this.f83595i;
        Drawable c13 = h() ? c() : this.f83590d;
        this.f83595i = c13;
        if (drawable != c13) {
            MaterialCardView materialCardView = this.f83587a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c13);
            } else {
                materialCardView.setForeground(d(c13));
            }
        }
    }

    public final void j() {
        MaterialCardView materialCardView = this.f83587a;
        float f13 = 0.0f;
        float a13 = ((materialCardView.f17054b && !this.f83589c.p()) || g()) ? a() : 0.0f;
        if (materialCardView.f17054b && materialCardView.f17053a) {
            f13 = (float) ((1.0d - f83585y) * ((f1.a) ((Drawable) materialCardView.f17057e.f114928b)).f60759a);
        }
        int i13 = (int) (a13 - f13);
        Rect rect = this.f83588b;
        materialCardView.D(rect.left + i13, rect.top + i13, rect.right + i13, rect.bottom + i13);
    }
}
