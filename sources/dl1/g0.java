package dl1;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f55223j = new g0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f55224k = new g0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f55225l = new g0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f55226m = new g0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g0 f55227n = new g0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g0 f55228o = new g0(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55229i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i13) {
        super(1);
        this.f55229i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55229i) {
            case 0:
                q entry = (q) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(entry.f55265a != null);
            case 1:
                q entry2 = (q) obj;
                Intrinsics.checkNotNullParameter(entry2, "entry");
                s sVar = entry2.f55265a;
                Intrinsics.f(sVar);
                return sVar;
            case 2:
                xk2.w it = (xk2.w) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f135236c != null);
            case 3:
                xk2.w it2 = (xk2.w) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                s sVar2 = (s) it2.f135235b;
                Object obj2 = it2.f135236c;
                Intrinsics.f(obj2);
                return new v0(sVar2, (s) obj2);
            case 4:
                Pair it3 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return (s) it3.f80347b;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                return uj2.b0.j(kotlin.collections.q0.f80391a);
        }
    }
}
