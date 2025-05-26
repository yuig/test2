package o7;

import a.a4;
import a7.o0;
import a7.p0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import m7.v1;
import m7.z0;
import n7.q0;
import net.quikkly.android.utils.BitmapUtils;
import pk.c1;
import pk.v2;

/* loaded from: classes.dex */
public final class h0 extends x7.p implements z0 {
    public final Context E0;
    public final qq2.c F0;
    public final n G0;
    public final x7.j H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public androidx.media3.common.b L0;
    public androidx.media3.common.b M0;
    public long N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public long T0;
    public boolean U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, d7.b0 b0Var, com.google.firebase.messaging.k kVar, Handler handler, m7.i0 i0Var, f0 f0Var) {
        super(1, b0Var, kVar, false, 44100.0f);
        x7.j jVar = n0.f53866a >= 35 ? new x7.j() : null;
        this.E0 = context.getApplicationContext();
        this.G0 = f0Var;
        this.H0 = jVar;
        this.R0 = -1000;
        this.F0 = new qq2.c(handler, i0Var);
        this.T0 = -9223372036854775807L;
        f0Var.f93081s = new h1.b(this);
    }

    @Override // x7.p
    public final boolean D0(androidx.media3.common.b bVar) {
        v1 v1Var = this.f86173d;
        v1Var.getClass();
        if (v1Var.f86442a != 0) {
            int I0 = I0(bVar);
            if ((I0 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
                v1 v1Var2 = this.f86173d;
                v1Var2.getClass();
                if (v1Var2.f86442a == 2 || (I0 & 1024) != 0 || (bVar.H == 0 && bVar.I == 0)) {
                    return true;
                }
            }
        }
        return ((f0) this.G0).i(bVar) != 0;
    }

    @Override // x7.p
    public final int E0(x7.q qVar, androidx.media3.common.b bVar) {
        int i13;
        x7.n h10;
        boolean z13;
        if (!o0.m(bVar.f18765o)) {
            return m7.h.f(0, 0, 0, 0);
        }
        boolean z14 = true;
        int i14 = bVar.N;
        boolean z15 = i14 != 0;
        boolean z16 = i14 == 0 || i14 == 2;
        int i15 = 8;
        n nVar = this.G0;
        if (!z16 || (z15 && x7.v.h() == null)) {
            i13 = 0;
        } else {
            i13 = I0(bVar);
            if (((f0) nVar).i(bVar) != 0) {
                return m7.h.f(4, 8, 32, i13);
            }
        }
        String str = bVar.f18765o;
        if ("audio/raw".equals(str) && ((f0) nVar).i(bVar) == 0) {
            return m7.h.f(1, 0, 0, 0);
        }
        a7.q qVar2 = new a7.q();
        qVar2.f1181n = o0.r("audio/raw");
        qVar2.D = bVar.E;
        qVar2.E = bVar.F;
        qVar2.F = 2;
        f0 f0Var = (f0) nVar;
        if (f0Var.i(new androidx.media3.common.b(qVar2)) == 0) {
            return m7.h.f(1, 0, 0, 0);
        }
        v2 g13 = str == null ? v2.f100502e : (f0Var.i(bVar) == 0 || (h10 = x7.v.h()) == null) ? x7.v.g(qVar, bVar, false, false) : c1.v(h10);
        if (g13.isEmpty()) {
            return m7.h.f(1, 0, 0, 0);
        }
        if (!z16) {
            return m7.h.f(2, 0, 0, 0);
        }
        x7.n nVar2 = (x7.n) g13.get(0);
        boolean g14 = nVar2.g(bVar);
        if (!g14) {
            for (int i16 = 1; i16 < g13.f100504d; i16++) {
                x7.n nVar3 = (x7.n) g13.get(i16);
                if (nVar3.g(bVar)) {
                    z13 = false;
                    nVar2 = nVar3;
                    break;
                }
            }
        }
        z13 = true;
        z14 = g14;
        int i17 = z14 ? 4 : 3;
        if (z14 && nVar2.h(bVar)) {
            i15 = 16;
        }
        return i17 | i15 | 32 | (nVar2.f134055g ? 64 : 0) | (z13 ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : 0) | i13;
    }

    @Override // x7.p
    public final m7.j I(x7.n nVar, androidx.media3.common.b bVar, androidx.media3.common.b bVar2) {
        m7.j c13 = nVar.c(bVar, bVar2);
        boolean z13 = this.F == null && D0(bVar2);
        int i13 = c13.f86216e;
        if (z13) {
            i13 |= 32768;
        }
        if (J0(bVar2, nVar) > this.I0) {
            i13 |= 64;
        }
        int i14 = i13;
        return new m7.j(nVar.f134049a, bVar, bVar2, i14 == 0 ? c13.f86215d : 0, i14);
    }

    public final int I0(androidx.media3.common.b bVar) {
        g h10 = ((f0) this.G0).h(bVar);
        if (!h10.f93090a) {
            return 0;
        }
        int i13 = h10.f93091b ? 1536 : BitmapUtils.BITMAP_TO_JPEG_SIZE;
        return h10.f93092c ? i13 | 2048 : i13;
    }

    public final int J0(androidx.media3.common.b bVar, x7.n nVar) {
        int i13;
        if (!"OMX.google.raw.decoder".equals(nVar.f134049a) || (i13 = n0.f53866a) >= 24 || (i13 == 23 && n0.U(this.E0))) {
            return bVar.f18766p;
        }
        return -1;
    }

    public final void K0() {
        long j13;
        ArrayDeque arrayDeque;
        long j14;
        long j15;
        o();
        f0 f0Var = (f0) this.G0;
        if (!f0Var.o() || f0Var.N) {
            j13 = Long.MIN_VALUE;
        } else {
            long min = Math.min(f0Var.f93067h.a(), f0Var.f93083u.d(f0Var.k()));
            while (true) {
                arrayDeque = f0Var.f93069i;
                if (arrayDeque.isEmpty() || min < ((z) arrayDeque.getFirst()).f93221c) {
                    break;
                } else {
                    f0Var.C = (z) arrayDeque.remove();
                }
            }
            z zVar = f0Var.C;
            long j16 = min - zVar.f93221c;
            long D = n0.D(j16, zVar.f93219a.f1164a);
            boolean isEmpty = arrayDeque.isEmpty();
            x92.b bVar = f0Var.f93055b;
            if (isEmpty) {
                if (((b7.i) bVar.f134367d).isActive()) {
                    b7.i iVar = (b7.i) bVar.f134367d;
                    if (iVar.f22086o >= 1024) {
                        long j17 = iVar.f22085n;
                        iVar.f22081j.getClass();
                        long h10 = j17 - r12.h();
                        int i13 = iVar.f22079h.f22038a;
                        int i14 = iVar.f22078g.f22038a;
                        j15 = i13 == i14 ? n0.g0(j16, h10, iVar.f22086o, RoundingMode.DOWN) : n0.g0(j16, h10 * i13, iVar.f22086o * i14, RoundingMode.DOWN);
                    } else {
                        j15 = (long) (iVar.f22074c * j16);
                    }
                    j16 = j15;
                }
                z zVar2 = f0Var.C;
                j14 = zVar2.f93220b + j16;
                zVar2.f93222d = j16 - D;
            } else {
                z zVar3 = f0Var.C;
                j14 = zVar3.f93220b + D + zVar3.f93222d;
            }
            long j18 = ((j0) bVar.f134366c).f93123q;
            j13 = f0Var.f93083u.d(j18) + j14;
            long j19 = f0Var.f93068h0;
            if (j18 > j19) {
                long d2 = f0Var.f93083u.d(j18 - j19);
                f0Var.f93068h0 = j18;
                f0Var.f93070i0 += d2;
                if (f0Var.f93072j0 == null) {
                    f0Var.f93072j0 = new Handler(Looper.myLooper());
                }
                f0Var.f93072j0.removeCallbacksAndMessages(null);
                f0Var.f93072j0.postDelayed(new u0.n(f0Var, 15), 100L);
            }
        }
        if (j13 != Long.MIN_VALUE) {
            if (!this.O0) {
                j13 = Math.max(this.N0, j13);
            }
            this.N0 = j13;
            this.O0 = false;
        }
    }

    @Override // x7.p
    public final float U(float f13, androidx.media3.common.b[] bVarArr) {
        int i13 = -1;
        for (androidx.media3.common.b bVar : bVarArr) {
            int i14 = bVar.F;
            if (i14 != -1) {
                i13 = Math.max(i13, i14);
            }
        }
        if (i13 == -1) {
            return -1.0f;
        }
        return f13 * i13;
    }

    @Override // x7.p
    public final ArrayList V(x7.q qVar, androidx.media3.common.b bVar, boolean z13) {
        x7.n h10;
        v2 g13 = bVar.f18765o == null ? v2.f100502e : (((f0) this.G0).i(bVar) == 0 || (h10 = x7.v.h()) == null) ? x7.v.g(qVar, bVar, z13, false) : c1.v(h10);
        HashMap hashMap = x7.v.f134106a;
        ArrayList arrayList = new ArrayList(g13);
        Collections.sort(arrayList, new x7.r(new com.google.firebase.messaging.a0(bVar, 8)));
        return arrayList;
    }

    @Override // x7.p
    public final long W(long j13, long j14) {
        long g03;
        if (this.T0 == -9223372036854775807L) {
            return 10000L;
        }
        f0 f0Var = (f0) this.G0;
        if (!f0Var.o()) {
            g03 = -9223372036854775807L;
        } else if (n0.f53866a >= 23) {
            g03 = kh2.d.u(f0Var.f93085w, f0Var.f93083u);
        } else {
            g03 = n0.g0(f0Var.f93083u.f93214h, 1000000L, f0Var.f93083u.f93209c == 0 ? r2.f93211e * r2.f93210d : g0.a(r2.f93213g), RoundingMode.DOWN);
        }
        if (!this.U0 && g03 == -9223372036854775807L) {
            return 10000L;
        }
        long j15 = this.T0 - j13;
        if (g03 != -9223372036854775807L) {
            j15 = Math.min(g03, j15);
        }
        long j16 = (long) ((j15 / (d() != null ? d().f1164a : 1.0f)) / 2.0f);
        if (this.S0) {
            this.f86176g.getClass();
            j16 -= n0.X(SystemClock.elapsedRealtime()) - j14;
        }
        return Math.max(10000L, j16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    @Override // x7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.widget.x X(x7.n r14, androidx.media3.common.b r15, android.media.MediaCrypto r16, float r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.h0.X(x7.n, androidx.media3.common.b, android.media.MediaCrypto, float):androidx.appcompat.widget.x");
    }

    @Override // x7.p
    public final void Z(k7.e eVar) {
        androidx.media3.common.b bVar;
        y yVar;
        if (n0.f53866a < 29 || (bVar = eVar.f78452c) == null || !Objects.equals(bVar.f18765o, "audio/opus") || !this.f134073h0) {
            return;
        }
        ByteBuffer byteBuffer = eVar.f78457h;
        byteBuffer.getClass();
        androidx.media3.common.b bVar2 = eVar.f78452c;
        bVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i13 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            f0 f0Var = (f0) this.G0;
            AudioTrack audioTrack = f0Var.f93085w;
            if (audioTrack == null || !f0.p(audioTrack) || (yVar = f0Var.f93083u) == null || !yVar.f93217k) {
                return;
            }
            f0Var.f93085w.setOffloadDelayPadding(bVar2.H, i13);
        }
    }

    @Override // m7.z0
    public final boolean a() {
        boolean z13 = this.Q0;
        this.Q0 = false;
        return z13;
    }

    @Override // x7.p, m7.h, m7.q1
    public final void b(int i13, Object obj) {
        h1.b bVar;
        x7.j jVar;
        n nVar = this.G0;
        if (i13 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            f0 f0Var = (f0) nVar;
            if (f0Var.P != floatValue) {
                f0Var.P = floatValue;
                if (f0Var.o()) {
                    f0Var.f93085w.setVolume(f0Var.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 3) {
            a7.f fVar = (a7.f) obj;
            fVar.getClass();
            f0 f0Var2 = (f0) nVar;
            if (f0Var2.A.equals(fVar)) {
                return;
            }
            f0Var2.A = fVar;
            if (f0Var2.f93056b0) {
                return;
            }
            e eVar = f0Var2.f93087y;
            if (eVar != null) {
                eVar.b(fVar);
            }
            f0Var2.g();
            return;
        }
        if (i13 == 6) {
            a7.g gVar = (a7.g) obj;
            gVar.getClass();
            ((f0) nVar).x(gVar);
            return;
        }
        if (i13 == 12) {
            if (n0.f53866a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                f0 f0Var3 = (f0) nVar;
                if (audioDeviceInfo == null) {
                    bVar = null;
                } else {
                    f0Var3.getClass();
                    bVar = new h1.b(audioDeviceInfo, 17);
                }
                f0Var3.f93054a0 = bVar;
                e eVar2 = f0Var3.f93087y;
                if (eVar2 != null) {
                    eVar2.c(audioDeviceInfo);
                }
                AudioTrack audioTrack = f0Var3.f93085w;
                if (audioTrack != null) {
                    kh2.d.c1(audioTrack, f0Var3.f93054a0);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 16) {
            obj.getClass();
            this.R0 = ((Integer) obj).intValue();
            x7.l lVar = this.L;
            if (lVar != null && n0.f53866a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.R0));
                lVar.c(bundle);
                return;
            }
            return;
        }
        if (i13 == 9) {
            obj.getClass();
            f0 f0Var4 = (f0) nVar;
            f0Var4.E = ((Boolean) obj).booleanValue();
            z zVar = new z(f0Var4.z() ? p0.f1163d : f0Var4.D, -9223372036854775807L, -9223372036854775807L);
            if (f0Var4.o()) {
                f0Var4.B = zVar;
                return;
            } else {
                f0Var4.C = zVar;
                return;
            }
        }
        if (i13 != 10) {
            super.b(i13, obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        f0 f0Var5 = (f0) nVar;
        if (f0Var5.Y != intValue) {
            f0Var5.Y = intValue;
            f0Var5.X = intValue != 0;
            f0Var5.g();
        }
        if (n0.f53866a < 35 || (jVar = this.H0) == null) {
            return;
        }
        jVar.d(intValue);
    }

    @Override // m7.z0
    public final void c(p0 p0Var) {
        f0 f0Var = (f0) this.G0;
        f0Var.getClass();
        f0Var.D = new p0(n0.h(p0Var.f1164a, 0.1f, 8.0f), n0.h(p0Var.f1165b, 0.1f, 8.0f));
        if (f0Var.z()) {
            f0Var.w();
            return;
        }
        z zVar = new z(p0Var, -9223372036854775807L, -9223372036854775807L);
        if (f0Var.o()) {
            f0Var.B = zVar;
        } else {
            f0Var.C = zVar;
        }
    }

    @Override // m7.z0
    public final p0 d() {
        return ((f0) this.G0).D;
    }

    @Override // m7.z0
    public final long e() {
        if (this.f86177h == 2) {
            K0();
        }
        return this.N0;
    }

    @Override // x7.p
    public final void i0(Exception exc) {
        d7.u.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        qq2.c cVar = this.F0;
        Handler handler = (Handler) cVar.f104883b;
        if (handler != null) {
            handler.post(new h(cVar, exc, 0));
        }
    }

    @Override // x7.p
    public final void j0(final String str, final long j13, final long j14) {
        final qq2.c cVar = this.F0;
        Handler handler = (Handler) cVar.f104883b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o7.i
                @Override // java.lang.Runnable
                public final void run() {
                    m7.i0 i0Var = (m7.i0) qq2.c.this.f104884c;
                    int i13 = n0.f53866a;
                    n7.c0 c0Var = (n7.c0) i0Var.f86205a.f86285t;
                    n7.b w13 = c0Var.w();
                    c0Var.x(w13, 1008, new d7.r(str, j14, j13) { // from class: n7.x

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f89588b;

                        @Override // d7.r
                        /* renamed from: invoke */
                        public final void mo0invoke(Object obj) {
                            c cVar2 = (c) obj;
                            cVar2.getClass();
                            cVar2.u(b.this, this.f89588b);
                        }
                    });
                }
            });
        }
    }

    @Override // x7.p
    public final void k0(String str) {
        qq2.c cVar = this.F0;
        Handler handler = (Handler) cVar.f104883b;
        if (handler != null) {
            handler.post(new w2.c(18, cVar, str));
        }
    }

    @Override // m7.h
    public final z0 l() {
        return this;
    }

    @Override // x7.p
    public final m7.j l0(qq2.c cVar) {
        androidx.media3.common.b bVar = (androidx.media3.common.b) cVar.f104884c;
        bVar.getClass();
        this.L0 = bVar;
        m7.j l03 = super.l0(cVar);
        qq2.c cVar2 = this.F0;
        Handler handler = (Handler) cVar2.f104883b;
        if (handler != null) {
            handler.post(new a4(cVar2, bVar, l03, 22));
        }
        return l03;
    }

    @Override // m7.h
    public final String m() {
        return "MediaCodecAudioRenderer";
    }

    @Override // x7.p
    public final void m0(androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        int i13;
        androidx.media3.common.b bVar2 = this.M0;
        int[] iArr = null;
        if (bVar2 != null) {
            bVar = bVar2;
        } else if (this.L != null) {
            mediaFormat.getClass();
            int F = "audio/raw".equals(bVar.f18765o) ? bVar.G : (n0.f53866a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? n0.F(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            a7.q qVar = new a7.q();
            qVar.f1181n = o0.r("audio/raw");
            qVar.F = F;
            qVar.G = bVar.H;
            qVar.H = bVar.I;
            qVar.f1178k = bVar.f18762l;
            qVar.f1179l = bVar.f18763m;
            qVar.f1168a = bVar.f18751a;
            qVar.f1169b = bVar.f18752b;
            qVar.f1170c = c1.r(bVar.f18753c);
            qVar.f1171d = bVar.f18754d;
            qVar.f1172e = bVar.f18755e;
            qVar.f1173f = bVar.f18756f;
            qVar.D = mediaFormat.getInteger("channel-count");
            qVar.E = mediaFormat.getInteger("sample-rate");
            androidx.media3.common.b bVar3 = new androidx.media3.common.b(qVar);
            boolean z13 = this.J0;
            int i14 = bVar3.E;
            if (z13 && i14 == 6 && (i13 = bVar.E) < 6) {
                iArr = new int[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr[i15] = i15;
                }
            } else if (this.K0) {
                iArr = ig1.b.r0(i14);
            }
            bVar = bVar3;
        }
        try {
            int i16 = n0.f53866a;
            n nVar = this.G0;
            if (i16 >= 29) {
                boolean z14 = true;
                if (this.f134073h0) {
                    v1 v1Var = this.f86173d;
                    v1Var.getClass();
                    if (v1Var.f86442a != 0) {
                        v1 v1Var2 = this.f86173d;
                        v1Var2.getClass();
                        int i17 = v1Var2.f86442a;
                        f0 f0Var = (f0) nVar;
                        f0Var.getClass();
                        if (i16 < 29) {
                            z14 = false;
                        }
                        bf.b.t(z14);
                        f0Var.f93073k = i17;
                    }
                }
                f0 f0Var2 = (f0) nVar;
                f0Var2.getClass();
                if (i16 < 29) {
                    z14 = false;
                }
                bf.b.t(z14);
                f0Var2.f93073k = 0;
            }
            ((f0) nVar).d(bVar, iArr);
        } catch (AudioSink$ConfigurationException e13) {
            throw g(5001, e13.f18793a, e13, false);
        }
    }

    @Override // x7.p
    public final void n0() {
        this.G0.getClass();
    }

    @Override // m7.h
    public final boolean o() {
        if (this.f134090u0) {
            f0 f0Var = (f0) this.G0;
            if (!f0Var.o() || (f0Var.T && !f0Var.m())) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.p
    public final void p0() {
        ((f0) this.G0).M = true;
    }

    @Override // x7.p, m7.h
    public final boolean q() {
        return ((f0) this.G0).m() || super.q();
    }

    @Override // x7.p, m7.h
    public final void r() {
        qq2.c cVar = this.F0;
        this.P0 = true;
        this.L0 = null;
        this.T0 = -9223372036854775807L;
        this.U0 = false;
        try {
            ((f0) this.G0).g();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th3) {
            try {
                super.r();
                throw th3;
            } finally {
            }
        }
    }

    @Override // m7.h
    public final void s(boolean z13, boolean z14) {
        m7.i iVar = new m7.i();
        this.f134098y0 = iVar;
        qq2.c cVar = this.F0;
        Handler handler = (Handler) cVar.f104883b;
        int i13 = 0;
        if (handler != null) {
            handler.post(new j(cVar, iVar, i13));
        }
        v1 v1Var = this.f86173d;
        v1Var.getClass();
        boolean z15 = v1Var.f86443b;
        n nVar = this.G0;
        if (z15) {
            f0 f0Var = (f0) nVar;
            bf.b.t(f0Var.X);
            if (!f0Var.f93056b0) {
                f0Var.f93056b0 = true;
                f0Var.g();
            }
        } else {
            f0 f0Var2 = (f0) nVar;
            if (f0Var2.f93056b0) {
                f0Var2.f93056b0 = false;
                f0Var2.g();
            }
        }
        q0 q0Var = this.f86175f;
        q0Var.getClass();
        f0 f0Var3 = (f0) nVar;
        f0Var3.f93080r = q0Var;
        d7.e eVar = this.f86176g;
        eVar.getClass();
        f0Var3.f93067h.I = eVar;
    }

    @Override // x7.p, m7.h
    public final void t(long j13, boolean z13) {
        super.t(j13, z13);
        ((f0) this.G0).g();
        this.N0 = j13;
        this.T0 = -9223372036854775807L;
        this.U0 = false;
        this.Q0 = false;
        this.O0 = true;
    }

    @Override // x7.p
    public final boolean t0(long j13, long j14, x7.l lVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.b bVar) {
        int i16;
        int i17;
        byteBuffer.getClass();
        this.T0 = -9223372036854775807L;
        if (this.M0 != null && (i14 & 2) != 0) {
            lVar.getClass();
            lVar.l(i13);
            return true;
        }
        n nVar = this.G0;
        if (z13) {
            if (lVar != null) {
                lVar.l(i13);
            }
            this.f134098y0.f86198f += i15;
            ((f0) nVar).M = true;
            return true;
        }
        try {
            if (!((f0) nVar).l(byteBuffer, j15, i15)) {
                this.T0 = j15;
                return false;
            }
            if (lVar != null) {
                lVar.l(i13);
            }
            this.f134098y0.f86197e += i15;
            return true;
        } catch (AudioSink$InitializationException e13) {
            androidx.media3.common.b bVar2 = this.L0;
            if (this.f134073h0) {
                v1 v1Var = this.f86173d;
                v1Var.getClass();
                if (v1Var.f86442a != 0) {
                    i17 = 5004;
                    throw g(i17, bVar2, e13, e13.f18795b);
                }
            }
            i17 = 5001;
            throw g(i17, bVar2, e13, e13.f18795b);
        } catch (AudioSink$WriteException e14) {
            if (this.f134073h0) {
                v1 v1Var2 = this.f86173d;
                v1Var2.getClass();
                if (v1Var2.f86442a != 0) {
                    i16 = 5003;
                    throw g(i16, bVar, e14, e14.f18797b);
                }
            }
            i16 = 5002;
            throw g(i16, bVar, e14, e14.f18797b);
        }
    }

    @Override // m7.h
    public final void u() {
        x7.j jVar;
        c cVar;
        e eVar = ((f0) this.G0).f93087y;
        if (eVar != null && eVar.f93042j) {
            eVar.f93039g = null;
            int i13 = n0.f53866a;
            Context context = eVar.f93033a;
            if (i13 >= 23 && (cVar = eVar.f93036d) != null) {
                b7.c.s(context).unregisterAudioDeviceCallback(cVar);
            }
            context.unregisterReceiver(eVar.f93037e);
            d dVar = eVar.f93038f;
            if (dVar != null) {
                dVar.b();
            }
            eVar.f93042j = false;
        }
        if (n0.f53866a < 35 || (jVar = this.H0) == null) {
            return;
        }
        jVar.b();
    }

    @Override // m7.h
    public final void v() {
        n nVar = this.G0;
        this.Q0 = false;
        this.T0 = -9223372036854775807L;
        this.U0 = false;
        try {
            try {
                K();
                v0();
                s7.j jVar = this.F;
                if (jVar != null) {
                    jVar.c(null);
                }
                this.F = null;
            } catch (Throwable th3) {
                s7.j jVar2 = this.F;
                if (jVar2 != null) {
                    jVar2.c(null);
                }
                this.F = null;
                throw th3;
            }
        } finally {
            if (this.P0) {
                this.P0 = false;
                ((f0) nVar).u();
            }
        }
    }

    @Override // m7.h
    public final void w() {
        ((f0) this.G0).r();
        this.S0 = true;
    }

    @Override // x7.p
    public final void w0() {
        try {
            f0 f0Var = (f0) this.G0;
            if (!f0Var.T && f0Var.o() && f0Var.f()) {
                f0Var.s();
                f0Var.T = true;
            }
            long j13 = this.f134086s0;
            if (j13 != -9223372036854775807L) {
                this.T0 = j13;
            }
            this.U0 = true;
        } catch (AudioSink$WriteException e13) {
            throw g(this.f134073h0 ? 5003 : 5002, e13.f18798c, e13, e13.f18797b);
        }
    }

    @Override // m7.h
    public final void x() {
        K0();
        this.S0 = false;
        f0 f0Var = (f0) this.G0;
        f0Var.W = false;
        if (f0Var.o()) {
            q qVar = f0Var.f93067h;
            qVar.g();
            if (qVar.f93186x == -9223372036854775807L) {
                p pVar = qVar.f93167e;
                pVar.getClass();
                pVar.h();
            } else {
                qVar.f93188z = qVar.b();
                if (!f0.p(f0Var.f93085w)) {
                    return;
                }
            }
            f0Var.f93085w.pause();
        }
    }
}
