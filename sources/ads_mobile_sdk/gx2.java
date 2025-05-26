package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gx2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f5735a;

    /* renamed from: b, reason: collision with root package name */
    public ix2 f5736b;

    /* renamed from: c, reason: collision with root package name */
    public String f5737c;

    /* renamed from: d, reason: collision with root package name */
    public int f5738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix2 f5739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(ix2 ix2Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f5739e = ix2Var;
        this.f5740f = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gx2(this.f5739e, this.f5740f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gx2(this.f5739e, this.f5740f, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ix2 ix2Var;
        String str;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5738d;
        if (i13 == 0) {
            ue.c.H(obj);
            eg0 eg0Var = this.f5739e.f6575c;
            String newUserAgent = this.f5740f;
            Intrinsics.checkNotNullExpressionValue(newUserAgent, "$newUserAgent");
            this.f5738d = 1;
            Object a13 = ((a6.h) eg0Var.f4851a.get()).a(new zf0(newUserAgent, null), this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f5737c;
                ix2Var = this.f5736b;
                Object obj3 = this.f5735a;
                ue.c.H(obj);
                obj2 = obj3;
                try {
                    Intrinsics.f(str);
                    ix2Var.a(str);
                    return Unit.f80348a;
                } finally {
                    ((mo2.c) obj2).i(null);
                }
            }
            ue.c.H(obj);
        }
        ix2Var = this.f5739e;
        mo2.a aVar2 = ix2Var.f6578f;
        String str2 = this.f5740f;
        this.f5735a = aVar2;
        this.f5736b = ix2Var;
        this.f5737c = str2;
        this.f5738d = 2;
        mo2.c cVar = (mo2.c) aVar2;
        if (cVar.f(null, this) == aVar) {
            return aVar;
        }
        str = str2;
        obj2 = cVar;
        Intrinsics.f(str);
        ix2Var.a(str);
        return Unit.f80348a;
    }
}
