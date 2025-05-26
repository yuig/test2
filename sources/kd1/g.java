package kd1;

import com.pinterest.gestalt.spinner.GestaltSpinner;
import h32.g0;
import java.util.HashMap;
import kc1.w;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f79248s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f79248s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f79248s, cVar);
        gVar.f79247r = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((zw0.b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        zw0.b bVar = (zw0.b) this.f79247r;
        boolean z13 = bVar.f142899d;
        k kVar = this.f79248s;
        if (z13) {
            d0 s73 = kVar.s7();
            g0 g0Var = g0.COMPLETE_THE_LOOK_STORY;
            HashMap hashMap = new HashMap();
            bs1.c.G1("story_type", bVar.f142898c, hashMap);
            yq0.g0 g0Var2 = new yq0.g0(s73, g0Var, null, hashMap);
            kVar.R0 = g0Var2;
            kVar.b8(g0Var2);
        }
        if (kVar.P0) {
            GestaltSpinner gestaltSpinner = kVar.Q0;
            if (gestaltSpinner == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            s0.w(gestaltSpinner, new w(bVar, 16));
        }
        kVar.S0.y(null);
        return Unit.f80348a;
    }
}
