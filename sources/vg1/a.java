package vg1;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.e4;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e4 f125785a;

    /* renamed from: b, reason: collision with root package name */
    public int f125786b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125787c;

    public a(e4 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f125785a = experiments;
    }

    public static String a(int i13, f30 f30Var) {
        List l43;
        List l44;
        if (i13 >= 0) {
            if (i13 < ((f30Var == null || (l44 = f30Var.l4()) == null) ? 0 : l44.size())) {
                String id3 = (f30Var == null || (l43 = f30Var.l4()) == null) ? null : (String) CollectionsKt.U(i13, l43);
                if (id3 == null) {
                    String id4 = f30Var != null ? f30Var.getId() : null;
                    return id4 == null ? "" : id4;
                }
                return id3;
            }
        }
        if (f30Var == null || (id3 = f30Var.getId()) == null) {
            return "";
        }
        return id3;
    }
}
