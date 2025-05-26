package ul1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.pinterest.gestalt.badge.GestaltBadge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122467i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBadge f122468j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f122469k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(GestaltBadge gestaltBadge, c cVar, int i13) {
        super(1);
        this.f122467i = i13;
        this.f122468j = gestaltBadge;
        this.f122469k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Drawable drawable;
        int i13 = this.f122467i;
        c cVar = this.f122469k;
        GestaltBadge gestaltBadge = this.f122468j;
        switch (i13) {
            case 0:
                c newState = (c) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                fm1.c cVar2 = GestaltBadge.f49282d;
                gestaltBadge.m(cVar, newState);
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    GestaltBadge.j(gestaltBadge, GestaltBadge.i(gestaltBadge, cVar.f122451c), cVar.f122451c.f122466d);
                } else {
                    gestaltBadge.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                break;
            default:
                l variant = (l) obj;
                Intrinsics.checkNotNullParameter(variant, "variant");
                Context context = gestaltBadge.getContext();
                int i14 = q.gestalt_badge_background;
                Object obj2 = d5.a.f53679a;
                Drawable drawable2 = context.getDrawable(i14);
                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    drawable.setTint(dl2.b.y0(gestaltBadge, variant.f122464b));
                }
                gestaltBadge.setBackground(drawable);
                gestaltBadge.setTextColor(dl2.b.y0(gestaltBadge, variant.f122463a));
                if (cVar.f122454f) {
                    GestaltBadge.j(gestaltBadge, GestaltBadge.i(gestaltBadge, variant), variant.f122466d);
                } else {
                    gestaltBadge.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                break;
        }
        return Unit.f80348a;
    }
}
