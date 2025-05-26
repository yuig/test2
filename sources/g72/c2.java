package g72;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final c2 f63950j = new c2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c2 f63951k = new c2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c2 f63952l = new c2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c2 f63953m = new c2(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63954i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i13) {
        super(2);
        this.f63954i = i13;
    }

    public final ro2.n b(String str, ro2.n value) {
        switch (this.f63954i) {
            case 0:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                return ro2.o.b((String) CollectionsKt.R(ro2.o.f(value).f108979a.keySet()));
            case 1:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String key = ro2.o.g(value).b();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Unit unit = Unit.f80348a;
                ro2.c0 element = new ro2.c0(linkedHashMap2);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                return new ro2.c0(linkedHashMap);
            case 2:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                return ro2.o.b((String) CollectionsKt.R(ro2.o.f(value).f108979a.keySet()));
            default:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                String key2 = ro2.o.g(value).b();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Unit unit2 = Unit.f80348a;
                ro2.c0 element2 = new ro2.c0(linkedHashMap4);
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(element2, "element");
                return new ro2.c0(linkedHashMap3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f63954i) {
        }
        return b((String) obj, (ro2.n) obj2);
    }
}
