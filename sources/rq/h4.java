package rq;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109264i;

    /* renamed from: j, reason: collision with root package name */
    public static final h4 f109247j = new h4(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h4 f109248k = new h4(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h4 f109249l = new h4(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h4 f109250m = new h4(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h4 f109251n = new h4(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h4 f109252o = new h4(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h4 f109253p = new h4(6);

    /* renamed from: q, reason: collision with root package name */
    public static final h4 f109254q = new h4(7);

    /* renamed from: r, reason: collision with root package name */
    public static final h4 f109255r = new h4(8);

    /* renamed from: s, reason: collision with root package name */
    public static final h4 f109256s = new h4(9);

    /* renamed from: t, reason: collision with root package name */
    public static final h4 f109257t = new h4(10);

    /* renamed from: u, reason: collision with root package name */
    public static final h4 f109258u = new h4(11);

    /* renamed from: v, reason: collision with root package name */
    public static final h4 f109259v = new h4(12);

    /* renamed from: w, reason: collision with root package name */
    public static final h4 f109260w = new h4(13);

    /* renamed from: x, reason: collision with root package name */
    public static final h4 f109261x = new h4(14);

    /* renamed from: y, reason: collision with root package name */
    public static final h4 f109262y = new h4(15);

    /* renamed from: z, reason: collision with root package name */
    public static final h4 f109263z = new h4(16);
    public static final h4 A = new h4(17);
    public static final h4 B = new h4(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(int i13) {
        super(1);
        this.f109264i = i13;
    }

    public final rm1.d b(rm1.d it) {
        switch (this.f109264i) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, null, fm1.c.GONE, 0, null, 27);
            case 13:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.PLAY, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            case 14:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            case 15:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.SOUND, rm1.i.SM), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.MAXIMIZE, rm1.i.SM), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f109264i) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.START), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], ob2.f.comments_turned_off_for_pin), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.BODY_100, 1, null, rn1.b.MARQUEE, null, null, false, 0, null, null, null, null, null, false, null, null, 2096969);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109264i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            case 4:
                return Unit.f80348a;
            case 5:
                return Unit.f80348a;
            case 6:
                return Unit.f80348a;
            case 7:
                return Unit.f80348a;
            case 8:
                return Unit.f80348a;
            case 9:
                return Unit.f80348a;
            case 10:
                return e((rn1.a) obj);
            case 11:
                return e((rn1.a) obj);
            case 12:
                return b((rm1.d) obj);
            case 13:
                return b((rm1.d) obj);
            case 14:
                return b((rm1.d) obj);
            case 15:
                return b((rm1.d) obj);
            case 16:
                return b((rm1.d) obj);
            case 17:
                return e((rn1.a) obj);
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = n80.c.closeup_overflow_button;
                rm1.q qVar = rm1.q.ELLIPSIS;
                om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
                int i14 = m60.x0.more_options;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return om1.c.e(it, qVar, null, fVar, null, new u50.k0(i14, new ArrayList(0)), false, i13, 746);
        }
    }
}
