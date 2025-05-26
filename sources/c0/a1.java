package c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements androidx.camera.core.impl.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.k1 f24195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.l1 f24196c;

    public /* synthetic */ a1(androidx.camera.core.impl.l1 l1Var, androidx.camera.core.impl.k1 k1Var, int i13) {
        this.f24194a = i13;
        this.f24196c = l1Var;
        this.f24195b = k1Var;
    }

    @Override // androidx.camera.core.impl.k1
    public final void b(androidx.camera.core.impl.l1 l1Var) {
        int i13 = this.f24194a;
        androidx.camera.core.impl.k1 k1Var = this.f24195b;
        androidx.camera.core.impl.l1 l1Var2 = this.f24196c;
        switch (i13) {
            case 0:
                c1 c1Var = (c1) l1Var2;
                c1Var.getClass();
                k1Var.b(c1Var);
                break;
            default:
                sp2.i iVar = (sp2.i) l1Var2;
                iVar.getClass();
                k1Var.b(iVar);
                break;
        }
    }
}
