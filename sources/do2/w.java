package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55984r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f55986t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j13, bl2.c cVar) {
        super(2, cVar);
        this.f55986t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w wVar = new w(this.f55986t, cVar);
        wVar.f55985s = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((co2.z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:12:0x003d). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f55984r
            long r2 = r7.f55986t
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f55985s
            co2.z r1 = (co2.z) r1
            ue.c.H(r8)
            goto L52
        L22:
            java.lang.Object r1 = r7.f55985s
            co2.z r1 = (co2.z) r1
            ue.c.H(r8)
            goto L3d
        L2a:
            ue.c.H(r8)
            java.lang.Object r8 = r7.f55985s
            r1 = r8
            co2.z r1 = (co2.z) r1
            r7.f55985s = r1
            r7.f55984r = r6
            java.lang.Object r8 = lb.l0.S(r2, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            r8 = r1
            co2.y r8 = (co2.y) r8
            r8.getClass()
            kotlin.Unit r6 = kotlin.Unit.f80348a
            r7.f55985s = r1
            r7.f55984r = r5
            co2.q r8 = r8.f28359d
            java.lang.Object r8 = r8.o(r6, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7.f55985s = r1
            r7.f55984r = r4
            java.lang.Object r8 = lb.l0.S(r2, r7)
            if (r8 != r0) goto L3d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
