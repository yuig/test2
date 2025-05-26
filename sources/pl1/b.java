package pl1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes5.dex */
public final class b extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final int f100562a;

    /* renamed from: b, reason: collision with root package name */
    public final View f100563b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100564c;

    public b(View view, int i13, boolean z13) {
        this.f100563b = view;
        this.f100562a = i13;
        this.f100564c = z13;
        view.getLayoutParams().height = z13 ? 0 : i13;
        view.setVisibility(0);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation transformation) {
        int i13;
        boolean z13 = this.f100564c;
        int i14 = this.f100562a;
        if (z13) {
            i13 = (int) (i14 * f13);
        } else {
            i13 = (int) ((1.0f - f13) * i14);
        }
        View view = this.f100563b;
        view.getLayoutParams().height = i13;
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
