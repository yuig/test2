package tj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import oi.u6;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f117763a;

    /* renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f117764b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f117765c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final u6 f117766d;

    /* renamed from: e, reason: collision with root package name */
    public gj.f f117767e;

    /* renamed from: f, reason: collision with root package name */
    public gj.f f117768f;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, u6 u6Var) {
        this.f117764b = extendedFloatingActionButton;
        this.f117763a = extendedFloatingActionButton.getContext();
        this.f117766d = u6Var;
    }

    public AnimatorSet a() {
        gj.f fVar = this.f117768f;
        if (fVar == null) {
            if (this.f117767e == null) {
                this.f117767e = gj.f.b(this.f117763a, c());
            }
            fVar = this.f117767e;
            fVar.getClass();
        }
        return b(fVar);
    }

    public final AnimatorSet b(gj.f fVar) {
        ArrayList arrayList = new ArrayList();
        boolean g13 = fVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f117764b;
        if (g13) {
            arrayList.add(fVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (fVar.g("scale")) {
            arrayList.add(fVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(fVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (fVar.g("width")) {
            arrayList.add(fVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f32617J));
        }
        if (fVar.g("height")) {
            arrayList.add(fVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.K));
        }
        if (fVar.g("paddingStart")) {
            arrayList.add(fVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.L));
        }
        if (fVar.g("paddingEnd")) {
            arrayList.add(fVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.M));
        }
        if (fVar.g("labelOpacity")) {
            arrayList.add(fVar.d("labelOpacity", extendedFloatingActionButton, new gj.e(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        kotlin.jvm.internal.r.f0(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.f117766d.f95225b = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
