package ul2;

import java.util.concurrent.ConcurrentHashMap;
import kh2.p2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f122488j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f122489k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f122490l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f122491m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f122492n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f122493o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122494i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f122494i = i13;
    }

    public final q1 b(Class it) {
        switch (this.f122494i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                c0 a13 = c.a(it);
                kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                return p2.W(a13, q0Var, false, q0Var);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                c0 a14 = c.a(it);
                kotlin.collections.q0 q0Var2 = kotlin.collections.q0.f80391a;
                return p2.W(a14, q0Var2, true, q0Var2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122494i) {
            case 0:
                return b((Class) obj);
            case 1:
                Intrinsics.checkNotNullParameter((Class) obj, "it");
                return new ConcurrentHashMap();
            case 2:
                return b((Class) obj);
            case 3:
                Class it = (Class) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new c0(it);
            case 4:
                Class it2 = (Class) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new v0(it2);
            default:
                Class cls = (Class) obj;
                Intrinsics.f(cls);
                return gm2.d.b(cls);
        }
    }
}
