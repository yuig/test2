package fc0;

import android.view.View;
import c2.e6;
import c2.j1;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenManager$Companion;
import i2.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61713i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f61714j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f61715k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f61716l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.pinterest.framework.screens.s sVar, View view, boolean z13) {
        super(2);
        this.f61715k = sVar;
        this.f61716l = view;
        this.f61714j = z13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f61713i;
        boolean z13 = this.f61714j;
        Object obj3 = this.f61716l;
        Object obj4 = this.f61715k;
        switch (i13) {
            case 0:
                o oVar = (o) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                j1.e(z13 ? n.f61724a : n.f61725b, new e6((g4.e) obj4, 16382), null, (Function2) obj3, oVar, 0, 4);
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter((ScreenDescription) obj, "<anonymous parameter 0>");
                if (!booleanValue) {
                    View view = (View) obj3;
                    ScreenManager$Companion screenManager$Companion = com.pinterest.framework.screens.s.f49224n;
                    ((com.pinterest.framework.screens.s) obj4).getClass();
                    if (!z13 && view != null) {
                        view.setVisibility(8);
                    }
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z13, g4.e eVar, Function2 function2) {
        super(2);
        this.f61714j = z13;
        this.f61715k = eVar;
        this.f61716l = function2;
    }
}
