package do1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final s f55693j = new s(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s f55694k = new s(1);

    /* renamed from: l, reason: collision with root package name */
    public static final s f55695l = new s(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13) {
        super(1);
        this.f55696i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55696i) {
            case 0:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f55670f);
            case 1:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, 5000, false, 479);
            default:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f55667c;
        }
    }
}
