package cl1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ar0.s;
import bi1.a0;
import ck2.i;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import com.pinterest.video.core.view.PinterestVideoView;
import df.j1;
import ek2.j;
import ir.g;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import s92.o;
import v.d3;
import wk1.l;
import yq0.k;
import yq0.r;

/* loaded from: classes5.dex */
public final class c extends s {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f27981a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f27982b;

    /* renamed from: c, reason: collision with root package name */
    public final e f27983c;

    /* renamed from: d, reason: collision with root package name */
    public j f27984d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27985e;

    /* renamed from: f, reason: collision with root package name */
    public final qc2.d f27986f;

    /* renamed from: g, reason: collision with root package name */
    public final d3 f27987g;

    public c(w eventManager, g rootViewGroupProvider, k startAction) {
        r fullyRenderCompletionAction = r.f139724j;
        r fullyRenderAbortionAction = r.f139725k;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(rootViewGroupProvider, "rootViewGroupProvider");
        Intrinsics.checkNotNullParameter(fullyRenderCompletionAction, "fullyRenderCompletionAction");
        Intrinsics.checkNotNullParameter(fullyRenderAbortionAction, "fullyRenderAbortionAction");
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        this.f27981a = rootViewGroupProvider;
        this.f27982b = startAction;
        this.f27983c = new e(eventManager);
        this.f27986f = new qc2.d();
        this.f27987g = new d3(2);
        d3.e("detector created [" + hashCode() + "]");
    }

    @Override // ar0.s, ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f27985e) {
            return;
        }
        new ly.c(o.ABORTED).i();
        Unit unit = Unit.f80348a;
        n();
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f27985e) {
            return;
        }
        if (i13 > 0 || i14 > 0) {
            new ly.c(o.ABORTED).i();
            Unit unit = Unit.f80348a;
            n();
        }
    }

    @Override // ar0.s, ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        q();
    }

    public final void n() {
        if (this.f27985e) {
            return;
        }
        String e13 = a.a.e("one-time-use detector [", hashCode(), "] ending now !!!");
        this.f27987g.getClass();
        d3.e(e13);
        j jVar = this.f27984d;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f27984d = null;
        this.f27985e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ViewGroup viewGroup, d3 d3Var) {
        String valueOf;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt != 0) {
                boolean z13 = childAt instanceof qy.a;
                d3 d3Var2 = this.f27987g;
                if (z13) {
                    qy.a aVar = (qy.a) childAt;
                    String coexistId = aVar.coexistId();
                    if (j1.U0(coexistId)) {
                        float c13 = this.f27986f.c(childAt, 0, 0, childAt.getWidth(), childAt.getHeight(), viewGroup);
                        boolean z14 = c13 > 0.0f;
                        StringBuilder v13 = a.a.v("check PWTImageView [", childAt.getClass().getSimpleName(), "_", childAt.hashCode(), "] id [");
                        v13.append(coexistId);
                        v13.append("] isVisible:(");
                        v13.append(z14);
                        v13.append("), percentage on screen [");
                        v13.append(c13);
                        v13.append("]");
                        String sb3 = v13.toString();
                        d3Var2.getClass();
                        d3.e(sb3);
                        Set set = (Set) d3Var.f123427c;
                        if (z14 && aVar.getY2()) {
                            set.add(coexistId);
                        } else if (set.contains(coexistId)) {
                            set.remove(coexistId);
                        }
                    }
                } else if (childAt instanceof qy.c) {
                    PinterestVideoView pinterestVideoView = (PinterestVideoView) ((qy.c) childAt);
                    bc2.k kVar = pinterestVideoView.L;
                    if (kVar == null || (valueOf = kVar.f22657a) == null) {
                        valueOf = String.valueOf(pinterestVideoView.hashCode());
                    }
                    String simpleName = childAt.getClass().getSimpleName();
                    int hashCode = childAt.hashCode();
                    boolean z15 = pinterestVideoView.L0;
                    StringBuilder v14 = a.a.v("check PWTVideoView [", simpleName, "_", hashCode, "] id [");
                    v14.append(valueOf);
                    v14.append("]video load started [");
                    v14.append(z15);
                    v14.append("]");
                    String sb4 = v14.toString();
                    d3Var2.getClass();
                    d3.e(sb4);
                    Set set2 = (Set) d3Var.f123429e;
                    if (j1.U0(valueOf) && pinterestVideoView.L0 && pinterestVideoView.f52752b1) {
                        set2.add(valueOf);
                    } else if (set2.contains(valueOf)) {
                        set2.remove(valueOf);
                    }
                } else if (childAt instanceof qy.b) {
                    SearchTypeaheadTextCell searchTypeaheadTextCell = (SearchTypeaheadTextCell) ((qy.b) childAt);
                    String L = searchTypeaheadTextCell.L();
                    if (j1.U0(L)) {
                        boolean z16 = this.f27986f.c(childAt, 0, 0, childAt.getWidth(), childAt.getHeight(), viewGroup) > 0.0f;
                        String simpleName2 = childAt.getClass().getSimpleName();
                        int hashCode2 = childAt.hashCode();
                        boolean z17 = searchTypeaheadTextCell.f47902o;
                        StringBuilder v15 = a.a.v("check PWTTextView [", simpleName2, "_", hashCode2, "] id [");
                        v15.append(L);
                        v15.append("]textview rendered [");
                        v15.append(z17);
                        v15.append("]");
                        String sb5 = v15.toString();
                        d3Var2.getClass();
                        d3.e(sb5);
                        Set set3 = (Set) d3Var.f123431g;
                        if (z16 && searchTypeaheadTextCell.f47904q) {
                            set3.add(L);
                        } else if (set3.contains(L)) {
                            set3.remove(L);
                        }
                    }
                }
                if (childAt instanceof ViewGroup) {
                    o((ViewGroup) childAt, d3Var);
                }
            }
        }
    }

    public final void p() {
        this.f27985e = false;
        d3 d3Var = this.f27987g;
        ((Set) d3Var.f123427c).clear();
        ((Set) d3Var.f123428d).clear();
        ((Set) d3Var.f123429e).clear();
        ((Set) d3Var.f123430f).clear();
        ((Set) d3Var.f123431g).clear();
        ((Set) d3Var.f123432h).clear();
        j jVar = this.f27984d;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f27984d = null;
        q();
    }

    public final void q() {
        boolean z13 = this.f27985e;
        d3 d3Var = this.f27987g;
        if (z13) {
            String str = "can not restart [" + hashCode() + "], the detector instance can only be used once.";
            d3Var.getClass();
            d3.e(str);
            return;
        }
        if (this.f27984d == null) {
            this.f27984d = (j) this.f27983c.F(new l(27, new a0(this, 22)), new l(28, b.f27980i), i.f27923c, i.f27924d);
            String str2 = "start counting PWT [" + hashCode() + "]";
            d3Var.getClass();
            d3.e(str2);
            this.f27982b.invoke();
        }
    }

    public final void r(String str, Set set) {
        d3 d3Var = this.f27987g;
        ((Set) d3Var.f123427c).clear();
        ((Set) d3Var.f123429e).clear();
        ((Set) d3Var.f123431g).clear();
        if (str == null || set.contains(str)) {
            return;
        }
        if (set.isEmpty()) {
            new ly.e(7, 0).i();
        }
        set.add(str);
        ViewGroup viewGroup = (ViewGroup) this.f27981a.get();
        if (viewGroup != null) {
            o(viewGroup, d3Var);
        }
    }
}
