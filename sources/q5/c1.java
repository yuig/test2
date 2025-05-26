package q5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f102416d;

    public /* synthetic */ c1(Object obj, Object obj2, Serializable serializable, int i13) {
        this.f102413a = i13;
        this.f102415c = obj;
        this.f102414b = obj2;
        this.f102416d = serializable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f102413a) {
            case 0:
                ((e1) this.f102415c).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        RectF f13;
        int i13 = this.f102413a;
        Object obj = this.f102416d;
        Object obj2 = this.f102414b;
        Object obj3 = this.f102415c;
        switch (i13) {
            case 0:
                ((e1) obj3).d((View) obj2);
                break;
            case 1:
                ((o1) obj3).f102491a.d(1.0f);
                j1.e((View) obj2);
                break;
            case 2:
                ((oj.g) obj3).e(null);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                o80.j jVar = (o80.j) obj3;
                jVar.f93510q.set((Matrix) obj2);
                jVar.l(jVar.g(), false);
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                o80.g gVar = jVar.R;
                if (gVar != null && (f13 = jVar.f(jVar.g())) != null) {
                    ((f91.b) gVar).E(f13, true);
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                a41.r rVar = (a41.r) obj3;
                rVar.f676x1.remove(animation);
                rVar.E8((View) obj2, (a41.f) obj);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((pd.s) obj3).j(((View) obj2).getId());
                super.onAnimationEnd(animation);
                break;
            default:
                ((ViewPropertyAnimator) obj2).setListener(null);
                c02.u uVar = (c02.u) obj;
                y2 y2Var = (y2) obj3;
                uVar.f24461h.d(y2Var);
                uVar.h(y2Var);
                uVar.f24470q.remove(y2Var);
                uVar.q();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f102413a;
        Object obj = this.f102416d;
        Object obj2 = this.f102414b;
        Object obj3 = this.f102415c;
        switch (i13) {
            case 0:
                ((e1) obj3).a();
                break;
            case 1:
            case 3:
            default:
                super.onAnimationStart(animation);
                break;
            case 2:
                ((oj.g) obj3).e((Drawable) obj2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((a41.r) obj3).f676x1.add(animation);
                View view = (View) obj2;
                if (bs1.c.j1(view)) {
                    bs1.c.U1(view);
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                ir.q qVar = (ir.q) ((pd.s) obj3).f99750d;
                if (qVar != null) {
                    u70.a tab = (u70.a) obj;
                    Intrinsics.checkNotNullParameter(tab, "tab");
                    qVar.f73474a.getEventManager().d(new r70.l(tab, new f5.g()));
                    break;
                }
                break;
            case 6:
                ((c02.u) obj).getClass();
                break;
        }
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, int i13) {
        this.f102413a = i13;
        this.f102416d = obj;
        this.f102415c = obj2;
        this.f102414b = obj3;
    }
}
