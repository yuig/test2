package fd;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;

/* loaded from: classes3.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final WebSocket.Factory f61760a;

    public d() {
        OkHttpClient webSocketFactory = new OkHttpClient();
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        this.f61760a = webSocketFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, java.util.List r8, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof fd.a
            if (r0 == 0) goto L13
            r0 = r9
            fd.a r0 = (fd.a) r0
            int r1 = r0.f61744v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61744v = r1
            goto L18
        L13:
            fd.a r0 = new fd.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f61742t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f61744v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            okhttp3.WebSocket r7 = r0.f61741s
            bd.b r8 = r0.f61740r
            ue.c.H(r9)
            goto L74
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ue.c.H(r9)
            bd.b r9 = new bd.b
            r2 = 6
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            co2.m r2 = lb.l0.b(r5, r4, r2)
            r9.<init>(r2)
            ao2.w r2 = ue.c.a()
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            r4.j(r7)
            okhttp3.Headers r7 = dd.b.a(r8)
            r4.e(r7)
            okhttp3.Request r7 = r4.b()
            fd.c r8 = new fd.c
            r8.<init>(r2, r9)
            okhttp3.WebSocket$Factory r4 = r6.f61760a
            okhttp3.WebSocket r7 = r4.newWebSocket(r7, r8)
            r0.f61740r = r9
            r0.f61741s = r7
            r0.f61744v = r3
            java.lang.Object r8 = r2.v(r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            r8 = r9
        L74:
            z3.m r9 = new z3.m
            r0 = 5
            r9.<init>(r7, r0)
            r8.getClass()
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r8.f22683b = r9
            fd.b r9 = new fd.b
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d.a(java.lang.String, java.util.List, bl2.c):java.lang.Object");
    }
}
