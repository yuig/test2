package am1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f15531j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f15532k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f15533l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f15534m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f15535n = new f(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15536i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f15536i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15536i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15523a;
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff2.f15525c);
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f15527e;
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f15526d.getVisibility());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f15528f);
                }
            default:
                b checkAndApplyDiff5 = (b) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f15526d.getVisibility());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f15528f);
                }
        }
    }
}
