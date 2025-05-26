package ml1;

import android.animation.Animator;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f87537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f87538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f87539c;

    public s(u uVar, com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2) {
        this.f87537a = uVar;
        this.f87538b = qVar;
        this.f87539c = qVar2;
    }

    public final void a() {
        u uVar = this.f87537a;
        Animator animator = uVar.f87550e;
        if (animator != null) {
            animator.removeAllListeners();
        }
        uVar.f87550e = null;
        u.b(this.f87538b, this.f87539c, uVar.f87551f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p03) {
        Intrinsics.checkNotNullParameter(p03, "p0");
        a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f87537a.getClass();
        com.google.firebase.messaging.q qVar = this.f87538b;
        Function1 function12 = (Function1) qVar.f33805c;
        if (function12 != null) {
            function12.invoke((ScreenDescription) qVar.f33804b);
        }
        com.google.firebase.messaging.q qVar2 = this.f87539c;
        if (qVar2 == null || (function1 = (Function1) qVar2.f33805c) == null) {
            return;
        }
        function1.invoke((ScreenDescription) qVar2.f33804b);
    }
}
