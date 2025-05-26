package ui0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f122261j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f122262k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f122263l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f122264m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f122265n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f122266o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f122267p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f122268q = new g(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f122269i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f122269i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096127);
            case 2:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.SUBTLE, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097141);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DEFAULT, null, e0.b(vn1.h.f126279e), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097141);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f122269i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, yl1.i.b(), null, null, null, 0, null, 1007);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, yl1.i.a(), null, null, null, 0, null, 1007);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122269i) {
            case 0:
                rm1.d icon = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(icon, "icon");
                break;
        }
        return b((rn1.a) obj);
    }
}
