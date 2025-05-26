package an1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15741i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioGroup f15742j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(GestaltRadioGroup gestaltRadioGroup, int i13) {
        super(1);
        this.f15741i = i13;
        this.f15742j = gestaltRadioGroup;
    }

    public final void b(i0 contentDescription) {
        int i13 = this.f15741i;
        int i14 = 0;
        GestaltRadioGroup gestaltRadioGroup = this.f15742j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                Context context = gestaltRadioGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltRadioGroup.setContentDescription(contentDescription.a(context));
                break;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(contentDescription, "errorMessage");
                Context context2 = gestaltRadioGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (bs1.c.i1(contentDescription, context2) && gestaltRadioGroup.f49494s == null) {
                    Context context3 = gestaltRadioGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                    pp2.a.k(gestaltText, c.f15713u);
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
                    com.bumptech.glide.c.a1(layoutParams, 0, dl2.b.G0(gestaltText, eo1.a.comp_radiogroup_vertical_padding), 0, 0);
                    gestaltText.setLayoutParams(layoutParams);
                    gestaltRadioGroup.addView(gestaltText);
                    gestaltRadioGroup.f49494s = gestaltText;
                }
                GestaltText gestaltText2 = gestaltRadioGroup.f49494s;
                if (gestaltText2 != null) {
                    gestaltText2.i(new m(contentDescription, gestaltRadioGroup, i14));
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(contentDescription, "legendText");
                Object value = gestaltRadioGroup.f49492q.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((GestaltText) value).i(new m(gestaltRadioGroup, contentDescription));
                break;
            case 6:
                Intrinsics.checkNotNullParameter(contentDescription, "helperText");
                Context context4 = gestaltRadioGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                if (bs1.c.i1(contentDescription, context4) && gestaltRadioGroup.f49493r == null) {
                    Context context5 = gestaltRadioGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    GestaltText gestaltText3 = new GestaltText(6, context5, (AttributeSet) null);
                    pp2.a.k(gestaltText3, c.f15714v);
                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-1, -2);
                    com.bumptech.glide.c.a1(layoutParams2, 0, dl2.b.G0(gestaltText3, eo1.a.comp_radiogroup_vertical_padding), 0, 0);
                    gestaltText3.setLayoutParams(layoutParams2);
                    gestaltRadioGroup.addView(gestaltText3);
                    gestaltRadioGroup.f49493r = gestaltText3;
                }
                GestaltText gestaltText4 = gestaltRadioGroup.f49493r;
                if (gestaltText4 != null) {
                    gestaltText4.i(new m(contentDescription, gestaltRadioGroup, 1));
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15741i;
        GestaltRadioGroup gestaltRadioGroup = this.f15742j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltRadioGroup.f49488x;
                gestaltRadioGroup.getClass();
                String string = $receiver.getString(bn1.d.GestaltRadioGroup_gestalt_legend);
                i0 h23 = string != null ? bs1.c.h2(string) : GestaltRadioGroup.f49489y;
                String string2 = $receiver.getString(bn1.d.GestaltRadioGroup_gestalt_helperText);
                i0 h24 = string2 != null ? bs1.c.h2(string2) : GestaltRadioGroup.f49490z;
                String string3 = $receiver.getString(bn1.d.GestaltRadioGroup_gestalt_errorMessage);
                i0 h25 = string3 != null ? bs1.c.h2(string3) : GestaltRadioGroup.A;
                fm1.c Y = d7.b.Y($receiver, bn1.d.GestaltRadioGroup_android_visibility, GestaltRadioGroup.f49488x);
                String string4 = $receiver.getString(bn1.d.GestaltRadioGroup_android_contentDescription);
                return new l(h23, h24, h25, q0.f80391a, GestaltRadioGroup.C, Y, string4 != null ? bs1.c.p2(string4) : GestaltRadioGroup.B, gestaltRadioGroup.getId());
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = GestaltRadioGroup.f49488x;
                gestaltRadioGroup.getClass();
                gestaltRadioGroup.f49491p.F(im1.m.f72668n, new k(gestaltRadioGroup, 9));
                return Unit.f80348a;
            case 2:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 2:
                        gestaltRadioGroup.setVisibility(intValue);
                        break;
                    default:
                        gestaltRadioGroup.setId(intValue);
                        break;
                }
                return Unit.f80348a;
            case 3:
                b((i0) obj);
                return Unit.f80348a;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 2:
                        gestaltRadioGroup.setVisibility(intValue2);
                        break;
                    default:
                        gestaltRadioGroup.setId(intValue2);
                        break;
                }
                return Unit.f80348a;
            case 5:
                b((i0) obj);
                return Unit.f80348a;
            case 6:
                b((i0) obj);
                return Unit.f80348a;
            case 7:
                b((i0) obj);
                return Unit.f80348a;
            case 8:
                List<e> options = (List) obj;
                Intrinsics.checkNotNullParameter(options, "options");
                fm1.c cVar3 = GestaltRadioGroup.f49488x;
                Object value = gestaltRadioGroup.f49495t.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((RadioGroup) value).removeAllViews();
                int i14 = 0;
                for (e eVar : options) {
                    int i15 = i14 + 1;
                    Context context = gestaltRadioGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltRadioButton gestaltRadioButton = new GestaltRadioButton(context, eVar);
                    gestaltRadioButton.setTag(Integer.valueOf(i14));
                    la1.k eventHandler = new la1.k(17, gestaltRadioButton, gestaltRadioGroup);
                    Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                    if (i14 == options.size() - 1) {
                        ViewGroup.LayoutParams layoutParams = gestaltRadioButton.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                        gestaltRadioButton.setLayoutParams(layoutParams2);
                    }
                    Object value2 = gestaltRadioGroup.f49495t.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((RadioGroup) value2).addView(gestaltRadioButton);
                    i14 = i15;
                }
                return Unit.f80348a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new o(gestaltRadioGroup.getId());
        }
    }
}
