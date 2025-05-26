package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class kp1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f7436a;

    /* renamed from: b, reason: collision with root package name */
    public Function2 f7437b;

    /* renamed from: c, reason: collision with root package name */
    public np1 f7438c;

    /* renamed from: d, reason: collision with root package name */
    public int f7439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ np1 f7440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f7441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp1(np1 np1Var, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f7440e = np1Var;
        this.f7441f = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new kp1(this.f7440e, this.f7441f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kp1(this.f7440e, this.f7441f, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:2|(1:(1:(6:6|7|8|9|10|11)(2:17|18))(1:19))(2:31|(1:33)(1:34))|20|21|(1:23)(4:24|9|10|11)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r9.i(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [mo2.a] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Error interacting with offline buffered ping database: "
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r8.f7439d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            mo2.a r1 = r8.f7436a
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto L83
        L16:
            r9 = move-exception
            goto L8b
        L19:
            r9 = move-exception
            goto L6e
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            ads_mobile_sdk.np1 r2 = r8.f7438c
            kotlin.jvm.functions.Function2 r4 = r8.f7437b
            mo2.a r6 = r8.f7436a
            ue.c.H(r9)
            r9 = r6
            goto L4e
        L2e:
            ue.c.H(r9)
            ads_mobile_sdk.np1 r9 = r8.f7440e
            mo2.a r9 = ads_mobile_sdk.np1.a(r9)
            kotlin.jvm.functions.Function2 r2 = r8.f7441f
            ads_mobile_sdk.np1 r6 = r8.f7440e
            r8.f7436a = r9
            r8.f7437b = r2
            r8.f7438c = r6
            r8.f7439d = r4
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r4 = r9.f(r5, r8)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            r4 = r2
            r2 = r6
        L4e:
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.String r6 = "getWritableDatabase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8.f7436a = r9     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8.f7437b = r5     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8.f7438c = r5     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r8.f7439d = r3     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.lang.Object r0 = r4.invoke(r2, r8)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r9
            goto L83
        L68:
            r0 = move-exception
            goto L8d
        L6a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L6e:
            ok.e0 r2 = ads_mobile_sdk.gk0.f5596a     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r2.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L16
            ads_mobile_sdk.gk0.a(r9)     // Catch: java.lang.Throwable -> L16
        L83:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L16
            mo2.c r1 = (mo2.c) r1
            r1.i(r5)
            return r9
        L8b:
            r0 = r9
            r9 = r1
        L8d:
            mo2.c r9 = (mo2.c) r9
            r9.i(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kp1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
