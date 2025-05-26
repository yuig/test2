package nm1;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements ek.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91439a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f91440b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f91441c;

    public j0(TabLayout tabLayout, n62.g gVar) {
        this.f91440b = tabLayout.n(tabLayout.m());
        this.f91441c = new fn1.k(gVar, this, tabLayout, 13);
    }

    @Override // ek.c
    public final void a(ek.e tab) {
        switch (this.f91439a) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (((Map) this.f91440b).containsKey(tab)) {
                    GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) this.f91441c;
                    kotlin.collections.q0 q0Var = GestaltHeaderBar.f49371d;
                    gm1.a aVar = (gm1.a) gestaltHeaderBar.f49376b.f33804b;
                    if (aVar != null) {
                        int id3 = gestaltHeaderBar.getId();
                        View view = tab.f59129f;
                        Intrinsics.f(view);
                        int id4 = view.getId();
                        Object obj = ((Map) this.f91440b).get(tab);
                        Intrinsics.f(obj);
                        aVar.h3(new y0(id3, id4, ((Number) obj).intValue()));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
        }
    }

    @Override // ek.c
    public final void b(ek.e tab) {
        int i13 = this.f91439a;
        Object obj = this.f91441c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (((Map) this.f91440b).containsKey(tab)) {
                    GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) obj;
                    kotlin.collections.q0 q0Var = GestaltHeaderBar.f49371d;
                    gm1.a aVar = (gm1.a) gestaltHeaderBar.f49376b.f33804b;
                    if (aVar != null) {
                        int id3 = gestaltHeaderBar.getId();
                        View view = tab.f59129f;
                        Intrinsics.f(view);
                        int id4 = view.getId();
                        Object obj2 = ((Map) this.f91440b).get(tab);
                        Intrinsics.f(obj2);
                        aVar.h3(new w0(id3, id4, ((Number) obj2).intValue()));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                ((Function1) obj).invoke(tab);
                break;
        }
    }

    @Override // ek.c
    public final void c(ek.e tab) {
        int i13 = this.f91439a;
        Object obj = this.f91441c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (((Map) this.f91440b).containsKey(tab)) {
                    GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) obj;
                    gestaltHeaderBar.f49376b.d(new com.pinterest.framework.screens.q(24, (Map) this.f91440b, tab), d.f91399o);
                    gm1.a aVar = (gm1.a) gestaltHeaderBar.f49376b.f33804b;
                    if (aVar != null) {
                        int id3 = gestaltHeaderBar.getId();
                        View view = tab.f59129f;
                        Intrinsics.f(view);
                        int id4 = view.getId();
                        Object obj2 = ((Map) this.f91440b).get(tab);
                        Intrinsics.f(obj2);
                        aVar.h3(new x0(id3, id4, ((Number) obj2).intValue()));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                ((Function1) obj).invoke(tab);
                break;
        }
    }

    public j0(Map map, GestaltHeaderBar gestaltHeaderBar) {
        this.f91440b = map;
        this.f91441c = gestaltHeaderBar;
    }
}
