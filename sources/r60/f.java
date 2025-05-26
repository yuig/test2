package r60;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106319i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f106320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f106319i = i13;
        this.f106320j = hVar;
    }

    public final void b(wy0 updatedUser) {
        int i13 = this.f106319i;
        h hVar = this.f106320j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(updatedUser, "updatedUser");
                hVar.f106332d.c(new b(updatedUser));
                break;
            default:
                Intrinsics.checkNotNullParameter(updatedUser, "originalUser");
                hVar.f106332d.c(new a(updatedUser));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106319i) {
            case 0:
                b((wy0) obj);
                break;
            default:
                b((wy0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
