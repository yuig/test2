package uk2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import uj2.v;

/* loaded from: classes2.dex */
public final class i extends AtomicInteger implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f122415a;

    /* renamed from: b, reason: collision with root package name */
    public final l f122416b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f122417c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f122418d;

    public i(v vVar, l lVar) {
        this.f122415a = vVar;
        this.f122416b = lVar;
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f122418d) {
            return;
        }
        this.f122418d = true;
        this.f122416b.S(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f122418d;
    }
}
