package o82;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f2 f93584j = new f2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f2 f93585k = new f2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f2 f93586l = new f2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f2 f93587m = new f2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f2 f93588n = new f2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f2 f93589o = new f2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f2 f93590p = new f2(6);

    /* renamed from: q, reason: collision with root package name */
    public static final f2 f93591q = new f2(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i13) {
        super(1);
        this.f93592i = i13;
    }

    public final y0 b(y0 it) {
        w wVar = w.f93734e;
        switch (this.f93592i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                it.getClass();
                return y0.e(q0Var, wVar, false);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                kotlin.collections.q0 q0Var2 = kotlin.collections.q0.f80391a;
                t tVar = t.f93712e;
                it.getClass();
                return y0.e(q0Var2, tVar, false);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y0.f(it, null, wVar, 1);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return y0.f(it, null, u.f93720e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93592i;
        switch (i13) {
            case 0:
                return b((y0) obj);
            case 1:
                return b((y0) obj);
            case 2:
                i2 it = (i2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return i2.b(it, null, l.f93651a, 1);
            case 3:
                return b((y0) obj);
            case 4:
                return b((y0) obj);
            case 5:
                l82.i0 it2 = (l82.i0) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                    case 6:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                }
            case 6:
                l82.i0 it3 = (l82.i0) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3;
                    case 6:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3;
                }
            default:
                l82.i0 it4 = (l82.i0) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4;
                    case 6:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4;
                }
        }
    }
}
