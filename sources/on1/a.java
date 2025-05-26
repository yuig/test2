package on1;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.y;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q5.v0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitch f96707j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSwitch gestaltSwitch, int i13) {
        super(1);
        this.f96706i = i13;
        this.f96707j = gestaltSwitch;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96706i;
        GestaltSwitch gestaltSwitch = this.f96707j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltSwitch.L;
                gestaltSwitch.getClass();
                boolean z13 = $receiver.getBoolean(x.GestaltSwitch_android_checked, false);
                boolean z14 = $receiver.getBoolean(x.GestaltSwitch_android_enabled, true);
                fm1.c Y = d7.b.Y($receiver, x.GestaltSwitch_android_visibility, GestaltSwitch.L);
                int id3 = gestaltSwitch.getId();
                int i14 = $receiver.getInt(x.GestaltSwitch_gestalt_switchTheme, GestaltSwitch.M.ordinal());
                break;
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                fm1.c cVar2 = GestaltSwitch.L;
                gestaltSwitch.m();
                break;
            case 2:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar3 = GestaltSwitch.L;
                gestaltSwitch.getClass();
                int i15 = d.f96715a[it.ordinal()];
                y yVar = gestaltSwitch.F;
                if (i15 == 1) {
                    Context context = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    gestaltSwitch.f16399b = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context, eo1.a.always_dark_gestalt_track_selector));
                    gestaltSwitch.requestLayout();
                    Context context2 = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    gestaltSwitch.f16398a = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context2, eo1.a.always_dark_gestalt_thumb_selector));
                    gestaltSwitch.requestLayout();
                } else if (i15 == 2) {
                    Context context3 = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    gestaltSwitch.f16399b = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context3, eo1.a.always_light_gestalt_track_selector));
                    gestaltSwitch.requestLayout();
                    Context context4 = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    gestaltSwitch.f16398a = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context4, eo1.a.always_light_gestalt_thumb_selector));
                    gestaltSwitch.requestLayout();
                } else if (i15 == 3) {
                    Context context5 = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    gestaltSwitch.f16399b = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context5, eo1.a.gestalt_track_selector));
                    gestaltSwitch.requestLayout();
                    Context context6 = gestaltSwitch.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    gestaltSwitch.f16398a = yVar.b(gestaltSwitch.getContext(), dl2.b.a1(context6, eo1.a.gestalt_thumb_selector));
                    gestaltSwitch.requestLayout();
                }
                break;
            case 3:
                fm1.a it2 = (fm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltSwitch.setImportantForAccessibility(it2.getImportantForAccessibility());
                break;
            default:
                v0.s(gestaltSwitch, ((Boolean) obj).booleanValue());
                break;
        }
        return Unit.f80348a;
    }
}
