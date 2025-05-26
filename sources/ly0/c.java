package ly0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f85116b;

    public /* synthetic */ c(d dVar, int i13) {
        this.f85115a = i13;
        this.f85116b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f85115a;
        d dVar = this.f85116b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jy0.a aVar = dVar.f85121n0;
                if (aVar != null) {
                    ky0.c cVar = (ky0.c) aVar;
                    if (!cVar.f81131g) {
                        cVar.f81132h = true;
                        break;
                    } else {
                        cVar.p3();
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jy0.a aVar2 = dVar.f85121n0;
                if (aVar2 != null) {
                    ky0.c cVar2 = (ky0.c) aVar2;
                    if (cVar2.isBound()) {
                        jy0.b bVar = (jy0.b) cVar2.getView();
                        my0.b bVar2 = cVar2.f81133i;
                        String text = bVar2.f88496c;
                        d dVar2 = (d) bVar;
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        GestaltText gestaltText = dVar2.f85119l0;
                        if (gestaltText != null) {
                            a0.p(gestaltText, text);
                        }
                        Intrinsics.checkNotNullParameter(bVar2.f88497d, "text");
                        break;
                    }
                }
                break;
        }
    }
}
