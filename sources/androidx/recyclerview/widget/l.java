package androidx.recyclerview.widget;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19472d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f19473e;

    public l(ArrayList dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f19473e = dataList;
    }

    public final void C(b2 b2Var) {
        android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
        int size = ((List) aVar.f15841e).size();
        if (size < 0 || size > ((List) aVar.f15841e).size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + ((List) aVar.f15841e).size() + ". Given:" + size);
        }
        if (((j) aVar.f15843g) != j.NO_STABLE_IDS) {
            com.bumptech.glide.d.g("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", b2Var.f19332b);
        } else if (b2Var.f19332b) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int j13 = aVar.j(b2Var);
        if ((j13 == -1 ? null : (i1) ((List) aVar.f15841e).get(j13)) != null) {
            return;
        }
        i1 i1Var = new i1(b2Var, aVar, (p3) aVar.f15838b, ((f3) aVar.f15844h).c());
        ((List) aVar.f15841e).add(size, i1Var);
        Iterator it = ((List) aVar.f15839c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                b2Var.q(recyclerView);
            }
        }
        if (i1Var.f19451e > 0) {
            ((l) aVar.f15837a).n(aVar.d(i1Var), i1Var.f19451e);
        }
        aVar.c();
    }

    public final List D() {
        List list;
        android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
        if (((List) aVar.f15841e).isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(((List) aVar.f15841e).size());
            Iterator it = ((List) aVar.f15841e).iterator();
            while (it.hasNext()) {
                arrayList.add(((i1) it.next()).f19449c);
            }
            list = arrayList;
        }
        return Collections.unmodifiableList(list);
    }

    public final void E(ArrayList dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f19473e = dataList;
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int d(b2 b2Var, y2 y2Var, int i13) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                i1 i1Var = (i1) ((IdentityHashMap) aVar.f15840d).get(y2Var);
                if (i1Var == null) {
                    return -1;
                }
                int d2 = i13 - aVar.d(i1Var);
                b2 b2Var2 = i1Var.f19449c;
                int e13 = b2Var2.e();
                if (d2 >= 0 && d2 < e13) {
                    return b2Var2.d(b2Var, y2Var, d2);
                }
                StringBuilder t13 = a.a.t("Detected inconsistent adapter updates. The local position of the view holder maps to ", d2, " which is out of bounds for the adapter with size ", e13, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
                t13.append(y2Var);
                t13.append("adapter:");
                t13.append(b2Var);
                throw new IllegalStateException(t13.toString());
            default:
                if (b2Var == this) {
                    return i13;
                }
                return -1;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f19472d) {
            case 0:
                Iterator it = ((List) ((android.support.v4.media.a) this.f19473e).f15841e).iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    i13 += ((i1) it.next()).f19451e;
                }
                return i13;
            default:
                return ((ArrayList) this.f19473e).size();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                androidx.appcompat.widget.a g13 = aVar.g(i13);
                i1 i1Var = (i1) g13.f16504c;
                long q13 = i1Var.f19448b.q(i1Var.f19449c.f(g13.f16502a));
                g13.f16503b = false;
                g13.f16504c = null;
                g13.f16502a = -1;
                aVar.f15842f = g13;
                return q13;
            default:
                return -1L;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                androidx.appcompat.widget.a g13 = aVar.g(i13);
                i1 i1Var = (i1) g13.f16504c;
                int i14 = i1Var.f19447a.i(i1Var.f19449c.g(g13.f16502a));
                g13.f16503b = false;
                g13.f16504c = null;
                g13.f16502a = -1;
                aVar.f15842f = g13;
                return i14;
            default:
                return 0;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void q(RecyclerView recyclerView) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                Iterator it = ((List) aVar.f15839c).iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == recyclerView) {
                        break;
                    }
                }
                ((List) aVar.f15839c).add(new WeakReference(recyclerView));
                Iterator it2 = ((List) aVar.f15841e).iterator();
                while (it2.hasNext()) {
                    ((i1) it2.next()).f19449c.q(recyclerView);
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                androidx.appcompat.widget.a g13 = aVar.g(i13);
                ((IdentityHashMap) aVar.f15840d).put(y2Var, (i1) g13.f16504c);
                i1 i1Var = (i1) g13.f16504c;
                i1Var.f19449c.a(y2Var, g13.f16502a);
                g13.f16503b = false;
                g13.f16504c = null;
                g13.f16502a = -1;
                aVar.f15842f = g13;
                break;
            default:
                ez1.a holder = (ez1.a) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Object obj = ((ArrayList) this.f19473e).get(i13);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ez1.g gVar = (ez1.g) obj;
                pk.a0.p(holder.f60695u, gVar.f60716a);
                pk.a0.p(holder.f60696v, gVar.f60717b);
                pk.a0.p(holder.f60697w, gVar.f60718c);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        switch (this.f19472d) {
            case 0:
                i1 c13 = ((p3) ((android.support.v4.media.a) this.f19473e).f15838b).c(i13);
                return c13.f19449c.t(parent, c13.f19447a.h(i13));
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                View itemView = LayoutInflater.from(parent.getContext()).inflate(dz1.c.event_context_dev_tool_details_item, (ViewGroup) parent, false);
                Intrinsics.f(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                ez1.a aVar = new ez1.a(itemView);
                View findViewById = itemView.findViewById(dz1.b.eventTime);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                aVar.f60695u = (GestaltText) findViewById;
                View findViewById2 = itemView.findViewById(dz1.b.eventType);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                aVar.f60696v = (GestaltText) findViewById2;
                View findViewById3 = itemView.findViewById(dz1.b.eventDetails);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                aVar.f60697w = (GestaltText) findViewById3;
                return aVar;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void u(RecyclerView recyclerView) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                int size = ((List) aVar.f15839c).size() - 1;
                while (true) {
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) ((List) aVar.f15839c).get(size);
                        if (weakReference.get() == null) {
                            ((List) aVar.f15839c).remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            ((List) aVar.f15839c).remove(size);
                        }
                        size--;
                    }
                }
                Iterator it = ((List) aVar.f15841e).iterator();
                while (it.hasNext()) {
                    ((i1) it.next()).f19449c.u(recyclerView);
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final boolean v(y2 y2Var) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                i1 i1Var = (i1) ((IdentityHashMap) aVar.f15840d).get(y2Var);
                if (i1Var != null) {
                    boolean v13 = i1Var.f19449c.v(y2Var);
                    ((IdentityHashMap) aVar.f15840d).remove(y2Var);
                    return v13;
                }
                throw new IllegalStateException("Cannot find wrapper for " + y2Var + ", seems like it is not bound by this adapter: " + aVar);
            default:
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void w(y2 y2Var) {
        switch (this.f19472d) {
            case 0:
                ((android.support.v4.media.a) this.f19473e).h(y2Var).f19449c.w(y2Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void x(y2 y2Var) {
        switch (this.f19472d) {
            case 0:
                ((android.support.v4.media.a) this.f19473e).h(y2Var).f19449c.x(y2Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        switch (this.f19472d) {
            case 0:
                android.support.v4.media.a aVar = (android.support.v4.media.a) this.f19473e;
                i1 i1Var = (i1) ((IdentityHashMap) aVar.f15840d).get(y2Var);
                if (i1Var != null) {
                    i1Var.f19449c.y(y2Var);
                    ((IdentityHashMap) aVar.f15840d).remove(y2Var);
                    return;
                } else {
                    throw new IllegalStateException("Cannot find wrapper for " + y2Var + ", seems like it is not bound by this adapter: " + aVar);
                }
            default:
                return;
        }
    }

    public l(b2[] b2VarArr) {
        this(k.f19459b, b2VarArr);
    }

    public l(k kVar, b2[] b2VarArr) {
        this(kVar, Arrays.asList(b2VarArr));
    }

    public l(k kVar, List list) {
        android.support.v4.media.a aVar = new android.support.v4.media.a();
        aVar.f15839c = new ArrayList();
        aVar.f15840d = new IdentityHashMap();
        aVar.f15841e = new ArrayList();
        aVar.f15842f = new androidx.appcompat.widget.a();
        aVar.f15837a = this;
        kVar.getClass();
        aVar.f15838b = new l0.k(5);
        j jVar = kVar.f19460a;
        aVar.f15843g = jVar;
        if (jVar == j.NO_STABLE_IDS) {
            aVar.f15844h = new d3(0);
        } else if (jVar == j.ISOLATED_STABLE_IDS) {
            aVar.f15844h = new a8.t0(2);
        } else if (jVar == j.SHARED_STABLE_IDS) {
            aVar.f15844h = new d3(1);
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
        this.f19473e = aVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C((b2) it.next());
        }
        A(((j) ((android.support.v4.media.a) this.f19473e).f15843g) != j.NO_STABLE_IDS);
    }
}
