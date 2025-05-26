package pa1;

import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.z3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mo1.d;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99390i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f99391j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f99390i = i13;
        this.f99391j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99390i;
        b bVar = this.f99391j;
        switch (i13) {
            case 0:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                bVar.f99393b.e(it.getMessage());
                break;
            default:
                Intrinsics.checkNotNullParameter((wy0) obj, "it");
                bVar.getClass();
                d.a(bVar.f99395d, false, null, Navigation.w1(z3.c()), null, 11);
                break;
        }
        return Unit.f80348a;
    }
}
