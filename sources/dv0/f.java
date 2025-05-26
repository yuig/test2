package dv0;

import ao2.f0;
import ao2.j0;
import com.pinterest.api.model.ln0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;

    /* renamed from: r, reason: collision with root package name */
    public int f56327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f56328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ln0 f56329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f56330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f56331v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f56332w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f56333x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f56334y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Integer f56335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, ln0 ln0Var, boolean z13, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, bl2.c cVar) {
        super(2, cVar);
        this.f56328s = kVar;
        this.f56329t = ln0Var;
        this.f56330u = z13;
        this.f56331v = str;
        this.f56332w = str2;
        this.f56333x = str3;
        this.f56334y = str4;
        this.f56335z = num;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = str8;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f56328s, this.f56329t, this.f56330u, this.f56331v, this.f56332w, this.f56333x, this.f56334y, this.f56335z, this.A, this.B, this.C, this.D, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56327r;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f56328s;
            f0 f0Var = kVar.f56359r.f92750a;
            e eVar = new e(kVar, this.f56329t, this.f56330u, this.f56331v, this.f56332w, this.f56333x, this.f56334y, this.f56335z, this.A, this.B, this.C, this.D, null);
            this.f56327r = 1;
            if (kotlin.jvm.internal.j.M(this, f0Var, eVar) == aVar) {
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
