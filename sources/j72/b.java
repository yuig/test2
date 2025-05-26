package j72;

import ao2.j0;
import f72.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.m1;

/* loaded from: classes4.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74852r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f74853s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f74854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f74853s = dVar;
        this.f74854t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f74853s, this.f74854t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74852r;
        d dVar = this.f74853s;
        if (i13 == 0) {
            ue.c.H(obj);
            k72.a aVar2 = dVar.f74859a;
            this.f74852r = 1;
            obj = aVar2.b(this.f74854t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        m1 shuffle = dVar.f74860b.a((x) ((d72.c) obj).f53913c);
        dVar.f74862d.getClass();
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        return shuffle;
    }
}
