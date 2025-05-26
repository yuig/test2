package rh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108189i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f108172j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f108173k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f108174l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f108175m = new j(3);

    /* renamed from: n, reason: collision with root package name */
    public static final j f108176n = new j(4);

    /* renamed from: o, reason: collision with root package name */
    public static final j f108177o = new j(5);

    /* renamed from: p, reason: collision with root package name */
    public static final j f108178p = new j(6);

    /* renamed from: q, reason: collision with root package name */
    public static final j f108179q = new j(7);

    /* renamed from: r, reason: collision with root package name */
    public static final j f108180r = new j(8);

    /* renamed from: s, reason: collision with root package name */
    public static final j f108181s = new j(9);

    /* renamed from: t, reason: collision with root package name */
    public static final j f108182t = new j(10);

    /* renamed from: u, reason: collision with root package name */
    public static final j f108183u = new j(11);

    /* renamed from: v, reason: collision with root package name */
    public static final j f108184v = new j(12);

    /* renamed from: w, reason: collision with root package name */
    public static final j f108185w = new j(13);

    /* renamed from: x, reason: collision with root package name */
    public static final j f108186x = new j(14);

    /* renamed from: y, reason: collision with root package name */
    public static final j f108187y = new j(15);

    /* renamed from: z, reason: collision with root package name */
    public static final j f108188z = new j(16);
    public static final j A = new j(17);
    public static final j B = new j(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f108189i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f108189i) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_WHITE, null, null, false, 0, 1019);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f108189i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096127);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], db0.f.comment_edit_title), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], ob2.f.comments_creator_quick_replies_what_do_you_think), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f108189i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], m60.x0.got_it), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], m60.x0.got_it), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108189i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return f((yl1.b) obj);
            case 2:
                return f((yl1.b) obj);
            case 3:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kn1.b.e(it, false, false, hn1.q.Center, bs1.c.j2(new String[0], ob2.f.comment_sticker_modal_title), null, null, null, 1971);
            case 4:
                return e((rn1.a) obj);
            case 5:
                return b((om1.c) obj);
            case 6:
                rl1.q it2 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rl1.q.e(it2, null, null, false, rl1.r.MD, null, false, false, null, 0, null, null, 2039);
            case 7:
                MatchResult it3 = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.getValue();
            case 8:
                return b((om1.c) obj);
            case 9:
                return b((om1.c) obj);
            case 10:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(rm1.q.STAR);
                return Unit.f80348a;
            case 11:
                return Unit.f80348a;
            case 12:
                return e((rn1.a) obj);
            case 13:
                return e((rn1.a) obj);
            case 14:
                return e((rn1.a) obj);
            case 15:
                return e((rn1.a) obj);
            case 16:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f96679d = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 17:
                jm1.f bind2 = (jm1.f) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.getClass();
                bind2.f77035a = fm1.c.VISIBLE;
                return Unit.f80348a;
            default:
                return e((rn1.a) obj);
        }
    }
}
