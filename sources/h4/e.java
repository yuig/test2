package h4;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f67535j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f67536k = new e(2);

    /* renamed from: l, reason: collision with root package name */
    public static final e f67537l = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67538i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f67538i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f67538i) {
            case 0:
                float[] fArr = ((b3.i0) obj).f21330a;
                break;
            case 1:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                r2.s sVar = b4.f0.f21549a;
                Boolean bool = Boolean.FALSE;
                b4.g gVar = ((!Intrinsics.d(obj2, bool) || (sVar instanceof b4.e0)) && obj2 != null) ? (b4.g) sVar.f106064b.invoke(obj2) : null;
                Intrinsics.f(gVar);
                Object obj3 = list.get(1);
                int i13 = b4.p0.f21640c;
                r2.s sVar2 = b4.f0.f21564p;
                b4.p0 p0Var = ((!Intrinsics.d(obj3, bool) || (sVar2 instanceof b4.e0)) && obj3 != null) ? (b4.p0) sVar2.f106064b.invoke(obj3) : null;
                Intrinsics.f(p0Var);
                break;
            case 2:
                break;
            default:
                int i14 = ((n) obj).f67594a;
                break;
        }
        return Unit.f80348a;
    }
}
