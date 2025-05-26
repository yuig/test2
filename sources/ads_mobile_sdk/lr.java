package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lr extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zr f7930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(zr zrVar, boolean z13, boolean z14, bl2.c cVar) {
        super(2, cVar);
        this.f7930b = zrVar;
        this.f7931c = z13;
        this.f7932d = z14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new lr(this.f7930b, this.f7931c, this.f7932d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lr) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7929a;
        if (i13 == 0) {
            ue.c.H(obj);
            zr zrVar = this.f7930b;
            boolean z13 = this.f7931c;
            boolean z14 = this.f7932d;
            this.f7929a = 1;
            if (zr.a(zrVar, z13, z14, this) == aVar) {
                return aVar;
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
