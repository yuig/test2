package d10;

import dl2.j;
import ey.q;
import ey.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f53594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f53595s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f53595s = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f53595s, cVar);
        bVar.f53594r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((pc.h) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        if (((pc.h) this.f53594r).f99567g) {
            new q().i();
            c cVar = this.f53595s;
            String parentMetricName = cVar.f53597b;
            Intrinsics.checkNotNullParameter(parentMetricName, "parentMetricName");
            new t(parentMetricName).i();
            Function0 function0 = cVar.f53601f;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.f80348a;
    }
}
