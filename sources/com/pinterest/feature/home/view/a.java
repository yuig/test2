package com.pinterest.feature.home.view;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ar0.y;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final StaggeredGridLayoutManager f45840a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f45841b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f45842c;

    /* renamed from: d, reason: collision with root package name */
    public int f45843d;

    public a(StaggeredGridLayoutManager staggeredGridLayoutManager, Handler handler) {
        this.f45840a = staggeredGridLayoutManager;
        this.f45841b = handler;
        this.f45842c = new int[staggeredGridLayoutManager.f19286p];
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        if (i13 != 0) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f45840a;
        int i14 = staggeredGridLayoutManager.f19286p;
        int[] iArr = this.f45842c;
        if (iArr == null || iArr.length < i14) {
            int[] iArr2 = new int[i14];
            this.f45842c = iArr2;
            Arrays.fill(iArr2, -1);
        }
        int b13 = eb2.j.b(staggeredGridLayoutManager, this.f45842c);
        int i15 = staggeredGridLayoutManager.f19286p;
        this.f45843d = 0;
        if (b13 != -1 && b13 < i15) {
            this.f45843d = 2;
        }
        this.f45841b.post(new ne0.b(this, 3));
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
    }
}
