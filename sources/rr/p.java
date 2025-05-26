package rr;

import android.net.Uri;
import com.pinterest.api.model.gw;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final x02.x0 f109807g;

    /* renamed from: h, reason: collision with root package name */
    public final gw f109808h;

    /* renamed from: i, reason: collision with root package name */
    public final qq2.c f109809i;

    /* renamed from: j, reason: collision with root package name */
    public final g70.h f109810j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qr.h webhookDeeplinkUtil, x02.x0 boardRepository, gw modelHelper, qq2.c boardHelper, g70.h boardNavigator) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(boardHelper, "boardHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f109807g = boardRepository;
        this.f109808h = modelHelper;
        this.f109809i = boardHelper;
        this.f109810j = boardNavigator;
    }

    @Override // rr.d0
    public final String a() {
        return "board_more_ideas";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        List<String> pathSegments2 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        this.f109809i.o(uri, pathSegments, this.f109807g, new o(this, uri, pathSegments2, this.f109726d, this.f109808h));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // rr.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.List r10 = r10.getPathSegments()
            int r0 = r10.size()
            r1 = 2
            r2 = 0
            r3 = 1
            java.lang.String r4 = "toLowerCase(...)"
            java.lang.String r5 = "get(...)"
            r6 = 3
            if (r0 != r6) goto L31
            java.lang.Object r0 = r10.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.String r7 = "more_ideas"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r7)
            if (r0 == 0) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r2
        L32:
            int r7 = r10.size()
            r8 = 4
            if (r7 != r8) goto L6b
            java.lang.Object r1 = r10.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r7 = "_tools"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r7)
            if (r1 == 0) goto L6b
            java.lang.Object r10 = r10.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r10.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            java.lang.String r1 = "more-ideas"
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r1)
            if (r10 == 0) goto L6b
            r10 = r3
            goto L6c
        L6b:
            r10 = r2
        L6c:
            if (r0 != 0) goto L70
            if (r10 == 0) goto L71
        L70:
            r2 = r3
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.p.e(android.net.Uri):boolean");
    }
}
