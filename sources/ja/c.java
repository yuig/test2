package ja;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public co2.e f75169r;

    /* renamed from: s, reason: collision with root package name */
    public int f75170s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f75171t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f75172u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ co2.q f75173v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Callable f75174w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ co2.q f75175x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d0 d0Var, d dVar, co2.q qVar, Callable callable, co2.q qVar2, bl2.c cVar) {
        super(2, cVar);
        this.f75171t = d0Var;
        this.f75172u = dVar;
        this.f75173v = qVar;
        this.f75174w = callable;
        this.f75175x = qVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f75171t, this.f75172u, this.f75173v, this.f75174w, this.f75175x, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x0035, B:14:0x0043, B:16:0x004b, B:25:0x0023, B:27:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f75170s
            r2 = 2
            r3 = 1
            ja.d r4 = r8.f75172u
            ja.d0 r5 = r8.f75171t
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            co2.e r1 = r8.f75169r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L17
        L15:
            r9 = r1
            goto L35
        L17:
            r9 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            co2.e r1 = r8.f75169r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L17
            goto L43
        L27:
            ue.c.H(r9)
            ja.s r9 = r5.f75182e
            r9.a(r4)
            co2.q r9 = r8.f75173v     // Catch: java.lang.Throwable -> L17
            co2.e r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
        L35:
            r8.f75169r = r9     // Catch: java.lang.Throwable -> L17
            r8.f75170s = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r9.d(r8)     // Catch: java.lang.Throwable -> L17
            if (r1 != r0) goto L40
            return r0
        L40:
            r7 = r1
            r1 = r9
            r9 = r7
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L17
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r9 == 0) goto L61
            r1.e()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Callable r9 = r8.f75174w     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L17
            co2.q r6 = r8.f75175x     // Catch: java.lang.Throwable -> L17
            r8.f75169r = r1     // Catch: java.lang.Throwable -> L17
            r8.f75170s = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r6.o(r9, r8)     // Catch: java.lang.Throwable -> L17
            if (r9 != r0) goto L15
            return r0
        L61:
            ja.s r9 = r5.f75182e
            r9.d(r4)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L69:
            ja.s r0 = r5.f75182e
            r0.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
