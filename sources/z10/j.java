package z10;

import kotlin.jvm.internal.Intrinsics;
import nx.e0;
import okhttp3.Interceptor;

/* loaded from: classes.dex */
public final class j implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f140595a;

    public j(e0 pinalyticsEventManager) {
        Intrinsics.checkNotNullParameter(pinalyticsEventManager, "pinalyticsEventManager");
        this.f140595a = pinalyticsEventManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r3.equals("DELETE") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d8, code lost:
    
        r3 = r0.f95700a.f();
        r3.b("view_type", r2);
        r3.b("view_parameter", r1);
        r0 = r0.b();
        r1 = r3.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "url");
        r0.f95706a = r1;
        r0 = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r3.equals("POST") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r3 = r0.f95703d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if ((r3 instanceof okhttp3.FormBody) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r9 = 0;
        r4 = new okhttp3.FormBody.Builder(0);
        r3 = (okhttp3.FormBody) r3;
        r10 = r3.f95613b.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r9 >= r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        r4.b((java.lang.String) r3.f95613b.get(r9), (java.lang.String) r3.f95614c.get(r9));
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r4.b("view_type", r2);
        r4.b("view_parameter", r1);
        r1 = new okhttp3.FormBody(r4.f95616b, r4.f95617c);
        r2 = r0.b();
        r0 = r0.f95701b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, "PUT") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "body");
        r2.f("PUT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, "POST") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r2.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r3.equals("PUT") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (r3.equals("GET") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.j.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
