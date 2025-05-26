package jm0;

import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.c0;
import lm0.f0;
import lm0.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f76968j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f76969k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f76970l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f76971m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f76972n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f76973o = new h(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h f76974p = new h(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76975i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f76975i = i13;
    }

    public final lm0.a b(lm0.a it) {
        switch (this.f76975i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, sk0.d.e(it.f83838h, null, true, 7), null, null, null, 1919);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, sk0.d.e(it.f83838h, null, false, 7), null, null, null, 1919);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f76975i) {
            case 0:
                f0 state = (f0) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.f83862a;
            case 1:
                c0 state2 = (c0) obj;
                Intrinsics.checkNotNullParameter(state2, "state");
                return state2;
            case 2:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(rm1.q.FILTER);
                bind.d(om1.f.TRANSPARENT_DARK_GRAY);
                bind.f96680e = new k0(y60.e.accessibility_filter_icon);
                bind.e(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 3:
                rn1.k bind2 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.d(e0.b(vn1.e.REGULAR));
                bind2.b(vn1.c.SUBTLE);
                vn1.g gVar = vn1.g.BODY_200;
                bind2.f108899n = gVar;
                bind2.f108900o = gVar;
                bind2.a(e0.b(vn1.b.CENTER_VERTICAL));
                bind2.f108892g = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 4:
                return b((lm0.a) obj);
            case 5:
                return b((lm0.a) obj);
            default:
                x0 it = (x0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, null, null, null, null, null, 1021);
        }
    }
}
