package nm1;

import android.content.Context;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91434i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltHeaderBar f91435j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(GestaltHeaderBar gestaltHeaderBar, int i13) {
        super(1);
        this.f91434i = i13;
        this.f91435j = gestaltHeaderBar;
    }

    public final void b(int i13) {
        int i14 = this.f91434i;
        GestaltHeaderBar gestaltHeaderBar = this.f91435j;
        switch (i14) {
            case 0:
                gestaltHeaderBar.setId(i13);
                break;
            case 1:
            case 3:
            default:
                gestaltHeaderBar.setId(i13);
                break;
            case 2:
                gestaltHeaderBar.setId(i13);
                break;
            case 4:
                gestaltHeaderBar.setId(i13);
                break;
        }
    }

    public final void e(h0 variant) {
        int i13 = this.f91434i;
        GestaltHeaderBar gestaltHeaderBar = this.f91435j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(variant, "variant");
                int backgroundColor$headerBar_release = variant.getBackgroundColor$headerBar_release();
                Context context = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltHeaderBar.setBackgroundColor(dl2.b.x0(context, backgroundColor$headerBar_release));
                break;
            case 2:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(variant, "variant");
                int backgroundColor$headerBar_release2 = variant.getBackgroundColor$headerBar_release();
                Context context2 = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gestaltHeaderBar.setBackgroundColor(dl2.b.x0(context2, backgroundColor$headerBar_release2));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(variant, "variant");
                int backgroundColor$headerBar_release3 = variant.getBackgroundColor$headerBar_release();
                Context context3 = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                gestaltHeaderBar.setBackgroundColor(dl2.b.x0(context3, backgroundColor$headerBar_release3));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(variant, "variant");
                int backgroundColor$headerBar_release4 = variant.getBackgroundColor$headerBar_release();
                Context context4 = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                gestaltHeaderBar.setBackgroundColor(dl2.b.x0(context4, backgroundColor$headerBar_release4));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91434i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            case 1:
                e((h0) obj);
                break;
            case 2:
                b(((Number) obj).intValue());
                break;
            case 3:
                e((h0) obj);
                break;
            case 4:
                b(((Number) obj).intValue());
                break;
            case 5:
                e((h0) obj);
                break;
            case 6:
                b(((Number) obj).intValue());
                break;
            default:
                e((h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
