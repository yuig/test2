package ru1;

import android.widget.LinearLayout;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes2.dex */
public abstract class l extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f110071a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f110072b;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f110071a == null) {
            this.f110071a = new ye2.o(this);
        }
        return this.f110071a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f110071a == null) {
            this.f110071a = new ye2.o(this);
        }
        return this.f110071a.generatedComponent();
    }

    public final void p() {
        if (this.f110072b) {
            return;
        }
        this.f110072b = true;
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) this;
        jb jbVar = (jb) ((x) generatedComponent());
        legoFloatingBottomNavBar.f49976x = jbVar.A;
        oa oaVar = jbVar.f113483a;
        legoFloatingBottomNavBar.f49977y = (r70.f) oaVar.Ac.get();
        legoFloatingBottomNavBar.f49978z = (mr1.a) oaVar.B6.get();
        legoFloatingBottomNavBar.A = (m60.w) oaVar.f113885r0.get();
        s8 s8Var = jbVar.f113485c;
        legoFloatingBottomNavBar.B = (ff0.f) s8Var.f114417o.get();
        legoFloatingBottomNavBar.C = s8Var.O5();
        legoFloatingBottomNavBar.D = (b60.b) oaVar.f113850p0.get();
        legoFloatingBottomNavBar.E = jbVar.d();
        legoFloatingBottomNavBar.F = new b20.c((r70.f) oaVar.Ac.get());
        legoFloatingBottomNavBar.G = (fv1.b) oaVar.Z9.get();
    }
}
