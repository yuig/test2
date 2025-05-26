package wc;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f129084i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f129085j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f129086k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, a aVar) {
        super(0);
        this.f129084i = iVar;
        this.f129085j = str;
        this.f129086k = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.f129082c) >= r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r6.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r7.f129076a.containsKey("evict-after-read") != false) goto L19;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r14 = this;
            wc.i r0 = r14.f129084i
            xc.c r1 = r0.f129090d
            java.util.LinkedHashMap r2 = r1.f134542b
            java.lang.String r3 = r14.f129085j
            java.lang.Object r2 = r2.get(r3)
            xc.b r2 = (xc.b) r2
            if (r2 == 0) goto L13
            r1.a(r2)
        L13:
            r1 = 0
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.f134538b
            goto L1a
        L19:
            r2 = r1
        L1a:
            wc.f r2 = (wc.f) r2
            r4 = 0
            xc.c r6 = r0.f129090d
            wc.a r7 = r14.f129086k
            if (r2 == 0) goto L4f
            long r8 = r2.f129081b
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 >= 0) goto L2b
            goto L39
        L2b:
            int r10 = cd.b.f27547a
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r2.f129082c
            long r10 = r10 - r12
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 < 0) goto L39
            goto L4b
        L39:
            r7.getClass()
            java.lang.String r8 = "headerName"
            java.lang.String r9 = "evict-after-read"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            java.util.Map r8 = r7.f129076a
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L50
        L4b:
            r6.b(r3)
            goto L50
        L4f:
            r2 = r1
        L50:
            if (r2 == 0) goto L70
            long r8 = r2.f129081b
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L59
            goto L67
        L59:
            int r4 = cd.b.f27547a
            long r4 = java.lang.System.currentTimeMillis()
            long r10 = r2.f129082c
            long r4 = r4 - r10
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L67
            r2 = r1
        L67:
            if (r2 == 0) goto L70
            wc.m r2 = r2.f129080a
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            r1 = r2
            goto L87
        L70:
            wc.k r2 = r0.f129092a
            if (r2 == 0) goto L87
            wc.m r2 = r2.a(r3, r7)
            if (r2 == 0) goto L87
            wc.f r1 = new wc.f
            long r4 = wc.i.e(r0)
            r1.<init>(r2, r4)
            r6.c(r3, r1)
            goto L6e
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.g.invoke():java.lang.Object");
    }
}
