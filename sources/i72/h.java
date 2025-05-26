package i72;

import ao2.j0;
import dl2.j;
import g72.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import r72.j1;

/* loaded from: classes4.dex */
public final class h extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r72.a f71697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f71698t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f71699u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r72.a aVar, i iVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f71697s = aVar;
        this.f71698t = iVar;
        this.f71699u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f71697s, this.f71698t, this.f71699u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71696r;
        if (i13 == 0) {
            ue.c.H(obj);
            r72.a aVar2 = this.f71697s;
            j1 j1Var = aVar2.f106431a;
            r rVar = new r(new float[][]{new float[]{j1Var.f106506a, j1Var.f106507b}, new float[]{j1Var.f106508c, j1Var.f106509d}}, aVar2.f106432b);
            ro2.b bVar = ro2.c.f108975d;
            bVar.getClass();
            String b13 = bVar.b(r.Companion.serializer(), rVar);
            k72.e eVar = this.f71698t.f71700a;
            RequestBody.f95711a.getClass();
            RequestBody$Companion$toRequestBody$2 a13 = RequestBody.Companion.a(b13, null);
            this.f71696r = 1;
            obj = eVar.a(this.f71699u, "shuffleasset.{id}", a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return ((f72.r) ((d72.c) obj).f53913c).f61349a;
    }
}
