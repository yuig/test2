package g02;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.screens.o3;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import n60.o;
import vb0.j;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(f30 f30Var) {
        wy0 z53;
        wy0 I5;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 L3 = f30Var.L3();
        return (L3 != null && Intrinsics.d(L3.R2(), Boolean.TRUE)) || ((z53 = f30Var.z5()) != null && Intrinsics.d(z53.R2(), Boolean.TRUE)) || ((I5 = f30Var.I5()) != null && Intrinsics.d(I5.R2(), Boolean.TRUE));
    }

    public static final wy0 b(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 L3 = f30Var.L3();
        String Z2 = L3 != null ? L3.Z2() : null;
        if (Z2 != null && !z.j(Z2)) {
            return f30Var.L3();
        }
        wy0 z53 = f30Var.z5();
        String Z22 = z53 != null ? z53.Z2() : null;
        if (Z22 != null && !z.j(Z22)) {
            return f30Var.z5();
        }
        wy0 I5 = f30Var.I5();
        String Z23 = I5 != null ? I5.Z2() : null;
        if (Z23 == null || z.j(Z23)) {
            return null;
        }
        return f30Var.I5();
    }

    public static final void c(w eventManager, f30 pin, String str, d4 srcViewType, a4 a4Var, String str2, String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(srcViewType, "srcViewType");
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String o13 = b40.o(pin);
        if (o13 == null) {
            wy0 b13 = b(pin);
            if (b13 == null) {
                str4 = null;
                if (uid.length() > 0 || str4 == null || str4.length() == 0) {
                    j.f125466a.G("pinId and creatorId should always be provided", new Object[0]);
                }
                NavigationImpl z03 = Navigation.z0((ScreenLocation) o3.f51172b.getValue(), uid);
                String name = srcViewType.name();
                String name2 = a4Var != null ? a4Var.name() : null;
                String z43 = pin.z4();
                d4 d4Var = z03.f49944f;
                if (d4Var != d4.SEARCH) {
                    d4Var = null;
                }
                z03.w0(new ReportData.PinReportData(uid, name, name2, str4, str, str2, z43, d4Var != null ? str3 : null, o.y(pin, "getIsThirdPartyAd(...)")), "com.pinterest.EXTRA_REPORT_DATA");
                eventManager.d(z03);
                return;
            }
            o13 = b13.getUid();
        }
        str4 = o13;
        if (uid.length() > 0) {
        }
        j.f125466a.G("pinId and creatorId should always be provided", new Object[0]);
    }
}
