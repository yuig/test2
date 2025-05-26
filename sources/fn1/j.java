package fn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f62694j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f62695k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f62696l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f62697m = new j(3);

    /* renamed from: n, reason: collision with root package name */
    public static final j f62698n = new j(4);

    /* renamed from: o, reason: collision with root package name */
    public static final j f62699o = new j(5);

    /* renamed from: p, reason: collision with root package name */
    public static final j f62700p = new j(6);

    /* renamed from: q, reason: collision with root package name */
    public static final j f62701q = new j(7);

    /* renamed from: r, reason: collision with root package name */
    public static final j f62702r = new j(8);

    /* renamed from: s, reason: collision with root package name */
    public static final j f62703s = new j(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f62704i = i13;
    }

    public final i0 b(b checkAndApplyDiff) {
        switch (this.f62704i) {
            case 1:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f62685j;
            case 7:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f62678c;
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f62679d;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f62681f;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62704i;
        switch (i13) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = q.gestalt_select_list_helper_text;
                bind.b(vn1.c.SUBTLE);
                break;
            case 2:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                break;
            case 3:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                break;
            case 4:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        break;
                }
            case 5:
                b checkAndApplyDiff4 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                break;
            case 6:
                b checkAndApplyDiff5 = (b) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        break;
                }
        }
        return b((b) obj);
    }
}
