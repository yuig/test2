package kotlin.collections;

/* loaded from: classes4.dex */
public final class e1 extends d {

    /* renamed from: c, reason: collision with root package name */
    public int f80361c;

    /* renamed from: d, reason: collision with root package name */
    public int f80362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f80363e;

    public e1(f1 f1Var) {
        this.f80363e = f1Var;
        this.f80361c = f1Var.b();
        this.f80362d = f1Var.f80367d;
    }

    @Override // kotlin.collections.d
    public final void b() {
        int i13 = this.f80361c;
        if (i13 == 0) {
            this.f80357a = k1.Done;
            return;
        }
        f1 f1Var = this.f80363e;
        Object[] objArr = f1Var.f80365b;
        int i14 = this.f80362d;
        this.f80358b = objArr[i14];
        this.f80357a = k1.Ready;
        this.f80362d = (i14 + 1) % f1Var.f80366c;
        this.f80361c = i13 - 1;
    }
}
