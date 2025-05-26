package v;

import a.ig;
import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v1 extends CameraDevice.StateCallback {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f123694c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123695a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123696b;

    public v1(ArrayList arrayList) {
        this.f123695a = 1;
        this.f123696b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof l1)) {
                ((List) this.f123696b).add(stateCallback);
            }
        }
    }

    public final void a() {
        ArrayList d2;
        synchronized (((w1) this.f123696b).f123717b) {
            d2 = ((w1) this.f123696b).d();
            ((Set) ((w1) this.f123696b).f123720e).clear();
            ((Set) ((w1) this.f123696b).f123718c).clear();
            ((Set) ((w1) this.f123696b).f123719d).clear();
        }
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            w2 w2Var = (w2) ((v2) it.next());
            synchronized (w2Var.f123697a) {
                try {
                    List list = w2Var.f123707k;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((androidx.camera.core.impl.z0) it2.next()).b();
                        }
                        w2Var.f123707k = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            w2Var.f123728u.i();
        }
    }

    public final void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((w1) this.f123696b).f123717b) {
            linkedHashSet.addAll((Set) ((w1) this.f123696b).f123720e);
            linkedHashSet.addAll((Set) ((w1) this.f123696b).f123718c);
        }
        ((w1) this.f123696b).f123716a.execute(new ig(linkedHashSet, 11));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f123695a) {
            case 0:
                b();
                a();
                break;
            default:
                Iterator it = ((List) this.f123696b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f123695a) {
            case 0:
                b();
                a();
                break;
            default:
                Iterator it = ((List) this.f123696b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i13) {
        switch (this.f123695a) {
            case 0:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((w1) this.f123696b).f123717b) {
                    linkedHashSet.addAll((Set) ((w1) this.f123696b).f123720e);
                    linkedHashSet.addAll((Set) ((w1) this.f123696b).f123718c);
                }
                ((w1) this.f123696b).f123716a.execute(new k(linkedHashSet, i13, 1));
                a();
                return;
            default:
                Iterator it = ((List) this.f123696b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i13);
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f123695a) {
            case 0:
                break;
            default:
                Iterator it = ((List) this.f123696b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public v1(w1 w1Var) {
        this.f123695a = 0;
        this.f123696b = w1Var;
    }
}
