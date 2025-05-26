package rr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109750g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f109751h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f109752i;

    /* renamed from: j, reason: collision with root package name */
    public final nx.d0 f109753j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(qr.h webhookDeeplinkUtil, b60.b activeUserManager, i92.k toastUtils, Context context, nx.d0 pinalytics) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f109750g = activeUserManager;
        this.f109751h = toastUtils;
        this.f109752i = context;
        this.f109753j = pinalytics;
    }

    @Override // rr.d0
    public final String a() {
        return "qr_code_login";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean i13 = ((b60.d) this.f109750g).i();
        qr.h hVar = this.f109723a;
        if (i13) {
            Bundle bundle = new Bundle();
            bundle.putString("com.pinterest.EXTRA_QR_CODE_LOGIN_TOKEN", uri.getPathSegments().get(1));
            NavigationImpl v13 = Navigation.v1(com.pinterest.screens.g1.y(), bundle);
            Intrinsics.checkNotNullExpressionValue(v13, "create(...)");
            hVar.r(v13);
            return;
        }
        GestaltToast gestaltToast = new GestaltToast(6, this.f109752i, (AttributeSet) null);
        pp2.a.l(gestaltToast, k.f109761q);
        i92.k kVar = this.f109751h;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(gestaltToast, "gestaltToast");
        v.j jVar = new v.j(kVar, gestaltToast, 48, 16);
        if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
            jVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(jVar);
        }
        this.f109753j.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.VIEW, (r18 & 2) != 0 ? null : h32.u0.QR_CODE_ERROR_TOAST, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        hVar.l(null);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getPathSegments().size() == 2 && Intrinsics.d("qr_code_login", uri.getPathSegments().get(0));
    }
}
