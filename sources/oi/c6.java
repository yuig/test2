package oi;

/* loaded from: classes3.dex */
public final class c6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f94714b;

    public /* synthetic */ c6(a6 a6Var, int i13) {
        this.f94713a = i13;
        this.f94714b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94713a;
        a6 a6Var = this.f94714b;
        switch (i13) {
            case 0:
                a6Var.f94647e = a6Var.f94652j;
                break;
            default:
                a6Var.f94652j = null;
                break;
        }
    }
}
