package rr;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final uo.a f109805g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f109806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(qr.h webhookDeeplinkUtil, uo.a graphQLEmailDataSource, b60.b activeUserManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(graphQLEmailDataSource, "graphQLEmailDataSource");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109805g = graphQLEmailDataSource;
        this.f109806h = activeUserManager;
    }

    public static boolean g(String str) {
        return (Intrinsics.d(str, "pin-builder") || Intrinsics.d(str, "story-pin-builder") || Intrinsics.d(str, "idea-pin-builder") || Intrinsics.d(str, "pin-creation-tool") || Intrinsics.d(str, "pin") || ie0.a.f72196a.contains(str)) ? false : true;
    }

    @Override // rr.d0
    public final String a() {
        return "user";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String followeeId;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("should_follow");
        if (queryParameter != null && Boolean.parseBoolean(queryParameter) && (followeeId = uri.getPathSegments().get(0)) != null) {
            uo.a aVar = this.f109805g;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(followeeId, "followeeId");
            fk2.g i13 = com.bumptech.glide.d.u0(aVar.f122922a.a(new p30.n(followeeId))).i();
            Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
            i13.l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.b(11), new n0(4, k.f109766v));
        }
        qr.h hVar = this.f109723a;
        hVar.a(false);
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter2 = uri.getQueryParameter("invite_code");
        String queryParameter3 = (queryParameter2 == null || kotlin.text.z.j(queryParameter2)) ^ true ? uri.getQueryParameter("invite_code") : null;
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        hVar.j(uri, pathSegments, this.f109726d, ((b60.d) this.f109806h).i(), queryParameter3);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (df.j1.f1(uri) && !CollectionsKt.L(ie0.a.f72199d, uri.getHost())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        List list = qs1.a.f105093a;
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        if (!pathSegments.isEmpty()) {
            String lowerCase = pathSegments.get(0).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (qs1.a.f105094b.contains(lowerCase)) {
                return false;
            }
        }
        if (uri.getPathSegments().size() == 1) {
            String str = uri.getPathSegments().get(0);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            if (g(str)) {
                return true;
            }
        }
        if (uri.getPathSegments().size() == 2) {
            String str2 = uri.getPathSegments().get(0);
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            if (g(str2)) {
                String str3 = uri.getPathSegments().get(1);
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                String pathSegment = str3;
                Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
                if (ie0.a.f72197b.contains(pathSegment)) {
                    return true;
                }
            }
        }
        return Intrinsics.d(uri.getHost(), "user") && uri.getPathSegments().size() > 0;
    }
}
