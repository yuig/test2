package od1;

import a.z0;
import androidx.fragment.app.FragmentActivity;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f94156j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i13) {
        super(0);
        this.f94155i = i13;
        this.f94156j = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f94155i;
        t tVar = this.f94156j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.i0(null, tVar.f94175a1, tVar.Z0, "");
            default:
                Set set = pd1.c.f99804a;
                qa2.e v13 = kh2.r.v1(g4.u.y0(), new z0(tVar, 10));
                n5 n5Var = tVar.L0;
                if (n5Var == null) {
                    Intrinsics.r("mvpGridViewsHelperFactory");
                    throw null;
                }
                FragmentActivity requireActivity = tVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return n5Var.a(requireActivity, tVar, v13.a(), (h32.i0) tVar.R0.getValue());
        }
    }
}
