package em1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f59617j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f59618k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f59619l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f59620m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f59621n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f59622o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f59623p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f59624q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f59625r = new i(8);

    /* renamed from: s, reason: collision with root package name */
    public static final i f59626s = new i(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59627i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f59627i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59627i;
        switch (i13) {
            case 0:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f59600c;
            case 1:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f59598a;
            case 2:
                d checkAndApplyDiff3 = (d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f59603f;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f59602e;
                }
            case 3:
                d checkAndApplyDiff4 = (d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f59603f;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f59602e;
                }
            case 4:
                d checkAndApplyDiff5 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff5.f59607j);
            case 5:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f108897l = p.gestalt_checkbox_helper_text;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.f108897l = p.gestalt_checkbox_label;
                        break;
                }
                return Unit.f80348a;
            case 6:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f108897l = p.gestalt_checkbox_helper_text;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f108897l = p.gestalt_checkbox_label;
                        break;
                }
                return Unit.f80348a;
            case 7:
                c it = (c) obj;
                switch (i13) {
                    case 7:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f80348a;
            case 8:
                c it2 = (c) obj;
                switch (i13) {
                    case 7:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f80348a;
            default:
                d it3 = (d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return d.e(it3, null, null, fm1.c.GONE, null, null, null, 0, null, false, 0, 1019);
        }
    }
}
