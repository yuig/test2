package om1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96637i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f96638j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltIconButton gestaltIconButton, int i13) {
        super(1);
        this.f96637i = i13;
        this.f96638j = gestaltIconButton;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f96637i;
        GestaltIconButton gestaltIconButton = this.f96638j;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return new l(gestaltIconButton.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new m(gestaltIconButton.getId());
        }
    }

    public final void e(i0 i0Var) {
        int i13 = this.f96637i;
        GestaltIconButton gestaltIconButton = this.f96638j;
        switch (i13) {
            case 2:
                if (i0Var != null) {
                    ps0.m mVar = GestaltIconButton.A;
                    if (!gestaltIconButton.C()) {
                        GestaltText gestaltText = gestaltIconButton.f49390v;
                        if (gestaltText != null) {
                            gestaltText.i(a.f96635n);
                            break;
                        }
                    } else {
                        if (gestaltIconButton.f49390v == null) {
                            Context context = gestaltIconButton.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
                            gestaltText2.i(a.f96634m);
                            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                            pp2.a.P0(layoutParams, 0, dl2.b.G0(gestaltText2, eo1.a.comp_iconbutton_xl_vertical_gap), 0, 0);
                            gestaltText2.setLayoutParams(layoutParams);
                            gestaltIconButton.addView(gestaltText2);
                            gestaltIconButton.f49390v = gestaltText2;
                        }
                        GestaltText gestaltText3 = gestaltIconButton.f49390v;
                        if (gestaltText3 != null) {
                            gestaltText3.i(new com.pinterest.framework.screens.q(28, gestaltIconButton, i0Var));
                            break;
                        }
                    }
                }
                break;
            default:
                if (i0Var != null) {
                    Context context2 = gestaltIconButton.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    gestaltIconButton.setContentDescription(i0Var.a(context2));
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96637i;
        GestaltIconButton gestaltIconButton = this.f96638j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                ps0.m mVar = GestaltIconButton.A;
                gestaltIconButton.getClass();
                rm1.m b13 = rm1.r.b($receiver, x.GestaltIconButton_gestalt_iconButtonIcon);
                if (b13 == null) {
                    int i14 = x.GestaltIconButton_gestalt_iconButtonIconCompact;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    b13 = rm1.r.c($receiver.getString(i14));
                }
                if (b13 == null) {
                    b13 = GestaltIconButton.E;
                }
                rm1.m mVar2 = b13;
                int i15 = $receiver.getInt(x.GestaltIconButton_gestalt_iconButtonSize, -1);
                e eVar = i15 >= 0 ? e.values()[i15] : GestaltIconButton.B;
                int i16 = $receiver.getInt(x.GestaltIconButton_gestalt_iconButtonStyle, -1);
                f fVar = i16 >= 0 ? f.values()[i16] : GestaltIconButton.C;
                fm1.c Y = d7.b.Y($receiver, x.GestaltIconButton_android_visibility, GestaltIconButton.D);
                String string = $receiver.getString(x.GestaltIconButton_android_contentDescription);
                f0 p23 = string != null ? bs1.c.p2(string) : null;
                boolean z13 = $receiver.getBoolean(x.GestaltIconButton_android_enabled, true);
                String string2 = $receiver.getString(x.GestaltIconButton_gestalt_iconButtonLabelText);
                return new c(mVar2, eVar, fVar, Y, p23, z13, string2 != null ? bs1.c.p2(string2) : null, $receiver.getInt(x.GestaltIconButton_gestalt_iconButtonNumberOnBadge, 0), gestaltIconButton.getId(), com.bumptech.glide.c.N($receiver, x.GestaltIconButton_android_importantForAccessibility));
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                ps0.m mVar3 = GestaltIconButton.A;
                gestaltIconButton.A();
                return Unit.f80348a;
            case 2:
                e((i0) obj);
                return Unit.f80348a;
            case 3:
                int intValue = ((Number) obj).intValue();
                GestaltIndicator gestaltIndicator = gestaltIconButton.f49391w;
                if (gestaltIndicator != null) {
                    int G0 = dl2.b.G0(gestaltIconButton, intValue);
                    ViewGroup.LayoutParams layoutParams = gestaltIndicator.getLayoutParams();
                    Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, G0, G0, 0);
                    gestaltIndicator.setLayoutParams(layoutParams2);
                }
                return Unit.f80348a;
            case 4:
                fm1.a it = (fm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int importantForAccessibility = it.getImportantForAccessibility();
                ps0.m mVar4 = GestaltIconButton.A;
                gestaltIconButton.setImportantForAccessibility(importantForAccessibility);
                return Unit.f80348a;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ps0.m mVar5 = GestaltIconButton.A;
                gestaltIconButton.setEnabled(booleanValue);
                return Unit.f80348a;
            case 6:
                fm1.c visibility = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                int visibility2 = visibility.getVisibility();
                ps0.m mVar6 = GestaltIconButton.A;
                gestaltIconButton.setVisibility(visibility2);
                return Unit.f80348a;
            case 7:
                e((i0) obj);
                return Unit.f80348a;
            case 8:
                Unit it2 = (Unit) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        View.OnClickListener onClickListener = gestaltIconButton.f49386r;
                        if (onClickListener != null) {
                            onClickListener.onClick(gestaltIconButton);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ps0.m mVar7 = GestaltIconButton.A;
                        gestaltIconButton.getClass();
                        break;
                }
                return Unit.f80348a;
            case 9:
                return b((Unit) obj);
            case 10:
                Unit it3 = (Unit) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        View.OnClickListener onClickListener2 = gestaltIconButton.f49386r;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(gestaltIconButton);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        ps0.m mVar8 = GestaltIconButton.A;
                        gestaltIconButton.getClass();
                        break;
                }
                return Unit.f80348a;
            default:
                return b((Unit) obj);
        }
    }
}
