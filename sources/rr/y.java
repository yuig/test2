package rr;

import android.net.Uri;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class y extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f109871g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qr.h webhookDeeplinkUtil, int i13) {
        super(webhookDeeplinkUtil);
        this.f109871g = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
            super(webhookDeeplinkUtil);
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
            super(webhookDeeplinkUtil);
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        } else {
            Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
            super(webhookDeeplinkUtil);
        }
    }

    @Override // rr.d0
    public final String a() {
        switch (this.f109871g) {
            case 0:
                return "conversation";
            case 1:
                return "creator_pathways";
            case 2:
                return "hosted_checkout_payment";
            default:
                return "search";
        }
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        List<String> pathSegments;
        int i13 = this.f109871g;
        String str = null;
        qr.h hVar = this.f109723a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(uri, "uri");
                String conversationId = uri.getPathSegments().get(1);
                if (!df.j1.d1(conversationId)) {
                    hVar.q();
                    break;
                } else {
                    oo1.j jVar = oo1.j.f96854a;
                    Intrinsics.f(conversationId);
                    ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.g1.f50822l.getValue();
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                    Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
                    String queryParameter = uri.getQueryParameter("fsf");
                    String queryParameter2 = uri.getQueryParameter("pin_id");
                    NavigationImpl z03 = Navigation.z0(screenLocation, conversationId);
                    if (queryParameter != null && queryParameter2 != null) {
                        z03.m0("com.pinterest.EXTRA_FEEDBACK_PIN_ID", queryParameter2);
                        z03.z(Integer.parseInt(queryParameter), "com.pinterest.EXTRA_FEEDBACK_TYPE");
                    }
                    hVar.m(z03);
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(uri, "uri");
                String queryParameter3 = uri.getQueryParameter("type");
                NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.g1.f50825o.getValue());
                w13.m0("KEY_CREATOR_HUB_MODAL_TYPE", queryParameter3);
                Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                hVar.m(w13);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(uri, "uri");
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                if (df.j1.M0(uri2)) {
                    hVar.l(null);
                }
                hVar.q();
                break;
            default:
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(uri, "<this>");
                if (uri.getQueryParameterNames().contains("deeplink_path")) {
                    Intrinsics.checkNotNullParameter(uri, "<this>");
                    String queryParameter4 = uri.getQueryParameter("deeplink_path");
                    if (queryParameter4 != null) {
                        Uri parse = Uri.parse(queryParameter4);
                        uri = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(parse.getPath()).encodedQuery(parse.getEncodedQuery()).build();
                    } else {
                        uri = null;
                    }
                }
                if (uri != null && (pathSegments = uri.getPathSegments()) != null) {
                    if (pathSegments.size() == 1 && Intrinsics.d(uri.getHost(), "search")) {
                        str = pathSegments.get(0);
                    } else if (pathSegments.size() > 1) {
                        str = pathSegments.get(1);
                    }
                    String str2 = this.f109726d;
                    HashMap hashMap = this.f109727e;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    hVar.f104951l.e(uri, str2, str, hashMap);
                    break;
                }
                break;
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        switch (this.f109871g) {
            case 0:
                Intrinsics.checkNotNullParameter(uri, "uri");
                List<String> pathSegments = uri.getPathSegments();
                return pathSegments.size() >= 2 && Intrinsics.d("conversation", pathSegments.get(0));
            case 1:
                Intrinsics.checkNotNullParameter(uri, "uri");
                List<String> pathSegments2 = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                return (pathSegments2.isEmpty() ^ true) && n60.o.x(uri, 0, "creator_pathways");
            case 2:
                Intrinsics.checkNotNullParameter(uri, "uri");
                String url = uri.toString();
                Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                Intrinsics.checkNotNullParameter(url, "url");
                return StringsKt.E(url, "pinterest://checkoutPaymentNotify", false);
            default:
                Intrinsics.checkNotNullParameter(uri, "uri");
                int size = uri.getPathSegments().size();
                if (1 > size || size >= 3 || !n60.o.x(uri, 0, "search")) {
                    return (uri.getPathSegments().size() == 1 && Intrinsics.d(uri.getHost(), "guided_search") && n60.o.x(uri, 0, "results")) || Intrinsics.d(uri.getHost(), "search");
                }
                return true;
        }
    }
}
