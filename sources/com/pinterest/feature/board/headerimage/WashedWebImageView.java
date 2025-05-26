package com.pinterest.feature.board.headerimage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.ui.imageview.WebImageViewContainer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oq.i;
import org.jetbrains.annotations.NotNull;
import vl0.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/board/headerimage/WashedWebImageView;", "Lcom/pinterest/ui/imageview/WebImageViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WashedWebImageView extends WebImageViewContainer {

    /* renamed from: c, reason: collision with root package name */
    public final View f45275c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f45276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WashedWebImageView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setVisibility(8);
        this.f45275c = view;
        this.f45276d = b.f126105i;
        addView(view);
        Y(new i(this, 3));
    }

    @Override // com.pinterest.ui.imageview.WebImageViewContainer, bb2.j
    public final void clear() {
        super.clear();
        this.f45275c.setVisibility(8);
    }

    public final void g(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f45276d = action;
    }

    public final void j(GradientDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f45275c.setBackground(drawable);
    }
}
