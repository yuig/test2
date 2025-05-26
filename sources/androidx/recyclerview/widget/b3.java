package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class b3 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19334a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f19335b;

    public b3(c3 c3Var) {
        this.f19335b = c3Var;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        if (i13 == 0 && this.f19334a) {
            this.f19334a = false;
            this.f19335b.k();
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        if (i13 == 0 && i14 == 0) {
            return;
        }
        this.f19334a = true;
    }
}
