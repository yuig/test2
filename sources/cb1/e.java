package cb1;

import com.pinterest.feature.settings.notifications.b0;
import com.pinterest.feature.settings.notifications.c0;
import com.pinterest.feature.settings.notifications.d0;
import com.pinterest.feature.settings.notifications.e0;
import com.pinterest.feature.settings.notifications.f0;
import com.pinterest.feature.settings.notifications.g0;
import com.pinterest.feature.settings.notifications.h0;
import com.pinterest.feature.settings.notifications.i0;
import com.pinterest.feature.settings.notifications.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import zb0.f;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f27270j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f27271k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f27272l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f27273m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f27274n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f27275o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f27276p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f27277q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f27278r = new e(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e f27279s = new e(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e f27280t = new e(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e f27281u = new e(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e f27282v = new e(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e f27283w = new e(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f27284i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f27284i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f27284i;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                do1.d it = (do1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return do1.d.e(it, bs1.c.j2(new String[0], e52.c.notif_settings_toast_confirmation), null, null, 0, false, 510);
            case 4:
                f it2 = (f) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new x(it2);
            case 5:
                i0 it3 = (i0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof d0) {
                    return (d0) it3;
                }
                return null;
            case 6:
                c0 it4 = (c0) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return it4;
                }
            case 7:
                i0 it5 = (i0) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof h0) {
                    return (h0) it5;
                }
                return null;
            case 8:
                b0 it6 = (b0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return it6;
            case 9:
                i0 it7 = (i0) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (it7 instanceof f0) {
                    return (f0) it7;
                }
                return null;
            case 10:
                c0 it8 = (c0) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return it8;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return it8;
                }
            case 11:
                i0 it9 = (i0) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof e0) {
                    return (e0) it9;
                }
                return null;
            case 12:
                Object it10 = (Void) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (c0) it10;
            default:
                i0 it11 = (i0) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                g0 g0Var = it11 instanceof g0 ? (g0) it11 : null;
                if (g0Var != null) {
                    return g0Var.f48193a;
                }
                return null;
        }
    }
}
