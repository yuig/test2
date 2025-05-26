package a11;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import lh0.z3;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f334a = n1.f83436b.c();

    public static boolean a(f30 f30Var) {
        return !(f30Var != null ? Intrinsics.d(f30Var.d5(), Boolean.TRUE) : false);
    }

    public static boolean b(f30 f30Var) {
        return (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE)) && hf0.b.q();
    }

    public static boolean c(f30 f30Var) {
        if (f30Var != null && Intrinsics.d(f30Var.d5(), Boolean.TRUE)) {
            return false;
        }
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        n1 n1Var = f334a;
        n1Var.getClass();
        Intrinsics.checkNotNullParameter("enabled_letterbox_visit_cta", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        z0 z0Var = n1Var.f83439a;
        if (!((g1) z0Var).k("closeup_redesign_letterboxing_and_visit_cta_android", "enabled_letterbox_visit_cta", activate)) {
            Intrinsics.checkNotNullParameter("enabled_letterbox_shop_now_cta", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((g1) z0Var).k("closeup_redesign_letterboxing_and_visit_cta_android", "enabled_letterbox_shop_now_cta", activate)) {
                return false;
            }
        }
        return true;
    }
}
