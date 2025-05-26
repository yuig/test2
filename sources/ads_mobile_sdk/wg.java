package ads_mobile_sdk;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wg extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Uri f13022a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yg f13024c;

    /* renamed from: d, reason: collision with root package name */
    public int f13025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(yg ygVar, bl2.c cVar) {
        super(cVar);
        this.f13024c = ygVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13023b = obj;
        this.f13025d |= Integer.MIN_VALUE;
        return this.f13024c.b(null, this);
    }
}
