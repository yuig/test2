package com.pinterest.shuffles.cutout.editor.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import com.pinterest.shuffles.cutout.editor.ui.widget.ShimmerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u62.x;
import v62.a;
import v62.b;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/CutoutEditorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CutoutEditorView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f51942a;

    /* renamed from: b, reason: collision with root package name */
    public final v f51943b;

    /* renamed from: c, reason: collision with root package name */
    public int f51944c;

    /* renamed from: d, reason: collision with root package name */
    public int f51945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutEditorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51942a = m.b(new a(this, 0));
        this.f51943b = m.b(new a(this, 1));
        this.f51944c = 1;
        this.f51945d = 1;
        View.inflate(context, x.cutout_editor_view, this);
    }

    public final MaskedImageView a() {
        Object value = this.f51942a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MaskedImageView) value;
    }

    public final void b(int i13) {
        a().g2(i13);
    }

    public final void c(b strokeParams) {
        Intrinsics.checkNotNullParameter(strokeParams, "strokeParams");
        a().i2(strokeParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        float f13 = i15 - i13;
        float f14 = i16 - i14;
        int i17 = (int) f13;
        int i18 = (int) f14;
        float f15 = this.f51944c / this.f51945d;
        if (f13 / f14 > f15) {
            f13 = f15 * f14;
        } else {
            f14 = f13 / f15;
        }
        int i19 = (int) f13;
        int i23 = (int) f14;
        int i24 = (i17 - i19) / 2;
        int i25 = (i18 - i23) / 2;
        int i26 = i19 + i24;
        int i27 = i23 + i25;
        a().layout(i24, i25, i26, i27);
        Object value = this.f51943b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ShimmerView) value).layout(i24, i25, i26, i27);
    }
}
