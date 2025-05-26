package kx0;

import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;
import com.pinterest.activity.newshub.view.header.NewsHubSectionHeader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final NewsHubSectionHeader f81095a;

    /* renamed from: b, reason: collision with root package name */
    public final k f81096b;

    /* renamed from: c, reason: collision with root package name */
    public final l2 f81097c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f81098d;

    /* renamed from: e, reason: collision with root package name */
    public int f81099e;

    public w(NewsHubSectionHeader header, k sectionStateListener, l2 layoutManager) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sectionStateListener, "sectionStateListener");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.f81095a = header;
        this.f81096b = sectionStateListener;
        this.f81097c = layoutManager;
        this.f81098d = layoutManager instanceof PinterestStaggeredGridLayoutManager ? new int[((PinterestStaggeredGridLayoutManager) layoutManager).getF19177u()] : null;
        this.f81099e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    @Override // androidx.recyclerview.widget.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kx0.w.j(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
