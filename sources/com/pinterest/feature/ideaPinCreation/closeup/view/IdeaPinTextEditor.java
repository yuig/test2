package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;
import com.pinterest.api.model.uq;
import com.pinterest.component.button.LegoButton;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import java.util.HashMap;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import so.jb;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinTextEditor;", "Landroid/widget/LinearLayout;", "Lcom/pinterest/feature/ideaPinCreation/closeup/view/v2;", "Lau0/e;", "Lcu0/d;", "Lcu0/e;", "Lcom/pinterest/feature/ideaPinCreation/closeup/view/n2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/c2", "com/pinterest/feature/ideaPinCreation/closeup/view/d2", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinTextEditor extends LinearLayout implements v2, au0.e, cu0.d, cu0.e, n2, af2.c {
    public static final /* synthetic */ int E = 0;
    public cu0.c A;
    public c2 B;
    public d2 C;
    public yt0.b D;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f46035a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46036b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f46037c;

    /* renamed from: d, reason: collision with root package name */
    public final au0.j f46038d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f46039e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f46040f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46041g;

    /* renamed from: h, reason: collision with root package name */
    public final m2 f46042h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f46043i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f46044j;

    /* renamed from: k, reason: collision with root package name */
    public final EditText f46045k;

    /* renamed from: l, reason: collision with root package name */
    public final IdeaPinTextEditorToolbar f46046l;

    /* renamed from: m, reason: collision with root package name */
    public final IdeaPinFontPicker f46047m;

    /* renamed from: n, reason: collision with root package name */
    public final IdeaPinColorPalette f46048n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46049o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46050p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f46051q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f46052r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f46053s;

    /* renamed from: t, reason: collision with root package name */
    public aq0 f46054t;

    /* renamed from: u, reason: collision with root package name */
    public String f46055u;

    /* renamed from: v, reason: collision with root package name */
    public String f46056v;

    /* renamed from: w, reason: collision with root package name */
    public String f46057w;

    /* renamed from: x, reason: collision with root package name */
    public String f46058x;

    /* renamed from: y, reason: collision with root package name */
    public String f46059y;

    /* renamed from: z, reason: collision with root package name */
    public er f46060z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinTextEditor(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        if (!this.f46036b) {
            this.f46036b = true;
            this.f46037c = ((jb) ((o2) generatedComponent())).f113503u;
        }
        this.f46039e = xk2.m.b(l0.f46226q);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RectF i03 = ig1.b.i0(0.5625f, context2);
        this.f46040f = i03;
        int a13 = bs1.c.a1(this, aq1.e.idea_pin_text_max_length);
        this.f46041g = a13;
        xk2.v b13 = xk2.m.b(new f2(this, i13));
        this.f46053s = xk2.m.b(new f2(this, 0));
        this.f46054t = aq0.CENTER;
        this.f46055u = "6";
        this.f46057w = "#FFFFFF";
        this.f46058x = "#FFFFFF";
        this.f46060z = er.NONE;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View.inflate(getContext(), aq1.f.layout_idea_pin_text_editor, this);
        View findViewById = findViewById(aq1.d.text_counter);
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.f(gestaltText);
        String string = gestaltText.getResources().getString(aq1.h.idea_pin_text_count, 0, Integer.valueOf(a13));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46044j = gestaltText;
        View findViewById2 = findViewById(aq1.d.body_edit_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(aq1.d.body_edit_text);
        EditText editText = (EditText) findViewById3;
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int c13 = ml2.c.c(i03.left);
        com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams, c13, 0, c13, 0);
        editText.setRawInputType(16385);
        editText.addTextChangedListener((h2) b13.getValue());
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(a13)});
        Context context3 = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        m2 m2Var = new m2(context3, editText, new au0.f(this, 2));
        this.f46042h = m2Var;
        editText.setOnTouchListener(m2Var);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46045k = editText;
        View findViewById4 = findViewById(aq1.d.edit_text_container);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById4;
        constraintLayout.setOnTouchListener(m2Var);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f46043i = constraintLayout;
        ((GestaltButton) findViewById(aq1.d.text_edit_done_button)).e(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.b2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinTextEditor f46091b;

            {
                this.f46091b = listener;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                IdeaPinTextEditor this$0 = this.f46091b;
                switch (i14) {
                    case 0:
                        int i15 = IdeaPinTextEditor.E;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!this$0.f46050p) {
                            this$0.b();
                            this$0.a();
                            break;
                        } else {
                            hf0.b.k(this$0.f46045k);
                            break;
                        }
                    default:
                        int i16 = IdeaPinTextEditor.E;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!this$0.f46050p) {
                            this$0.b();
                            this$0.a();
                            break;
                        } else {
                            hf0.b.k(this$0.f46045k);
                            break;
                        }
                }
            }
        });
        View findViewById5 = findViewById(aq1.d.text_editor_toolbar);
        IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = (IdeaPinTextEditorToolbar) findViewById5;
        ideaPinTextEditorToolbar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        ideaPinTextEditorToolbar.f46061a = this;
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f46046l = ideaPinTextEditorToolbar;
        View findViewById6 = findViewById(aq1.d.font_picker);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46047m = (IdeaPinFontPicker) findViewById6;
        View findViewById7 = findViewById(aq1.d.text_color_picker);
        IdeaPinColorPalette ideaPinColorPalette = (IdeaPinColorPalette) findViewById7;
        Intrinsics.f(ideaPinColorPalette);
        ideaPinColorPalette.c(this, this, null);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f46048n = ideaPinColorPalette;
        wk2.a aVar = this.f46037c;
        if (aVar == null) {
            Intrinsics.r("ideaPinTextEditorPresenter");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        au0.j jVar = (au0.j) obj;
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f46038d = jVar;
        if (jVar != null) {
            jVar.bind(this);
        } else {
            Intrinsics.r("presenter");
            throw null;
        }
    }

    public final void a() {
        View T;
        au0.j jVar = this.f46038d;
        if (jVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        jVar.p3(this.f46055u, false);
        this.f46051q = false;
        this.f46052r = false;
        bs1.c.X0(this.f46047m);
        bs1.c.X0(this.f46048n);
        bs1.c.X0(this);
        c2 c2Var = this.B;
        if (c2Var != null) {
            String str = this.f46056v;
            f0 f0Var = (f0) c2Var;
            bs1.c.U1(f0Var.q());
            f0Var.G0();
            if (str == null || (T = f0Var.T(str)) == null) {
                return;
            }
            kg.a.s(T, 0L, null, 6);
        }
    }

    public final void b() {
        float intrinsicWidth;
        int i13 = e2.f46132b[this.f46060z.ordinal()];
        EditText editText = this.f46045k;
        int measuredWidth = i13 == 1 ? editText.getMeasuredWidth() - (ml2.c.c((editText.getTextSize() / 5) * 2) * 2) : editText.getMeasuredWidth();
        d2 d2Var = this.C;
        if (d2Var != null) {
            String text = StringsKt.i0(editText.getText().toString()).toString();
            String fontId = this.f46055u;
            float textSize = editText.getTextSize();
            aq0 textAlignment = this.f46054t;
            String textBlockColorHex = this.f46057w;
            er highlightType = this.f46060z;
            int measuredHeight = editText.getMeasuredHeight();
            String str = this.f46056v;
            f0 f0Var = (f0) d2Var;
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(fontId, "fontId");
            Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
            Intrinsics.checkNotNullParameter(textBlockColorHex, "textBlockColorHex");
            Intrinsics.checkNotNullParameter(highlightType, "highlightType");
            if (str == null && text.length() > 0) {
                Context context = f0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float f13 = ig1.b.f1(textSize, context);
                au0.d dVar = f0Var.f46164h0;
                if (dVar != null) {
                    dVar.G3(text, fontId, f13, textAlignment, textBlockColorHex, highlightType, null, str);
                    return;
                }
                return;
            }
            if (str != null && text.length() == 0) {
                au0.d dVar2 = f0Var.f46164h0;
                if (dVar2 != null) {
                    dVar2.D3(str, uq.TEXT);
                    return;
                }
                return;
            }
            if (str == null || text.length() <= 0) {
                return;
            }
            View T = f0Var.T(str);
            c1 c1Var = T instanceof c1 ? (c1) T : null;
            if (c1Var != null) {
                TextView textView = c1Var.f46105i;
                boolean z13 = !Intrinsics.d(textView.getText().toString(), text);
                boolean z14 = !Intrinsics.d(c1Var.f46110n, fontId);
                boolean z15 = !(textView.getTextSize() == textSize);
                boolean z16 = c1Var.f46109m != textAlignment;
                boolean z17 = !Intrinsics.d(c1Var.f46107k, textBlockColorHex);
                boolean z18 = c1Var.f46108l != highlightType;
                if (z13 || z14 || z15 || z16 || z17 || z18) {
                    Float valueOf = z15 ? Float.valueOf(1.0f) : null;
                    ImageView imageView = c1Var.f46106j;
                    RectF rectF = new RectF(imageView.getDrawable().getBounds());
                    c1Var.f46113q.mapRect(rectF);
                    float a03 = ig1.b.a0(c1Var.f46113q);
                    Matrix matrix = new Matrix(c1Var.f46113q);
                    matrix.postRotate(-a03, rectF.centerX(), rectF.centerY());
                    float f14 = 0.0f;
                    RectF rectF2 = new RectF(0.0f, 0.0f, c1Var.f46098b, c1Var.f46099c);
                    matrix.mapRect(rectF2);
                    boolean z19 = StringsKt.i0(textView.getText().toString()).toString().length() == 0;
                    if (z19) {
                        intrinsicWidth = 0.0f;
                    } else {
                        Matrix imageMatrix = imageView.getImageMatrix();
                        Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
                        intrinsicWidth = imageView.getDrawable().getIntrinsicWidth() * ig1.b.b0(imageMatrix);
                    }
                    if (!z19) {
                        Matrix imageMatrix2 = imageView.getImageMatrix();
                        Intrinsics.checkNotNullExpressionValue(imageMatrix2, "getImageMatrix(...)");
                        f14 = imageView.getDrawable().getIntrinsicHeight() * ig1.b.b0(imageMatrix2);
                    }
                    float floatValue = valueOf != null ? valueOf.floatValue() : ig1.b.b0(matrix);
                    float f15 = 2;
                    float f16 = rectF2.left - (((measuredWidth * floatValue) - intrinsicWidth) / f15);
                    float f17 = rectF2.top - (((measuredHeight * floatValue) - f14) / f15);
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(floatValue, floatValue);
                    matrix2.postTranslate(f16, f17);
                    matrix2.postRotate(a03, rectF.centerX(), rectF.centerY());
                    Context context2 = f0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    float f18 = ig1.b.f1(textSize, context2);
                    au0.d dVar3 = f0Var.f46164h0;
                    if (dVar3 != null) {
                        dVar3.G3(text, fontId, f18, textAlignment, textBlockColorHex, highlightType, matrix2, str);
                    }
                }
            }
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46035a == null) {
            this.f46035a = new ye2.o(this);
        }
        return this.f46035a;
    }

    public final void e(aq0 aq0Var) {
        this.f46054t = aq0Var;
        int type = aq0Var.getType();
        IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = this.f46046l;
        ideaPinTextEditorToolbar.getClass();
        aq0 aq0Var2 = aq0.LEFT;
        ((GestaltIconButton) ideaPinTextEditorToolbar.f46064d.getValue()).t(new ut0.c(type == aq0Var2.getType() ? rm1.q.TEXT_ALIGN_LEFT : type == aq0.RIGHT.getType() ? rm1.q.TEXT_ALIGN_RIGHT : rm1.q.TEXT_ALIGN_CENTER, type == aq0Var2.getType() ? aq1.h.accessibility_idea_pin_text_alignment_button_left : type == aq0.RIGHT.getType() ? aq1.h.accessibility_idea_pin_text_alignment_button_right : aq1.h.accessibility_idea_pin_text_alignment_button_center));
        int i13 = e2.f46131a[aq0Var.ordinal()];
        int i14 = i13 != 2 ? i13 != 3 ? 1 : 5 : 3;
        EditText editText = this.f46045k;
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i14;
        editText.setLayoutParams(layoutParams2);
        editText.setGravity(i14);
        n();
    }

    public final void g(cw0.a font) {
        Intrinsics.checkNotNullParameter(font, "font");
        String value = font.f53326a;
        this.f46055u = value;
        IdeaPinFontPicker ideaPinFontPicker = this.f46047m;
        ideaPinFontPicker.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.d(ideaPinFontPicker.f46006i, value)) {
            ideaPinFontPicker.f46006i = value;
            ideaPinFontPicker.a(value);
        }
        Typeface typeface = Typeface.createFromFile(font.f53331f);
        EditText editText = this.f46045k;
        if (typeface != null) {
            editText.setTypeface(typeface);
            IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = this.f46046l;
            ideaPinTextEditorToolbar.getClass();
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            LegoButton a13 = ideaPinTextEditorToolbar.a();
            String str = font.f53330e;
            if (str == null) {
                str = "Aa";
            }
            a13.setText(str);
            ideaPinTextEditorToolbar.a().setTypeface(typeface);
        }
        editText.setLineSpacing(0.0f, (float) font.f53329d);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46035a == null) {
            this.f46035a = new ye2.o(this);
        }
        return this.f46035a.generatedComponent();
    }

    public final void i(er highlight, String colorHex) {
        this.f46057w = colorHex;
        IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = this.f46046l;
        ideaPinTextEditorToolbar.getClass();
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        Object value = ideaPinTextEditorToolbar.f46062b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Object value2 = ideaPinTextEditorToolbar.f46063c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Context context = ideaPinTextEditorToolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ImageView) value2).setImageDrawable(new uf1.a(context, colorHex, false, false, 12));
        this.f46060z = highlight;
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        Object value3 = ideaPinTextEditorToolbar.f46065e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((GestaltIconButton) value3).t(new au0.f(highlight, 3));
        String T1 = k3.T1(highlight, colorHex);
        String o03 = k3.o0(highlight, colorHex);
        this.f46058x = T1;
        this.f46059y = o03;
        this.f46045k.setTextColor(Color.parseColor(T1));
        n();
    }

    @Override // cu0.e
    public final void j() {
        cu0.c cVar = this.A;
        if (cVar != null) {
            ((f0) cVar).B0(cu0.f.TEXT_COLOR);
        }
    }

    public final void k() {
        EditText editText = this.f46045k;
        if (!editText.isFocused()) {
            editText.requestFocus();
        }
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
    }

    public final void l(String str, String textBlockColorHex, er highlightType, aq0 textAlignment, String id3, float f13, String str2) {
        Intrinsics.checkNotNullParameter(textBlockColorHex, "textBlockColorHex");
        Intrinsics.checkNotNullParameter(highlightType, "highlightType");
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(id3, "fontId");
        EditText editText = this.f46045k;
        editText.setText(str);
        i(highlightType, textBlockColorHex);
        e(textAlignment);
        editText.setTextSize(0, f13);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f46042h.f46251f = df.j1.E(f13, context) / 36;
        n();
        this.f46056v = str2;
        this.f46055u = id3;
        au0.j jVar = this.f46038d;
        if (jVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        Intrinsics.checkNotNullParameter(id3, "id");
        xj2.c j13 = ((ee0.b) jVar.f20499a.get()).a().i(tk2.e.f118017c).j(new kt0.x(28, new au0.i(id3, jVar)), new kt0.x(29, new au0.f(jVar, 1)));
        Intrinsics.checkNotNullExpressionValue(j13, "subscribe(...)");
        jVar.addDisposable(j13);
        bs1.c.U1(this);
        editText.requestFocus();
        k();
        hf0.b.s(editText);
    }

    @Override // cu0.d
    public final void m(String colorHex) {
        if (colorHex == null) {
            return;
        }
        yt0.b bVar = this.D;
        if (bVar != null) {
            h32.u0 u0Var = h32.u0.STORY_PIN_COLOR_SELECTION_BUTTON;
            d4 d4Var = d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL;
            HashMap o13 = ep.b.o("story_pin_select_name", colorHex);
            Unit unit = Unit.f80348a;
            ((f0) bVar).k0(u0Var, d4Var, o13);
        }
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        i(this.f46060z, colorHex);
        k();
    }

    public final void n() {
        Unit unit;
        EditText view = this.f46045k;
        Intrinsics.checkNotNullParameter(view, "textView");
        view.setText(view.getText().toString());
        String str = this.f46059y;
        if (str != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kh2.b0.L1(context, str, Integer.valueOf(this.f46054t.getType()), view);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullParameter(view, "view");
            kg.p.Y(view, view.getTextSize() / 5);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            kg.p.P(context2, view, this.f46058x, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootView().getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f46053s.getValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f46053s.getValue());
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinTextEditor(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 1;
        if (!this.f46036b) {
            this.f46036b = true;
            this.f46037c = ((jb) ((o2) generatedComponent())).f113503u;
        }
        this.f46039e = xk2.m.b(l0.f46226q);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RectF i03 = ig1.b.i0(0.5625f, context2);
        this.f46040f = i03;
        int a13 = bs1.c.a1(this, aq1.e.idea_pin_text_max_length);
        this.f46041g = a13;
        xk2.v b13 = xk2.m.b(new f2(this, i14));
        final int i15 = 0;
        this.f46053s = xk2.m.b(new f2(this, i15));
        this.f46054t = aq0.CENTER;
        this.f46055u = "6";
        this.f46057w = "#FFFFFF";
        this.f46058x = "#FFFFFF";
        this.f46060z = er.NONE;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View.inflate(getContext(), aq1.f.layout_idea_pin_text_editor, this);
        View findViewById = findViewById(aq1.d.text_counter);
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.f(gestaltText);
        String string = gestaltText.getResources().getString(aq1.h.idea_pin_text_count, 0, Integer.valueOf(a13));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46044j = gestaltText;
        View findViewById2 = findViewById(aq1.d.body_edit_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(aq1.d.body_edit_text);
        EditText editText = (EditText) findViewById3;
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int c13 = ml2.c.c(i03.left);
        com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams, c13, 0, c13, 0);
        editText.setRawInputType(16385);
        editText.addTextChangedListener((h2) b13.getValue());
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(a13)});
        Context context3 = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        m2 m2Var = new m2(context3, editText, new au0.f(this, 2));
        this.f46042h = m2Var;
        editText.setOnTouchListener(m2Var);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46045k = editText;
        View findViewById4 = findViewById(aq1.d.edit_text_container);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById4;
        constraintLayout.setOnTouchListener(m2Var);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f46043i = constraintLayout;
        ((GestaltButton) findViewById(aq1.d.text_edit_done_button)).e(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.b2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinTextEditor f46091b;

            {
                this.f46091b = listener;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                IdeaPinTextEditor this$0 = this.f46091b;
                switch (i142) {
                    case 0:
                        int i152 = IdeaPinTextEditor.E;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!this$0.f46050p) {
                            this$0.b();
                            this$0.a();
                            break;
                        } else {
                            hf0.b.k(this$0.f46045k);
                            break;
                        }
                    default:
                        int i16 = IdeaPinTextEditor.E;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!this$0.f46050p) {
                            this$0.b();
                            this$0.a();
                            break;
                        } else {
                            hf0.b.k(this$0.f46045k);
                            break;
                        }
                }
            }
        });
        View findViewById5 = findViewById(aq1.d.text_editor_toolbar);
        IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = (IdeaPinTextEditorToolbar) findViewById5;
        ideaPinTextEditorToolbar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        ideaPinTextEditorToolbar.f46061a = this;
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f46046l = ideaPinTextEditorToolbar;
        View findViewById6 = findViewById(aq1.d.font_picker);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46047m = (IdeaPinFontPicker) findViewById6;
        View findViewById7 = findViewById(aq1.d.text_color_picker);
        IdeaPinColorPalette ideaPinColorPalette = (IdeaPinColorPalette) findViewById7;
        Intrinsics.f(ideaPinColorPalette);
        ideaPinColorPalette.c(this, this, null);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f46048n = ideaPinColorPalette;
        wk2.a aVar = this.f46037c;
        if (aVar != null) {
            Object obj = aVar.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            au0.j jVar = (au0.j) obj;
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            this.f46038d = jVar;
            if (jVar != null) {
                jVar.bind(this);
                return;
            } else {
                Intrinsics.r("presenter");
                throw null;
            }
        }
        Intrinsics.r("ideaPinTextEditorPresenter");
        throw null;
    }
}
