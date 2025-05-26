package p4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q5.v0;
import s3.a2;
import s3.k0;
import t3.c0;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f98775j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f98776k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(j jVar, k0 k0Var, int i13) {
        super(1);
        this.f98774i = i13;
        this.f98775j = jVar;
        this.f98776k = k0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f98774i;
        k0 k0Var = this.f98776k;
        j jVar = this.f98775j;
        switch (i13) {
            case 0:
                a2 a2Var = (a2) obj;
                c0 c0Var = a2Var instanceof c0 ? (c0) a2Var : null;
                if (c0Var != null) {
                    c0Var.k().f116250a.put(jVar, k0Var);
                    c0Var.k().addView(jVar);
                    c0Var.k().f116251b.put(k0Var, jVar);
                    jVar.setImportantForAccessibility(1);
                    v0.o(jVar, new t3.q(c0Var, k0Var, c0Var));
                }
                if (jVar.f98795b.getParent() != jVar) {
                    jVar.addView(jVar.f98795b);
                }
                break;
            case 1:
                k.d(jVar, k0Var);
                break;
            default:
                k.d(jVar, k0Var);
                ((c0) jVar.f98796c).f115907t = true;
                break;
        }
        return Unit.f80348a;
    }
}
