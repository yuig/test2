package ba1;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.m3;
import lh0.z3;

/* loaded from: classes5.dex */
public final class g implements o82.r {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f22365a;

    /* renamed from: b, reason: collision with root package name */
    public final np1.j f22366b;

    /* renamed from: c, reason: collision with root package name */
    public final z82.b f22367c;

    public g(m3 experiments, np1.j handshakeManager, z82.b targetHandshakeManager) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(targetHandshakeManager, "targetHandshakeManager");
        this.f22365a = experiments;
        this.f22366b = handshakeManager;
        this.f22367c = targetHandshakeManager;
    }

    @Override // o82.r
    public final Object i(Object obj, bl2.c cVar) {
        h hVar;
        if (obj instanceof h) {
            Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.claimedaccount.handshake.listaccounts.ClaimedAccountsArgs");
            hVar = (h) obj;
        } else {
            hVar = null;
        }
        ArrayList arrayList = new ArrayList();
        va1.d0.f125161f.getClass();
        NavigationImpl L = Navigation.L(va1.d0.f125163h, "", va1.d0.f125164i);
        L.m0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE", e82.w.INSTAGRAM.getApiParam());
        arrayList.add(new a(new u50.k0(b52.c.instagram), null, true, L, hVar != null ? hVar.f22369a : null, hVar != null ? hVar.f22370b : false, 2));
        if (((np1.i) this.f22366b).f91802n) {
            u50.k0 k0Var = new u50.k0(b52.c.amazon);
            va1.f0.f125171f.getClass();
            arrayList.add(new a(k0Var, null, true, Navigation.L(va1.f0.f125173h, "", va1.f0.f125174i), null, false, 50));
        } else {
            arrayList.add(new a(new u50.k0(b52.c.amazon), new u50.k0(b52.c.amazon_disabled_info_2), false, null, null, false, 48));
        }
        m3 m3Var = this.f22365a;
        m3Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) m3Var.f83424a;
        if (g1Var.o("android_target_account_linking", "enabled", z3Var) || g1Var.l("android_target_account_linking")) {
            b92.a aVar = ((z82.j) this.f22367c).f141135i;
            if (aVar.f22246a == null || aVar.a()) {
                arrayList.add(new a(new u50.k0(b52.c.target), new u50.k0(b52.c.target_disabled_info), false, null, null, false, 48));
            } else {
                u50.k0 k0Var2 = new u50.k0(b52.c.target);
                va1.g0.f125176f.getClass();
                arrayList.add(new a(k0Var2, null, true, Navigation.L(va1.g0.f125178h, "", va1.g0.f125179i), null, false, 50));
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new b((a) it.next()));
        }
        return new xz.b(arrayList2);
    }
}
