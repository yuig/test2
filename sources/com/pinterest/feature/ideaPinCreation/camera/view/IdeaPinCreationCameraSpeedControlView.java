package com.pinterest.feature.ideaPinCreation.camera.view;

import a71.c;
import android.content.Context;
import android.util.AttributeSet;
import aq1.d;
import aq1.h;
import c2.h5;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import t3.s1;
import zv0.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinCreationCameraSpeedControlView;", "Lcom/pinterest/feature/ideaPinCreation/camera/view/BaseControlView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationCameraSpeedControlView extends BaseControlView<Float> {

    /* renamed from: f, reason: collision with root package name */
    public final List f45922f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f45923g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraSpeedControlView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final String T(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        Object[] objArr = {Float.valueOf(floatValue)};
        String string = getContext().getString(h.story_pin_camera_speed_multiplier, floatValue < 1.0f ? z.n(s1.d(objArr, 1, "%.1f", "format(...)"), "0.", ".") : s1.d(objArr, 1, "%.0f", "format(...)"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final void X(Object obj) {
        u0 u0Var;
        float floatValue = ((Number) obj).floatValue();
        this.f45896b = Float.valueOf(floatValue);
        Function1 function1 = this.f45923g;
        if (function1 != null) {
            function1.invoke(Float.valueOf(floatValue));
        }
        if (floatValue == 0.3f) {
            u0Var = u0.STORY_PIN_CAMERA_SPEED_0_3X_BUTTON;
        } else if (floatValue == 0.5f) {
            u0Var = u0.STORY_PIN_CAMERA_SPEED_0_5X_BUTTON;
        } else if (floatValue == 1.0f) {
            u0Var = u0.STORY_PIN_CAMERA_SPEED_1X_BUTTON;
        } else {
            if (floatValue != 2.0f) {
                if (floatValue == 3.0f) {
                    u0Var = u0.STORY_PIN_CAMERA_SPEED_3X_BUTTON;
                }
                L(false);
                d0();
            }
            u0Var = u0.STORY_PIN_CAMERA_SPEED_2X_BUTTON;
        }
        c cVar = this.f45898d;
        if (cVar != null) {
            cVar.c(u0Var);
        }
        L(false);
        d0();
    }

    @Override // com.pinterest.feature.ideaPinCreation.camera.view.BaseControlView
    public final void Z(GestaltText textView, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.i(new h5(this, floatValue, 3));
    }

    public final void g0(i iVar) {
        this.f45923g = iVar;
    }

    public final void k0(float f13) {
        this.f45896b = Float.valueOf(f13);
        d0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationCameraSpeedControlView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Float valueOf = Float.valueOf(0.3f);
        Float valueOf2 = Float.valueOf(0.5f);
        Float valueOf3 = Float.valueOf(1.0f);
        List j13 = f0.j(valueOf, valueOf2, valueOf3, Float.valueOf(2.0f), Float.valueOf(3.0f));
        this.f45922f = j13;
        Intrinsics.checkNotNullParameter(j13, "<set-?>");
        this.f45895a = j13;
        this.f45896b = valueOf3;
        this.f45897c = Integer.valueOf(d.speed_multiplier);
        a0();
        d0();
    }
}
