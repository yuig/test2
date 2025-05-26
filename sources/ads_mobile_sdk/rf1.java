package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class rf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf1 f10601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nm.u f10602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ if1 f10603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f10601a = uf1Var;
        this.f10602b = uVar;
        this.f10603c = if1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rf1(this.f10603c, this.f10601a, this.f10602b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            ue.c.H(r11)
            ads_mobile_sdk.uf1 r11 = r10.f10601a
            ads_mobile_sdk.oj1 r11 = r11.f12065d
            nm.u r0 = r10.f10602b
            r11.getClass()
            java.lang.String r11 = "adJson"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
            java.lang.String r1 = "mute"
            r2 = 0
            nm.u r0 = ads_mobile_sdk.k41.a(r0, r1, r2)
            java.lang.String r3 = "ping_url"
            java.lang.String r4 = "reason"
            java.lang.String r5 = ""
            if (r0 == 0) goto L6d
            java.lang.String r6 = "reasons"
            nm.q r0 = ads_mobile_sdk.k41.d(r0, r6)
            if (r0 != 0) goto L2b
            goto L6d
        L2b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r0 = r0.f91364a
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r0.next()
            nm.s r7 = (nm.s) r7
            nm.u r7 = r7.i()     // Catch: java.lang.Exception -> L66
            java.lang.String r8 = "getAsJsonObject(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Exception -> L66
            java.lang.String r8 = ads_mobile_sdk.k41.a(r7, r4, r5)     // Catch: java.lang.Exception -> L66
            java.lang.String r7 = ads_mobile_sdk.k41.a(r7, r3, r5)     // Catch: java.lang.Exception -> L66
            boolean r9 = kotlin.text.z.j(r8)     // Catch: java.lang.Exception -> L66
            if (r9 != 0) goto L66
            boolean r9 = kotlin.text.z.j(r7)     // Catch: java.lang.Exception -> L66
            if (r9 == 0) goto L60
            goto L66
        L60:
            ads_mobile_sdk.qz0 r9 = new ads_mobile_sdk.qz0     // Catch: java.lang.Exception -> L66
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
            r9 = r2
        L67:
            if (r9 == 0) goto L36
            r6.add(r9)
            goto L36
        L6d:
            kotlin.collections.q0 r6 = kotlin.collections.q0.f80391a
        L6f:
            java.util.Iterator r0 = r6.iterator()
        L73:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r6 = r0.next()
            ads_mobile_sdk.qz0 r6 = (ads_mobile_sdk.qz0) r6
            ads_mobile_sdk.if1 r7 = r10.f10603c
            java.util.List r7 = r7.f6383p
            r7.add(r6)
            goto L73
        L87:
            ads_mobile_sdk.if1 r0 = r10.f10603c
            ads_mobile_sdk.uf1 r6 = r10.f10601a
            ads_mobile_sdk.oj1 r6 = r6.f12065d
            nm.u r7 = r10.f10602b
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r11)
            java.lang.String r11 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r11)
            if (r7 != 0) goto L9d
            goto La2
        L9d:
            nm.u r1 = r7.x(r1)     // Catch: java.lang.Exception -> La2
            goto La3
        La2:
            r1 = r2
        La3:
            if (r1 == 0) goto Lcd
            java.lang.String r6 = "default_reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r11)
            nm.u r11 = r1.x(r6)     // Catch: java.lang.Exception -> Laf
            goto Lb0
        Laf:
            r11 = r2
        Lb0:
            if (r11 != 0) goto Lb3
            goto Lcd
        Lb3:
            java.lang.String r1 = ads_mobile_sdk.k41.a(r11, r4, r5)
            java.lang.String r11 = ads_mobile_sdk.k41.a(r11, r3, r5)
            boolean r3 = kotlin.text.z.j(r1)
            if (r3 != 0) goto Lcd
            boolean r3 = kotlin.text.z.j(r11)
            if (r3 == 0) goto Lc8
            goto Lcd
        Lc8:
            ads_mobile_sdk.qz0 r2 = new ads_mobile_sdk.qz0
            r2.<init>(r1, r11)
        Lcd:
            r0.f6384q = r2
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
