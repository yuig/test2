package ym1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139425i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltPopoverMessage f139426j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f139427k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GestaltPopoverMessage gestaltPopoverMessage, c cVar, int i13) {
        super(1);
        this.f139425i = i13;
        this.f139426j = gestaltPopoverMessage;
        this.f139427k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fm1.c cVar;
        ViewParent parent;
        int i13 = this.f139425i;
        c cVar2 = this.f139427k;
        GestaltPopoverMessage gestaltPopoverMessage = this.f139426j;
        switch (i13) {
            case 0:
                c newState = (c) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                fm1.c cVar3 = GestaltPopoverMessage.A;
                gestaltPopoverMessage.g0(cVar2, newState);
                break;
            case 1:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                if (gestaltPopoverMessage.f49461i > 1) {
                    cVar = fm1.c.GONE;
                } else {
                    d dVar = cVar2.f139414c;
                    if (dVar == null || (cVar = dVar.f139420b) == null) {
                        cVar = fm1.c.VISIBLE;
                    }
                }
                bind.e(cVar);
                if (cVar2.f139414c == null) {
                    int i14 = b0.popover_educational_end_button;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    k0 text = new k0(i14, new ArrayList(0));
                    Intrinsics.checkNotNullParameter(text, "text");
                    bind.f139348a = text;
                    bind.f139356i = z.popover_button_end;
                }
                break;
            case 2:
                rn1.k bind2 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                i0 text2 = (i0) cVar2.f139413b.get(gestaltPopoverMessage.f49460h - 1);
                if (text2 != null) {
                    bind2.getClass();
                    Intrinsics.checkNotNullParameter(text2, "text");
                    bind2.f108886a = text2;
                }
                break;
            case 3:
                g variant = (g) obj;
                Intrinsics.checkNotNullParameter(variant, "variant");
                if (variant == g.NOTIFICATION) {
                    fm1.c cVar4 = GestaltPopoverMessage.A;
                    gestaltPopoverMessage.X().setBackgroundResource(eo1.d.gestalt_popover_notification_background);
                    GestaltPopoverMessage.L(gestaltPopoverMessage, cVar2.f139415d);
                }
                break;
            default:
                fm1.c cVar5 = GestaltPopoverMessage.A;
                gestaltPopoverMessage.getClass();
                View view = cVar2.f139417f;
                if (view != null) {
                    View findViewById = gestaltPopoverMessage.findViewById(z.popover_custom_view);
                    if (findViewById != null) {
                        gestaltPopoverMessage.removeView(findViewById);
                    }
                    ViewParent parent2 = view.getParent();
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                    }
                    view.setLayoutParams(layoutParams);
                    view.setId(z.popover_custom_view);
                    gestaltPopoverMessage.X().addView(view);
                    gestaltPopoverMessage.f49464l = view;
                    ConstraintLayout X = gestaltPopoverMessage.X();
                    androidx.constraintlayout.widget.p pVar = gestaltPopoverMessage.f49465m;
                    pVar.j(X);
                    View view2 = gestaltPopoverMessage.f49464l;
                    Intrinsics.f(view2);
                    gestaltPopoverMessage.f49465m.m(view2.getId(), 6, 0, 6, gestaltPopoverMessage.a0());
                    View view3 = gestaltPopoverMessage.f49464l;
                    Intrinsics.f(view3);
                    gestaltPopoverMessage.f49465m.m(view3.getId(), 3, 0, 3, gestaltPopoverMessage.a0());
                    View view4 = gestaltPopoverMessage.f49464l;
                    Intrinsics.f(view4);
                    gestaltPopoverMessage.f49465m.m(view4.getId(), 7, 0, 7, gestaltPopoverMessage.a0());
                    View view5 = gestaltPopoverMessage.f49464l;
                    Intrinsics.f(view5);
                    gestaltPopoverMessage.f49465m.m(view5.getId(), 4, 0, 4, gestaltPopoverMessage.a0());
                    pVar.b(gestaltPopoverMessage.X());
                }
                if (view != null && (parent = view.getParent()) != null) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView(gestaltPopoverMessage.f49458f);
                    viewGroup.removeView(gestaltPopoverMessage.f49459g);
                    viewGroup.removeView(gestaltPopoverMessage.f49454b);
                    viewGroup.removeView(gestaltPopoverMessage.f49455c);
                    viewGroup.removeView(gestaltPopoverMessage.f49453a);
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, GestaltPopoverMessage gestaltPopoverMessage) {
        super(1);
        this.f139425i = 2;
        this.f139427k = cVar;
        this.f139426j = gestaltPopoverMessage;
    }
}
