package ln1;

import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f84009j = new i(1);

    /* renamed from: k, reason: collision with root package name */
    public static final i f84010k = new i(2);

    /* renamed from: l, reason: collision with root package name */
    public static final i f84011l = new i(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84012i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f84012i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84012i;
        switch (i13) {
            case 0:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = o.gestalt_spinner_label;
                bind.a(e0.b(vn1.b.CENTER));
                break;
            case 2:
                l bind2 = (l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(fm1.c.GONE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.d(fm1.c.VISIBLE);
                        break;
                }
                break;
            default:
                l bind3 = (l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.d(fm1.c.GONE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.d(fm1.c.VISIBLE);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
