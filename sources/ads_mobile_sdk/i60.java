package ads_mobile_sdk;

import android.app.Activity;
import android.net.Uri;
import ao2.j0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f6260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t60 f6263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(AtomicInteger atomicInteger, int i13, int i14, t60 t60Var, int i15, bl2.c cVar) {
        super(2, cVar);
        this.f6260b = atomicInteger;
        this.f6261c = i13;
        this.f6262d = i14;
        this.f6263e = t60Var;
        this.f6264f = i15;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i60(this.f6260b, this.f6261c, this.f6262d, this.f6263e, this.f6264f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i60) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6259a;
        if (i13 == 0) {
            ue.c.H(obj);
            if (this.f6260b.get() != this.f6261c) {
                int i14 = this.f6260b.get();
                if (i14 == this.f6262d) {
                    ku0 ku0Var = this.f6263e.f11417j;
                    bt0 bt0Var = bt0.FLICK;
                    this.f6259a = 1;
                    ku0Var.getClass();
                    if (ku0.a(ku0Var, bt0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (i14 == this.f6264f) {
                    ku0 ku0Var2 = this.f6263e.f11417j;
                    bt0 bt0Var2 = bt0.SHAKE;
                    this.f6259a = 2;
                    ku0Var2.getClass();
                    if (ku0.a(ku0Var2, bt0Var2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    ku0 ku0Var3 = this.f6263e.f11417j;
                    bt0 bt0Var3 = bt0.NONE;
                    this.f6259a = 3;
                    ku0Var3.getClass();
                    if (ku0.a(ku0Var3, bt0Var3, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i13 != 1 && i13 != 2 && i13 != 3) {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        t60 t60Var = this.f6263e;
        this.f6259a = 4;
        Uri uri = t60.f11407q;
        if (t60Var.a((Activity) null, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
