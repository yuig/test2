package l5;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f81570s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f81571t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f81570s = iVar;
        this.f81571t = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f81570s, this.f81571t, cVar);
        fVar.f81569r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d6.b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d6.b bVar = (d6.b) this.f81569r;
        d6.g key = this.f81570s.f81581d;
        Integer num = new Integer(this.f81571t);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        bVar.c(key, num);
        return Unit.f80348a;
    }
}
