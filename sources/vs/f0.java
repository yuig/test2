package vs;

import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final es.a f126481b;

    /* renamed from: c, reason: collision with root package name */
    public final es.h f126482c;

    public f0(es.a adFormats, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f126481b = adFormats;
        this.f126482c = adsCommonDisplay;
    }

    public static String g(Integer num, String str) {
        if (num == null || str == null) {
            return null;
        }
        return num + " (" + str + ")";
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        g0 vmState = (g0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new l82.c0(new h(new f(), q0.f80391a), vmState, kotlin.collections.e0.b(new c0(vmState.f126483a)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01be, code lost:
    
        if (r0 != null) goto L44;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r12, u50.o r13, l82.i0 r14, l82.e r15) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.f0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
