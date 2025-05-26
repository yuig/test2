package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class ObjectRestoreHeaderHandler<T extends ObjectRestoreResult> implements HeaderHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f28803a = Pattern.compile("expiry-date=\"(.*?)\"");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f28804b = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* renamed from: c, reason: collision with root package name */
    public static final Log f28805c = LogFactory.a(ObjectRestoreHeaderHandler.class);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.amazonaws.services.s3.internal.ObjectRestoreResult r5, com.amazonaws.http.HttpResponse r6) {
        /*
            java.lang.String r0 = "x-amz-restore"
            java.util.Map r6 = r6.f28606d
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L51
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f28803a
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            java.lang.String r0 = r0.group(r3)
            int r1 = com.amazonaws.services.s3.internal.ServiceUtils.f28822a     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss z"
            java.util.Date r0 = com.amazonaws.util.DateUtils.d(r1, r0)     // Catch: java.lang.Exception -> L27
            goto L30
        L27:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f28805c
            java.lang.String r4 = "Error parsing expiry-date from x-amz-restore header."
            r1.j(r4, r0)
        L2f:
            r0 = r2
        L30:
            com.amazonaws.services.s3.model.ObjectMetadata r5 = (com.amazonaws.services.s3.model.ObjectMetadata) r5
            r5.f28892f = r0
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f28804b
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 == 0) goto L4c
            java.lang.String r6 = r6.group(r3)
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
        L4c:
            if (r2 == 0) goto L51
            r5.getClass()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.b(com.amazonaws.services.s3.internal.ObjectRestoreResult, com.amazonaws.http.HttpResponse):void");
    }

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final /* bridge */ /* synthetic */ void a(Object obj, HttpResponse httpResponse) {
        b((ObjectRestoreResult) obj, httpResponse);
    }
}
