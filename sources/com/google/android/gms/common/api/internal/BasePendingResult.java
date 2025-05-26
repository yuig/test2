package com.google.android.gms.common.api.internal;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kh2.c3;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.k> extends c3 {

    /* renamed from: j, reason: collision with root package name */
    public static final a.g f30772j = new a.g(7);

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.gms.common.api.k f30777e;

    /* renamed from: f, reason: collision with root package name */
    public Status f30778f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f30779g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30780h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f30773a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f30774b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30775c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f30776d = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public boolean f30781i = false;

    public BasePendingResult(c0 c0Var) {
        new d(c0Var != null ? c0Var.f30799b.f30766f : Looper.getMainLooper(), 0);
        new WeakReference(c0Var);
    }

    public final void A0(Status status) {
        synchronized (this.f30773a) {
            try {
                if (!B0()) {
                    C0(z0(status));
                    this.f30780h = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean B0() {
        return this.f30774b.getCount() == 0;
    }

    public final void C0(com.google.android.gms.common.api.k kVar) {
        synchronized (this.f30773a) {
            try {
                if (this.f30780h) {
                    return;
                }
                B0();
                com.bumptech.glide.d.w("Results have already been set", !B0());
                com.bumptech.glide.d.w("Result has already been consumed", !this.f30779g);
                this.f30777e = kVar;
                this.f30778f = kVar.d();
                this.f30774b.countDown();
                ArrayList arrayList = this.f30775c;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((com.google.android.gms.common.api.j) arrayList.get(i13)).a(this.f30778f);
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kh2.c3
    public final com.google.android.gms.common.api.k p(TimeUnit timeUnit) {
        com.google.android.gms.common.api.k kVar;
        com.bumptech.glide.d.w("Result has already been consumed.", !this.f30779g);
        try {
            if (!this.f30774b.await(0L, timeUnit)) {
                A0(Status.f30749m);
            }
        } catch (InterruptedException unused) {
            A0(Status.f30747k);
        }
        com.bumptech.glide.d.w("Result is not ready.", B0());
        synchronized (this.f30773a) {
            com.bumptech.glide.d.w("Result has already been consumed.", !this.f30779g);
            com.bumptech.glide.d.w("Result is not ready.", B0());
            kVar = this.f30777e;
            this.f30777e = null;
            this.f30779g = true;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f30776d.getAndSet(null));
        com.bumptech.glide.d.t(kVar);
        return kVar;
    }

    public final void y0(com.google.android.gms.common.api.j jVar) {
        synchronized (this.f30773a) {
            try {
                if (B0()) {
                    jVar.a(this.f30778f);
                } else {
                    this.f30775c.add(jVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract com.google.android.gms.common.api.k z0(Status status);
}
