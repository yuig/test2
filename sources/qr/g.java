package qr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.widget.x;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hz;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g1;
import df.j1;
import h32.d4;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.t0;
import lh0.z3;
import nx.d0;
import nx.o0;

/* loaded from: classes3.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pd.s f104931i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Uri f104932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f104933k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f104934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f104935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f104936n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f104937o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f104938p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f104939q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pd.s sVar, Uri uri, boolean z13, boolean z14, boolean z15, String str, String str2, boolean z16, String str3, String str4) {
        super(1);
        this.f104931i = sVar;
        this.f104932j = uri;
        this.f104933k = z13;
        this.f104934l = z14;
        this.f104935m = z15;
        this.f104936n = str;
        this.f104937o = str2;
        this.f104938p = z16;
        this.f104939q = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 pin = (f30) obj;
        Intrinsics.checkNotNullParameter(pin, "pin");
        pd.s sVar = this.f104931i;
        f30 pin2 = ((j10.g) sVar.f99753g).b(pin);
        ((j10.g) sVar.f99753g).a(e0.b(pin2));
        h hVar = (h) sVar.f99747a;
        String str = this.f104936n;
        boolean z13 = str != null;
        boolean z14 = this.f104933k;
        Uri uri = this.f104932j;
        if (z14) {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(pin2, "pin");
            sr.g gVar = hVar.f104949j;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(pin2, "pin");
            us1.a aVar = gVar.f115056a;
            Activity context = aVar.getContext();
            lu1.c cVar = (lu1.c) gVar.f115058c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent b13 = cVar.f84972b.b(context, lu1.a.REPIN_ACTIVITY);
            b13.setFlags(603979776);
            b13.putExtra("com.pinterest.EXTRA_PIN_ID", pin2.getUid());
            aVar.startActivity(b13);
        } else {
            NavigationImpl z03 = Navigation.z0((ScreenLocation) g1.A.getValue(), pin2.getUid());
            z03.Y1("com.pinterest.SHOULD_SHARE", this.f104934l);
            z03.Y1("com.pinterest.SHOW_REACTION_LIST", this.f104935m);
            if (z13) {
                z03.m0("com.pinterest.EXTRA_COMMENT_ID", str);
                z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", this.f104937o);
                z03.Y1("com.pinterest.EXTRA_COMMENT_IS_HIDDEN", this.f104938p);
                z03.m0("com.pinterest.EXTRA_REPLY_ID", this.f104939q);
                d0 d0Var = (d0) sVar.f99750d;
                f1 f1Var = f1.COMMUNITY_VIEW_INTENT;
                String uid = pin2.getUid();
                HashMap hashMap = new HashMap();
                hashMap.put("pin_id", pin2.getUid());
                Unit unit = Unit.f80348a;
                d0.B(d0Var, f1Var, null, uid, hashMap, 18);
            }
            if (uri != null) {
                z03.m0("com.pinterest.CURRENT_URL", uri.toString());
            }
            String queryParameter = uri != null ? uri.getQueryParameter("sender") : null;
            nx.a d2 = o0.f92437i.d();
            i0 generateLoggingContext = d2 != null ? d2.generateLoggingContext() : null;
            d4 d4Var = generateLoggingContext != null ? generateLoggingContext.f67081a : null;
            if (d4Var != null) {
                z03.f49944f = d4Var;
            }
            z03.Y1("com.pinterest.EXTRA_FROM_PIN_IT", true);
            z03.m0("com.pinterest.EXTRA_USER_ID", queryParameter);
            String queryParameter2 = uri != null ? uri.getQueryParameter("utm_source") : null;
            String queryParameter3 = uri != null ? uri.getQueryParameter("utm_campaign") : null;
            String queryParameter4 = uri != null ? uri.getQueryParameter("tracking_id") : null;
            if (queryParameter4 != null && queryParameter2 != null && queryParameter3 != null) {
                t0 t0Var = (t0) sVar.f99752f;
                t0Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) t0Var.f83480a;
                if (g1Var.o("android_notif_landing_context_fix", "enabled", z3Var) || g1Var.l("android_notif_landing_context_fix")) {
                    z03.m0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_UTM_SOURCE", queryParameter2);
                    z03.m0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_MESSAGE_TYPE", queryParameter3);
                    z03.m0("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT_TRACKING_ID", queryParameter4);
                } else {
                    z03.b("com.pinterest.EXTRA_NOTIF_LANDING_CONTEXT", new hz(queryParameter2, queryParameter3, queryParameter4));
                }
            }
            hVar.r(z03);
        }
        if (j1.T0(uri)) {
            HashMap auxData = new HashMap();
            auxData.put("first_pin_id", pin2.getUid());
            f1 eventType = f1.SEO_LANDING_PAGE_VIEW;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            tb.c cVar2 = hVar.f104946g;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            ((d0) cVar2.f116959a).g(eventType, null, auxData, false);
        }
        ((x) hVar.f104946g.f116960b).v("pin");
        hVar.q();
        return Unit.f80348a;
    }
}
