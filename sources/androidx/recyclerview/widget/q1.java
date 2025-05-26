package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public int f19595a;

    /* renamed from: b, reason: collision with root package name */
    public int f19596b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19597c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19598d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19599e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f19600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PinterestStaggeredGridLayoutManagerImpl f19601g;

    public q1(PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl) {
        this.f19601g = pinterestStaggeredGridLayoutManagerImpl;
        c();
    }

    public final void a() {
        boolean z13 = this.f19597c;
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19601g;
        this.f19596b = z13 ? pinterestStaggeredGridLayoutManagerImpl.t1().g() : pinterestStaggeredGridLayoutManagerImpl.t1().k();
    }

    public final void b(int i13) {
        boolean z13 = this.f19597c;
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19601g;
        this.f19596b = z13 ? pinterestStaggeredGridLayoutManagerImpl.t1().g() - i13 : pinterestStaggeredGridLayoutManagerImpl.t1().k() + i13;
    }

    public final void c() {
        this.f19595a = -1;
        this.f19596b = Integer.MIN_VALUE;
        this.f19597c = false;
        this.f19598d = false;
        this.f19599e = false;
        int[] iArr = this.f19600f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
