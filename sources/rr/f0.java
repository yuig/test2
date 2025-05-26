package rr;

import android.net.Uri;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class f0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final OkHttpClient f109742g;

    /* renamed from: h, reason: collision with root package name */
    public final uo.a f109743h;

    /* renamed from: i, reason: collision with root package name */
    public final rd.j f109744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(OkHttpClient client, uo.a graphQLEmailDataSource, qr.h webhookDeeplinkUtil, rd.j emailLinkSignatureVerifier) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(graphQLEmailDataSource, "graphQLEmailDataSource");
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(emailLinkSignatureVerifier, "emailLinkSignatureVerifier");
        this.f109742g = client;
        this.f109743h = graphQLEmailDataSource;
        this.f109744i = emailLinkSignatureVerifier;
    }

    @Override // rr.d0
    public final String a() {
        return "email_link_untranslated";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cd  */
    @Override // rr.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.f0.c(android.net.Uri):void");
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().size() == 2 && n60.o.x(uri, 0, "email") && n60.o.x(uri, 1, SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK)) {
            return true;
        }
        return kotlin.text.z.i("post.pinterest.com", uri.getHost(), true);
    }
}
