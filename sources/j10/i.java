package j10;

import com.pinterest.api.model.deserializer.PlaceDeserializer;
import com.pinterest.api.model.k60;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yn2.p;

/* loaded from: classes3.dex */
public final class i extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public PlaceDeserializer f74364s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f74365t;

    /* renamed from: u, reason: collision with root package name */
    public int f74366u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f74367v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vd0.a f74368w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PlaceDeserializer f74369x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vd0.a aVar, PlaceDeserializer placeDeserializer, bl2.c<? super i> cVar) {
        super(2, cVar);
        this.f74368w = aVar;
        this.f74369x = placeDeserializer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f74368w, this.f74369x, cVar);
        iVar.f74367v = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        PlaceDeserializer placeDeserializer;
        p pVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74366u;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar2 = (p) this.f74367v;
            it = this.f74368w.iterator();
            placeDeserializer = this.f74369x;
            pVar = pVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f74365t;
            placeDeserializer = this.f74364s;
            pVar = (p) this.f74367v;
            ue.c.H(obj);
        }
        while (it.hasNext()) {
            vd0.c json = (vd0.c) it.next();
            Intrinsics.f(json);
            placeDeserializer.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            Object e13 = vd0.c.f125622b.e(json.f125623a, k60.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Place");
            this.f74367v = pVar;
            this.f74364s = placeDeserializer;
            this.f74365t = it;
            this.f74366u = 1;
            if (pVar.b((k60) e13, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
