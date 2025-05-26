package hg2;

import cd2.n;
import ha2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c cVar = (c) this.receiver;
        oi2.b bVar = cVar.f69087h;
        uf2.c cVar2 = uf2.c.f122114k;
        if (booleanValue && bVar == null) {
            cVar.e(cVar2, new n(cVar, 8));
        } else if (!booleanValue && bVar != null) {
            cVar.g(cVar2, new i(22, bVar, cVar), false);
        }
        return Unit.f80348a;
    }
}
