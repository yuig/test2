package l82;

import ao2.j0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public y f82270r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f82271s;

    /* renamed from: t, reason: collision with root package name */
    public h f82272t;

    /* renamed from: u, reason: collision with root package name */
    public int f82273u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c0 f82274v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f82275w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f82274v = c0Var;
        this.f82275w = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f82274v, this.f82275w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0047 -> B:5:0x004a). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r5.f82273u
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            l82.h r1 = r5.f82272t
            java.util.Iterator r3 = r5.f82271s
            l82.y r4 = r5.f82270r
            ue.c.H(r6)
            goto L4a
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            ue.c.H(r6)
            l82.c0 r6 = r5.f82274v
            java.util.List r6 = r6.f82214c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            l82.y r1 = r5.f82275w
            r3 = r6
            r4 = r1
        L2c:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r3.next()
            r1 = r6
            l82.h r1 = (l82.h) r1
            do2.f2 r6 = r4.f82290h
            r5.f82270r = r4
            r5.f82271s = r3
            r5.f82272t = r1
            r5.f82273u = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L4a
            return r0
        L4a:
            m82.b r6 = r4.f82288f
            if (r6 == 0) goto L2c
            m82.a r6 = (m82.a) r6
            r6.a(r1)
            goto L2c
        L54:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l82.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
