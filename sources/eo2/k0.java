package eo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 extends dl2.d implements do2.j {

    /* renamed from: r, reason: collision with root package name */
    public final do2.j f59789r;

    /* renamed from: s, reason: collision with root package name */
    public final CoroutineContext f59790s;

    /* renamed from: t, reason: collision with root package name */
    public final int f59791t;

    /* renamed from: u, reason: collision with root package name */
    public CoroutineContext f59792u;

    /* renamed from: v, reason: collision with root package name */
    public bl2.c f59793v;

    public k0(do2.j jVar, CoroutineContext coroutineContext) {
        super(h0.f59774a, kotlin.coroutines.j.f80412a);
        this.f59789r = jVar;
        this.f59790s = coroutineContext;
        this.f59791t = ((Number) coroutineContext.fold(0, new ao2.b0(3))).intValue();
    }

    public static void s(d0 d0Var, Object obj) {
        throw new IllegalStateException(kotlin.text.t.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + d0Var.f59754b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c frame) {
        try {
            Object r13 = r(frame, obj);
            cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
            if (r13 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return r13 == aVar ? r13 : Unit.f80348a;
        } catch (Throwable th3) {
            this.f59792u = new d0(frame.getContext(), th3);
            throw th3;
        }
    }

    @Override // dl2.a, dl2.e
    public final dl2.e getCallerFrame() {
        bl2.c cVar = this.f59793v;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // dl2.d, bl2.c
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f59792u;
        return coroutineContext == null ? kotlin.coroutines.j.f80412a : coroutineContext;
    }

    @Override // dl2.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Throwable a13 = xk2.s.a(obj);
        if (a13 != null) {
            this.f59792u = new d0(getContext(), a13);
        }
        bl2.c cVar = this.f59793v;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return cl2.a.COROUTINE_SUSPENDED;
    }

    public final Object r(bl2.c cVar, Object obj) {
        CoroutineContext context = cVar.getContext();
        ao2.m0.t(context);
        CoroutineContext coroutineContext = this.f59792u;
        if (coroutineContext != context) {
            if (coroutineContext instanceof d0) {
                s((d0) coroutineContext, obj);
                throw null;
            }
            if (((Number) context.fold(0, new Function2() { // from class: eo2.n0
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
                
                    if (r1 == null) goto L16;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        int r4 = r4.intValue()
                        kotlin.coroutines.CoroutineContext$Element r5 = (kotlin.coroutines.CoroutineContext.Element) r5
                        kotlin.coroutines.h r0 = r5.getKey()
                        eo2.k0 r1 = eo2.k0.this
                        kotlin.coroutines.CoroutineContext r1 = r1.f59790s
                        kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
                        ao2.g0 r2 = ao2.g0.f20154b
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L33
                    L1d:
                        int r4 = r4 + 1
                        goto L33
                    L20:
                        ao2.o1 r1 = (ao2.o1) r1
                        ao2.o1 r5 = (ao2.o1) r5
                    L24:
                        if (r5 != 0) goto L28
                        r5 = 0
                        goto L2f
                    L28:
                        if (r5 != r1) goto L2b
                        goto L2f
                    L2b:
                        boolean r0 = r5 instanceof ho2.u
                        if (r0 != 0) goto L5d
                    L2f:
                        if (r5 != r1) goto L38
                        if (r1 != 0) goto L1d
                    L33:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    L38:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                        r0.<init>(r2)
                        r0.append(r5)
                        java.lang.String r5 = ", expected child of "
                        r0.append(r5)
                        r0.append(r1)
                        java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        throw r4
                    L5d:
                        ho2.u r5 = (ho2.u) r5
                        ao2.o1 r5 = r5.getParent()
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: eo2.n0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.f59791t) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f59790s + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f59792u = context;
        }
        this.f59793v = cVar;
        kl2.l lVar = m0.f59796a;
        do2.j jVar = this.f59789r;
        Intrinsics.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = lVar.invoke(jVar, obj, this);
        if (!Intrinsics.d(invoke, cl2.a.COROUTINE_SUSPENDED)) {
            this.f59793v = null;
        }
        return invoke;
    }

    @Override // dl2.d, dl2.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
