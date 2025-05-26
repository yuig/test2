package s;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f110270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f110273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f110274g;

    public i(j jVar, int i13, int i14, int i15, int i16, int i17, Bundle bundle) {
        this.f110274g = jVar;
        this.f110268a = i13;
        this.f110269b = i14;
        this.f110270c = i15;
        this.f110271d = i16;
        this.f110272e = i17;
        this.f110273f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110274g.f110276b.onActivityLayout(this.f110268a, this.f110269b, this.f110270c, this.f110271d, this.f110272e, this.f110273f);
    }
}
