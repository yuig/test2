package androidx.viewpager2.widget;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19970b;

    public f(Object obj, int i13) {
        this.f19969a = i13;
        this.f19970b = obj;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        int i13 = this.f19969a;
        Object obj = this.f19970b;
        switch (i13) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.f19925e = true;
                viewPager2.f19932l.f19967l = true;
                break;
            default:
                ((m) obj).x();
                break;
        }
    }
}
