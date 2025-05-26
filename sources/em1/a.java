package em1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rq.n3;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59594i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltCheckBox f59595j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltCheckBox gestaltCheckBox, int i13) {
        super(1);
        this.f59594i = i13;
        this.f59595j = gestaltCheckBox;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59594i;
        CharSequence charSequence = null;
        GestaltCheckBox gestaltCheckBox = this.f59595j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                b bVar = GestaltCheckBox.f49354f;
                gestaltCheckBox.getClass();
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                b bVar2 = GestaltCheckBox.f49354f;
                Intrinsics.checkNotNullParameter(bVar2, "default");
                int i14 = $receiver.getInt(r.GestaltCheckbox_gestalt_checkboxCheckedState, -1);
                if (i14 != -1) {
                    bVar2 = b.values()[i14];
                }
                b bVar3 = bVar2;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                e eVar = GestaltCheckBox.f49355g;
                Intrinsics.checkNotNullParameter(eVar, "default");
                int i15 = $receiver.getInt(r.GestaltCheckbox_gestalt_checkboxVariant, -1);
                if (i15 != -1) {
                    eVar = e.values()[i15];
                }
                e eVar2 = eVar;
                String string = $receiver.getString(r.GestaltCheckbox_android_label);
                i0 x13 = string != null ? ep.b.x(string, "string", string) : GestaltCheckBox.f49357i;
                fm1.c Y = d7.b.Y($receiver, r.GestaltCheckbox_android_visibility, GestaltCheckBox.f49356h);
                String string2 = $receiver.getString(r.GestaltCheckbox_gestalt_checkboxHelperText);
                i0 x14 = string2 != null ? ep.b.x(string2, "string", string2) : GestaltCheckBox.f49358j;
                String string3 = $receiver.getString(r.GestaltCheckbox_android_contentDescription);
                f0 x15 = string3 != null ? ep.b.x(string3, "string", string3) : null;
                boolean z13 = $receiver.getBoolean(r.GestaltCheckbox_gestalt_checkboxSupportLinks, false);
                int i16 = $receiver.getInt(r.GestaltCheckbox_android_maxLines, 1);
                int i17 = $receiver.getInt(r.GestaltCheckbox_android_ellipsize, -1);
                break;
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                b bVar4 = GestaltCheckBox.f49354f;
                int i18 = f.f59608a[gestaltCheckBox.a0().f59599b.ordinal()];
                com.google.firebase.messaging.q qVar = gestaltCheckBox.f49360a;
                if (i18 != 1) {
                    int i19 = 2;
                    if (i18 != 2) {
                        int i23 = 3;
                        if (i18 == 3) {
                            gestaltCheckBox.setClickable(true);
                            qVar.a(new a(gestaltCheckBox, i19), new a(gestaltCheckBox, i23));
                        }
                        break;
                    }
                }
                gestaltCheckBox.setClickable(false);
                ((View) qVar.f33805c).setOnTouchListener(null);
                GestaltText gestaltText = gestaltCheckBox.f49363d;
                if (gestaltText != null) {
                    gestaltText.j(new n3(15));
                }
            case 2:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                b bVar5 = GestaltCheckBox.f49354f;
                gestaltCheckBox.getClass();
                break;
            case 3:
                Unit it3 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 4:
                gestaltCheckBox.setId(((Number) obj).intValue());
                break;
            case 5:
                fm1.c it4 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                gestaltCheckBox.setVisibility(it4.getVisibility());
                break;
            case 6:
                b it5 = (b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                b bVar6 = GestaltCheckBox.f49354f;
                gestaltCheckBox.Z().setChecked(it5 == b.CHECKED);
                break;
            default:
                i0 i0Var = (i0) obj;
                if (i0Var != null) {
                    Context context = gestaltCheckBox.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    charSequence = i0Var.a(context);
                }
                gestaltCheckBox.setContentDescription(charSequence);
                break;
        }
        return Unit.f80348a;
    }
}
