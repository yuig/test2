package r1;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w80.a1;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105921i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f105922j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, Function1 function1) {
        super(2);
        this.f105921i = i13;
        this.f105922j = function1;
    }

    public final void b(int i13, q3.x coordinates) {
        int i14 = this.f105921i;
        Function1 function1 = this.f105922j;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                if (i13 == w80.z.f128441g.f128277d) {
                    function1.invoke(coordinates);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                if (i13 == a1.f128251d.f128291d) {
                    function1.invoke(coordinates);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f105921i;
        Function1 function1 = this.f105922j;
        switch (i13) {
            case 0:
                ((Number) obj2).intValue();
                return new d(((d) function1.invoke((s) obj)).f105872a);
            case 1:
                b(((Number) obj).intValue(), (q3.x) obj2);
                return Unit.f80348a;
            case 2:
                b(((Number) obj).intValue(), (q3.x) obj2);
                return Unit.f80348a;
            default:
                int intValue = ((Number) obj).intValue();
                String str = (String) obj2;
                HashMap hashMap = new HashMap();
                hashMap.put("story_pin_page_id", String.valueOf(intValue));
                hashMap.put("story_pin_raw_index", String.valueOf(intValue));
                if (str != null) {
                }
                for (Map.Entry entry : ((Map) function1.invoke(Integer.valueOf(intValue))).entrySet()) {
                    hashMap.put((String) entry.getKey(), (String) entry.getValue());
                }
                return hashMap;
        }
    }
}
