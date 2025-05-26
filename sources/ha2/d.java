package ha2;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = (e) this.receiver;
        Iterator it = eVar.f68430b.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (eVar.f68431c) {
                    int i14 = (1 << intValue) ^ eVar.f68432d;
                    eVar.f68432d = i14;
                    Function1 function1 = eVar.f68433e;
                    if (function1 == null) {
                        Intrinsics.r("actionHandler");
                        throw null;
                    }
                    function1.invoke(Integer.valueOf(i14));
                } else {
                    Function1 function12 = eVar.f68433e;
                    if (function12 == null) {
                        Intrinsics.r("actionHandler");
                        throw null;
                    }
                    function12.invoke(Integer.valueOf(intValue));
                }
                return Unit.f80348a;
            }
            Object next = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            l lVar = (l) next;
            if (!eVar.f68431c) {
                lVar.setSelected(i13 == intValue);
            } else if (i13 == intValue) {
                lVar.setSelected(!lVar.isSelected());
            }
            i13 = i15;
        }
    }
}
