package so;

import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.repository.pin.PinService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class g6 implements w01.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113431a;

    public g6(r8 r8Var) {
        this.f113431a = r8Var;
    }

    public final w01.f0 a(String str, x02.i2 i2Var, uk1.d dVar, nx.f0 f0Var, ze1.c cVar, uj2.q qVar, yk1.v vVar, xo0.o oVar, Function0 function0, boolean z13) {
        r8 r8Var = this.f113431a;
        lh0.a0 j53 = r8Var.f114091b.j5();
        oa oaVar = r8Var.f114091b.f114255d;
        no0.a aVar = new no0.a((PinService) oaVar.f113713h3.get(), (DynamicStoryDeserializer) oaVar.f113589a3.get());
        oa oaVar2 = r8Var.f114090a;
        return new w01.f0(str, i2Var, dVar, f0Var, cVar, qVar, vVar, oVar, function0, z13, j53, aVar, oaVar2.S2(), (es.a) oaVar2.P6.get(), (es.h) oaVar2.f113735i7.get(), (vr.a) oaVar2.Q8.get());
    }
}
