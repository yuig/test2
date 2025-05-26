package j72;

import android.content.Context;
import c72.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements s72.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f74908a;

    /* renamed from: b, reason: collision with root package name */
    public final k72.f f74909b;

    /* renamed from: c, reason: collision with root package name */
    public final n72.a f74910c;

    /* renamed from: d, reason: collision with root package name */
    public final n72.m f74911d;

    /* renamed from: e, reason: collision with root package name */
    public final u f74912e;

    public s(Context context, k72.f shufflesService, n72.a dispatcherProvider, m72.a logger, u modelMapperShuffle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shufflesService, "shufflesService");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(modelMapperShuffle, "modelMapperShuffle");
        this.f74908a = context;
        this.f74909b = shufflesService;
        this.f74910c = dispatcherProvider;
        this.f74911d = logger;
        this.f74912e = modelMapperShuffle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[LOOP:0: B:11:0x006b->B:13:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.util.List r13, bl2.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof j72.e
            if (r0 == 0) goto L13
            r0 = r14
            j72.e r0 = (j72.e) r0
            int r1 = r0.f74866t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74866t = r1
            goto L18
        L13:
            j72.e r0 = new j72.e
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f74864r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f74866t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r14)
            goto L4e
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            ue.c.H(r14)
            r4 = r13
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            j72.f r10 = j72.f.f74867i
            r8 = 0
            r9 = 0
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r11 = 30
            java.lang.String r13 = kotlin.collections.CollectionsKt.Z(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f74866t = r3
            k72.f r14 = r12.f74909b
            java.lang.Object r14 = r14.b(r13, r0)
            if (r14 != r1) goto L4e
            return r1
        L4e:
            d72.c r14 = (d72.c) r14
            java.lang.Object r13 = r14.f53913c
            java.util.Map r13 = (java.util.Map) r13
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            int r0 = r13.size()
            int r0 = kotlin.collections.y0.a(r0)
            r14.<init>(r0)
            java.util.Set r13 = r13.entrySet()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L6b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            f72.u r0 = (f72.u) r0
            r72.a1 r2 = new r72.a1
            java.lang.String r3 = r0.f61364a
            java.lang.String r0 = r0.f61365b
            r2.<init>(r3, r0)
            r14.put(r1, r2)
            goto L6b
        L8e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.s.a(java.util.List, bl2.c):java.io.Serializable");
    }
}
