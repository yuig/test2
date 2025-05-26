package k11;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f78138j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f78139k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, f30 f30Var, int i13) {
        super(1);
        this.f78137i = i13;
        this.f78138j = hVar;
        this.f78139k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String X3;
        String Z2;
        int i13 = this.f78137i;
        f30 f30Var = this.f78139k;
        h hVar = this.f78138j;
        switch (i13) {
            case 0:
                wy0 creator = (wy0) obj;
                Intrinsics.checkNotNullParameter(creator, "creator");
                b60.d dVar = (b60.d) hVar.f78142c;
                wy0 f13 = dVar.f();
                boolean z13 = false;
                if (f13 != null && !dl2.b.O1(f13, false)) {
                    wy0 f14 = dVar.f();
                    if (!Intrinsics.d(f14 != null ? f14.getUid() : null, creator.getUid()) && !creator.R2().booleanValue() && (((X3 = f30Var.X3()) == null || z.j(X3)) && (Z2 = creator.Z2()) != null && !z.j(Z2))) {
                        z13 = true;
                    }
                }
                return new Pair(Boolean.valueOf(z13), creator);
            default:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return new hk2.p(new uj0.a(((Boolean) pair.f80346a).booleanValue(), hVar, (wy0) pair.f80347b, f30Var)).h(wj2.c.a());
        }
    }
}
