package d10;

import c71.l;
import do2.t2;
import do2.y1;
import ey.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    public final k3 f53596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53597b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f53598c;

    /* renamed from: d, reason: collision with root package name */
    public final y1 f53599d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f53600e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f53601f;

    public c(k3 perfLogger, String parentMetricName, t2 conditionFlow) {
        l condition = l.f26774j;
        c71.g gVar = c71.g.f26764k;
        c71.g gVar2 = c71.g.f26765l;
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(parentMetricName, "parentMetricName");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(conditionFlow, "conditionFlow");
        this.f53596a = perfLogger;
        this.f53597b = parentMetricName;
        this.f53598c = condition;
        this.f53599d = conditionFlow;
        this.f53600e = gVar;
        this.f53601f = gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r2.f60496c == true) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // ad.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final do2.i a(pc.f r10, ad.b r11) {
        /*
            r9 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.jvm.functions.Function1 r0 = r9.f53598c
            java.lang.Object r0 = r0.invoke(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L24
            ey.j3 r2 = ey.j3.f60510a
            ey.k3 r2 = r9.f53596a
            java.lang.String r3 = r9.f53597b
            ey.h3 r2 = ey.j3.g(r2, r3, r1, r1)
            goto L25
        L24:
            r2 = r1
        L25:
            r3 = 0
            if (r2 == 0) goto L2e
            boolean r4 = r2.f60496c
            r5 = 1
            if (r4 != r5) goto L2e
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 == 0) goto L8d
            java.util.List r4 = r10.f99545e
            if (r4 != 0) goto L3b
            qc.f[] r4 = new qc.f[r3]
            java.util.List r4 = okhttp3.internal.Util.l(r4)
        L3b:
            if (r2 == 0) goto L73
            java.util.Map r2 = r2.f60495b
            if (r2 == 0) goto L73
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r2.size()
            r3.<init>(r6)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            qc.f r7 = new qc.f
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r7.<init>(r8, r6)
            r3.add(r7)
            goto L52
        L73:
            qc.f[] r2 = new qc.f[r3]
            java.util.List r3 = okhttp3.internal.Util.l(r2)
        L79:
            pc.o0 r2 = r10.f99541a
            pc.e r10 = r10.a(r2)
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.l0(r3, r4)
            r10.f99535e = r2
            pc.f r10 = r10.d()
        L8d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            do2.y1 r3 = r9.f53599d
            do2.t2 r3 = (do2.t2) r3
            r3.i(r2)
            do2.i r10 = r11.a(r10)
            d10.a r11 = new d10.a
            r11.<init>(r9, r1)
            if (r0 == 0) goto La9
            do2.h0 r2 = new do2.h0
            r2.<init>(r11, r10)
            r10 = r2
        La9:
            d10.b r11 = new d10.b
            r11.<init>(r9, r1)
            if (r0 == 0) goto Lb4
            do2.s0 r10 = lb.l0.Q0(r11, r10)
        Lb4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d10.c.a(pc.f, ad.b):do2.i");
    }
}
