package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class bz0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public mz0 f3653a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3654b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f3655c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0 f3657e;

    /* renamed from: f, reason: collision with root package name */
    public int f3658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(mz0 mz0Var, bl2.c cVar) {
        super(cVar);
        this.f3657e = mz0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3656d = obj;
        this.f3658f |= Integer.MIN_VALUE;
        return this.f3657e.a(this);
    }
}
