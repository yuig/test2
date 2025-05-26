package cn1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28129i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f28112j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f28113k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f28114l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f28115m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f28116n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f28117o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f28118p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f28119q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f28120r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f28121s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f28122t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f28123u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f28124v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f28125w = new a(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a f28126x = new a(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a f28127y = new a(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a f28128z = new a(16);
    public static final a A = new a(17);
    public static final a B = new a(18);
    public static final a C = new a(19);
    public static final a D = new a(20);
    public static final a E = new a(21);
    public static final a F = new a(22);
    public static final a G = new a(23);
    public static final a H = new a(24);
    public static final a I = new a(25);

    /* renamed from: J, reason: collision with root package name */
    public static final a f28111J = new a(26);
    public static final a K = new a(27);
    public static final a L = new a(28);
    public static final a M = new a(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f28129i = i13;
    }

    public final List b(d checkAndApplyDiff) {
        switch (this.f28129i) {
            case 12:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28164m;
            case 13:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28165n;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28163l;
        }
    }

    public final u50.i0 e(d checkAndApplyDiff) {
        switch (this.f28129i) {
            case 5:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28155d;
            case 6:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28154c;
            case 7:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28155d;
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28152a;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28153b;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f28129i;
        switch (i13) {
            case 0:
                y it = (y) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return y.e(it, null, null, 0, fm1.c.GONE, null, null, null, 65407);
            case 1:
                d it2 = (d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return d.e(it2, null, null, null, null, null, null, null, null, fm1.c.VISIBLE, null, null, 507903);
            case 2:
                Intrinsics.checkNotNullParameter((gm1.c) obj, "it");
                return Unit.f80348a;
            case 3:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f28170s);
            case 4:
                n bind = (n) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28216h = null;
                return Unit.f80348a;
            case 5:
                return e((d) obj);
            case 6:
                return e((d) obj);
            case 7:
                return e((d) obj);
            case 8:
                return e((d) obj);
            case 9:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f28162k;
            case 10:
                d checkAndApplyDiff3 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff3.f28169r);
            case 11:
                d checkAndApplyDiff4 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f28156e;
            case 12:
                return b((d) obj);
            case 13:
                return b((d) obj);
            case 14:
                return b((d) obj);
            case 15:
                d checkAndApplyDiff5 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f28166o;
            case 16:
                d checkAndApplyDiff6 = (d) obj;
                switch (i13) {
                    case 16:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f28157f;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff6.f28158g;
                }
            case 17:
                d checkAndApplyDiff7 = (d) obj;
                switch (i13) {
                    case 16:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f28157f;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff7.f28158g;
                }
            case 18:
                d checkAndApplyDiff8 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff8, "$this$checkAndApplyDiff");
                return checkAndApplyDiff8.f28159h;
            case 19:
                return e((d) obj);
            case 20:
                y checkAndApplyDiff9 = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff9, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff9.f28254n);
            case 21:
                om1.q bind2 = (om1.q) obj;
                switch (i13) {
                    case 21:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(om1.f.TRANSPARENT_DARK_GRAY);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(om1.f.TRANSPARENT_DARK_GRAY);
                        break;
                }
                return Unit.f80348a;
            case 22:
                om1.q bind3 = (om1.q) obj;
                switch (i13) {
                    case 21:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.d(om1.f.TRANSPARENT_DARK_GRAY);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.d(om1.f.TRANSPARENT_DARK_GRAY);
                        break;
                }
                return Unit.f80348a;
            case 23:
                rn1.k bind4 = (rn1.k) obj;
                switch (i13) {
                    case 23:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f108897l = f0.gestalt_searchfield_helper_text;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f108897l = f0.gestalt_searchfield_label;
                        break;
                }
                return Unit.f80348a;
            case 24:
                rn1.k bind5 = (rn1.k) obj;
                switch (i13) {
                    case 23:
                        Intrinsics.checkNotNullParameter(bind5, "$this$bind");
                        bind5.f108897l = f0.gestalt_searchfield_helper_text;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind5, "$this$bind");
                        bind5.f108897l = f0.gestalt_searchfield_label;
                        break;
                }
                return Unit.f80348a;
            case 25:
                y checkAndApplyDiff10 = (y) obj;
                switch (i13) {
                    case 25:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff10, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff10.f28242b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff10, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff10.f28241a;
                }
            case 26:
                y checkAndApplyDiff11 = (y) obj;
                switch (i13) {
                    case 25:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff11, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff11.f28242b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff11, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff11.f28241a;
                }
            case 27:
                y checkAndApplyDiff12 = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff12, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff12.f28247g);
            case 28:
                y checkAndApplyDiff13 = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff13, "$this$checkAndApplyDiff");
                return checkAndApplyDiff13.f28248h;
            default:
                y checkAndApplyDiff14 = (y) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff14, "$this$checkAndApplyDiff");
                return checkAndApplyDiff14.f28249i;
        }
    }
}
