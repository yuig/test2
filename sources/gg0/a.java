package gg0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64910i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f64893j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f64894k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f64895l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f64896m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f64897n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f64898o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f64899p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f64900q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f64901r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f64902s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f64903t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f64904u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f64905v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f64906w = new a(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a f64907x = new a(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a f64908y = new a(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a f64909z = new a(16);
    public static final a A = new a(17);
    public static final a B = new a(18);
    public static final a C = new a(19);
    public static final a D = new a(20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f64910i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f64910i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 4:
            case 6:
            case 7:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "displayState");
                u50.i0 i0Var = it.f108849g;
                List alignment = kotlin.collections.e0.b(vn1.b.CENTER);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                rn1.b ellipsize = rn1.b.END;
                Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
                return new rn1.a(i0Var, it.f108850h, alignment, it.f108852j, it.f108853k, 2, it.f108855m, ellipsize, null, it.f108858p, it.f108859q, it.f108860r, it.f108861s, it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.PIN), rm1.c.LIGHT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096639);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096639);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f64910i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, null, null, null, 0, null, 1021);
            case 3:
            case 5:
            case 8:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, true, null, null, null, null, null, null, 0, null, 1021);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.cancel), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64910i;
        switch (i13) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.h(vn1.g.BODY_400);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.h(vn1.g.BODY_400);
                        break;
                }
                break;
            case 1:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.h(vn1.g.BODY_400);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.h(vn1.g.BODY_400);
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                wl1.c it = (wl1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                an1.h bind3 = (an1.h) obj;
                switch (i13) {
                    case 18:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f15735e = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f15735e = false;
                        break;
                }
                break;
            case 19:
                an1.h bind4 = (an1.h) obj;
                switch (i13) {
                    case 18:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f15735e = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f15735e = false;
                        break;
                }
                break;
            default:
                yl1.l bind5 = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind5, "$this$bind");
                bind5.f139349b = true;
                break;
        }
        return Unit.f80348a;
    }
}
