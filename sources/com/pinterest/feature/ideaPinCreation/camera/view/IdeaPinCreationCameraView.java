package com.pinterest.feature.ideaPinCreation.camera.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import ba.u;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraView;
import df.l0;
import dp.a;
import ep.b;
import fa2.c;
import fp0.d;
import ja.y;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import org.jetbrains.annotations.NotNull;
import tb0.g;
import tb0.h;
import tt0.d0;
import tt0.e0;
import tt0.i0;
import tt0.k;
import tt0.k0;
import tt0.n;
import tt0.t0;
import tt0.u0;
import w.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCreationCameraView;", "Lcom/pinterest/feature/ideaPinCreation/camera/view/CenterCropCameraTextureView;", "Lfp0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
@TargetApi(23)
/* loaded from: classes5.dex */
public final class IdeaPinCreationCameraView extends n implements d {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45935i = 0;

    /* renamed from: e, reason: collision with root package name */
    public r f45936e;

    /* renamed from: f, reason: collision with root package name */
    public final k f45937f;

    /* renamed from: g, reason: collision with root package name */
    public Float f45938g;

    /* renamed from: h, reason: collision with root package name */
    public final t0 f45939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v4, types: [tt0.t0] */
    public IdeaPinCreationCameraView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        r rVar = this.f45936e;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        final int i13 = 1;
        this.f45937f = new k(hVar, this, rVar, new u0(this, 0), new u0(this, i13));
        this.f45939h = new View.OnTouchListener(this) { // from class: tt0.t0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinCreationCameraView f119218b;

            {
                this.f119218b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i14 = i13;
                IdeaPinCreationCameraView ideaPinCreationCameraView = this.f119218b;
                switch (i14) {
                }
                return IdeaPinCreationCameraView.n(ideaPinCreationCameraView, motionEvent);
            }
        };
    }

    public static boolean n(IdeaPinCreationCameraView this$0, MotionEvent motionEvent) {
        Float f13;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getPointerCount() != 1) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this$0.f45938g = Float.valueOf(motionEvent.getY(0));
            return true;
        }
        if (action != 2) {
            return false;
        }
        Float f14 = this$0.f45938g;
        if (f14 == null) {
            return true;
        }
        float floatValue = f14.floatValue();
        float y13 = motionEvent.getY(0);
        float measuredHeight = ((floatValue - y13) / this$0.getMeasuredHeight()) * 3.0f;
        k kVar = this$0.f45937f;
        String str = kVar.f119148k;
        if (str != null) {
            kVar.f119155r = Math.min(Math.max(kVar.f119155r + measuredHeight, 0.0f), 1.0f);
            CameraCharacteristics c13 = kVar.c(str);
            if (c13 != null && (f13 = (Float) c13.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) != null) {
                float a13 = b.a(Math.min(3.0f, f13.floatValue()), 1.0f, kVar.f119155r, 1.0f);
                Rect rect = (Rect) c13.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                if (rect != null) {
                    float f15 = 1;
                    float f16 = f15 - (f15 / a13);
                    float f17 = 2;
                    int width = (int) ((rect.width() * f16) / f17);
                    int height = (int) ((rect.height() * f16) / f17);
                    kVar.f119156s = new Rect(width, height, rect.width() - width, rect.height() - height);
                    kVar.f119150m.post(new a(22, kVar, str));
                }
            }
        }
        this$0.f45938g = Float.valueOf(y13);
        return true;
    }

    @Override // fp0.d
    public final boolean b() {
        return this.f45937f.f119163z;
    }

    @Override // fp0.d
    public final Rect c() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // fp0.d
    public final void d(final k0 onComplete, final k0 onError) {
        String str;
        CameraCaptureSession cameraCaptureSession;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final k kVar = this.f45937f;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ImageReader imageReader = kVar.f119143f;
        if (imageReader == null || (str = kVar.f119148k) == null || (cameraCaptureSession = kVar.f119144g) == null) {
            return;
        }
        final File g13 = kVar.e() ? c.g("IMG_FF_", ".jpg") : c.g("IMG_", ".jpg");
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: tt0.d
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                k this$0 = kVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 onComplete2 = onComplete;
                Intrinsics.checkNotNullParameter(onComplete2, "$onComplete");
                Function1 onError2 = onError;
                Intrinsics.checkNotNullParameter(onError2, "$onError");
                Image acquireLatestImage = imageReader2.acquireLatestImage();
                Intrinsics.checkNotNullExpressionValue(acquireLatestImage, "acquireLatestImage(...)");
                File file = g13;
                if (file != null) {
                    this$0.f119150m.post(new n.g(acquireLatestImage, file, onComplete2, onError2));
                }
            }
        }, kVar.f119150m);
        if (kVar.f119154q) {
            kVar.k();
        }
        CaptureRequest.Builder createCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(2);
        Rect rect = kVar.f119156s;
        if (rect != null) {
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        Intrinsics.checkNotNullExpressionValue(createCaptureRequest, "apply(...)");
        createCaptureRequest.addTarget(imageReader.getSurface());
        CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
        CameraCharacteristics c13 = kVar.c(str);
        Integer num = c13 != null ? (Integer) c13.get(CameraCharacteristics.LENS_FACING) : null;
        createCaptureRequest.set(key, Integer.valueOf((num != null && num.intValue() == 0) ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF : 90));
        cameraCaptureSession.capture(createCaptureRequest.build(), new e(3, kVar, onError), null);
    }

    @Override // fp0.d
    public final void e(boolean z13, i0 listener) {
        Integer num;
        Intrinsics.checkNotNullParameter(listener, "listener");
        k kVar = this.f45937f;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = kVar.f119148k;
        if (str == null) {
            return;
        }
        CameraCharacteristics c13 = kVar.c(str);
        if (c13 == null || (num = (Integer) c13.get(CameraCharacteristics.LENS_FACING)) == null || num.intValue() != 0) {
            CameraCharacteristics c14 = kVar.c(str);
            if (c14 == null || !Intrinsics.d(c14.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE)) {
                listener.f119125b.h8().k(aq1.h.idea_pin_camera_flash_unavailable);
                return;
            }
            boolean z14 = !kVar.f119154q;
            kVar.f119154q = z14;
            if (!z13) {
                if (z14) {
                    kVar.k();
                } else {
                    kVar.j();
                }
            }
            listener.a(kVar.f119154q);
        }
    }

    @Override // fp0.d
    public final void f(m.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45937f.f119145h = listener;
    }

    @Override // fp0.d
    public final void g(Function1 callbackHandler) {
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        k kVar = this.f45937f;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        String str = kVar.f119148k;
        if (str == null) {
            return;
        }
        kVar.f119139b.post(new tt0.c(kVar, 4));
        kVar.f119150m.post(new y(kVar, str, callbackHandler, 20));
    }

    @Override // fp0.d
    public final boolean h() {
        return bs1.c.o1(this);
    }

    @Override // fp0.d
    public final void i(boolean z13) {
        k kVar = this.f45937f;
        if (z13 || !kVar.f119154q) {
            kVar.j();
        } else {
            kVar.k();
        }
    }

    @Override // fp0.d
    public final void j(e0 onStarted, e0 onUpdate) {
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        k kVar = this.f45937f;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        String str = kVar.f119148k;
        if (str == null || kVar.f119163z) {
            return;
        }
        MediaRecorder mediaRecorder = kVar.f119160w;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        File g13 = kVar.e() ? c.g("VID_FF_", ".mp4") : c.g("VID_", ".mp4");
        kVar.f119157t = g13;
        if (g13 == null) {
            return;
        }
        Surface surface = kVar.A;
        Intrinsics.f(surface);
        Size size = kVar.f119161x;
        Intrinsics.f(size);
        File file = kVar.f119157t;
        Intrinsics.f(file);
        kVar.f119160w = kVar.b(surface, size, file);
        kVar.f119163z = true;
        kVar.f119150m.post(new l0(kVar, str, onStarted, kVar.e(), onUpdate));
    }

    @Override // fp0.d
    public final boolean k() {
        return this.f45937f.e();
    }

    @Override // fp0.d
    public final void l(d0 onStopping, u onStopped) {
        Long l13;
        Intrinsics.checkNotNullParameter(onStopping, "onStopping");
        Intrinsics.checkNotNullParameter(onStopped, "onStopped");
        k kVar = this.f45937f;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(onStopping, "onStopping");
        Intrinsics.checkNotNullParameter(onStopped, "onStopped");
        String str = kVar.f119148k;
        if (str != null && kVar.f119163z && (l13 = kVar.f119162y) != null && SystemClock.uptimeMillis() - l13.longValue() >= 1000) {
            kVar.f119163z = false;
            kVar.f119139b.post(new p4.a(3, onStopping));
            ((Handler) kVar.f119159v.getValue()).removeCallbacksAndMessages(null);
            long uptimeMillis = SystemClock.uptimeMillis();
            Long l14 = kVar.f119162y;
            Intrinsics.f(l14);
            long longValue = uptimeMillis - l14.longValue();
            kVar.f119162y = null;
            kVar.f119150m.post(new tt0.b(kVar, str, onStopped, longValue, kVar.e()));
        }
    }

    @Override // fp0.d
    public final void onDestroy() {
        k kVar = this.f45937f;
        kVar.f119149l.quitSafely();
        MediaRecorder mediaRecorder = kVar.f119160w;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        kVar.f119160w = null;
        Surface surface = kVar.A;
        if (surface != null) {
            surface.release();
        }
        kVar.A = null;
    }

    @Override // fp0.d
    public final void onPause() {
        k kVar = this.f45937f;
        kVar.f119150m.post(new tt0.c(kVar, 3));
        ReentrantLock reentrantLock = kVar.f119151n;
        reentrantLock.lock();
        try {
            kVar.f119152o.await(750L, TimeUnit.MILLISECONDS);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // fp0.d
    public final void onResume() {
        this.f45937f.d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v4, types: [tt0.t0] */
    public IdeaPinCreationCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        r rVar = this.f45936e;
        if (rVar != null) {
            final int i14 = 0;
            this.f45937f = new k(hVar, this, rVar, new u0(this, i14), new u0(this, 1));
            this.f45939h = new View.OnTouchListener(this) { // from class: tt0.t0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdeaPinCreationCameraView f119218b;

                {
                    this.f119218b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i142 = i14;
                    IdeaPinCreationCameraView ideaPinCreationCameraView = this.f119218b;
                    switch (i142) {
                    }
                    return IdeaPinCreationCameraView.n(ideaPinCreationCameraView, motionEvent);
                }
            };
            return;
        }
        Intrinsics.r("prefsManagerUser");
        throw null;
    }
}
