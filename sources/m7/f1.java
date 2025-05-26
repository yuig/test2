package m7;

import android.util.Pair;

/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f86153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f86154c;

    public /* synthetic */ f1(j1 j1Var, Pair pair, int i13) {
        this.f86152a = i13;
        this.f86153b = j1Var;
        this.f86154c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f86152a;
        Pair pair = this.f86154c;
        j1 j1Var = this.f86153b;
        switch (i13) {
            case 0:
                ((n7.c0) j1Var.f86222b.f86322h).b(((Integer) pair.first).intValue(), (g8.e0) pair.second);
                break;
            case 1:
                ((n7.c0) j1Var.f86222b.f86322h).j(((Integer) pair.first).intValue(), (g8.e0) pair.second);
                break;
            case 2:
                ((n7.c0) j1Var.f86222b.f86322h).h(((Integer) pair.first).intValue(), (g8.e0) pair.second);
                break;
            default:
                ((n7.c0) j1Var.f86222b.f86322h).m(((Integer) pair.first).intValue(), (g8.e0) pair.second);
                break;
        }
    }
}
