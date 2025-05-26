package ul2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122591i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f122592j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f122593k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, v0 v0Var) {
        super(0);
        this.f122592j = t0Var;
        this.f122593k = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sm2.c cVar;
        int i13 = this.f122591i;
        v0 v0Var = this.f122593k;
        t0 t0Var = this.f122592j;
        switch (i13) {
            case 0:
                return v0Var.k(t0Var.c(), f0.DECLARED);
            default:
                t0Var.getClass();
                rl2.u uVar = t0.f122608g[0];
                fm2.c cVar2 = (fm2.c) t0Var.f122609c.invoke();
                String str = (cVar2 == null || (cVar = cVar2.f62577b) == null || cVar.f113274a != sm2.b.MULTIFILE_CLASS_PART) ? null : cVar.f113279f;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return v0Var.f122618b.getClassLoader().loadClass(kotlin.text.z.m(str, '/', '.'));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, t0 t0Var) {
        super(0);
        this.f122593k = v0Var;
        this.f122592j = t0Var;
    }
}
