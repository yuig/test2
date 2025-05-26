package jg1;

import android.opengl.EGLContext;
import android.util.Size;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.sp;
import et1.h0;
import et1.u0;
import et1.v0;
import ht1.i0;
import ht1.j0;
import ht1.w0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public g f76041a;

    /* renamed from: b, reason: collision with root package name */
    public g f76042b;

    /* renamed from: c, reason: collision with root package name */
    public CompletableFuture f76043c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f76044d = xk2.m.b(o.f76028i);

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f76045e = xk2.m.b(new l(this, 7));

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f76046f = xk2.m.b(new l(this, 3));

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f76047g = xk2.m.b(new l(this, 2));

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f76048h = xk2.m.b(new l(this, 5));

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f76049i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f76050j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f76051k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f76052l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f76053m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f76054n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f76055o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f76056p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f76057q;

    /* renamed from: r, reason: collision with root package name */
    public final int f76058r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f76059s;

    public q() {
        xk2.m.b(new l(this, 11));
        this.f76049i = xk2.m.b(new l(this, 1));
        this.f76050j = xk2.m.b(new l(this, 12));
        this.f76051k = xk2.m.b(new l(this, 4));
        this.f76052l = xk2.m.b(new l(this, 0));
        this.f76053m = xk2.m.b(new l(this, 8));
        this.f76054n = xk2.m.b(new l(this, 9));
        this.f76055o = xk2.m.b(new l(this, 6));
        this.f76056p = xk2.m.b(new l(this, 14));
        this.f76057q = xk2.m.b(new l(this, 13));
        this.f76058r = 1000;
    }

    public static final j a(q qVar) {
        return (j) qVar.f76044d.getValue();
    }

    public final void b(List srcMediaItems, sp srcAudioItems, String destSrc, Size outputResolution, String str, List bitmapConfigs, k videoFormatMimeType, EGLContext shareContext, fo audioMix, String creationSessionId, Set featuresUsed) {
        Intrinsics.checkNotNullParameter(srcMediaItems, "srcMediaItems");
        Intrinsics.checkNotNullParameter(srcAudioItems, "srcAudioItems");
        Intrinsics.checkNotNullParameter(destSrc, "destSrc");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        Intrinsics.checkNotNullParameter(videoFormatMimeType, "videoFormatMimeType");
        Intrinsics.checkNotNullParameter(shareContext, "shareContext");
        Intrinsics.checkNotNullParameter(audioMix, "audioMix");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        Intrinsics.checkNotNullParameter(featuresUsed, "featuresUsed");
        try {
            this.f76043c = new CompletableFuture();
            nt1.h.b(new p(this, destSrc, videoFormatMimeType, outputResolution, srcMediaItems, srcAudioItems, audioMix, featuresUsed, str, bitmapConfigs, shareContext), new ic1.c(19, this, creationSessionId));
        } finally {
            CompletableFuture completableFuture = this.f76043c;
            Intrinsics.f(completableFuture);
            completableFuture.complete(null);
        }
    }

    public final i0 c(et1.j mediaExtractor, boolean z13, long j13, long j14, long j15, float f13) {
        if (z13) {
            return null;
        }
        mediaExtractor.f60034a.seekTo(j13, 0);
        j0 j0Var = (j0) this.f76048h.getValue();
        id1.a subcomponentProvider = ((u0) d()).f60107e.b();
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(subcomponentProvider, "mutableComponentProvider");
        et1.c cVar = (et1.c) subcomponentProvider.get();
        v0 v0Var = (v0) cVar;
        h0 simpleProducerFactory = j0Var.f70258a.f60083a;
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(subcomponentProvider, "mutableComponentProvider");
        lt1.c cVar2 = new lt1.c(mediaExtractor, simpleProducerFactory, subcomponentProvider);
        lt1.d a13 = cVar2.a(et1.j0.AUDIO, 0);
        et1.s sVar = j0Var.f70259b;
        et1.r trimAudioToStartTimeFactory = sVar.f60087a;
        Intrinsics.checkNotNullParameter(trimAudioToStartTimeFactory, "$trimAudioToStartTimeFactory");
        et1.r trimAudioToEndTimeFactory = sVar.f60088b;
        Intrinsics.checkNotNullParameter(trimAudioToEndTimeFactory, "$trimAudioToEndTimeFactory");
        t.a startTimeSetterFactory = sVar.f60089c;
        Intrinsics.checkNotNullParameter(startTimeSetterFactory, "$startTimeSetterFactory");
        et1.d0 passThroughNodeFactory = sVar.f60090d;
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "$passThroughNodeFactory");
        t.a mediaPacketToAudioPacketFactory = sVar.f60091e;
        Intrinsics.checkNotNullParameter(mediaPacketToAudioPacketFactory, "$mediaPacketToAudioPacketFactory");
        et1.x audioDecoderFactory = sVar.f60092f;
        Intrinsics.checkNotNullParameter(audioDecoderFactory, "$audioDecoderFactory");
        Intrinsics.checkNotNullParameter(subcomponentProvider, "mutableComponentProvider");
        Object obj = subcomponentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ht1.g gVar = new ht1.g(j13, j14, j15, trimAudioToStartTimeFactory, trimAudioToEndTimeFactory, startTimeSetterFactory, passThroughNodeFactory, mediaPacketToAudioPacketFactory, audioDecoderFactory, (et1.c) obj);
        v0Var.a(cVar2, "Audio Track Demuxer");
        v0Var.a(gVar, "Audio Decoder Pipeline");
        u0 u0Var = (u0) v0Var.f60109a;
        u0Var.a(gVar.f70222k, a13.f84811g);
        u0Var.a(gVar.f70225n, a13.f84812h);
        kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
        j0Var2.f80434a = gVar.f70223l;
        if (Math.abs(f13 - 1.0f) > 1.0E-5f) {
            j0Var.f70260c.getClass();
            Intrinsics.checkNotNullParameter(subcomponentProvider, "subcomponentProvider");
            Object obj2 = subcomponentProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            w0 w0Var = new w0(f13, (et1.c) obj2);
            v0Var.a(w0Var, "Volume Control");
            mt1.d dVar = (mt1.d) j0Var2.f80434a;
            ht1.v0 v0Var2 = w0Var.f70370d;
            u0Var.a(v0Var2, dVar);
            j0Var2.f80434a = v0Var2;
        }
        return new i0(cVar, cVar2, j0Var2, gVar);
    }

    public final et1.d d() {
        return (et1.d) this.f76045e.getValue();
    }
}
