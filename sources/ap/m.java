package ap;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20276i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f20277j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13, HashMap hashMap) {
        super(1);
        this.f20276i = i13;
        this.f20277j = hashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20276i;
        Map map = this.f20277j;
        switch (i13) {
            case 0:
                map.size();
                break;
            default:
                ro2.f addJsonArray = (ro2.f) obj;
                Intrinsics.checkNotNullParameter(addJsonArray, "$this$addJsonArray");
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    ro2.n element = (ro2.n) entry.getValue();
                    ro2.n nVar = (ro2.n) ro2.o.f(element).get("unique");
                    if (nVar == null || !Intrinsics.d(ro2.o.d(ro2.o.g(nVar)), Boolean.TRUE)) {
                        kg.o.e(addJsonArray, new kw1.c(str, 12));
                        Intrinsics.checkNotNullParameter(element, "element");
                        addJsonArray.f108985a.add(element);
                    } else {
                        kg.o.e(addJsonArray, new kw1.c(str, 11));
                        z0.r(ro2.o.f(element)).remove("unique");
                        kg.o.e(addJsonArray, new s12.a(element, 21));
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
