package rr;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109859i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f109860j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i13, String str, r0 r0Var) {
        super(1);
        this.f109859i = i13;
        this.f109860j = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109859i;
        Function0 function0 = this.f109860j;
        switch (i13) {
            case 0:
                p30.u uVar = (p30.u) ((pc.h) obj).f99563c;
                if ((uVar != null ? uVar.f98758a : null) instanceof p30.p) {
                    m60.u.f85943a.d(Navigation.w1((ScreenLocation) com.pinterest.screens.d1.f50636b.getValue()));
                }
                function0.invoke();
                break;
            default:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                error.getMessage();
                function0.invoke();
                break;
        }
        return Unit.f80348a;
    }
}
