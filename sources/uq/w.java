package uq;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import b11.u0;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.engagementtab.FloatingCommentView;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import com.pinterest.feature.profile.allpins.view.ProfileAllPinsRep;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.feature.sharesheet.view.AnimatedSendShareButton;
import i91.z;
import lh0.h4;
import lh0.s1;
import lh0.v1;
import lh0.z0;
import ni1.d0;
import ni1.t2;
import nx.d1;
import nx.f0;
import rh1.k0;
import rh1.l0;
import sf1.e1;
import sf1.f1;
import sf1.j0;
import so.jb;
import so.oa;
import so.s8;
import we1.h0;
import we1.i0;
import wr0.b0;
import x02.i2;
import x02.l2;
import x02.x0;
import x02.x2;
import y31.q0;

/* loaded from: classes3.dex */
public abstract class w extends ConstraintLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123031a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f123032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, int i13) {
        super(context);
        this.f123031a = i13;
        if (i13 == 4) {
            super(context);
            inject();
            return;
        }
        if (i13 == 8) {
            super(context);
            inject();
            return;
        }
        if (i13 == 11) {
            super(context);
            inject();
            return;
        }
        if (i13 == 23) {
            super(context);
            inject();
            return;
        }
        switch (i13) {
            case 13:
                super(context);
                inject();
                break;
            case 14:
                super(context);
                inject();
                break;
            case 15:
                super(context);
                inject();
                break;
            case 16:
                super(context);
                inject();
                break;
            case 17:
                super(context);
                inject();
                break;
            case 18:
                super(context);
                inject();
                break;
            case 19:
                super(context);
                inject();
                break;
            case 20:
                super(context);
                inject();
                break;
            default:
                switch (i13) {
                    case 25:
                        super(context);
                        inject();
                        break;
                    case 26:
                        super(context);
                        inject();
                        break;
                    case 27:
                        super(context);
                        inject();
                        break;
                    case 28:
                        super(context);
                        inject();
                        break;
                    case 29:
                        super(context);
                        inject();
                        break;
                    default:
                        inject();
                        break;
                }
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f123031a) {
        }
        return componentManager();
    }

    public final ye2.o createComponentManager() {
        switch (this.f123031a) {
        }
        return new ye2.o(this);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f123031a) {
        }
        return componentManager().generatedComponent();
    }

    public final void inject() {
        switch (this.f123031a) {
            case 0:
                if (!this.f123033c) {
                    this.f123033c = true;
                    CommentComposerView commentComposerView = (CommentComposerView) this;
                    jb jbVar = (jb) ((l) generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    commentComposerView.f35071d = (f0) oaVar.f113747j2.get();
                    commentComposerView.f35072e = (uk1.e) oaVar.f113702ga.get();
                    commentComposerView.f35073f = oa.U1(oaVar);
                    s8 s8Var = jbVar.f113485c;
                    commentComposerView.f35074g = (qh1.e) s8Var.P1.get();
                    commentComposerView.f35075h = s8Var.L6();
                    commentComposerView.f35076i = (zp.j) s8Var.U2.get();
                    commentComposerView.f35077j = (m60.w) oaVar.f113885r0.get();
                    commentComposerView.f35078k = (lb0.r) oaVar.f113622c1.get();
                    commentComposerView.f35079l = (l2) oaVar.f113916se.get();
                    commentComposerView.f35080m = (up0.l) oaVar.Rc.get();
                    break;
                }
                break;
            case 1:
                if (!this.f123033c) {
                    this.f123033c = true;
                    CommentPreviewView commentPreviewView = (CommentPreviewView) this;
                    jb jbVar2 = (jb) ((t) generatedComponent());
                    commentPreviewView.f35095d = (m60.w) jbVar2.f113483a.f113885r0.get();
                    commentPreviewView.f35096e = (qh1.e) jbVar2.f113485c.P1.get();
                    break;
                }
                break;
            case 2:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((uv.g) generatedComponent()).getClass();
                    break;
                }
                break;
            case 3:
                if (!this.f123033c) {
                    this.f123033c = true;
                    jb jbVar3 = (jb) ((ec0.j) generatedComponent());
                    jbVar3.getClass();
                    ((LegoBoardRep) this).f44720d = new h4((z0) jbVar3.f113483a.D0.get());
                    break;
                }
                break;
            case 4:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((jd0.c) generatedComponent()).getClass();
                    break;
                }
                break;
            case 5:
                if (!this.f123033c) {
                    this.f123033c = true;
                    qi0.d dVar = (qi0.d) this;
                    jb jbVar4 = (jb) ((qi0.e) generatedComponent());
                    s8 s8Var2 = jbVar4.f113485c;
                    dVar.f103980i = s8.b(s8Var2);
                    oa oaVar2 = jbVar4.f113483a;
                    dVar.f103981j = (d1) oaVar2.f113730i2.get();
                    dVar.f103982k = (l51.a) s8Var2.X1.get();
                    dVar.f103983l = (m60.w) oaVar2.f113885r0.get();
                    break;
                }
                break;
            case 6:
                if (!this.f123033c) {
                    this.f123033c = true;
                    qi0.h hVar = (qi0.h) this;
                    s8 s8Var3 = ((jb) ((qi0.j) generatedComponent())).f113485c;
                    hVar.f103995g = s8.b(s8Var3);
                    hVar.f103996h = s8Var3.a6();
                    break;
                }
                break;
            case 7:
                if (!this.f123033c) {
                    this.f123033c = true;
                    kp0.c cVar = (kp0.c) this;
                    jb jbVar5 = (jb) ((kp0.e) generatedComponent());
                    cVar.f80573f = jbVar5.f113483a.p2();
                    cVar.f80575h = (l51.a) jbVar5.f113485c.X1.get();
                    break;
                }
                break;
            case 8:
                if (!this.f123033c) {
                    this.f123033c = true;
                    mp0.d dVar2 = (mp0.d) this;
                    jb jbVar6 = (jb) ((mp0.f) generatedComponent());
                    s8 s8Var4 = jbVar6.f113485c;
                    dVar2.f87901f = (l51.a) s8Var4.X1.get();
                    oa oaVar3 = jbVar6.f113483a;
                    dVar2.f87902g = (a11.d) oaVar3.f113668ec.get();
                    dVar2.f87903h = (hs1.q) oaVar3.f113875q7.get();
                    dVar2.f87904i = (ni1.d) s8Var4.f114551x.get();
                    dVar2.f87905j = oaVar3.w2();
                    dVar2.f87906k = (d1) oaVar3.f113730i2.get();
                    dVar2.f87907l = (es.a) oaVar3.P6.get();
                    break;
                }
                break;
            case 9:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((FloatingCommentView) this).f45701p = (up0.l) ((jb) ((b0) generatedComponent())).f113483a.Rc.get();
                    break;
                }
                break;
            case 10:
                if (!this.f123033c) {
                    this.f123033c = true;
                    IdeaPinEditablePageLite ideaPinEditablePageLite = (IdeaPinEditablePageLite) this;
                    oa oaVar4 = ((jb) ((fu0.h) generatedComponent())).f113483a;
                    ideaPinEditablePageLite.f46440d = (x2) oaVar4.f113800m3.get();
                    ideaPinEditablePageLite.f46441e = (i2) oaVar4.F3.get();
                    ideaPinEditablePageLite.f46442f = (x0) oaVar4.f113765k3.get();
                    ideaPinEditablePageLite.f46443g = (s1) oaVar4.f113718h8.get();
                    ideaPinEditablePageLite.f46444h = (nt0.d) oaVar4.f113982w8.get();
                    break;
                }
                break;
            case 11:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((ev0.o) generatedComponent()).getClass();
                    break;
                }
                break;
            case 12:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((ev0.t) generatedComponent()).getClass();
                    break;
                }
                break;
            case 13:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ax0.h hVar2 = (ax0.h) this;
                    jb jbVar7 = (jb) ((ax0.j) generatedComponent());
                    jbVar7.f113485c.F6();
                    oa oaVar5 = jbVar7.f113483a;
                    hVar2.f20620e = oaVar5.v2();
                    hVar2.f20621f = (d0) oaVar5.Gb.get();
                    hVar2.f20622g = (t2) oaVar5.f113950uc.get();
                    break;
                }
                break;
            case 14:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((jb) ((cx0.k) generatedComponent())).f113485c.F6();
                    break;
                }
                break;
            case 15:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((b01.o) this).f20766e = (m60.w) ((jb) ((b01.p) generatedComponent())).f113483a.f113885r0.get();
                    break;
                }
                break;
            case 16:
                if (!this.f123033c) {
                    this.f123033c = true;
                    h01.e eVar = (h01.e) this;
                    oa oaVar6 = ((jb) ((h01.f) generatedComponent())).f113483a;
                    eVar.f66434g = (m60.w) oaVar6.f113885r0.get();
                    eVar.f66435h = (b60.b) oaVar6.f113850p0.get();
                    eVar.f66436i = (lb0.o) oaVar6.f113780l0.get();
                    break;
                }
                break;
            case 17:
                if (!this.f123033c) {
                    this.f123033c = true;
                    UnifiedPinActionBarView unifiedPinActionBarView = (UnifiedPinActionBarView) this;
                    jb jbVar8 = (jb) ((u0) generatedComponent());
                    oa oaVar7 = jbVar8.f113483a;
                    unifiedPinActionBarView.A = (m60.w) oaVar7.f113885r0.get();
                    s8 s8Var5 = jbVar8.f113485c;
                    unifiedPinActionBarView.B = s8Var5.h5();
                    unifiedPinActionBarView.C = oaVar7.f113834o1;
                    a02.e.Z2();
                    unifiedPinActionBarView.D = (d1) oaVar7.f113730i2.get();
                    unifiedPinActionBarView.E = (i2) oaVar7.F3.get();
                    unifiedPinActionBarView.F = s8Var5.i5();
                    unifiedPinActionBarView.G = (qh1.e) s8Var5.P1.get();
                    unifiedPinActionBarView.H = (nx.b0) oaVar7.R8.get();
                    unifiedPinActionBarView.I = (es.a) oaVar7.P6.get();
                    break;
                }
                break;
            case 18:
                if (!this.f123033c) {
                    this.f123033c = true;
                    break;
                }
                break;
            case 19:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ProfileAllPinsRep profileAllPinsRep = (ProfileAllPinsRep) this;
                    profileAllPinsRep.f47490r = ((jb) ((i31.d) generatedComponent())).f113483a.j2();
                    profileAllPinsRep.f47491s = new qb0.a();
                    break;
                }
                break;
            case 20:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((u31.d) generatedComponent()).getClass();
                    break;
                }
                break;
            case 21:
                if (!this.f123033c) {
                    this.f123033c = true;
                    UserProfileHeader userProfileHeader = (UserProfileHeader) this;
                    s8 s8Var6 = ((jb) ((q0) generatedComponent())).f113485c;
                    userProfileHeader.f47528n = s8Var6.g6();
                    userProfileHeader.f47529o = (yk1.v) s8Var6.C.get();
                    userProfileHeader.f47530p = new qb0.a();
                    break;
                }
                break;
            case 22:
                if (!this.f123033c) {
                    this.f123033c = true;
                    LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) this;
                    jb jbVar9 = (jb) ((j41.j) generatedComponent());
                    oa oaVar8 = jbVar9.f113483a;
                    legoUserProfileHeader.F = bf2.b.a(oaVar8.f113885r0);
                    s8 s8Var7 = jbVar9.f113485c;
                    legoUserProfileHeader.G = bf2.b.a(s8Var7.U2);
                    legoUserProfileHeader.H = (lu1.b) oaVar8.f113961v5.get();
                    a02.e.H1(s8Var7.f114210a);
                    legoUserProfileHeader.I = s8Var7.g6();
                    break;
                }
                break;
            case 23:
                if (!this.f123033c) {
                    this.f123033c = true;
                    ((j51.i) generatedComponent()).getClass();
                    break;
                }
                break;
            case 24:
                if (!this.f123033c) {
                    this.f123033c = true;
                    AnimatedSendShareButton animatedSendShareButton = (AnimatedSendShareButton) this;
                    oa oaVar9 = ((jb) ((fd1.b) generatedComponent())).f113483a;
                    animatedSendShareButton.f48376d = (lb0.q) oaVar9.O0.get();
                    animatedSendShareButton.f48377e = oaVar9.B2();
                    animatedSendShareButton.f48378f = (z) oaVar9.f113742ie.get();
                    break;
                }
                break;
            case 25:
                if (!this.f123033c) {
                    this.f123033c = true;
                    h0 h0Var = (h0) this;
                    oa oaVar10 = ((jb) ((i0) generatedComponent())).f113483a;
                    h0Var.f129379f = oaVar10.v2();
                    h0Var.f129380g = (t2) oaVar10.f113950uc.get();
                    h0Var.f129381h = (d0) oaVar10.Gb.get();
                    break;
                }
                break;
            case 26:
                if (!this.f123033c) {
                    this.f123033c = true;
                    sf1.h0 h0Var2 = (sf1.h0) this;
                    jb jbVar10 = (jb) ((j0) generatedComponent());
                    h0Var2.f112583h = (m60.w) jbVar10.f113483a.f113885r0.get();
                    h0Var2.f112584i = new v1((z0) jbVar10.f113483a.D0.get());
                    break;
                }
                break;
            case 27:
                if (!this.f123033c) {
                    this.f123033c = true;
                    e1 e1Var = (e1) this;
                    jb jbVar11 = (jb) ((f1) generatedComponent());
                    e1Var.f112548g = new v1((z0) jbVar11.f113483a.D0.get());
                    oa oaVar11 = jbVar11.f113483a;
                    e1Var.f112549h = (ac2.m) oaVar11.C7.get();
                    e1Var.f112550i = (c91.e) jbVar11.f113485c.f114211a0.get();
                    e1Var.f112551j = (i92.k) oaVar11.f113921t1.get();
                    e1Var.f112552k = (m60.w) oaVar11.f113885r0.get();
                    e1Var.f112553l = jbVar11.f113506x;
                    e1Var.f112554m = (ac2.k) oaVar11.f113981w7.get();
                    break;
                }
                break;
            case 28:
                if (!this.f123033c) {
                    this.f123033c = true;
                    com.pinterest.feature.todaytab.tab.view.e eVar2 = (com.pinterest.feature.todaytab.tab.view.e) this;
                    oa oaVar12 = ((jb) ((com.pinterest.feature.todaytab.tab.view.f) generatedComponent())).f113483a;
                    eVar2.f48720i = oaVar12.v2();
                    eVar2.f48721j = (t2) oaVar12.f113950uc.get();
                    eVar2.f48722k = (d0) oaVar12.Gb.get();
                    break;
                }
                break;
            default:
                if (!this.f123033c) {
                    this.f123033c = true;
                    k0 k0Var = (k0) this;
                    oa oaVar13 = ((jb) ((l0) generatedComponent())).f113483a;
                    k0Var.f108231t = oaVar13.v2();
                    k0Var.f108232u = (t2) oaVar13.f113950uc.get();
                    k0Var.f108233v = (d0) oaVar13.Gb.get();
                    break;
                }
                break;
        }
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        switch (this.f123031a) {
            case 0:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 1:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 2:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 3:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 4:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 5:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 6:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 7:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 8:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 9:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 10:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 11:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 12:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 13:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 14:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 15:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 16:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 17:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 18:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 19:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 20:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 21:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 22:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 23:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 24:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 25:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 26:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 27:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            case 28:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
            default:
                if (this.f123032b == null) {
                    this.f123032b = createComponentManager();
                }
                break;
        }
        return this.f123032b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        this.f123031a = i13;
        if (i13 == 1) {
            super(context, attributeSet);
            inject();
            return;
        }
        if (i13 == 3) {
            super(context, attributeSet);
            inject();
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 9:
                    super(context, attributeSet);
                    inject();
                    break;
                case 10:
                    super(context, attributeSet);
                    inject();
                    break;
                case 11:
                    super(context, attributeSet);
                    inject();
                    break;
                default:
                    switch (i13) {
                        case 17:
                            super(context, attributeSet);
                            inject();
                            break;
                        case 18:
                            super(context, attributeSet);
                            inject();
                            break;
                        case 19:
                            super(context, attributeSet);
                            inject();
                            break;
                        case 20:
                            super(context, attributeSet);
                            inject();
                            break;
                        default:
                            switch (i13) {
                                case 22:
                                    super(context, attributeSet);
                                    inject();
                                    break;
                                case 23:
                                    super(context, attributeSet);
                                    inject();
                                    break;
                                case 24:
                                    super(context, attributeSet);
                                    inject();
                                    break;
                                default:
                                    inject();
                                    break;
                            }
                    }
            }
            return;
        }
        super(context, attributeSet);
        inject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f123031a = 2;
        inject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i13, int i14, int i15) {
        super(context, attributeSet, i13);
        this.f123031a = i14;
        switch (i14) {
            case 1:
                super(context, attributeSet, i13);
                inject();
                break;
            case 2:
            case 8:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                inject();
                break;
            case 3:
                super(context, attributeSet, i13);
                inject();
                break;
            case 4:
                super(context, attributeSet, i13);
                inject();
                break;
            case 5:
                super(context, attributeSet, i13);
                inject();
                break;
            case 6:
                super(context, attributeSet, i13);
                inject();
                break;
            case 7:
                super(context, attributeSet, i13);
                inject();
                break;
            case 9:
                super(context, attributeSet, i13);
                inject();
                break;
            case 10:
                super(context, attributeSet, i13);
                inject();
                break;
            case 11:
                super(context, attributeSet, i13);
                inject();
                break;
            case 12:
                super(context, attributeSet, i13);
                inject();
                break;
            case 17:
                super(context, attributeSet, i13);
                inject();
                break;
            case 18:
                super(context, attributeSet, i13);
                inject();
                break;
            case 19:
                super(context, attributeSet, i13);
                inject();
                break;
            case 20:
                super(context, attributeSet, i13);
                inject();
                break;
            case 21:
                super(context, attributeSet, i13);
                inject();
                break;
            case 22:
                super(context, attributeSet, i13);
                inject();
                break;
            case 23:
                super(context, attributeSet, i13);
                inject();
                break;
            case 24:
                super(context, attributeSet, i13);
                inject();
                break;
        }
    }
}
