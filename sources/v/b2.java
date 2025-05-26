package v;

import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.education.view.EducationToolTipView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b2 implements r4.j, oe0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123372c;

    public /* synthetic */ b2(Object obj, boolean z13, int i13) {
        this.f123370a = i13;
        this.f123372c = obj;
        this.f123371b = z13;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        int i13 = this.f123370a;
        boolean z13 = this.f123371b;
        Object obj = this.f123372c;
        switch (i13) {
            case 0:
                g2 g2Var = (g2) obj;
                g2Var.getClass();
                g2Var.f123468b.execute(new c2(g2Var, z13, iVar, 0));
                return "enableExternalFlashAeMode";
            default:
                z2 z2Var = (z2) obj;
                z2Var.getClass();
                z2Var.f123762d.execute(new c2(z2Var, iVar, z13, 1));
                return "enableTorch: " + z13;
        }
    }

    @Override // oe0.f
    public final void b() {
        EducationToolTipView this$0 = (EducationToolTipView) this.f123372c;
        int i13 = EducationToolTipView.f45022m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this.f123371b) {
            this$0.f45024b.setAlpha(1.0f);
            return;
        }
        oe0.g gVar = this$0.f45025c;
        PinterestToolTip pinterestToolTip = this$0.f45024b;
        Intrinsics.g(pinterestToolTip, "null cannot be cast to non-null type com.pinterest.design.brio.widget.voice.PinterestVoiceLayout");
        gVar.getClass();
        oe0.g.c(pinterestToolTip, 0.0f, this$0.f45026d, this$0.f45027e, null);
    }

    public /* synthetic */ b2(boolean z13, EducationToolTipView educationToolTipView) {
        this.f123370a = 2;
        this.f123371b = z13;
        this.f123372c = educationToolTipView;
    }
}
