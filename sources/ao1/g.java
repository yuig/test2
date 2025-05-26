package ao1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xn1.l;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f20076j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f20077k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f20078l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f20079m = new g(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f20080i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f20080i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, l.counter_max_length, null, null, null, null, null, false, null, null, 2095103);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.SUBTLE, e0.b(vn1.b.START), null, null, 0, null, null, null, null, false, l.helper_text, null, null, null, null, null, false, null, null, 2095097);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20080i;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f20037h);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f20038i);
                }
            default:
                b checkAndApplyDiff2 = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f20037h);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f20038i);
                }
        }
    }
}
