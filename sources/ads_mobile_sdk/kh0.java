package ads_mobile_sdk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class kh0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh0 f7309a = new kh0();

    public kh0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        pm.o oVar = it.i().f91366a;
        Intrinsics.checkNotNullExpressionValue(oVar, "asMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(oVar.f100619d));
        for (Map.Entry entry : oVar.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((nm.s) entry.getValue()).toString());
        }
        return linkedHashMap;
    }
}
