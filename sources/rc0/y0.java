package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f107485j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wm1.z f107486k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wm1.s f107487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wm1.n f107488m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(boolean z13, wm1.z zVar, wm1.s sVar, wm1.n nVar, int i13) {
        super(1);
        this.f107484i = i13;
        this.f107485j = z13;
        this.f107486k = zVar;
        this.f107487l = sVar;
        this.f107488m = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107484i) {
            case 0:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f130310a = this.f107485j;
                wm1.z startItem = this.f107486k;
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                wm1.s middleItem = this.f107487l;
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.n endItem = this.f107488m;
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltListAction gestaltListAction = new GestaltListAction(6, context, (AttributeSet) null);
                kg.a.h(gestaltListAction, new y0(this.f107485j, this.f107486k, this.f107487l, this.f107488m, 0));
                gestaltListAction.Z(new bp.j(9, context, gestaltListAction));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_default));
                frameLayout.addView(gestaltListAction);
                return frameLayout;
        }
    }
}
