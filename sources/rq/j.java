package rq;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class j extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109275a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f109276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i13) {
        super(context);
        this.f109275a = i13;
        switch (i13) {
            case 1:
                super(context);
                inject();
                break;
            case 2:
            default:
                inject();
                break;
            case 3:
                super(context);
                inject();
                break;
            case 4:
                super(context);
                inject();
                break;
            case 5:
                super(context);
                inject();
                break;
            case 6:
                super(context);
                inject();
                break;
            case 7:
                super(context);
                inject();
                break;
            case 8:
                super(context);
                inject();
                break;
            case 9:
                super(context);
                inject();
                break;
            case 10:
                super(context);
                inject();
                break;
            case 11:
                super(context);
                inject();
                break;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean hasContent() {
        return shouldShowForPin();
    }

    @Override // rq.k
    public final void inject() {
        switch (this.f109275a) {
            case 0:
                if (!this.f109276b) {
                    this.f109276b = true;
                    b0 b0Var = (b0) this;
                    jb jbVar = (jb) ((c0) generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    b0Var.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
                    b0Var.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
                    s8 s8Var = jbVar.f113485c;
                    b0Var.closeupActionController = s8Var.h5();
                    b0Var.bidiFormatter = a02.e.I1();
                    b0Var.baseCloseupLibraryExperiments = s8Var.k5();
                    b0Var.pinAuxHelper = (nx.b0) oaVar.R8.get();
                    b0Var.f109108c = (zf0.f) oaVar.f113723hd.get();
                    b0Var.f109109d = (m60.w) oaVar.f113885r0.get();
                    b0Var.f109110e = s8Var.j5();
                    break;
                }
                break;
            case 1:
                if (!this.f109276b) {
                    this.f109276b = true;
                    f0 f0Var = (f0) this;
                    jb jbVar2 = (jb) ((g0) generatedComponent());
                    oa oaVar2 = jbVar2.f113483a;
                    f0Var.clickThroughHelperFactory = (a11.d) oaVar2.f113668ec.get();
                    f0Var.presenterPinalyticsFactory = (uk1.e) oaVar2.f113702ga.get();
                    s8 s8Var2 = jbVar2.f113485c;
                    f0Var.closeupActionController = s8Var2.h5();
                    f0Var.bidiFormatter = a02.e.I1();
                    f0Var.baseCloseupLibraryExperiments = s8Var2.k5();
                    f0Var.pinAuxHelper = (nx.b0) oaVar2.R8.get();
                    break;
                }
                break;
            case 2:
                if (!this.f109276b) {
                    this.f109276b = true;
                    k0 k0Var = (k0) this;
                    jb jbVar3 = (jb) ((l0) generatedComponent());
                    oa oaVar3 = jbVar3.f113483a;
                    k0Var.clickThroughHelperFactory = (a11.d) oaVar3.f113668ec.get();
                    k0Var.presenterPinalyticsFactory = (uk1.e) oaVar3.f113702ga.get();
                    s8 s8Var3 = jbVar3.f113485c;
                    k0Var.closeupActionController = s8Var3.h5();
                    k0Var.bidiFormatter = a02.e.I1();
                    k0Var.baseCloseupLibraryExperiments = s8Var3.k5();
                    k0Var.pinAuxHelper = (nx.b0) oaVar3.R8.get();
                    k0Var.f109325d = (x02.x2) oaVar3.f113800m3.get();
                    k0Var.f109326e = s8Var3.j5();
                    break;
                }
                break;
            case 3:
                if (!this.f109276b) {
                    this.f109276b = true;
                    y0 y0Var = (y0) this;
                    jb jbVar4 = (jb) ((z0) generatedComponent());
                    oa oaVar4 = jbVar4.f113483a;
                    y0Var.clickThroughHelperFactory = (a11.d) oaVar4.f113668ec.get();
                    y0Var.presenterPinalyticsFactory = (uk1.e) oaVar4.f113702ga.get();
                    s8 s8Var4 = jbVar4.f113485c;
                    y0Var.closeupActionController = s8Var4.h5();
                    y0Var.bidiFormatter = a02.e.I1();
                    y0Var.baseCloseupLibraryExperiments = s8Var4.k5();
                    y0Var.pinAuxHelper = (nx.b0) oaVar4.R8.get();
                    y0Var.f109658d = (m60.w) oaVar4.f113885r0.get();
                    y0Var.f109659e = s8Var4.j5();
                    y0Var.f109660f = s8Var4.a6();
                    break;
                }
                break;
            case 4:
                if (!this.f109276b) {
                    this.f109276b = true;
                    PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = (PinCloseupLegoActionButtonModule) this;
                    jb jbVar5 = (jb) ((q1) generatedComponent());
                    oa oaVar5 = jbVar5.f113483a;
                    pinCloseupLegoActionButtonModule.clickThroughHelperFactory = (a11.d) oaVar5.f113668ec.get();
                    pinCloseupLegoActionButtonModule.presenterPinalyticsFactory = (uk1.e) oaVar5.f113702ga.get();
                    s8 s8Var5 = jbVar5.f113485c;
                    pinCloseupLegoActionButtonModule.closeupActionController = s8Var5.h5();
                    pinCloseupLegoActionButtonModule.bidiFormatter = a02.e.I1();
                    pinCloseupLegoActionButtonModule.baseCloseupLibraryExperiments = s8Var5.k5();
                    pinCloseupLegoActionButtonModule.pinAuxHelper = (nx.b0) oaVar5.R8.get();
                    pinCloseupLegoActionButtonModule.f35012c = (es.a) oaVar5.P6.get();
                    pinCloseupLegoActionButtonModule.f35013d = s8Var5.k5();
                    pinCloseupLegoActionButtonModule.f35014e = (m60.w) oaVar5.f113885r0.get();
                    pinCloseupLegoActionButtonModule.f35015f = oaVar5.f113834o1;
                    a02.e.Z2();
                    pinCloseupLegoActionButtonModule.f35016g = (b60.b) oaVar5.f113850p0.get();
                    break;
                }
                break;
            case 5:
                if (!this.f109276b) {
                    this.f109276b = true;
                    a2 a2Var = (a2) this;
                    jb jbVar6 = (jb) ((b2) generatedComponent());
                    oa oaVar6 = jbVar6.f113483a;
                    a2Var.clickThroughHelperFactory = (a11.d) oaVar6.f113668ec.get();
                    a2Var.presenterPinalyticsFactory = (uk1.e) oaVar6.f113702ga.get();
                    s8 s8Var6 = jbVar6.f113485c;
                    a2Var.closeupActionController = s8Var6.h5();
                    a2Var.bidiFormatter = a02.e.I1();
                    a2Var.baseCloseupLibraryExperiments = s8Var6.k5();
                    a2Var.pinAuxHelper = (nx.b0) oaVar6.R8.get();
                    break;
                }
                break;
            case 6:
                if (!this.f109276b) {
                    this.f109276b = true;
                    g2 g2Var = (g2) this;
                    jb jbVar7 = (jb) ((h2) generatedComponent());
                    oa oaVar7 = jbVar7.f113483a;
                    g2Var.clickThroughHelperFactory = (a11.d) oaVar7.f113668ec.get();
                    g2Var.presenterPinalyticsFactory = (uk1.e) oaVar7.f113702ga.get();
                    s8 s8Var7 = jbVar7.f113485c;
                    g2Var.closeupActionController = s8Var7.h5();
                    g2Var.bidiFormatter = a02.e.I1();
                    g2Var.baseCloseupLibraryExperiments = s8Var7.k5();
                    g2Var.pinAuxHelper = (nx.b0) oaVar7.R8.get();
                    g2Var.f109204c = (is1.i0) oaVar7.Yf.get();
                    break;
                }
                break;
            case 7:
                if (!this.f109276b) {
                    this.f109276b = true;
                    j2 j2Var = (j2) this;
                    jb jbVar8 = (jb) ((k2) generatedComponent());
                    oa oaVar8 = jbVar8.f113483a;
                    j2Var.clickThroughHelperFactory = (a11.d) oaVar8.f113668ec.get();
                    j2Var.presenterPinalyticsFactory = (uk1.e) oaVar8.f113702ga.get();
                    s8 s8Var8 = jbVar8.f113485c;
                    j2Var.closeupActionController = s8Var8.h5();
                    j2Var.bidiFormatter = a02.e.I1();
                    j2Var.baseCloseupLibraryExperiments = s8Var8.k5();
                    j2Var.pinAuxHelper = (nx.b0) oaVar8.R8.get();
                    j2Var.f109288c = (i92.k) oaVar8.f113921t1.get();
                    j2Var.f109289d = (so.p) s8Var8.E5.get();
                    j2Var.f109290e = (is1.i0) oaVar8.Yf.get();
                    break;
                }
                break;
            case 8:
                if (!this.f109276b) {
                    this.f109276b = true;
                    p2 p2Var = (p2) this;
                    jb jbVar9 = (jb) ((q2) generatedComponent());
                    oa oaVar9 = jbVar9.f113483a;
                    p2Var.clickThroughHelperFactory = (a11.d) oaVar9.f113668ec.get();
                    p2Var.presenterPinalyticsFactory = (uk1.e) oaVar9.f113702ga.get();
                    s8 s8Var9 = jbVar9.f113485c;
                    p2Var.closeupActionController = s8Var9.h5();
                    p2Var.bidiFormatter = a02.e.I1();
                    p2Var.baseCloseupLibraryExperiments = s8Var9.k5();
                    p2Var.pinAuxHelper = (nx.b0) oaVar9.R8.get();
                    p2Var.f109461c = (b60.b) oaVar9.f113850p0.get();
                    p2Var.f109462d = s8Var9.j5();
                    p2Var.f109463e = s8Var9.a6();
                    break;
                }
                break;
            case 9:
                if (!this.f109276b) {
                    this.f109276b = true;
                    k3 k3Var = (k3) this;
                    jb jbVar10 = (jb) ((l3) generatedComponent());
                    oa oaVar10 = jbVar10.f113483a;
                    k3Var.clickThroughHelperFactory = (a11.d) oaVar10.f113668ec.get();
                    k3Var.presenterPinalyticsFactory = (uk1.e) oaVar10.f113702ga.get();
                    s8 s8Var10 = jbVar10.f113485c;
                    k3Var.closeupActionController = s8Var10.h5();
                    k3Var.bidiFormatter = a02.e.I1();
                    k3Var.baseCloseupLibraryExperiments = s8Var10.k5();
                    k3Var.pinAuxHelper = (nx.b0) oaVar10.R8.get();
                    k3Var.f109345h = (up0.l) oaVar10.Rc.get();
                    k3Var.f109346i = (zf0.f) oaVar10.f113723hd.get();
                    k3Var.f109347j = (m60.w) oaVar10.f113885r0.get();
                    k3Var.f109348k = s8Var10.j5();
                    k3Var.f109349l = s8Var10.a6();
                    k3Var.f109350m = (is1.i0) oaVar10.Yf.get();
                    k3Var.f109351n = (es.a) oaVar10.P6.get();
                    break;
                }
                break;
            case 10:
                if (!this.f109276b) {
                    this.f109276b = true;
                    r3 r3Var = (r3) this;
                    jb jbVar11 = (jb) ((s3) generatedComponent());
                    oa oaVar11 = jbVar11.f113483a;
                    r3Var.clickThroughHelperFactory = (a11.d) oaVar11.f113668ec.get();
                    r3Var.presenterPinalyticsFactory = (uk1.e) oaVar11.f113702ga.get();
                    s8 s8Var11 = jbVar11.f113485c;
                    r3Var.closeupActionController = s8Var11.h5();
                    r3Var.bidiFormatter = a02.e.I1();
                    r3Var.baseCloseupLibraryExperiments = s8Var11.k5();
                    r3Var.pinAuxHelper = (nx.b0) oaVar11.R8.get();
                    r3Var.f109510c = (zf0.f) oaVar11.f113723hd.get();
                    r3Var.f109511d = (x02.x2) oaVar11.f113800m3.get();
                    r3Var.f109512e = (m60.w) oaVar11.f113885r0.get();
                    r3Var.f109513f = s8Var11.j5();
                    break;
                }
                break;
            default:
                if (!this.f109276b) {
                    this.f109276b = true;
                    t3 t3Var = (t3) this;
                    jb jbVar12 = (jb) ((u3) generatedComponent());
                    oa oaVar12 = jbVar12.f113483a;
                    t3Var.clickThroughHelperFactory = (a11.d) oaVar12.f113668ec.get();
                    t3Var.presenterPinalyticsFactory = (uk1.e) oaVar12.f113702ga.get();
                    s8 s8Var12 = jbVar12.f113485c;
                    t3Var.closeupActionController = s8Var12.h5();
                    t3Var.bidiFormatter = a02.e.I1();
                    t3Var.baseCloseupLibraryExperiments = s8Var12.k5();
                    t3Var.pinAuxHelper = (nx.b0) oaVar12.R8.get();
                    break;
                }
                break;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean shouldShowForPin() {
        return hasContent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109275a = 4;
        inject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        this.f109275a = i14;
        if (i14 != 4) {
            inject();
        } else {
            super(context, attributeSet, i13);
            inject();
        }
    }
}
