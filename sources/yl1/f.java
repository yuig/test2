package yl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f139310j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f139311k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f139312l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f139313m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f139314n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f139315o = new f(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f f139316p = new f(6);

    /* renamed from: q, reason: collision with root package name */
    public static final f f139317q = new f(7);

    /* renamed from: r, reason: collision with root package name */
    public static final f f139318r = new f(8);

    /* renamed from: s, reason: collision with root package name */
    public static final f f139319s = new f(9);

    /* renamed from: t, reason: collision with root package name */
    public static final f f139320t = new f(10);

    /* renamed from: u, reason: collision with root package name */
    public static final f f139321u = new f(11);

    /* renamed from: v, reason: collision with root package name */
    public static final f f139322v = new f(12);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139323i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f139323i = i13;
    }

    public final Integer b(b checkAndApplyDiff) {
        switch (this.f139323i) {
            case 4:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139302c.getVisibility());
            case 5:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139305f.getRoundBackground());
            case 6:
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139304e.f139325b);
            case 7:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139308i);
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139304e.f139324a);
            case 9:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139305f.getTextSize());
            case 10:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f139305f.getTextSpacingMultiplier());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139323i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f139305f;
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff2.f139301b);
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f139300a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff3.f139303d;
                }
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f139300a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f139303d;
                }
            case 4:
                return b((b) obj);
            case 5:
                return b((b) obj);
            case 6:
                b checkAndApplyDiff5 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f139309j;
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
            default:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
        }
    }
}
