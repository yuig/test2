package ir;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import r72.w0;

/* loaded from: classes3.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f73445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f73446d;

    public /* synthetic */ a(Object obj, Object obj2, ViewGroup viewGroup, int i13) {
        this.f73443a = i13;
        this.f73444b = obj;
        this.f73445c = obj2;
        this.f73446d = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f73443a) {
            case 0:
                c cVar = (c) this.f73444b;
                View view = (View) this.f73445c;
                cVar.getClass();
                View view2 = this.f73446d;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                }
                if (view2 != null) {
                    bs1.c.X0(view2);
                }
                view.setAlpha(1.0f);
                bs1.c.U1(view);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f73443a) {
            case 1:
                c cVar = (c) this.f73444b;
                View view = (View) this.f73445c;
                cVar.getClass();
                View view2 = this.f73446d;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                }
                if (view2 != null) {
                    bs1.c.X0(view2);
                }
                view.setAlpha(1.0f);
                bs1.c.U1(view);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f73443a) {
            case 0:
            case 1:
                break;
            default:
                n62.g gVar = (n62.g) this.f73444b;
                w0 w0Var = (w0) this.f73445c;
                int i13 = n62.g.f89351o;
                gVar.d(w0Var);
                ((ViewGroup) this.f73446d).setVisibility(0);
                gVar.f89354c.setVisibility(8);
                break;
        }
    }
}
