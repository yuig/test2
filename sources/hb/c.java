package hb;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        int a13 = a(sidecarDeviceState);
        if (a13 < 0 || a13 > 4) {
            return 0;
        }
        return a13;
    }

    public static List c(SidecarWindowLayoutInfo info2) {
        Intrinsics.checkNotNullParameter(info2, "info");
        try {
            try {
                List list = info2.displayFeatures;
                return list == null ? f0.g() : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return f0.g();
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info2, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i13) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                sidecarDeviceState.posture = i13;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i13));
        }
    }
}
