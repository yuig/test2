package pe;

import a.o3;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public o3 f99926a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            o3 o3Var = this.f99926a;
            if (o3Var == null) {
                return;
            }
            float[] fArr = event.values;
            double d2 = fArr[0] / 9.80665f;
            double d13 = fArr[1] / 9.80665f;
            double d14 = fArr[2] / 9.80665f;
            if (Math.sqrt((d14 * d14) + (d13 * d13) + (d2 * d2)) > 2.3d) {
                o3Var.d();
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
