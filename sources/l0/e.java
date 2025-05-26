package l0;

import a.o3;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.t1;
import androidx.camera.core.impl.z0;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import c0.f1;
import c0.p1;
import com.google.android.gms.internal.measurement.q4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;
import r0.a1;
import r0.b1;
import r0.h0;
import r0.i1;
import r0.j0;
import r0.q0;
import r0.v0;
import y0.a0;
import y0.c0;
import y0.d0;
import y0.x;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81210c;

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f81208a = i13;
        this.f81209b = obj;
        this.f81210c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        c0 c0Var;
        y0.n nVar;
        Executor executor;
        int i13 = 2;
        int i14 = 1;
        switch (this.f81208a) {
            case 0:
                i iVar = (i) this.f81209b;
                f1 f1Var = (f1) this.f81210c;
                f0.g gVar = iVar.f81223c;
                h0.d dVar = new h0.d(i14, iVar, f1Var);
                t tVar = (t) f1Var;
                Surface c13 = tVar.c(gVar, dVar);
                iVar.f81221a.g(c13);
                iVar.f81228h.put(tVar, c13);
                return;
            case 1:
                i iVar2 = (i) this.f81209b;
                p1 p1Var = (p1) this.f81210c;
                iVar2.f81229i++;
                l lVar = iVar2.f81221a;
                n0.j.d(lVar.f81237a, true);
                n0.j.c(lVar.f81239c);
                SurfaceTexture surfaceTexture = new SurfaceTexture(lVar.f81249m);
                surfaceTexture.setDefaultBufferSize(p1Var.f24300b.getWidth(), p1Var.f24300b.getHeight());
                Surface surface = new Surface(surfaceTexture);
                f0.g gVar2 = iVar2.f81223c;
                p1Var.c(gVar2, new o3(9, iVar2, p1Var));
                p1Var.b(surface, gVar2, new g(iVar2, p1Var, surfaceTexture, surface, 0));
                surfaceTexture.setOnFrameAvailableListener(iVar2, iVar2.f81224d);
                return;
            case 2:
                ((i) this.f81209b).f81231k.add((a) this.f81210c);
                return;
            case 3:
                t tVar2 = (t) this.f81209b;
                AtomicReference atomicReference = (AtomicReference) this.f81210c;
                tVar2.getClass();
                ((p5.a) atomicReference.get()).accept(new c0.i(tVar2));
                return;
            case 4:
                final m0.e eVar = (m0.e) this.f81209b;
                p1 p1Var2 = (p1) this.f81210c;
                eVar.f85264e++;
                boolean z13 = p1Var2.f24304f;
                m0.c cVar = eVar.f85260a;
                n0.j.d(cVar.f81237a, true);
                n0.j.c(cVar.f81239c);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z13 ? cVar.f85253n : cVar.f85254o);
                Size size = p1Var2.f24300b;
                surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                p1Var2.b(surface2, eVar.f85262c, new p5.a() { // from class: m0.d
                    @Override // p5.a
                    public final void accept(Object obj) {
                        e eVar2 = e.this;
                        eVar2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        eVar2.f85264e--;
                        eVar2.e();
                    }
                });
                if (p1Var2.f24304f) {
                    eVar.f85268i = surfaceTexture2;
                    return;
                } else {
                    eVar.f85269j = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(eVar, eVar.f85263d);
                    return;
                }
            case 5:
                m0.e eVar2 = (m0.e) this.f81209b;
                f1 f1Var2 = (f1) this.f81210c;
                f0.g gVar3 = eVar2.f85262c;
                h0.d dVar2 = new h0.d(i13, eVar2, f1Var2);
                t tVar3 = (t) f1Var2;
                Surface c14 = tVar3.c(gVar3, dVar2);
                eVar2.f85260a.g(c14);
                eVar2.f85267h.put(tVar3, c14);
                return;
            case 6:
                Executor executor2 = (Executor) this.f81209b;
                Runnable runnable = (Runnable) this.f81210c;
                Set set = j0.f105545f0;
                executor2.execute(runnable);
                return;
            case 7:
                j0 j0Var = (j0) this.f81209b;
                b1 b1Var = (b1) this.f81210c;
                b1 b1Var2 = j0Var.Y;
                j0Var.Y = b1Var;
                if (b1Var2 == b1Var) {
                    m0.p("Recorder", "Video source transitions to the same state: " + b1Var);
                    return;
                }
                m0.p("Recorder", "Video source has transitioned to state: " + b1Var);
                if (b1Var != b1.INACTIVE) {
                    if (b1Var != b1.ACTIVE_NON_STREAMING || (scheduledFuture = j0Var.Z) == null || !scheduledFuture.cancel(false) || (c0Var = j0Var.E) == null) {
                        return;
                    }
                    j0.r(c0Var);
                    return;
                }
                if (j0Var.A != null) {
                    j0Var.f105556a0 = true;
                    r0.i iVar3 = j0Var.f105575p;
                    if (iVar3 == null || iVar3.f105539l) {
                        return;
                    }
                    j0Var.s(iVar3, 4, null);
                    return;
                }
                h0 h0Var = j0Var.f105564e0;
                if (h0Var != null) {
                    if (!h0Var.f105524d) {
                        h0Var.f105524d = true;
                        ScheduledFuture scheduledFuture2 = h0Var.f105526f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            h0Var.f105526f = null;
                        }
                    }
                    j0Var.f105564e0 = null;
                }
                j0Var.u(false);
                return;
            case 8:
                ((r0.i) this.f81209b).f105537j.accept((i1) this.f81210c);
                return;
            case 9:
                v0 v0Var = (v0) this.f81209b;
                if (((z0) this.f81210c) == v0Var.f105658o) {
                    v0Var.E();
                    return;
                }
                return;
            case 10:
                q0 q0Var = (q0) this.f81209b;
                i2 i2Var = (i2) this.f81210c;
                q0Var.getClass();
                ((List) i2Var.f16863b.f123389f).remove(q0Var);
                i2Var.f16866e.remove(q0Var);
                return;
            case 11:
                ((a1) this.f81209b).f105485h.a((Surface) this.f81210c);
                return;
            case 12:
                u0.e eVar3 = (u0.e) this.f81209b;
                y0.j jVar = (y0.j) this.f81210c;
                int ordinal = eVar3.f119738g.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                } else {
                    if (eVar3.f119743l != jVar) {
                        eVar3.b(jVar);
                        return;
                    }
                    return;
                }
            case 13:
                u0.e eVar4 = (u0.e) this.f81209b;
                r4.i iVar4 = (r4.i) this.f81210c;
                eVar4.getClass();
                try {
                    int ordinal2 = eVar4.f119738g.ordinal();
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        eVar4.b(null);
                        eVar4.f119736e.a();
                        eVar4.f119735d.a();
                        eVar4.e();
                        eVar4.d(u0.d.RELEASED);
                    }
                    iVar4.b(null);
                    return;
                } catch (Throwable th3) {
                    iVar4.d(th3);
                    return;
                }
            case 14:
                ((j0) ((q4) this.f81210c).f31595c).f105562d0 = ((u0.e) this.f81209b).f119751t;
                return;
            case 15:
                q4 q4Var = (q4) this.f81209b;
                Throwable th4 = (Throwable) this.f81210c;
                q4Var.getClass();
                m0.t("Recorder", "Error occurred after audio source started.", th4);
                if (th4 instanceof AudioSourceAccessException) {
                    ((p5.a) q4Var.f31594b).accept(th4);
                    return;
                }
                return;
            case 16:
                ((c0) this.f81209b).f136289m.remove((d0) this.f81210c);
                return;
            case 17:
                Executor executor3 = (Executor) this.f81209b;
                a0 a0Var = (a0) this.f81210c;
                Range range = c0.E;
                Objects.requireNonNull(a0Var);
                executor3.execute(new u0.n(a0Var, i14));
                return;
            case 18:
                ((c0) this.f81209b).f136288l.remove((r4.i) this.f81210c);
                return;
            case 19:
                ((t1) ((Map.Entry) this.f81209b).getKey()).a((t0.b) this.f81210c);
                return;
            case 20:
                x xVar = (x) this.f81209b;
                t1 t1Var = (t1) this.f81210c;
                LinkedHashMap linkedHashMap = xVar.f136373a;
                t1Var.getClass();
                linkedHashMap.remove(t1Var);
                return;
            case 21:
                ((t1) this.f81209b).a((t0.b) this.f81210c);
                return;
            case 22:
                a0 a0Var2 = (a0) this.f81209b;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f81210c;
                c0 c0Var2 = a0Var2.f136258k;
                switch (c0Var2.f136296t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0Var2.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + c0Var2.f136296t);
                }
            case 23:
                a0 a0Var3 = (a0) this.f81209b;
                MediaFormat mediaFormat = (MediaFormat) this.f81210c;
                if (a0Var3.f136257j) {
                    m0.X0(a0Var3.f136258k.f136277a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (a0Var3.f136258k.f136296t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (a0Var3.f136258k.f136278b) {
                            c0 c0Var3 = a0Var3.f136258k;
                            nVar = c0Var3.f136294r;
                            executor = c0Var3.f136295s;
                        }
                        try {
                            executor.execute(new e(24, nVar, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e13) {
                            m0.t(a0Var3.f136258k.f136277a, "Unable to post to the supplied executor.", e13);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + a0Var3.f136258k.f136296t);
                }
            case 24:
                y0.n nVar2 = (y0.n) this.f81209b;
                MediaFormat mediaFormat2 = (MediaFormat) this.f81210c;
                int i15 = a0.f136247l;
                nVar2.m(new a.z0(mediaFormat2, 18));
                return;
            case 25:
                y0.n nVar3 = (y0.n) this.f81209b;
                y0.i iVar5 = (y0.i) this.f81210c;
                int i16 = a0.f136247l;
                nVar3.q(iVar5);
                return;
            case 26:
                ((y0.l) this.f81209b).a((Surface) this.f81210c);
                return;
            case 27:
                ((b1.i) this.f81209b).f20809a.f17050l.c((p1) this.f81210c);
                return;
            default:
                b1.v vVar = (b1.v) this.f81209b;
                p1 p1Var3 = (p1) this.f81210c;
                p1 p1Var4 = vVar.f20835h;
                if (p1Var4 != null && p1Var4 == p1Var3) {
                    vVar.f20835h = null;
                    vVar.f20834g = null;
                }
                d dVar3 = vVar.f20839l;
                if (dVar3 != null) {
                    dVar3.b();
                    vVar.f20839l = null;
                    return;
                }
                return;
        }
    }
}
