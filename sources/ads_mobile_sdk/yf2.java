package ads_mobile_sdk;

import a.af;
import a.g4;
import a.zb;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yf2 extends g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f14223b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f14224c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f14225d;

    /* renamed from: e, reason: collision with root package name */
    public SensorManager f14226e;

    /* renamed from: f, reason: collision with root package name */
    public Sensor f14227f;

    /* renamed from: g, reason: collision with root package name */
    public long f14228g;

    /* renamed from: h, reason: collision with root package name */
    public int f14229h;

    /* renamed from: i, reason: collision with root package name */
    public af f14230i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14231j;

    public yf2(Context context, oh0 flags, zb clock, j0 backgroundScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f14222a = context;
        this.f14223b = flags;
        this.f14224c = clock;
        this.f14225d = backgroundScope;
        zn2.a aVar = zn2.b.f142311b;
        this.f14228g = dl2.b.P2(0, zn2.d.MILLISECONDS);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f14231j) {
                    SensorManager sensorManager = this.f14226e;
                    if (sensorManager == null) {
                        Intrinsics.r("sensorManager");
                        throw null;
                    }
                    Sensor sensor = this.f14227f;
                    if (sensor == null) {
                        Intrinsics.r("accelerometer");
                        throw null;
                    }
                    sensorManager.unregisterListener(this, sensor);
                    gk0.c("Stopped listening for shake gestures.", null);
                    this.f14231j = false;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (((Boolean) this.f14223b.a("gads:inspector:shake_enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
                    SensorManager sensorManager = (SensorManager) this.f14222a.getSystemService(SensorManager.class);
                    Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
                    if (!this.f14231j && sensorManager != null && defaultSensor != null) {
                        this.f14226e = sensorManager;
                        this.f14227f = defaultSensor;
                        oh0 oh0Var = this.f14223b;
                        oh0Var.getClass();
                        zn2.a aVar = zn2.b.f142311b;
                        zn2.d dVar = zn2.d.MILLISECONDS;
                        sensorManager.registerListener(this, defaultSensor, 3, ((int) zn2.b.n(oh0Var.a(dl2.b.P2(500, dVar), "gads:inspector:shake_interval"), zn2.d.MICROSECONDS)) / 10);
                        this.f14224c.getClass();
                        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), dVar);
                        oh0 oh0Var2 = this.f14223b;
                        oh0Var2.getClass();
                        this.f14228g = zn2.b.j(Q2, oh0Var2.a(dl2.b.P2(500, dVar), "gads:inspector:shake_interval"));
                        this.f14231j = true;
                        gk0.c("Listening for shake gestures.", null);
                    }
                    Unit unit = Unit.f80348a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // a.g4
    public final void a(Sensor sensor) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // a.g4
    public final void a(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (((Boolean) this.f14223b.a("gads:inspector:shake_enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
            float[] fArr = event.values;
            float f13 = fArr[0] / 9.80665f;
            float f14 = fArr[1] / 9.80665f;
            float f15 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13))) < ((Number) this.f14223b.a("gads:inspector:shake_strength", Float.valueOf(2.0f), oh0.f9284h)).floatValue()) {
                return;
            }
            zn2.a aVar = zn2.b.f142311b;
            this.f14224c.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zn2.d dVar = zn2.d.MILLISECONDS;
            long Q2 = dl2.b.Q2(elapsedRealtime, dVar);
            long j13 = this.f14228g;
            oh0 oh0Var = this.f14223b;
            oh0Var.getClass();
            if (zn2.b.c(Q2, zn2.b.k(j13, oh0Var.a(dl2.b.P2(500, dVar), "gads:inspector:shake_interval"))) < 0) {
                return;
            }
            long j14 = this.f14228g;
            oh0 oh0Var2 = this.f14223b;
            oh0Var2.getClass();
            if (zn2.b.c(Q2, zn2.b.k(j14, oh0Var2.a(dl2.b.P2(3000, dVar), "gads:inspector:shake_reset_time_ms"))) > 0) {
                this.f14229h = 0;
            }
            gk0.c("Shake detected.", null);
            this.f14228g = Q2;
            this.f14229h++;
            j0 j0Var = this.f14225d;
            xf2 block = new xf2(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
    }
}
