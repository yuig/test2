package com.pinterest.feature.search.visual.lens;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.util.AttributeSet;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import bs1.c;
import com.pinterest.feature.camera2.view.BasePhotoCameraView;
import dp0.b;
import ja.y;
import java.io.File;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m81.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/FullScreenPhotoCameraView;", "Lcom/pinterest/feature/camera2/view/BasePhotoCameraView;", "Ldp0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FullScreenPhotoCameraView extends BasePhotoCameraView<b> {
    public static final /* synthetic */ int G = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenPhotoCameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    public final int f() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return b0.n0(c.k0(context));
    }

    @Override // com.pinterest.feature.camera2.view.BaseCameraView
    /* renamed from: j */
    public final boolean getF45423f() {
        return false;
    }

    @Override // com.pinterest.feature.camera2.view.BasePhotoCameraView
    public final Size y(StreamConfigurationMap cameraConfigMap, CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraConfigMap, "cameraConfigMap");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int n03 = b0.n0(c.k0(context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new Size(n03, b0.o0(c.k0(context2)));
    }

    @Override // com.pinterest.feature.camera2.view.BasePhotoCameraView
    public final void z(Image photo, File file) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        FragmentActivity fragmentActivity = ((d) ((b) g())).f86531a;
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new y(this, photo, file, 25));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenPhotoCameraView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
