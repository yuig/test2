package p4;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f98769b;

    public /* synthetic */ a(int i13, Function0 function0) {
        this.f98768a = i13;
        this.f98769b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f98768a;
        Function0 tmp0 = this.f98769b;
        switch (i13) {
            case 0:
                tmp0.invoke();
                break;
            case 1:
                tmp0.invoke();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 3:
                Intrinsics.checkNotNullParameter(tmp0, "$onStopping");
                tmp0.invoke();
                break;
            case 4:
                Set set = r01.c.f105702i;
                Intrinsics.checkNotNullParameter(tmp0, "$updateState");
                tmp0.invoke();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 6:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 7:
                SbaPinRep.expandAndTiltView$lambda$78$lambda$76(tmp0);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 9:
                int i14 = LegoPinGridCellImpl.Z2;
                Intrinsics.checkNotNullParameter(tmp0, "$clickThrough");
                tmp0.invoke();
                break;
            case 10:
                tmp0.invoke();
                break;
            case 11:
                tmp0.invoke();
                break;
            case 12:
                tmp0.invoke();
                break;
            case 13:
                tmp0.invoke();
                break;
            case 14:
                tmp0.invoke();
                break;
            case 15:
                tmp0.invoke();
                break;
            default:
                tmp0.invoke();
                break;
        }
    }
}
