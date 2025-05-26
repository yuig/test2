package androidx.viewpager2.widget;

/* loaded from: classes3.dex */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19972b;

    public g(ViewPager2 viewPager2, int i13) {
        this.f19971a = i13;
        this.f19972b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.k
    public final void a(int i13) {
        switch (this.f19971a) {
            case 0:
                if (i13 == 0) {
                    this.f19972b.n();
                    break;
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void c(int i13) {
        int i14 = this.f19971a;
        ViewPager2 viewPager2 = this.f19972b;
        switch (i14) {
            case 0:
                if (viewPager2.f19924d != i13) {
                    viewPager2.f19924d = i13;
                    viewPager2.f19939s.x();
                    break;
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.f19930j.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
