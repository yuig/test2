package y01;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g1 f136403j = new g1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g1 f136404k = new g1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g1 f136405l = new g1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g1 f136406m = new g1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g1 f136407n = new g1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g1 f136408o = new g1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g1 f136409p = new g1(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136410i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i13) {
        super(1);
        this.f136410i = i13;
    }

    public final h0 b(h0 it) {
        e0 e0Var = e0.f136398a;
        switch (this.f136410i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, null, e0Var, 1);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, null, b0.f136385a, 1);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, null, e0Var, 1);
        }
    }

    public final n1 e(n1 it) {
        switch (this.f136410i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return n1.b(it, null, null, false, null, 0, 0, null, 32703);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return n1.b(it, null, null, true, null, 0, 0, null, 32703);
            case 2:
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return n1.b(it, null, null, false, null, 0, 0, null, 16383);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return n1.b(it, null, null, false, null, 0, 0, null, 32703);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f136410i) {
            case 0:
                return e((n1) obj);
            case 1:
                return e((n1) obj);
            case 2:
                return b((h0) obj);
            case 3:
                return b((h0) obj);
            case 4:
                return e((n1) obj);
            case 5:
                return b((h0) obj);
            default:
                return e((n1) obj);
        }
    }
}
