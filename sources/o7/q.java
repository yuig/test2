package o7;

import android.media.AudioTrack;
import android.os.SystemClock;
import d7.n0;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class q {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public d7.e I;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f93163a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f93164b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f93165c;

    /* renamed from: d, reason: collision with root package name */
    public int f93166d;

    /* renamed from: e, reason: collision with root package name */
    public p f93167e;

    /* renamed from: f, reason: collision with root package name */
    public int f93168f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93169g;

    /* renamed from: h, reason: collision with root package name */
    public long f93170h;

    /* renamed from: i, reason: collision with root package name */
    public float f93171i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93172j;

    /* renamed from: k, reason: collision with root package name */
    public long f93173k;

    /* renamed from: l, reason: collision with root package name */
    public long f93174l;

    /* renamed from: m, reason: collision with root package name */
    public Method f93175m;

    /* renamed from: n, reason: collision with root package name */
    public long f93176n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93177o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93178p;

    /* renamed from: q, reason: collision with root package name */
    public long f93179q;

    /* renamed from: r, reason: collision with root package name */
    public long f93180r;

    /* renamed from: s, reason: collision with root package name */
    public long f93181s;

    /* renamed from: t, reason: collision with root package name */
    public long f93182t;

    /* renamed from: u, reason: collision with root package name */
    public long f93183u;

    /* renamed from: v, reason: collision with root package name */
    public int f93184v;

    /* renamed from: w, reason: collision with root package name */
    public int f93185w;

    /* renamed from: x, reason: collision with root package name */
    public long f93186x;

    /* renamed from: y, reason: collision with root package name */
    public long f93187y;

    /* renamed from: z, reason: collision with root package name */
    public long f93188z;

    public q(c0 c0Var) {
        this.f93163a = c0Var;
        try {
            this.f93175m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f93164b = new long[10];
        this.I = d7.e.f53809a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.q.a():long");
    }

    public final long b() {
        if (this.f93186x != -9223372036854775807L) {
            return Math.min(this.A, c());
        }
        ((d7.g0) this.I).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f93180r >= 5) {
            AudioTrack audioTrack = this.f93165c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f93169g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f93183u = this.f93181s;
                    }
                    playbackHeadPosition += this.f93183u;
                }
                if (n0.f53866a <= 29) {
                    if (playbackHeadPosition != 0 || this.f93181s <= 0 || playState != 3) {
                        this.f93187y = -9223372036854775807L;
                    } else if (this.f93187y == -9223372036854775807L) {
                        this.f93187y = elapsedRealtime;
                    }
                }
                long j13 = this.f93181s;
                if (j13 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j13;
                        this.G = false;
                    } else {
                        this.f93182t++;
                    }
                }
                this.f93181s = playbackHeadPosition;
            }
            this.f93180r = elapsedRealtime;
        }
        return this.f93181s + this.H + (this.f93182t << 32);
    }

    public final long c() {
        AudioTrack audioTrack = this.f93165c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f93188z;
        }
        ((d7.g0) this.I).getClass();
        return this.f93188z + n0.g0(n0.D(n0.X(SystemClock.elapsedRealtime()) - this.f93186x, this.f93171i), this.f93168f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j13) {
        long a13 = a();
        int i13 = this.f93168f;
        int i14 = n0.f53866a;
        if (j13 <= n0.g0(a13, i13, 1000000L, RoundingMode.UP)) {
            if (this.f93169g) {
                AudioTrack audioTrack = this.f93165c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || b() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e() {
        AudioTrack audioTrack = this.f93165c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final void f() {
        g();
        this.f93165c = null;
        this.f93167e = null;
    }

    public final void g() {
        this.f93173k = 0L;
        this.f93185w = 0;
        this.f93184v = 0;
        this.f93174l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f93172j = false;
    }
}
