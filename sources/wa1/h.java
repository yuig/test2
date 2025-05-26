package wa1;

import dl1.s;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import va1.c0;
import va1.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        w wVar = (w) this.receiver;
        Iterator it = CollectionsKt.F0(wVar.f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (((s) it.next()) instanceof c0) {
                break;
            }
            i13++;
        }
        if (i13 != -1 && !Intrinsics.d(wVar.f125269w, bool)) {
            wVar.f125269w = bool;
            wVar.u1(i13, new c0(booleanValue));
        }
        return Unit.f80348a;
    }
}
