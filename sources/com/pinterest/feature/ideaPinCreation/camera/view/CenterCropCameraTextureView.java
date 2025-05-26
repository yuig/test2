package com.pinterest.feature.ideaPinCreation.camera.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/CenterCropCameraTextureView;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class CenterCropCameraTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public int f45899a;

    /* renamed from: b, reason: collision with root package name */
    public int f45900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterCropCameraTextureView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13, int i14) {
        int i15;
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        int i16 = this.f45899a;
        if (i16 == 0 || (i15 = this.f45900b) == 0) {
            return;
        }
        float f13 = i13;
        float f14 = f13 / i16;
        float f15 = i14;
        float f16 = f15 / i15;
        float max = Math.max(f14, f16);
        float f17 = max / f14;
        float f18 = max / f16;
        Matrix matrix = new Matrix();
        matrix.setScale(f17, f18, f13 / 2.0f, f15 / 2.0f);
        setTransform(matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterCropCameraTextureView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
