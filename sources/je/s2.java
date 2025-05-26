package je;

/* loaded from: classes3.dex */
public final class s2 extends c0.s0 {

    /* renamed from: b, reason: collision with root package name */
    public float f75771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f75772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var) {
        super(t2Var);
        this.f75772c = t2Var;
        this.f75771b = 0.0f;
    }

    @Override // c0.s0
    public final void k(String str) {
        this.f75771b = this.f75772c.f75777c.f75762d.measureText(str) + this.f75771b;
    }
}
