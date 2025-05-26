package kr;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import b20.c;
import com.pinterest.base.LockableViewPager;
import com.pinterest.framework.screens.y;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.w0;
import h32.x3;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jr.a;
import m60.t0;
import m60.v0;
import ml1.q;
import nl1.d;
import tb0.g;
import tb0.h;

@Deprecated
/* loaded from: classes.dex */
public abstract class a<T extends jr.a> extends d implements q, y {
    public c X;
    public jr.a Y;
    public final int Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f80757a0;

    @Override // nl1.d
    public final x3 C7(String str) {
        d V7;
        if (!this.f80757a0 && (V7 = V7()) != null) {
            return V7.C7(str);
        }
        return super.C7(str);
    }

    @Override // nl1.d
    public final a4 D7() {
        if (this.f80757a0) {
            return getQ0();
        }
        d V7 = V7();
        if (V7 != null) {
            return V7.getQ0();
        }
        return null;
    }

    @Override // nl1.d
    public final d4 E7() {
        if (this.f80757a0) {
            return getViewType();
        }
        d V7 = V7();
        return V7 != null ? V7.getViewType() : d4.ERROR;
    }

    @Override // nl1.d
    public void K7() {
        super.K7();
        d V7 = V7();
        if (V7 != null) {
            V7.Q7(true);
        }
    }

    @Override // nl1.d
    public void L7() {
        super.L7();
        d V7 = V7();
        if (V7 != null) {
            V7.Q7(false);
        }
    }

    @Override // jl1.a
    public final void N6(String str, Bundle bundle) {
        super.N6(str, bundle);
        d V7 = V7();
        if (V7 != null) {
            V7.N6(str, bundle);
        }
    }

    @Override // nl1.d
    public final void Q6(StringBuilder sb3) {
        d V7 = V7();
        if (V7 != null) {
            V7.Q6(sb3);
        }
        super.Q6(sb3);
    }

    public final d V7() {
        jr.a aVar = this.Y;
        if (aVar != null && aVar.f77529f.size() != 0) {
            Fragment r13 = this.Y.r();
            if (r13 instanceof d) {
                return (d) r13;
            }
        }
        return null;
    }

    public abstract LockableViewPager W7(View view);

    public void X7(LockableViewPager lockableViewPager, Context context) {
    }

    @Override // nl1.d, nx.i1
    public final w0 e() {
        d V7;
        if (this.f80757a0 || (V7 = V7()) == null) {
            return null;
        }
        return V7.e();
    }

    @Override // ml1.q
    public void e3() {
        com.pinterest.framework.screens.a V7 = V7();
        if (V7 instanceof q) {
            ((q) V7).e3();
        }
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        if (this.f80757a0) {
            return super.generateLoggingContext();
        }
        d V7 = V7();
        if (V7 != null) {
            return V7.generateLoggingContext();
        }
        return null;
    }

    /* renamed from: getViewParameterType */
    public a4 getQ0() {
        return D7();
    }

    @Override // jl1.a, com.pinterest.framework.screens.j
    public final Map k2() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f76938b);
        d V7 = V7();
        if (V7 != null) {
            hashMap.putAll(V7.k2());
        }
        return hashMap;
    }

    @Override // ml1.q
    public void k5() {
        com.pinterest.framework.screens.a V7 = V7();
        if (V7 instanceof q) {
            ((q) V7).k5();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = v0.fragment_pager_task;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        HashSet hashSet = h.f117076w;
        g.f117075a.h("ViewPagerFragment: viewAdapter is set to null");
        jr.a aVar = this.Y;
        if (aVar != null) {
            aVar.A();
        }
        this.Y = null;
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        c cVar = this.X;
        if (cVar != null) {
            cVar.y(null);
            ((LockableViewPager) this.X.f21278a).z(null);
            this.X = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        jr.a aVar = this.Y;
        if (aVar == null || !aVar.q()) {
            return;
        }
        bundle.putParcelable("view_pager_adapter", this.Y.i());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(t0.content_pager_vw_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(v0.view_pager);
            viewStub.setInflatedId(t0.content_pager_vw);
            viewStub.inflate();
        }
        LockableViewPager W7 = W7(view);
        X7(W7, view.getContext());
        this.X = new c(W7);
        if (!((m60.d) m60.d.a()).f()) {
            ((LockableViewPager) this.X.f21278a).setId(View.generateViewId());
        }
        jr.a aVar = this.Y;
        if (aVar != null && aVar.q() && bundle != null && (parcelable = bundle.getParcelable("view_pager_adapter")) != null) {
            this.Y.h(parcelable, getClass().getClassLoader());
        }
        ((LockableViewPager) this.X.f21278a).D(this.Z);
        ((LockableViewPager) this.X.f21278a).z(this.Y);
    }

    @Override // nl1.d
    public String q7() {
        Navigation navigation;
        if (this.f80757a0) {
            return super.q7();
        }
        d V7 = V7();
        return (V7 == null || (navigation = V7.I) == null) ? super.q7() : navigation.getF49940b();
    }

    @Override // nl1.d
    public final List r7() {
        d V7 = V7();
        if (V7 != null) {
            return V7.r7();
        }
        return null;
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        d V7;
        if (this.f80757a0 || (V7 = V7()) == null) {
            return null;
        }
        return V7.getF63135d0();
    }

    @Override // com.pinterest.framework.screens.y
    public final List u6() {
        List list;
        jr.a aVar = this.Y;
        return (aVar == null || (list = aVar.f77529f) == null) ? Collections.emptyList() : list;
    }
}
