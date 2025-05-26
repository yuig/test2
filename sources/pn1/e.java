package pn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f100746j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f100747k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f100748l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f100749m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f100750n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f100751o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f100752p = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100753i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f100753i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100753i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.f100736b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.f100735a;
                }
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f100740f);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f100738d);
                }
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f100736b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f100735a;
                }
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff4.f100741g);
            case 4:
                b checkAndApplyDiff5 = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f100740f);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff5.f100738d);
                }
            case 5:
                b checkAndApplyDiff6 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.f100742h;
            default:
                b checkAndApplyDiff7 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.f100739e;
        }
    }
}
