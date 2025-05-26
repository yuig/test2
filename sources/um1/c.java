package um1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f122790j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f122791k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f122792l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f122793m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f122794n = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f122795i = i13;
    }

    public final Integer b(b checkAndApplyDiff) {
        switch (this.f122795i) {
            case 0:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f122788c.getVisibility());
            case 1:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f122786a;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff.f122789d);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122795i) {
            case 0:
                return b((b) obj);
            case 1:
                return b((b) obj);
            case 2:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f122787b;
            case 3:
                return b((b) obj);
            default:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, null, fm1.c.GONE, 0, 11);
        }
    }
}
