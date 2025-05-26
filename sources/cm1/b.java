package cm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.l;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f28006j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f28007k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f28008l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f28009i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28009i) {
            case 0:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, null, fm1.c.GONE, 95);
            case 1:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f139356i = zl1.a.tertiary_button;
                bind.a(yl1.d.TRANSPARENT.getColorPalette());
                return Unit.f80348a;
            default:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f28017f;
        }
    }
}
