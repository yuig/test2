package nn1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f91544j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f91545k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f91546l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f91547m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f91548n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f91549o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f91550p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f91551q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f91552r = new d(8);

    /* renamed from: s, reason: collision with root package name */
    public static final d f91553s = new d(9);

    /* renamed from: t, reason: collision with root package name */
    public static final d f91554t = new d(10);

    /* renamed from: u, reason: collision with root package name */
    public static final d f91555u = new d(11);

    /* renamed from: v, reason: collision with root package name */
    public static final d f91556v = new d(12);

    /* renamed from: w, reason: collision with root package name */
    public static final d f91557w = new d(13);

    /* renamed from: x, reason: collision with root package name */
    public static final d f91558x = new d(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f91559i = i13;
    }

    public final Integer b(b checkDiff) {
        switch (this.f91559i) {
            case 4:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                return Integer.valueOf(checkDiff.f91536b.f91565d);
            case 5:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkDiff.f91536b.f91563b);
            case 7:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkDiff.f91542h.getVisibility());
            case 8:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkDiff.f91536b.f91562a);
            case 9:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkDiff.f91543i);
            case 10:
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkDiff.f91536b.f91564c);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91559i;
        switch (i13) {
            case 0:
                Unit it = (Unit) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f80348a;
            case 1:
                Unit it2 = (Unit) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f80348a;
            case 2:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f91539e);
            case 3:
                b checkDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                return checkDiff.f91540f;
            case 4:
                return b((b) obj);
            case 5:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f91541g;
            case 6:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f91535a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f91537c;
                }
            case 7:
                return b((b) obj);
            case 8:
                return b((b) obj);
            case 9:
                return b((b) obj);
            case 10:
                return b((b) obj);
            case 11:
                return b((b) obj);
            case 12:
                b checkAndApplyDiff4 = (b) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f91535a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f91537c;
                }
            case 13:
                b checkAndApplyDiff5 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f91538d.getEllipsize();
            default:
                b it3 = (b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return b.e(it3, null, null, fm1.c.GONE, 383);
        }
    }
}
