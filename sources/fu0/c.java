package fu0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rm1.k;
import rm1.l;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f62958j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f62959k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f62960l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f62961m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f62962n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f62963o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f62964p = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f62965i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f62965i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.cancel), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62965i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                l standard = (l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.b(rm1.i.XXL);
                break;
            case 3:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(f62960l);
                break;
            case 4:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
