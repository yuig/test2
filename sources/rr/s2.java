package rr;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s2 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final e30.a f109853g;

    /* renamed from: h, reason: collision with root package name */
    public final qr.h f109854h;

    /* renamed from: i, reason: collision with root package name */
    public final pd.s f109855i;

    /* renamed from: j, reason: collision with root package name */
    public final FragmentActivity f109856j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.w f109857k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(qr.h webhookDeeplinkUtil, e30.a yearInPreviewService, qr.h deeplinkUtil, pd.s deeplinkPinHelper, FragmentActivity fragmentActivity, m60.w eventManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(yearInPreviewService, "yearInPreviewService");
        Intrinsics.checkNotNullParameter(deeplinkUtil, "deeplinkUtil");
        Intrinsics.checkNotNullParameter(deeplinkPinHelper, "deeplinkPinHelper");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f109853g = yearInPreviewService;
        this.f109854h = deeplinkUtil;
        this.f109855i = deeplinkPinHelper;
        this.f109856j = fragmentActivity;
        this.f109857k = eventManager;
    }

    @Override // rr.d0
    public final String a() {
        return "year_in_preview";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context applicationContext = this.f109856j.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        yb0.n nVar = new yb0.n(applicationContext);
        String string = nVar.getResources().getString(he0.d.yip_consent_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(nVar.getResources().getString(he0.d.yip_consent_modal_subtitle));
        String string2 = nVar.getResources().getString(he0.d.yip_consent_modal_confirm_publish);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        String string3 = nVar.getResources().getString(he0.d.yip_consent_modal_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.m(string3);
        nVar.o(true);
        nVar.p(new tq.j(this, 6));
        this.f109857k.f(new yb0.e(nVar));
        this.f109854h.t(null);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        uri.getPathSegments();
        return uri.getPathSegments().size() == 1 && n60.o.x(uri, 0, "pinterest-predicts");
    }
}
