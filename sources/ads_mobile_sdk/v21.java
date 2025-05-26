package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class v21 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public String f12293a;

    /* renamed from: b, reason: collision with root package name */
    public int f12294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f12295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f12296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f12298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(kotlin.jvm.internal.f0 f0Var, g31 g31Var, String str, j0 j0Var, bl2.c cVar) {
        super(1, cVar);
        this.f12295c = f0Var;
        this.f12296d = g31Var;
        this.f12297e = str;
        this.f12298f = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new v21(this.f12295c, this.f12296d, this.f12297e, this.f12298f, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v21) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f12294b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.String r0 = r7.f12293a
            ue.c.H(r8)
            goto L74
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            ue.c.H(r8)
            goto L46
        L21:
            ue.c.H(r8)
            goto L39
        L25:
            ue.c.H(r8)
            kotlin.jvm.internal.f0 r8 = r7.f12295c
            boolean r8 = r8.f80424a
            if (r8 != 0) goto L39
            long r5 = ads_mobile_sdk.g31.f5368o
            r7.f12294b = r4
            java.lang.Object r8 = lb.l0.T(r5, r7)
            if (r8 != r0) goto L39
            return r0
        L39:
            ads_mobile_sdk.g31 r8 = r7.f12296d
            java.lang.String r1 = r7.f12297e
            r7.f12294b = r3
            java.lang.Object r8 = ads_mobile_sdk.g31.b(r8, r1, r7)
            if (r8 != r0) goto L46
            return r0
        L46:
            java.lang.String r8 = (java.lang.String) r8
            kotlin.jvm.internal.f0 r1 = r7.f12295c
            boolean r1 = r1.f80424a
            if (r1 != 0) goto L73
            kotlin.jvm.internal.j0 r1 = r7.f12298f
            java.lang.Object r1 = r1.f80434a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L73
            boolean r1 = kotlin.text.z.j(r1)
            if (r1 == 0) goto L5d
            goto L73
        L5d:
            if (r8 == 0) goto L73
            boolean r1 = kotlin.text.z.j(r8)
            if (r1 == 0) goto L66
            goto L73
        L66:
            ads_mobile_sdk.g31 r1 = r7.f12296d
            r7.f12293a = r8
            r7.f12294b = r2
            java.lang.Object r1 = ads_mobile_sdk.g31.a(r1, r8, r7)
            if (r1 != r0) goto L73
            return r0
        L73:
            r0 = r8
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.v21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
