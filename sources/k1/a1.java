package k1;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes2.dex */
public final class a1 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f77806a;

    /* renamed from: b, reason: collision with root package name */
    public float f77807b;

    public a1(Context context) {
        super(context);
        this.f77806a = bf.b.a(context).f89171a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i13) {
        this.f77807b = 0.0f;
        super.onAbsorb(i13);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f13) {
        this.f77807b = 0.0f;
        super.onPull(f13);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f77807b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f13, float f14) {
        this.f77807b = 0.0f;
        super.onPull(f13, f14);
    }
}
