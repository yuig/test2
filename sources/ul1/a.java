package ul1;

import android.content.Context;
import android.content.res.TypedArray;
import com.pinterest.gestalt.badge.GestaltBadge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122447i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBadge f122448j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltBadge gestaltBadge, int i13) {
        super(1);
        this.f122447i = i13;
        this.f122448j = gestaltBadge;
    }

    public final void b(i0 it) {
        int i13 = this.f122447i;
        GestaltBadge gestaltBadge = this.f122448j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = gestaltBadge.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltBadge.setText(it.a(context));
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context2 = gestaltBadge.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gestaltBadge.setContentDescription(it.a(context2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l lVar;
        int i13 = this.f122447i;
        GestaltBadge gestaltBadge = this.f122448j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltBadge.f49282d;
                gestaltBadge.getClass();
                String string = $receiver.getString(s.GestaltBadge_android_text);
                f0 h23 = string != null ? bs1.c.h2(string) : bs1.c.h2("");
                String string2 = $receiver.getString(s.GestaltBadge_android_contentDescription);
                f0 h24 = string2 != null ? bs1.c.h2(string2) : bs1.c.h2("");
                int i14 = $receiver.getInt(s.GestaltBadge_gestalt_badgeVariant, 0);
                rm1.q b13 = rm1.r.b($receiver, s.GestaltBadge_gestalt_badgeCustomIcon);
                switch (i14) {
                    case 1:
                        lVar = j.f122461e;
                        break;
                    case 2:
                        lVar = k.f122462e;
                        break;
                    case 3:
                        lVar = e.f122456e;
                        break;
                    case 4:
                        lVar = i.f122460e;
                        break;
                    case 5:
                        lVar = new h(b13);
                        break;
                    case 6:
                        lVar = new g(b13);
                        break;
                    case 7:
                        lVar = new d(b13);
                        break;
                    default:
                        lVar = f.f122457e;
                        break;
                }
                break;
            case 1:
                gestaltBadge.setId(((Number) obj).intValue());
                break;
            case 2:
                b((i0) obj);
                break;
            case 3:
                b((i0) obj);
                break;
            default:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltBadge.setVisibility(it.getVisibility());
                break;
        }
        return Unit.f80348a;
    }
}
