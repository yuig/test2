package ae;

import df.n0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15027a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15028b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15029c;

    public /* synthetic */ r(Object obj, boolean z13, int i13) {
        this.f15027a = i13;
        this.f15029c = obj;
        this.f15028b = z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        if (r2 != r4) goto L43;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.r.run():void");
    }

    public r(n0 key, boolean z13) {
        this.f15027a = 1;
        Intrinsics.checkNotNullParameter(key, "key");
        this.f15029c = key;
        this.f15028b = z13;
    }
}
