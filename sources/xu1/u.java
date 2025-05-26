package xu1;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f135977j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f135978k = new u(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f135979l = new u(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f135980i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135980i) {
            case 0:
                i networkType = (i) obj;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                return Boolean.valueOf(networkType.isOnAnyNetwork());
            case 1:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "pair");
                return Boolean.valueOf(pair.f80347b == j.FOREGROUND);
            default:
                Pair pair2 = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair2, "pair");
                return (i) pair2.f80346a;
        }
    }
}
