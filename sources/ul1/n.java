package ul1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f122470j = new n(1);

    /* renamed from: k, reason: collision with root package name */
    public static final n f122471k = new n(2);

    /* renamed from: l, reason: collision with root package name */
    public static final n f122472l = new n(3);

    /* renamed from: m, reason: collision with root package name */
    public static final n f122473m = new n(4);

    /* renamed from: n, reason: collision with root package name */
    public static final n f122474n = new n(5);

    /* renamed from: o, reason: collision with root package name */
    public static final n f122475o = new n(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122476i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f122476i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122476i;
        switch (i13) {
            case 0:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
            case 1:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f122453e);
            case 2:
                c checkAndApplyDiff2 = (c) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff2.f122449a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff2.f122450b;
                }
            case 3:
                c checkAndApplyDiff3 = (c) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f122449a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f122450b;
                }
            case 4:
                c checkAndApplyDiff4 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f122452d;
            case 5:
                c checkAndApplyDiff5 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f122451c;
            default:
                c checkAndApplyDiff6 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff6.f122454f);
        }
    }
}
