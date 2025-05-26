package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b30.a f109745g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f109746h;

    /* renamed from: i, reason: collision with root package name */
    public final String f109747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(qr.h webhookDeeplinkUtil, b30.a expandUrlRemoteRequest, m60.w eventManager, String loadingString) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(expandUrlRemoteRequest, "expandUrlRemoteRequest");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(loadingString, "loadingString");
        this.f109745g = expandUrlRemoteRequest;
        this.f109746h = eventManager;
        this.f109747i = loadingString;
    }

    @Override // rr.d0
    public final String a() {
        return "pin_it_short_links";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        mf0.l lVar = new mf0.l();
        lVar.q7(this.f109747i);
        this.f109746h.d(new of0.a(lVar));
        String lastPathSegment = uri.getLastPathSegment();
        Intrinsics.f(lastPathSegment);
        qr.h hVar = this.f109723a;
        if (hVar.f104943d.e()) {
            this.f109745g.b(lastPathSegment).execute((ak2.e) new nr.b(1, this, hVar), (ak2.e) new nr.b(2, uri, this));
        } else {
            hVar.r(Navigation.w1(com.pinterest.screens.g1.I()));
            hVar.q();
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        boolean z13;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean d2 = Intrinsics.d("pin.it", uri.getHost());
        if (CollectionsKt.L(ie0.a.f72199d, uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.d(CollectionsKt.firstOrNull(pathSegments), "i")) {
                z13 = true;
                String lastPathSegment = uri.getLastPathSegment();
                return (!d2 || z13) && (lastPathSegment == null && lastPathSegment.length() != 0 && !Intrinsics.d(uri.getLastPathSegment(), "i"));
            }
        }
        z13 = false;
        String lastPathSegment2 = uri.getLastPathSegment();
        if (d2) {
        }
    }
}
