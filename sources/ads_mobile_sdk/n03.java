package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* loaded from: classes2.dex */
public final class n03 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public p03 f8485a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f8486b;

    /* renamed from: c, reason: collision with root package name */
    public String f8487c;

    /* renamed from: d, reason: collision with root package name */
    public String f8488d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p03 f8490f;

    /* renamed from: g, reason: collision with root package name */
    public int f8491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n03(p03 p03Var, bl2.c cVar) {
        super(cVar);
        this.f8490f = p03Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8489e = obj;
        this.f8491g |= Integer.MIN_VALUE;
        return this.f8490f.a((WebResourceRequest) null, this);
    }
}
