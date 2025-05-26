package o8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import s7.z;

/* loaded from: classes3.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f93422a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f93423b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f93424c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f93425d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f93426e;

    /* renamed from: f, reason: collision with root package name */
    public final c[] f93427f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93428g;

    public d(Display display, c... cVarArr) {
        this.f93426e = display;
        this.f93427f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i13;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f93422a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f93426e.getRotation();
        float[] fArr3 = this.f93423b;
        if (rotation != 0) {
            int i14 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS;
            if (rotation != 1) {
                i13 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i14 = 130;
                    i13 = 1;
                }
            } else {
                i13 = 129;
                i14 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i14, i13, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, fArr3);
        float[] fArr4 = this.f93425d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f13 = fArr4[2];
        Matrix.rotateM(this.f93422a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z13 = this.f93428g;
        float[] fArr5 = this.f93422a;
        if (!z13) {
            z.b(this.f93424c, fArr5);
            this.f93428g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f93423b, 0, this.f93424c, 0);
        for (c cVar : this.f93427f) {
            cVar.a(f13, fArr2);
        }
    }
}
