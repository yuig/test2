package s60;

import a.o3;
import android.content.Context;
import kk2.m;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import pk2.f;
import so.oa;
import x02.x2;
import z9.n;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f111224a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f111225b;

    public d(c loggingContext, x2 userRepository) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f111224a = loggingContext;
        this.f111225b = userRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.pinterest.api.model.wy0 r10, h32.f1 r11, s60.c r12) {
        /*
            nx.d0 r0 = r12.f111218a
            r1 = 0
            if (r0 == 0) goto La
            h32.i0 r2 = r0.p()
            goto Lb
        La:
            r2 = r1
        Lb:
            h32.i0 r3 = r12.f111219b
            if (r3 == 0) goto L13
            h32.u0 r4 = r3.f67086f
            if (r4 != 0) goto L19
        L13:
            if (r2 == 0) goto L18
            h32.u0 r4 = r2.f67086f
            goto L19
        L18:
            r4 = r1
        L19:
            if (r3 == 0) goto L22
            h32.d0 r5 = r3.f67085e
            if (r5 != 0) goto L20
            goto L22
        L20:
            r6 = r5
            goto L28
        L22:
            if (r2 == 0) goto L27
            h32.d0 r5 = r2.f67085e
            goto L20
        L27:
            r6 = r1
        L28:
            if (r3 == 0) goto L2e
            h32.g0 r3 = r3.f67084d
            if (r3 != 0) goto L33
        L2e:
            if (r2 == 0) goto L32
            h32.g0 r1 = r2.f67084d
        L32:
            r3 = r1
        L33:
            if (r0 == 0) goto L61
            kotlin.jvm.functions.Function0 r1 = r12.f111222e
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L4d
            java.lang.String r1 = r12.f111220c
            if (r1 != 0) goto L4d
            java.lang.String r10 = r10.getUid()
            java.lang.String r1 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            goto L4e
        L4d:
            r10 = r1
        L4e:
            kotlin.jvm.functions.Function0 r12 = r12.f111223f
            java.lang.Object r12 = r12.invoke()
            r5 = r12
            java.util.HashMap r5 = (java.util.HashMap) r5
            r7 = 0
            r8 = 0
            r9 = 384(0x180, float:5.38E-43)
            r1 = r11
            r2 = r4
            r4 = r10
            nx.d0.D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s60.d.b(com.pinterest.api.model.wy0, h32.f1, s60.c):void");
    }

    public final t a(String userId, String str, String str2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        c loggingContext = this.f111224a;
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return c(userId, true, loggingContext, str, str2);
    }

    public final t c(String str, boolean z13, c cVar, String str2, String str3) {
        m mVar = new m(new kk2.b(new o3(28, this, str), 0), new ep.a(25, new n(z13, this, cVar, str2, str3)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return f.k(mVar.r(tk2.e.f118017c), "observeOn(...)");
    }

    public final t d(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        c loggingContext = this.f111224a;
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return c(userId, false, loggingContext, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c cVar) {
        this(cVar, ((oa) ((so1.b) ep.b.g(so1.b.class))).G2());
        Context context = kb0.a.f79058b;
    }
}
