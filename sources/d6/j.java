package d6;

import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f53735r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f53736s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f53737t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f53737t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f53737t, cVar);
        jVar.f53736s = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f53735r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f53736s;
            ue.c.H(obj);
            return bVar;
        }
        ue.c.H(obj);
        i iVar = (i) this.f53736s;
        iVar.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((b) iVar).f53725a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        b bVar2 = new b(z0.r(unmodifiableMap), false);
        this.f53736s = bVar2;
        this.f53735r = 1;
        return this.f53737t.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
