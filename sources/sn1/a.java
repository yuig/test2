package sn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.e;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f113299j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f113300k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f113301l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f113302m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f113303n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f113304o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f113305p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f113306q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f113307r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f113308s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f113309t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f113310u = new a(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113311i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f113311i = i13;
    }

    public final Integer b(e checkAndApplyDiff) {
        switch (this.f113311i) {
            case 1:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.getId());
            case 2:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.o();
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.w().getVisibility());
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.p());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f113311i;
        switch (i13) {
            case 0:
                e checkAndApplyDiff = (e) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.i();
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.t();
                }
            case 1:
                return b((e) obj);
            case 2:
                return b((e) obj);
            case 3:
                e checkAndApplyDiff2 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff2.x());
            case 4:
                e checkAndApplyDiff3 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.l();
            case 5:
                e checkAndApplyDiff4 = (e) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.i();
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.t();
                }
            case 6:
                e checkAndApplyDiff5 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.n();
            case 7:
                e checkAndApplyDiff6 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.u();
            case 8:
                return b((e) obj);
            case 9:
                return b((e) obj);
            case 10:
                e checkAndApplyDiff7 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.e();
            default:
                e checkAndApplyDiff8 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff8, "$this$checkAndApplyDiff");
                return checkAndApplyDiff8.v();
        }
    }
}
