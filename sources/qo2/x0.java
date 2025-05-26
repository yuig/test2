package qo2;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104652i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f104653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i13) {
        super(0);
        this.f104652i = i13;
        this.f104653j = y0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList;
        int i13 = this.f104652i;
        y0 y0Var = this.f104653j;
        switch (i13) {
            case 0:
                return Integer.valueOf(kg.n.d(y0Var, (oo2.g[]) y0Var.f104665j.getValue()));
            case 1:
                a0 a0Var = y0Var.f104657b;
                return a0Var != null ? a0Var.d() : w0.f104647b;
            default:
                a0 a0Var2 = y0Var.f104657b;
                if (a0Var2 != null) {
                    no2.b[] b13 = a0Var2.b();
                    arrayList = new ArrayList(b13.length);
                    for (no2.b bVar : b13) {
                        arrayList.add(bVar.a());
                    }
                } else {
                    arrayList = null;
                }
                return w0.b(arrayList);
        }
    }
}
