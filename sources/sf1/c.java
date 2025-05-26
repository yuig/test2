package sf1;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112534i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f112517j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f112518k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f112519l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f112520m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f112521n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f112522o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f112523p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f112524q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f112525r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f112526s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f112527t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f112528u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f112529v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f112530w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f112531x = new c(14);

    /* renamed from: y, reason: collision with root package name */
    public static final c f112532y = new c(15);

    /* renamed from: z, reason: collision with root package name */
    public static final c f112533z = new c(16);
    public static final c A = new c(17);
    public static final c B = new c(18);
    public static final c C = new c(19);
    public static final c D = new c(20);
    public static final c E = new c(21);
    public static final c F = new c(22);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f112534i = i13;
    }

    public final h32.g0 b(boolean z13) {
        switch (this.f112534i) {
            case 5:
                return z13 ? h32.g0.PIN_STORY_PIN_COVER : h32.g0.PIN_STORY_PIN_PAGE;
            case 18:
                return h32.g0.PIN_STORY_PIN_AD_PAGE;
            case 19:
                return h32.g0.PIN_CLOSEUP_VIDEO;
            default:
                return h32.g0.PIN_CLOSEUP_BODY;
        }
    }

    public final om1.c e(om1.c it) {
        switch (this.f112534i) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.MINIMIZE, null, null, null, null, false, 0, 1022);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, false, 0, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
        }
    }

    public final rm1.d f(rm1.d it) {
        switch (this.f112534i) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.PLAY, rm1.i.XXL), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    public final rn1.a h(rn1.a it) {
        switch (this.f112534i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.MUSIC_OFF, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096639);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER);
                vn1.g gVar = vn1.g.HEADING_XL;
                return rn1.a.y(it, bs1.c.j2(new String[0], m60.x0.oops), vn1.c.LIGHT, b13, kotlin.collections.e0.b(vn1.e.BOLD), gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097120);
        }
    }

    public final yl1.b i(yl1.b it) {
        switch (this.f112534i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, yl1.c.SMALL, null, null, 0, null, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uq1.b.update_pinterest), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 m0Var = m0.f112657b;
        int i13 = this.f112534i;
        switch (i13) {
            case 0:
                return h((rn1.a) obj);
            case 1:
                return i((yl1.b) obj);
            case 2:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADED);
                        break;
                }
                return Unit.f80348a;
            case 3:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADED);
                        break;
                }
                return Unit.f80348a;
            case 4:
                return Unit.f80348a;
            case 5:
                return b(((Boolean) obj).booleanValue());
            case 6:
                return e((om1.c) obj);
            case 7:
                return e((om1.c) obj);
            case 8:
                return e((om1.c) obj);
            case 9:
                return f((rm1.d) obj);
            case 10:
                return f((rm1.d) obj);
            case 11:
                nc2.l writeVideoState = (nc2.l) obj;
                Intrinsics.checkNotNullParameter(writeVideoState, "$this$writeVideoState");
                writeVideoState.f90410b = 0L;
                return Unit.f80348a;
            case 12:
                return h((rn1.a) obj);
            case 13:
                return h((rn1.a) obj);
            case 14:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.b(rm1.i.MD);
                return Unit.f80348a;
            case 15:
                rm1.k bind3 = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.b(f112531x);
                return Unit.f80348a;
            case 16:
                Intrinsics.checkNotNullParameter((f30) obj, "<anonymous parameter 0>");
                return m0Var;
            case 17:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                String color = pin.i4();
                if (color == null) {
                    return m0Var;
                }
                Intrinsics.checkNotNullParameter(color, "color");
                return new m0();
            case 18:
                return b(((Boolean) obj).booleanValue());
            case 19:
                return b(((Boolean) obj).booleanValue());
            case 20:
                return b(((Boolean) obj).booleanValue());
            case 21:
                return h((rn1.a) obj);
            default:
                return i((yl1.b) obj);
        }
    }
}
