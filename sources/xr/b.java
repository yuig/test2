package xr;

import android.os.OutcomeReceiver;
import android.webkit.URLUtil;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.f1;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nm.o;

/* loaded from: classes.dex */
public final class b implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f135657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f30 f135658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f135659c;

    public b(d dVar, f30 f30Var, boolean z13) {
        this.f135657a = dVar;
        this.f135658b = f30Var;
        this.f135659c = z13;
    }

    public final void onError(Throwable th3) {
        Exception error = (Exception) th3;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f135657a.d("ARA_SOURCE_REGISTRATION_FAILED", error, this.f135658b);
    }

    public final void onResult(Object result) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f135657a.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        d dVar = this.f135657a;
        f30 f30Var = this.f135658b;
        boolean z13 = this.f135659c;
        dVar.getClass();
        String H3 = f30Var.H3();
        String x33 = f30Var.x3();
        if (x33 != null && !z.j(x33)) {
            H3 = null;
        }
        if (H3 == null) {
            H3 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("campaignId", H3);
        linkedHashMap.put("sourceEventType", z13 ? SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK : "view");
        String x34 = f30Var.x3();
        if (x34 == null) {
            x34 = "";
        }
        linkedHashMap.put("advertiserId", x34);
        String D = com.bumptech.glide.c.D(f30Var);
        if (D == null || z.j(D)) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            if (URLUtil.isValidUrl(D)) {
                try {
                    URI uri = new URI(D);
                    if (!Intrinsics.d(uri.getScheme(), "http") && !Intrinsics.d(uri.getScheme(), "https")) {
                        arrayList.add(uri.getScheme() + "://" + uri.getHost());
                    }
                    arrayList.add(uri.getScheme() + "://" + uri.getHost());
                    String host = uri.getHost();
                    Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                    if (z.p(host, "www.", true)) {
                        String scheme = uri.getScheme();
                        String host2 = uri.getHost();
                        Intrinsics.checkNotNullExpressionValue(host2, "getHost(...)");
                        String substring = host2.substring(4);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        arrayList.add(scheme + "://" + substring);
                    } else {
                        arrayList.add(uri.getScheme() + "://www." + uri.getHost());
                    }
                } catch (Exception e13) {
                    dVar.d("ARA_ERROR_PARSING_DESTINATION", e13, f30Var);
                    arrayList.add(D);
                }
            } else {
                dVar.d("ARA_ERROR_PARSING_DESTINATION", null, f30Var);
                arrayList.add(D);
            }
        }
        linkedHashMap.put("destination", arrayList);
        String B3 = f30Var.B3();
        linkedHashMap.put("sourceEventId", B3 != null ? B3 : "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("0", "0x" + d.c(H3, "COUNT", f30Var));
        linkedHashMap2.put(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, "0x" + d.c(H3, "VALUE", f30Var));
        f1 f1Var = z13 ? f1.ARA_CLICK : f1.ARA_VIEW;
        String uid = f30Var.getUid();
        HashMap hashMap = new HashMap();
        hashMap.put("ara_hashed_key", new o().k(linkedHashMap2));
        hashMap.put("ara_key_components", new o().k(linkedHashMap));
        Unit unit = Unit.f80348a;
        dVar.f135669f.u(f1Var, uid, null, hashMap, false);
    }
}
