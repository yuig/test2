package x21;

import android.view.KeyEvent;
import android.view.View;
import android.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m2;
import androidx.recyclerview.widget.o2;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nc2.j;
import oc2.i;
import q5.y;
import we1.h0;

/* loaded from: classes5.dex */
public final class g extends o2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final View f131589a;

    /* renamed from: b, reason: collision with root package name */
    public final c f131590b;

    /* renamed from: c, reason: collision with root package name */
    public final h f131591c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f131592d;

    /* renamed from: e, reason: collision with root package name */
    public final qc2.d f131593e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f131594f;

    /* renamed from: g, reason: collision with root package name */
    public int f131595g;

    /* renamed from: h, reason: collision with root package name */
    public final f f131596h;

    public g(View parentView, a childViewProvider, h playMode, Long l13) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(childViewProvider, "childViewProvider");
        Intrinsics.checkNotNullParameter(playMode, "playMode");
        this.f131589a = parentView;
        this.f131590b = childViewProvider;
        this.f131591c = playMode;
        this.f131592d = l13;
        this.f131593e = new qc2.d();
        this.f131594f = new LinkedHashSet();
        parentView.addOnAttachStateChangeListener(new n.f(this, 3));
        this.f131596h = new f(this);
    }

    public static void n(PinterestVideoView pinterestVideoView, boolean z13) {
        if (pinterestVideoView != null) {
            if (pinterestVideoView.f() || pinterestVideoView.f52774J || z13) {
                pinterestVideoView.a0(0L);
                i.d(pinterestVideoView, false);
                pinterestVideoView.q0().u(pinterestVideoView);
                pinterestVideoView.g0(j.AUTOPLAY_MAYBE_WITH_NETWORK);
            }
        }
    }

    public static void o(PinterestVideoView pinterestVideoView, boolean z13) {
        if (pinterestVideoView != null) {
            if (!pinterestVideoView.f() || z13) {
                pinterestVideoView.g0(j.AUTOPLAY_BY_STATE_WITH_NETWORK);
                pinterestVideoView.q0().o(pinterestVideoView);
                pinterestVideoView.j(0L, false);
                pinterestVideoView.play();
                i.d(pinterestVideoView, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m(view);
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        l(view);
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 == 0) {
            p();
        }
    }

    public final boolean k(PinterestVideoView pinterestVideoView) {
        if (pinterestVideoView == null) {
            return false;
        }
        View view = this.f131589a;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                break;
            }
            if (view2 instanceof y) {
                view = view2;
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return pinterestVideoView.O.isVisible((qc2.c) pinterestVideoView.O.getCalculate().invoke(Double.valueOf(this.f131593e.d(pinterestVideoView, view, null))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(View view) {
        boolean z13;
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = view instanceof b ? (b) view : null;
        if (bVar != null) {
            LinkedHashSet linkedHashSet = this.f131594f;
            linkedHashSet.add(bVar);
            pg1.c T = ((h0) bVar).T();
            if (T != null) {
                T.f100115y = this.f131596h;
            }
            PinterestVideoView videoView = bVar.getVideoView();
            if (videoView != null) {
                int[] iArr = d.f131586a;
                h hVar = this.f131591c;
                int i13 = iArr[hVar.ordinal()];
                if (i13 == 1) {
                    z13 = false;
                } else {
                    if (i13 != 2 && i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z13 = true;
                }
                videoView.O(z13);
                n(videoView, true);
                View view2 = this.f131589a;
                while (view2 != null) {
                    if ((view2 instanceof PinterestRecyclerView) && ((PinterestRecyclerView) view2).f52531a.N != 0) {
                        return;
                    }
                    Object parent = view2.getParent();
                    view2 = parent instanceof View ? (View) parent : null;
                }
                if (linkedHashSet.size() == 1 || hVar == h.ALL_VISIBLE) {
                    o(videoView, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = view instanceof b ? (b) view : null;
        if (bVar != null) {
            pg1.c T = ((h0) bVar).T();
            if (T != null) {
                T.f100115y = null;
            }
            this.f131594f.remove(bVar);
        }
    }

    public final void p() {
        int i13;
        int childCount;
        KeyEvent.Callback childAt;
        int i14;
        int childCount2;
        KeyEvent.Callback childAt2;
        int i15;
        int childCount3;
        KeyEvent.Callback childAt3;
        int i16 = d.f131586a[this.f131591c.ordinal()];
        c cVar = this.f131590b;
        if (i16 == 1) {
            a aVar = (a) cVar;
            int i17 = aVar.f131584a;
            Object obj = aVar.f131585b;
            switch (i17) {
                case 0:
                    i13 = 0;
                    break;
                default:
                    i13 = ((LinearLayoutManager) obj).k1();
                    break;
            }
            int i18 = aVar.f131584a;
            switch (i18) {
                case 0:
                    childCount = ((GridLayout) obj).getChildCount();
                    break;
                default:
                    childCount = ((LinearLayoutManager) obj).l1();
                    break;
            }
            int i19 = this.f131595g;
            if (i19 > childCount || i19 < i13) {
                this.f131595g = i13;
            }
            int i23 = this.f131595g;
            int i24 = childCount - i13;
            if (i24 < 0) {
                return;
            }
            int i25 = 0;
            boolean z13 = false;
            while (true) {
                int i26 = i23 + i25;
                if (i26 > childCount) {
                    i26 = ((i26 - childCount) + i13) - 1;
                }
                switch (i18) {
                    case 0:
                        childAt = ((GridLayout) obj).getChildAt(i26);
                        break;
                    default:
                        childAt = ((LinearLayoutManager) obj).z(i26);
                        break;
                }
                b bVar = childAt instanceof b ? (b) childAt : null;
                if (bVar != null) {
                    if (z13 || !k(bVar.getVideoView())) {
                        n(bVar.getVideoView(), false);
                    } else {
                        this.f131595g = i26;
                        o(bVar.getVideoView(), false);
                        z13 = true;
                    }
                }
                if (i25 == i24) {
                    return;
                } else {
                    i25++;
                }
            }
        } else if (i16 == 2) {
            a aVar2 = (a) cVar;
            int i27 = aVar2.f131584a;
            Object obj2 = aVar2.f131585b;
            switch (i27) {
                case 0:
                    i14 = 0;
                    break;
                default:
                    i14 = ((LinearLayoutManager) obj2).k1();
                    break;
            }
            int i28 = aVar2.f131584a;
            switch (i28) {
                case 0:
                    childCount2 = ((GridLayout) obj2).getChildCount();
                    break;
                default:
                    childCount2 = ((LinearLayoutManager) obj2).l1();
                    break;
            }
            if (i14 > childCount2) {
                return;
            }
            boolean z14 = false;
            while (true) {
                switch (i28) {
                    case 0:
                        childAt2 = ((GridLayout) obj2).getChildAt(i14);
                        break;
                    default:
                        childAt2 = ((LinearLayoutManager) obj2).z(i14);
                        break;
                }
                b bVar2 = childAt2 instanceof b ? (b) childAt2 : null;
                if (bVar2 != null) {
                    if (z14 || !k(bVar2.getVideoView())) {
                        n(bVar2.getVideoView(), false);
                    } else {
                        o(bVar2.getVideoView(), false);
                        z14 = true;
                    }
                }
                if (i14 == childCount2) {
                    return;
                } else {
                    i14++;
                }
            }
        } else {
            if (i16 != 3) {
                return;
            }
            a aVar3 = (a) cVar;
            int i29 = aVar3.f131584a;
            Object obj3 = aVar3.f131585b;
            switch (i29) {
                case 0:
                    i15 = 0;
                    break;
                default:
                    i15 = ((LinearLayoutManager) obj3).k1();
                    break;
            }
            int i33 = aVar3.f131584a;
            switch (i33) {
                case 0:
                    childCount3 = ((GridLayout) obj3).getChildCount();
                    break;
                default:
                    childCount3 = ((LinearLayoutManager) obj3).l1();
                    break;
            }
            if (i15 > childCount3) {
                return;
            }
            while (true) {
                switch (i33) {
                    case 0:
                        childAt3 = ((GridLayout) obj3).getChildAt(i15);
                        break;
                    default:
                        childAt3 = ((LinearLayoutManager) obj3).z(i15);
                        break;
                }
                b bVar3 = childAt3 instanceof b ? (b) childAt3 : null;
                if (bVar3 != null) {
                    if (k(bVar3.getVideoView())) {
                        o(bVar3.getVideoView(), false);
                    } else {
                        n(bVar3.getVideoView(), false);
                    }
                }
                if (i15 == childCount3) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }
}
