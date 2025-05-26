package om1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f96654j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f96655k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f96656l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f96657m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f96658n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f96659o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f96660p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f96661q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f96662r = new i(8);

    /* renamed from: s, reason: collision with root package name */
    public static final i f96663s = new i(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f96664i = i13;
    }

    public final Integer b(c checkAndApplyDiff) {
        switch (this.f96664i) {
            case 1:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f96646h);
            case 2:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f96640b.getIndicatorPlacement());
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f96647i);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96664i;
        switch (i13) {
            case 0:
                um1.d bind = (um1.d) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122799d = v.icon_button_indicator;
                return Unit.f80348a;
            case 1:
                return b((c) obj);
            case 2:
                return b((c) obj);
            case 3:
                return b((c) obj);
            case 4:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f96648j;
            case 5:
                c checkAndApplyDiff2 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f96640b;
            case 6:
                c checkAndApplyDiff3 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff3.f96644f);
            case 7:
                c checkAndApplyDiff4 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f96642d;
            case 8:
                c checkAndApplyDiff5 = (c) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f96643e;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f96645g;
                }
            default:
                c checkAndApplyDiff6 = (c) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f96643e;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f96645g;
                }
        }
    }
}
