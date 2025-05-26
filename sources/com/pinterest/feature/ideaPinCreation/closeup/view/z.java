package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.ViewGroup;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46386i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f46387j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(f0 f0Var, int i13) {
        super(0);
        this.f46386i = i13;
        this.f46387j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46386i;
        f0 f0Var = this.f46387j;
        switch (i13) {
            case 0:
                return (StoryPinBottomToolbar) f0.j(f0Var).findViewById(aq1.d.expressive_bottom_toolbar);
            case 1:
                return (RoundedCornersLayout) f0.j(f0Var).findViewById(aq1.d.rounded_corners_layout);
            case 2:
                return (IdeaPinColorEyeDropperView) f0.j(f0Var).findViewById(aq1.d.story_pin_color_eye_dropper);
            case 3:
                return (ViewGroup) f0.j(f0Var).findViewById(aq1.d.content_container);
            case 4:
                return (GestaltIconButton) f0.j(f0Var).findViewById(aq1.d.delete_button);
            case 5:
                wk2.a aVar = f0Var.f46153c;
                if (aVar != null) {
                    return (lh0.s1) aVar.get();
                }
                Intrinsics.r("experimentsProvider");
                throw null;
            case 6:
                return (IdeaPinHandDrawingEditor) f0.j(f0Var).findViewById(aq1.d.drawing_editor);
            case 7:
                return (IdeaPinHandDrawingView) f0.j(f0Var).findViewById(aq1.d.drawing_view);
            case 8:
                IdeaPinInteractiveImageView ideaPinInteractiveImageView = (IdeaPinInteractiveImageView) f0.j(f0Var).findViewById(aq1.d.image_view);
                ideaPinInteractiveImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
                return ideaPinInteractiveImageView;
            case 9:
                return f0.j(f0Var).findViewById(aq1.d.view_missing_media);
            case 10:
                return (IdeaPinOverlayViewColorPickerModal) f0.j(f0Var).findViewById(aq1.d.overlay_color_picker_modal);
            case 11:
                return (IdeaPinPageColorPickerModal) f0.j(f0Var).findViewById(aq1.d.page_color_picker_modal);
            case 12:
                return (IdeaPinTextEditor) f0.j(f0Var).findViewById(aq1.d.text_editor);
            case 13:
                return (GestaltIcon) f0.j(f0Var).findViewById(aq1.d.play_button);
            case 14:
                return (IdeaPinVideoSeekBarView) f0.j(f0Var).findViewById(aq1.d.video_seek_bar);
            default:
                return (IdeaPinInteractiveVideoView) f0.j(f0Var).findViewById(aq1.d.video_view);
        }
    }
}
