package fs0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f62833d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z13, jo1.a baseFragmentType, ls0.f viewParams) {
        super(baseFragmentType, viewParams);
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        this.f62834e = z13;
    }

    @Override // fs0.n
    public final List a(l config) {
        boolean z13 = config.f62871d;
        boolean z14 = config.f62875h;
        int i13 = this.f62833d;
        l1 l1Var = this.f62885c;
        boolean z15 = this.f62834e;
        ls0.f fVar = this.f62884b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList l13 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
                if (c() && !z14) {
                    l13.add(es0.a.SAVE);
                }
                l13.add(es0.a.SEND);
                if (n.b(fVar.f84637l, config.f62874g, config.f62876i)) {
                    l13.add(es0.a.DOWNLOAD);
                }
                if (d()) {
                    l13.add(es0.a.UNFOLLOW);
                }
                if (z15) {
                    l13.add(es0.a.HIDE);
                    boolean z16 = config.f62880m;
                    boolean z17 = config.f62879l;
                    boolean z18 = config.f62878k;
                    if (z18 || z17 || z16) {
                        z3 activate = z3.ACTIVATE_EXPERIMENT;
                        l1Var.getClass();
                        Intrinsics.checkNotNullParameter("enabled", "group");
                        Intrinsics.checkNotNullParameter(activate, "activate");
                        if (((g1) l1Var.f83416a).k("android_inclusive_active_learning", "enabled", activate)) {
                            if (z18) {
                                l13.add(es0.a.HIDE_WRONG_HAIR_PATTERN);
                            } else if (z17) {
                                l13.add(es0.a.HIDE_WRONG_SKIN_TONE);
                            } else if (z16) {
                                l13.add(es0.a.HIDE_WRONG_BODY_TYPE);
                            }
                        }
                    }
                }
                if (fVar.H != null) {
                    l13.add(es0.a.GEN_AI_TOPICS_OPT_OUT);
                    l13.add(es0.a.GEN_AI_STANDALONE_REASON);
                }
                if (!z13) {
                    l13.add(es0.a.REPORT);
                }
                l13.add(es0.a.DIVIDER_WITH_TOP_SPACE);
                return l13;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList l14 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
                if (c() && !z14 && !fVar.f84651z) {
                    l14.add(es0.a.SAVE);
                }
                if (!z14) {
                    l14.add(es0.a.SEND);
                }
                if (z15) {
                    l14.add(es0.a.HIDE);
                }
                l14.add(es0.a.WAISTA);
                if (fVar.E) {
                    l1Var.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) l1Var.f83416a;
                    if (g1Var.o("android_weight_loss_opt_out_option", "enabled", z3Var) || g1Var.l("android_weight_loss_opt_out_option")) {
                        l14.add(es0.a.SEE_FEWER_WEIGHT_LOSS_ADS);
                    }
                }
                if (!z13) {
                    l14.add(es0.a.REPORT);
                }
                ((m60.d) m60.d.a()).e();
                ((m60.d) m60.d.a()).g();
                l14.add(es0.a.DIVIDER_WITH_TOP_SPACE);
                l14.add(es0.a.REASON);
                return l14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z13, jo1.a baseFragmentType, ls0.f viewParams, l1 experiments) {
        super(baseFragmentType, viewParams, experiments);
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f62834e = z13;
    }
}
