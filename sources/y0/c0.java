package y0;

import a.a4;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.appcompat.app.j0;
import androidx.camera.core.impl.v2;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;
import v.w0;

/* loaded from: classes2.dex */
public final class c0 implements m {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public Future D;

    /* renamed from: a, reason: collision with root package name */
    public final String f136277a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136279c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f136280d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec f136281e;

    /* renamed from: f, reason: collision with root package name */
    public final k f136282f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f136283g;

    /* renamed from: h, reason: collision with root package name */
    public final f0.j f136284h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.common.util.concurrent.c0 f136285i;

    /* renamed from: j, reason: collision with root package name */
    public final r4.i f136286j;

    /* renamed from: p, reason: collision with root package name */
    public final v2 f136292p;

    /* renamed from: t, reason: collision with root package name */
    public y f136296t;

    /* renamed from: b, reason: collision with root package name */
    public final Object f136278b = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f136287k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f136288l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f136289m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f136290n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f136291o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public final d0.o f136293q = new d0.o(9);

    /* renamed from: r, reason: collision with root package name */
    public n f136294r = n.f136349gp;

    /* renamed from: s, reason: collision with root package name */
    public Executor f136295s = l3.c.s();

    /* renamed from: u, reason: collision with root package name */
    public Range f136297u = E;

    /* renamed from: v, reason: collision with root package name */
    public long f136298v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f136299w = false;

    /* renamed from: x, reason: collision with root package name */
    public Long f136300x = null;

    /* renamed from: y, reason: collision with root package name */
    public ScheduledFuture f136301y = null;

    /* renamed from: z, reason: collision with root package name */
    public a0 f136302z = null;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    public c0(Executor executor, o oVar) {
        executor.getClass();
        oVar.getClass();
        LruCache lruCache = z0.a.f140507a;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(oVar.b());
            this.f136281e = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.f136284h = new f0.j(executor);
            MediaFormat a13 = oVar.a();
            this.f136280d = a13;
            v2 c13 = oVar.c();
            this.f136292p = c13;
            if (oVar instanceof c) {
                this.f136277a = "AudioEncoder";
                this.f136279c = false;
                this.f136282f = new x(this);
                a aVar = new a(codecInfo, oVar.b());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) aVar.f16057b).getAudioCapabilities());
                this.f136283g = aVar;
            } else {
                if (!(oVar instanceof e)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                this.f136277a = "VideoEncoder";
                this.f136279c = true;
                this.f136282f = new b0(this);
                g0 g0Var = new g0(codecInfo, oVar.b());
                if (a13.containsKey("bitrate")) {
                    int integer = a13.getInteger("bitrate");
                    int intValue = g0Var.f136341c.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        a13.setInteger("bitrate", intValue);
                        m0.p("VideoEncoder", "updated bitrate from " + integer + " to " + intValue);
                    }
                }
                this.f136283g = g0Var;
            }
            m0.p(this.f136277a, "mInputTimebase = " + c13);
            m0.p(this.f136277a, "mMediaFormat = " + a13);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.f136285i = g0.m.f(com.bumptech.glide.d.L(new w0(atomicReference, 3)));
                r4.i iVar = (r4.i) atomicReference.get();
                iVar.getClass();
                this.f136286j = iVar;
                i(y.CONFIGURED);
            } catch (MediaCodec.CodecException e13) {
                throw new InvalidConfigException(e13);
            }
        } catch (IOException | IllegalArgumentException e14) {
            throw new InvalidConfigException(e14);
        }
    }

    public final com.google.common.util.concurrent.c0 a() {
        switch (this.f136296t.ordinal()) {
            case 0:
                return new g0.n(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                r4.l L = com.bumptech.glide.d.L(new w0(atomicReference, 4));
                r4.i iVar = (r4.i) atomicReference.get();
                iVar.getClass();
                this.f136288l.offer(iVar);
                iVar.a(new l0.e(18, this, iVar), this.f136284h);
                c();
                return L;
            case 7:
                return new g0.n(new IllegalStateException("Encoder is in error state."));
            case 8:
                return new g0.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f136296t);
        }
    }

    public final void b(int i13, String str, Throwable th3) {
        switch (this.f136296t.ordinal()) {
            case 0:
                d(i13, str, th3);
                h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(y.ERROR);
                l(new r(this, i13, str, th3, 0));
                break;
            case 7:
                m0.Y0(this.f136277a, "Get more than one error: " + str + "(" + i13 + ")", th3);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.f136288l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f136287k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            r4.i iVar = (r4.i) arrayDeque.poll();
            Objects.requireNonNull(iVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                d0 d0Var = new d0(this.f136281e, num.intValue());
                if (iVar.b(d0Var)) {
                    this.f136289m.add(d0Var);
                    g0.m.f(d0Var.f136315d).d(new l0.e(16, this, d0Var), this.f136284h);
                } else {
                    d0Var.a();
                }
            } catch (MediaCodec.CodecException e13) {
                b(1, e13.getMessage(), e13);
                return;
            }
        }
    }

    public final void d(int i13, String str, Throwable th3) {
        n nVar;
        Executor executor;
        synchronized (this.f136278b) {
            nVar = this.f136294r;
            executor = this.f136295s;
        }
        try {
            executor.execute(new r(nVar, i13, str, th3, 1));
        } catch (RejectedExecutionException e13) {
            m0.t(this.f136277a, "Unable to post to the supplied executor.", e13);
        }
    }

    public final void e() {
        this.f136293q.getClass();
        this.f136284h.execute(new p(this, d0.o.j(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.A) {
            this.f136281e.stop();
            this.A = false;
        }
        this.f136281e.release();
        k kVar = this.f136282f;
        if (kVar instanceof b0) {
            b0 b0Var = (b0) kVar;
            synchronized (b0Var.f136265a) {
                surface = b0Var.f136266b;
                b0Var.f136266b = null;
                hashSet = new HashSet(b0Var.f136267c);
                b0Var.f136267c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(y.RELEASED);
        this.f136286j.b(null);
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f136281e.setParameters(bundle);
    }

    public final void h() {
        l lVar;
        Executor executor;
        this.f136297u = E;
        this.f136298v = 0L;
        this.f136291o.clear();
        this.f136287k.clear();
        Iterator it = this.f136288l.iterator();
        while (it.hasNext()) {
            ((r4.i) it.next()).c();
        }
        this.f136288l.clear();
        this.f136281e.reset();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f136299w = false;
        ScheduledFuture scheduledFuture = this.f136301y;
        Surface surface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f136301y = null;
        }
        Future future = this.D;
        if (future != null) {
            future.cancel(false);
            this.D = null;
        }
        a0 a0Var = this.f136302z;
        if (a0Var != null) {
            a0Var.f136257j = true;
        }
        a0 a0Var2 = new a0(this);
        this.f136302z = a0Var2;
        this.f136281e.setCallback(a0Var2);
        this.f136281e.configure(this.f136280d, (Surface) null, (MediaCrypto) null, 1);
        k kVar = this.f136282f;
        if (kVar instanceof b0) {
            b0 b0Var = (b0) kVar;
            b0Var.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) w0.a.f126951a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (b0Var.f136265a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (b0Var.f136266b == null) {
                            surface = MediaCodec.createPersistentInputSurface();
                            b0Var.f136266b = surface;
                        }
                        b0Var.f136270f.f136281e.setInputSurface(b0Var.f136266b);
                    } else {
                        Surface surface2 = b0Var.f136266b;
                        if (surface2 != null) {
                            b0Var.f136267c.add(surface2);
                        }
                        surface = b0Var.f136270f.f136281e.createInputSurface();
                        b0Var.f136266b = surface;
                    }
                    lVar = b0Var.f136268d;
                    executor = b0Var.f136269e;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (surface == null || lVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new l0.e(26, lVar, surface));
            } catch (RejectedExecutionException e13) {
                m0.t(b0Var.f136270f.f136277a, "Unable to post to the supplied executor.", e13);
            }
        }
    }

    public final void i(y yVar) {
        if (this.f136296t == yVar) {
            return;
        }
        m0.p(this.f136277a, "Transitioning encoder internal state: " + this.f136296t + " --> " + yVar);
        this.f136296t = yVar;
    }

    public final void j() {
        m0.p(this.f136277a, "signalCodecStop");
        k kVar = this.f136282f;
        if (kVar instanceof x) {
            ((x) kVar).b(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f136289m.iterator();
            while (it.hasNext()) {
                arrayList.add(g0.m.f(((d0) it.next()).f136315d));
            }
            g0.m.i(arrayList).d(new q(this, 2), this.f136284h);
            return;
        }
        if (kVar instanceof b0) {
            try {
                if (w0.a.f126951a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    a0 a0Var = this.f136302z;
                    f0.j jVar = this.f136284h;
                    Future future = this.D;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.D = l3.c.H0().schedule(new l0.e(17, jVar, a0Var), 1000L, TimeUnit.MILLISECONDS);
                }
                this.f136281e.signalEndOfInputStream();
                this.C = true;
            } catch (MediaCodec.CodecException e13) {
                b(1, e13.getMessage(), e13);
            }
        }
    }

    public final void k() {
        this.f136293q.getClass();
        this.f136284h.execute(new p(this, d0.o.j(), 1));
    }

    public final void l(Runnable runnable) {
        String str = this.f136277a;
        m0.p(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f136290n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.m.f(((i) it.next()).f136346e));
        }
        HashSet hashSet2 = this.f136289m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(g0.m.f(((d0) it2.next()).f136315d));
        }
        if (!arrayList.isEmpty()) {
            m0.p(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        g0.m.i(arrayList).d(new a4(this, arrayList, runnable, 16), this.f136284h);
    }
}
