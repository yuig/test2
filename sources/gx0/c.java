package gx0;

import android.view.View;
import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f66282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(2);
        this.f66281i = i13;
        this.f66282j = eVar;
    }

    public final void b(View view, v7 board) {
        int i13 = this.f66281i;
        e eVar = this.f66282j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                eVar.T.invoke(board, view);
                break;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                eVar.T.invoke(board, view);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f66281i) {
            case 0:
                b((View) obj2, (v7) obj);
                break;
            default:
                b((View) obj2, (v7) obj);
                break;
        }
        return Unit.f80348a;
    }
}
