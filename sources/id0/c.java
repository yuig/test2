package id0;

import java.util.HashMap;
import java.util.List;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends p implements l {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String p13 = (String) obj2;
        List p23 = (List) obj3;
        Intrinsics.checkNotNullParameter(p13, "p1");
        Intrinsics.checkNotNullParameter(p23, "p2");
        e eVar = (e) this.receiver;
        eVar.getClass();
        md0.a aVar = md0.a.RECENT_PINS_IDEA_STREAM_TAPPED;
        HashMap hashMap = new HashMap();
        hashMap.put("pin_id", p23.get(intValue));
        aVar.setAuxData(hashMap);
        eVar.t3(aVar);
        return Unit.f80348a;
    }
}
