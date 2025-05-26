package cu0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdeaPinColorPalette f53253b;

    public /* synthetic */ g(IdeaPinColorPalette ideaPinColorPalette, int i13) {
        this.f53252a = i13;
        this.f53253b = ideaPinColorPalette;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f53252a;
        IdeaPinColorPalette ideaPinColorPalette = this.f53253b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                b bVar = ideaPinColorPalette.f46418c;
                if (bVar != null) {
                    bVar.b();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                b bVar2 = ideaPinColorPalette.f46418c;
                if (bVar2 != null) {
                    bVar2.c();
                    break;
                }
                break;
        }
    }
}
