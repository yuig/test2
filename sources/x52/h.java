package x52;

import ao2.j0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f133856r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f133857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fn0.t f133858t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ File f133859u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ File f133860v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fn0.g f133861w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f133862x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f133863y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function1 f133864z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fn0.t tVar, File file, File file2, fn0.g gVar, n nVar, Function1 function1, Function1 function12, bl2.c cVar) {
        super(2, cVar);
        this.f133858t = tVar;
        this.f133859u = file;
        this.f133860v = file2;
        this.f133861w = gVar;
        this.f133862x = nVar;
        this.f133863y = function1;
        this.f133864z = function12;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f133858t, this.f133859u, this.f133860v, this.f133861w, this.f133862x, this.f133863y, this.f133864z, cVar);
        hVar.f133857s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
    
        return kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r15.exists() == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ao2.j0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "getAbsolutePath(...)"
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r14.f133856r
            r3 = 2
            r4 = 1
            fn0.g r5 = r14.f133861w
            fn0.t r6 = r14.f133858t
            if (r2 == 0) goto L2f
            if (r2 == r4) goto L27
            if (r2 != r3) goto L1f
            java.lang.Object r0 = r14.f133857s
            ao2.j0 r0 = (ao2.j0) r0
            ue.c.H(r15)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            goto L72
        L1a:
            r15 = move-exception
            goto L9f
        L1d:
            r15 = move-exception
            goto L85
        L1f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L27:
            java.lang.Object r0 = r14.f133857s
            ao2.j0 r0 = (ao2.j0) r0
            ue.c.H(r15)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            goto L54
        L2f:
            ue.c.H(r15)
            java.lang.Object r15 = r14.f133857s
            ao2.j0 r15 = (ao2.j0) r15
            java.io.File r2 = r14.f133859u     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            java.io.File r7 = r14.f133860v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            r14.f133857s = r15     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            r14.f133856r = r4     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            java.lang.Object r0 = r6.a(r2, r7, r5, r14)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L81
            if (r0 != r1) goto L53
            return r1
        L53:
            r0 = r15
        L54:
            do2.j0 r15 = r6.c()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            k1.j0 r2 = new k1.j0     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            x52.n r8 = r14.f133862x     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            kotlin.jvm.functions.Function1 r9 = r14.f133863y     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.io.File r10 = r14.f133860v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            kotlin.jvm.functions.Function1 r11 = r14.f133864z     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r12 = 6
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r14.f133857s = r0     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r14.f133856r = r3     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.Object r15 = r15.collect(r2, r14)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            if (r15 != r1) goto L72
            return r1
        L72:
            r6.b()
            java.io.File r15 = r5.f62628e
            boolean r0 = r15.exists()
            if (r0 == 0) goto L9c
        L7d:
            r15.delete()
            goto L9c
        L81:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
        L85:
            x52.n r1 = r14.f133862x     // Catch: java.lang.Throwable -> L1a
            kotlin.jvm.functions.Function1 r2 = r14.f133863y     // Catch: java.lang.Throwable -> L1a
            x52.n.a(r1, r15, r2)     // Catch: java.lang.Throwable -> L1a
            r15 = 0
            dl2.b.E(r0, r15)     // Catch: java.lang.Throwable -> L1a
            r6.b()
            java.io.File r15 = r5.f62628e
            boolean r0 = r15.exists()
            if (r0 == 0) goto L9c
            goto L7d
        L9c:
            kotlin.Unit r15 = kotlin.Unit.f80348a
            return r15
        L9f:
            r6.b()
            java.io.File r0 = r5.f62628e
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lad
            r0.delete()
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
