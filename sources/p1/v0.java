package p1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.api.model.bo0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f98603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i13, float f13) {
        super(1);
        this.f98602i = i13;
        this.f98603j = f13;
    }

    public final cn1.y b(cn1.y it) {
        int i13 = this.f98602i;
        float f13 = this.f98603j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return cn1.y.e(it, null, f13 < 1.0f ? dn1.d.TRANSPARENT : dn1.d.DEFAULT, 0, null, null, null, null, 65503);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return cn1.y.e(it, null, f13 < 1.0f ? dn1.d.TRANSPARENT : dn1.d.DEFAULT, 0, null, null, null, null, 65503);
        }
    }

    public final void e(b3.d0 graphicsLayer) {
        int i13 = this.f98602i;
        float f13 = this.f98603j;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var = (b3.u0) graphicsLayer;
                u0Var.j(3.0f);
                u0Var.E(f13);
                u0Var.F(-f13);
                break;
            default:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var2 = (b3.u0) graphicsLayer;
                u0Var2.F(-(u0Var2.f21372s.b() * (f13 / 2)));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f98602i;
        switch (i13) {
            case 0:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                switch (i13) {
                    case 0:
                        throw null;
                    default:
                        throw null;
                }
            case 7:
                nc2.l writeVideoState = (nc2.l) obj;
                Intrinsics.checkNotNullParameter(writeVideoState, "$this$writeVideoState");
                writeVideoState.f90410b = ml2.c.d(this.f98603j);
                return Unit.f80348a;
            case 8:
                bo0 it = (bo0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return bo0.a(it, null, 0L, 0L, null, null, this.f98603j, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
            case 9:
                e((b3.d0) obj);
                return Unit.f80348a;
            case 10:
                e((b3.d0) obj);
                return Unit.f80348a;
            case 11:
                return b((cn1.y) obj);
            default:
                return b((cn1.y) obj);
        }
    }
}
