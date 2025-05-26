package jk2;

/* loaded from: classes2.dex */
public final class t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s2 f76701a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76702b;

    public t2(long j13, s2 s2Var) {
        this.f76702b = j13;
        this.f76701a = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76701a.d(this.f76702b);
    }
}
