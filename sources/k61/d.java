package k61;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78401i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f78402j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, int i13) {
        super(1);
        this.f78401i = i13;
        this.f78402j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f78401i;
        h hVar = this.f78402j;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                g70.h.f(hVar.Y, board, null, 6);
                break;
            case 1:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                String str = hVar.f49111a;
                hVar.f49129s.c(new wt1.i(throwable));
                break;
            default:
                xj2.c disposable = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                hVar.u(disposable);
                break;
        }
        return Unit.f80348a;
    }
}
