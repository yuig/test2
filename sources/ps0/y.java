package ps0;

import android.net.Uri;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import df.j1;
import ek1.r1;
import gk1.x0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import so.ic;
import so.nd;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101325a;

    public /* synthetic */ y(int i13) {
        this.f101325a = i13;
    }

    public static void a(l82.e eVar, jj1.d newPiece) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(newPiece, "newPiece");
        eVar.f(new bi1.a0(newPiece, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (r8.S().intValue() == r1.getValue()) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ro1.b d(ps0.y r8, com.pinterest.api.model.f30 r9, es.a r10, es.h r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ps0.y.d(ps0.y, com.pinterest.api.model.f30, es.a, es.h):ro1.b");
    }

    public static ro1.b e(String str) {
        if (str == null || str.length() == 0) {
            return ro1.b.WEB;
        }
        Uri parse = Uri.parse(str);
        List<String> pathSegments = parse.getPathSegments();
        String query = parse.getQuery();
        for (String str2 : pathSegments) {
            if (kotlin.text.z.i("/", str2, true) || kotlin.text.z.i("pin", str2, true) || !j1.G0(parse) || !(query == null || pathSegments.size() == 1 || pathSegments.size() == 2)) {
                return ro1.b.WEB;
            }
            if (pathSegments.size() == 1) {
                return ro1.b.PROFILE;
            }
            if (pathSegments.size() == 2) {
                return ro1.b.BOARD;
            }
        }
        return ro1.b.WEB;
    }

    public static boolean g(l82.e eVar, f30 pin, es.a adFormats) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (!((es.c) adFormats).t(pin)) {
            return false;
        }
        eVar.a(new ek1.l0(ic.f113468a));
        return ((r1) eVar.f82219b).f59342d.f90869n0;
    }

    public final vn1.c b() {
        switch (this.f101325a) {
            case 10:
                return ej1.d.f59106o;
            default:
                return tn1.c.f118614f;
        }
    }

    public final fm1.c c() {
        switch (this.f101325a) {
            case 20:
                return GestaltButton.f49320i;
            case 21:
            default:
                return GestaltSpinner.E;
            case 22:
                return GestaltIcon.f49402d;
        }
    }

    public final ro1.b f(String str, f30 f30Var, es.h adsCommonDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (f30Var == null) {
            return e(str);
        }
        ro1.b d2 = d(this, f30Var, adFormats, adsCommonDisplay);
        if (d2 != null) {
            return d2;
        }
        if (n60.o.B(f30Var, "getIsPromoted(...)") && b40.X0(f30Var)) {
            return e(str);
        }
        boolean[] zArr = f30Var.f37485h3;
        return (zArr.length <= 151 || !zArr[151] || str == null || !StringsKt.E(str, "https://play.google.com/store/apps/", false)) ? e(str) : ro1.b.STANDARD_MDL_PLAYSTORE;
    }

    public final boolean h(l82.e eVar) {
        nd ndVar = nd.f113572a;
        switch (this.f101325a) {
            case 13:
                eVar.a(new ek1.l0(ndVar));
                return ((r1) eVar.f82219b).f59342d.f90850e;
            default:
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                eVar.a(new gk1.g0(ndVar));
                return ((x0) eVar.f82219b).f65299g.f90850e;
        }
    }

    public final boolean i(f30 pin, es.h adsCommonDisplay, es.a adFormats) {
        com.pinterest.api.model.r n03;
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (pin == null) {
            return false;
        }
        es.c cVar = (es.c) adFormats;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null && (n03 = t33.n0()) != null && n03.k().intValue() == 0) {
            return false;
        }
        List j13 = kotlin.collections.f0.j(ro1.b.LEAD_GEN, ro1.b.CARTING, ro1.b.SHOWCASE, ro1.b.QUIZ, ro1.b.COLLECTION);
        if (!n60.o.B(pin, "getIsPromoted(...)")) {
            return false;
        }
        if (CollectionsKt.L(j13, d(this, pin, cVar, adsCommonDisplay))) {
            Boolean b53 = pin.b5();
            Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
            if (!b53.booleanValue()) {
                return false;
            }
        }
        return !b40.r0(pin);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13, int i14) {
        this(0);
        this.f101325a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
            default:
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
