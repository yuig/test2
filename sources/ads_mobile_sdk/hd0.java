package ads_mobile_sdk;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class hd0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kd0 f5919a;

    /* renamed from: b, reason: collision with root package name */
    public Uri.Builder f5920b;

    /* renamed from: c, reason: collision with root package name */
    public Uri.Builder f5921c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f5922d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd0 f5924f;

    /* renamed from: g, reason: collision with root package name */
    public int f5925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(kd0 kd0Var, bl2.c cVar) {
        super(cVar);
        this.f5924f = kd0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5923e = obj;
        this.f5925g |= Integer.MIN_VALUE;
        return this.f5924f.a(null, this);
    }
}
