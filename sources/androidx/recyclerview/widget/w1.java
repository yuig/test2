package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f19676b;

    public /* synthetic */ w1(RecyclerView recyclerView, int i13) {
        this.f19675a = i13;
        this.f19676b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f19675a;
        RecyclerView recyclerView = this.f19676b;
        switch (i13) {
            case 0:
                if (recyclerView.f19256u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f19252s) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f19262x) {
                        recyclerView.L();
                        break;
                    } else {
                        recyclerView.f19260w = true;
                        break;
                    }
                }
                break;
            default:
                g2 g2Var = recyclerView.M;
                if (g2Var != null) {
                    g2Var.m();
                }
                recyclerView.f19241m0 = false;
                break;
        }
    }
}
