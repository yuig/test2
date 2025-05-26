package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f90721j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f90722k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f90723l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f90724m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f90725n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f90726o = new k(5);

    /* renamed from: p, reason: collision with root package name */
    public static final k f90727p = new k(6);

    /* renamed from: q, reason: collision with root package name */
    public static final k f90728q = new k(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f90729i = i13;
    }

    public final u0 b(u0 it) {
        switch (this.f90729i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, null, h0.f90696a, false, null, null, null, null, null, null, null, null, null, 2096127);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, n0.f90743a, null, false, null, null, null, null, null, null, null, null, null, 2096639);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, null, g0.f90685a, false, null, null, null, null, null, null, null, null, null, 2096127);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, null, k0.f90730a, false, null, null, null, null, null, null, null, null, null, 2096127);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, new m0(m60.s0.lego_pin_rounded_rect), null, false, null, null, null, null, null, null, null, null, null, 2096639);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, a3.f90596a, null, 1572863);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, new o0(m60.s0.lego_pin_rounded_rect), null, false, null, null, null, null, null, null, null, null, null, 2096639);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.e(it, 0, null, null, false, null, null, null, null, null, new i0(), false, null, null, null, null, null, null, null, null, null, 2096127);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f90729i) {
        }
        return b((u0) obj);
    }
}
