package ar0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;

/* loaded from: classes.dex */
public final class g extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20375b;

    /* renamed from: c, reason: collision with root package name */
    public l2 f20376c;

    /* renamed from: d, reason: collision with root package name */
    public final f f20377d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f20378e;

    /* renamed from: f, reason: collision with root package name */
    public sq0.w f20379f;

    /* renamed from: g, reason: collision with root package name */
    public e f20380g;

    /* renamed from: h, reason: collision with root package name */
    public e f20381h;

    /* renamed from: i, reason: collision with root package name */
    public Handler f20382i;

    public g(l2 l2Var, f fVar) {
        this.f20374a = 0;
        this.f20375b = true;
        m(l2Var);
        this.f20377d = fVar;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [ar0.e] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ar0.e] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ar0.e] */
    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        int c13 = eb2.j.c(this.f20376c, this.f20378e);
        if (c13 == -1) {
            return;
        }
        l2 l2Var = this.f20376c;
        final int i15 = 0;
        int P = l2Var != null ? l2Var.P() : 0;
        final int i16 = 1;
        if (P < this.f20374a) {
            this.f20374a = P;
            if (P == 0) {
                this.f20375b = true;
            }
        }
        if (this.f20377d.b(P, c13)) {
            if (this.f20375b) {
                Handler k13 = k(recyclerView);
                if (this.f20381h == null) {
                    this.f20381h = new Runnable(this) { // from class: ar0.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f20373b;

                        {
                            this.f20373b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i17 = i15;
                            g gVar = this.f20373b;
                            switch (i17) {
                                case 0:
                                    sq0.w wVar = gVar.f20379f;
                                    if (wVar != null) {
                                        wVar.onLoadMoreSuppressed();
                                        break;
                                    }
                                    break;
                                default:
                                    sq0.w wVar2 = gVar.f20379f;
                                    if (wVar2 != null) {
                                        wVar2.loadMoreData();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                }
                k13.postDelayed(this.f20381h, 500L);
                return;
            }
            this.f20375b = true;
            Handler k14 = k(recyclerView);
            if (this.f20380g == null) {
                this.f20380g = new Runnable(this) { // from class: ar0.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f20373b;

                    {
                        this.f20373b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i16;
                        g gVar = this.f20373b;
                        switch (i17) {
                            case 0:
                                sq0.w wVar = gVar.f20379f;
                                if (wVar != null) {
                                    wVar.onLoadMoreSuppressed();
                                    break;
                                }
                                break;
                            default:
                                sq0.w wVar2 = gVar.f20379f;
                                if (wVar2 != null) {
                                    wVar2.loadMoreData();
                                    break;
                                }
                                break;
                        }
                    }
                };
            }
            k14.post(this.f20380g);
            Handler k15 = k(recyclerView);
            if (this.f20381h == null) {
                this.f20381h = new Runnable(this) { // from class: ar0.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f20373b;

                    {
                        this.f20373b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i15;
                        g gVar = this.f20373b;
                        switch (i17) {
                            case 0:
                                sq0.w wVar = gVar.f20379f;
                                if (wVar != null) {
                                    wVar.onLoadMoreSuppressed();
                                    break;
                                }
                                break;
                            default:
                                sq0.w wVar2 = gVar.f20379f;
                                if (wVar2 != null) {
                                    wVar2.loadMoreData();
                                    break;
                                }
                                break;
                        }
                    }
                };
            }
            k15.removeCallbacks(this.f20381h);
        }
    }

    public final Handler k(View view) {
        if (this.f20382i == null) {
            Handler handler = view.getHandler();
            this.f20382i = handler;
            if (handler == null) {
                this.f20382i = new Handler(Looper.getMainLooper());
            }
        }
        return this.f20382i;
    }

    public final void l() {
        if (this.f20375b) {
            this.f20375b = false;
            l2 l2Var = this.f20376c;
            if (l2Var != null) {
                this.f20374a = l2Var.P();
            }
        }
    }

    public final void m(l2 l2Var) {
        this.f20376c = l2Var;
        int p13 = l2Var instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) l2Var).p1() : l2Var instanceof PinterestStaggeredGridLayoutManager ? ((PinterestStaggeredGridLayoutManager) l2Var).getF19177u() : l2Var instanceof GridLayoutManager ? ((GridLayoutManager) l2Var).L1() : 0;
        if (p13 > 0) {
            this.f20378e = new int[p13];
        } else {
            this.f20378e = null;
        }
    }

    public g(l2 l2Var) {
        this(l2Var, new bk.f());
    }
}
