package rk0;

import i92.k;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tk0.o;
import tk0.p;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f108461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(1);
        this.f108460i = i13;
        this.f108461j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j jVar = this.f108461j;
        int i13 = this.f108460i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        jVar.t(new o(intValue));
                        break;
                    default:
                        jVar.t(new p(intValue));
                        break;
                }
                return Unit.f80348a;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        jVar.t(new o(intValue2));
                        break;
                    default:
                        jVar.t(new p(intValue2));
                        break;
                }
                return Unit.f80348a;
            default:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                k kVar = jVar.f108444d;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.h(l70.d.reorder_pins_error_message);
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Could not reorder pin successfully", throwable);
                return Unit.f80348a;
        }
    }
}
