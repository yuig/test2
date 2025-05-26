package of1;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qf1.m0;
import sf1.l0;
import sf1.s;
import sf1.s0;
import sf1.s1;
import sf1.w0;
import tf1.d;

/* loaded from: classes5.dex */
public final class b extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final d0 f94406d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f94407e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f94408f;

    /* renamed from: g, reason: collision with root package name */
    public final d f94409g;

    /* renamed from: h, reason: collision with root package name */
    public final w0 f94410h;

    /* renamed from: i, reason: collision with root package name */
    public final String f94411i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f94412j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f94413k;

    /* renamed from: l, reason: collision with root package name */
    public float f94414l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f94415m;

    public b(d0 pinalytics, l0 pageActionListeners, s0 pageViewModel, d storyPinViewModel, w0 w0Var) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pageActionListeners, "pageActionListeners");
        Intrinsics.checkNotNullParameter(pageViewModel, "pageViewModel");
        Intrinsics.checkNotNullParameter(storyPinViewModel, "storyPinViewModel");
        this.f94406d = pinalytics;
        this.f94407e = pageActionListeners;
        this.f94408f = pageViewModel;
        this.f94409g = storyPinViewModel;
        this.f94410h = w0Var;
        this.f94411i = null;
        this.f94412j = new ArrayList();
        this.f94413k = new LinkedHashMap();
        this.f94414l = 0.5625f;
    }

    public final s C(int i13) {
        s1 D = D(i13);
        if (D != null) {
            return D.f112740r;
        }
        return null;
    }

    public final s1 D(int i13) {
        a aVar = (a) this.f94413k.get(Integer.valueOf(i13));
        if (aVar != null) {
            return aVar.f94405u;
        }
        return null;
    }

    public final void E() {
        Iterator it = this.f94413k.entrySet().iterator();
        while (it.hasNext()) {
            PinterestVideoView o13 = ((a) ((Map.Entry) it.next()).getValue()).f94405u.f112740r.o();
            if (o13 != null) {
                o13.P(true);
            }
        }
    }

    public final void F() {
        Iterator it = this.f94413k.entrySet().iterator();
        while (it.hasNext()) {
            PinterestVideoView o13 = ((a) ((Map.Entry) it.next()).getValue()).f94405u.f112740r.o();
            if (o13 != null) {
                o13.P(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f94412j.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        a holder = (a) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f94413k.put(Integer.valueOf(i13), holder);
        ArrayList arrayList = this.f94412j;
        m0 m0Var = (m0) arrayList.get(i13);
        arrayList.size();
        holder.k0(m0Var, false);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f13 = this.f94414l;
        Integer num = this.f94415m;
        return new a(new s1(context, this.f94406d, this.f94407e, this.f94408f, this.f94409g, this.f94410h, this.f94411i, f13, num));
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        a holder = (a) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f94405u.onViewRecycled();
    }
}
