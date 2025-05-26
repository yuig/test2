package l5;

import android.util.Log;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81572r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f81573s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f81574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f81573s = iVar;
        this.f81574t = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f81573s, this.f81574t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81572r;
        int i14 = this.f81574t;
        i iVar = this.f81573s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f81572r = 1;
            iVar.getClass();
            Object a13 = iVar.f81578a.a(new d6.j(new f(iVar, i14, null), null), this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Log.v(iVar.f81579b, "Saved mediaPerformanceClass " + i14);
        return Unit.f80348a;
    }
}
