package ao1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f20053j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f20054k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f20055l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f20056m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f20057n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f20058o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f20059p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f20060q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f20061r = new d(8);

    /* renamed from: s, reason: collision with root package name */
    public static final d f20062s = new d(9);

    /* renamed from: t, reason: collision with root package name */
    public static final d f20063t = new d(10);

    /* renamed from: u, reason: collision with root package name */
    public static final d f20064u = new d(11);

    /* renamed from: v, reason: collision with root package name */
    public static final d f20065v = new d(12);

    /* renamed from: w, reason: collision with root package name */
    public static final d f20066w = new d(13);

    /* renamed from: x, reason: collision with root package name */
    public static final d f20067x = new d(14);

    /* renamed from: y, reason: collision with root package name */
    public static final d f20068y = new d(15);

    /* renamed from: z, reason: collision with root package name */
    public static final d f20069z = new d(16);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20070i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f20070i = i13;
    }

    public final Boolean b(b checkAndApplyDiff) {
        switch (this.f20070i) {
            case 2:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f20041l);
            case 3:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f20042m);
            case 7:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f20044o);
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f20036g);
        }
    }

    public final List e(b checkAndApplyDiff) {
        switch (this.f20070i) {
            case 9:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20046q;
            case 10:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20047r;
            case 11:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20048s;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20049t;
        }
    }

    public final i0 f(b checkAndApplyDiff) {
        switch (this.f20070i) {
            case 4:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20030a;
            case 13:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20031b;
            case 14:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20032c;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f20034e;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20070i;
        switch (i13) {
            case 0:
                xn1.j it = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
            case 1:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f20039j);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f20051v);
                }
            case 2:
                return b((b) obj);
            case 3:
                return b((b) obj);
            case 4:
                return f((b) obj);
            case 5:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f20035f;
            case 6:
                b checkAndApplyDiff3 = (b) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff3.f20039j);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff3.f20051v);
                }
            case 7:
                return b((b) obj);
            case 8:
                b checkAndApplyDiff4 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f20043n;
            case 9:
                return e((b) obj);
            case 10:
                return e((b) obj);
            case 11:
                return e((b) obj);
            case 12:
                return e((b) obj);
            case 13:
                return f((b) obj);
            case 14:
                return f((b) obj);
            case 15:
                return f((b) obj);
            default:
                return b((b) obj);
        }
    }
}
