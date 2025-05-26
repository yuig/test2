package u81;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f121001j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f121002k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f121003l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f121004m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f121005n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f121006o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f121007p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f121008q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f121009r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f121010s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f121011t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f121012u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f121013v = new c(12);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121014i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f121014i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f121014i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.CAMERA_FLIP, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, bs1.c.j2(new String[0], uc2.h.image_button_flip_camera), false, 0, 1002);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.CANCEL, om1.e.SM, om1.f.DEFAULT_ALWAYS_LIGHT, null, null, false, 0, 1016);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f121014i) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 j23 = bs1.c.j2(new String[0], f62.e.explore_tab);
                vn1.g gVar = vn1.g.BODY_300;
                return rn1.a.y(it, j23, vn1.c.DEFAULT, null, kotlin.collections.e0.b(vn1.e.BOLD), gVar, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.SPARKLE), null, null, 0, null, 30), false, 0, null, null, null, null, null, false, null, null, 2096612);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 j24 = bs1.c.j2(new String[0], x0.shop);
                vn1.g gVar2 = vn1.g.BODY_300;
                return rn1.a.y(it, j24, vn1.c.DEFAULT, null, kotlin.collections.e0.b(vn1.e.BOLD), gVar2, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.TAG), null, null, 0, null, 30), false, 0, null, null, null, null, null, false, null, null, 2096612);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 j25 = bs1.c.j2(new String[0], uc2.h.lens_allow_camera_access_explanation);
                vn1.g gVar3 = vn1.g.BODY_300;
                return rn1.a.y(it, j25, vn1.c.SUBTLE, kotlin.collections.e0.b(vn1.b.CENTER), null, gVar3, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 j26 = bs1.c.j2(new String[0], uc2.h.lens_allow_camera_access);
                vn1.g gVar4 = vn1.g.HEADING_700;
                return rn1.a.y(it, j26, vn1.c.DEFAULT, kotlin.collections.e0.b(vn1.b.CENTER), null, gVar4, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, vn1.g.BODY_300, vn1.g.UI_400, null, null, false, null, null, 2072563);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f121014i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.lens_enable_camera_access_btn), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.continue_title), false, null, null, null, null, null, null, 0, null, 1022);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.lens_allow_in_settings), false, null, null, null, null, null, null, 0, null, 1022);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.continue_title), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.continue_title), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f121014i) {
            case 0:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return e((rn1.a) obj);
    }
}
