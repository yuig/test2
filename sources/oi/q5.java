package oi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class q5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f95062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f95065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f95067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f95068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f95069h = null;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k5 f95070i;

    public q5(k5 k5Var, String str, String str2, long j13, Bundle bundle, boolean z13, boolean z14, boolean z15) {
        this.f95070i = k5Var;
        this.f95062a = str;
        this.f95063b = str2;
        this.f95064c = j13;
        this.f95065d = bundle;
        this.f95066e = z13;
        this.f95067f = z14;
        this.f95068g = z15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f95070i.F(this.f95062a, this.f95063b, this.f95064c, this.f95065d, this.f95066e, this.f95067f, this.f95068g, this.f95069h);
    }
}
