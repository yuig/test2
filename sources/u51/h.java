package u51;

import com.pinterest.api.model.cd0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r51.b p03 = (r51.b) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        i iVar = (i) this.receiver;
        int i13 = i.L0;
        iVar.getClass();
        String G = p03.f106255b.G();
        cd0 cd0Var = p03.f106255b;
        if (G == null || G.length() == 0) {
            m60.w f73 = iVar.f7();
            List I = cd0Var.I();
            Intrinsics.checkNotNullExpressionValue(I, "getSecondaryReasons(...)");
            NavigationImpl z03 = Navigation.z0(I.isEmpty() ^ true ? j1.b() : j1.a(), p03.f106254a);
            Navigation navigation = iVar.I;
            String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
            if (v03 == null) {
                v03 = "";
            }
            z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", v03);
            z03.y0(cd0Var, "com.pinterest.EXTRA_COMMENT_REPORT_REASON");
            z03.y0(iVar.G0, "com.pinterest.EXTRA_AGGREGATED_UID");
            z03.y0(iVar.H0, "com.pinterest.EXTRA_PIN_ID");
            String str = iVar.I0;
            if (str != null) {
                z03.y0(str, "com.pinterest.EXTRA_USERNAME");
            }
            f73.d(z03);
        } else {
            a11.n nVar = iVar.E0;
            if (nVar == null) {
                Intrinsics.r("clickthroughHelper");
                throw null;
            }
            a11.e.e(nVar, String.valueOf(cd0Var.G()), null, 6);
        }
        return Unit.f80348a;
    }
}
