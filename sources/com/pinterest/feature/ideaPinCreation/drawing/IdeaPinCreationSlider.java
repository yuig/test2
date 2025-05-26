package com.pinterest.feature.ideaPinCreation.drawing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou0.b;
import ou0.c;
import ou0.d;
import ou0.h;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/drawing/IdeaPinCreationSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ou0/h", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationSlider extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f46477f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SeekBar f46478a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f46479b;

    /* renamed from: c, reason: collision with root package name */
    public final k f46480c;

    /* renamed from: d, reason: collision with root package name */
    public final b f46481d;

    /* renamed from: e, reason: collision with root package name */
    public h f46482e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationSlider(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final float L(IdeaPinCreationSlider ideaPinCreationSlider) {
        SeekBar seekBar = ideaPinCreationSlider.f46478a;
        float width = (seekBar.getWidth() - seekBar.getPaddingStart()) - seekBar.getPaddingEnd();
        float max = seekBar.getMax();
        return ((max / 2) - seekBar.getProgress()) * (width / max);
    }

    public final void T(int i13) {
        SeekBar seekBar = this.f46478a;
        if (!seekBar.isLaidOut() || seekBar.isLayoutRequested()) {
            seekBar.addOnLayoutChangeListener(new d(this, i13));
        } else {
            seekBar.setTranslationX((((Number) this.f46480c.getValue()).intValue() / 2) - i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationSlider(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46480c = m.a(n.NONE, c.f97702i);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        View.inflate(context, dq1.d.layout_idea_pin_creation_slider, this);
        View findViewById = findViewById(dq1.c.idea_pin_drawing_slider_value);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46479b = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.stroke_width_slider);
        SeekBar seekBar = (SeekBar) findViewById2;
        seekBar.setMax(99);
        seekBar.setProgress(49);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f46478a = seekBar;
        b bVar = new b(this);
        this.f46481d = bVar;
        seekBar.setOnSeekBarChangeListener(bVar);
        T(0);
    }
}
