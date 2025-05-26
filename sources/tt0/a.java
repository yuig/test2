package tt0;

import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119067i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f119050j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f119051k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f119052l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f119053m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f119054n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f119055o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f119056p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f119057q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f119058r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f119059s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f119060t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f119061u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f119062v = new a(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a f119063w = new a(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a f119064x = new a(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a f119065y = new a(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a f119066z = new a(16);
    public static final a A = new a(17);
    public static final a B = new a(18);
    public static final a C = new a(19);
    public static final a D = new a(20);
    public static final a E = new a(21);
    public static final a F = new a(22);
    public static final a G = new a(23);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f119067i = i13;
    }

    public final Boolean b(Navigation navigation) {
        switch (this.f119067i) {
            case 9:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.q()));
            default:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f119067i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER);
                return rn1.a.y(it, bs1.c.h2(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE), vn1.c.SUBTLE, b13, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f119067i) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], m60.x0.next), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], aq1.h.idea_pin_camera_update_settings), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119067i;
        switch (i13) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                break;
            case 6:
                Function1 it2 = (Function1) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
            case 7:
                Function1 it3 = (Function1) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                break;
            case 8:
                Function1 it4 = (Function1) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        break;
                }
                break;
            case 11:
                ag1.k it5 = (ag1.k) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            case 12:
                om1.c it6 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                break;
            case 14:
                break;
            case 16:
                break;
            case 17:
                ((Boolean) obj).getClass();
                break;
            case 18:
                rm1.d it7 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                break;
        }
        return e((rn1.a) obj);
    }
}
