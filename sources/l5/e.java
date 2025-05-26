package l5;

import android.util.Log;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81567r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f81568s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f81568s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f81568s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81567r;
        i iVar = this.f81568s;
        if (i13 == 0) {
            ue.c.H(obj);
            d dVar = new d(iVar.f81578a.getData(), iVar);
            this.f81567r = 1;
            obj = l0.f0(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Integer num = (Integer) obj;
        Log.v(iVar.f81579b, "Stored mpc is " + num);
        StringBuilder sb3 = new StringBuilder("Default mpc is ");
        k5.a aVar2 = iVar.f81580c;
        sb3.append(aVar2.f78311e);
        String sb4 = sb3.toString();
        String str = iVar.f81579b;
        Log.v(str, sb4);
        int max = Math.max(num != null ? num.intValue() : 0, aVar2.f78311e);
        Log.v(str, "Mpc value used " + max);
        return new Integer(max);
    }
}
