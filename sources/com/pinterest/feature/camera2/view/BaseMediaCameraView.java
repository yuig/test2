package com.pinterest.feature.camera2.view;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseIntArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/camera2/view/BaseMediaCameraView;", "", "CallbackHandler", "Lcom/pinterest/feature/camera2/view/BasePhotoCameraView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lp2/b", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseMediaCameraView<CallbackHandler> extends BasePhotoCameraView<CallbackHandler> {
    public MediaRecorder G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF);
        sparseIntArray.append(1, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        sparseIntArray.append(2, 90);
        sparseIntArray.append(3, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseMediaCameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.camera2.view.BasePhotoCameraView, com.pinterest.feature.camera2.view.BaseCameraView
    public final Size d(StreamConfigurationMap cameraConfigMap, CameraCharacteristics characteristics) {
        Intrinsics.checkNotNullParameter(cameraConfigMap, "cameraConfigMap");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        Size[] outputSizes = cameraConfigMap.getOutputSizes(MediaRecorder.class);
        Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
        int length = outputSizes.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                Size size = outputSizes[outputSizes.length - 1];
                break;
            }
            Size size2 = outputSizes[i13];
            if (size2.getWidth() == (size2.getHeight() * 4) / 3 && size2.getWidth() <= 1080) {
                break;
            }
            i13++;
        }
        return super.d(cameraConfigMap, characteristics);
    }

    @Override // com.pinterest.feature.camera2.view.BasePhotoCameraView, com.pinterest.feature.camera2.view.BasePreviewCameraView, com.pinterest.feature.camera2.view.BaseCameraView
    public final void l() {
        super.l();
        MediaRecorder mediaRecorder = this.G;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        this.G = null;
    }

    @Override // com.pinterest.feature.camera2.view.BasePreviewCameraView, com.pinterest.feature.camera2.view.BaseCameraView
    public final void m(CameraCharacteristics characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        super.m(characteristics);
        this.G = new MediaRecorder();
    }

    @Override // com.pinterest.feature.camera2.view.BasePhotoCameraView, com.pinterest.feature.camera2.view.BasePreviewCameraView
    public final boolean w() {
        return super.w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMediaCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
