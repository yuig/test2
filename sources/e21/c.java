package e21;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f56937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z11.a f56938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v32.c f56939d;

    public c(f fVar, z11.a aVar, v32.c cVar) {
        this.f56937b = fVar;
        this.f56938c = aVar;
        this.f56939d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        boolean z13 = this.f56931a;
        f fVar = this.f56937b;
        if (!z13) {
            fVar.performHapticFeedback(3);
            fVar.postDelayed(new vs0.b(fVar, 17), 200L);
        }
        z11.a aVar = this.f56938c;
        if (aVar != null) {
            z11.a.b1(aVar, this.f56939d, Boolean.TRUE, 2);
        }
        fVar.setAlpha(0.0f);
    }
}
