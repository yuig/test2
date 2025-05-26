package xo0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f135575j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f135576k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f135577l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f135578m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f135579n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f135580o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f135581p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f135582q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f135583r = new c(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135584i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f135584i = i13;
    }

    public final rl1.q b(rl1.q it) {
        switch (this.f135584i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, null, null, false, false, fm1.c.VISIBLE, 0, null, null, 1919);
            case 5:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, null, null, false, false, fm1.c.VISIBLE, 0, null, null, 1919);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, rl1.r.XS, null, false, false, null, 0, null, null, 2039);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, null, null, false, false, fm1.c.GONE, 0, null, null, 1919);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f135584i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, vn1.g.BODY_100, vn1.g.BODY_300, null, null, false, null, null, 2072575);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.UI_300;
                vn1.c cVar = vn1.c.LIGHT;
                rn1.b bVar = rn1.b.END;
                return rn1.a.y(it, null, cVar, e0.b(vn1.b.CENTER), e0.b(vn1.e.BOLD), gVar, 1, null, bVar, null, null, false, 0, null, null, null, null, null, false, null, null, 2096961);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.BODY_300, 1, fm1.c.GONE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096911);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.b bVar2 = rn1.b.END;
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), vn1.g.HEADING_XL, 2, null, bVar2, null, null, false, 0, null, null, null, null, null, false, null, null, 2096967);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135584i) {
            case 1:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122909q = 3;
                bind.f122910r = new k0(x0.more_no_dot);
                bind.f122911s = new un1.k(vn1.h.f126278d, vn1.e.BOLD, vn1.h.f126277c);
                break;
        }
        return b((rl1.q) obj);
    }
}
