package ru1;

import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegoFloatingBottomNavBar f110085a;

    public w(LegoFloatingBottomNavBar legoFloatingBottomNavBar) {
        this.f110085a = legoFloatingBottomNavBar;
    }

    public final void a(boolean z13, boolean z14) {
        boolean z15;
        q qVar = (z13 && z14) ? q.FORCE_SHOWN : z13 ? q.SHOWN : q.HIDDEN;
        int i13 = LegoFloatingBottomNavBar.N;
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = this.f110085a;
        legoFloatingBottomNavBar.getClass();
        q qVar2 = q.HIDDEN;
        boolean z16 = qVar != qVar2;
        r70.b bVar = legoFloatingBottomNavBar.f49973u;
        bVar.f106356f = z16;
        q qVar3 = legoFloatingBottomNavBar.f49972t;
        if (qVar3 != qVar) {
            if (qVar == q.SHOWN && qVar3 == q.FORCE_SHOWN) {
                return;
            }
            q qVar4 = q.FORCE_SHOWN;
            if (qVar == qVar4 && !(z15 = bVar.f106352b)) {
                legoFloatingBottomNavBar.f49971s = new en.b(z15);
                legoFloatingBottomNavBar.G(true);
            } else if (qVar == qVar2 && qVar3 == qVar4) {
                en.b bVar2 = legoFloatingBottomNavBar.f49971s;
                if (bVar2 != null) {
                    boolean z17 = bVar2.f59642a;
                    legoFloatingBottomNavBar.setTranslationY(0.0f);
                    bs1.c.R1(legoFloatingBottomNavBar, z17);
                    bVar.f106352b = z17;
                    legoFloatingBottomNavBar.post(new sq0.a(legoFloatingBottomNavBar, 5));
                }
                legoFloatingBottomNavBar.f49971s = null;
            }
            legoFloatingBottomNavBar.f49972t = qVar;
        }
    }
}
