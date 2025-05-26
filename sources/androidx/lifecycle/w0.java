package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f18709r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f18710s;

    /* renamed from: t, reason: collision with root package name */
    public ao2.j0 f18711t;

    /* renamed from: u, reason: collision with root package name */
    public Function2 f18712u;

    /* renamed from: v, reason: collision with root package name */
    public int f18713v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f18714w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f18715x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f18716y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function2 f18717z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(s sVar, r rVar, ao2.j0 j0Var, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f18714w = sVar;
        this.f18715x = rVar;
        this.f18716y = j0Var;
        this.f18717z = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w0(this.f18714w, this.f18715x, this.f18716y, this.f18717z, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r1.f18713v
            r3 = 0
            androidx.lifecycle.s r4 = r1.f18714w
            r5 = 1
            if (r2 == 0) goto L2a
            if (r2 != r5) goto L22
            kotlin.jvm.functions.Function2 r0 = r1.f18712u
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            ao2.j0 r0 = r1.f18711t
            ao2.j0 r0 = (ao2.j0) r0
            kotlin.jvm.internal.j0 r2 = r1.f18710s
            kotlin.jvm.internal.j0 r5 = r1.f18709r
            ue.c.H(r17)     // Catch: java.lang.Throwable -> L1f
            goto L98
        L1f:
            r0 = move-exception
            goto Laf
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L2a:
            ue.c.H(r17)
            r2 = r4
            androidx.lifecycle.b0 r2 = (androidx.lifecycle.b0) r2
            androidx.lifecycle.r r2 = r2.f18588d
            androidx.lifecycle.r r6 = androidx.lifecycle.r.DESTROYED
            if (r2 != r6) goto L39
            kotlin.Unit r0 = kotlin.Unit.f80348a
            return r0
        L39:
            kotlin.jvm.internal.j0 r2 = new kotlin.jvm.internal.j0
            r2.<init>()
            kotlin.jvm.internal.j0 r13 = new kotlin.jvm.internal.j0
            r13.<init>()
            androidx.lifecycle.r r6 = r1.f18715x     // Catch: java.lang.Throwable -> Lad
            ao2.j0 r8 = r1.f18716y     // Catch: java.lang.Throwable -> Lad
            kotlin.jvm.functions.Function2 r12 = r1.f18717z     // Catch: java.lang.Throwable -> Lad
            r1.f18709r = r2     // Catch: java.lang.Throwable -> Lad
            r1.f18710s = r13     // Catch: java.lang.Throwable -> Lad
            r7 = r8
            ao2.j0 r7 = (ao2.j0) r7     // Catch: java.lang.Throwable -> Lad
            r1.f18711t = r7     // Catch: java.lang.Throwable -> Lad
            r7 = r12
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> Lad
            r1.f18712u = r7     // Catch: java.lang.Throwable -> Lad
            r1.f18713v = r5     // Catch: java.lang.Throwable -> Lad
            ao2.o r14 = new ao2.o     // Catch: java.lang.Throwable -> Lad
            bl2.c r7 = cl2.h.b(r16)     // Catch: java.lang.Throwable -> Lad
            r14.<init>(r5, r7)     // Catch: java.lang.Throwable -> Lad
            r14.v()     // Catch: java.lang.Throwable -> Lad
            androidx.lifecycle.o r5 = androidx.lifecycle.q.Companion     // Catch: java.lang.Throwable -> Lad
            r5.getClass()     // Catch: java.lang.Throwable -> Lad
            androidx.lifecycle.q r7 = androidx.lifecycle.o.c(r6)     // Catch: java.lang.Throwable -> Lad
            androidx.lifecycle.q r9 = androidx.lifecycle.o.a(r6)     // Catch: java.lang.Throwable -> Lad
            mo2.c r11 = mo2.d.a()     // Catch: java.lang.Throwable -> Lad
            androidx.lifecycle.v0 r15 = new androidx.lifecycle.v0     // Catch: java.lang.Throwable -> Lad
            r5 = r15
            r6 = r7
            r7 = r2
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lad
            r13.f80434a = r15     // Catch: java.lang.Throwable -> Lad
            r4.a(r15)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r14.u()     // Catch: java.lang.Throwable -> Lad
            if (r5 != r0) goto L93
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: java.lang.Throwable -> Lad
            goto L93
        L90:
            r5 = r2
            r2 = r13
            goto Laf
        L93:
            if (r5 != r0) goto L96
            return r0
        L96:
            r5 = r2
            r2 = r13
        L98:
            java.lang.Object r0 = r5.f80434a
            ao2.o1 r0 = (ao2.o1) r0
            if (r0 == 0) goto La1
            r0.cancel(r3)
        La1:
            java.lang.Object r0 = r2.f80434a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            if (r0 == 0) goto Laa
            r4.b(r0)
        Laa:
            kotlin.Unit r0 = kotlin.Unit.f80348a
            return r0
        Lad:
            r0 = move-exception
            goto L90
        Laf:
            java.lang.Object r5 = r5.f80434a
            ao2.o1 r5 = (ao2.o1) r5
            if (r5 == 0) goto Lb8
            r5.cancel(r3)
        Lb8:
            java.lang.Object r2 = r2.f80434a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            if (r2 == 0) goto Lc1
            r4.b(r2)
        Lc1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
