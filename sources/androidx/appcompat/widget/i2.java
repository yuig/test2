package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class i2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f16600b;

    public /* synthetic */ i2(SearchView searchView, int i13) {
        this.f16599a = i13;
        this.f16600b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16599a;
        SearchView searchView = this.f16600b;
        switch (i13) {
            case 0:
                searchView.y();
                break;
            default:
                searchView.getClass();
                break;
        }
    }
}
