package o7;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f93157a;

    /* renamed from: b, reason: collision with root package name */
    public int f93158b;

    /* renamed from: c, reason: collision with root package name */
    public long f93159c;

    /* renamed from: d, reason: collision with root package name */
    public long f93160d;

    /* renamed from: e, reason: collision with root package name */
    public long f93161e;

    /* renamed from: f, reason: collision with root package name */
    public long f93162f;

    public p(AudioTrack audioTrack) {
        this.f93157a = new o(audioTrack);
        h();
    }

    public final void a() {
        if (this.f93158b == 4) {
            h();
        }
    }

    public final void b() {
        o oVar = this.f93157a;
        if (oVar != null) {
            oVar.f93155f = true;
        }
    }

    public final long c() {
        o oVar = this.f93157a;
        if (oVar != null) {
            return oVar.f93154e;
        }
        return -1L;
    }

    public final long d() {
        o oVar = this.f93157a;
        if (oVar != null) {
            return oVar.f93151b.nanoTime / 1000;
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f93158b == 2;
    }

    public final boolean f(long j13) {
        o oVar = this.f93157a;
        if (oVar == null || j13 - this.f93161e < this.f93160d) {
            return false;
        }
        this.f93161e = j13;
        AudioTrack audioTrack = oVar.f93150a;
        AudioTimestamp audioTimestamp = oVar.f93151b;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j14 = audioTimestamp.framePosition;
            long j15 = oVar.f93153d;
            if (j15 > j14) {
                if (oVar.f93155f) {
                    oVar.f93156g += j15;
                    oVar.f93155f = false;
                } else {
                    oVar.f93152c++;
                }
            }
            oVar.f93153d = j14;
            oVar.f93154e = j14 + oVar.f93156g + (oVar.f93152c << 32);
        }
        int i13 = this.f93158b;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (timestamp) {
                        h();
                    }
                } else if (!timestamp) {
                    h();
                }
            } else if (!timestamp) {
                h();
            } else if (oVar.f93154e > this.f93162f) {
                i(2);
            }
        } else if (timestamp) {
            if (audioTimestamp.nanoTime / 1000 < this.f93159c) {
                return false;
            }
            this.f93162f = oVar.f93154e;
            i(1);
        } else if (j13 - this.f93159c > 500000) {
            i(3);
        }
        return timestamp;
    }

    public final void g() {
        i(4);
    }

    public final void h() {
        if (this.f93157a != null) {
            i(0);
        }
    }

    public final void i(int i13) {
        this.f93158b = i13;
        if (i13 == 0) {
            this.f93161e = 0L;
            this.f93162f = -1L;
            this.f93159c = System.nanoTime() / 1000;
            this.f93160d = 10000L;
            return;
        }
        if (i13 == 1) {
            this.f93160d = 10000L;
            return;
        }
        if (i13 == 2 || i13 == 3) {
            this.f93160d = 10000000L;
        } else {
            if (i13 != 4) {
                throw new IllegalStateException();
            }
            this.f93160d = 500000L;
        }
    }
}
