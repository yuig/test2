package ba1;

import com.pinterest.api.model.wy0;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22344i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f22345j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u50.r f22346k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(e0 e0Var, u50.r rVar, int i13) {
        super(1);
        this.f22344i = i13;
        this.f22345j = e0Var;
        this.f22346k = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f22344i;
        u50.r rVar = this.f22346k;
        e0 e0Var = this.f22345j;
        switch (i13) {
            case 0:
                e82.g gVar = (e82.g) obj;
                e0.j(e0Var);
                Intrinsics.f(gVar);
                long currentTimeMillis = System.currentTimeMillis();
                Date date = e0Var.f22360d;
                rVar.a(new k(gVar, currentTimeMillis, date != null ? date.getTime() : 0L));
                break;
            default:
                wy0 wy0Var = (wy0) obj;
                e0.j(e0Var);
                Intrinsics.f(wy0Var);
                long currentTimeMillis2 = System.currentTimeMillis();
                Date date2 = e0Var.f22360d;
                rVar.a(new q(wy0Var, currentTimeMillis2, date2 != null ? date2.getTime() : 0L));
                break;
        }
        return Unit.f80348a;
    }
}
