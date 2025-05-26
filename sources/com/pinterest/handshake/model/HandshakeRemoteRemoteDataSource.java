package com.pinterest.handshake.model;

import androidx.annotation.Keep;
import b60.b;
import com.pinterest.error.NetworkResponseError;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp1.l;
import op1.a;
import org.jetbrains.annotations.NotNull;
import qz.d;
import v.f1;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\tJ\"\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0015\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/pinterest/handshake/model/HandshakeRemoteRemoteDataSource;", "Lcom/pinterest/handshake/model/IHandshakeRemoteDataSource;", "", "dataError", "", "sendLogError", "(Ljava/lang/Throwable;)V", "Lcom/pinterest/handshake/model/models/HandshakeDataConnect;", "getApiKey", "(Lbl2/c;)Ljava/lang/Object;", "", "deleteToken", "", "token", "", "authType", "linkAccount", "(Ljava/lang/String;ILbl2/c;)Ljava/lang/Object;", "Landroid/net/Uri;", "getLoginUrl", "(ILbl2/c;)Ljava/lang/Object;", "getToken", "Lcom/pinterest/handshake/model/HandshakeApiClientService;", "handshakeApiClientService", "Lcom/pinterest/handshake/model/HandshakeApiClientService;", "Lmp1/l;", "handshakeAnalytics", "Lmp1/l;", "Lb60/b;", "activeUserManager", "Lb60/b;", "<init>", "(Lcom/pinterest/handshake/model/HandshakeApiClientService;Lmp1/l;Lb60/b;)V", "Companion", "op1/a", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HandshakeRemoteRemoteDataSource implements IHandshakeRemoteDataSource {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    private static final String ERROR_UNAUTHORIZED = "User is not logged in";

    @NotNull
    private final b activeUserManager;

    @NotNull
    private final l handshakeAnalytics;

    @NotNull
    private final HandshakeApiClientService handshakeApiClientService;

    public HandshakeRemoteRemoteDataSource(@NotNull HandshakeApiClientService handshakeApiClientService, @NotNull l handshakeAnalytics, @NotNull b activeUserManager) {
        Intrinsics.checkNotNullParameter(handshakeApiClientService, "handshakeApiClientService");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.handshakeApiClientService = handshakeApiClientService;
        this.handshakeAnalytics = handshakeAnalytics;
        this.activeUserManager = activeUserManager;
    }

    private final void sendLogError(Throwable dataError) {
        d M;
        String num;
        NetworkResponseError networkResponseError = dataError instanceof NetworkResponseError ? (NetworkResponseError) dataError : null;
        String str = "";
        if (networkResponseError == null) {
            l lVar = this.handshakeAnalytics;
            String message = dataError.getMessage();
            if (message == null) {
                message = "";
            }
            ((mp1.b) lVar).b(message, "");
            return;
        }
        l lVar2 = this.handshakeAnalytics;
        String message2 = networkResponseError.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        f1 f1Var = networkResponseError.f45043a;
        if (f1Var != null && (M = k3.M(f1Var)) != null && (num = Integer.valueOf(M.f105387g).toString()) != null) {
            str = num;
        }
        ((mp1.b) lVar2).b(message2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.pinterest.handshake.model.IHandshakeRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deleteToken(@org.jetbrains.annotations.NotNull bl2.c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof op1.b
            if (r0 == 0) goto L13
            r0 = r9
            op1.b r0 = (op1.b) r0
            int r1 = r0.f96924u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96924u = r1
            goto L18
        L13:
            op1.b r0 = new op1.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f96922s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f96924u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource r0 = r0.f96921r
            ue.c.H(r9)
            goto L58
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            ue.c.H(r9)
            b60.b r9 = r8.activeUserManager
            b60.d r9 = (b60.d) r9
            boolean r9 = r9.i()
            if (r9 != 0) goto L4a
            mp1.l r9 = r8.handshakeAnalytics
            java.lang.String r0 = "User is not logged in"
            mp1.b r9 = (mp1.b) r9
            r9.a(r0)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L4a:
            com.pinterest.handshake.model.HandshakeApiClientService r9 = r8.handshakeApiClientService
            r0.f96921r = r8
            r0.f96924u = r3
            java.lang.Object r9 = r9.unlinkToken(r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r0 = r8
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r9 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r9
            boolean r1 = r9 instanceof xz.a
            if (r1 == 0) goto L76
            mp1.l r0 = r0.handshakeAnalytics
            xz.a r9 = (xz.a) r9
            java.lang.Throwable r9 = r9.a()
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L6e
            java.lang.String r9 = ""
        L6e:
            mp1.b r0 = (mp1.b) r0
            r0.a(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L76:
            boolean r9 = r9 instanceof xz.b
            if (r9 == 0) goto Laa
            mp1.l r9 = r0.handshakeAnalytics
            mp1.b r9 = (mp1.b) r9
            mp1.c r0 = r9.f87922b
            r0.getClass()
            h32.i0 r0 = new h32.i0
            r7 = 0
            r1 = r0
            r2 = r7
            r3 = r7
            r4 = r7
            r5 = r7
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            h32.f1 r1 = h32.f1.AMAZON_ACCT_UNCLAIMING_SUCCESS
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r3 = 0
            nx.d0 r9 = r9.f87921a
            r9.g(r1, r3, r2, r0)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        Laa:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource.deleteToken(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.pinterest.handshake.model.IHandshakeRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getApiKey(@org.jetbrains.annotations.NotNull bl2.c<? super com.pinterest.handshake.model.models.HandshakeDataConnect> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof op1.c
            if (r0 == 0) goto L13
            r0 = r11
            op1.c r0 = (op1.c) r0
            int r1 = r0.f96928u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96928u = r1
            goto L18
        L13:
            op1.c r0 = new op1.c
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f96926s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f96928u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource r0 = r0.f96925r
            ue.c.H(r11)
            goto L58
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            ue.c.H(r11)
            b60.b r11 = r10.activeUserManager
            b60.d r11 = (b60.d) r11
            boolean r11 = r11.i()
            if (r11 != 0) goto L4a
            java.lang.Throwable r11 = new java.lang.Throwable
            java.lang.String r0 = "User is not logged in"
            r11.<init>(r0)
            r10.sendLogError(r11)
            return r3
        L4a:
            com.pinterest.handshake.model.HandshakeApiClientService r11 = r10.handshakeApiClientService
            r0.f96925r = r10
            r0.f96928u = r4
            java.lang.Object r11 = r11.getApiKey(r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            r0 = r10
        L58:
            com.pinterest.api.adapter.coroutine.NetworkResponse r11 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r11
            boolean r1 = r11 instanceof xz.a
            if (r1 == 0) goto L68
            xz.a r11 = (xz.a) r11
            java.lang.Throwable r11 = r11.a()
            r0.sendLogError(r11)
            goto L83
        L68:
            boolean r0 = r11 instanceof xz.b
            if (r0 == 0) goto L83
            xz.b r11 = (xz.b) r11
            java.lang.Object r11 = r11.f136205a
            com.pinterest.api.model.j1 r11 = (com.pinterest.api.model.j1) r11
            java.lang.String r6 = r11.b()
            if (r6 == 0) goto L83
            com.pinterest.handshake.model.models.HandshakeDataConnect r11 = new com.pinterest.handshake.model.models.HandshakeDataConnect
            r5 = 0
            r7 = 0
            r8 = 5
            r9 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource.getApiKey(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.pinterest.handshake.model.IHandshakeRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getLoginUrl(int r6, @org.jetbrains.annotations.NotNull bl2.c<? super android.net.Uri> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof op1.d
            if (r0 == 0) goto L13
            r0 = r7
            op1.d r0 = (op1.d) r0
            int r1 = r0.f96932u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96932u = r1
            goto L18
        L13:
            op1.d r0 = new op1.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f96930s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f96932u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource r6 = r0.f96929r
            ue.c.H(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ue.c.H(r7)
            b60.b r7 = r5.activeUserManager
            b60.d r7 = (b60.d) r7
            boolean r7 = r7.i()
            if (r7 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r7 = "User is not logged in"
            r6.<init>(r7)
            r5.sendLogError(r6)
            return r3
        L4a:
            com.pinterest.handshake.model.HandshakeApiClientService r7 = r5.handshakeApiClientService
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r0.f96929r = r5
            r0.f96932u = r4
            java.lang.Object r7 = r7.getLoginUrl(r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r6 = r5
        L5d:
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r7
            boolean r0 = r7 instanceof xz.a
            if (r0 == 0) goto L6d
            xz.a r7 = (xz.a) r7
            java.lang.Throwable r7 = r7.a()
            r6.sendLogError(r7)
            goto L82
        L6d:
            boolean r6 = r7 instanceof xz.b
            if (r6 == 0) goto L82
            xz.b r7 = (xz.b) r7
            java.lang.Object r6 = r7.f136205a
            com.pinterest.api.model.z r6 = (com.pinterest.api.model.z) r6
            java.lang.String r6 = r6.b()
            if (r6 == 0) goto L82
            android.net.Uri r6 = android.net.Uri.parse(r6)
            return r6
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource.getLoginUrl(int, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.pinterest.handshake.model.IHandshakeRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getToken(@org.jetbrains.annotations.NotNull bl2.c<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof op1.e
            if (r0 == 0) goto L13
            r0 = r6
            op1.e r0 = (op1.e) r0
            int r1 = r0.f96936u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96936u = r1
            goto L18
        L13:
            op1.e r0 = new op1.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f96934s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f96936u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource r0 = r0.f96933r
            ue.c.H(r6)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            b60.b r6 = r5.activeUserManager
            b60.d r6 = (b60.d) r6
            boolean r6 = r6.i()
            if (r6 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r0 = "User is not logged in"
            r6.<init>(r0)
            r5.sendLogError(r6)
            return r3
        L4a:
            com.pinterest.handshake.model.HandshakeApiClientService r6 = r5.handshakeApiClientService
            r0.f96933r = r5
            r0.f96936u = r4
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
            r0.sendLogError(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource.getToken(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.pinterest.handshake.model.IHandshakeRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object linkAccount(@org.jetbrains.annotations.NotNull java.lang.String r6, int r7, @org.jetbrains.annotations.NotNull bl2.c<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof op1.f
            if (r0 == 0) goto L13
            r0 = r8
            op1.f r0 = (op1.f) r0
            int r1 = r0.f96940u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96940u = r1
            goto L18
        L13:
            op1.f r0 = new op1.f
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f96938s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f96940u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource r6 = r0.f96937r
            ue.c.H(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ue.c.H(r8)
            b60.b r8 = r5.activeUserManager
            b60.d r8 = (b60.d) r8
            boolean r8 = r8.i()
            if (r8 != 0) goto L4a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r7 = "User is not logged in"
            r6.<init>(r7)
            r5.sendLogError(r6)
            return r3
        L4a:
            com.pinterest.handshake.model.HandshakeApiClientService r8 = r5.handshakeApiClientService
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r0.f96937r = r5
            r0.f96940u = r4
            java.lang.Object r8 = r8.linkToken(r6, r2, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r6 = r5
        L5d:
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r8
            boolean r7 = r8 instanceof xz.a
            if (r7 == 0) goto L6d
            xz.a r8 = (xz.a) r8
            java.lang.Throwable r7 = r8.a()
            r6.sendLogError(r7)
            goto L7c
        L6d:
            boolean r6 = r8 instanceof xz.b
            if (r6 == 0) goto L7c
            xz.b r8 = (xz.b) r8
            java.lang.Object r6 = r8.f136205a
            com.pinterest.api.model.n1 r6 = (com.pinterest.api.model.n1) r6
            java.lang.String r6 = r6.d()
            return r6
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource.linkAccount(java.lang.String, int, bl2.c):java.lang.Object");
    }
}
