package ei2;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58994i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f58995j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Long f58996k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f58997l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f58998m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Long l13, k kVar, Map map, int i13) {
        super(0);
        this.f58994i = i13;
        this.f58995j = str;
        this.f58996k = l13;
        this.f58997l = kVar;
        this.f58998m = map;
    }

    public final oi2.c b() {
        long millis;
        long millis2;
        int i13 = this.f58994i;
        oi2.c cVar = null;
        Map map = this.f58998m;
        String name = this.f58995j;
        k kVar = this.f58997l;
        Long l13 = this.f58996k;
        switch (i13) {
            case 0:
                if (l13 != null) {
                    millis = kh2.w.q0(l13.longValue());
                } else {
                    millis = TimeUnit.NANOSECONDS.toMillis(kVar.f59000b.now());
                }
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(name, "name");
                if (name.length() <= 100 && (map == null || map.size() <= 10)) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(millis);
                    if (map == null) {
                        map = z0.d();
                    }
                    cVar = new oi2.c(name, nanos, map);
                    break;
                }
                break;
            default:
                if (l13 != null) {
                    millis2 = kh2.w.q0(l13.longValue());
                } else {
                    millis2 = TimeUnit.NANOSECONDS.toMillis(kVar.f59000b.now());
                }
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(name, "name");
                if (name.length() <= 100 && (map == null || map.size() <= 10)) {
                    long nanos2 = TimeUnit.MILLISECONDS.toNanos(millis2);
                    if (map == null) {
                        map = z0.d();
                    }
                    cVar = new oi2.c(name, nanos2, map);
                    break;
                }
                break;
        }
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58994i) {
        }
        return b();
    }
}
