package je;

/* loaded from: classes3.dex */
public class p2 extends c0.s0 {

    /* renamed from: b, reason: collision with root package name */
    public float f75739b;

    /* renamed from: c, reason: collision with root package name */
    public float f75740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f75741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(t2 t2Var, float f13, float f14) {
        super(t2Var);
        this.f75741d = t2Var;
        this.f75739b = f13;
        this.f75740c = f14;
    }

    @Override // c0.s0
    public void k(String str) {
        t2 t2Var = this.f75741d;
        if (t2Var.W()) {
            r2 r2Var = t2Var.f75777c;
            if (r2Var.f75760b) {
                t2Var.f75775a.drawText(str, this.f75739b, this.f75740c, r2Var.f75762d);
            }
            r2 r2Var2 = t2Var.f75777c;
            if (r2Var2.f75761c) {
                t2Var.f75775a.drawText(str, this.f75739b, this.f75740c, r2Var2.f75763e);
            }
        }
        this.f75739b = t2Var.f75777c.f75762d.measureText(str) + this.f75739b;
    }
}
