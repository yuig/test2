package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class om0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f9369a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f9370b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9371c;

    /* renamed from: d, reason: collision with root package name */
    public ao2.v f9372d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym0 f9374f;

    /* renamed from: g, reason: collision with root package name */
    public int f9375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f9374f = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9373e = obj;
        this.f9375g |= Integer.MIN_VALUE;
        return this.f9374f.a((String) null, (String) null, (String) null, (String) null, false, (bl2.c) this);
    }
}
