package h42;

import androidx.fragment.app.Fragment;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import mq.h0;
import mq.x;
import okhttp3.internal.Util;
import tb0.p;

/* loaded from: classes4.dex */
public final class j extends za.j {

    /* renamed from: m, reason: collision with root package name */
    public final Fragment f67652m;

    /* renamed from: n, reason: collision with root package name */
    public final il1.a f67653n;

    /* renamed from: o, reason: collision with root package name */
    public a f67654o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f67655p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f67656q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f67657r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment hostFragment, il1.a fragmentFactory, a currentDisplayState) {
        super(hostFragment.getChildFragmentManager(), hostFragment.getLifecycle());
        Intrinsics.checkNotNullParameter(hostFragment, "hostFragment");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(currentDisplayState, "currentDisplayState");
        this.f67652m = hostFragment;
        this.f67653n = fragmentFactory;
        this.f67654o = currentDisplayState;
        this.f67655p = new LinkedHashMap();
        this.f67656q = new LinkedHashMap();
        this.f67657r = new ArrayList();
        this.f141472j.f141454b.add(new i(this));
    }

    @Override // za.j
    public final boolean D(long j13) {
        List F0 = CollectionsKt.F0(this.f67654o.f67640a);
        if ((F0 instanceof Collection) && F0.isEmpty()) {
            return false;
        }
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            if (((Navigation) it.next()).hashCode() == j13) {
                return true;
            }
        }
        return false;
    }

    @Override // za.j
    public final Fragment E(int i13) {
        Navigation navigation = (Navigation) CollectionsKt.F0(this.f67654o.f67640a).get(i13);
        LinkedHashMap linkedHashMap = this.f67655p;
        if (linkedHashMap.containsKey(navigation)) {
            vb0.j.f125466a.F("Creating a Fragment for a Navigation that already has a Fragment in the ViewPager", p.PLATFORM, new Object[0]);
        }
        LinkedHashMap linkedHashMap2 = this.f67656q;
        Object obj = linkedHashMap2.get(navigation);
        if (obj == null) {
            obj = ((Navigation) CollectionsKt.F0(this.f67654o.f67640a).get(i13)).b1();
            Intrinsics.checkNotNullExpressionValue(obj, "toScreenDescription(...)");
            linkedHashMap2.put(navigation, obj);
        }
        ScreenDescription screenDescription = (ScreenDescription) obj;
        Class fragmentClass = screenDescription.getScreenClass();
        mu1.a aVar = (mu1.a) this.f67653n;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Object f13 = aVar.f(fragmentClass);
        if (!(f13 instanceof nl1.d)) {
            throw new IllegalStateException("Fragment:" + f13 + " from screen:" + screenDescription + " is not a BaseFragment");
        }
        linkedHashMap.put(navigation, f13);
        if (this.f67654o.f67641b == i13) {
            ArrayList arrayList = this.f67657r;
            List A = Util.A(arrayList);
            arrayList.clear();
            Iterator it = A.iterator();
            while (it.hasNext()) {
                nl1.d it2 = (nl1.d) f13;
                ((x) it.next()).getClass();
                int i14 = h0.f87984k0;
                Intrinsics.checkNotNullParameter(it2, "it");
                PinCloseupFragment pinCloseupFragment = it2 instanceof PinCloseupFragment ? (PinCloseupFragment) it2 : null;
                if (pinCloseupFragment != null) {
                    pinCloseupFragment.e3();
                }
            }
        }
        return (Fragment) f13;
    }

    public final nl1.d J(int i13) {
        List F0 = CollectionsKt.F0(this.f67654o.f67640a);
        if (i13 < 0 || i13 > f0.i(F0)) {
            return null;
        }
        Object obj = this.f67655p.get((Navigation) F0.get(i13));
        if (obj instanceof nl1.d) {
            return (nl1.d) obj;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f67654o.f67640a.size();
    }

    @Override // za.j, androidx.recyclerview.widget.b2
    public final long f(int i13) {
        if (i13 < CollectionsKt.F0(this.f67654o.f67640a).size()) {
            return r0.get(i13).hashCode();
        }
        return -1L;
    }
}
