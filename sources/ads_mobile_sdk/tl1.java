package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class tl1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f11583a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f11584b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11585c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ul1 f11587e;

    /* renamed from: f, reason: collision with root package name */
    public int f11588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(ul1 ul1Var, bl2.c cVar) {
        super(cVar);
        this.f11587e = ul1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11586d = obj;
        this.f11588f |= Integer.MIN_VALUE;
        return ul1.a(this.f11587e, this);
    }
}
