package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import hb.h;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f19988b;

    /* renamed from: d, reason: collision with root package name */
    public final h f19990d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f19991e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19987a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f19989c = new WeakHashMap();

    public DistinctElementSidecarCallback(h hVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f19990d = hVar;
        this.f19991e = sidecarCallback;
    }

    public void onDeviceStateChanged(@NonNull SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f19987a) {
            try {
                h hVar = this.f19990d;
                SidecarDeviceState sidecarDeviceState2 = this.f19988b;
                hVar.getClass();
                if (h.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f19988b = sidecarDeviceState;
                this.f19991e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void onWindowLayoutChanged(@NonNull IBinder iBinder, @NonNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f19987a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f19989c.get(iBinder);
                this.f19990d.getClass();
                if (h.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f19989c.put(iBinder, sidecarWindowLayoutInfo);
                this.f19991e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
