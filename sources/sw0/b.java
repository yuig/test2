package sw0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f115404j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f115405k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f115406l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f115407m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f115408n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f115409o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f115410p = new b(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b f115411q = new b(7);

    /* renamed from: r, reason: collision with root package name */
    public static final b f115412r = new b(8);

    /* renamed from: s, reason: collision with root package name */
    public static final b f115413s = new b(9);

    /* renamed from: t, reason: collision with root package name */
    public static final b f115414t = new b(10);

    /* renamed from: u, reason: collision with root package name */
    public static final b f115415u = new b(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115416i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f115416i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f115416i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, null, null, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1019);
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f115416i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.BODY_300;
                return rn1.a.y(it, null, vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), gVar, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097057);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f115416i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.search), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f115416i) {
            case 2:
                ag1.k it = (ag1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return e((rn1.a) obj);
    }
}
