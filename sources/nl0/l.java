package nl0;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.hb;
import ho2.q;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ml0.b0;
import ml0.y;
import tu.d0;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f91270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f91271s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f91272t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f91273u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, b0 b0Var, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f91271s = d0Var;
        this.f91272t = b0Var;
        this.f91273u = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f91271s, this.f91272t, this.f91273u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91270r;
        d0 d0Var = this.f91271s;
        b0 b0Var = this.f91272t;
        if (i13 == 0) {
            ue.c.H(obj);
            e12.d dVar = (e12.d) d0Var.f119282d;
            y yVar = (y) b0Var;
            String str = yVar.f87514a;
            String id3 = yVar.f87515b.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            float f13 = yVar.f87516c;
            float f14 = yVar.f87517d;
            float f15 = yVar.f87518e;
            float f16 = yVar.f87519f;
            String y03 = bs1.c.y0(yVar.f87515b);
            if (y03 == null) {
                y03 = "";
            }
            this.f91270r = 1;
            obj = dVar.F(str, id3, f13, f14, f15, f16, y03, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        if (((NetworkResponse) obj) instanceof xz.a) {
            b20.c cVar = (b20.c) d0Var.f119285g;
            int i14 = x0.generic_error;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            b20.c.B(cVar, new k92.b(new k92.c(new k0(i14, new ArrayList(0)), null, do1.n.ERROR, false, 94)), null, null, 30);
        } else {
            y yVar2 = (y) b0Var;
            ((kn0.b) d0Var.f119284f).a(new kn0.d(yVar2.f87514a, hb.BOARD_HEADER_IMAGE_CREATE, yVar2.f87520g));
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(this.f91273u, q.f69782a, null, new k(d0Var, null), 2);
        }
        return Unit.f80348a;
    }
}
