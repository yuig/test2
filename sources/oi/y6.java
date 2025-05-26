package oi;

/* loaded from: classes3.dex */
public abstract class y6 extends w6 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f95290c;

    public y6(a7 a7Var) {
        super(a7Var);
        this.f95249b.f94672r++;
    }

    public final void t() {
        if (!this.f95290c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f95290c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.f95249b.f94673s++;
        this.f95290c = true;
    }

    public abstract boolean v();
}
