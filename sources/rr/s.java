package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final j12.k f109849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qr.h webhookDeeplinkUtil, j12.k boardSectionService) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        this.f109849g = boardSectionService;
    }

    @Override // rr.d0
    public final String a() {
        return "board_section_more_ideas";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = pathSegments.get(1);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        String str3 = pathSegments.get(2);
        Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
        String queryParameter = uri.getQueryParameter("from_news_id");
        String queryParameter2 = uri.getQueryParameter("ideas_referrer");
        String a13 = n00.b.a(n00.c.BOARD_SECTION_DETAILED);
        this.f109849g.a(str, str2, str3, a13).r(tk2.e.f118017c).l(wj2.c.a()).o(new ir.h(23, new e.f(this, queryParameter, queryParameter2, 26)), new ir.h(24, k.f109758n));
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
            r1 = 3
            r2 = 0
            r3 = 1
            java.lang.String r4 = "toLowerCase(...)"
            java.lang.String r5 = "get(...)"
            r6 = 4
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
            r8 = 5
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
            if (r10 == 0) goto L7b
        L70:
            qr.h r10 = r9.f109723a
            sr.p r10 = r10.f104943d
            boolean r10 = r10.e()
            if (r10 == 0) goto L7b
            r2 = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.s.e(android.net.Uri):boolean");
    }
}
