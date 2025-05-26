package lq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f84370j = new n0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f84371k = new n0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f84372l = new n0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n0 f84373m = new n0(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i13) {
        super(1);
        this.f84374i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f84374i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_DARK_GRAY, null, null, false, 0, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.COMPOSE, null, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84374i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return b((om1.c) obj);
            case 2:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                return b((om1.c) obj);
        }
    }
}
