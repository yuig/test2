package ga;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import androidx.media3.ui.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i extends d {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f64589a;

    public i(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f64589a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[LOOP:0: B:11:0x0080->B:13:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(ga.i r7, ga.a r8, bl2.c<? super ga.b> r9) {
        /*
            boolean r0 = r9 instanceof ga.h
            if (r0 == 0) goto L13
            r0 = r9
            ga.h r0 = (ga.h) r0
            int r1 = r0.f64588u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64588u = r1
            goto L18
        L13:
            ga.h r0 = new ga.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f64586s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f64588u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ga.i r7 = r0.f64585r
            ue.c.H(r9)
            goto L67
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.b(r8)
            r0.f64585r = r7
            r0.f64588u = r3
            ao2.o r9 = new ao2.o
            bl2.c r2 = cl2.h.b(r0)
            r9.<init>(r3, r2)
            r9.v()
            u5.j r2 = new u5.j
            r3 = 10
            r2.<init>(r3)
            j5.e r3 = new j5.e
            r3.<init>(r9)
            android.adservices.topics.TopicsManager r4 = r7.f64589a
            ga.g.r(r4, r8, r2, r3)
            java.lang.Object r9 = r9.u()
            if (r9 != r1) goto L64
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
        L64:
            if (r9 != r1) goto L67
            return r1
        L67:
            android.adservices.topics.GetTopicsResponse r8 = androidx.media3.ui.a0.g(r9)
            r7.getClass()
            java.lang.String r7 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = androidx.media3.ui.a0.o(r8)
            java.util.Iterator r8 = r8.iterator()
        L80:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La4
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = androidx.media3.ui.a0.h(r9)
            ga.c r6 = new ga.c
            long r2 = androidx.media3.ui.a0.a(r9)
            long r4 = y1.r.a(r9)
            int r1 = ga.g.b(r9)
            r0 = r6
            r0.<init>(r1, r2, r4)
            r7.add(r6)
            goto L80
        La4:
            ga.b r8 = new ga.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.i.c(ga.i, ga.a, bl2.c):java.lang.Object");
    }

    @Override // ga.d
    public Object a(@NotNull a aVar, @NotNull bl2.c<? super b> cVar) {
        return c(this, aVar, cVar);
    }

    public GetTopicsRequest b(a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        Intrinsics.checkNotNullParameter(request, "request");
        adsSdkName = a0.d().setAdsSdkName(request.f64578a);
        build = adsSdkName.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }
}
