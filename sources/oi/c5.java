package oi;

/* loaded from: classes3.dex */
public abstract class c5 extends c0.s0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f94712b;

    public c5(u4 u4Var) {
        super(u4Var);
        ((u4) this.f24333a).E++;
    }

    public final void q() {
        if (!this.f94712b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f94712b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        ((u4) this.f24333a).G.incrementAndGet();
        this.f94712b = true;
    }

    public abstract boolean s();
}
