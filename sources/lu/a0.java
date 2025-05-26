package lu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.education.ActionPromptView;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.profile.savedtab.view.LegoBoardInviteProfileCell;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.settings.account.view.PasswordEditView;
import com.pinterest.identity.password.StrongPasswordTextField;
import com.pinterest.oneBarLibrary.modals.views.BodyTypeFilterEducationView;
import lq0.s0;
import lq0.t0;
import ni1.t2;
import qa2.k1;
import qa2.l1;
import so.jb;
import so.oa;
import x02.i2;

/* loaded from: classes3.dex */
public abstract class a0 extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84859a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f84860b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f84861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, int i13) {
        super(context);
        this.f84859a = i13;
        switch (i13) {
            case 5:
                super(context);
                e();
                break;
            case 6:
                super(context);
                e();
                break;
            case 7:
                super(context);
                e();
                break;
            case 8:
                super(context);
                e();
                break;
            case 9:
            case 11:
            case 14:
            default:
                e();
                break;
            case 10:
                super(context);
                e();
                break;
            case 12:
                super(context);
                e();
                break;
            case 13:
                super(context);
                e();
                break;
            case 15:
                super(context);
                e();
                break;
        }
    }

    public final ye2.o a() {
        switch (this.f84859a) {
            case 0:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 1:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 2:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 3:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 4:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 5:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 6:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 7:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 8:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 9:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 10:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 11:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 12:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 13:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            case 14:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
            default:
                if (this.f84860b == null) {
                    this.f84860b = b();
                }
                break;
        }
        return this.f84860b;
    }

    public final ye2.o b() {
        switch (this.f84859a) {
        }
        return new ye2.o(this);
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f84859a) {
        }
        return a();
    }

    public void e() {
        switch (this.f84859a) {
            case 0:
                if (!this.f84861c) {
                    this.f84861c = true;
                    s sVar = (s) this;
                    oa oaVar = ((jb) ((t) generatedComponent())).f113483a;
                    sVar.f84933e = (nx.f0) oaVar.f113747j2.get();
                    sVar.f84934f = (uj2.q) oaVar.f113947u9.get();
                    sVar.f84935g = oaVar.p2();
                    break;
                }
                break;
            case 1:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ActionPromptView actionPromptView = (ActionPromptView) this;
                    oa oaVar2 = ((jb) ((zf0.c) generatedComponent())).f113483a;
                    actionPromptView.f44952e = (m60.w) oaVar2.f113885r0.get();
                    actionPromptView.f44953f = (zf0.f) oaVar2.f113723hd.get();
                    break;
                }
                break;
            case 2:
                if (!this.f84861c) {
                    this.f84861c = true;
                    InAppBrowserView inAppBrowserView = (InAppBrowserView) this;
                    jb jbVar = (jb) ((to0.x) generatedComponent());
                    oa oaVar3 = jbVar.f113483a;
                    inAppBrowserView.f45391d = (jo1.c) oaVar3.f113810md.get();
                    inAppBrowserView.f45392e = jbVar.f113485c.O6();
                    inAppBrowserView.f45393f = (lb0.q) oaVar3.O0.get();
                    break;
                }
                break;
            case 3:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((xo0.d) this).f135590i = (ku1.l) ((jb) ((xo0.e) generatedComponent())).f113485c.f114476s.get();
                    break;
                }
                break;
            case 4:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((s0) this).f84425f = (i2) ((jb) ((t0) generatedComponent())).f113483a.F3.get();
                    break;
                }
                break;
            case 5:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((ez0.c) this).f60669e = (i91.z) ((jb) ((ez0.d) generatedComponent())).f113483a.f113742ie.get();
                    break;
                }
                break;
            case 6:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((nz0.f) this).f92723d = (a11.d) ((jb) ((nz0.g) generatedComponent())).f113483a.f113668ec.get();
                    break;
                }
                break;
            case 7:
                if (!this.f84861c) {
                    this.f84861c = true;
                    LegoBoardInviteProfileCell legoBoardInviteProfileCell = (LegoBoardInviteProfileCell) this;
                    oa oaVar4 = ((jb) ((j51.o) generatedComponent())).f113483a;
                    legoBoardInviteProfileCell.f47585d = oaVar4.W2();
                    legoBoardInviteProfileCell.f47586e = oaVar4.j2();
                    break;
                }
                break;
            case 8:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((HairPatternEducationView) this).f47655g = (b60.b) ((jb) ((x61.f) generatedComponent())).f113483a.f113850p0.get();
                    break;
                }
                break;
            case 9:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((PasswordEditView) this).f48133f = ((jb) ((q91.h0) generatedComponent())).f113485c.Y4();
                    break;
                }
                break;
            case 10:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((ye1.s) this).f138887d = (ku1.l) ((jb) ((ye1.t) generatedComponent())).f113485c.f114476s.get();
                    break;
                }
                break;
            case 11:
                if (!this.f84861c) {
                    this.f84861c = true;
                    StrongPasswordTextField strongPasswordTextField = (StrongPasswordTextField) this;
                    jb jbVar2 = (jb) ((vr1.i) generatedComponent());
                    strongPasswordTextField.f49847d = (rr1.g) jbVar2.f113485c.f114321h6.get();
                    strongPasswordTextField.f49848e = (m60.w) jbVar2.f113483a.f113885r0.get();
                    break;
                }
                break;
            case 12:
                if (!this.f84861c) {
                    this.f84861c = true;
                    oa oaVar5 = ((jb) ((uv1.b) generatedComponent())).f113483a;
                    ((BodyTypeFilterEducationView) this).f49999f = (m60.w) oaVar5.f113885r0.get();
                    break;
                }
                break;
            case 13:
                if (!this.f84861c) {
                    this.f84861c = true;
                    ((yv1.k) generatedComponent()).getClass();
                    break;
                }
                break;
            case 14:
                if (!this.f84861c) {
                    this.f84861c = true;
                    b82.k kVar = (b82.k) this;
                    jb jbVar3 = (jb) ((b82.m) generatedComponent());
                    oa oaVar6 = jbVar3.f113483a;
                    kVar.f22201i = (c72.b0) oaVar6.f113846od.get();
                    kVar.f22202j = oa.z1(oaVar6);
                    kVar.f22203k = a02.e.j4();
                    kVar.f22204l = (m60.w) oaVar6.f113885r0.get();
                    kVar.f22205m = (n72.g) oaVar6.f113690fg.get();
                    kVar.f22206n = (n72.b) oaVar6.f113881qd.get();
                    kVar.f22207o = (tb0.h) oaVar6.f113797m0.get();
                    kVar.f22208p = oaVar6.a3();
                    kVar.f22209q = oa.y0(oaVar6);
                    kVar.f22210r = (es.a) oaVar6.P6.get();
                    kVar.f22211s = (es.h) oaVar6.f113735i7.get();
                    kVar.f22212t = jbVar3.f113485c.l5();
                    break;
                }
                break;
            default:
                if (!this.f84861c) {
                    this.f84861c = true;
                    k1 k1Var = (k1) this;
                    oa oaVar7 = ((jb) ((l1) generatedComponent())).f113483a;
                    k1Var.f103283e = (m60.w) oaVar7.f113885r0.get();
                    k1Var.f103284f = oaVar7.v2();
                    k1Var.f103285g = (t2) oaVar7.f113950uc.get();
                    k1Var.f103286h = (ni1.d0) oaVar7.Gb.get();
                    break;
                }
                break;
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f84859a) {
        }
        return a().generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        this.f84859a = i13;
        if (i13 == 8) {
            super(context, attributeSet);
            e();
        } else if (i13 != 12) {
            e();
        } else {
            super(context, attributeSet);
            e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f84859a = 14;
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i13, int i14, int i15) {
        super(context, attributeSet, i13);
        this.f84859a = i14;
        if (i14 == 1) {
            super(context, attributeSet, i13);
            e();
            return;
        }
        if (i14 == 2) {
            super(context, attributeSet, i13);
            e();
            return;
        }
        if (i14 == 4) {
            super(context, attributeSet, i13);
            e();
            return;
        }
        if (i14 == 7) {
            super(context, attributeSet, i13);
            e();
            return;
        }
        if (i14 == 8) {
            super(context, attributeSet, i13);
            e();
            return;
        }
        if (i14 == 9) {
            super(context, attributeSet, i13);
            e();
        } else if (i14 == 11) {
            super(context, attributeSet, i13);
            e();
        } else if (i14 != 12) {
            e();
        } else {
            super(context, attributeSet, i13);
            e();
        }
    }
}
