package com.pinterest.feature.camera2.view;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.fragment.app.FragmentActivity;
import ao2.m0;
import com.pinterest.feature.camera2.view.BasePhotoCameraView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dp0.b;
import ep0.a;
import ja.y;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m81.d;
import org.jetbrains.annotations.NotNull;
import v.i0;
import w.e;
import wo2.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0002\r\u000eB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/camera2/view/BasePhotoCameraView;", "Ldp0/b;", "CallbackHandler", "Lcom/pinterest/feature/camera2/view/BasePreviewCameraView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ep0/b", "lp2/b", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BasePhotoCameraView<CallbackHandler extends b> extends BasePreviewCameraView<CallbackHandler> {
    public static final SparseIntArray F;
    public ep0.b A;
    public Size B;
    public ImageReader C;
    public final a D;
    public final i0 E;

    /* renamed from: z, reason: collision with root package name */
    public boolean f45433z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF);
        sparseIntArray.append(3, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        F = sparseIntArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePhotoCameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void x(BasePhotoCameraView basePhotoCameraView, FragmentActivity fragmentActivity) {
        basePhotoCameraView.getClass();
        try {
            int rotation = fragmentActivity.getWindowManager().getDefaultDisplay().getRotation();
            CameraDevice cameraDevice = basePhotoCameraView.f45436r;
            if (cameraDevice == null) {
                throw new NullPointerException("Missing Camera.");
            }
            int i13 = 2;
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
            ImageReader imageReader = basePhotoCameraView.C;
            Surface surface = imageReader != null ? imageReader.getSurface() : null;
            if (surface == null) {
                throw new NullPointerException("Missing ImageReader.");
            }
            createCaptureRequest.addTarget(surface);
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((F.get(rotation) + basePhotoCameraView.f45424g) + RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF) % 360));
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            BasePreviewCameraView.r(basePhotoCameraView, createCaptureRequest);
            Intrinsics.checkNotNullExpressionValue(createCaptureRequest, "apply(...)");
            e eVar = new e(i13, fragmentActivity, basePhotoCameraView);
            CameraCaptureSession cameraCaptureSession = basePhotoCameraView.f45425h;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                cameraCaptureSession.abortCaptures();
                Thread.sleep(100L);
                cameraCaptureSession.capture(createCaptureRequest.build(), eVar, null);
            }
        } catch (CameraAccessException e13) {
            ((d) ((b) basePhotoCameraView.g())).p3(dp0.a.CAPTURE_PICTURE, e13);
        } catch (NullPointerException e14) {
            ((d) ((b) basePhotoCameraView.g())).p3(dp0.a.CAPTURE_PICTURE, e14);
        }
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    public Size d(StreamConfigurationMap cameraConfigMap, CameraCharacteristics characteristics) {
        Intrinsics.checkNotNullParameter(cameraConfigMap, "cameraConfigMap");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        Size y13 = y(cameraConfigMap, characteristics);
        this.B = y13;
        if (y13 == null) {
            Intrinsics.r("photoSize");
            throw null;
        }
        int width = y13.getWidth();
        Size size = this.B;
        if (size == null) {
            Intrinsics.r("photoSize");
            throw null;
        }
        ImageReader newInstance = ImageReader.newInstance(width, size.getHeight(), RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 1);
        newInstance.setOnImageAvailableListener(this.D, this.f45428k);
        this.C = newInstance;
        Size size2 = this.B;
        if (size2 != null) {
            return size2;
        }
        Intrinsics.r("photoSize");
        throw null;
    }

    @Override // com.pinterest.feature.camera2.view.BasePreviewCameraView, com.pinterest.feature.camera2.view.BaseCameraView
    public void l() {
        super.l();
        ImageReader imageReader = this.C;
        if (imageReader != null) {
            imageReader.close();
        }
        this.C = null;
    }

    @Override // com.pinterest.feature.camera2.view.BasePreviewCameraView
    public final List s(Surface hostSurface) {
        Intrinsics.checkNotNullParameter(hostSurface, "hostSurface");
        Surface[] surfaceArr = new Surface[2];
        surfaceArr[0] = hostSurface;
        ImageReader imageReader = this.C;
        surfaceArr[1] = imageReader != null ? imageReader.getSurface() : null;
        return f0.j(surfaceArr);
    }

    @Override // com.pinterest.feature.camera2.view.BasePreviewCameraView
    public final void v(CaptureRequest.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.A = ep0.b.LIVE_CAMERA;
    }

    @Override // com.pinterest.feature.camera2.view.BasePreviewCameraView
    public boolean w() {
        if (this.f45433z) {
            return false;
        }
        return super.w();
    }

    public Size y(StreamConfigurationMap cameraConfigMap, CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraConfigMap, "cameraConfigMap");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        Size[] outputSizes = cameraConfigMap.getOutputSizes(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
        Object max = Collections.max(Arrays.asList(Arrays.copyOf(outputSizes, outputSizes.length)), this.f45420c);
        Intrinsics.checkNotNullExpressionValue(max, "max(...)");
        return (Size) max;
    }

    public void z(Image photo, File file) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        try {
            try {
                x h10 = m0.h(m0.k0(file));
                try {
                    h10.write(photo.getPlanes()[0].getBuffer());
                    dl2.b.J(h10, null);
                    FragmentActivity fragmentActivity = ((d) ((b) g())).f86531a;
                    if (fragmentActivity != null) {
                        fragmentActivity.runOnUiThread(new y(this, photo, file, 16));
                    }
                } finally {
                }
            } catch (IOException unused) {
                Objects.toString(file);
            }
        } finally {
            photo.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ep0.a] */
    public BasePhotoCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.A = ep0.b.LIVE_CAMERA;
        this.D = new ImageReader.OnImageAvailableListener() { // from class: ep0.a
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                SparseIntArray sparseIntArray = BasePhotoCameraView.F;
                BasePhotoCameraView this$0 = BasePhotoCameraView.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Handler handler = this$0.f45428k;
                if (handler != null) {
                    handler.post(new dp.a(16, this$0, imageReader));
                }
            }
        };
        this.E = new i0(this, 3);
    }
}
