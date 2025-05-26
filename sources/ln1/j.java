package ln1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f84013j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f84014k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f84015l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f84016m = new j(3);

    /* renamed from: n, reason: collision with root package name */
    public static final j f84017n = new j(4);

    /* renamed from: o, reason: collision with root package name */
    public static final j f84018o = new j(5);

    /* renamed from: p, reason: collision with root package name */
    public static final j f84019p = new j(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84020i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f84020i = i13;
    }

    public final Integer b(d checkAndApplyDiff) {
        switch (this.f84020i) {
            case 0:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkDiff");
                break;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                break;
        }
        return Integer.valueOf(checkAndApplyDiff.f84004f);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84020i) {
            case 0:
                return b((d) obj);
            case 1:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f84000b;
            case 2:
                d checkDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                return checkDiff.f83999a;
            case 3:
                d checkDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkDiff");
                return checkDiff2.f84003e;
            case 4:
                return b((d) obj);
            case 5:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f84002d;
            default:
                return b((d) obj);
        }
    }
}
