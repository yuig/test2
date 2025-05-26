package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;

/* loaded from: classes2.dex */
public final class or extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f9408a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f9409b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9410c;

    /* renamed from: d, reason: collision with root package name */
    public aq f9411d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr f9413f;

    /* renamed from: g, reason: collision with root package name */
    public int f9414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f9413f = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9412e = obj;
        this.f9414g |= Integer.MIN_VALUE;
        return zr.a(this.f9413f, (Uri) null, (InputEvent) null, this);
    }
}
