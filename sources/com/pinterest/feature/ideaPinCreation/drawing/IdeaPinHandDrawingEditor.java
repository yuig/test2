package com.pinterest.feature.ideaPinCreation.drawing;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.facebook.login.o;
import com.pinterest.api.model.go;
import com.pinterest.api.model.mp;
import com.pinterest.feature.ideaPinCreation.closeup.view.a0;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import cu0.c;
import cu0.d;
import cu0.e;
import cu0.f;
import d7.b;
import h32.d4;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou0.g;
import ou0.h;
import ou0.j;
import ou0.l;
import ou0.n;
import uf1.a;
import xk2.k;
import xk2.m;
import xo0.i;
import zp.y0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\r\u000e\u000f\u0010B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/drawing/IdeaPinHandDrawingEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcu0/d;", "Lcu0/e;", "Lou0/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/facebook/login/o", "com/pinterest/feature/ideaPinCreation/closeup/view/a0", "ou0/j", "ou0/k", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinHandDrawingEditor extends ConstraintLayout implements d, e, n {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    public IdeaPinHandDrawingView f46483a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f46484b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f46485c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f46486d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f46487e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f46488f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f46489g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView[] f46490h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f46491i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIconButton f46492j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f46493k;

    /* renamed from: l, reason: collision with root package name */
    public final View f46494l;

    /* renamed from: m, reason: collision with root package name */
    public final IdeaPinCreationSlider f46495m;

    /* renamed from: n, reason: collision with root package name */
    public final IdeaPinColorPalette f46496n;

    /* renamed from: o, reason: collision with root package name */
    public final View f46497o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f46498p;

    /* renamed from: q, reason: collision with root package name */
    public final Group f46499q;

    /* renamed from: r, reason: collision with root package name */
    public final k f46500r;

    /* renamed from: s, reason: collision with root package name */
    public final k f46501s;

    /* renamed from: t, reason: collision with root package name */
    public final k f46502t;

    /* renamed from: u, reason: collision with root package name */
    public c f46503u;

    /* renamed from: v, reason: collision with root package name */
    public ou0.k f46504v;

    /* renamed from: w, reason: collision with root package name */
    public j f46505w;

    /* renamed from: x, reason: collision with root package name */
    public o f46506x;

    /* renamed from: y, reason: collision with root package name */
    public a0 f46507y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f46508z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinHandDrawingEditor(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(ImageView imageView, go goVar) {
        imageView.setOnClickListener(new y0(this, goVar, imageView, 12));
    }

    public final void T(go goVar) {
        List F0;
        bs1.c.U1(this);
        if (getWidth() == 0) {
            Iterator it = b.O(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).forceLayout();
            }
        }
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f46483a;
        if (ideaPinHandDrawingView != null) {
            ideaPinHandDrawingView.f46514f = true;
        }
        mp mpVar = (ideaPinHandDrawingView == null || (F0 = CollectionsKt.F0(ideaPinHandDrawingView.f46517i)) == null) ? null : (mp) CollectionsKt.d0(F0);
        IdeaPinCreationSlider ideaPinCreationSlider = this.f46495m;
        if (mpVar == null) {
            if (goVar == null) {
                goVar = go.MARKER;
            }
            Z(goVar);
            SeekBar seekBar = ideaPinCreationSlider.f46478a;
            seekBar.setProgress(50);
            ideaPinCreationSlider.f46481d.onStopTrackingTouch(seekBar);
            return;
        }
        if (goVar == null) {
            goVar = mpVar.getBrushType();
        }
        Z(goVar);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f46498p.setImageDrawable(new a(context, mpVar.getBrushColor(), false, false, 12));
        m(mpVar.getBrushColor());
        int brushWidth = ((((int) mpVar.getBrushWidth()) - ((Number) this.f46501s.getValue()).intValue()) * 100) / ((Number) this.f46502t.getValue()).intValue();
        SeekBar seekBar2 = ideaPinCreationSlider.f46478a;
        seekBar2.setProgress(brushWidth);
        ideaPinCreationSlider.f46481d.onStopTrackingTouch(seekBar2);
    }

    public final void X(ImageView imageView, go brushType) {
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f46483a;
        if (ideaPinHandDrawingView != null) {
            Intrinsics.checkNotNullParameter(brushType, "brushType");
            ideaPinHandDrawingView.f46509a = brushType;
        }
        ImageView[] imageViewArr = this.f46490h;
        for (ImageView imageView2 : imageViewArr) {
            imageView2.setAlpha(0.7f);
            imageView2.setSelected(false);
        }
        imageView.setAlpha(1.0f);
        imageView.setSelected(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", imageView.getTranslationY(), 0.0f);
        ofFloat.setDuration(85L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        ofFloat.start();
        for (ImageView imageView3 : imageViewArr) {
            if (!Intrinsics.d(imageView3, imageView)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, "translationY", imageView3.getTranslationY(), 16.0f);
                ofFloat2.setDuration(85L);
                Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
                ofFloat2.start();
            }
        }
        go goVar = go.ERASER;
        ImageView imageView4 = this.f46498p;
        if (brushType == goVar) {
            imageView4.setEnabled(false);
            imageView4.setAlpha(0.7f);
        } else {
            imageView4.setEnabled(true);
            imageView4.setAlpha(1.0f);
        }
    }

    public final void Z(go brushType) {
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        int i13 = l.f97716a[brushType.ordinal()];
        if (i13 == 1) {
            X(this.f46488f, go.ARROW);
            return;
        }
        if (i13 == 2) {
            X(this.f46486d, go.GLOW);
            return;
        }
        if (i13 == 3) {
            X(this.f46487e, go.MARKER);
        } else if (i13 == 4) {
            X(this.f46489g, go.DOTTED);
        } else {
            if (i13 != 5) {
                return;
            }
            X(this.f46485c, go.ERASER);
        }
    }

    @Override // cu0.e
    public final void j() {
        c cVar = this.f46503u;
        if (cVar != null) {
            ((f0) cVar).B0(f.DRAWING_STROKE_COLOR);
        }
    }

    @Override // cu0.d
    public final void m(String brushColor) {
        if (brushColor == null) {
            return;
        }
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f46483a;
        if (ideaPinHandDrawingView != null) {
            Intrinsics.checkNotNullParameter(brushColor, "brushColor");
            ideaPinHandDrawingView.f46510b = brushColor;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f46498p.setImageDrawable(new a(context, brushColor, false, false, 12));
        this.f46496n.d();
        IdeaPinHandDrawingView ideaPinHandDrawingView2 = this.f46483a;
        if (ideaPinHandDrawingView2 != null) {
            ideaPinHandDrawingView2.f46514f = true;
        }
        bs1.c.X0(this.f46497o);
        bs1.c.U1(this.f46499q);
    }

    public /* synthetic */ IdeaPinHandDrawingEditor(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinHandDrawingEditor(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        xk2.n nVar = xk2.n.NONE;
        this.f46500r = m.a(nVar, new i(context, 8));
        this.f46501s = m.a(nVar, new i(context, 9));
        this.f46502t = m.a(nVar, new au0.a(this, 5));
        final int i14 = 1;
        this.f46508z = true;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        View.inflate(context, dq1.d.layout_idea_pin_drawing_editor, this);
        View findViewById = findViewById(dq1.c.done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        bs1.c.s(gestaltButton, new q0.d(context, 11));
        final int i15 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: ou0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinHandDrawingEditor f97706b;

            {
                this.f97706b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                List F0;
                k kVar;
                int i16 = i15;
                IdeaPinHandDrawingEditor this$0 = this.f97706b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f46508z) {
                            bs1.c.X0(this$0);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView = this$0.f46483a;
                        if (ideaPinHandDrawingView != null) {
                            ideaPinHandDrawingView.f46514f = false;
                        }
                        j jVar = this$0.f46505w;
                        if (jVar != null) {
                            jVar.b(true);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView2 = this$0.f46483a;
                        if (ideaPinHandDrawingView2 != null && (F0 = CollectionsKt.F0(ideaPinHandDrawingView2.f46517i)) != null && (kVar = this$0.f46504v) != null) {
                            kVar.O(F0);
                            break;
                        }
                        break;
                    default:
                        int i18 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        IdeaPinHandDrawingView ideaPinHandDrawingView3 = this$0.f46483a;
                        if (ideaPinHandDrawingView3 != null) {
                            ArrayList arrayList = ideaPinHandDrawingView3.f46517i;
                            arrayList.clear();
                            arrayList.addAll(ideaPinHandDrawingView3.f46516h);
                            ideaPinHandDrawingView3.invalidate();
                        }
                        if (this$0.f46508z) {
                            bs1.c.X0(this$0);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView4 = this$0.f46483a;
                        if (ideaPinHandDrawingView4 != null) {
                            ideaPinHandDrawingView4.f46514f = false;
                        }
                        j jVar2 = this$0.f46505w;
                        if (jVar2 != null) {
                            jVar2.b(false);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = findViewById(dq1.c.undo_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById2;
        gestaltIconButton.t(ou0.i.f97712j);
        com.bumptech.glide.c.m(gestaltIconButton, new g(this, i14));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f46484b = gestaltIconButton;
        View findViewById3 = findViewById(dq1.c.eraser_button);
        ImageView imageView = (ImageView) findViewById3;
        Intrinsics.f(imageView);
        L(imageView, go.ERASER);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46485c = imageView;
        View findViewById4 = findViewById(dq1.c.arrow_button);
        ImageView imageView2 = (ImageView) findViewById4;
        Intrinsics.f(imageView2);
        L(imageView2, go.ARROW);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f46488f = imageView2;
        View findViewById5 = findViewById(dq1.c.dotted_button);
        ImageView imageView3 = (ImageView) findViewById5;
        Intrinsics.f(imageView3);
        L(imageView3, go.DOTTED);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f46489g = imageView3;
        View findViewById6 = findViewById(dq1.c.glow_button);
        ImageView imageView4 = (ImageView) findViewById6;
        Intrinsics.f(imageView4);
        L(imageView4, go.GLOW);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f46486d = imageView4;
        View findViewById7 = findViewById(dq1.c.marker_button);
        ImageView imageView5 = (ImageView) findViewById7;
        Intrinsics.f(imageView5);
        L(imageView5, go.MARKER);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f46487e = imageView5;
        ImageView[] imageViewArr = {imageView5, imageView3, imageView4, imageView2, imageView};
        this.f46490h = imageViewArr;
        this.f46491i = ((GestaltButton) findViewById(dq1.c.cancel_text_action_drawing)).e(new gm1.a(this) { // from class: ou0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinHandDrawingEditor f97706b;

            {
                this.f97706b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                List F0;
                k kVar;
                int i16 = i14;
                IdeaPinHandDrawingEditor this$0 = this.f97706b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.f46508z) {
                            bs1.c.X0(this$0);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView = this$0.f46483a;
                        if (ideaPinHandDrawingView != null) {
                            ideaPinHandDrawingView.f46514f = false;
                        }
                        j jVar = this$0.f46505w;
                        if (jVar != null) {
                            jVar.b(true);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView2 = this$0.f46483a;
                        if (ideaPinHandDrawingView2 != null && (F0 = CollectionsKt.F0(ideaPinHandDrawingView2.f46517i)) != null && (kVar = this$0.f46504v) != null) {
                            kVar.O(F0);
                            break;
                        }
                        break;
                    default:
                        int i18 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        IdeaPinHandDrawingView ideaPinHandDrawingView3 = this$0.f46483a;
                        if (ideaPinHandDrawingView3 != null) {
                            ArrayList arrayList = ideaPinHandDrawingView3.f46517i;
                            arrayList.clear();
                            arrayList.addAll(ideaPinHandDrawingView3.f46516h);
                            ideaPinHandDrawingView3.invalidate();
                        }
                        if (this$0.f46508z) {
                            bs1.c.X0(this$0);
                        }
                        IdeaPinHandDrawingView ideaPinHandDrawingView4 = this$0.f46483a;
                        if (ideaPinHandDrawingView4 != null) {
                            ideaPinHandDrawingView4.f46514f = false;
                        }
                        j jVar2 = this$0.f46505w;
                        if (jVar2 != null) {
                            jVar2.b(false);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById8 = findViewById(dq1.c.cancel_icon_action_drawing);
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById8;
        Intrinsics.f(gestaltIconButton2);
        com.bumptech.glide.c.m(gestaltIconButton2, new g(this, i15));
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.f46492j = gestaltIconButton2;
        View findViewById9 = findViewById(dq1.c.idea_pin_color_picker);
        IdeaPinColorPalette ideaPinColorPalette = (IdeaPinColorPalette) findViewById9;
        Intrinsics.f(ideaPinColorPalette);
        String[] strArr = IdeaPinColorPalette.f46415g;
        ideaPinColorPalette.c(this, this, null);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.f46496n = ideaPinColorPalette;
        View findViewById10 = findViewById(dq1.c.drawing_color_picker_background);
        findViewById10.setOnClickListener(new View.OnClickListener(this) { // from class: ou0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinHandDrawingEditor f97708b;

            {
                this.f97708b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                IdeaPinHandDrawingEditor this$0 = this.f97708b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f46496n.d();
                        IdeaPinHandDrawingView ideaPinHandDrawingView = this$0.f46483a;
                        if (ideaPinHandDrawingView != null) {
                            ideaPinHandDrawingView.f46514f = true;
                        }
                        bs1.c.X0(this$0.f46497o);
                        bs1.c.U1(this$0.f46499q);
                        break;
                    default:
                        int i18 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        IdeaPinColorPalette ideaPinColorPalette2 = this$0.f46496n;
                        ideaPinColorPalette2.e();
                        bs1.c.U1(ideaPinColorPalette2);
                        ideaPinColorPalette2.forceLayout();
                        bs1.c.X0(this$0.f46499q);
                        bs1.c.U1(this$0.f46497o);
                        IdeaPinHandDrawingView ideaPinHandDrawingView2 = this$0.f46483a;
                        if (ideaPinHandDrawingView2 != null) {
                            ideaPinHandDrawingView2.f46514f = false;
                        }
                        a0 a0Var = this$0.f46507y;
                        if (a0Var != null) {
                            a0.a(a0Var, u0.STORY_PIN_COLOR_SELECTION_BUTTON, d4.STORY_PIN_PAGE_DRAWING_TOOL);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.f46497o = findViewById10;
        for (ImageView imageView6 : imageViewArr) {
            imageView6.setAlpha(0.7f);
            imageView6.setSelected(false);
        }
        View findViewById11 = findViewById(dq1.c.color_button_icon_view);
        ImageView imageView7 = (ImageView) findViewById11;
        imageView7.setImageDrawable(new a(context, "#FFFFFF", false, false, 12));
        imageView7.setOnClickListener(new View.OnClickListener(this) { // from class: ou0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinHandDrawingEditor f97708b;

            {
                this.f97708b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i14;
                IdeaPinHandDrawingEditor this$0 = this.f97708b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f46496n.d();
                        IdeaPinHandDrawingView ideaPinHandDrawingView = this$0.f46483a;
                        if (ideaPinHandDrawingView != null) {
                            ideaPinHandDrawingView.f46514f = true;
                        }
                        bs1.c.X0(this$0.f46497o);
                        bs1.c.U1(this$0.f46499q);
                        break;
                    default:
                        int i18 = IdeaPinHandDrawingEditor.A;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        IdeaPinColorPalette ideaPinColorPalette2 = this$0.f46496n;
                        ideaPinColorPalette2.e();
                        bs1.c.U1(ideaPinColorPalette2);
                        ideaPinColorPalette2.forceLayout();
                        bs1.c.X0(this$0.f46499q);
                        bs1.c.U1(this$0.f46497o);
                        IdeaPinHandDrawingView ideaPinHandDrawingView2 = this$0.f46483a;
                        if (ideaPinHandDrawingView2 != null) {
                            ideaPinHandDrawingView2.f46514f = false;
                        }
                        a0 a0Var = this$0.f46507y;
                        if (a0Var != null) {
                            a0.a(a0Var, u0.STORY_PIN_COLOR_SELECTION_BUTTON, d4.STORY_PIN_PAGE_DRAWING_TOOL);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.f46498p = imageView7;
        View findViewById12 = findViewById(dq1.c.idea_pin_drawing_editor_overlay_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f46494l = findViewById12;
        View findViewById13 = findViewById(dq1.c.idea_pin_drawing_slider_circle);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f46493k = (ImageView) findViewById13;
        View findViewById14 = findViewById(dq1.c.idea_pin_drawing_slider);
        IdeaPinCreationSlider ideaPinCreationSlider = (IdeaPinCreationSlider) findViewById14;
        h listener = new h(this);
        ideaPinCreationSlider.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ideaPinCreationSlider.f46482e = listener;
        Intrinsics.checkNotNullExpressionValue(findViewById14, "apply(...)");
        this.f46495m = ideaPinCreationSlider;
        View findViewById15 = findViewById(dq1.c.drawing_button_group);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f46499q = (Group) findViewById15;
    }
}
