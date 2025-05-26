package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public final h f126929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126930c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f126928a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public y f126931d = null;

    public l(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f126929b = new k(cameraCharacteristics);
        } else {
            this.f126929b = new h(cameraCharacteristics);
        }
        this.f126930c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f126929b.f126926a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f126928a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f126929b.f126926a).get(key);
                if (obj2 != null) {
                    this.f126928a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final y b() {
        if (this.f126931d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f126931d = new y(streamConfigurationMap, new androidx.appcompat.app.d(this.f126930c));
            } catch (AssertionError | NullPointerException e13) {
                throw new IllegalArgumentException(e13.getMessage());
            }
        }
        return this.f126931d;
    }
}
