package k11;

import h32.d4;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final List f78130f = f0.j(d4.USER, d4.NEWS_HUB, d4.CONVERSATION);

    /* renamed from: g, reason: collision with root package name */
    public static final List f78131g = f0.j(d4.PIN, d4.BOARD);

    /* renamed from: a, reason: collision with root package name */
    public final d4 f78132a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f78133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78134c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f78135d;

    /* renamed from: e, reason: collision with root package name */
    public final a3 f78136e;

    public f(d4 d4Var, b60.b activeUserManager, boolean z13, es.a adFormats, a3 a3Var) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f78132a = d4Var;
        this.f78133b = activeUserManager;
        this.f78134c = z13;
        this.f78135d = adFormats;
        this.f78136e = a3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r6 = k11.f.f78130f;
        r0 = r4.f78132a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (kotlin.collections.CollectionsKt.L(r6, r0) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (kotlin.collections.CollectionsKt.L(k11.f.f78131g, r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r6 = ((b60.d) r4.f78133b).f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r5 = java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.d(r6.getUid(), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (com.bumptech.glide.d.o0(r5) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r6 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r5 = com.pinterest.api.model.b40.H(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r4.f78134c != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.pinterest.api.model.f30 r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            lh0.a3 r0 = r4.f78136e
            if (r0 == 0) goto L22
            lh0.z3 r1 = lh0.a4.f83297a
            lh0.z0 r0 = r0.f83296a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r2 = "enabled"
            java.lang.String r3 = "android_grid_inline_actions_phase_1"
            boolean r1 = r0.o(r3, r2, r1)
            if (r1 != 0) goto L1f
            boolean r0 = r0.l(r3)
            if (r0 == 0) goto L22
        L1f:
            if (r6 == 0) goto L35
            goto L74
        L22:
            es.a r0 = r4.f78135d
            es.c r0 = (es.c) r0
            boolean r0 = r0.M(r5)
            if (r0 != 0) goto L74
            boolean r0 = com.pinterest.api.model.b40.X0(r5)
            if (r0 != 0) goto L74
            if (r6 == 0) goto L35
            goto L74
        L35:
            java.lang.String r5 = com.pinterest.api.model.b40.H(r5)
            boolean r6 = r4.f78134c
            if (r6 != 0) goto L74
            java.util.List r6 = k11.f.f78130f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            h32.d4 r0 = r4.f78132a
            boolean r6 = kotlin.collections.CollectionsKt.L(r6, r0)
            if (r6 == 0) goto L4a
            goto L74
        L4a:
            java.util.List r6 = k11.f.f78131g
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r6 = kotlin.collections.CollectionsKt.L(r6, r0)
            if (r6 == 0) goto L72
            b60.b r6 = r4.f78133b
            b60.d r6 = (b60.d) r6
            com.pinterest.api.model.wy0 r6 = r6.f()
            if (r6 == 0) goto L6b
            java.lang.String r6 = r6.getUid()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L6c
        L6b:
            r5 = 0
        L6c:
            boolean r5 = com.bumptech.glide.d.o0(r5)
            if (r5 != 0) goto L74
        L72:
            r5 = 1
            goto L75
        L74:
            r5 = 0
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.f.a(com.pinterest.api.model.f30, java.lang.String):boolean");
    }
}
