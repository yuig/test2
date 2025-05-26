package oi;

/* loaded from: classes3.dex */
public abstract class k2 extends l3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f94893b;

    public k2(u4 u4Var) {
        super(u4Var);
        ((u4) this.f24333a).E++;
    }

    public final void w() {
        if (!this.f94893b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.f94893b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (y()) {
            return;
        }
        ((u4) this.f24333a).G.incrementAndGet();
        this.f94893b = true;
    }

    public abstract boolean y();
}
