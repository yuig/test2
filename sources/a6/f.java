package a6;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Iterator f823r;

    /* renamed from: s, reason: collision with root package name */
    public nb0.a f824s;

    /* renamed from: t, reason: collision with root package name */
    public Object f825t;

    /* renamed from: u, reason: collision with root package name */
    public int f826u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f827v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f828w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f829x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, List list2, bl2.c cVar) {
        super(2, cVar);
        this.f828w = list;
        this.f829x = list2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f828w, this.f829x, cVar);
        fVar.f827v = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f826u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r9.f823r
            java.lang.Object r4 = r9.f827v
            java.util.List r4 = (java.util.List) r4
            ue.c.H(r10)
            goto L3e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f825t
            nb0.a r4 = r9.f824s
            java.util.Iterator r5 = r9.f823r
            java.lang.Object r6 = r9.f827v
            java.util.List r6 = (java.util.List) r6
            ue.c.H(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L60
        L2f:
            ue.c.H(r10)
            java.lang.Object r10 = r9.f827v
            java.util.List r1 = r9.f828w
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.List r4 = r9.f829x
        L3e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r1.next()
            nb0.a r5 = (nb0.a) r5
            r9.f827v = r4
            r9.f823r = r1
            r9.f824s = r5
            r9.f825t = r10
            r9.f826u = r3
            java.lang.Boolean r6 = r5.b(r10)
            if (r6 != r0) goto L5b
            return r0
        L5b:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L84
            a6.e r10 = new a6.e
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f827v = r4
            r9.f823r = r5
            r9.f824s = r7
            r9.f825t = r7
            r9.f826u = r2
            d6.b r10 = r6.a(r1)
            if (r10 != r0) goto L82
            return r0
        L82:
            r1 = r5
            goto L3e
        L84:
            r10 = r1
            goto L82
        L86:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
