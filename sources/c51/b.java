package c51;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import ey.l2;
import ey.m3;
import kotlin.jvm.internal.Intrinsics;
import m60.u;

/* loaded from: classes5.dex */
public final class b extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f26499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26500b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26501c;

    /* renamed from: d, reason: collision with root package name */
    public final a f26502d;

    /* renamed from: e, reason: collision with root package name */
    public int f26503e;

    public b(RecyclerView profileBoardsTabRecyclerView, String userId, boolean z13) {
        Intrinsics.checkNotNullParameter(profileBoardsTabRecyclerView, "profileBoardsTabRecyclerView");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter("SQUARE_VIEW", "defaultBoardViewType");
        this.f26499a = profileBoardsTabRecyclerView;
        this.f26500b = userId;
        this.f26501c = z13;
        a aVar = new a(this);
        this.f26502d = aVar;
        u.f85943a.h(aVar);
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 != 0) {
            u.f85943a.d(new l2("SCROLL"));
            k();
        }
    }

    public final void k() {
        new m3(this.f26500b, this.f26501c).i();
        u.f85943a.j(this.f26502d);
        this.f26499a.w2(this);
    }

    public final void l(int i13) {
        this.f26503e = i13;
    }
}
