package in1;

import hn1.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.i;
import yl1.l;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f72832j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f72833k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f72834l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f72835m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72836i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f72836i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72836i) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f72828a;
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff2.f72829b);
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f72831d;
            default:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f139356i = t.sheet_button;
                bind.b(yl1.c.LARGE);
                bind.a(i.b());
                return Unit.f80348a;
        }
    }
}
