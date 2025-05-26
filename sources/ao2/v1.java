package ao2;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class v1 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20221e;

    /* renamed from: f, reason: collision with root package name */
    public final lo2.i f20222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2 f20223g;

    public v1(a2 a2Var, lo2.i iVar, int i13) {
        this.f20221e = i13;
        this.f20223g = a2Var;
        this.f20222f = iVar;
    }

    @Override // ao2.r1
    public final boolean i() {
        return false;
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        int i13 = this.f20221e;
        a2 a2Var = this.f20223g;
        lo2.i iVar = this.f20222f;
        switch (i13) {
            case 0:
                a2Var.getClass();
                Object obj = a2.f20111a.get(a2Var);
                if (!(obj instanceof z)) {
                    obj = b2.b(obj);
                }
                ((lo2.h) iVar).i(a2Var, obj);
                break;
            default:
                ((lo2.h) iVar).i(a2Var, Unit.f80348a);
                break;
        }
    }
}
