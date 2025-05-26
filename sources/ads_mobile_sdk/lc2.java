package ads_mobile_sdk;

import ao2.j0;
import ao2.m2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lc2 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc2 f7763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi.k f7764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi.a f7766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc2(pc2 pc2Var, wi.k kVar, String str, vi.a aVar, bl2.c cVar) {
        super(1, cVar);
        this.f7763b = pc2Var;
        this.f7764c = kVar;
        this.f7765d = str;
        this.f7766e = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new lc2(this.f7763b, this.f7764c, this.f7765d, this.f7766e, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lc2) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object a13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7762a;
        int i14 = 2;
        if (i13 == 0) {
            ue.c.H(obj);
            eg egVar = this.f7763b.f9626c;
            String l13 = this.f7764c.l();
            String str = this.f7765d;
            this.f7762a = 1;
            a13 = egVar.a(l13, str, this);
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
            a13 = obj;
        }
        Map map = (Map) a13;
        m2 context = ue.c.b();
        pc2 pc2Var = this.f7763b;
        wi.k kVar = this.f7764c;
        String str2 = this.f7765d;
        vi.a aVar2 = this.f7766e;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            j0 j0Var = pc2Var.f9628e;
            pc2 pc2Var2 = pc2Var;
            ArrayList arrayList2 = arrayList;
            kc2 block = new kc2(pc2Var, entry, kVar, map, str2, aVar2, null);
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            i14 = 2;
            arrayList2.add(kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2));
            map = map;
            arrayList = arrayList2;
            pc2Var = pc2Var2;
            aVar2 = aVar2;
        }
        this.f7762a = i14;
        if (com.bumptech.glide.c.E0(arrayList, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
