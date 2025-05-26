package s;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f110259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f110261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f110262e;

    public g(j jVar, int i13, Uri uri, boolean z13, Bundle bundle) {
        this.f110262e = jVar;
        this.f110258a = i13;
        this.f110259b = uri;
        this.f110260c = z13;
        this.f110261d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110262e.f110276b.onRelationshipValidationResult(this.f110258a, this.f110259b, this.f110260c, this.f110261d);
    }
}
