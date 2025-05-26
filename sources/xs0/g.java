package xs0;

import com.pinterest.api.model.v7;
import h32.a4;
import h32.d4;
import h32.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ni1.z1;
import zy.l0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135806i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f135789j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f135790k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f135791l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f135792m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f135793n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f135794o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f135795p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f135796q = new g(7);

    /* renamed from: r, reason: collision with root package name */
    public static final g f135797r = new g(8);

    /* renamed from: s, reason: collision with root package name */
    public static final g f135798s = new g(9);

    /* renamed from: t, reason: collision with root package name */
    public static final g f135799t = new g(10);

    /* renamed from: u, reason: collision with root package name */
    public static final g f135800u = new g(11);

    /* renamed from: v, reason: collision with root package name */
    public static final g f135801v = new g(12);

    /* renamed from: w, reason: collision with root package name */
    public static final g f135802w = new g(13);

    /* renamed from: x, reason: collision with root package name */
    public static final g f135803x = new g(14);

    /* renamed from: y, reason: collision with root package name */
    public static final g f135804y = new g(15);

    /* renamed from: z, reason: collision with root package name */
    public static final g f135805z = new g(16);
    public static final g A = new g(17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f135806i = i13;
    }

    public final q b(q it) {
        switch (this.f135806i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                om1.c displayState = it.f135836c;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return q.e(it, false, null, om1.c.e(displayState, rm1.q.EYE_HIDE, om1.e.MD, om1.f.WASH_DARK_GRAY, null, bs1.c.j2(new String[0], x0.add), true, 0, 968), false, null, 27);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                om1.c displayState2 = it.f135836c;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                return q.e(it, false, null, om1.c.e(displayState2, rm1.q.EYE_HIDE, om1.e.MD, om1.f.WASH_WHITE, null, bs1.c.j2(new String[0], x0.remove), true, 0, 968), false, null, 27);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, true, null, om1.c.e(it.f135836c, rm1.q.EYE_HIDE, null, om1.f.TRANSPARENT_GRAY, null, null, false, 0, 986), false, null, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135806i) {
            case 0:
                h it = (h) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l0 pinalyticsVMState = l0.b(it.f135817d, new i0(d4.HOMEFEED_CONTROL, a4.HOMEFEED_CONTROL_INTERESTS, null, null, null, null));
                v7 board = it.f135814a;
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                return new h(board, it.f135815b, it.f135816c, pinalyticsVMState);
            case 1:
                f it2 = (f) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                e eVar = it2 instanceof e ? (e) it2 : null;
                if (eVar != null) {
                    return eVar.f135785a;
                }
                return null;
            case 2:
                Object it3 = (Void) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return (c) it3;
            case 3:
                f it4 = (f) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof d) {
                    return (d) it4;
                }
                return null;
            case 4:
                c it5 = (c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return it5;
            case 5:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return it6.f135838e;
            case 6:
                g0 it7 = (g0) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return it7.f135813g;
            case 7:
                return b((q) obj);
            case 8:
                return b((q) obj);
            case 9:
                return b((q) obj);
            case 10:
                c0 it8 = (c0) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                z zVar = it8 instanceof z ? (z) it8 : null;
                if (zVar != null) {
                    return zVar.f135849a;
                }
                return null;
            case 11:
                z1 it9 = (z1) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new t(it9);
            case 12:
                c0 it10 = (c0) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                a0 a0Var = it10 instanceof a0 ? (a0) it10 : null;
                if (a0Var != null) {
                    return a0Var.f135779a;
                }
                return null;
            case 13:
                Object it11 = (Void) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (v) it11;
            case 14:
                c0 it12 = (c0) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (it12 instanceof x) {
                    return (x) it12;
                }
                return null;
            case 15:
                v it13 = (v) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 16:
                c0 it14 = (c0) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                b0 b0Var = it14 instanceof b0 ? (b0) it14 : null;
                if (b0Var != null) {
                    return b0Var.f135781a;
                }
                return null;
            default:
                k92.h it15 = (k92.h) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new u(it15);
        }
    }
}
