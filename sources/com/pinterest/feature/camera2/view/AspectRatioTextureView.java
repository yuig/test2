package com.pinterest.feature.camera2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/camera2/view/AspectRatioTextureView;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cameraLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class AspectRatioTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public int f45417a;

    /* renamed from: b, reason: collision with root package name */
    public int f45418b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioTextureView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int i16 = this.f45417a;
        if (i16 == 0 || (i15 = this.f45418b) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (size2 * i16) / i15) {
            setMeasuredDimension(size, (i15 * size) / i16);
        } else {
            setMeasuredDimension((i16 * size2) / i15, size2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioTextureView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
