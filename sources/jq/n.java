package jq;

import android.util.AttributeSet;
import android.view.View;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rm1.q;
import u50.k0;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final float f77453a = bs1.c.T(r0.pin_closeup_spacing_small);

    /* renamed from: b, reason: collision with root package name */
    public static final float f77454b = bs1.c.T(r0.pin_closeup_overlay_button_size);

    /* renamed from: c, reason: collision with root package name */
    public static final float f77455c = bs1.c.T(r0.pin_closeup_overlay_button_padding);

    public static GestaltIconButton a(ye2.m context, final q qVar, final Boolean bool, View.OnClickListener onClickListener, final int i13, final int i14) {
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        gestaltIconButton.t(new Function1() { // from class: jq.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                om1.c displayState = (om1.c) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                rm1.m mVar = displayState.f96639a;
                q icon = qVar;
                Intrinsics.checkNotNullParameter(icon, "icon");
                om1.f style = om1.f.WASH_DARK_GRAY;
                Intrinsics.checkNotNullParameter(style, "style");
                boolean booleanValue = bool.booleanValue();
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new om1.c(icon, displayState.f96640b, style, visibility, new k0(i14, new ArrayList()), booleanValue, displayState.f96645g, displayState.f96646h, i13, displayState.f96648j);
            }
        });
        gestaltIconButton.u(new m(onClickListener, gestaltIconButton, 0));
        return gestaltIconButton;
    }
}
