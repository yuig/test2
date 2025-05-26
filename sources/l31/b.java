package l31;

import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81503i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f81504j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f81503i = i13;
        this.f81504j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81503i;
        d dVar = this.f81504j;
        switch (i13) {
            case 0:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.Y1("is_from_auto_organize", dVar.f81518k);
                String str = dVar.f81519l;
                if (str != null) {
                    navigateToBoard.m0("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", str);
                }
                break;
            default:
                dVar.f81511d.m(bs1.c.b2(x0.create_new_board_success));
                break;
        }
        return Unit.f80348a;
    }
}
