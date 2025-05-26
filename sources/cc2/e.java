package cc2;

import a7.i1;
import ac2.e0;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import df.j1;
import h32.f1;
import h32.f3;
import h32.g3;
import h32.i0;
import h32.k4;
import h32.r3;
import io.reactivex.exceptions.MissingBackpressureException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Random;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.z0;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes2.dex */
public final class e implements nc2.g {

    /* renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f27516o = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f27517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27519c;

    /* renamed from: d, reason: collision with root package name */
    public final c f27520d;

    /* renamed from: e, reason: collision with root package name */
    public final b f27521e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f27522f;

    /* renamed from: g, reason: collision with root package name */
    public final vb0.f f27523g;

    /* renamed from: h, reason: collision with root package name */
    public final hf0.c f27524h;

    /* renamed from: i, reason: collision with root package name */
    public final h f27525i;

    /* renamed from: j, reason: collision with root package name */
    public final p f27526j;

    /* renamed from: k, reason: collision with root package name */
    public final f3 f27527k;

    /* renamed from: l, reason: collision with root package name */
    public final hc2.g f27528l;

    /* renamed from: m, reason: collision with root package name */
    public i0 f27529m;

    /* renamed from: n, reason: collision with root package name */
    public final d f27530n;

    public e(String videoUID, String sessionUID, String videoUriPath, c videoAnalytics, b performanceTracker, int i13, boolean z13, boolean z14, Function0 function0, hc2.g fastDashConfig) {
        xk2.k kVar = vb0.f.f125456e;
        vb0.f connectivityUtils = vb0.e.d();
        hf0.b deviceInfoProvider = new hf0.b();
        h quartileLogger = new h(videoUriPath, videoUID);
        p watchtimeLogger = new p(videoUriPath, videoUID, performanceTracker.f27491j);
        f3 videoEventDataBuilder = new f3();
        videoEventDataBuilder.f66983a = videoUriPath;
        videoEventDataBuilder.f66996n = Integer.valueOf(g.INVALID_QUARTILE.getTraditionalQuartile());
        qc2.c viewability = qc2.c.InvalidVisibility;
        videoEventDataBuilder.f66992j = Double.valueOf(viewability.getTrackingEvent());
        videoEventDataBuilder.A = Boolean.valueOf(z13);
        videoEventDataBuilder.B = Boolean.valueOf(z14);
        Intrinsics.checkNotNullParameter(videoUID, "videoUID");
        Intrinsics.checkNotNullParameter(sessionUID, "sessionUID");
        Intrinsics.checkNotNullParameter(videoUriPath, "videoUriPath");
        Intrinsics.checkNotNullParameter(videoAnalytics, "videoAnalytics");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(connectivityUtils, "connectivityUtils");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(quartileLogger, "quartileLogger");
        Intrinsics.checkNotNullParameter(watchtimeLogger, "watchtimeLogger");
        Intrinsics.checkNotNullParameter(videoEventDataBuilder, "videoEventDataBuilder");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        this.f27517a = videoUID;
        this.f27518b = sessionUID;
        this.f27519c = videoUriPath;
        this.f27520d = videoAnalytics;
        this.f27521e = performanceTracker;
        this.f27522f = function0;
        this.f27523g = connectivityUtils;
        this.f27524h = deviceInfoProvider;
        this.f27525i = quartileLogger;
        this.f27526j = watchtimeLogger;
        this.f27527k = videoEventDataBuilder;
        this.f27528l = fastDashConfig;
        nc2.h hVar = nc2.h.f90405a;
        long j13 = nc2.h.a(videoUID).f90410b;
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        d dVar = new d();
        dVar.f27511a = j13;
        dVar.f27512b = 0L;
        dVar.f27513c = null;
        dVar.f27514d = viewability;
        dVar.f27515e = false;
        this.f27530n = dVar;
        LinkedHashMap linkedHashMap = f27516o;
        linkedHashMap.put(Integer.valueOf(i13), Integer.valueOf(((Number) linkedHashMap.getOrDefault(Integer.valueOf(i13), 0)).intValue() + 1));
        Objects.toString(videoAnalytics);
    }

    @Override // nc2.g
    public final void A(SizeF dimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(dimensions, "viewDimensions");
        double width = dimensions.getWidth();
        hf0.b bVar = (hf0.b) this.f27524h;
        Double valueOf = Double.valueOf(width / bVar.e());
        f3 f3Var = this.f27527k;
        f3Var.f66994l = valueOf;
        f3Var.f66993k = Double.valueOf(dimensions.getHeight() / bVar.e());
        b bVar2 = this.f27521e;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        a aVar = bVar2.A;
        float width2 = dimensions.getWidth();
        float f13 = bVar2.f27488g;
        SizeF updatedDimensions = new SizeF(width2 / f13, dimensions.getHeight() / f13);
        if (!aVar.f27471p && !a.a(updatedDimensions)) {
            aVar.f27477v = updatedDimensions.getWidth();
            aVar.f27478w = updatedDimensions.getHeight();
            aVar.f27471p = true;
        }
        SizeF sizeF = aVar.K;
        Intrinsics.checkNotNullParameter(updatedDimensions, "updatedDimensions");
        if (Intrinsics.a(updatedDimensions.getWidth(), sizeF != null ? Float.valueOf(sizeF.getWidth()) : null) && updatedDimensions.getWidth() == sizeF.getWidth()) {
            return;
        }
        a.j(aVar, bVar2.a(bVar2.f27484c, j13), j14, null, updatedDimensions, 4);
    }

    @Override // nc2.g
    public final void B(SizeF viewDimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        A(viewDimensions, j13, j14);
    }

    @Override // nc2.g
    public final void C(long j13) {
        this.f27530n.f27512b = j13;
        Long valueOf = Long.valueOf(j13);
        f3 latestBuilder = this.f27527k;
        latestBuilder.f67005w = valueOf;
        a(latestBuilder);
        i0 i0Var = this.f27529m;
        p pVar = this.f27526j;
        pVar.getClass();
        String sessionId = this.f27518b;
        Intrinsics.checkNotNullParameter(sessionId, "videoSessionId");
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        latestBuilder.f67003u = k4.WATCHTIME_BEGIN_SESSION;
        pVar.b(latestBuilder.a(), this.f27520d, i0Var);
        h hVar = this.f27525i;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (Intrinsics.d(hVar.f27535e, sessionId)) {
            return;
        }
        hVar.f27535e = sessionId;
        hVar.f27534d = null;
    }

    @Override // nc2.g
    public final void G(long j13) {
        z0 S1 = j1.S1(new Pair("playback_session_id", this.f27518b));
        f3 f3Var = this.f27527k;
        a(f3Var);
        this.f27525i.c(j13, S1, f3Var, this.f27520d, this.f27529m);
    }

    @Override // nc2.g
    public final void I(SizeF updatedDimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(updatedDimensions, "dimensions");
        b bVar = this.f27521e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(updatedDimensions, "dimensions");
        a aVar = bVar.A;
        if (!aVar.f27470o && !a.a(updatedDimensions)) {
            aVar.f27479x = updatedDimensions.getWidth();
            aVar.f27480y = updatedDimensions.getHeight();
            aVar.f27470o = true;
        }
        SizeF sizeF = aVar.L;
        Intrinsics.checkNotNullParameter(updatedDimensions, "updatedDimensions");
        if (!Intrinsics.a(updatedDimensions.getWidth(), sizeF != null ? Float.valueOf(sizeF.getWidth()) : null) || updatedDimensions.getWidth() != sizeF.getWidth()) {
            a.j(aVar, bVar.a(bVar.f27484c, j13), j14, updatedDimensions, null, 8);
        }
        oc2.f fVar = bVar.f27485d;
        if (fVar == null) {
            return;
        }
        fVar.e(new Size((int) updatedDimensions.getWidth(), (int) updatedDimensions.getWidth()));
    }

    @Override // nc2.g
    public final void L(int i13) {
        this.f27521e.A.U += i13;
    }

    @Override // nc2.g
    public final void M(i0 thriftContext) {
        Intrinsics.checkNotNullParameter(thriftContext, "thriftContext");
        this.f27529m = thriftContext;
    }

    @Override // nc2.g
    public final void N(int i13, Exception throwable) {
        String str;
        int i14;
        String message;
        if (throwable != null) {
            b bVar = this.f27521e;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(throwable, "error");
            ArrayList arrayList = new ArrayList();
            if (throwable instanceof SocketTimeoutException) {
                str = "Network error due to socket timeout";
            } else if (throwable instanceof SocketException) {
                str = "Network error due to socket issue";
            } else if ((throwable instanceof StreamResetException) || (throwable instanceof ProtocolException)) {
                str = "Network error due to stream reset";
            } else if (throwable instanceof SSLException) {
                str = "Network error due to SSL issue";
            } else if (throwable instanceof HttpDataSource$HttpDataSourceException) {
                int i15 = ((HttpDataSource$HttpDataSourceException) throwable).f18779c;
                str = a.a.k("HTTP Data Source error during ", i15 != 0 ? i15 != 1 ? i15 != 2 ? "unknown" : "close" : "read" : "open", " state");
            } else {
                str = throwable instanceof ExoPlaybackException ? "Video player playback error" : throwable instanceof ParserException ? "Video player parser error" : throwable instanceof IOException ? "Disk error" : throwable instanceof MissingBackpressureException ? "Rx missing backpressure due to lack of request" : throwable instanceof AudioSink$UnexpectedDiscontinuityException ? "Audio discontinuity failure" : throwable instanceof AudioSink$InitializationException ? "Audio Sink initialization failure" : throwable instanceof MediaCodecVideoDecoderException ? "Media codec video decoder exception" : throwable instanceof MediaCodecDecoderException ? "Media codec decoder exception" : throwable.getMessage();
            }
            if (str != null && str.length() != 0) {
                arrayList.add(str);
            }
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null && (message = throwable2.getMessage()) != null && message.length() != 0) {
                arrayList.add(message);
            }
            String stackTraceString = throwable2 != null ? Log.getStackTraceString(throwable2) : null;
            if (stackTraceString != null && (throwable instanceof ExoPlaybackException) && ((ExoPlaybackException) throwable).f18786c == 2 && new Random(System.currentTimeMillis()).nextInt(100) + 1 <= 1) {
                arrayList.add(stackTraceString);
            }
            if (stackTraceString != null && (throwable instanceof ExoPlaybackException) && (((i14 = ((ExoPlaybackException) throwable).f18786c) == 1004 || i14 == 4001 || i14 == 4003) && new Random(System.currentTimeMillis()).nextInt(100) + 1 <= 5)) {
                arrayList.add(stackTraceString);
            }
            tb0.k kVar = new tb0.k();
            kVar.c("video_url", bVar.f27490i.f22663g);
            String str2 = bVar.f27505x.f64783b.f64779e;
            if (str2 == null) {
                str2 = "null";
            }
            kVar.c("cdn_name", str2);
            kVar.c("type", String.valueOf(i13));
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a("error", null, throwable);
            if (throwable2 != null) {
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                kVar.a("cause", null, throwable2);
            }
            if (stackTraceString != null) {
                kVar.c("trace", stackTraceString);
            }
            tb0.g.f117075a.k("PlayerSessionError", kVar.f117102a);
            if (str == null) {
                str = "";
            }
            String simpleName = throwable.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            bVar.g(i13, str, simpleName, arrayList);
        }
    }

    public final void a(f3 f3Var) {
        f3Var.f67004v = Boolean.valueOf(this.f27523g.b());
        hf0.b bVar = (hf0.b) this.f27524h;
        bVar.getClass();
        f3Var.f67007y = Integer.valueOf((int) (hf0.b.f69002b / bVar.e()));
        bVar.getClass();
        f3Var.f67006x = Integer.valueOf((int) (hf0.b.f69003c / bVar.e()));
    }

    @Override // nc2.g
    public final void b(long j13) {
        String str = this.f27518b;
        z0 S1 = j1.S1(new Pair("playback_session_id", str));
        f3 latestBuilder = this.f27527k;
        a(latestBuilder);
        this.f27525i.c(j13, S1, latestBuilder, this.f27520d, this.f27529m);
        d dVar = this.f27530n;
        long j14 = dVar.f27512b;
        long currentTimeMillis = System.currentTimeMillis();
        a(latestBuilder);
        z0 auxData = j1.S1(new Pair("playback_session_id", str));
        i0 i0Var = this.f27529m;
        p pVar = this.f27526j;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        r3 r3Var = r3.PLAYING;
        c cVar = this.f27520d;
        pVar.c(r3Var, j14, currentTimeMillis, latestBuilder, cVar, i0Var);
        pVar.c(r3.STALLING, 0L, currentTimeMillis, latestBuilder, cVar, i0Var);
        pVar.d(cVar, null);
        if (cVar != null) {
            cVar.b(i0Var, f1.VIDEO_START, pVar.f27542b, auxData, null);
        }
        dVar.f27511a = 0L;
        this.f27521e.A.N++;
    }

    @Override // nc2.g
    public final void c(long j13, long j14) {
        f3 f3Var = this.f27527k;
        a(f3Var);
        this.f27525i.a(j13, j14, f3Var, this.f27520d, this.f27529m);
    }

    @Override // nc2.g
    public final void d(int i13, int i14, String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "sourceUrl");
        if (i13 != 1 || i14 == 1) {
            return;
        }
        b bVar = this.f27521e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        bVar.A.f27452J = videoUrl;
        oc2.f fVar = bVar.f27485d;
        if (fVar == null) {
            return;
        }
        fVar.f(videoUrl);
    }

    @Override // nc2.g
    public final void e(long j13, long j14, e0 playerDisconnectReason) {
        Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
        this.f27521e.f(this.f27529m, this.f27520d, System.currentTimeMillis(), j13, j14);
        if (this.f27528l.a(this.f27519c) && playerDisconnectReason == e0.GridToCloseupPlayerReuse) {
            return;
        }
        b bVar = this.f27521e;
        gc2.c cVar = bVar.f27505x;
        cVar.getClass();
        cVar.f64783b = new gc2.b();
        bVar.A = new a(bVar.f27486e, bVar.f27490i.f22663g, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, null, 0, 0L, 0.0f, false, null, null, null, bVar.f27505x, bVar.f27496o, -4, 262143);
        f3 f3Var = this.f27527k;
        f3Var.f66983a = null;
        f3Var.f66984b = null;
        f3Var.f66985c = null;
        f3Var.f66986d = null;
        f3Var.f66987e = null;
        f3Var.f66988f = null;
        f3Var.f66989g = null;
        f3Var.f66990h = null;
        f3Var.f66991i = null;
        f3Var.f66992j = null;
        f3Var.f66993k = null;
        f3Var.f66994l = null;
        f3Var.f66995m = null;
        f3Var.f66996n = null;
        f3Var.f66997o = null;
        f3Var.f66998p = null;
        f3Var.f66999q = null;
        f3Var.f67000r = null;
        f3Var.f67001s = null;
        f3Var.f67002t = null;
        f3Var.f67003u = null;
        f3Var.f67004v = null;
        f3Var.f67005w = null;
        f3Var.f67006x = null;
        f3Var.f67007y = null;
        f3Var.f67008z = null;
        f3Var.A = null;
        f3Var.B = null;
        this.f27526j.getClass();
    }

    @Override // nc2.g
    public final void i(qc2.c viewability, boolean z13, long j13, long j14) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        d dVar = this.f27530n;
        qc2.c viewability2 = dVar.f27514d;
        f3 latestBuilder = this.f27527k;
        if (viewability != viewability2) {
            long a13 = dVar.a(j13);
            long currentTimeMillis = System.currentTimeMillis();
            a(latestBuilder);
            i0 i0Var = this.f27529m;
            p pVar = this.f27526j;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(viewability2, "viewability");
            Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
            Objects.toString(viewability2);
            f3 a14 = pVar.a(latestBuilder, a13, currentTimeMillis);
            a14.f66992j = Double.valueOf(viewability2.getTrackingEvent());
            a14.f67003u = k4.WATCHTIME_VIEWABILITY;
            g3 a15 = a14.a();
            pVar.b(a15, this.f27520d, i0Var);
            pVar.f27544d = a15;
            dVar.f27511a = a13;
        }
        Intrinsics.checkNotNullParameter(viewability, "<set-?>");
        dVar.f27514d = viewability;
        latestBuilder.f66992j = Double.valueOf(viewability.getTrackingEvent());
        i0 i0Var2 = this.f27529m;
        long currentTimeMillis2 = System.currentTimeMillis();
        b bVar = this.f27521e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        boolean isVisible = bVar.f27489h.isVisible(viewability);
        boolean z14 = isVisible != bVar.f27504w;
        a aVar = bVar.A;
        if (!aVar.f27465j && z14 && isVisible) {
            if (z13) {
                aVar.f27465j = true;
                aVar.f27472q = 0L;
            } else {
                aVar.f27464i = currentTimeMillis2;
            }
        }
        if (z14 && !isVisible && aVar.e()) {
            bVar.f(i0Var2, this.f27520d, currentTimeMillis2, j14, j13);
        }
        bVar.f27504w = isVisible;
    }

    @Override // nc2.g
    public final void j(long j13) {
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = this.f27521e;
        a aVar = bVar.A;
        if (!aVar.f27461f) {
            aVar.f27474s = j13;
            aVar.f27461f = true;
            aVar.f27475t = currentTimeMillis;
        } else if (aVar.f27476u == 0) {
            aVar.f27476u = currentTimeMillis;
        }
        oc2.f fVar = bVar.f27485d;
        if (fVar == null) {
            return;
        }
        fVar.d(j13);
    }

    @Override // nc2.g
    public final void k(i1 tracks) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        b bVar = this.f27521e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        if (bVar.A.V != null) {
            return;
        }
        String url = bVar.f27490i.f22663g;
        hc2.p pVar = bVar.f27494m;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        vb0.j.f125466a.P("prefetchTracker", tb0.p.VIDEO_PLAYER);
        hc2.n nVar = (hc2.n) pVar.f68783a.get(url);
        if (nVar != null && nVar.c(tracks)) {
            bVar.h(nVar.b(), nVar.a());
        }
    }

    @Override // nc2.g
    public final void n(long j13, boolean z13) {
        d dVar = this.f27530n;
        boolean z14 = dVar.f27515e;
        long a13 = dVar.a(j13);
        long currentTimeMillis = System.currentTimeMillis();
        f3 latestBuilder = this.f27527k;
        a(latestBuilder);
        i0 i0Var = this.f27529m;
        p pVar = this.f27526j;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        f3 a14 = pVar.a(latestBuilder, a13, currentTimeMillis);
        a14.f66991i = Boolean.valueOf(z14);
        a14.f67003u = k4.WATCHTIME_VOLUME;
        g3 a15 = a14.a();
        pVar.b(a15, this.f27520d, i0Var);
        pVar.f27544d = a15;
        dVar.f27511a = a13;
        dVar.f27515e = z13;
        latestBuilder.f66991i = Boolean.valueOf(z13);
    }

    @Override // nc2.g
    public final void r(int i13, boolean z13, long j13, long j14, ic2.b handleChange) {
        f3 f3Var;
        Intrinsics.checkNotNullParameter(handleChange, "handleChange");
        r3 r3Var = null;
        if (i13 != 1) {
            if (i13 == 2) {
                r3Var = z13 ? r3.STALLING : r3.LOADING;
            } else if (i13 == 3) {
                r3Var = z13 ? r3.PLAYING : r3.PAUSED;
            } else if (i13 == 4) {
                r3Var = r3.PAUSED;
            }
        } else if (z13) {
            r3Var = r3.PAUSED;
        }
        r3 r3Var2 = r3Var;
        d dVar = this.f27530n;
        boolean z14 = dVar.f27513c != r3Var2;
        long currentTimeMillis = System.currentTimeMillis();
        f3 f3Var2 = this.f27527k;
        c cVar = this.f27520d;
        if (cVar != null) {
            if (z14) {
                r3 r3Var3 = dVar.f27513c;
                long a13 = dVar.a(j13);
                a(f3Var2);
                this.f27526j.c(r3Var3, a13, currentTimeMillis, f3Var2, cVar, this.f27529m);
                dVar.f27511a = a13;
            }
            f3Var = f3Var2;
            this.f27521e.d(this.f27529m, cVar, currentTimeMillis, i13, z13, j14, j13);
        } else {
            f3Var = f3Var2;
        }
        handleChange.invoke(Boolean.valueOf(z14));
        f3Var.f66997o = r3Var2;
        dVar.f27513c = r3Var2;
    }

    @Override // nc2.g
    public final void t(long j13, long j14) {
        long currentTimeMillis = System.currentTimeMillis();
        k4 seekEvent = k4.WATCHTIME_SEEK_START;
        d dVar = this.f27530n;
        long a13 = dVar.a(j13);
        f3 latestBuilder = this.f27527k;
        a(latestBuilder);
        i0 i0Var = this.f27529m;
        p pVar = this.f27526j;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(seekEvent, "seekEvent");
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        Objects.toString(seekEvent);
        f3 a14 = pVar.a(latestBuilder, a13, currentTimeMillis);
        a14.f67003u = seekEvent;
        g3 a15 = a14.a();
        pVar.b(a15, this.f27520d, i0Var);
        pVar.f27544d = a15;
        dVar.f27511a = a13;
        this.f27525i.b(j13, j14);
    }

    @Override // nc2.g
    public final void u(long j13, long j14) {
        long currentTimeMillis = System.currentTimeMillis();
        r3 r3Var = r3.PAUSED;
        long j15 = this.f27530n.f27511a;
        f3 f3Var = this.f27527k;
        a(f3Var);
        this.f27526j.c(r3Var, j15, currentTimeMillis, f3Var, this.f27520d, this.f27529m);
        this.f27521e.d(this.f27529m, this.f27520d, currentTimeMillis, 1, false, j14, j13);
    }

    @Override // nc2.g
    public final void v(long j13) {
        b bVar = this.f27521e;
        bVar.A.P++;
        oc2.f fVar = bVar.f27485d;
        if (fVar == null) {
            return;
        }
        fVar.c(j13);
    }

    @Override // nc2.g
    public final void w(androidx.media3.common.b format) {
        int i13;
        Intrinsics.checkNotNullParameter(format, "format");
        b bVar = this.f27521e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(format, "format");
        a aVar = bVar.A;
        long j13 = aVar.f27474s;
        oc2.f fVar = bVar.f27485d;
        if (j13 <= 0 && (i13 = format.f18760j) > 0) {
            long j14 = i13;
            aVar.f27474s = j14;
            if (fVar != null) {
                fVar.d(j14);
            }
        }
        float f13 = format.f18772v;
        float f14 = bVar.f27488g;
        int i14 = format.f18773w;
        float f15 = i14;
        SizeF sizeF = new SizeF(f13 / f14, f15 / f14);
        boolean z13 = aVar.f27470o;
        int i15 = format.f18772v;
        if (!z13 && !a.a(sizeF)) {
            float f16 = i15;
            aVar.f27479x = f16;
            aVar.f27480y = f15;
            if (f16 > 0.0f && f15 > 0.0f) {
                aVar.f27470o = true;
            }
        }
        if (fVar == null) {
            return;
        }
        fVar.e(new Size(i15, i14));
    }

    @Override // nc2.g
    public final void x(long j13, long j14) {
        long currentTimeMillis = System.currentTimeMillis();
        k4 seekEvent = k4.WATCHTIME_SEEK_END;
        f3 latestBuilder = this.f27527k;
        a(latestBuilder);
        i0 i0Var = this.f27529m;
        p pVar = this.f27526j;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(seekEvent, "seekEvent");
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        Objects.toString(seekEvent);
        f3 a13 = pVar.a(latestBuilder, j13, currentTimeMillis);
        a13.f67003u = seekEvent;
        g3 a14 = a13.a();
        pVar.b(a14, this.f27520d, i0Var);
        pVar.f27544d = a14;
        this.f27530n.f27511a = j13;
        this.f27525i.b(j13, j14);
        a aVar = this.f27521e.A;
        if (aVar.f27458c0) {
            aVar.i(currentTimeMillis);
            aVar.h(aVar.E + 1);
        }
    }

    @Override // nc2.g
    public final void y() {
        this.f27520d.b(this.f27529m, f1.VIDEO_START, this.f27517a, j1.S1(new Pair("playback_session_id", this.f27518b)), null);
        Function0 function0 = this.f27522f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // nc2.g
    public final void z(float f13) {
        this.f27521e.A.Q = f13;
    }
}
