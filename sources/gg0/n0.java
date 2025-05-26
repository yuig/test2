package gg0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import lq0.r0;
import nx.d1;
import qa2.a1;
import qa2.b1;
import so.jb;
import so.oa;
import so.s8;
import x02.e1;
import x02.i2;
import x02.u2;
import x02.x0;
import x02.x2;

/* loaded from: classes5.dex */
public abstract class n0 extends RelativeLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64952a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f64953b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, int i13) {
        super(context);
        this.f64952a = i13;
        if (i13 == 3) {
            super(context);
            g();
            return;
        }
        if (i13 == 4) {
            super(context);
            g();
        } else if (i13 == 5) {
            super(context);
            g();
        } else if (i13 != 6) {
            g();
        } else {
            super(context);
            g();
        }
    }

    public final ye2.o a() {
        switch (this.f64952a) {
            case 0:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 1:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 2:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 3:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 4:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 5:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            case 6:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
            default:
                if (this.f64953b == null) {
                    this.f64953b = b();
                }
                break;
        }
        return this.f64953b;
    }

    public final ye2.o b() {
        switch (this.f64952a) {
        }
        return new ye2.o(this);
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f64952a) {
        }
        return a();
    }

    public final void g() {
        switch (this.f64952a) {
            case 0:
                if (!this.f64954c) {
                    this.f64954c = true;
                    s8 s8Var = ((jb) ((x) generatedComponent())).f113485c;
                    ((EducationNewContainerView) this).f44990f = (ku1.l) s8Var.f114476s.get();
                    break;
                }
                break;
            case 1:
                if (!this.f64954c) {
                    this.f64954c = true;
                    LegoBoardDetailHeader legoBoardDetailHeader = (LegoBoardDetailHeader) this;
                    jb jbVar = (jb) ((xk0.e) generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    legoBoardDetailHeader.f45219s = (x0) oaVar.f113765k3.get();
                    legoBoardDetailHeader.f45220t = (b60.b) oaVar.f113850p0.get();
                    legoBoardDetailHeader.f45221u = (u2) oaVar.Dd.get();
                    legoBoardDetailHeader.f45222v = (m60.w) oaVar.f113885r0.get();
                    s8 s8Var2 = jbVar.f113485c;
                    legoBoardDetailHeader.f45223w = (ap.o) s8Var2.I0.get();
                    legoBoardDetailHeader.f45224x = (yk1.j) oaVar.Qc.get();
                    legoBoardDetailHeader.f45225y = s8Var2.x5();
                    legoBoardDetailHeader.f45226z = (uk1.e) oaVar.f113702ga.get();
                    legoBoardDetailHeader.A = (nx.f0) oaVar.f113747j2.get();
                    legoBoardDetailHeader.B = (oc.c) oaVar.f113907s5.get();
                    legoBoardDetailHeader.C = oaVar.I2();
                    legoBoardDetailHeader.D = s8Var2.d5();
                    legoBoardDetailHeader.E = s8Var2.D6();
                    break;
                }
                break;
            case 2:
                if (!this.f64954c) {
                    this.f64954c = true;
                    ConversationMessageItemView conversationMessageItemView = (ConversationMessageItemView) this;
                    jb jbVar2 = (jb) ((lq0.v) generatedComponent());
                    s8 s8Var3 = jbVar2.f113485c;
                    conversationMessageItemView.M0 = (il1.a) s8Var3.f114581z.get();
                    oa oaVar2 = jbVar2.f113483a;
                    conversationMessageItemView.N0 = (x2) oaVar2.f113800m3.get();
                    conversationMessageItemView.O0 = (i2) oaVar2.F3.get();
                    conversationMessageItemView.P0 = (m60.w) oaVar2.f113885r0.get();
                    conversationMessageItemView.Q0 = s8Var3.q5();
                    conversationMessageItemView.R0 = (e02.a) oaVar2.f113757jd.get();
                    conversationMessageItemView.S0 = (b60.b) oaVar2.f113850p0.get();
                    conversationMessageItemView.T0 = (oc.c) oaVar2.f113907s5.get();
                    conversationMessageItemView.U0 = (e1) oaVar2.Ce.get();
                    conversationMessageItemView.V0 = (r0) oaVar2.Zf.get();
                    conversationMessageItemView.W0 = s8Var3.D6();
                    conversationMessageItemView.X0 = s8Var3.e5();
                    break;
                }
                break;
            case 3:
                if (!this.f64954c) {
                    this.f64954c = true;
                    break;
                }
                break;
            case 4:
                if (!this.f64954c) {
                    this.f64954c = true;
                    ((ye1.e) this).f138852f = (ku1.l) ((jb) ((ye1.f) generatedComponent())).f113485c.f114476s.get();
                    break;
                }
                break;
            case 5:
                if (!this.f64954c) {
                    this.f64954c = true;
                    sf1.s sVar = (sf1.s) this;
                    jb jbVar3 = (jb) ((sf1.z) generatedComponent());
                    oa oaVar3 = jbVar3.f113483a;
                    sVar.f112705l = (zf1.e) oaVar3.f114036z8.get();
                    sVar.f112706m = (ag1.f) oaVar3.f113594a8.get();
                    sVar.f112707n = (i92.k) oaVar3.f113921t1.get();
                    sVar.f112708o = (jo1.c) oaVar3.f113810md.get();
                    sVar.f112709p = (m60.w) oaVar3.f113885r0.get();
                    sVar.f112710q = (d1) oaVar3.f113730i2.get();
                    sVar.f112711r = (ac2.m) oaVar3.C7.get();
                    sVar.f112712s = oaVar3.w2();
                    sVar.f112713t = jbVar3.c();
                    s8 s8Var4 = jbVar3.f113485c;
                    sVar.f112714u = (qh1.e) s8Var4.P1.get();
                    sVar.f112715v = (b60.b) oaVar3.f113850p0.get();
                    sVar.f112716w = (bc2.e) oaVar3.F7.get();
                    sVar.f112717x = oaVar3.e2();
                    sVar.f112718y = (lb0.q) oaVar3.O0.get();
                    sVar.f112719z = s8Var4.e5();
                    break;
                }
                break;
            case 6:
                if (!this.f64954c) {
                    this.f64954c = true;
                    a1 a1Var = (a1) this;
                    jb jbVar4 = (jb) ((b1) generatedComponent());
                    oa oaVar4 = jbVar4.f113483a;
                    a1Var.f103219n = (dl1.t) oaVar4.M2.get();
                    a1Var.f103220o = (dl1.t) oaVar4.f113678f4.get();
                    a1Var.f103221p = (dl1.t) oaVar4.G3.get();
                    a1Var.f103222q = jbVar4.f113485c.e5();
                    break;
                }
                break;
            default:
                if (!this.f64954c) {
                    this.f64954c = true;
                    ((com.pinterest.ui.text.b) generatedComponent()).getClass();
                    break;
                }
                break;
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f64952a) {
        }
        return a().generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        this.f64952a = i13;
        if (i13 != 2) {
            g();
        } else {
            super(context, attributeSet);
            g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        this.f64952a = i14;
        if (i14 == 1) {
            super(context, attributeSet, i13);
            g();
        } else if (i14 == 2) {
            super(context, attributeSet, i13);
            g();
        } else if (i14 != 7) {
            g();
        } else {
            super(context, attributeSet, i13);
            g();
        }
    }
}
