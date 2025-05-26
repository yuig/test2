package wm1;

import android.view.View;
import android.widget.CompoundButton;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltListAction f130263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltListAction gestaltListAction, int i13) {
        super(1);
        this.f130262i = i13;
        this.f130263j = gestaltListAction;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f130262i;
        GestaltListAction gestaltListAction = this.f130263j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                yl1.d dVar = GestaltListAction.V;
                gm1.c k03 = gestaltListAction.k0();
                return k03 == null ? new i0(gestaltListAction.getId()) : k03;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new j0(gestaltListAction.getId());
        }
    }

    public final void e(Unit it) {
        int i13 = this.f130262i;
        GestaltListAction gestaltListAction = this.f130263j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                yl1.d dVar = GestaltListAction.V;
                gm1.c k03 = gestaltListAction.k0();
                if (!(k03 instanceof on1.i)) {
                    View.OnClickListener onClickListener = gestaltListAction.T;
                    if (onClickListener != null) {
                        onClickListener.onClick(gestaltListAction);
                        break;
                    }
                } else {
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener = gestaltListAction.S;
                    if (onCheckedChangeListener != null) {
                        onCheckedChangeListener.onCheckedChanged(gestaltListAction.f49435x, k03 instanceof on1.g);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                View.OnLongClickListener onLongClickListener = gestaltListAction.U;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(gestaltListAction);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02db  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.a.invoke(java.lang.Object):java.lang.Object");
    }
}
