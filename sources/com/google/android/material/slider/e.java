package com.google.android.material.slider;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f33107a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f33108b;

    public e(BaseSlider baseSlider) {
        this.f33108b = baseSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33108b.f33063h.u(this.f33107a, 4);
    }
}
