package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;
import com.pinterest.component.button.LegoButton;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinTextEditorToolbar f46208j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(IdeaPinTextEditorToolbar ideaPinTextEditorToolbar, int i13) {
        super(0);
        this.f46207i = i13;
        this.f46208j = ideaPinTextEditorToolbar;
    }

    public final GestaltIconButton b() {
        int i13 = this.f46207i;
        final IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = this.f46208j;
        switch (i13) {
            case 0:
                final int i14 = 0;
                return ((GestaltIconButton) ideaPinTextEditorToolbar.findViewById(aq1.d.alignment_button)).u(new gm1.a() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.i2
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        v2 v2Var;
                        v2 v2Var2;
                        int i15 = i14;
                        IdeaPinTextEditorToolbar this$0 = ideaPinTextEditorToolbar;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (v2Var = this$0.f46061a) != null) {
                                    IdeaPinTextEditor ideaPinTextEditor = (IdeaPinTextEditor) v2Var;
                                    int i16 = e2.f46131a[ideaPinTextEditor.f46054t.ordinal()];
                                    aq0 aq0Var = i16 != 1 ? i16 != 2 ? aq0.CENTER : aq0.RIGHT : aq0.LEFT;
                                    yt0.b bVar = ideaPinTextEditor.D;
                                    if (bVar != null) {
                                        yt0.b.a(bVar, h32.u0.STORY_PIN_TEXT_ALIGNMENT_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    ideaPinTextEditor.e(aq0Var);
                                    ideaPinTextEditor.k();
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (v2Var2 = this$0.f46061a) != null) {
                                    IdeaPinTextEditor ideaPinTextEditor2 = (IdeaPinTextEditor) v2Var2;
                                    er erVar = ideaPinTextEditor2.f46060z;
                                    Intrinsics.checkNotNullParameter(erVar, "<this>");
                                    er[] values = er.values();
                                    er erVar2 = values[(erVar.ordinal() + 1) % values.length];
                                    yt0.b bVar2 = ideaPinTextEditor2.D;
                                    if (bVar2 != null) {
                                        yt0.b.a(bVar2, h32.u0.STORY_PIN_TEXT_HIGHLIGHT_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    ideaPinTextEditor2.i(erVar2, ideaPinTextEditor2.f46057w);
                                    ideaPinTextEditor2.k();
                                    break;
                                }
                                break;
                        }
                    }
                });
            default:
                GestaltIconButton gestaltIconButton = (GestaltIconButton) ideaPinTextEditorToolbar.findViewById(aq1.d.highlight_button);
                final int i15 = 1;
                gestaltIconButton.u(new gm1.a() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.i2
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        v2 v2Var;
                        v2 v2Var2;
                        int i152 = i15;
                        IdeaPinTextEditorToolbar this$0 = ideaPinTextEditorToolbar;
                        switch (i152) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (v2Var = this$0.f46061a) != null) {
                                    IdeaPinTextEditor ideaPinTextEditor = (IdeaPinTextEditor) v2Var;
                                    int i16 = e2.f46131a[ideaPinTextEditor.f46054t.ordinal()];
                                    aq0 aq0Var = i16 != 1 ? i16 != 2 ? aq0.CENTER : aq0.RIGHT : aq0.LEFT;
                                    yt0.b bVar = ideaPinTextEditor.D;
                                    if (bVar != null) {
                                        yt0.b.a(bVar, h32.u0.STORY_PIN_TEXT_ALIGNMENT_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    ideaPinTextEditor.e(aq0Var);
                                    ideaPinTextEditor.k();
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (v2Var2 = this$0.f46061a) != null) {
                                    IdeaPinTextEditor ideaPinTextEditor2 = (IdeaPinTextEditor) v2Var2;
                                    er erVar = ideaPinTextEditor2.f46060z;
                                    Intrinsics.checkNotNullParameter(erVar, "<this>");
                                    er[] values = er.values();
                                    er erVar2 = values[(erVar.ordinal() + 1) % values.length];
                                    yt0.b bVar2 = ideaPinTextEditor2.D;
                                    if (bVar2 != null) {
                                        yt0.b.a(bVar2, h32.u0.STORY_PIN_TEXT_HIGHLIGHT_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    ideaPinTextEditor2.i(erVar2, ideaPinTextEditor2.f46057w);
                                    ideaPinTextEditor2.k();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return gestaltIconButton;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46207i;
        final IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = this.f46208j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                FrameLayout frameLayout = (FrameLayout) ideaPinTextEditorToolbar.findViewById(aq1.d.color_button);
                final int i14 = 0;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.k2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i14;
                        int i16 = 1;
                        int i17 = 0;
                        IdeaPinTextEditorToolbar this$0 = ideaPinTextEditorToolbar;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                v2 v2Var = this$0.f46061a;
                                if (v2Var != null) {
                                    IdeaPinTextEditor ideaPinTextEditor = (IdeaPinTextEditor) v2Var;
                                    yt0.b bVar = ideaPinTextEditor.D;
                                    if (bVar != null) {
                                        yt0.b.a(bVar, h32.u0.STORY_PIN_TEXT_COLOR_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    IdeaPinColorPalette ideaPinColorPalette = ideaPinTextEditor.f46048n;
                                    if (!bs1.c.o1(ideaPinColorPalette)) {
                                        IdeaPinFontPicker ideaPinFontPicker = ideaPinTextEditor.f46047m;
                                        if (!bs1.c.o1(ideaPinFontPicker)) {
                                            ideaPinTextEditor.f46052r = true;
                                            ideaPinTextEditor.f46051q = false;
                                            hf0.b.k(ideaPinTextEditor.f46045k);
                                            break;
                                        } else {
                                            bs1.c.X0(ideaPinFontPicker);
                                            ideaPinTextEditor.f46046l.b(false);
                                            bs1.c.U1(ideaPinColorPalette);
                                            ideaPinColorPalette.setTranslationY(0.0f);
                                            break;
                                        }
                                    } else {
                                        ideaPinColorPalette.animate().translationY(ideaPinColorPalette.getHeight()).setListener(new g2(ideaPinTextEditor, i16));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                v2 v2Var2 = this$0.f46061a;
                                if (v2Var2 != null) {
                                    IdeaPinTextEditor ideaPinTextEditor2 = (IdeaPinTextEditor) v2Var2;
                                    yt0.b bVar2 = ideaPinTextEditor2.D;
                                    if (bVar2 != null) {
                                        yt0.b.a(bVar2, h32.u0.STORY_PIN_TEXT_FONT_PICKER_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    IdeaPinFontPicker ideaPinFontPicker2 = ideaPinTextEditor2.f46047m;
                                    boolean o13 = bs1.c.o1(ideaPinFontPicker2);
                                    IdeaPinTextEditorToolbar ideaPinTextEditorToolbar2 = ideaPinTextEditor2.f46046l;
                                    if (!o13) {
                                        IdeaPinColorPalette ideaPinColorPalette2 = ideaPinTextEditor2.f46048n;
                                        if (!bs1.c.o1(ideaPinColorPalette2)) {
                                            ideaPinTextEditor2.f46051q = true;
                                            ideaPinTextEditor2.f46052r = false;
                                            hf0.b.k(ideaPinTextEditor2.f46045k);
                                            break;
                                        } else {
                                            bs1.c.X0(ideaPinColorPalette2);
                                            bs1.c.U1(ideaPinFontPicker2);
                                            ideaPinFontPicker2.setTranslationY(0.0f);
                                            ideaPinTextEditorToolbar2.b(true);
                                            break;
                                        }
                                    } else {
                                        ideaPinTextEditorToolbar2.b(false);
                                        ideaPinFontPicker2.animate().translationY(ideaPinFontPicker2.getHeight()).setListener(new g2(ideaPinTextEditor2, i17));
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                return frameLayout;
            case 2:
                return (ImageView) ideaPinTextEditorToolbar.findViewById(aq1.d.color_button_icon_view);
            case 3:
                LegoButton legoButton = (LegoButton) ideaPinTextEditorToolbar.findViewById(aq1.d.font_button);
                final int i15 = 1;
                legoButton.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.k2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152 = i15;
                        int i16 = 1;
                        int i17 = 0;
                        IdeaPinTextEditorToolbar this$0 = ideaPinTextEditorToolbar;
                        switch (i152) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                v2 v2Var = this$0.f46061a;
                                if (v2Var != null) {
                                    IdeaPinTextEditor ideaPinTextEditor = (IdeaPinTextEditor) v2Var;
                                    yt0.b bVar = ideaPinTextEditor.D;
                                    if (bVar != null) {
                                        yt0.b.a(bVar, h32.u0.STORY_PIN_TEXT_COLOR_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    IdeaPinColorPalette ideaPinColorPalette = ideaPinTextEditor.f46048n;
                                    if (!bs1.c.o1(ideaPinColorPalette)) {
                                        IdeaPinFontPicker ideaPinFontPicker = ideaPinTextEditor.f46047m;
                                        if (!bs1.c.o1(ideaPinFontPicker)) {
                                            ideaPinTextEditor.f46052r = true;
                                            ideaPinTextEditor.f46051q = false;
                                            hf0.b.k(ideaPinTextEditor.f46045k);
                                            break;
                                        } else {
                                            bs1.c.X0(ideaPinFontPicker);
                                            ideaPinTextEditor.f46046l.b(false);
                                            bs1.c.U1(ideaPinColorPalette);
                                            ideaPinColorPalette.setTranslationY(0.0f);
                                            break;
                                        }
                                    } else {
                                        ideaPinColorPalette.animate().translationY(ideaPinColorPalette.getHeight()).setListener(new g2(ideaPinTextEditor, i16));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                v2 v2Var2 = this$0.f46061a;
                                if (v2Var2 != null) {
                                    IdeaPinTextEditor ideaPinTextEditor2 = (IdeaPinTextEditor) v2Var2;
                                    yt0.b bVar2 = ideaPinTextEditor2.D;
                                    if (bVar2 != null) {
                                        yt0.b.a(bVar2, h32.u0.STORY_PIN_TEXT_FONT_PICKER_BUTTON, d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL, 4);
                                    }
                                    IdeaPinFontPicker ideaPinFontPicker2 = ideaPinTextEditor2.f46047m;
                                    boolean o13 = bs1.c.o1(ideaPinFontPicker2);
                                    IdeaPinTextEditorToolbar ideaPinTextEditorToolbar2 = ideaPinTextEditor2.f46046l;
                                    if (!o13) {
                                        IdeaPinColorPalette ideaPinColorPalette2 = ideaPinTextEditor2.f46048n;
                                        if (!bs1.c.o1(ideaPinColorPalette2)) {
                                            ideaPinTextEditor2.f46051q = true;
                                            ideaPinTextEditor2.f46052r = false;
                                            hf0.b.k(ideaPinTextEditor2.f46045k);
                                            break;
                                        } else {
                                            bs1.c.X0(ideaPinColorPalette2);
                                            bs1.c.U1(ideaPinFontPicker2);
                                            ideaPinFontPicker2.setTranslationY(0.0f);
                                            ideaPinTextEditorToolbar2.b(true);
                                            break;
                                        }
                                    } else {
                                        ideaPinTextEditorToolbar2.b(false);
                                        ideaPinFontPicker2.animate().translationY(ideaPinFontPicker2.getHeight()).setListener(new g2(ideaPinTextEditor2, i17));
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                return legoButton;
            default:
                return b();
        }
    }
}
