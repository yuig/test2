package mc2;

import a7.d0;
import a7.g1;
import a7.i0;
import java.util.concurrent.atomic.AtomicReference;
import k8.y;
import kotlin.jvm.internal.Intrinsics;
import tb0.p;

/* loaded from: classes2.dex */
public final class a extends y {

    /* renamed from: c, reason: collision with root package name */
    public final l8.e f86909c;

    /* renamed from: d, reason: collision with root package name */
    public final h f86910d;

    /* renamed from: e, reason: collision with root package name */
    public int f86911e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f86912f;

    public a(l8.e bandwidthMeter, h trackSelectionHistory) {
        Intrinsics.checkNotNullParameter(bandwidthMeter, "bandwidthMeter");
        Intrinsics.checkNotNullParameter(trackSelectionHistory, "trackSelectionHistory");
        this.f86909c = bandwidthMeter;
        this.f86910d = trackSelectionHistory;
        this.f86911e = -1;
        this.f86912f = new AtomicReference();
    }

    public static void j(String msg) {
        Object[] args = new Object[0];
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
    }

    public static void k(String msg) {
        Object[] args = new Object[0];
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
    }

    @Override // k8.y
    public final boolean d() {
        return false;
    }

    @Override // k8.y
    public final void e(Object obj) {
        k("onSelectionActivated");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x028e, code lost:
    
        if (kotlin.text.z.j(r13) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        r13.add(new mc2.i(r4, r3, r21, r22, r23, r24, r6));
        r3 = r3 + 1;
        r0 = r31;
        r2 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f8  */
    @Override // k8.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.z g(m7.h[] r28, g8.m1 r29, g8.e0 r30, a7.b1 r31) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mc2.a.g(m7.h[], g8.m1, g8.e0, a7.b1):k8.z");
    }

    @Override // k8.y
    public final void i(g1 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        k("setParameters");
        vb0.j.f125466a.F("PinterestDashTrackSelector, use onNewPlaybackSession", p.VIDEO_PLAYER, new Object[0]);
    }

    public final void l(i0 mediaItem) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        k("onNewPlaybackSession");
        d0 d0Var = mediaItem.f1073b;
        Intrinsics.f(d0Var);
        String uri = d0Var.f969a.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        AtomicReference atomicReference = this.f86912f;
        d dVar = (d) atomicReference.get();
        boolean z13 = (dVar == null || !Intrinsics.d(dVar.b(), uri) || (dVar.c() && dVar.a())) ? false : true;
        atomicReference.set(new d(null, true, uri, true));
        if (z13) {
            c();
        }
    }

    public final void m(i0 mediaItem, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        k("onNewPlaybackSession");
        AtomicReference atomicReference = this.f86912f;
        d0 d0Var = mediaItem.f1073b;
        Intrinsics.f(d0Var);
        String uri = d0Var.f969a.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        atomicReference.set(new d(Integer.valueOf(i13), false, uri, z13));
    }

    public final void n(int i13) {
        this.f86911e = i13;
        j("init");
    }
}
