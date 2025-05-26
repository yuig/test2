package i7;

import a7.o;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class b extends UrlRequest.StatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f71638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f71639b;

    public b(int[] iArr, o oVar) {
        this.f71638a = iArr;
        this.f71639b = oVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i13) {
        this.f71638a[0] = i13;
        this.f71639b.h();
    }
}
