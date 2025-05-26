package jr;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.l;
import com.pinterest.framework.screens.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ml1.b;
import ql2.s;
import yq0.h;
import zh0.c;

/* loaded from: classes.dex */
public abstract class a extends xa.a {

    /* renamed from: c, reason: collision with root package name */
    public final l f77526c;

    /* renamed from: d, reason: collision with root package name */
    public h f77527d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77528e;

    /* renamed from: f, reason: collision with root package name */
    public List f77529f;

    /* renamed from: g, reason: collision with root package name */
    public int f77530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77531h;

    /* renamed from: i, reason: collision with root package name */
    public List f77532i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f77533j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f77534k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f77535l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f77536m;

    public a(l screenFactory) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        this.f77526c = screenFactory;
        q0 q0Var = q0.f80391a;
        this.f77529f = q0Var;
        this.f77531h = true;
        this.f77532i = q0Var;
        this.f77533j = new HashMap();
        this.f77534k = new HashMap();
        this.f77535l = true;
    }

    public static ScreenModel n(ScreenLocation screenLocation) {
        return o(screenLocation, new Bundle());
    }

    public static ScreenModel o(ScreenLocation screenLocation, Bundle bundle) {
        return p(screenLocation, bundle, UUID.randomUUID().toString());
    }

    public static ScreenModel p(ScreenLocation screenLocation, Bundle bundle, String uniqueId) {
        int value = b.DEFAULT_TRANSITION.getValue();
        Bundle arguments = new Bundle(bundle);
        Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        return new ScreenModel(screenLocation, value, arguments, null, uniqueId, 32);
    }

    public final void A() {
        this.f77536m = false;
        this.f77527d = null;
        for (ScreenDescription screenDescription : this.f77529f) {
            Intrinsics.checkNotNullParameter(screenDescription, "<this>");
            ((il1.b) this.f77526c).a(screenDescription);
        }
    }

    public final void B(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        if (this.f77529f.indexOf(screenDescription) != -1) {
            ArrayList H0 = CollectionsKt.H0(this.f77529f);
            H0.remove(screenDescription);
            C(CollectionsKt.F0(H0));
        }
    }

    public final void C(List list) {
        this.f77529f = list;
        if (this.f77528e) {
            return;
        }
        HashMap hashMap = this.f77534k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            hashMap.remove(((Map.Entry) it.next()).getKey());
        }
        g();
    }

    public final void D(int i13, Function1 getPrimaryScreen, Function0 getLoadingScreen, int i14) {
        Intrinsics.checkNotNullParameter(getPrimaryScreen, "getPrimaryScreen");
        Intrinsics.checkNotNullParameter(getLoadingScreen, "getLoadingScreen");
        ArrayList arrayList = new ArrayList(i14);
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            arrayList.add((ScreenDescription) getPrimaryScreen.invoke(Integer.valueOf(i16)));
        }
        this.f77532i = arrayList;
        ArrayList screenDescriptions = new ArrayList(i14);
        while (i15 < i14) {
            screenDescriptions.add((ScreenDescription) ((i15 == i13 || this.f77531h) ? this.f77532i.get(i15) : getLoadingScreen.invoke()));
            i15++;
        }
        Intrinsics.checkNotNullParameter(screenDescriptions, "screenDescriptions");
        C(screenDescriptions);
    }

    public final void E() {
        int size = this.f77529f.size();
        if (size > 1) {
            List list = this.f77529f;
            C(CollectionsKt.i0(list, CollectionsKt.J0(list.subList(1, size))));
        }
    }

    public void F(boolean z13) {
        s();
    }

    public /* bridge */ /* synthetic */ boolean G() {
        return false;
    }

    @Override // xa.a
    public final void a(ViewGroup container, int i13, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(i13, this.f77529f);
        HashMap hashMap = this.f77533j;
        if (hashMap.containsKey(Integer.valueOf(i13))) {
            screenDescription = (ScreenDescription) hashMap.get(Integer.valueOf(i13));
        }
        if (screenDescription != null) {
            if (q()) {
                m w13 = w(screenDescription);
                if (screenDescription.getF49208d() == null && (w13 instanceof com.pinterest.framework.screens.h)) {
                    screenDescription.c2(((jl1.a) ((com.pinterest.framework.screens.h) w13)).O6());
                }
            }
            View view = (View) item;
            m w14 = w(screenDescription);
            if (w14 != null) {
                d7.b.y(w14);
            }
            container.removeView(view);
            Intrinsics.checkNotNullParameter(screenDescription, "<this>");
            ((il1.b) this.f77526c).a(screenDescription);
        }
    }

    @Override // xa.a
    public final int b() {
        return this.f77529f.size();
    }

    @Override // xa.a
    public int c(Object object) {
        ScreenDescription screenDescription;
        Intrinsics.checkNotNullParameter(object, "object");
        if (!(object instanceof View)) {
            return -2;
        }
        List list = this.f77529f;
        View view = (View) object;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                screenDescription = null;
                break;
            }
            screenDescription = (ScreenDescription) it.next();
            Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
            m w13 = w(screenDescription);
            Intrinsics.f(w13);
            if (Intrinsics.d(w13.getView(), view)) {
                break;
            }
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        int indexOf = list.indexOf(screenDescription);
        if (indexOf == -1) {
            return -2;
        }
        Object tag = view.getTag();
        Intrinsics.g(tag, "null cannot be cast to non-null type kotlin.Int");
        if (indexOf == ((Integer) tag).intValue()) {
            return -1;
        }
        if (G()) {
            return indexOf;
        }
        return -2;
    }

    @Override // xa.a
    public final boolean f(View view, Object item) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        return Intrinsics.d(view, item);
    }

    @Override // xa.a
    public final void h(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            this.f77530g = bundle.getInt("currentPosition", 0);
            this.f77535l = true;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("screens");
            if (parcelableArrayList != null && parcelableArrayList != this.f77529f) {
                C(parcelableArrayList);
            }
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("originalScreens");
            if (parcelableArrayList2 == null || parcelableArrayList2 == this.f77532i) {
                return;
            }
            this.f77532i = parcelableArrayList2;
        }
    }

    @Override // xa.a
    public final Parcelable i() {
        m w13;
        for (ScreenDescription screenDescription : this.f77529f) {
            if (q() && (w13 = w(screenDescription)) != null && screenDescription.getF49208d() == null && (w13 instanceof com.pinterest.framework.screens.h)) {
                screenDescription.c2(((jl1.a) ((com.pinterest.framework.screens.h) w13)).O6());
                Bundle f49208d = screenDescription.getF49208d();
                if (f49208d != null) {
                    String name = w13.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    c.a(f49208d, name, null, 10.0f);
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("currentPosition", this.f77530g);
        bundle.putParcelableArrayList("screens", new ArrayList<>(this.f77529f));
        if (!this.f77532i.isEmpty()) {
            bundle.putParcelableArrayList("originalScreens", new ArrayList<>(this.f77532i));
        }
        return bundle;
    }

    @Override // xa.a
    public void j(ViewGroup container, int i13, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f77530g == i13) {
            if (this.f77535l) {
                this.f77535l = false;
                h hVar = this.f77527d;
                if (hVar != null && !hVar.f139702a.f91282J) {
                    this.f77536m = true;
                    return;
                }
                this.f77536m = false;
                m s13 = s();
                if (s13 != null) {
                    d7.b.d(s13);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f77531h) {
            this.f77531h = true;
            ArrayList oldDescriptionIndices = new ArrayList();
            int size = this.f77529f.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (z((ScreenDescription) this.f77529f.get(i14))) {
                    oldDescriptionIndices.add(Integer.valueOf(i14));
                }
            }
            List oldDescriptions = this.f77529f;
            List newScreenDescriptions = this.f77532i;
            Intrinsics.checkNotNullParameter(oldDescriptions, "oldDescriptions");
            Intrinsics.checkNotNullParameter(oldDescriptionIndices, "oldDescriptionIndices");
            Intrinsics.checkNotNullParameter(newScreenDescriptions, "newScreenDescriptions");
            this.f77528e = true;
            Iterator it = oldDescriptionIndices.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                this.f77533j.put(Integer.valueOf(intValue), oldDescriptions.get(intValue));
                ScreenDescription newScreenDescription = (ScreenDescription) newScreenDescriptions.get(intValue);
                Intrinsics.checkNotNullParameter(newScreenDescription, "newScreenDescription");
                ArrayList H0 = CollectionsKt.H0(this.f77529f);
                H0.remove(intValue);
                H0.add(intValue, newScreenDescription);
                C(CollectionsKt.F0(H0));
            }
            this.f77528e = false;
            g();
        }
        m s14 = s();
        if (s14 != null) {
            d7.b.y(s14);
        }
        this.f77530g = i13;
        ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(i13, this.f77529f);
        m s15 = s();
        if (screenDescription == null || s15 == null) {
            return;
        }
        Context activity = container.getContext();
        Intrinsics.checkNotNullExpressionValue(activity, "getContext(...)");
        Bundle f49208d = screenDescription.getF49208d();
        Intrinsics.checkNotNullParameter(s15, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        if (!((jl1.a) s15).f76939c) {
            s15.x3(activity, screenDescription, f49208d);
        }
        this.f77536m = false;
        d7.b.d(s15);
    }

    public final void k(List screenDescriptions) {
        Intrinsics.checkNotNullParameter(screenDescriptions, "screenDescriptions");
        C(CollectionsKt.l0(screenDescriptions, this.f77529f));
    }

    public final void l() {
        C(q0.f80391a);
    }

    public final boolean m(String uniqueId) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Iterator it = this.f77529f.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(((ScreenDescription) it.next()).getF49209e(), uniqueId)) {
                return i13 != -1;
            }
            i13++;
        }
        return false;
    }

    public boolean q() {
        return this instanceof com.pinterest.feature.home.viewpager.a;
    }

    public final Fragment r() {
        Object s13 = s();
        if (s13 instanceof Fragment) {
            return (Fragment) s13;
        }
        return null;
    }

    public final m s() {
        ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(this.f77530g, this.f77529f);
        if (screenDescription != null) {
            return w(screenDescription);
        }
        return null;
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList(this.f77529f);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ScreenDescription screenDescription = (ScreenDescription) it.next();
            Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
            Object w13 = w(screenDescription);
            Intrinsics.f(w13);
            arrayList2.add((Fragment) w13);
        }
        return arrayList2;
    }

    public final Fragment u(int i13) {
        if (i13 < 0 || i13 >= this.f77529f.size()) {
            return null;
        }
        ScreenDescription screenDescription = (ScreenDescription) this.f77529f.get(i13);
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        Object w13 = w(screenDescription);
        Intrinsics.f(w13);
        return (Fragment) w13;
    }

    public final Fragment v(int i13) {
        if (i13 < 0 || i13 >= this.f77529f.size()) {
            return null;
        }
        ScreenDescription screenDescription = (ScreenDescription) this.f77529f.get(i13);
        Intrinsics.checkNotNullParameter(screenDescription, "<this>");
        Object h10 = ((il1.b) this.f77526c).h(screenDescription);
        if (h10 instanceof Fragment) {
            return (Fragment) h10;
        }
        return null;
    }

    public final m w(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "<this>");
        return ((il1.b) this.f77526c).g(screenDescription);
    }

    public final void x(int i13, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        int g13 = s.g(i13, 0, this.f77529f.size());
        ArrayList H0 = CollectionsKt.H0(this.f77529f);
        H0.add(g13, screenDescription);
        C(CollectionsKt.F0(H0));
    }

    @Override // xa.a
    /* renamed from: y */
    public View e(ViewGroup parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "container");
        ScreenDescription screenDescription = (ScreenDescription) this.f77529f.get(i13);
        if (w(screenDescription) == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNullParameter(screenDescription, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View i14 = ((il1.b) this.f77526c).i(screenDescription, parent);
        screenDescription.c2(null);
        ViewParent parent2 = i14.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(i14);
        }
        parent.addView(i14);
        i14.setTag(Integer.valueOf(i13));
        return i14;
    }

    public boolean z(ScreenDescription screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return false;
    }

    public a(il1.b screenFactory, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        this.f77526c = screenFactory;
        q0 q0Var = q0.f80391a;
        this.f77529f = q0Var;
        this.f77531h = booleanValue;
        this.f77532i = q0Var;
        this.f77533j = new HashMap();
        this.f77534k = new HashMap();
        this.f77535l = true;
    }
}
