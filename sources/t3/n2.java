package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public co2.b0 f116099r;

    /* renamed from: s, reason: collision with root package name */
    public co2.e f116100s;

    /* renamed from: t, reason: collision with root package name */
    public int f116101t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ co2.q f116102u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(co2.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f116102u = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n2(this.f116102u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x0032, B:9:0x003a, B:10:0x0048, B:17:0x005f, B:19:0x0025, B:23:0x0062, B:26:0x0066, B:27:0x0067, B:28:0x0068, B:34:0x0020, B:12:0x0049, B:14:0x0055), top: B:2:0x0005, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x0032, B:9:0x003a, B:10:0x0048, B:17:0x005f, B:19:0x0025, B:23:0x0062, B:26:0x0066, B:27:0x0067, B:28:0x0068, B:34:0x0020, B:12:0x0049, B:14:0x0055), top: B:2:0x0005, inners: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x002f -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f116101t
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            co2.e r1 = r6.f116100s
            co2.b0 r3 = r6.f116099r
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L11
            goto L32
        L11:
            r7 = move-exception
            goto L71
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            ue.c.H(r7)
            co2.q r3 = r6.f116102u
            co2.e r7 = r3.iterator()     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L25:
            r6.f116099r = r3     // Catch: java.lang.Throwable -> L11
            r6.f116100s = r1     // Catch: java.lang.Throwable -> L11
            r6.f116101t = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.d(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L68
            java.lang.Object r7 = r1.e()     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = t3.o2.f116109b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = s2.p.f110667b     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference r5 = s2.p.f110674i     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L5d
            s2.b r5 = (s2.b) r5     // Catch: java.lang.Throwable -> L5d
            g1.g0 r5 = r5.f110610h     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5f
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L5d
            if (r5 != r2) goto L5f
            r4 = r2
            goto L5f
        L5d:
            r0 = move-exception
            goto L66
        L5f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L25
            s2.p.a()     // Catch: java.lang.Throwable -> L11
            goto L25
        L66:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L68:
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L11
            r7 = 0
            com.bumptech.glide.c.o(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L71:
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            com.bumptech.glide.c.o(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
