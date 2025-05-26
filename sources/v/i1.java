package v;

import a.jg;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class i1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f123508d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123509a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123510b;

    /* renamed from: c, reason: collision with root package name */
    public Object f123511c;

    public i1() {
        this.f123509a = 0;
        this.f123511c = null;
        this.f123510b = new HashMap();
    }

    public final void a(CaptureRequest captureRequest, List list) {
        Object obj = this.f123510b;
        List list2 = (List) ((Map) obj).get(captureRequest);
        if (list2 == null) {
            ((Map) obj).put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        ((Map) obj).put(captureRequest, arrayList);
    }

    public final List b(CaptureRequest captureRequest) {
        List list = (List) ((Map) this.f123510b).get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
        switch (this.f123509a) {
            case 0:
                Iterator it = b(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f123509a) {
            case 0:
                Iterator it = b(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            default:
                ((Executor) this.f123511c).execute(new jg(4, this, totalCaptureResult));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f123509a) {
            case 0:
                Iterator it = b(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f123509a) {
            case 0:
                Iterator it = b(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
        switch (this.f123509a) {
            case 0:
                Iterator it = ((Map) this.f123510b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i13);
                    }
                }
                o1 o1Var = (o1) this.f123511c;
                if (o1Var != null) {
                    o1Var.a();
                    break;
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
        switch (this.f123509a) {
            case 0:
                Iterator it = ((Map) this.f123510b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                    }
                }
                o1 o1Var = (o1) this.f123511c;
                if (o1Var != null) {
                    o1Var.a();
                    break;
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
        switch (this.f123509a) {
            case 0:
                Iterator it = b(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                }
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                break;
        }
    }

    public i1(f0.j jVar) {
        this.f123509a = 1;
        this.f123510b = new HashSet();
        this.f123511c = jVar;
    }
}
