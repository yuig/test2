package a41;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends jr.a {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f681n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f682o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f683p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f684q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f685r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f686s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z13, ArrayList supportedTabs, List defaultTabs, String userId, il1.b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(supportedTabs, "supportedTabs");
        Intrinsics.checkNotNullParameter(defaultTabs, "defaultTabs");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        this.f681n = z13;
        this.f682o = n60.o.a("com.pinterest.EXTRA_USER_ID", userId);
        this.f683p = new LinkedHashMap();
        this.f684q = new LinkedHashMap();
        this.f686s = new LinkedHashMap();
        Iterator it = supportedTabs.iterator();
        while (it.hasNext()) {
            p41.b bVar = (p41.b) it.next();
            this.f683p.put(bVar, H(bVar));
        }
        int i13 = 0;
        if (this.f681n) {
            Iterator it2 = defaultTabs.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                }
                u32.i iVar = ((p41.b) it2.next()).f98848e;
                if (iVar == u32.i.SAVED || iVar == u32.i.BOARDS) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 >= 0) {
                i13 = i14;
            }
        }
        N(i13, defaultTabs);
    }

    @Override // jr.a
    public final boolean G() {
        return this.f681n;
    }

    public final ScreenModel H(p41.b bVar) {
        ScreenLocation screenLocation = bVar.f98846c;
        Bundle bundle = new Bundle();
        bundle.putAll(this.f682o);
        Bundle bundle2 = bVar.f98847d;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        ScreenModel o13 = jr.a.o(screenLocation, bundle);
        Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
        return o13;
    }

    public final u32.i I() {
        Object obj;
        p41.b bVar;
        ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(this.f77530g, this.f77529f);
        Iterator it = this.f684q.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((Map.Entry) obj).getValue(), screenDescription)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (bVar = (p41.b) entry.getKey()) == null) {
            return null;
        }
        return bVar.f98848e;
    }

    public final boolean J() {
        return this.f685r;
    }

    public final void K(int i13, p41.b bVar) {
        LinkedHashMap linkedHashMap = this.f684q;
        ScreenDescription screenDescription = (ScreenDescription) linkedHashMap.get(bVar);
        if (screenDescription != null && this.f77529f.contains(screenDescription)) {
            if (this.f77529f.indexOf(screenDescription) != i13) {
                B(screenDescription);
                x(i13, screenDescription);
                return;
            }
            return;
        }
        ScreenDescription screenDescription2 = (ScreenDescription) this.f683p.get(bVar);
        if (screenDescription2 == null) {
            screenDescription2 = H(bVar);
        }
        linkedHashMap.put(bVar, screenDescription2);
        x(i13, screenDescription2);
    }

    public final void L(List list) {
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            p41.b bVar = (p41.b) obj;
            LinkedHashMap linkedHashMap = this.f683p;
            if (!linkedHashMap.containsKey(bVar)) {
                linkedHashMap.put(bVar, H(bVar));
            }
            K(i13, bVar);
            i13 = i14;
        }
    }

    public final void M() {
        LinkedHashMap linkedHashMap = this.f686s;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            p41.b bVar = (p41.b) entry.getValue();
            LinkedHashMap linkedHashMap2 = this.f683p;
            if (!linkedHashMap2.containsKey(bVar)) {
                linkedHashMap2.put(bVar, H(bVar));
            }
            K(intValue, bVar);
        }
        linkedHashMap.clear();
    }

    public final void N(int i13, List tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f684q;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (!tabs.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            B((ScreenDescription) entry2.getValue());
            linkedHashMap2.remove(entry2.getKey());
        }
        LinkedHashMap linkedHashMap3 = this.f686s;
        if (!this.f681n || (this.f77529f.size() != 0 && !(!linkedHashMap3.isEmpty()))) {
            linkedHashMap3.clear();
            L(tabs);
            return;
        }
        linkedHashMap3.clear();
        p41.b bVar = (p41.b) CollectionsKt.U(i13, tabs);
        if (bVar == null) {
            L(tabs);
            return;
        }
        int i14 = 0;
        for (Object obj : tabs) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            p41.b bVar2 = (p41.b) obj;
            if (!Intrinsics.d(bVar2, bVar)) {
                linkedHashMap3.put(Integer.valueOf(i14), bVar2);
            }
            i14 = i15;
        }
        L(kotlin.collections.e0.b(bVar));
    }

    @Override // jr.a, xa.a
    public final void j(ViewGroup container, int i13, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        super.j(container, i13, item);
        s();
    }

    @Override // jr.a, xa.a
    /* renamed from: y */
    public final View e(ViewGroup container, int i13) {
        Intrinsics.checkNotNullParameter(container, "container");
        View e13 = super.e(container, i13);
        this.f685r = true;
        return e13;
    }
}
