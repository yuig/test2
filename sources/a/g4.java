package a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes2.dex */
public abstract class g4 implements SensorEventListener {
    public abstract void a(Sensor sensor);

    public abstract void a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        a(sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
