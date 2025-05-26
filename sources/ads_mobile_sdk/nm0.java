package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f8865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(ym0 ym0Var, bl2.c cVar, String str, String str2, String str3, String str4) {
        super(2, cVar);
        this.f8865a = ym0Var;
        this.f8866b = str;
        this.f8867c = str2;
        this.f8868d = str3;
        this.f8869e = str4;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nm0(this.f8865a, cVar, this.f8866b, this.f8867c, this.f8868d, this.f8869e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nm0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f8865a.loadDataWithBaseURL(this.f8866b, this.f8867c, this.f8868d, this.f8869e, null);
        return Unit.f80348a;
    }
}
