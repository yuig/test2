package kq;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ba.s;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.view.ViewPagerLoadingFragment;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import is1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import ml1.q;
import mq.n;
import nx.d1;
import nx.e1;
import os.i;
import tb0.p;
import vb0.j;

/* loaded from: classes3.dex */
public final class c extends jr.a {
    public Boolean A;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f80629n;

    /* renamed from: o, reason: collision with root package name */
    public final h f80630o;

    /* renamed from: p, reason: collision with root package name */
    public List f80631p;

    /* renamed from: q, reason: collision with root package name */
    public i f80632q;

    /* renamed from: r, reason: collision with root package name */
    public String f80633r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80634s;

    /* renamed from: t, reason: collision with root package name */
    public TrackingParamKeyBuilder f80635t;

    /* renamed from: u, reason: collision with root package name */
    public String f80636u;

    /* renamed from: v, reason: collision with root package name */
    public String f80637v;

    /* renamed from: w, reason: collision with root package name */
    public String f80638w;

    /* renamed from: x, reason: collision with root package name */
    public int f80639x;

    /* renamed from: y, reason: collision with root package name */
    public String f80640y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f80641z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(il1.b r13, nx.d1 r14, is1.h r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.c.<init>(il1.b, nx.d1, is1.h):void");
    }

    @Override // jr.a
    public final boolean G() {
        return true;
    }

    public final void H(int i13, ArrayList newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        j.f125466a.R(this.f77529f.size() == 1, "addFeedAroundExistingSinglePin() should only be used when a single pin is in the adapter", p.CLOSEUP, new Object[0]);
        List y03 = CollectionsKt.y0(newItems, i13);
        List z03 = CollectionsKt.z0(f0.i(newItems) - i13, newItems);
        this.f80631p = CollectionsKt.F0(newItems);
        this.f77528e = true;
        List list = y03;
        ArrayList screenDescriptions = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            screenDescriptions.add(J((f30) it.next()));
        }
        Intrinsics.checkNotNullParameter(screenDescriptions, "screenDescriptions");
        C(CollectionsKt.l0(this.f77529f, screenDescriptions));
        List list2 = z03;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(J((f30) it2.next()));
        }
        k(arrayList);
        this.f77530g = i13;
        this.f77528e = false;
        g();
    }

    public final void I(ArrayList newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.f80631p = CollectionsKt.l0(newItems, this.f80631p);
        s getPrimaryScreen = new s(14, this, newItems);
        int i13 = 0;
        a aVar = new a(this, i13);
        int size = newItems.size();
        Intrinsics.checkNotNullParameter(getPrimaryScreen, "getPrimaryScreen");
        if (this.f77532i.size() != this.f77529f.size()) {
            throw new AssertionError("Data source sizes mismatch");
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add((ScreenDescription) getPrimaryScreen.invoke(Integer.valueOf(i14)));
        }
        this.f77532i = CollectionsKt.l0(arrayList, this.f77532i);
        if (!this.f77531h) {
            arrayList = new ArrayList(size);
            while (i13 < size) {
                arrayList.add((ScreenDescription) aVar.invoke());
                i13++;
            }
        }
        k(arrayList);
    }

    public final ScreenModel J(f30 pin) {
        String str;
        ArrayList arrayList = this.f80641z;
        TrackingParamKeyBuilder trackingParamKeyBuilder = this.f80635t;
        String str2 = this.f80638w;
        String str3 = this.f80637v;
        String str4 = this.f80633r;
        int i13 = this.f80639x;
        Boolean bool = this.A;
        String str5 = this.f80636u;
        String str6 = this.f80640y;
        Intrinsics.checkNotNullParameter(pin, "pin");
        d1 trackingParamAttacher = this.f80629n;
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        NavigationImpl r03 = Navigation.r0((ScreenLocation) com.pinterest.screens.g0.f50806d.getValue(), pin);
        r03.m0("com.pinterest.EXTRA_SOURCE_QUERY", str3);
        r03.Y1("com.pinterest.EXTRA_NAVIGATION_FROM_FEED", Intrinsics.d(str4, pin.getUid()));
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (uid.length() > 0) {
            if (trackingParamKeyBuilder != null) {
                String pinId = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                str = trackingParamAttacher.f(new e1(trackingParamKeyBuilder.f35482b, trackingParamKeyBuilder.f35481a, pinId, trackingParamKeyBuilder.f35483c));
            } else {
                str = null;
            }
            if (j1.U0(str)) {
                r03.m0("com.pinterest.TRACKING_PARAMETER", str);
            }
        }
        r03.m0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", str2);
        r03.z(i13, "com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH");
        r03.d("com.pinterest.EXTRA_CONTEXT_PIN_IDS", arrayList);
        r03.Y1("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", bool != null ? bool.booleanValue() : true);
        r03.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", str5);
        r03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", str6);
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean a13 = j.a();
        Intrinsics.checkNotNullParameter(pin, "pin");
        r03.Y1("com.pinterest.EXCLUDE_AD", a13 && !b40.w0(pin));
        Intrinsics.checkNotNullExpressionValue(r03, "apply(...)");
        ScreenModel b13 = r03.b1();
        Intrinsics.checkNotNullExpressionValue(b13, "toScreenDescription(...)");
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        b13.a(uid2);
        return b13;
    }

    public final void K(Fragment primaryFragment) {
        Intrinsics.checkNotNullParameter(primaryFragment, "primaryFragment");
        int size = this.f77529f.size();
        for (int i13 = 0; i13 < size; i13++) {
            ComponentCallbacks v13 = v(i13);
            if ((v13 instanceof b11.h) && v13 != primaryFragment) {
                ((PinCloseupFragment) ((b11.h) v13)).H9();
            }
        }
    }

    public final List L() {
        return this.f80631p;
    }

    public final boolean M() {
        return this.f77529f.size() > 0;
    }

    public final void N() {
        n action = n.f88007i;
        Intrinsics.checkNotNullParameter(action, "action");
        if (M()) {
            ComponentCallbacks r13 = r();
            q qVar = r13 instanceof q ? (q) r13 : null;
            if (qVar != null) {
                qVar.k5();
                Unit unit = Unit.f80348a;
            }
        }
    }

    public final void O(mq.j action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (M()) {
            ComponentCallbacks r13 = r();
            q qVar = r13 instanceof q ? (q) r13 : null;
            if (qVar != null) {
                qVar.e3();
                action.invoke();
            }
        }
    }

    public final void P(ArrayList arrayList) {
        this.f80641z = arrayList;
    }

    public final void Q(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f80633r = uid;
    }

    public final void R(Boolean bool) {
        this.A = bool;
    }

    public final void S(h80.h hVar) {
        this.f80632q = hVar;
    }

    public final void T(String str) {
        this.f80640y = str;
    }

    public final void U(String str) {
        this.f80638w = str;
    }

    public final void V(int i13) {
        this.f80639x = i13;
    }

    public final void W(int i13, ArrayList pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f80631p = pins;
        D(i13, new b(this, 0), new a(this, 1), pins.size());
    }

    public final void X(String str) {
        this.f80637v = str;
    }

    public final void Y(TrackingParamKeyBuilder trackingParamKeyBuilder) {
        this.f80635t = trackingParamKeyBuilder;
    }

    public final void Z(String str) {
        this.f80636u = str;
    }

    public final void a0(int i13) {
        Fragment v13 = v(i13);
        byte b13 = 0;
        ViewPagerLoadingFragment viewPagerLoadingFragment = v13 instanceof ViewPagerLoadingFragment ? (ViewPagerLoadingFragment) v13 : null;
        if (viewPagerLoadingFragment == null || viewPagerLoadingFragment.f49050m != null) {
            return;
        }
        Context requireContext = viewPagerLoadingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltSpinner gestaltSpinner = new GestaltSpinner(6, requireContext, (AttributeSet) (b13 == true ? 1 : 0));
        gestaltSpinner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        View view = viewPagerLoadingFragment.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(gestaltSpinner);
        }
        gestaltSpinner.u(ki1.b.f79803i);
        viewPagerLoadingFragment.f49050m = gestaltSpinner;
    }

    @Override // jr.a, xa.a
    public final void j(ViewGroup container, int i13, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f77530g != i13 && this.f77531h) {
            h hVar = this.f80630o;
            hVar.f73594d = 0;
            if (hVar.f73592b) {
                hVar.f73591a.b(new ik1.a(ik1.c.SWIPE));
            }
        }
        super.j(container, i13, item);
    }

    @Override // jr.a, xa.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final View e(ViewGroup container, int i13) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f80632q != null && !this.f80634s && this.f77529f.size() > 3 && i13 >= this.f77529f.size() - 3) {
            i iVar = this.f80632q;
            if (iVar != null) {
                ((h80.h) iVar).a();
            }
            this.f80634s = true;
        }
        return super.e(container, i13);
    }

    @Override // jr.a
    public final boolean z(ScreenDescription screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return Intrinsics.d(screen.getScreenClass(), ViewPagerLoadingFragment.class);
    }
}
