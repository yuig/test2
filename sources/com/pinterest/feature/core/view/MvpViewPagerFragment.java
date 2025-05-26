package com.pinterest.feature.core.view;

import ac2.o1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import b20.c;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.base.LockableViewPager;
import com.pinterest.framework.screens.m;
import com.pinterest.framework.screens.y;
import com.pinterest.navigation.Navigation;
import d7.b;
import ec2.o;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.w0;
import h32.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jr.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import ml1.q;
import nl1.d;
import oc2.j;
import tb0.p;
import xa.i;
import yk1.k;
import yq0.g;
import yq0.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ljr/a;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lyk1/k;", "Lcom/pinterest/framework/screens/y;", "", "Lxa/i;", "<init>", "()V", "MvpVPFException", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class MvpViewPagerFragment<T extends a> extends k implements y, j, q, o, i {

    /* renamed from: e0, reason: collision with root package name */
    public c f45638e0;

    /* renamed from: f0, reason: collision with root package name */
    public a f45639f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f45640g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    public final int f45641h0 = -1;

    /* renamed from: i0, reason: collision with root package name */
    public int f45642i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f45643j0 = new ArrayList();

    /* renamed from: k0, reason: collision with root package name */
    public final String f45644k0 = "view_pager_adapter";

    /* renamed from: l0, reason: collision with root package name */
    public boolean f45645l0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/core/view/MvpViewPagerFragment$MvpVPFException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class MvpVPFException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MvpVPFException() {
            super("[MvpViewPagerFragment] accessing compositePageChangeListeners off main thread");
            Intrinsics.checkNotNullParameter("[MvpViewPagerFragment] accessing compositePageChangeListeners off main thread", "msg");
        }
    }

    public static void d8() {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            return;
        }
        vb0.j.f125466a.J(new MvpVPFException(), p.PLATFORM);
    }

    @Override // xa.i
    public void A5(int i13) {
        d8();
        Iterator it = this.f45643j0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).A5(i13);
        }
    }

    @Override // nl1.d
    public final x3 C7(String str) {
        d Z7;
        if (!this.f45645l0 && (Z7 = Z7()) != null) {
            return Z7.C7(str);
        }
        return super.C7(str);
    }

    @Override // nl1.d
    public final a4 D7() {
        if (this.f45645l0) {
            return getF53239s0();
        }
        d Z7 = Z7();
        if (Z7 != null) {
            return Z7.getF53239s0();
        }
        return null;
    }

    @Override // nl1.d
    public d4 E7() {
        if (this.f45645l0) {
            return getF53238r0();
        }
        d Z7 = Z7();
        return (Z7 != null ? Z7.getF53238r0() : null) != null ? Z7.getF53238r0() : d4.UNKNOWN_VIEW;
    }

    @Override // yk1.k, nl1.d
    public void K7() {
        super.K7();
        if (c8()) {
            a a83 = a8();
            if (a83.f77536m) {
                a83.f77536m = false;
                m s13 = a83.s();
                if (s13 != null) {
                    b.d(s13);
                }
            }
        }
        d Z7 = Z7();
        if (Z7 != null) {
            Z7.Q7(true);
        }
    }

    @Override // yk1.k, nl1.d
    public void L7() {
        d Z7 = Z7();
        if (Z7 != null) {
            Z7.Q7(false);
        }
        super.L7();
    }

    @Override // jl1.a
    public void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        d Z7 = Z7();
        if (Z7 != null) {
            Z7.N6(code, result);
        }
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        d Z7 = Z7();
        if (Z7 != null) {
            return Z7.N7(i13, keyEvent);
        }
        return false;
    }

    @Override // nl1.d
    public final void Q6(StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb3, "sb");
        d Z7 = Z7();
        if (Z7 != null) {
            Z7.Q6(sb3);
        }
    }

    @Override // oc2.j
    public final Set S0() {
        return new HashSet();
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public View T() {
        return (LockableViewPager) b8().f21278a;
    }

    public final void Y7(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d8();
        this.f45643j0.add(listener);
    }

    public final d Z7() {
        a aVar = this.f45639f0;
        if (aVar == null) {
            return null;
        }
        if (aVar == null) {
            Intrinsics.r("_viewAdapter");
            throw null;
        }
        if (aVar.f77529f.size() == 0) {
            return null;
        }
        a aVar2 = this.f45639f0;
        if (aVar2 == null) {
            Intrinsics.r("_viewAdapter");
            throw null;
        }
        Fragment r13 = aVar2.r();
        if (r13 instanceof d) {
            return (d) r13;
        }
        return null;
    }

    public final a a8() {
        a aVar = this.f45639f0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("_viewAdapter");
        throw null;
    }

    public final c b8() {
        c cVar = this.f45638e0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("viewPager");
        throw null;
    }

    public final boolean c8() {
        return this.f45639f0 != null;
    }

    @Override // nl1.d, nx.i1
    public final w0 e() {
        d Z7;
        if (this.f45645l0 || (Z7 = Z7()) == null) {
            return null;
        }
        return Z7.e();
    }

    @Override // ml1.q
    public final void e3() {
        ((o1) B7()).f2019v = false;
        com.pinterest.framework.screens.a Z7 = Z7();
        q qVar = Z7 instanceof q ? (q) Z7 : null;
        if (qVar != null) {
            qVar.e3();
        }
    }

    public final void e8(int i13) {
        this.f45642i0 = i13;
    }

    public final void f8(a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45639f0 = value;
        if (value != null) {
            value.f77527d = new h(this);
        } else {
            Intrinsics.r("_viewAdapter");
            throw null;
        }
    }

    @Override // nl1.d, nx.a
    public i0 generateLoggingContext() {
        i0 generateLoggingContext;
        if (this.f45645l0) {
            return super.generateLoggingContext();
        }
        d Z7 = Z7();
        return (Z7 == null || (generateLoggingContext = Z7.generateLoggingContext()) == null) ? super.generateLoggingContext() : generateLoggingContext;
    }

    /* renamed from: getViewParameterType */
    public a4 getF53239s0() {
        return D7();
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        d8();
        Iterator it = this.f45643j0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).i(i13, f13, i14);
        }
    }

    @Override // xa.i
    public void i5(int i13) {
        d8();
        Iterator it = this.f45643j0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).i5(i13);
        }
    }

    @Override // jl1.a, com.pinterest.framework.screens.j
    public final Map k2() {
        LinkedHashMap r13 = z0.r(this.f76938b);
        d Z7 = Z7();
        if (Z7 != null) {
            r13.putAll(Z7.k2());
        }
        return r13;
    }

    @Override // ml1.q
    public final void k5() {
        o1 o1Var = (o1) B7();
        o1Var.f2019v = true;
        o1Var.w();
        com.pinterest.framework.screens.a Z7 = Z7();
        q qVar = Z7 instanceof q ? (q) Z7 : null;
        if (qVar != null) {
            qVar.k5();
        }
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        d Z7 = Z7();
        if (Z7 != null) {
            Z7.onActivityResult(i13, i14, intent);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = v0.fragment_pager_task;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        d8();
        this.f45643j0.clear();
        if (this.f45638e0 != null) {
            b8().y(null);
            ((LockableViewPager) b8().f21278a).z(null);
        }
        a aVar = this.f45639f0;
        if (aVar != null) {
            aVar.A();
        }
        super.onDestroyView();
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f45639f0 == null || !a8().q()) {
            return;
        }
        outState.putParcelable(this.f45644k0, a8().i());
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewStub e73 = e7(view);
        if (e73 != null) {
            e73.setLayoutResource(v0.view_pager);
            e73.setInflatedId(t0.content_pager_vw);
            e73.inflate();
        }
        LockableViewPager m73 = m7(view);
        Intrinsics.f(m73);
        c cVar = new c(m73);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f45638e0 = cVar;
        if (!((m60.d) m60.d.a()).f()) {
            ((LockableViewPager) b8().f21278a).setId(View.generateViewId());
        }
        if (a8().q() && bundle != null && (parcelable = bundle.getParcelable(this.f45644k0)) != null) {
            a8().h(parcelable, getClass().getClassLoader());
        }
        ((LockableViewPager) b8().f21278a).D(this.f45640g0);
        ((LockableViewPager) b8().f21278a).z(a8());
        c b83 = b8();
        int i13 = this.f45642i0;
        if (i13 == -1) {
            i13 = this.f45641h0;
        }
        ((LockableViewPager) b83.f21278a).A(i13);
        b8().y(this);
        Y7(new g(this));
    }

    @Override // nl1.d
    public String q7() {
        Navigation navigation;
        String f49940b;
        if (this.f45645l0) {
            return super.q7();
        }
        d Z7 = Z7();
        return (Z7 == null || (navigation = Z7.I) == null || (f49940b = navigation.getF49940b()) == null) ? super.q7() : f49940b;
    }

    @Override // nl1.d
    public final List r7() {
        List r73;
        d Z7 = Z7();
        if (Z7 == null || (r73 = Z7.r7()) == null) {
            return null;
        }
        return CollectionsKt.H0(r73);
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public HashMap getF63135d0() {
        d Z7;
        if (this.f45645l0 || (Z7 = Z7()) == null) {
            return null;
        }
        return Z7.getF63135d0();
    }

    @Override // com.pinterest.framework.screens.y
    public final List u6() {
        return (this.f45639f0 == null || a8().f77529f == null) ? q0.f80391a : a8().f77529f;
    }
}
