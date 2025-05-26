package com.google.android.material.datepicker;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f32544b;

    public k(s sVar, int i13) {
        this.f32544b = sVar;
        this.f32543a = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32544b.f32565j.d3(this.f32543a);
    }
}
