package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinPageColorPickerModal;", "Landroid/widget/FrameLayout;", "Lcu0/b;", "Lcu0/d;", "Lcu0/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/p1", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinPageColorPickerModal extends FrameLayout implements cu0.b, cu0.d, cu0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f46030e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final IdeaPinColorPalette f46031a;

    /* renamed from: b, reason: collision with root package name */
    public yt0.c f46032b;

    /* renamed from: c, reason: collision with root package name */
    public cu0.c f46033c;

    /* renamed from: d, reason: collision with root package name */
    public p1 f46034d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinPageColorPickerModal(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // cu0.b
    public final void a() {
    }

    @Override // cu0.b
    public final void b() {
        bs1.c.X0(this);
    }

    @Override // cu0.b
    public final void c() {
    }

    @Override // cu0.e
    public final void j() {
        cu0.c cVar = this.f46033c;
        if (cVar != null) {
            ((f0) cVar).B0(cu0.f.PAGE_BACKGROUND_COLOR);
        }
    }

    @Override // cu0.d
    public final void m(String colorHex) {
        yt0.c cVar;
        if (colorHex == null || (cVar = this.f46032b) == null) {
            return;
        }
        f0 f0Var = (f0) cVar;
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        f0Var.b1(colorHex);
        au0.d dVar = f0Var.f46164h0;
        if (dVar != null) {
            dVar.F3(colorHex);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinPageColorPickerModal(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        IdeaPinColorPalette ideaPinColorPalette = new IdeaPinColorPalette(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ideaPinColorPalette.setLayoutParams(layoutParams);
        this.f46031a = ideaPinColorPalette;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i14 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        view.setBackgroundColor(context.getColor(i14));
        view.setOnClickListener(new com.pinterest.feature.home.view.c(this, 2));
        addView(view);
        addView(ideaPinColorPalette);
    }
}
