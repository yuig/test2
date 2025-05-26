package com.pinterest.video.core.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se0.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/video/core/view/VideoLoadingView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VideoLoadingView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public final o f52772a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.f52772a;
        oVar.setCallback(this);
        int visibility = getVisibility();
        if (isAttachedToWindow()) {
            if (visibility == 0) {
                oVar.start();
            } else {
                oVar.stop();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        o oVar = this.f52772a;
        oVar.stop();
        oVar.setCallback(null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i13) {
        if (isAttachedToWindow()) {
            o oVar = this.f52772a;
            if (i13 == 0) {
                oVar.start();
            } else {
                oVar.stop();
            }
        }
        super.setVisibility(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLoadingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        o oVar = new o(context, getResources().getDimensionPixelSize(c.spinner_diameter_small));
        setImageDrawable(oVar);
        this.f52772a = oVar;
        setVisibility(8);
    }
}
