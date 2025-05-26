package cn1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f28135j = new b0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f28136k = new b0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f28137l = new b0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f28138m = new b0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f28139n = new b0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b0 f28140o = new b0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b0 f28141p = new b0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b0 f28142q = new b0(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13) {
        super(1);
        this.f28143i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f28143i;
        switch (i13) {
            case 0:
                y checkAndApplyDiff = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28243c;
            case 1:
                y checkAndApplyDiff2 = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f28246f;
            case 2:
                y checkAndApplyDiff3 = (y) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f28244d;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f28245e;
                }
            case 3:
                om1.q bind = (om1.q) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f96684i = f0.static_search_bar_trailing_icon;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f96684i = f0.static_search_bar_left_trailing_icon;
                        break;
                }
                return Unit.f80348a;
            case 4:
                y checkAndApplyDiff4 = (y) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f28244d;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f28245e;
                }
            case 5:
                om1.q bind2 = (om1.q) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f96684i = f0.static_search_bar_trailing_icon;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f96684i = f0.static_search_bar_left_trailing_icon;
                        break;
                }
                return Unit.f80348a;
            case 6:
                y checkAndApplyDiff5 = (y) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f28256p;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f28255o;
                }
            default:
                y checkAndApplyDiff6 = (y) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f28256p;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f28255o;
                }
        }
    }
}
