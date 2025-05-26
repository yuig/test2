package ln1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps0.y;
import u50.i0;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSpinner f83998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltSpinner gestaltSpinner, int i13) {
        super(1);
        this.f83997i = i13;
        this.f83998j = gestaltSpinner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f83997i;
        GestaltSpinner gestaltSpinner = this.f83998j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                y yVar = GestaltSpinner.B;
                gestaltSpinner.getClass();
                int i14 = $receiver.getInt(r.GestaltSpinner_gestalt_spinnerSize, -1);
                f fVar = i14 >= 0 ? f.values()[i14] : GestaltSpinner.F;
                int i15 = $receiver.getInt(r.GestaltSpinner_gestalt_spinnerColor, -1);
                c cVar = i15 >= 0 ? c.values()[i15] : GestaltSpinner.G;
                int i16 = $receiver.getInt(r.GestaltSpinner_gestalt_spinnerLoadingState, -1);
                e eVar = i16 >= 0 ? e.values()[i16] : GestaltSpinner.C;
                String string = $receiver.getString(r.GestaltSpinner_gestalt_spinnerLabel);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltSpinner.setVisibility(intValue);
                        break;
                    default:
                        gestaltSpinner.setId(intValue);
                        break;
                }
                break;
            case 2:
                i0 label = (i0) obj;
                Intrinsics.checkNotNullParameter(label, "label");
                Context context = gestaltSpinner.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (bs1.c.i1(label, context) && gestaltSpinner.f49599t == null) {
                    Context context2 = gestaltSpinner.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
                    pp2.a.k(gestaltText, i.f84009j);
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
                    pp2.a.P0(layoutParams, 0, dl2.b.G0(gestaltText, eo1.a.comp_spinner_label_padding), 0, 0);
                    gestaltText.setLayoutParams(layoutParams);
                    gestaltText.setMinWidth(dl2.b.G0(gestaltText, eo1.a.comp_spinner_label_min_width));
                    gestaltSpinner.addView(gestaltText);
                    gestaltSpinner.f49599t = gestaltText;
                }
                GestaltText gestaltText2 = gestaltSpinner.f49599t;
                if (gestaltText2 != null) {
                    pp2.a.k(gestaltText2, new xm1.k(8, label, gestaltSpinner));
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltSpinner.setVisibility(intValue2);
                        break;
                    default:
                        gestaltSpinner.setId(intValue2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
