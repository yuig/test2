package hk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69289a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f69290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f69293e;

    public b(FabTransformationBehavior fabTransformationBehavior, boolean z13, View view, View view2) {
        this.f69293e = fabTransformationBehavior;
        this.f69290b = z13;
        this.f69291c = view;
        this.f69292d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f69289a;
        Object obj = this.f69292d;
        boolean z13 = this.f69290b;
        switch (i13) {
            case 0:
                if (!z13) {
                    ((View) this.f69291c).setVisibility(4);
                    View view = (View) obj;
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                vm0.c cVar = (vm0.c) this.f69293e;
                (z13 ? cVar.f126208d : cVar.f126209e).remove(animation);
                ((Function0) obj).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f69289a;
        Object obj = this.f69291c;
        boolean z13 = this.f69290b;
        switch (i13) {
            case 0:
                if (z13) {
                    ((View) obj).setVisibility(0);
                    View view = (View) this.f69292d;
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                vm0.c cVar = (vm0.c) this.f69293e;
                (z13 ? cVar.f126208d : cVar.f126209e).add(animation);
                ((Function0) obj).invoke();
                break;
        }
    }

    public b(Function0 function0, Function0 function02, boolean z13, vm0.c cVar) {
        this.f69291c = function0;
        this.f69292d = function02;
        this.f69290b = z13;
        this.f69293e = cVar;
    }
}
