package z80;

import ao2.h0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.a implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f141052b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(z80.m r2) {
        /*
            r1 = this;
            ao2.g0 r0 = ao2.g0.f20153a
            r1.f141052b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.e.<init>(z80.m):void");
    }

    @Override // ao2.h0
    public final void handleException(CoroutineContext coroutineContext, Throwable th3) {
        ((tb0.h) this.f141052b.f141072g).q(th3, "Error trying to load or download remote font resources", tb0.p.COLLAGES);
    }
}
