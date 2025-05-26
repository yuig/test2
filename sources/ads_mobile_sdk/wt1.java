package ads_mobile_sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class wt1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Map f13242a;

    /* renamed from: b, reason: collision with root package name */
    public ym0 f13243b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13244c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13245d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yt1 f13247f;

    /* renamed from: g, reason: collision with root package name */
    public int f13248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt1(yt1 yt1Var, bl2.c cVar) {
        super(cVar);
        this.f13247f = yt1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13246e = obj;
        this.f13248g |= Integer.MIN_VALUE;
        return this.f13247f.a(null, false, false, false, null, this);
    }
}
