package lt1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public jt1.d f84833a;

    /* renamed from: b, reason: collision with root package name */
    public jt1.d f84834b;

    /* renamed from: c, reason: collision with root package name */
    public long f84835c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt1.d f84837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f84838f;

    public h(jt1.d dVar, i iVar) {
        this.f84837e = dVar;
        this.f84838f = iVar;
        this.f84835c = dVar.f77588a;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        jt1.d incomingPacket = (jt1.d) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        long j13 = incomingPacket.f77588a;
        long j14 = incomingPacket.f77589b;
        this.f84833a = new jt1.d(j13, j14);
        long j15 = j13 - this.f84835c;
        if (c(j15)) {
            jt1.d dVar = new jt1.d(this.f84835c, j15);
            this.f84834b = dVar;
            this.f84838f.f84841c.e(dVar);
        }
        this.f84836d = true;
        this.f84835c = j13 + j14;
    }

    public final boolean c(long j13) {
        if (this.f84836d) {
            if (j13 <= 0 || j13 < this.f84838f.f84839a) {
                return false;
            }
        } else if (j13 <= 0) {
            return false;
        }
        return true;
    }

    @Override // mt1.a
    public final void g() {
        jt1.d dVar = this.f84837e;
        long j13 = (dVar.f77588a + dVar.f77589b) - this.f84835c;
        boolean c13 = c(j13);
        i iVar = this.f84838f;
        if (c13) {
            jt1.d dVar2 = new jt1.d(this.f84835c, j13);
            this.f84834b = dVar2;
            iVar.f84841c.e(dVar2);
        }
        iVar.f84841c.f();
    }

    public final String toString() {
        boolean z13 = this.f84836d;
        long j13 = this.f84838f.f84839a;
        long j14 = this.f84835c;
        jt1.d dVar = this.f84833a;
        jt1.d dVar2 = this.f84834b;
        StringBuilder sb3 = new StringBuilder("CheckForGaps receivedFirstPacket=[");
        sb3.append(z13);
        sb3.append("] gapThresholdUs=[");
        sb3.append(j13);
        cb.v(sb3, "] end time of last packet [", j14, "] last received time span [");
        sb3.append(dVar);
        sb3.append("] last gap detected [");
        sb3.append(dVar2);
        sb3.append("]");
        return sb3.toString();
    }
}
