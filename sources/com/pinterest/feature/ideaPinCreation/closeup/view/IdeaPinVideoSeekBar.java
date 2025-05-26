package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinVideoSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoSeekBar extends AppCompatSeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final y2 f46067b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoSeekBar(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IdeaPinVideoSeekBar(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoSeekBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        y2 y2Var = new y2(context);
        this.f46067b = y2Var;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), y2Var});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        setProgressDrawable(layerDrawable);
        setSplitTrack(false);
        setThumb(new w2(context));
    }
}
