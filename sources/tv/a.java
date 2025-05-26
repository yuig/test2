package tv;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f119479r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f119480s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f119481t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f119480s = eVar;
        this.f119481t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f119480s, this.f119481t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f119479r;
        if (i13 == 0) {
            ue.c.H(obj);
            String pinId = this.f119481t;
            Intrinsics.checkNotNullExpressionValue(pinId, "$pinId");
            this.f119479r = 1;
            obj = e.j(this.f119480s, pinId, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
