package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19632a;

    /* renamed from: b, reason: collision with root package name */
    public int f19633b;

    /* renamed from: c, reason: collision with root package name */
    public int f19634c;

    /* renamed from: d, reason: collision with root package name */
    public int f19635d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f19636e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19637f;

    /* renamed from: g, reason: collision with root package name */
    public int f19638g;

    public final void a(RecyclerView recyclerView) {
        int i13 = this.f19635d;
        if (i13 >= 0) {
            this.f19635d = -1;
            recyclerView.X1(i13);
            this.f19637f = false;
            return;
        }
        if (!this.f19637f) {
            this.f19638g = 0;
            return;
        }
        Interpolator interpolator = this.f19636e;
        if (interpolator != null && this.f19634c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i14 = this.f19634c;
        if (i14 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f19225e0.c(this.f19632a, this.f19633b, i14, interpolator);
        int i15 = this.f19638g + 1;
        this.f19638g = i15;
        if (i15 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f19637f = false;
    }

    public final void b(int i13, int i14, int i15, BaseInterpolator baseInterpolator) {
        this.f19632a = i13;
        this.f19633b = i14;
        this.f19634c = i15;
        this.f19636e = baseInterpolator;
        this.f19637f = true;
    }
}
