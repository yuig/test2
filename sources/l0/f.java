package l0;

import c0.f1;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f81212b;

    public /* synthetic */ f(int i13, f1 f1Var) {
        this.f81211a = i13;
        this.f81212b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f81211a;
        this.f81212b.close();
    }
}
