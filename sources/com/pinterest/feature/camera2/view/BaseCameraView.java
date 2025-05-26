package com.pinterest.feature.camera2.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Size;
import b1.u;
import dp0.a;
import dp0.c;
import ep0.f;
import java.util.concurrent.Semaphore;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m81.d;
import org.jetbrains.annotations.NotNull;
import v.j2;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/camera2/view/BaseCameraView;", "Ldp0/c;", "CallbackHandler", "Lcom/pinterest/feature/camera2/view/AspectRatioTextureView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lp2/b", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseCameraView<CallbackHandler extends c> extends AspectRatioTextureView {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f45419p = 0;

    /* renamed from: c, reason: collision with root package name */
    public final j2 f45420c;

    /* renamed from: d, reason: collision with root package name */
    public c f45421d;

    /* renamed from: e, reason: collision with root package name */
    public int f45422e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45423f;

    /* renamed from: g, reason: collision with root package name */
    public int f45424g;

    /* renamed from: h, reason: collision with root package name */
    public CameraCaptureSession f45425h;

    /* renamed from: i, reason: collision with root package name */
    public Size f45426i;

    /* renamed from: j, reason: collision with root package name */
    public HandlerThread f45427j;

    /* renamed from: k, reason: collision with root package name */
    public Handler f45428k;

    /* renamed from: l, reason: collision with root package name */
    public final Semaphore f45429l;

    /* renamed from: m, reason: collision with root package name */
    public String f45430m;

    /* renamed from: n, reason: collision with root package name */
    public CameraManager f45431n;

    /* renamed from: o, reason: collision with root package name */
    public final u f45432o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r13.compare(r8, r6) != 1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Size a(android.util.Size[] r17, int r18, int r19, int r20, int r21, android.util.Size r22) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r22.getWidth()
            int r2 = r22.getHeight()
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        Lf:
            if (r7 >= r3) goto L7e
            r8 = r0[r7]
            int r9 = r8.getWidth()
            r10 = r20
            if (r9 > r10) goto L73
            int r9 = r8.getHeight()
            r11 = r21
            if (r9 > r11) goto L6c
            int r9 = r8.getWidth()
            int r12 = r8.getHeight()
            float r9 = (float) r9
            float r12 = (float) r12
            float r9 = r9 / r12
            float r12 = (float) r1
            float r13 = (float) r2
            float r12 = r12 / r13
            float r9 = r9 - r12
            float r9 = java.lang.Math.abs(r9)
            double r12 = (double) r9
            r14 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 > 0) goto L6c
            int r9 = r8.getWidth()
            r12 = r16
            v.j2 r13 = r12.f45420c
            r14 = r18
            if (r9 < r14) goto L5f
            int r9 = r8.getHeight()
            r15 = r19
            if (r9 < r15) goto L61
            if (r4 == 0) goto L5d
            int r9 = r13.compare(r8, r4)
            r13 = -1
            if (r9 != r13) goto L7b
        L5d:
            r4 = r8
            goto L7b
        L5f:
            r15 = r19
        L61:
            if (r6 == 0) goto L6a
            int r9 = r13.compare(r8, r6)
            r13 = 1
            if (r9 != r13) goto L7b
        L6a:
            r6 = r8
            goto L7b
        L6c:
            r12 = r16
            r14 = r18
            r15 = r19
            goto L7b
        L73:
            r12 = r16
            r14 = r18
            r15 = r19
            r11 = r21
        L7b:
            int r7 = r7 + 1
            goto Lf
        L7e:
            r12 = r16
            if (r4 != 0) goto L88
            if (r6 != 0) goto L87
            r4 = r0[r5]
            goto L88
        L87:
            r4 = r6
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.camera2.view.BaseCameraView.a(android.util.Size[], int, int, int, int, android.util.Size):android.util.Size");
    }

    public final void b() {
        Semaphore semaphore = this.f45429l;
        try {
            try {
                semaphore.acquire();
                CameraCaptureSession cameraCaptureSession = this.f45425h;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                }
                this.f45425h = null;
                this.f45431n = null;
                l();
            } catch (InterruptedException e13) {
                ((d) g()).p3(a.CAMERA_CLOSE, new RuntimeException("Interrupted while trying to lock camera closing.", e13));
            }
            semaphore.release();
        } catch (Throwable th3) {
            semaphore.release();
            throw th3;
        }
    }

    public final Matrix c(int i13, int i14, int i15, Size size) {
        Matrix matrix = new Matrix();
        float f13 = i14;
        float f14 = i15;
        RectF rectF = new RectF(0.0f, 0.0f, f13, f14);
        RectF rectF2 = new RectF(0.0f, 0.0f, size.getHeight(), size.getWidth());
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (getF45423f()) {
            matrix.postScale(-1.0f, 1.0f, centerX, centerY);
        } else if (1 == i13 || 3 == i13) {
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            float max = Math.max(f14 / size.getHeight(), f13 / size.getWidth());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            matrix.postScale(max, max, centerX, centerY);
            matrix.postRotate((i13 - 2) * 90, centerX, centerY);
        } else if (2 == i13) {
            matrix.postRotate(180.0f, centerX, centerY);
        }
        return matrix;
    }

    public abstract Size d(StreamConfigurationMap streamConfigurationMap, CameraCharacteristics cameraCharacteristics);

    public final Size e() {
        Size size = this.f45426i;
        if (size != null) {
            return size;
        }
        Intrinsics.r("captureSize");
        throw null;
    }

    public int f() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return b0.n0(bs1.c.k0(context));
    }

    public final c g() {
        c cVar = this.f45421d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("handler");
        throw null;
    }

    /* renamed from: h */
    public abstract int getF45441w();

    /* renamed from: i */
    public abstract int getF45440v();

    /* renamed from: j, reason: from getter */
    public boolean getF45423f() {
        return this.f45423f;
    }

    /* renamed from: k */
    public abstract f getF45442x();

    public abstract void l();

    public abstract void m(CameraCharacteristics cameraCharacteristics);

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0099, code lost:
    
        if (r0 != 270) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[Catch: NullPointerException -> 0x00d3, CameraAccessException -> 0x00d6, TryCatch #4 {CameraAccessException -> 0x00d6, NullPointerException -> 0x00d3, blocks: (B:12:0x002d, B:14:0x003a, B:18:0x0063, B:19:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x0076, B:40:0x00a9, B:45:0x00c7, B:47:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e7, B:54:0x0108, B:57:0x011c, B:58:0x0145, B:83:0x0124, B:84:0x0129, B:85:0x012a, B:88:0x013e, B:89:0x0153, B:90:0x0158, B:106:0x0072), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[Catch: NullPointerException -> 0x00d3, CameraAccessException -> 0x00d6, TryCatch #4 {CameraAccessException -> 0x00d6, NullPointerException -> 0x00d3, blocks: (B:12:0x002d, B:14:0x003a, B:18:0x0063, B:19:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x0076, B:40:0x00a9, B:45:0x00c7, B:47:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e7, B:54:0x0108, B:57:0x011c, B:58:0x0145, B:83:0x0124, B:84:0x0129, B:85:0x012a, B:88:0x013e, B:89:0x0153, B:90:0x0158, B:106:0x0072), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108 A[Catch: NullPointerException -> 0x00d3, CameraAccessException -> 0x00d6, TRY_ENTER, TryCatch #4 {CameraAccessException -> 0x00d6, NullPointerException -> 0x00d3, blocks: (B:12:0x002d, B:14:0x003a, B:18:0x0063, B:19:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x0076, B:40:0x00a9, B:45:0x00c7, B:47:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e7, B:54:0x0108, B:57:0x011c, B:58:0x0145, B:83:0x0124, B:84:0x0129, B:85:0x012a, B:88:0x013e, B:89:0x0153, B:90:0x0158, B:106:0x0072), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a A[Catch: NullPointerException -> 0x00d3, CameraAccessException -> 0x00d6, TryCatch #4 {CameraAccessException -> 0x00d6, NullPointerException -> 0x00d3, blocks: (B:12:0x002d, B:14:0x003a, B:18:0x0063, B:19:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x0076, B:40:0x00a9, B:45:0x00c7, B:47:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e7, B:54:0x0108, B:57:0x011c, B:58:0x0145, B:83:0x0124, B:84:0x0129, B:85:0x012a, B:88:0x013e, B:89:0x0153, B:90:0x0158, B:106:0x0072), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.fragment.app.FragmentActivity r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.camera2.view.BaseCameraView.n(androidx.fragment.app.FragmentActivity, int, int):void");
    }

    public final void o(d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.f45421d = handler;
    }

    public final void p() {
        HandlerThread handlerThread = this.f45427j;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        try {
            HandlerThread handlerThread2 = this.f45427j;
            if (handlerThread2 != null) {
                handlerThread2.join();
            }
            this.f45427j = null;
            this.f45428k = null;
        } catch (InterruptedException e13) {
            ((d) g()).p3(a.BACKGROUND_CLOSE, e13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45420c = new j2(26);
        this.f45422e = 1;
        this.f45423f = false;
        this.f45429l = new Semaphore(1);
        this.f45432o = new u(this, 1);
    }
}
