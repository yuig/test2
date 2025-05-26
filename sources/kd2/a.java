package kd2;

import android.content.Context;
import ao2.j0;
import ao2.v0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79255r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f79256s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f79257t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f79256s = iVar;
        this.f79257t = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f79257t, this.f79256s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79255r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f79255r = 1;
            i iVar = this.f79256s;
            iVar.getClass();
            ko2.f fVar = v0.f20219a;
            Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new f(this.f79257t, iVar, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
