package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92118r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f92119s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f92120t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f92121u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f92122v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f92123w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f92124x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.api.model.h0 f92125y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, String str, String str2, String str3, String str4, String str5, com.pinterest.api.model.h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f92119s = q0Var;
        this.f92120t = str;
        this.f92121u = str2;
        this.f92122v = str3;
        this.f92123w = str4;
        this.f92124x = str5;
        this.f92125y = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o0(this.f92119s, this.f92120t, this.f92121u, this.f92122v, this.f92123w, this.f92124x, this.f92125y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92118r;
        if (i13 == 0) {
            ue.c.H(obj);
            uj2.b0<vd0.c> a13 = this.f92119s.f92141c.a(this.f92120t, this.f92121u, this.f92122v, this.f92123w, this.f92124x, this.f92125y);
            this.f92118r = 1;
            obj = kh2.j.p(a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
