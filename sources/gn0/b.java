package gn0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.pinterest.feature.boardpreview.export.render.RendererException;
import dn0.g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f65802a;

    /* renamed from: b, reason: collision with root package name */
    public final g f65803b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceTexture f65804c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f65805d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f65806e;

    /* renamed from: f, reason: collision with root package name */
    public final Condition f65807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65808g;

    public b() {
        g gVar = new g(36197);
        this.f65803b = gVar;
        SurfaceTexture surfaceTexture = new SurfaceTexture(gVar.f55618c);
        this.f65804c = surfaceTexture;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f65806e = reentrantLock;
        this.f65807f = reentrantLock.newCondition();
        HandlerThread handlerThread = new HandlerThread("InSurface");
        handlerThread.start();
        this.f65802a = handlerThread;
        surfaceTexture.setOnFrameAvailableListener(this, new Handler(handlerThread.getLooper()));
        this.f65805d = new Surface(surfaceTexture);
    }

    public static void a(b bVar) {
        ReentrantLock reentrantLock = bVar.f65806e;
        reentrantLock.lock();
        while (!bVar.f65808g) {
            try {
                try {
                    bVar.f65807f.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
        bVar.f65808g = false;
        Unit unit = Unit.f80348a;
        reentrantLock.unlock();
        bVar.f65804c.updateTexImage();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ReentrantLock reentrantLock = this.f65806e;
        reentrantLock.lock();
        try {
            if (this.f65808g) {
                Intrinsics.checkNotNullParameter("frameAvailable already set, frame could be dropped", "message");
                throw new RendererException("frameAvailable already set, frame could be dropped");
            }
            this.f65808g = true;
            this.f65807f.signalAll();
            Unit unit = Unit.f80348a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
