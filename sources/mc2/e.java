package mc2;

import a7.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k8.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements t {

    /* renamed from: i, reason: collision with root package name */
    public static int f86921i;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f86922a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.e f86923b;

    /* renamed from: c, reason: collision with root package name */
    public final h f86924c;

    /* renamed from: d, reason: collision with root package name */
    public final List f86925d;

    /* renamed from: e, reason: collision with root package name */
    public final d f86926e;

    /* renamed from: f, reason: collision with root package name */
    public int f86927f;

    /* renamed from: g, reason: collision with root package name */
    public int f86928g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f86929h;

    public e(int i13, c1 trackGroup, l8.e bandwidthMeter, h trackSelectionHistory, ArrayList supports, d playbackSessionMetadata) {
        Intrinsics.checkNotNullParameter(trackGroup, "trackGroup");
        Intrinsics.checkNotNullParameter(bandwidthMeter, "bandwidthMeter");
        Intrinsics.checkNotNullParameter(trackSelectionHistory, "trackSelectionHistory");
        Intrinsics.checkNotNullParameter(supports, "supports");
        Intrinsics.checkNotNullParameter(playbackSessionMetadata, "playbackSessionMetadata");
        this.f86922a = trackGroup;
        this.f86923b = bandwidthMeter;
        this.f86924c = trackSelectionHistory;
        this.f86925d = supports;
        this.f86926e = playbackSessionMetadata;
        f86921i++;
        this.f86929h = new LinkedHashSet();
    }

    @Override // k8.t
    public final int a() {
        return this.f86928g;
    }

    @Override // k8.t
    public final boolean c(int i13, long j13) {
        return this.f86929h.contains(Integer.valueOf(i13));
    }

    @Override // k8.t
    public final int d(androidx.media3.common.b format) {
        Intrinsics.checkNotNullParameter(format, "format");
        Iterator it = this.f86925d.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            if (Intrinsics.d(((i) it.next()).f86935a, format)) {
                return i13;
            }
            i13 = i14;
        }
        return -1;
    }

    @Override // k8.t
    public final androidx.media3.common.b e(int i13) {
        return ((i) this.f86925d.get(i13)).f86935a;
    }

    @Override // k8.t
    public final int f(int i13) {
        return ((i) this.f86925d.get(i13)).f86936b;
    }

    @Override // k8.t
    public final void g() {
    }

    @Override // k8.t
    public final boolean h(int i13, long j13) {
        if (this.f86929h.contains(Integer.valueOf(i13))) {
            return true;
        }
        int size = this.f86925d.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 != i13 && !this.f86929h.contains(Integer.valueOf(i14))) {
                this.f86929h.add(Integer.valueOf(i13));
                this.f86927f = 0;
                h hVar = this.f86924c;
                d playbackSessionMetadata = this.f86926e;
                synchronized (hVar) {
                    Intrinsics.checkNotNullParameter(playbackSessionMetadata, "playbackSessionMetadata");
                    hVar.f86933a.remove(new f(playbackSessionMetadata.f86917a, playbackSessionMetadata.f86918b));
                }
                return true;
            }
        }
        return false;
    }

    @Override // k8.t
    public final void i(float f13) {
    }

    @Override // k8.t
    public final Object j() {
        return null;
    }

    @Override // k8.t
    public final int l(int i13) {
        Iterator it = this.f86925d.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = i14 + 1;
            if (((i) it.next()).f86936b == i13) {
                return i14;
            }
            i14 = i15;
        }
        return -1;
    }

    @Override // k8.t
    public final int length() {
        return this.f86925d.size();
    }

    @Override // k8.t
    public final c1 m() {
        return this.f86922a;
    }

    @Override // k8.t
    public final void o() {
    }

    @Override // k8.t
    public final int p(long j13, List queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        return queue.size();
    }

    @Override // k8.t
    public final int q() {
        return f(this.f86928g);
    }

    @Override // k8.t
    public final androidx.media3.common.b r() {
        return e(this.f86928g);
    }

    @Override // k8.t
    public final int t() {
        return this.f86927f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        if (r2 <= r12.intValue()) goto L59;
     */
    @Override // k8.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(long r6, long r8, long r10, java.util.List r12, h8.q[] r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mc2.e.u(long, long, long, java.util.List, h8.q[]):void");
    }
}
