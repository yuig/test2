package a92;

import com.pinterest.error.NetworkResponseError;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import v.f1;
import y82.i;

/* loaded from: classes2.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final b f1605a;

    /* renamed from: b, reason: collision with root package name */
    public final y82.h f1606b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f1607c;

    public h(b handshakeApiClientService, y82.h handshakeAnalytics, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(handshakeApiClientService, "handshakeApiClientService");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f1605a = handshakeApiClientService;
        this.f1606b = handshakeAnalytics;
        this.f1607c = activeUserManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a92.c
            if (r0 == 0) goto L13
            r0 = r6
            a92.c r0 = (a92.c) r0
            int r1 = r0.f1588u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1588u = r1
            goto L18
        L13:
            a92.c r0 = new a92.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1586s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1588u
            java.lang.String r3 = "failReason"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            a92.h r0 = r0.f1585r
            ue.c.H(r6)
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            ue.c.H(r6)
            b60.b r6 = r5.f1607c
            b60.d r6 = (b60.d) r6
            boolean r6 = r6.i()
            if (r6 != 0) goto L4f
            y82.h r6 = r5.f1606b
            y82.i r6 = (y82.i) r6
            r6.getClass()
            java.lang.String r6 = "User is not logged in"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4f:
            r0.f1585r = r5
            r0.f1588u = r4
            a92.b r6 = r5.f1605a
            java.lang.Object r6 = r6.unlinkToken(r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r6
            boolean r1 = r6 instanceof xz.a
            if (r1 == 0) goto L7e
            y82.h r0 = r0.f1606b
            xz.a r6 = (xz.a) r6
            java.lang.Throwable r6 = r6.a()
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L73
            java.lang.String r6 = ""
        L73:
            y82.i r0 = (y82.i) r0
            r0.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L7e:
            boolean r6 = r6 instanceof xz.b
            if (r6 == 0) goto L8a
            y82.h r6 = r0.f1606b
            r6.getClass()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L8a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.h.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a92.d
            if (r0 == 0) goto L13
            r0 = r6
            a92.d r0 = (a92.d) r0
            int r1 = r0.f1592u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1592u = r1
            goto L18
        L13:
            a92.d r0 = new a92.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1590s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1592u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            a92.h r0 = r0.f1589r
            ue.c.H(r6)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            b60.b r6 = r5.f1607c
            b60.d r6 = (b60.d) r6
            boolean r6 = r6.i()
            if (r6 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r0 = "User is not logged in"
            r6.<init>(r0)
            r5.f(r6)
            return r3
        L4a:
            r0.f1589r = r5
            r0.f1592u = r4
            a92.b r6 = r5.f1605a
            java.lang.Object r6 = r6.getApiKey(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r0 = r5
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r6
            boolean r1 = r6 instanceof xz.a
            if (r1 == 0) goto L68
            xz.a r6 = (xz.a) r6
            java.lang.Throwable r6 = r6.a()
            r0.f(r6)
            goto L7f
        L68:
            boolean r0 = r6 instanceof xz.b
            if (r0 == 0) goto L7f
            xz.b r6 = (xz.b) r6
            java.lang.Object r6 = r6.f136205a
            com.pinterest.api.model.j1 r6 = (com.pinterest.api.model.j1) r6
            java.lang.String r6 = r6.b()
            if (r6 == 0) goto L7f
            b92.b r0 = new b92.b
            r1 = 5
            r0.<init>(r3, r6, r1)
            return r0
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.h.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Comparable c(java.lang.String r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a92.e
            if (r0 == 0) goto L13
            r0 = r7
            a92.e r0 = (a92.e) r0
            int r1 = r0.f1596u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1596u = r1
            goto L18
        L13:
            a92.e r0 = new a92.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1594s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1596u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            a92.h r6 = r0.f1593r
            ue.c.H(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ue.c.H(r7)
            b60.b r7 = r5.f1607c
            b60.d r7 = (b60.d) r7
            boolean r7 = r7.i()
            if (r7 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r7 = "User is not logged in"
            r6.<init>(r7)
            r5.f(r6)
            return r3
        L4a:
            r0.f1593r = r5
            r0.f1596u = r4
            a92.b r7 = r5.f1605a
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r7
            boolean r0 = r7 instanceof xz.a
            if (r0 == 0) goto L66
            xz.a r7 = (xz.a) r7
            java.lang.Throwable r7 = r7.f136204a
            r6.f(r7)
            goto L7b
        L66:
            boolean r6 = r7 instanceof xz.b
            if (r6 == 0) goto L7b
            xz.b r7 = (xz.b) r7
            java.lang.Object r6 = r7.f136205a
            com.pinterest.api.model.z r6 = (com.pinterest.api.model.z) r6
            java.lang.String r6 = r6.b()
            if (r6 == 0) goto L7b
            android.net.Uri r6 = android.net.Uri.parse(r6)
            return r6
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.h.c(java.lang.String, bl2.c):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a92.f
            if (r0 == 0) goto L13
            r0 = r6
            a92.f r0 = (a92.f) r0
            int r1 = r0.f1600u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1600u = r1
            goto L18
        L13:
            a92.f r0 = new a92.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1598s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1600u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            a92.h r0 = r0.f1597r
            ue.c.H(r6)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            b60.b r6 = r5.f1607c
            b60.d r6 = (b60.d) r6
            boolean r6 = r6.i()
            if (r6 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r0 = "User is not logged in"
            r6.<init>(r0)
            r5.f(r6)
            return r3
        L4a:
            r0.f1597r = r5
            r0.f1600u = r4
            a92.b r6 = r5.f1605a
            java.lang.Object r6 = r6.getToken(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r0 = r5
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r6
            boolean r1 = r6 instanceof xz.a
            if (r1 == 0) goto L68
            xz.a r6 = (xz.a) r6
            java.lang.Throwable r6 = r6.a()
            r0.f(r6)
            goto L77
        L68:
            boolean r0 = r6 instanceof xz.b
            if (r0 == 0) goto L77
            xz.b r6 = (xz.b) r6
            java.lang.Object r6 = r6.f136205a
            com.pinterest.api.model.n1 r6 = (com.pinterest.api.model.n1) r6
            java.lang.String r6 = r6.d()
            return r6
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.h.d(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a92.g
            if (r0 == 0) goto L13
            r0 = r7
            a92.g r0 = (a92.g) r0
            int r1 = r0.f1604u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1604u = r1
            goto L18
        L13:
            a92.g r0 = new a92.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1602s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1604u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            a92.h r6 = r0.f1601r
            ue.c.H(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ue.c.H(r7)
            b60.b r7 = r5.f1607c
            b60.d r7 = (b60.d) r7
            boolean r7 = r7.i()
            if (r7 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r7 = "User is not logged in"
            r6.<init>(r7)
            r5.f(r6)
            return r3
        L4a:
            r0.f1601r = r5
            r0.f1604u = r4
            a92.b r7 = r5.f1605a
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r7
            boolean r0 = r7 instanceof xz.a
            if (r0 == 0) goto L68
            xz.a r7 = (xz.a) r7
            java.lang.Throwable r7 = r7.a()
            r6.f(r7)
            goto L8d
        L68:
            boolean r6 = r7 instanceof xz.b
            if (r6 == 0) goto L8d
            b92.a r6 = new b92.a
            xz.b r7 = (xz.b) r7
            java.lang.Object r0 = r7.f136205a
            com.pinterest.api.model.n1 r0 = (com.pinterest.api.model.n1) r0
            java.lang.String r0 = r0.d()
            java.lang.Object r7 = r7.f136205a
            com.pinterest.api.model.n1 r7 = (com.pinterest.api.model.n1) r7
            java.lang.Boolean r7 = r7.e()
            java.lang.String r1 = "getTemporaryToken(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            boolean r7 = r7.booleanValue()
            r6.<init>(r0, r7)
            return r6
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a92.h.e(java.lang.String, bl2.c):java.lang.Object");
    }

    public final void f(Throwable th3) {
        qz.d M;
        String num;
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        y82.h hVar = this.f1606b;
        String str = "";
        if (networkResponseError == null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            ((i) hVar).b(message, "");
            return;
        }
        String message2 = networkResponseError.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        f1 f1Var = networkResponseError.f45043a;
        if (f1Var != null && (M = k3.M(f1Var)) != null && (num = Integer.valueOf(M.f105387g).toString()) != null) {
            str = num;
        }
        ((i) hVar).b(message2, str);
    }
}
