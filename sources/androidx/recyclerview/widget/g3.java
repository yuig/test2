package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public int f19425a;

    /* renamed from: b, reason: collision with root package name */
    public int f19426b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19428d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19429e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f19430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f19431g;

    public g3(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f19431g = staggeredGridLayoutManager;
        c();
    }

    public final void a() {
        boolean z13 = this.f19427c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19431g;
        this.f19426b = z13 ? staggeredGridLayoutManager.f19288r.g() : staggeredGridLayoutManager.f19288r.k();
    }

    public final void b(int i13) {
        boolean z13 = this.f19427c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19431g;
        if (z13) {
            this.f19426b = staggeredGridLayoutManager.f19288r.g() - i13;
        } else {
            this.f19426b = staggeredGridLayoutManager.f19288r.k() + i13;
        }
    }

    public final void c() {
        this.f19425a = -1;
        this.f19426b = Integer.MIN_VALUE;
        this.f19427c = false;
        this.f19428d = false;
        this.f19429e = false;
        int[] iArr = this.f19430f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public final void d(k3[] k3VarArr) {
        int length = k3VarArr.length;
        int[] iArr = this.f19430f;
        if (iArr == null || iArr.length < length) {
            this.f19430f = new int[this.f19431g.f19287q.length];
        }
        for (int i13 = 0; i13 < length; i13++) {
            this.f19430f[i13] = k3VarArr[i13].q(Integer.MIN_VALUE);
        }
    }
}
