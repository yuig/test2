package ads_mobile_sdk;

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
public final class sh0 extends g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11093a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f11094b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f11095c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f11096d;

    /* renamed from: e, reason: collision with root package name */
    public SensorManager f11097e;

    /* renamed from: f, reason: collision with root package name */
    public Sensor f11098f;

    /* renamed from: g, reason: collision with root package name */
    public float f11099g;

    /* renamed from: h, reason: collision with root package name */
    public float f11100h;

    /* renamed from: i, reason: collision with root package name */
    public long f11101i;

    /* renamed from: j, reason: collision with root package name */
    public int f11102j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11103k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11104l;

    /* renamed from: m, reason: collision with root package name */
    public a.oa f11105m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11106n;

    public sh0(Context context, oh0 flags, zb clock, j0 backgroundScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f11093a = context;
        this.f11094b = flags;
        this.f11095c = clock;
        this.f11096d = backgroundScope;
        zn2.a aVar = zn2.b.f142311b;
        clock.getClass();
        this.f11101i = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f11106n) {
                    SensorManager sensorManager = this.f11097e;
                    if (sensorManager == null) {
                        Intrinsics.r("sensorManager");
                        throw null;
                    }
                    Sensor sensor = this.f11098f;
                    if (sensor == null) {
                        Intrinsics.r("gyroscope");
                        throw null;
                    }
                    sensorManager.unregisterListener(this, sensor);
                    this.f11106n = false;
                    gk0.c("Stopped listening for flick gestures.", null);
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
                if (((Boolean) this.f11094b.a("gads:inspector:flick_enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
                    SensorManager sensorManager = (SensorManager) this.f11093a.getSystemService(SensorManager.class);
                    Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
                    if (!this.f11106n && sensorManager != null && defaultSensor != null) {
                        this.f11097e = sensorManager;
                        this.f11098f = defaultSensor;
                        oh0 oh0Var = this.f11094b;
                        oh0Var.getClass();
                        zn2.a aVar = zn2.b.f142311b;
                        sensorManager.registerListener(this, defaultSensor, 3, ((int) zn2.b.n(oh0Var.a(dl2.b.P2(3000, zn2.d.MILLISECONDS), "gads:inspector:flick_reset_time_ms"), zn2.d.MICROSECONDS)) / 100);
                        this.f11106n = true;
                        gk0.c("Listening for flick gestures.", null);
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
        if (((Boolean) this.f11094b.a("gads:inspector:flick_enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
            zn2.a aVar = zn2.b.f142311b;
            this.f11095c.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zn2.d dVar = zn2.d.MILLISECONDS;
            long Q2 = dl2.b.Q2(elapsedRealtime, dVar);
            long j13 = this.f11101i;
            oh0 oh0Var = this.f11094b;
            oh0Var.getClass();
            if (zn2.b.c(Q2, zn2.b.k(j13, oh0Var.a(dl2.b.P2(3000, dVar), "gads:inspector:flick_reset_time_ms"))) > 0) {
                this.f11102j = 0;
                this.f11101i = Q2;
                this.f11103k = false;
                this.f11104l = false;
                this.f11099g = this.f11100h;
            }
            float f13 = this.f11100h + (event.values[1] * 4);
            this.f11100h = f13;
            float f14 = this.f11099g;
            oh0 oh0Var2 = this.f11094b;
            Float valueOf = Float.valueOf(45.0f);
            zg0 zg0Var = oh0.f9284h;
            if (f13 > ((Number) oh0Var2.a("gads:inspector:flick_rotation_threshold", valueOf, zg0Var)).floatValue() + f14) {
                this.f11099g = this.f11100h;
                this.f11104l = true;
            } else if (this.f11100h < this.f11099g - ((Number) this.f11094b.a("gads:inspector:flick_rotation_threshold", Float.valueOf(45.0f), zg0Var)).floatValue()) {
                this.f11099g = this.f11100h;
                this.f11103k = true;
            }
            if (Float.isInfinite(this.f11100h)) {
                this.f11100h = 0.0f;
                this.f11099g = 0.0f;
            }
            if (this.f11103k && this.f11104l) {
                gk0.c("Flick detected.", null);
                this.f11101i = Q2;
                this.f11102j++;
                this.f11103k = false;
                this.f11104l = false;
                j0 j0Var = this.f11096d;
                rh0 block = new rh0(this, null);
                kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
            }
        }
    }
}
