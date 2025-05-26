package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f16754b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: a, reason: collision with root package name */
    public final int f16755a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f16755a = 10001;
        if (f16754b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public static CameraAccessExceptionCompat a(CameraAccessException cameraAccessException) {
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f16755a = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f16755a = 10002;
        if (f16754b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
