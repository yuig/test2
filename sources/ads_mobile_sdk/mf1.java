package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f8196a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f8197b;

    /* renamed from: c, reason: collision with root package name */
    public if1 f8198c;

    /* renamed from: d, reason: collision with root package name */
    public int f8199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if1 f8200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf1 f8201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.u f8202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f8200e = if1Var;
        this.f8201f = uf1Var;
        this.f8202g = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mf1(this.f8200e, this.f8201f, this.f8202g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: all -> 0x008e, TryCatch #4 {all -> 0x008e, blocks: (B:17:0x0077, B:19:0x007e, B:21:0x0085, B:23:0x0089, B:25:0x008d, B:26:0x0090, B:27:0x0095, B:28:0x0096, B:29:0x009d, B:30:0x009e, B:31:0x00a5, B:32:0x00a6), top: B:16:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #4 {all -> 0x008e, blocks: (B:17:0x0077, B:19:0x007e, B:21:0x0085, B:23:0x0089, B:25:0x008d, B:26:0x0090, B:27:0x0095, B:28:0x0096, B:29:0x009d, B:30:0x009e, B:31:0x00a5, B:32:0x00a6), top: B:16:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005b  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f8199d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            ads_mobile_sdk.if1 r0 = r7.f8198c
            ads_mobile_sdk.cs2 r1 = r7.f8197b
            ads_mobile_sdk.cs2 r2 = r7.f8196a
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L14
            goto L5e
        L14:
            r8 = move-exception
            goto L72
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            ue.c.H(r8)
            ads_mobile_sdk.if1 r8 = r7.f8200e
            ads_mobile_sdk.il0 r1 = ads_mobile_sdk.il0.CUI_NAME_LOAD_NATIVE_ICON
            ads_mobile_sdk.uf1 r4 = r7.f8201f
            nm.u r5 = r7.f8202g
            java.util.WeakHashMap r6 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r6 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r1 = ads_mobile_sdk.qs2.a(r1, r6, r2)
            ads_mobile_sdk.dj1 r4 = r4.f12064c     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = "app_icon"
            r7.f8196a = r1     // Catch: java.lang.Throwable -> L75
            r7.f8197b = r1     // Catch: java.lang.Throwable -> L75
            r7.f8198c = r8     // Catch: java.lang.Throwable -> L75
            r7.f8199d = r2     // Catch: java.lang.Throwable -> L75
            r4.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto L48
            goto L4d
        L48:
            nm.u r2 = r5.x(r6)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L75
            goto L4e
        L4d:
            r2 = r3
        L4e:
            bj.n r5 = r4.f4305a     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.i()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r4.a(r2, r5, r7)     // Catch: java.lang.Throwable -> L75
            if (r2 != r0) goto L5b
            return r0
        L5b:
            r0 = r8
            r8 = r2
            r2 = r1
        L5e:
            ads_mobile_sdk.rz0 r8 = (ads_mobile_sdk.rz0) r8     // Catch: java.lang.Throwable -> L14
            boolean r4 = r8 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L6a
            r4 = r8
            ads_mobile_sdk.jk0 r4 = (ads_mobile_sdk.jk0) r4     // Catch: java.lang.Throwable -> L14
            ads_mobile_sdk.ft2.a(r4)     // Catch: java.lang.Throwable -> L14
        L6a:
            dl2.b.J(r1, r3)
            r0.f6374g = r8
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L72:
            r0 = r1
            r1 = r2
            goto L77
        L75:
            r8 = move-exception
            r0 = r1
        L77:
            r1.b(r8)     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r8 instanceof a.jf     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto La6
            r1.a(r8)     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L9e
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L96
            boolean r1 = r8 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            throw r8     // Catch: java.lang.Throwable -> L8e
        L8e:
            r8 = move-exception
            goto La7
        L90:
            ads_mobile_sdk.dk0 r1 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L96:
            ads_mobile_sdk.yj0 r1 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L9e:
            ads_mobile_sdk.xl0 r1 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L8e
            kotlinx.coroutines.TimeoutCancellationException r8 = (kotlinx.coroutines.TimeoutCancellationException) r8     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        La6:
            throw r8     // Catch: java.lang.Throwable -> L8e
        La7:
            throw r8     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            dl2.b.J(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
