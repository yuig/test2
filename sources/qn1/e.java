package qn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f104475j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f104476k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f104477l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f104478m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f104479n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f104480o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f104481p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f104482q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f104483r = new e(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f104484i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104484i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff.f104473g);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff.f104472f);
                }
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f104469c;
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff3.f104473g);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff3.f104472f);
                }
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f104474h);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f104471e.getVisibility());
                }
            case 4:
                b checkAndApplyDiff5 = (b) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f104474h);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f104471e.getVisibility());
                }
            case 5:
                b checkAndApplyDiff6 = (b) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f104467a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f104468b;
                }
            case 6:
                b checkAndApplyDiff7 = (b) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f104467a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f104468b;
                }
            case 7:
                b checkAndApplyDiff8 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff8, "$this$checkAndApplyDiff");
                return checkAndApplyDiff8.f104470d;
            default:
                b checkAndApplyDiff9 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff9, "$this$checkAndApplyDiff");
                return checkAndApplyDiff9.f104469c.getStartIcon$tag_release();
        }
    }
}
