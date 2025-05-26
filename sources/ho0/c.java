package ho0;

import android.content.Context;
import com.pinterest.feature.pin.create.view.BoardSectionCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69687i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f69688j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f69687i = i13;
        this.f69688j = dVar;
    }

    public final f b() {
        int i13 = this.f69687i;
        d dVar = this.f69688j;
        switch (i13) {
            case 2:
                String string = dVar.getResources().getString(x0.board_section);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new f(string, true, requireContext);
            case 3:
                String string2 = dVar.getResources().getString(f02.g.all_boards);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new f(string2, false, requireContext2);
            default:
                String string3 = dVar.getResources().getString(x0.board);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Context requireContext3 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new f(string3, false, requireContext3);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f69687i;
        d dVar = this.f69688j;
        switch (i13) {
            case 0:
                return new BoardSectionCell(dVar.getContext());
            case 1:
                return new l11.c(dVar.getContext());
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new f(requireContext, (Integer) null);
            default:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new e(requireContext2);
        }
    }
}
