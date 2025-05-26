package wn1;

import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextComposer f130560j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, GestaltTextComposer gestaltTextComposer) {
        super(0);
        this.f130559i = i13;
        this.f130560j = gestaltTextComposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f130559i;
        GestaltTextComposer gestaltTextComposer = this.f130560j;
        switch (i13) {
            case 0:
                return (ConstraintLayout) gestaltTextComposer.findViewById(c0.button_container);
            case 1:
                return (GestaltText) gestaltTextComposer.findViewById(c0.counter_max_length);
            case 2:
                return (TextInputEditText) gestaltTextComposer.findViewById(c0.edit_text);
            case 3:
                return (WebImageView) gestaltTextComposer.findViewById(c0.media);
            case 4:
                switch (i13) {
                    case 4:
                        return (GestaltIconButton) gestaltTextComposer.findViewById(c0.media_remove_button);
                    default:
                        return (GestaltIconButton) gestaltTextComposer.findViewById(c0.primary_button);
                }
            case 5:
                switch (i13) {
                    case 4:
                        return (GestaltIconButton) gestaltTextComposer.findViewById(c0.media_remove_button);
                    default:
                        return (GestaltIconButton) gestaltTextComposer.findViewById(c0.primary_button);
                }
            case 6:
                return (NestedScrollView) gestaltTextComposer.findViewById(c0.scroll);
            case 7:
                return (Space) gestaltTextComposer.findViewById(c0.scroll_bottom_constraint);
            case 8:
                switch (i13) {
                    case 8:
                        return (GestaltIcon) gestaltTextComposer.findViewById(c0.secondary_button);
                    default:
                        return (GestaltIcon) gestaltTextComposer.findViewById(c0.tertiary_button);
                }
            case 9:
                switch (i13) {
                    case 9:
                        return (FrameLayout) gestaltTextComposer.findViewById(c0.secondary_button_wrapper);
                    default:
                        return (FrameLayout) gestaltTextComposer.findViewById(c0.tertiary_button_wrapper);
                }
            case 10:
                switch (i13) {
                    case 8:
                        return (GestaltIcon) gestaltTextComposer.findViewById(c0.secondary_button);
                    default:
                        return (GestaltIcon) gestaltTextComposer.findViewById(c0.tertiary_button);
                }
            default:
                switch (i13) {
                    case 9:
                        return (FrameLayout) gestaltTextComposer.findViewById(c0.secondary_button_wrapper);
                    default:
                        return (FrameLayout) gestaltTextComposer.findViewById(c0.tertiary_button_wrapper);
                }
        }
    }
}
