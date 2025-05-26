package tx;

import at1.h;
import com.pinterest.api.model.wy0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import tb0.k;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f119616a;

    public a(b bVar) {
        this.f119616a = bVar;
    }

    @Override // at1.h
    public final boolean onResourcesError(String str) {
        return false;
    }

    @Override // at1.h
    public final void onResourcesReady(int i13) {
        String str;
        if ((i13 & 1) != 1) {
            return;
        }
        b bVar = this.f119616a;
        b60.d dVar = (b60.d) bVar.f119617a;
        if (dVar.i()) {
            wy0 f13 = dVar.f();
            Boolean z33 = f13 != null ? f13.z3() : null;
            m60.d dVar2 = (m60.d) bVar.f119618b;
            dVar2.e();
            dVar2.h();
            if (Intrinsics.d(z33, Boolean.TRUE)) {
                Date time = Calendar.getInstance().getTime();
                SimpleDateFormat a13 = bVar.a();
                String format = a13 != null ? a13.format(time) : null;
                if (format == null) {
                    return;
                }
                r rVar = bVar.f119620d;
                if (Intrinsics.d(rVar.d("PREF_DAU_ALPHA_ALL_AND_PROD_EMPLOYEE_LOGGER_LAST_LOG", null), format)) {
                    return;
                }
                k kVar = new k();
                if (f13 == null || (str = f13.getUid()) == null) {
                    str = "NotAvailable";
                }
                kVar.c("UserId", str);
                dVar2.b();
                kVar.c("VersionCode", String.valueOf(13198010));
                dVar2.e();
                kVar.c("Distribution", "Production");
                bVar.f119619c.k("DAU-AlphaAll-ProdEmployee", kVar.f117102a);
                rVar.b("PREF_DAU_ALPHA_ALL_AND_PROD_EMPLOYEE_LOGGER_LAST_LOG", format);
            }
        }
    }
}
