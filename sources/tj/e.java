package tj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;

/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: g, reason: collision with root package name */
    public final h f117788g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f117789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f117790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExtendedFloatingActionButton extendedFloatingActionButton, u6 u6Var, h hVar, boolean z13) {
        super(extendedFloatingActionButton, u6Var);
        this.f117790i = extendedFloatingActionButton;
        this.f117788g = hVar;
        this.f117789h = z13;
    }

    @Override // tj.a
    public final AnimatorSet a() {
        gj.f fVar = this.f117768f;
        if (fVar == null) {
            if (this.f117767e == null) {
                this.f117767e = gj.f.b(this.f117763a, c());
            }
            fVar = this.f117767e;
            fVar.getClass();
        }
        boolean g13 = fVar.g("width");
        h hVar = this.f117788g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117790i;
        if (g13) {
            PropertyValuesHolder[] e13 = fVar.e("width");
            e13[0].setFloatValues(extendedFloatingActionButton.getWidth(), hVar.j());
            fVar.h("width", e13);
        }
        if (fVar.g("height")) {
            PropertyValuesHolder[] e14 = fVar.e("height");
            e14[0].setFloatValues(extendedFloatingActionButton.getHeight(), hVar.i());
            fVar.h("height", e14);
        }
        if (fVar.g("paddingStart")) {
            PropertyValuesHolder[] e15 = fVar.e("paddingStart");
            PropertyValuesHolder propertyValuesHolder = e15[0];
            WeakHashMap weakHashMap = v0.f102521a;
            propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), hVar.e());
            fVar.h("paddingStart", e15);
        }
        if (fVar.g("paddingEnd")) {
            PropertyValuesHolder[] e16 = fVar.e("paddingEnd");
            PropertyValuesHolder propertyValuesHolder2 = e16[0];
            WeakHashMap weakHashMap2 = v0.f102521a;
            propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), hVar.a());
            fVar.h("paddingEnd", e16);
        }
        if (fVar.g("labelOpacity")) {
            PropertyValuesHolder[] e17 = fVar.e("labelOpacity");
            boolean z13 = this.f117789h;
            e17[0].setFloatValues(z13 ? 0.0f : 1.0f, z13 ? 1.0f : 0.0f);
            fVar.h("labelOpacity", e17);
        }
        return b(fVar);
    }

    @Override // tj.a
    public final int c() {
        return this.f117789h ? fj.b.mtrl_extended_fab_change_size_expand_motion_spec : fj.b.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // tj.a
    public final void e() {
        this.f117766d.f95225b = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117790i;
        extendedFloatingActionButton.E = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        h hVar = this.f117788g;
        layoutParams.width = hVar.d().width;
        layoutParams.height = hVar.d().height;
    }

    @Override // tj.a
    public final void f(Animator animator) {
        u6 u6Var = this.f117766d;
        Animator animator2 = (Animator) u6Var.f95225b;
        if (animator2 != null) {
            animator2.cancel();
        }
        u6Var.f95225b = animator;
        boolean z13 = this.f117789h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117790i;
        extendedFloatingActionButton.D = z13;
        extendedFloatingActionButton.E = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // tj.a
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117790i;
        boolean z13 = this.f117789h;
        extendedFloatingActionButton.D = z13;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z13) {
            extendedFloatingActionButton.G = layoutParams.width;
            extendedFloatingActionButton.H = layoutParams.height;
        }
        h hVar = this.f117788g;
        layoutParams.width = hVar.d().width;
        layoutParams.height = hVar.d().height;
        int e13 = hVar.e();
        int paddingTop = extendedFloatingActionButton.getPaddingTop();
        int a13 = hVar.a();
        int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
        WeakHashMap weakHashMap = v0.f102521a;
        extendedFloatingActionButton.setPaddingRelative(e13, paddingTop, a13, paddingBottom);
        extendedFloatingActionButton.requestLayout();
    }

    @Override // tj.a
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117790i;
        return this.f117789h == extendedFloatingActionButton.D || extendedFloatingActionButton.f32346i == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
