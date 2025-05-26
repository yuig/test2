package ok1;

import android.content.Context;
import com.pinterest.api.model.wy0;
import h32.f1;
import kk2.m;
import kk2.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nk1.g;
import nx.d1;
import so.oa;
import tb0.p;
import uj2.b0;
import v30.h;
import vb0.j;
import x02.x2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f95462a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f95463b;

    /* renamed from: c, reason: collision with root package name */
    public final oc.c f95464c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f95465d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f95466e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f95467f;

    public f(g loggingContext, x2 userRepository, oc.c cVar, boolean z13, d1 trackingParamAttacher, int i13) {
        if ((i13 & 2) != 0) {
            Context context = kb0.a.f79058b;
            userRepository = ((oa) ((so1.b) ep.b.g(so1.b.class))).G2();
        }
        cVar = (i13 & 4) != 0 ? null : cVar;
        z13 = (i13 & 8) != 0 ? false : z13;
        a userAuxDataProvider = a.f95451k;
        if ((i13 & 32) != 0) {
            Context context2 = kb0.a.f79058b;
            trackingParamAttacher = ((oa) ((so1.b) ep.b.g(so1.b.class))).F2();
        }
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userAuxDataProvider, "userAuxDataProvider");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f95462a = loggingContext;
        this.f95463b = userRepository;
        this.f95464c = cVar;
        this.f95465d = z13;
        this.f95466e = userAuxDataProvider;
        this.f95467f = trackingParamAttacher;
        if (z13 && cVar == null) {
            j.f125466a.F("Cannot use GraphQL if apolloClient is null", p.PLATFORM, new Object[0]);
        }
    }

    public static t a(f fVar, wy0 user, String str, String str2, int i13) {
        b0 c03;
        oc.c cVar;
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(user, "user");
        g loggingContext = fVar.f95462a;
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        fVar.b(user, f1.USER_FOLLOW, loggingContext);
        if (!fVar.f95465d || (cVar = fVar.f95464c) == null) {
            c03 = fVar.f95463b.c0(user, str, str2);
        } else {
            String uid = user.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            c03 = new m(com.bumptech.glide.d.u0(cVar.a(new h(uid))), new ic1.a(29, new e(user, fVar, 0)), 0);
        }
        return pk2.f.k(c03.r(tk2.e.f118017c), "observeOn(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.pinterest.api.model.wy0 r12, h32.f1 r13, nk1.g r14) {
        /*
            r11 = this;
            nx.d1 r0 = r11.f95467f
            java.lang.String r0 = kh2.j.K(r14, r0)
            nx.d0 r1 = r14.f91127a
            h32.i0 r2 = r14.f91128b
            r3 = 0
            if (r1 == 0) goto L12
            h32.i0 r4 = r1.p()
            goto L13
        L12:
            r4 = r3
        L13:
            if (r2 == 0) goto L1c
            h32.d0 r5 = r2.f67085e
            if (r5 != 0) goto L1a
            goto L1c
        L1a:
            r7 = r5
            goto L22
        L1c:
            if (r4 == 0) goto L21
            h32.d0 r5 = r4.f67085e
            goto L1a
        L21:
            r7 = r3
        L22:
            if (r2 == 0) goto L28
            h32.g0 r5 = r2.f67084d
            if (r5 != 0) goto L32
        L28:
            if (r4 == 0) goto L2d
            h32.g0 r5 = r4.f67084d
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r5 != 0) goto L32
            h32.g0 r5 = h32.g0.USER_FOLLOW
        L32:
            if (r2 == 0) goto L3b
            h32.u0 r2 = r2.f67086f
            if (r2 != 0) goto L39
            goto L3b
        L39:
            r4 = r2
            goto L46
        L3b:
            if (r4 == 0) goto L40
            h32.u0 r2 = r4.f67086f
            goto L41
        L40:
            r2 = r3
        L41:
            if (r2 != 0) goto L39
            h32.u0 r2 = h32.u0.USER_FOLLOW
            goto L39
        L46:
            if (r1 == 0) goto Lb0
            kotlin.jvm.functions.Function0 r2 = r14.f91132f
            java.lang.Object r2 = r2.invoke()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L60
            java.lang.String r14 = r14.f91129c
            if (r14 != 0) goto L61
            java.lang.String r14 = r12.getUid()
            java.lang.String r2 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            goto L61
        L60:
            r14 = r2
        L61:
            nk1.g r2 = r11.f95462a
            kotlin.jvm.functions.Function0 r2 = r2.f91133g
            java.lang.Object r2 = r2.invoke()
            r6 = r2
            java.util.HashMap r6 = (java.util.HashMap) r6
            kotlin.jvm.functions.Function1 r2 = r11.f95466e
            java.lang.Object r12 = r2.invoke(r12)
            java.util.HashMap r12 = (java.util.HashMap) r12
            if (r12 == 0) goto L9a
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L7e:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r8 = r2.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r6.put(r8, r2)
            goto L7e
        L9a:
            if (r0 == 0) goto La5
            h32.v0 r12 = new h32.v0
            r12.<init>()
            r12.G = r0
            r8 = r12
            goto La6
        La5:
            r8 = r3
        La6:
            r10 = 256(0x100, float:3.59E-43)
            r9 = 0
            r2 = r13
            r3 = r4
            r4 = r5
            r5 = r14
            nx.d0.D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.f.b(com.pinterest.api.model.wy0, h32.f1, nk1.g):void");
    }

    public final t c(wy0 user, String str) {
        b0 i03;
        oc.c cVar;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(user, "user");
        g loggingContext = this.f95462a;
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        b(user, f1.USER_UNFOLLOW, loggingContext);
        if (!this.f95465d || (cVar = this.f95464c) == null) {
            i03 = this.f95463b.i0(user, str);
        } else {
            String uid = user.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            i03 = new m(com.bumptech.glide.d.u0(cVar.a(new v30.p(uid))), new ic1.a(28, new e(user, this, 1)), 0);
        }
        return pk2.f.k(i03.r(tk2.e.f118017c), "observeOn(...)");
    }
}
