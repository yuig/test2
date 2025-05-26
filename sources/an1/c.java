package an1;

import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15719i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f15702j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f15703k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f15704l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f15705m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f15706n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f15707o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f15708p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f15709q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f15710r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f15711s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f15712t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f15713u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f15714v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f15715w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f15716x = new c(14);

    /* renamed from: y, reason: collision with root package name */
    public static final c f15717y = new c(15);

    /* renamed from: z, reason: collision with root package name */
    public static final c f15718z = new c(16);
    public static final c A = new c(17);
    public static final c B = new c(18);
    public static final c C = new c(19);
    public static final c D = new c(20);
    public static final c E = new c(21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f15719i = i13;
    }

    public final Integer b(l checkAndApplyDiff) {
        switch (this.f15719i) {
            case 13:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f15748f.getVisibility());
            case 14:
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f15747e);
            case 15:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f15750h);
        }
    }

    public final i0 e(e checkAndApplyDiff) {
        switch (this.f15719i) {
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15722a;
            case 9:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15723b;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15724c;
        }
    }

    public final i0 f(l checkAndApplyDiff) {
        switch (this.f15719i) {
            case 14:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15749g;
            case 15:
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15745c;
            case 16:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15743a;
            case 17:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f15744b;
        }
    }

    public final void h(rn1.k bind) {
        switch (this.f15719i) {
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = bn1.b.radio_button_subtext;
                bind.a(e0.b(vn1.b.START));
                bind.h(vn1.g.BODY_100);
                bind.b(vn1.c.SUBTLE);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = bn1.b.radio_group_error_text;
                bind.a(e0.b(vn1.b.START));
                bind.h(vn1.g.BODY_100);
                bind.b(vn1.c.ERROR);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = bn1.b.radio_group_helper_text;
                bind.a(e0.b(vn1.b.START));
                bind.h(vn1.g.BODY_100);
                bind.b(vn1.c.SUBTLE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15719i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f15701d);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f15700c.getVisibility());
                }
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff2.f15698a);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff2.f15699b);
                }
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff3.f15698a);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff3.f15699b);
                }
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f15701d);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.f15700c.getVisibility());
                }
            case 4:
                h((rn1.k) obj);
                return Unit.f80348a;
            case 5:
                e checkAndApplyDiff5 = (e) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff5.f15726e);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff5.f15725d);
                }
            case 6:
                e checkAndApplyDiff6 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff6.f15727f);
            case 7:
                e checkAndApplyDiff7 = (e) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff7.f15726e);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                        return Boolean.valueOf(checkAndApplyDiff7.f15725d);
                }
            case 8:
                return e((e) obj);
            case 9:
                return e((e) obj);
            case 10:
                return e((e) obj);
            case 11:
                h((rn1.k) obj);
                return Unit.f80348a;
            case 12:
                h((rn1.k) obj);
                return Unit.f80348a;
            case 13:
                return b((l) obj);
            case 14:
                return f((l) obj);
            case 15:
                return b((l) obj);
            case 16:
                return f((l) obj);
            case 17:
                return f((l) obj);
            case 18:
                return f((l) obj);
            case 19:
                l checkAndApplyDiff8 = (l) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff8, "$this$checkAndApplyDiff");
                return checkAndApplyDiff8.f15746d;
            case 20:
                return b((l) obj);
            default:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
        }
    }
}
