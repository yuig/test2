package am1;

import android.content.Context;
import android.content.res.TypedArray;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButtonSocial f15522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltButtonSocial gestaltButtonSocial, int i13) {
        super(1);
        this.f15521i = i13;
        this.f15522j = gestaltButtonSocial;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15521i;
        GestaltButtonSocial gestaltButtonSocial = this.f15522j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltButtonSocial.f49326v;
                gestaltButtonSocial.getClass();
                int i14 = l.GestaltButtonSocial_gestalt_buttonSocialServiceVariant;
                d dVar = d.EMAIL;
                int i15 = $receiver.getInt(i14, -1);
                if (i15 >= 0) {
                    dVar = d.values()[i15];
                }
                int i16 = l.GestaltButtonSocial_gestalt_buttonSocialLabelType;
                c cVar2 = c.CONTINUE;
                int i17 = $receiver.getInt(i16, -1);
                c cVar3 = i17 >= 0 ? c.values()[i17] : cVar2;
                boolean z13 = $receiver.getBoolean(l.GestaltButtonSocial_android_enabled, true);
                fm1.c Y = d7.b.Y($receiver, l.GestaltButtonSocial_android_visibility, GestaltButtonSocial.f49326v);
                String string = $receiver.getString(l.GestaltButtonSocial_android_contentDescription);
                if (string == null) {
                    string = "";
                }
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltButtonSocial.setId(intValue);
                        break;
                    default:
                        gestaltButtonSocial.setVisibility(intValue);
                        break;
                }
                break;
            case 2:
                gestaltButtonSocial.setEnabled(((Boolean) obj).booleanValue());
                break;
            case 3:
                i0 contentDescription = (i0) obj;
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                Context context = gestaltButtonSocial.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltButtonSocial.setContentDescription(contentDescription.a(context));
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltButtonSocial.setId(intValue2);
                        break;
                    default:
                        gestaltButtonSocial.setVisibility(intValue2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
