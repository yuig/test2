package z10;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f140590j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f140591k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f140592i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140592i) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f80347b != null);
            default:
                Pair it2 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object obj2 = it2.f80346a;
                Object obj3 = it2.f80347b;
                Intrinsics.f(obj3);
                return new Pair(obj2, obj3);
        }
    }
}
