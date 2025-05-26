package mc2;

import a7.c1;
import h8.q;
import java.util.List;
import k8.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f86913a;

    public b(c1 trackGroup) {
        Intrinsics.checkNotNullParameter(trackGroup, "trackGroup");
        this.f86913a = trackGroup;
        if (trackGroup.f964a != 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // k8.t
    public final int a() {
        return 0;
    }

    @Override // k8.t
    public final boolean c(int i13, long j13) {
        return false;
    }

    @Override // k8.t
    public final int d(androidx.media3.common.b format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return this.f86913a.b(format);
    }

    @Override // k8.t
    public final androidx.media3.common.b e(int i13) {
        androidx.media3.common.b bVar = this.f86913a.f967d[i13];
        Intrinsics.checkNotNullExpressionValue(bVar, "getFormat(...)");
        return bVar;
    }

    @Override // k8.t
    public final int f(int i13) {
        return i13;
    }

    @Override // k8.t
    public final void g() {
    }

    @Override // k8.t
    public final boolean h(int i13, long j13) {
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
        return i13;
    }

    @Override // k8.t
    public final int length() {
        return this.f86913a.f964a;
    }

    @Override // k8.t
    public final c1 m() {
        return this.f86913a;
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
        return 0;
    }

    @Override // k8.t
    public final androidx.media3.common.b r() {
        return e(0);
    }

    @Override // k8.t
    public final int t() {
        return 1;
    }

    @Override // k8.t
    public final void u(long j13, long j14, long j15, List queue, q[] mediaChunkIterators) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(mediaChunkIterators, "mediaChunkIterators");
    }
}
