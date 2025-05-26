package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.view.animation.Transformation;

/* loaded from: classes2.dex */
public final class z1 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final float f16743a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16744b;

    /* renamed from: c, reason: collision with root package name */
    public final PathInterpolator f16745c = pl1.a.f100559a;

    /* renamed from: d, reason: collision with root package name */
    public final PathInterpolator f16746d = pl1.a.f100560b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ModifiedSwitchCompat f16747e;

    public z1(ModifiedSwitchCompat modifiedSwitchCompat, float f13, float f14) {
        this.f16747e = modifiedSwitchCompat;
        this.f16743a = f13;
        this.f16744b = f14 - f13;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation transformation) {
        int b13;
        int d2;
        ModifiedSwitchCompat modifiedSwitchCompat = this.f16747e;
        boolean z13 = modifiedSwitchCompat.f16413p;
        float f14 = this.f16744b;
        float f15 = this.f16743a;
        if (!z13) {
            modifiedSwitchCompat.h((f14 * f13) + f15);
            return;
        }
        float interpolation = this.f16745c.getInterpolation(f13);
        float interpolation2 = this.f16746d.getInterpolation(f13);
        float f16 = (f13 * 300.0f) / 200.0f;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (modifiedSwitchCompat.isChecked()) {
            b13 = modifiedSwitchCompat.d();
            d2 = modifiedSwitchCompat.b();
        } else {
            b13 = modifiedSwitchCompat.b();
            d2 = modifiedSwitchCompat.d();
        }
        int b14 = (modifiedSwitchCompat.isChecked() ? modifiedSwitchCompat.b() : modifiedSwitchCompat.d()) + ((int) ((b13 - d2) * f16));
        int i13 = (modifiedSwitchCompat.f16419v + modifiedSwitchCompat.f16421x) / 2;
        int i14 = b14 / 2;
        int i15 = i13 - i14;
        int i16 = i13 + i14;
        if (!modifiedSwitchCompat.isChecked()) {
            interpolation = interpolation2;
        }
        float f17 = (f14 * interpolation) + f15;
        int e13 = (int) (modifiedSwitchCompat.e() * f17);
        if (modifiedSwitchCompat.f16398a != null) {
            Rect rect = new Rect();
            modifiedSwitchCompat.f16398a.getPadding(rect);
            modifiedSwitchCompat.f16398a.setBounds((e13 - rect.left) + i14, i15, e13 + b14 + rect.right + i14, i16);
            modifiedSwitchCompat.h(f17);
        }
        modifiedSwitchCompat.invalidate();
    }
}
