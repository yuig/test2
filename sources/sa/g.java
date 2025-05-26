package sa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f112153b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i13) {
        this.f112152a = i13;
        this.f112153b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation transformation) {
        int i13 = this.f112152a;
        SwipeRefreshLayout swipeRefreshLayout = this.f112153b;
        switch (i13) {
            case 0:
                float f14 = 1.0f - f13;
                swipeRefreshLayout.f19812q.setScaleX(f14);
                swipeRefreshLayout.f19812q.setScaleY(f14);
                break;
            case 1:
                swipeRefreshLayout.getClass();
                int abs = swipeRefreshLayout.f19816u - Math.abs(swipeRefreshLayout.f19815t);
                swipeRefreshLayout.g((swipeRefreshLayout.f19814s + ((int) ((abs - r5) * f13))) - swipeRefreshLayout.f19812q.getTop());
                e eVar = swipeRefreshLayout.f19817v;
                float f15 = 1.0f - f13;
                d dVar = eVar.f112144a;
                if (f15 != dVar.f112135p) {
                    dVar.f112135p = f15;
                }
                eVar.invalidateSelf();
                break;
            case 2:
                swipeRefreshLayout.e(f13);
                break;
            default:
                swipeRefreshLayout.getClass();
                float f16 = ((-0.0f) * f13) + 0.0f;
                swipeRefreshLayout.f19812q.setScaleX(f16);
                swipeRefreshLayout.f19812q.setScaleY(f16);
                swipeRefreshLayout.e(f13);
                break;
        }
    }
}
