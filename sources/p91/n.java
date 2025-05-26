package p91;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f99300j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f99301k = new n(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n f99302l = new n(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n f99303m = new n(3);

    /* renamed from: n, reason: collision with root package name */
    public static final n f99304n = new n(4);

    /* renamed from: o, reason: collision with root package name */
    public static final n f99305o = new n(5);

    /* renamed from: p, reason: collision with root package name */
    public static final n f99306p = new n(6);

    /* renamed from: q, reason: collision with root package name */
    public static final n f99307q = new n(7);

    /* renamed from: r, reason: collision with root package name */
    public static final n f99308r = new n(8);

    /* renamed from: s, reason: collision with root package name */
    public static final n f99309s = new n(9);

    /* renamed from: t, reason: collision with root package name */
    public static final n f99310t = new n(10);

    /* renamed from: u, reason: collision with root package name */
    public static final n f99311u = new n(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f99312i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f99312i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
            case 2:
            case 5:
            case 7:
            case 8:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f99312i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            case 1:
            case 3:
            case 4:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f99312i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((om1.c) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return b((om1.c) obj);
            case 4:
                return b((om1.c) obj);
            case 5:
                return e((rn1.a) obj);
            case 6:
                return b((om1.c) obj);
            case 7:
                return e((rn1.a) obj);
            case 8:
                return e((rn1.a) obj);
            case 9:
                return b((om1.c) obj);
            case 10:
                return e((rn1.a) obj);
            default:
                return b((om1.c) obj);
        }
    }
}
