package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import m7.i0;
import o8.d;
import o8.i;
import o8.j;
import o8.k;
import u0.n;

/* loaded from: classes3.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f18857l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f18858a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f18859b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f18860c;

    /* renamed from: d, reason: collision with root package name */
    public final d f18861d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f18862e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18863f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceTexture f18864g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f18865h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18866i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18868k;

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public final void a(i0 i0Var) {
        this.f18858a.add(i0Var);
    }

    public final i b() {
        return this.f18863f;
    }

    public final i c() {
        return this.f18863f;
    }

    public final Surface d() {
        return this.f18865h;
    }

    public final void e() {
        boolean z13 = this.f18866i && this.f18867j;
        Sensor sensor = this.f18860c;
        if (sensor == null || z13 == this.f18868k) {
            return;
        }
        d dVar = this.f18861d;
        SensorManager sensorManager = this.f18859b;
        if (z13) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f18868k = z13;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18862e.post(new n(this, 21));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f18867j = false;
        e();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f18867j = true;
        e();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18858a = new CopyOnWriteArrayList();
        this.f18862e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f18859b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f18860c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f18863f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener kVar = new k(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f18861d = new d(windowManager.getDefaultDisplay(), kVar, jVar);
        this.f18866i = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(kVar);
    }
}
