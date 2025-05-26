package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19356c;

    public /* synthetic */ d0(Object obj, boolean z13, int i13) {
        this.f19354a = i13;
        this.f19356c = obj;
        this.f19355b = z13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f19354a) {
            case 0:
                this.f19355b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f19354a;
        Object obj = this.f19356c;
        switch (i13) {
            case 0:
                if (this.f19355b) {
                    this.f19355b = false;
                    return;
                }
                f0 f0Var = (f0) obj;
                if (((Float) f0Var.f19402z.getAnimatedValue()).floatValue() == 0.0f) {
                    f0Var.A = 0;
                    f0Var.l(0);
                    return;
                } else {
                    f0Var.A = 2;
                    f0Var.f19395s.invalidate();
                    return;
                }
            case 1:
                com.google.android.material.search.k kVar = (com.google.android.material.search.k) obj;
                com.google.android.material.search.k.a(kVar, this.f19355b ? 1.0f : 0.0f);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = kVar.f33004c;
                clippableRoundedCornerLayout.f32667a = null;
                clippableRoundedCornerLayout.f32668b = 0.0f;
                clippableRoundedCornerLayout.invalidate();
                return;
            case 2:
            default:
                super.onAnimationEnd(animation);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                lq0.o0 o0Var = (lq0.o0) obj;
                bs1.c.X0(o0Var.X8());
                GestaltIconButton gestaltIconButton = o0Var.B1;
                if (gestaltIconButton == null) {
                    Intrinsics.r("addGifReactionToConvoButton");
                    throw null;
                }
                gestaltIconButton.t(lq0.d.D);
                if (this.f19355b) {
                    hf0.b.t(o0Var.getContext());
                    o0Var.f84390m1 = true;
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                sf1.h0 h0Var = (sf1.h0) obj;
                h0Var.f112594s.remove(animation);
                if (this.f19355b) {
                    return;
                }
                bs1.c.X0(h0Var.f112595t);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f19354a;
        Object obj = this.f19356c;
        switch (i13) {
            case 1:
                com.google.android.material.search.k.a((com.google.android.material.search.k) obj, this.f19355b ? 0.0f : 1.0f);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (this.f19355b) {
                    m60.w wVar = ((rk0.c) obj).f108443c;
                    if (wVar != null) {
                        wVar.d(new gg0.j());
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                m60.w wVar2 = ((rk0.c) obj).f108443c;
                if (wVar2 != null) {
                    wVar2.d(new gg0.k());
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(animator, "animation");
                sf1.h0 h0Var = (sf1.h0) obj;
                h0Var.f112594s.add(animator);
                if (this.f19355b) {
                    bs1.c.U1(h0Var.f112595t);
                    return;
                }
                return;
        }
    }

    public d0(boolean z13, rk0.c cVar) {
        this.f19354a = 2;
        this.f19355b = z13;
        this.f19356c = cVar;
    }

    public d0(f0 f0Var) {
        this.f19354a = 0;
        this.f19356c = f0Var;
        this.f19355b = false;
    }
}
