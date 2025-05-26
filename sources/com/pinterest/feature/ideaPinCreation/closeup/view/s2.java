package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ StoryPinBottomToolbar f46323j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(StoryPinBottomToolbar storyPinBottomToolbar, int i13) {
        super(0);
        this.f46322i = i13;
        this.f46323j = storyPinBottomToolbar;
    }

    public final StoryPinActionButton b() {
        int i13 = this.f46322i;
        final StoryPinBottomToolbar storyPinBottomToolbar = this.f46323j;
        switch (i13) {
            case 0:
                Context context = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                StoryPinActionButton storyPinActionButton = new StoryPinActionButton(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int i14 = storyPinBottomToolbar.f46073c;
                int i15 = storyPinBottomToolbar.f46074d;
                layoutParams.setMargins(i15, i14, i15, i14);
                storyPinActionButton.setLayoutParams(layoutParams);
                storyPinActionButton.L(p2.BACKGROUND);
                Context context2 = storyPinActionButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                uf1.a icon = new uf1.a(context2, "#1A1A1A", false, false, 12);
                Intrinsics.checkNotNullParameter(icon, "icon");
                ImageView imageView = storyPinActionButton.f46069a;
                imageView.setImageDrawable(icon);
                bs1.c.U1(imageView);
                final int i16 = 0;
                storyPinActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i16;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i17) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i18 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton;
            case 1:
            default:
                Context context3 = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                StoryPinActionButton storyPinActionButton2 = new StoryPinActionButton(context3);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                int i17 = storyPinBottomToolbar.f46073c;
                int i18 = storyPinBottomToolbar.f46074d;
                com.bumptech.glide.c.a1(layoutParams2, i18, i17, i18, i17);
                storyPinActionButton2.setLayoutParams(layoutParams2);
                storyPinActionButton2.L(p2.TEXT);
                final int i19 = 5;
                storyPinActionButton2.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i19;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i172) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i182 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton2;
            case 2:
                Context context4 = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                StoryPinActionButton storyPinActionButton3 = new StoryPinActionButton(context4);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                int i23 = storyPinBottomToolbar.f46073c;
                int i24 = storyPinBottomToolbar.f46074d;
                layoutParams3.setMargins(i24, i23, i24, i23);
                storyPinActionButton3.setLayoutParams(layoutParams3);
                storyPinActionButton3.L(p2.CANVAS);
                final int i25 = 1;
                storyPinActionButton3.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i25;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i172) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i182 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton3;
            case 3:
                Context context5 = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                StoryPinActionButton storyPinActionButton4 = new StoryPinActionButton(context5);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                int i26 = storyPinBottomToolbar.f46073c;
                int i27 = storyPinBottomToolbar.f46074d;
                com.bumptech.glide.c.a1(layoutParams4, i27, i26, i27, i26);
                storyPinActionButton4.setLayoutParams(layoutParams4);
                storyPinActionButton4.L(p2.DRAWING);
                final int i28 = 2;
                storyPinActionButton4.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i28;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i172) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i182 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton4;
            case 4:
                Context context6 = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                StoryPinActionButton storyPinActionButton5 = new StoryPinActionButton(context6);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                int i29 = storyPinBottomToolbar.f46073c;
                int i33 = storyPinBottomToolbar.f46074d;
                layoutParams5.setMargins(i33, i29, i33, i29);
                storyPinActionButton5.setLayoutParams(layoutParams5);
                storyPinActionButton5.L(p2.MEDIA);
                final int i34 = 3;
                storyPinActionButton5.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i34;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i172) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i182 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton5;
            case 5:
                Context context7 = storyPinBottomToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                StoryPinActionButton storyPinActionButton6 = new StoryPinActionButton(context7);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
                int i35 = storyPinBottomToolbar.f46073c;
                int i36 = storyPinBottomToolbar.f46074d;
                layoutParams6.setMargins(i36, i35, i36, i35);
                storyPinActionButton6.setLayoutParams(layoutParams6);
                storyPinActionButton6.L(p2.STICKER);
                final int i37 = 4;
                storyPinActionButton6.setOnClickListener(new View.OnClickListener() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i37;
                        StoryPinBottomToolbar this$0 = storyPinBottomToolbar;
                        switch (i172) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar = this$0.f46075e;
                                if (cVar != null) {
                                    f0 f0Var = (f0) cVar;
                                    yt0.b.a(f0Var, h32.u0.STORY_PIN_VIDEO_BACKGROUND_BUTTON, null, 6);
                                    f0Var.F0();
                                    bs1.c.X0(f0Var.q());
                                    IdeaPinPageColorPickerModal X = f0Var.X();
                                    String currentColorHex = f0Var.f46158e0;
                                    if (currentColorHex == null) {
                                        currentColorHex = "#1A1A1A";
                                    }
                                    X.getClass();
                                    Intrinsics.checkNotNullParameter(currentColorHex, "currentColorHex");
                                    bs1.c.U1(X);
                                    IdeaPinColorPalette ideaPinColorPalette = X.f46031a;
                                    ideaPinColorPalette.e();
                                    ideaPinColorPalette.b(currentColorHex);
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar2 = this$0.f46075e;
                                if (cVar2 != null) {
                                    f0 f0Var2 = (f0) cVar2;
                                    yt0.b.a(f0Var2, h32.u0.IDEA_PIN_CANVAS_ASPECT_RATIO_BUTTON, null, 6);
                                    au0.d dVar = f0Var2.f46166i0;
                                    if (dVar != null) {
                                        q qVar = (q) ((yt0.d) dVar.getView());
                                        qVar.getClass();
                                        qVar.M1(q.V8(qVar, com.pinterest.screens.d2.d()));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar3 = this$0.f46075e;
                                if (cVar3 != null) {
                                    f0 f0Var3 = (f0) cVar3;
                                    yt0.b.a(f0Var3, h32.u0.STORY_PIN_DRAWING_BUTTON, null, 6);
                                    f0Var3.F0();
                                    bs1.c.X0(f0Var3.q());
                                    IdeaPinHandDrawingEditor z13 = f0Var3.z();
                                    int i182 = IdeaPinHandDrawingEditor.A;
                                    z13.T(null);
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar4 = this$0.f46075e;
                                if (cVar4 != null) {
                                    f0 f0Var4 = (f0) cVar4;
                                    yt0.b.a(f0Var4, h32.u0.STORY_PIN_VIDEO_CLIPS_BUTTON, null, 6);
                                    au0.d dVar2 = f0Var4.f46166i0;
                                    if (dVar2 != null) {
                                        yk1.n view2 = dVar2.getView();
                                        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                                        q qVar2 = (q) ((yt0.d) view2);
                                        qVar2.getClass();
                                        NavigationImpl V8 = q.V8(qVar2, com.pinterest.screens.d2.q());
                                        V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                                        qVar2.M1(V8);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar5 = this$0.f46075e;
                                if (cVar5 != null) {
                                    f0 f0Var5 = (f0) cVar5;
                                    yt0.b.a(f0Var5, h32.u0.STORY_PIN_VIDEO_STICKERS_BUTTON, null, 6);
                                    au0.d dVar3 = f0Var5.f46166i0;
                                    if (dVar3 != null) {
                                        q qVar3 = (q) ((yt0.d) dVar3.getView());
                                        qVar3.O0 = false;
                                        qVar3.M1(q.V8(qVar3, com.pinterest.screens.d2.g()));
                                        break;
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                yt0.c cVar6 = this$0.f46075e;
                                if (cVar6 != null) {
                                    f0 f0Var6 = (f0) cVar6;
                                    yt0.b.a(f0Var6, h32.u0.STORY_PIN_VIDEO_TEXT_BUTTON, null, 6);
                                    f0Var6.n(null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return storyPinActionButton6;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46322i) {
            case 1:
                LinearLayout linearLayout = new LinearLayout(this.f46323j.getContext());
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                linearLayout.setOrientation(0);
                break;
        }
        return b();
    }
}
