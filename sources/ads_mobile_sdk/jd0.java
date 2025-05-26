package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class jd0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kd0 f6752a;

    /* renamed from: b, reason: collision with root package name */
    public cd0 f6753b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f6754c;

    /* renamed from: d, reason: collision with root package name */
    public Uri.Builder f6755d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd0 f6757f;

    /* renamed from: g, reason: collision with root package name */
    public int f6758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(kd0 kd0Var, bl2.c cVar) {
        super(cVar);
        this.f6757f = kd0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6756e = obj;
        this.f6758g |= Integer.MIN_VALUE;
        return this.f6757f.a(null, null, null, this);
    }
}
