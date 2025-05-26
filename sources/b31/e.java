package b31;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rm1.q;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f21426j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f21427k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f21428l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f21429m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f21430n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f21431o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f21432p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f21433q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f21434r = new e(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21435i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f21435i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f21435i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.PEOPLE, null, null, null, null, false, 0, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.PERSON_ADD, null, null, null, null, false, 0, 1022);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f21435i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 1:
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], x0.follow), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], x0.following), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f21435i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.edit), false, null, null, null, null, null, null, 0, null, 1022);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.following), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.follow), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f21435i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return f((yl1.b) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return b((om1.c) obj);
            case 4:
                return e((rn1.a) obj);
            case 5:
                return f((yl1.b) obj);
            case 6:
                return b((om1.c) obj);
            case 7:
                return e((rn1.a) obj);
            default:
                return f((yl1.b) obj);
        }
    }
}
