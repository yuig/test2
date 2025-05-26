package n7;

import a7.a1;
import a7.b1;
import a7.o1;
import a7.u0;
import a7.z0;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import c2.n2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h0 implements c, i0 {
    public int A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f89435a;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f89437c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f89438d;

    /* renamed from: j, reason: collision with root package name */
    public String f89444j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f89445k;

    /* renamed from: l, reason: collision with root package name */
    public int f89446l;

    /* renamed from: o, reason: collision with root package name */
    public PlaybackException f89449o;

    /* renamed from: p, reason: collision with root package name */
    public e5.d f89450p;

    /* renamed from: q, reason: collision with root package name */
    public e5.d f89451q;

    /* renamed from: r, reason: collision with root package name */
    public e5.d f89452r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.media3.common.b f89453s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.media3.common.b f89454t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.media3.common.b f89455u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f89456v;

    /* renamed from: w, reason: collision with root package name */
    public int f89457w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f89458x;

    /* renamed from: y, reason: collision with root package name */
    public int f89459y;

    /* renamed from: z, reason: collision with root package name */
    public int f89460z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f89436b = d7.b.K();

    /* renamed from: f, reason: collision with root package name */
    public final a1 f89440f = new a1();

    /* renamed from: g, reason: collision with root package name */
    public final z0 f89441g = new z0();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f89443i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f89442h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f89439e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f89447m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f89448n = 0;

    public h0(Context context, PlaybackSession playbackSession) {
        this.f89435a = context.getApplicationContext();
        this.f89438d = playbackSession;
        e0 e0Var = new e0();
        this.f89437c = e0Var;
        e0Var.f89423d = this;
    }

    public static n2 e0(PlaybackException playbackException, Context context, boolean z13) {
        int i13;
        boolean z14;
        int i14 = playbackException.f18745a;
        if (i14 == 1001) {
            return new n2(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z14 = exoPlaybackException.f18786c == 1;
            i13 = exoPlaybackException.f18790g;
        } else {
            i13 = 0;
            z14 = false;
        }
        Throwable cause = playbackException.getCause();
        cause.getClass();
        int i15 = 25;
        if (!(cause instanceof IOException)) {
            if (z14 && (i13 == 0 || i13 == 1)) {
                return new n2(35, 0);
            }
            if (z14 && i13 == 3) {
                return new n2(15, 0);
            }
            if (z14 && i13 == 2) {
                return new n2(23, 0);
            }
            if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                return new n2(13, d7.n0.A(((MediaCodecRenderer$DecoderInitializationException) cause).f18828d));
            }
            if (cause instanceof MediaCodecDecoderException) {
                return new n2(14, ((MediaCodecDecoderException) cause).f18824a);
            }
            if (cause instanceof OutOfMemoryError) {
                return new n2(14, 0);
            }
            if (cause instanceof AudioSink$InitializationException) {
                return new n2(17, ((AudioSink$InitializationException) cause).f18794a);
            }
            if (cause instanceof AudioSink$WriteException) {
                return new n2(18, ((AudioSink$WriteException) cause).f18796a);
            }
            if (!(cause instanceof MediaCodec.CryptoException)) {
                return new n2(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
            switch (d7.n0.z(errorCode)) {
                case 6002:
                    i15 = 24;
                    break;
                case 6003:
                    i15 = 28;
                    break;
                case 6004:
                    break;
                case 6005:
                    i15 = 26;
                    break;
                default:
                    i15 = 27;
                    break;
            }
            return new n2(i15, errorCode);
        }
        if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
            return new n2(5, ((HttpDataSource$InvalidResponseCodeException) cause).f18780d);
        }
        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
            return new n2(z13 ? 10 : 11, 0);
        }
        boolean z15 = cause instanceof HttpDataSource$HttpDataSourceException;
        if (z15 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
            if (d7.b0.b(context).d() == 1) {
                return new n2(3, 0);
            }
            Throwable cause2 = cause.getCause();
            return cause2 instanceof UnknownHostException ? new n2(6, 0) : cause2 instanceof SocketTimeoutException ? new n2(7, 0) : (z15 && ((HttpDataSource$HttpDataSourceException) cause).f18779c == 1) ? new n2(4, 0) : new n2(8, 0);
        }
        if (i14 == 1002) {
            return new n2(21, 0);
        }
        if (!(cause instanceof DrmSession$DrmSessionException)) {
            if (!(cause instanceof FileDataSource$FileDataSourceException) || !(cause.getCause() instanceof FileNotFoundException)) {
                return new n2(9, 0);
            }
            Throwable cause3 = cause.getCause();
            cause3.getClass();
            Throwable cause4 = cause3.getCause();
            return ((cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) ? new n2(32, 0) : new n2(31, 0);
        }
        Throwable cause5 = cause.getCause();
        cause5.getClass();
        if (!(cause5 instanceof MediaDrm.MediaDrmStateException)) {
            return (d7.n0.f53866a < 23 || !(cause5 instanceof MediaDrmResetException)) ? cause5 instanceof NotProvisionedException ? new n2(24, 0) : cause5 instanceof DeniedByServerException ? new n2(29, 0) : cause5 instanceof UnsupportedDrmException ? new n2(23, 0) : cause5 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new n2(28, 0) : new n2(30, 0) : new n2(27, 0);
        }
        int A = d7.n0.A(((MediaDrm.MediaDrmStateException) cause5).getDiagnosticInfo());
        switch (d7.n0.z(A)) {
            case 6002:
                i15 = 24;
                break;
            case 6003:
                i15 = 28;
                break;
            case 6004:
                break;
            case 6005:
                i15 = 26;
                break;
            default:
                i15 = 27;
                break;
        }
        return new n2(i15, A);
    }

    @Override // n7.c
    public final void F(b bVar, PlaybackException playbackException) {
        this.f89449o = playbackException;
    }

    @Override // n7.c
    public final void L(b bVar, g8.v vVar, g8.a0 a0Var, IOException iOException, boolean z13) {
        this.f89457w = a0Var.f64179a;
    }

    @Override // n7.c
    public final void Q(b bVar, int i13, long j13, long j14) {
        g8.e0 e0Var = bVar.f89381d;
        if (e0Var != null) {
            String f13 = this.f89437c.f(bVar.f89379b, e0Var);
            HashMap hashMap = this.f89443i;
            Long l13 = (Long) hashMap.get(f13);
            HashMap hashMap2 = this.f89442h;
            Long l14 = (Long) hashMap2.get(f13);
            hashMap.put(f13, Long.valueOf((l13 == null ? 0L : l13.longValue()) + j13));
            hashMap2.put(f13, Long.valueOf((l14 != null ? l14.longValue() : 0L) + i13));
        }
    }

    @Override // n7.i0
    public final void X(b bVar, String str, boolean z13) {
        g8.e0 e0Var = bVar.f89381d;
        if ((e0Var == null || !e0Var.b()) && str.equals(this.f89444j)) {
            d0();
        }
        this.f89442h.remove(str);
        this.f89443i.remove(str);
    }

    public final boolean c0(e5.d dVar) {
        String str;
        if (dVar != null) {
            String str2 = (String) dVar.f57217d;
            e0 e0Var = this.f89437c;
            synchronized (e0Var) {
                str = e0Var.f89425f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void d0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f89445k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f89445k.setVideoFramesDropped(this.f89459y);
            this.f89445k.setVideoFramesPlayed(this.f89460z);
            Long l13 = (Long) this.f89442h.get(this.f89444j);
            this.f89445k.setNetworkTransferDurationMillis(l13 == null ? 0L : l13.longValue());
            Long l14 = (Long) this.f89443i.get(this.f89444j);
            this.f89445k.setNetworkBytesRead(l14 == null ? 0L : l14.longValue());
            this.f89445k.setStreamSource((l14 == null || l14.longValue() <= 0) ? 0 : 1);
            build = this.f89445k.build();
            this.f89436b.execute(new e5.k(10, this, build));
        }
        this.f89445k = null;
        this.f89444j = null;
        this.A = 0;
        this.f89459y = 0;
        this.f89460z = 0;
        this.f89453s = null;
        this.f89454t = null;
        this.f89455u = null;
        this.B = false;
    }

    @Override // n7.c
    public final void f(b bVar, g8.a0 a0Var) {
        if (bVar.f89381d == null) {
            return;
        }
        androidx.media3.common.b bVar2 = a0Var.f64181c;
        bVar2.getClass();
        g8.e0 e0Var = bVar.f89381d;
        e0Var.getClass();
        e5.d dVar = new e5.d(bVar2, a0Var.f64182d, this.f89437c.f(bVar.f89379b, e0Var));
        int i13 = a0Var.f64180b;
        if (i13 != 0) {
            if (i13 == 1) {
                this.f89451q = dVar;
                return;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f89452r = dVar;
                return;
            }
        }
        this.f89450p = dVar;
    }

    public final void f0(b1 b1Var, g8.e0 e0Var) {
        int b13;
        PlaybackMetrics.Builder builder = this.f89445k;
        if (e0Var == null || (b13 = b1Var.b(e0Var.f64233a)) == -1) {
            return;
        }
        z0 z0Var = this.f89441g;
        int i13 = 0;
        b1Var.g(b13, z0Var, false);
        int i14 = z0Var.f1253c;
        a1 a1Var = this.f89440f;
        b1Var.o(i14, a1Var);
        a7.d0 d0Var = a1Var.f931c.f1073b;
        if (d0Var != null) {
            int O = d7.n0.O(d0Var.f969a, d0Var.f970b);
            i13 = O != 0 ? O != 1 ? O != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i13);
        if (a1Var.f941m != -9223372036854775807L && !a1Var.f939k && !a1Var.f937i && !a1Var.b()) {
            builder.setMediaDurationMillis(d7.n0.o0(a1Var.f941m));
        }
        builder.setPlaybackType(a1Var.b() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0258  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v17, types: [androidx.media3.common.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    @Override // n7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(a7.v0 r21, tb.l r22) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.h0.g(a7.v0, tb.l):void");
    }

    public final void g0(int i13, long j13, androidx.media3.common.b bVar, int i14) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i15;
        timeSinceCreatedMillis = f0.g(i13).setTimeSinceCreatedMillis(j13 - this.f89439e);
        if (bVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i14 != 1) {
                i15 = 3;
                if (i14 != 2) {
                    i15 = i14 != 3 ? 1 : 4;
                }
            } else {
                i15 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i15);
            String str = bVar.f18764n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bVar.f18765o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bVar.f18761k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i16 = bVar.f18760j;
            if (i16 != -1) {
                timeSinceCreatedMillis.setBitrate(i16);
            }
            int i17 = bVar.f18772v;
            if (i17 != -1) {
                timeSinceCreatedMillis.setWidth(i17);
            }
            int i18 = bVar.f18773w;
            if (i18 != -1) {
                timeSinceCreatedMillis.setHeight(i18);
            }
            int i19 = bVar.E;
            if (i19 != -1) {
                timeSinceCreatedMillis.setChannelCount(i19);
            }
            int i23 = bVar.F;
            if (i23 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i23);
            }
            String str4 = bVar.f18754d;
            if (str4 != null) {
                int i24 = d7.n0.f53866a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f13 = bVar.f18774x;
            if (f13 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f13);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        build = timeSinceCreatedMillis.build();
        this.f89436b.execute(new e5.k(7, this, build));
    }

    @Override // n7.i0
    public final void j(String str) {
    }

    @Override // n7.c
    public final void k(b bVar, m7.i iVar) {
        this.f89459y += iVar.f86199g;
        this.f89460z += iVar.f86197e;
    }

    @Override // n7.i0
    public final void o(b bVar, String str) {
    }

    @Override // n7.c
    public final void w(b bVar, o1 o1Var) {
        e5.d dVar = this.f89450p;
        if (dVar != null) {
            Object obj = dVar.f57216c;
            if (((androidx.media3.common.b) obj).f18773w == -1) {
                a7.q a13 = ((androidx.media3.common.b) obj).a();
                a13.f1188u = o1Var.f1159a;
                a13.f1189v = o1Var.f1160b;
                this.f89450p = new e5.d(a13.a(), dVar.f57215b, (String) dVar.f57217d);
            }
        }
    }

    @Override // n7.c
    public final void x(b bVar, u0 u0Var, u0 u0Var2, int i13) {
        if (i13 == 1) {
            this.f89456v = true;
        }
        this.f89446l = i13;
    }

    @Override // n7.i0
    public final void z(b bVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        g8.e0 e0Var = bVar.f89381d;
        if (e0Var == null || !e0Var.b()) {
            d0();
            this.f89444j = str;
            playerName = d7.l0.c().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.6.1");
            this.f89445k = playerVersion;
            f0(bVar.f89379b, e0Var);
        }
    }
}
