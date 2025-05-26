package um1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122784i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIndicator f122785j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltIndicator gestaltIndicator, int i13) {
        super(1);
        this.f122784i = i13;
        this.f122785j = gestaltIndicator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122784i;
        GestaltIndicator gestaltIndicator = this.f122785j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltIndicator.f49407b;
                gestaltIndicator.getClass();
                int i14 = $receiver.getInt(g.GestaltIndicator_gestalt_indicatorCount, -1);
                fm1.c Y = d7.b.Y($receiver, g.GestaltIndicator_android_visibility, GestaltIndicator.f49407b);
                String string = $receiver.getString(g.GestaltIndicator_android_contentDescription);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltIndicator.setVisibility(intValue);
                        break;
                    default:
                        gestaltIndicator.setId(intValue);
                        break;
                }
                break;
            case 2:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    gestaltIndicator.setVisibility(8);
                } else if (num == null || num.intValue() < 0 || num.intValue() > 99) {
                    fm1.c cVar2 = GestaltIndicator.f49407b;
                    gestaltIndicator.getClass();
                    int G0 = dl2.b.G0(gestaltIndicator, eo1.a.comp_indicator_default_container_size);
                    ViewGroup.LayoutParams layoutParams = gestaltIndicator.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = G0;
                        layoutParams.height = G0;
                    }
                    gestaltIndicator.setBackground(bs1.c.f0(gestaltIndicator, e.default_indicator_drawable, null, null, 6));
                    gestaltIndicator.setText("");
                } else {
                    int intValue2 = num.intValue();
                    fm1.c cVar3 = GestaltIndicator.f49407b;
                    gestaltIndicator.getClass();
                    gestaltIndicator.setMinWidth(dl2.b.G0(gestaltIndicator, eo1.a.comp_indicator_numeric_min_container_width));
                    ViewGroup.LayoutParams layoutParams2 = gestaltIndicator.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = -2;
                        layoutParams2.height = -2;
                    }
                    gestaltIndicator.setBackground(bs1.c.f0(gestaltIndicator, e.numeric_indicator_drawable, null, null, 6));
                    gestaltIndicator.setTextAppearance(f.GestaltIndicator);
                    gestaltIndicator.setTextAlignment(4);
                    gestaltIndicator.setText(String.valueOf(intValue2));
                    if (String.valueOf(intValue2).length() > 1) {
                        int G02 = dl2.b.G0(gestaltIndicator, eo1.a.comp_indicator_numeric_horizontal_padding);
                        gestaltIndicator.setPaddingRelative(G02, gestaltIndicator.getPaddingTop(), G02, gestaltIndicator.getPaddingBottom());
                    } else {
                        int G03 = dl2.b.G0(gestaltIndicator, eo1.a.comp_indicator_numeric_one_digit_horizontal_padding);
                        gestaltIndicator.setPaddingRelative(G03, gestaltIndicator.getPaddingTop(), G03, gestaltIndicator.getPaddingBottom());
                    }
                }
                gestaltIndicator.requestLayout();
                break;
            case 3:
                i0 contentDescription = (i0) obj;
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                Context context = gestaltIndicator.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltIndicator.setContentDescription(contentDescription.a(context));
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltIndicator.setVisibility(intValue3);
                        break;
                    default:
                        gestaltIndicator.setId(intValue3);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
