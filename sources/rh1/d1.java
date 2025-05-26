package rh1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.feature.unifiedcomments.view.PinTitleHeaderView;
import lh0.p4;
import so.jb;
import so.oa;
import so.xa;
import so.za;

/* loaded from: classes5.dex */
public abstract class d1 extends ConstraintLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108130a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f108131b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f108132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, int i13) {
        super(context);
        this.f108130a = i13;
        if (i13 == 4) {
            super(context);
            inject();
        } else if (i13 != 5) {
            inject();
        } else {
            super(context);
            inject();
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f108130a) {
        }
        return componentManager();
    }

    public final ye2.o createComponentManager() {
        switch (this.f108130a) {
        }
        return new ye2.o(this);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f108130a) {
        }
        return componentManager().generatedComponent();
    }

    public final void inject() {
        switch (this.f108130a) {
            case 0:
                if (!this.f108132c) {
                    this.f108132c = true;
                    jb jbVar = (jb) ((a2) generatedComponent());
                    ((PinCommentReactionHeaderView) this).f48946d = (m60.w) jbVar.f113483a.f113885r0.get();
                    jbVar.f113485c.L6();
                    break;
                }
                break;
            case 1:
                if (!this.f108132c) {
                    this.f108132c = true;
                    ((PinTitleHeaderView) this).f48958d = ((jb) ((c2) generatedComponent())).f113485c.L6();
                    break;
                }
                break;
            case 2:
                if (!this.f108132c) {
                    this.f108132c = true;
                    ((wn1.a0) generatedComponent()).getClass();
                    break;
                }
                break;
            case 3:
                if (!this.f108132c) {
                    this.f108132c = true;
                    v72.g gVar = (v72.g) this;
                    jb jbVar2 = (jb) ((v72.h) generatedComponent());
                    oa oaVar = jbVar2.f113483a;
                    gVar.f124420g = (n72.b) oaVar.f113881qd.get();
                    gVar.f124421h = oaVar.a3();
                    gVar.f124422i = oaVar.A2();
                    gVar.f124423j = oa.y0(oaVar);
                    gVar.f124425l = (xa) jbVar2.C.get();
                    gVar.f124426m = oaVar.v2();
                    gVar.f124427n = (ni1.d0) oaVar.Gb.get();
                    break;
                }
                break;
            case 4:
                if (!this.f108132c) {
                    this.f108132c = true;
                    ((za2.b) this).f141484e = (ku1.l) ((jb) ((za2.c) generatedComponent())).f113485c.f114476s.get();
                    break;
                }
                break;
            default:
                if (!this.f108132c) {
                    this.f108132c = true;
                    wc2.e eVar = (wc2.e) this;
                    jb jbVar3 = (jb) ((wc2.r) generatedComponent());
                    jbVar3.getClass();
                    oa oaVar2 = jbVar3.f113483a;
                    eVar.f129122g = new p4((lh0.z0) oaVar2.D0.get());
                    eVar.f129123h = (za) jbVar3.E.get();
                    eVar.f129124i = oaVar2.v2();
                    eVar.f129125j = (ni1.d0) oaVar2.Gb.get();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        this.f108130a = i13;
        if (i13 != 1) {
            inject();
        } else {
            super(context, attributeSet);
            inject();
        }
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        switch (this.f108130a) {
            case 0:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
            case 1:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
            case 2:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
            case 3:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
            case 4:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
            default:
                if (this.f108131b == null) {
                    this.f108131b = createComponentManager();
                }
                break;
        }
        return this.f108131b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        this.f108130a = i14;
        if (i14 == 1) {
            super(context, attributeSet, i13);
            inject();
        } else if (i14 != 2) {
            inject();
        } else {
            super(context, attributeSet, i13);
            inject();
        }
    }
}
