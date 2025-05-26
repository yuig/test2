package sa;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.v;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112119c;

    public /* synthetic */ c(View view, Drawable.Callback callback, int i13) {
        this.f112117a = i13;
        this.f112118b = view;
        this.f112119c = callback;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p03) {
        switch (this.f112117a) {
            case 0:
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                mr.a aVar = (mr.a) this.f112118b;
                View view = (View) this.f112119c;
                int i13 = mr.a.f88074g;
                aVar.l(view);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p03) {
        int i13 = this.f112117a;
        Object obj = this.f112119c;
        Object obj2 = this.f112118b;
        switch (i13) {
            case 0:
                break;
            case 1:
                ((View) obj2).setVisibility(8);
                FrameLayout frameLayout = (FrameLayout) obj;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                int i14 = mr.a.f88074g;
                ((mr.a) obj2).l((View) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "animation");
                v vVar = (v) obj;
                ((GestaltSpinner) obj2).f49598s.setImageDrawable(vVar);
                vVar.q();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p03) {
        switch (this.f112117a) {
            case 0:
                e eVar = (e) this.f112119c;
                d dVar = (d) this.f112118b;
                eVar.a(1.0f, dVar, true);
                dVar.f112130k = dVar.f112124e;
                dVar.f112131l = dVar.f112125f;
                dVar.f112132m = dVar.f112126g;
                int i13 = dVar.f112129j + 1;
                int[] iArr = dVar.f112128i;
                int length = i13 % iArr.length;
                dVar.f112129j = length;
                dVar.f112140u = iArr[length];
                if (!eVar.f112149f) {
                    eVar.f112148e += 1.0f;
                    break;
                } else {
                    eVar.f112149f = false;
                    p03.cancel();
                    p03.setDuration(1332L);
                    p03.start();
                    if (dVar.f112133n) {
                        dVar.f112133n = false;
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p03) {
        switch (this.f112117a) {
            case 0:
                ((e) this.f112119c).f112148e = 0.0f;
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "animation");
                break;
        }
    }

    public c(e eVar, d dVar) {
        this.f112117a = 0;
        this.f112119c = eVar;
        this.f112118b = dVar;
    }
}
