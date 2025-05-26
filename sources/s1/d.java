package s1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f110375j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f110376k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110377i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f110377i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110377i) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new e(intValue, ((Float) obj3).floatValue(), new c(list, 0));
            default:
                return Unit.f80348a;
        }
    }
}
