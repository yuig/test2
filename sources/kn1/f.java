package kn1;

import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.k;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f80251j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f80252k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f80253l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f80254m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f80255n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f80256o = new f(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f f80257p = new f(6);

    /* renamed from: q, reason: collision with root package name */
    public static final f f80258q = new f(7);

    /* renamed from: r, reason: collision with root package name */
    public static final f f80259r = new f(8);

    /* renamed from: s, reason: collision with root package name */
    public static final f f80260s = new f(9);

    /* renamed from: t, reason: collision with root package name */
    public static final f f80261t = new f(10);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f80262i = i13;
    }

    public final Boolean b(b checkAndApplyDiff) {
        switch (this.f80262i) {
            case 0:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f80241i);
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f80233a);
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f80234b);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80262i;
        switch (i13) {
            case 0:
                return b((b) obj);
            case 1:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f80238f;
            case 2:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f80239g;
            case 3:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f80240h;
            case 4:
                b checkAndApplyDiff4 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f80242j;
            case 5:
                b checkAndApplyDiff5 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f80235c;
            case 6:
                b checkAndApplyDiff6 = (b) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f80236d;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f80237e;
                }
            case 7:
                b checkAndApplyDiff7 = (b) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f80236d;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f80237e;
                }
            case 8:
                return b((b) obj);
            case 9:
                return b((b) obj);
            default:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(e0.b(vn1.b.START));
                bind.h(vn1.g.HEADING_400);
                return Unit.f80348a;
        }
    }
}
