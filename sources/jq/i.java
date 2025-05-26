package jq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oq.b0;

/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f77421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f77422c;

    public /* synthetic */ i(j jVar, b0 b0Var, int i13) {
        this.f77420a = i13;
        this.f77421b = jVar;
        this.f77422c = b0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f77420a;
        Function0 function0 = this.f77422c;
        j jVar = this.f77421b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (function0 != null) {
                    jVar.getClass();
                    function0.invoke();
                }
                jVar.f();
                jVar.f77426d = null;
                jVar.f77439q = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.b(function0);
                break;
        }
    }
}
