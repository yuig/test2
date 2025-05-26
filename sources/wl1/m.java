package wl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f130197j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f130198k = new m(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m f130199l = new m(2);

    /* renamed from: m, reason: collision with root package name */
    public static final m f130200m = new m(3);

    /* renamed from: n, reason: collision with root package name */
    public static final m f130201n = new m(4);

    /* renamed from: o, reason: collision with root package name */
    public static final m f130202o = new m(5);

    /* renamed from: p, reason: collision with root package name */
    public static final m f130203p = new m(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f130204i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130204i;
        switch (i13) {
            case 0:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f130182d;
            case 1:
                c checkAndApplyDiff2 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff2.f130184f);
            case 2:
                c checkAndApplyDiff3 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f130185g;
            case 3:
                c checkAndApplyDiff4 = (c) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f130179a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f130180b;
                }
            case 4:
                c checkAndApplyDiff5 = (c) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f130179a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f130180b;
                }
            case 5:
                c checkAndApplyDiff6 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.f130181c;
            default:
                c checkAndApplyDiff7 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.f130183e;
        }
    }
}
