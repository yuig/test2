package sa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f112155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f112156c;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i13, int i14) {
        this.f112156c = swipeRefreshLayout;
        this.f112154a = i13;
        this.f112155b = i14;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation transformation) {
        this.f112156c.f19817v.setAlpha((int) (((this.f112155b - r0) * f13) + this.f112154a));
    }
}
