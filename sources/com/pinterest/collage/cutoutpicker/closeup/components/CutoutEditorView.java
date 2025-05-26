package com.pinterest.collage.cutoutpicker.closeup.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bn0.a;
import bs1.c;
import ja.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l90.b;
import org.jetbrains.annotations.NotNull;
import q90.i;
import q90.j;
import sa0.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/collage/cutoutpicker/closeup/components/CutoutEditorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CutoutEditorView extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f44626e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView f44627a;

    /* renamed from: b, reason: collision with root package name */
    public final a f44628b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f44629c;

    /* renamed from: d, reason: collision with root package name */
    public p f44630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutEditorView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44629c = j.f103050i;
        p pVar = p.f112182d;
        this.f44630d = p.f112182d;
        View.inflate(getContext(), b.view_cutout_editor, this);
        View findViewById = findViewById(l90.a.cutout_editor_view);
        com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView cutoutEditorView = (com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView) findViewById;
        Intrinsics.f(cutoutEditorView);
        float W = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width);
        float W2 = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_dash_pattern);
        cutoutEditorView.c(new v62.b(W, 2 * c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width), new float[]{W2, W2}));
        cutoutEditorView.b(c.B(cutoutEditorView, qa0.a.cutout_editor_mask_fill));
        this.f44628b = new a(cutoutEditorView, new i(this));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44627a = cutoutEditorView;
    }

    public final void L(sa0.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        p pVar = state.f112158b;
        if (pVar.f112183a <= 0 || pVar.f112184b <= 0) {
            return;
        }
        if (!Intrinsics.d(this.f44630d, pVar)) {
            this.f44630d = pVar;
            post(new y(this, pVar, state, 12));
        } else {
            u62.c cVar = state.f112157a;
            if (cVar != null) {
                this.f44628b.n(cVar);
            }
        }
    }

    public final void T(p70.a eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f44629c = eventIntake;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutEditorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44629c = j.f103050i;
        p pVar = p.f112182d;
        this.f44630d = p.f112182d;
        View.inflate(getContext(), b.view_cutout_editor, this);
        View findViewById = findViewById(l90.a.cutout_editor_view);
        com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView cutoutEditorView = (com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView) findViewById;
        Intrinsics.f(cutoutEditorView);
        float W = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width);
        float W2 = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_dash_pattern);
        cutoutEditorView.c(new v62.b(W, 2 * c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width), new float[]{W2, W2}));
        cutoutEditorView.b(c.B(cutoutEditorView, qa0.a.cutout_editor_mask_fill));
        this.f44628b = new a(cutoutEditorView, new i(this));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44627a = cutoutEditorView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutEditorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44629c = j.f103050i;
        p pVar = p.f112182d;
        this.f44630d = p.f112182d;
        View.inflate(getContext(), b.view_cutout_editor, this);
        View findViewById = findViewById(l90.a.cutout_editor_view);
        com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView cutoutEditorView = (com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView) findViewById;
        Intrinsics.f(cutoutEditorView);
        float W = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width);
        float W2 = c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_dash_pattern);
        cutoutEditorView.c(new v62.b(W, 2 * c.W(cutoutEditorView, qa0.b.cutout_editor_mask_stroke_width), new float[]{W2, W2}));
        cutoutEditorView.b(c.B(cutoutEditorView, qa0.a.cutout_editor_mask_fill));
        this.f44628b = new a(cutoutEditorView, new i(this));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44627a = cutoutEditorView;
    }
}
