package dm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f55368j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f55369k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f55370l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f55371m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f55372n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f55373o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f55374p = new i(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55375i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f55375i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f55375i;
        switch (i13) {
            case 0:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f55358d;
            case 1:
                c checkAndApplyDiff2 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff2.f55361g);
            case 2:
                c checkAndApplyDiff3 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f55362h;
            case 3:
                c checkAndApplyDiff4 = (c) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f55355a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff4.f55356b;
                }
            case 4:
                c checkAndApplyDiff5 = (c) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f55355a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff5.f55356b;
                }
            case 5:
                c checkAndApplyDiff6 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.f55357c;
            default:
                c checkAndApplyDiff7 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.f55359e;
        }
    }
}
