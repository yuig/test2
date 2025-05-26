package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class kc2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc2 f7222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f7223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi.k f7224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f7225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vi.a f7227g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc2(pc2 pc2Var, Map.Entry entry, wi.k kVar, Map map, String str, vi.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f7222b = pc2Var;
        this.f7223c = entry;
        this.f7224d = kVar;
        this.f7225e = map;
        this.f7226f = str;
        this.f7227g = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new kc2(this.f7222b, this.f7223c, this.f7224d, this.f7225e, this.f7226f, this.f7227g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kc2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7221a;
        if (i13 == 0) {
            ue.c.H(obj);
            pc2 pc2Var = this.f7222b;
            Map.Entry entry = this.f7223c;
            wi.k kVar = this.f7224d;
            Map map = this.f7225e;
            String str = this.f7226f;
            vi.a aVar2 = this.f7227g;
            this.f7221a = 1;
            if (pc2.a(pc2Var, entry, kVar, map, str, aVar2, this) == aVar) {
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
