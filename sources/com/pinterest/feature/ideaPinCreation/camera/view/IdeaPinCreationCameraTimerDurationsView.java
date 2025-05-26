package com.pinterest.feature.ideaPinCreation.camera.view;

import a71.c;
import android.content.Context;
import android.util.AttributeSet;
import aq1.d;
import aq1.h;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import org.jetbrains.annotations.NotNull;
import rt0.e;
import tt0.n0;
import tt0.o0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCreationCameraTimerDurationsView;", "Lcom/pinterest/feature/ideaPinCreation/camera/view/BaseControlView;", "Lrt0/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tt0/n0", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationCameraTimerDurationsView extends BaseControlView<e> {

    /* renamed from: f, reason: collision with root package name */
    public n0 f45924f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraTimerDurationsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final String T(Object obj) {
        e element = (e) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        if (o0.f119195a[element.ordinal()] != 1) {
            return element.getDisplayString();
        }
        String string = getResources().getString(h.idea_pin_camera_off);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final void X(Object obj) {
        u0 u0Var;
        e duration = (e) obj;
        Intrinsics.checkNotNullParameter(duration, "element");
        n0 n0Var = this.f45924f;
        if (n0Var != null) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            ((CameraSidebarControlsView) n0Var).i(duration);
        }
        this.f45896b = duration;
        d0();
        L(false);
        c cVar = this.f45898d;
        if (cVar != null) {
            int i13 = o0.f119195a[duration.ordinal()];
            if (i13 == 1) {
                u0Var = u0.IDEA_PIN_CAMERA_TIMER_OFF_BUTTON;
            } else if (i13 == 2) {
                u0Var = u0.IDEA_PIN_CAMERA_TIMER_3S_BUTTON;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                u0Var = u0.IDEA_PIN_CAMERA_TIMER_10S_BUTTON;
            }
            cVar.c(u0Var);
        }
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final void Z(GestaltText textView, Object obj) {
        e element = (e) obj;
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(element, "element");
        textView.i(new g1(24, element, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraTimerDurationsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        List b03 = c0.b0(e.values());
        Intrinsics.checkNotNullParameter(b03, "<set-?>");
        this.f45895a = b03;
        this.f45896b = e.OFF;
        this.f45897c = Integer.valueOf(d.timer_duration);
        a0();
        d0();
    }
}
