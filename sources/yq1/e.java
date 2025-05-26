package yq1;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t3.t4;

/* loaded from: classes2.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f139834s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f139834s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f139834s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139833r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f139834s;
            dy.a aVar2 = kVar.f139879m0;
            if (aVar2 == null) {
                Intrinsics.r("appsFlyerManager");
                throw null;
            }
            t4 t4Var = new t4(kVar, i14);
            this.f139833r = 1;
            if (aVar2.f56522o.collect(t4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        throw new KotlinNothingValueException();
    }
}
