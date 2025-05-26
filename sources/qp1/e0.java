package qp1;

import com.pinterest.api.model.f30;

/* loaded from: classes5.dex */
public final class e0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f0 f104764r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f104765s;

    /* renamed from: t, reason: collision with root package name */
    public Object f104766t;

    /* renamed from: u, reason: collision with root package name */
    public Object f104767u;

    /* renamed from: v, reason: collision with root package name */
    public String f104768v;

    /* renamed from: w, reason: collision with root package name */
    public String f104769w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f104770x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f104771y;

    /* renamed from: z, reason: collision with root package name */
    public int f104772z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, bl2.c cVar) {
        super(cVar);
        this.f104771y = f0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f104770x = obj;
        this.f104772z |= Integer.MIN_VALUE;
        return this.f104771y.emit(null, this);
    }
}
