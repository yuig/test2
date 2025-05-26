package ac2;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.pinterest.video.PoolStats;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2053a;

    /* renamed from: b, reason: collision with root package name */
    public final PoolStats f2054b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f2055c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f2056d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f2057e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2058f;

    public s0(pb0.a clock, WeakReference player, PoolStats poolStats, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(poolStats, "poolStats");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f2053a = player;
        this.f2054b = poolStats;
        this.f2055c = t0.f2059a;
        this.f2056d = new z0(clock);
        ExoPlayer exoPlayer = (ExoPlayer) player.get();
        if (exoPlayer != null) {
            ((m7.l0) exoPlayer).f0(new com.pinterest.video.a(this));
        }
        ExoPlayer exoPlayer2 = (ExoPlayer) player.get();
        if (exoPlayer2 != null) {
            ((m7.l0) exoPlayer2).f86277n.a(new r0(this));
        }
    }

    public final ExoPlayer a() {
        Object obj = this.f2053a.get();
        if (obj != null) {
            return (ExoPlayer) obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void b() {
        y0 y0Var = this.f2055c;
        if (!(y0Var instanceof u0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        w0 w0Var = ((u0) y0Var).f2061b;
        q0 q0Var = q0.f2040e;
        w0Var.getClass();
        Intrinsics.checkNotNullParameter(q0Var, "<set-?>");
        w0Var.f2071b = q0Var;
        this.f2055c = w0Var;
        this.f2056d.b();
    }

    public final void c() {
        this.f2055c = t0.f2059a;
        this.f2056d.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r7.f86276m0.f86336g == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (((m7.l0) r7).M == true) goto L20;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            ac2.s0 r7 = (ac2.s0) r7
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            ac2.y0 r0 = r6.f2055c
            ac2.y0 r1 = r7.f2055c
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 != 0) goto L23
            ac2.y0 r0 = r6.f2055c
            int r0 = r0.a()
            ac2.y0 r7 = r7.f2055c
            int r7 = r7.a()
            int r7 = kotlin.jvm.internal.Intrinsics.i(r0, r7)
            goto Lb6
        L23:
            java.lang.ref.WeakReference r0 = r6.f2053a
            java.lang.Object r1 = r0.get()
            androidx.media3.exoplayer.ExoPlayer r1 = (androidx.media3.exoplayer.ExoPlayer) r1
            r2 = 0
            if (r1 == 0) goto L3c
            m7.l0 r1 = (m7.l0) r1
            r1.L0()
            m7.o1 r1 = r1.f86276m0
            boolean r1 = r1.f86336g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L3d
        L3c:
            r1 = r2
        L3d:
            java.lang.ref.WeakReference r3 = r7.f2053a
            java.lang.Object r4 = r3.get()
            androidx.media3.exoplayer.ExoPlayer r4 = (androidx.media3.exoplayer.ExoPlayer) r4
            if (r4 == 0) goto L55
            m7.l0 r4 = (m7.l0) r4
            r4.L0()
            m7.o1 r4 = r4.f86276m0
            boolean r4 = r4.f86336g
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L56
        L55:
            r4 = r2
        L56:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            r4 = -1
            r5 = 1
            if (r1 != 0) goto L75
            java.lang.Object r7 = r0.get()
            androidx.media3.exoplayer.ExoPlayer r7 = (androidx.media3.exoplayer.ExoPlayer) r7
            if (r7 == 0) goto L73
            m7.l0 r7 = (m7.l0) r7
            r7.L0()
            m7.o1 r7 = r7.f86276m0
            boolean r7 = r7.f86336g
            if (r7 != r5) goto L73
        L71:
            r7 = r5
            goto Lb6
        L73:
            r7 = r4
            goto Lb6
        L75:
            java.lang.Object r1 = r0.get()
            androidx.media3.exoplayer.ExoPlayer r1 = (androidx.media3.exoplayer.ExoPlayer) r1
            if (r1 == 0) goto L86
            m7.l0 r1 = (m7.l0) r1
            boolean r1 = r1.M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L87
        L86:
            r1 = r2
        L87:
            java.lang.Object r3 = r3.get()
            androidx.media3.exoplayer.ExoPlayer r3 = (androidx.media3.exoplayer.ExoPlayer) r3
            if (r3 == 0) goto L97
            m7.l0 r3 = (m7.l0) r3
            boolean r2 = r3.M
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L97:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto Lac
            java.lang.Object r7 = r0.get()
            androidx.media3.exoplayer.ExoPlayer r7 = (androidx.media3.exoplayer.ExoPlayer) r7
            if (r7 == 0) goto L71
            m7.l0 r7 = (m7.l0) r7
            boolean r7 = r7.M
            if (r7 != r5) goto L71
            goto L73
        Lac:
            ac2.z0 r0 = r6.f2056d
            long r0 = r0.f2074b
            ac2.z0 r7 = r7.f2056d
            long r2 = r7.f2074b
            long r0 = r0 - r2
            int r7 = (int) r0
        Lb6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.s0.compareTo(java.lang.Object):int");
    }

    public final void d(boolean z13) {
        ExoPlayer exoPlayer = (ExoPlayer) this.f2053a.get();
        if (exoPlayer == null) {
            return;
        }
        m7.l0 l0Var = (m7.l0) exoPlayer;
        l0Var.L0();
        if (l0Var.M != z13) {
            l0Var.M = z13;
            m7.u0 u0Var = l0Var.f86275m;
            synchronized (u0Var) {
                if (!u0Var.G && u0Var.f86419j.getThread().isAlive()) {
                    if (z13) {
                        u0Var.f86417h.a(13, 1, 0).b();
                    } else {
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        d7.i0 i0Var = u0Var.f86417h;
                        i0Var.getClass();
                        d7.h0 c13 = d7.i0.c();
                        c13.f53827a = i0Var.f53829a.obtainMessage(13, 0, 0, atomicBoolean);
                        c13.b();
                        u0Var.G0(new m7.o0(atomicBoolean, 1), u0Var.Y);
                        boolean z14 = atomicBoolean.get();
                        if (!z14) {
                            l0Var.G0(ExoPlaybackException.b(new ExoTimeoutException(2), 1003));
                        }
                    }
                }
            }
        }
    }

    public final void e(oc2.i newVideoView) {
        Intrinsics.checkNotNullParameter(newVideoView, "newVideoView");
        y0 y0Var = this.f2055c;
        if (!(y0Var instanceof w0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        w0 w0Var = (w0) y0Var;
        if (!(w0Var.f2071b instanceof p0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f2055c = new u0(new WeakReference(newVideoView), w0Var);
        this.f2056d.b();
    }

    public final String toString() {
        return "PoolItem(" + this.f2055c + ", " + this.f2053a.get() + ")";
    }
}
