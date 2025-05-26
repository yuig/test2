package ul2;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f122522j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f122523k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f122524l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f122525m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f122526n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f122527o = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f122528i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence b(am2.i1 i1Var) {
        switch (this.f122528i) {
            case 4:
                an2.y yVar = z1.f122650a;
                pn2.b0 type = ((dm2.c1) i1Var).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return z1.e(type);
            default:
                an2.y yVar2 = z1.f122650a;
                pn2.b0 type2 = ((dm2.c1) i1Var).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                return z1.e(type2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122528i) {
            case 0:
                Class<?> returnType = ((Method) obj).getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                break;
            case 1:
                Class cls = (Class) obj;
                Intrinsics.f(cls);
                break;
            case 2:
                am2.x descriptor = (am2.x) obj;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                break;
            case 3:
                am2.r0 descriptor2 = (am2.r0) obj;
                Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                break;
        }
        return b((am2.i1) obj);
    }
}
