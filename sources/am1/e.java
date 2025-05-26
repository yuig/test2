package am1;

import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import im1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButtonSocial f15530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(GestaltButtonSocial gestaltButtonSocial, int i13) {
        super(1);
        this.f15529i = i13;
        this.f15530j = gestaltButtonSocial;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15529i;
        GestaltButtonSocial gestaltButtonSocial = this.f15530j;
        switch (i13) {
            case 0:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = GestaltButtonSocial.f49326v;
                gestaltButtonSocial.getClass();
                gestaltButtonSocial.f49327u.F(m.f72668n, new e(gestaltButtonSocial, 1));
                return Unit.f80348a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new g(gestaltButtonSocial.getId());
        }
    }
}
