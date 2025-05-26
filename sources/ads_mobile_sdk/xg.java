package ads_mobile_sdk;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class xg extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public yg f13645a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f13646b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg f13648d;

    /* renamed from: e, reason: collision with root package name */
    public int f13649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(yg ygVar, bl2.c cVar) {
        super(cVar);
        this.f13648d = ygVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13647c = obj;
        this.f13649e |= Integer.MIN_VALUE;
        return this.f13648d.c(null, this);
    }
}
