package bu1;

import com.pinterest.nav.fragment.DeepLinkFragment;
import h32.f1;
import h32.i0;
import h32.w0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements he0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeepLinkFragment f23902a;

    public a(DeepLinkFragment deepLinkFragment) {
        this.f23902a = deepLinkFragment;
    }

    @Override // he0.a
    public final w0 a(f1 et2, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(et2, "et");
        DeepLinkFragment deepLinkFragment = this.f23902a;
        return deepLinkFragment.s7().U(deepLinkFragment.generateLoggingContext(), et2, str, null, null, z13);
    }

    @Override // he0.a
    public final w0 b(i0 i0Var, f1 et2, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return this.f23902a.s7().U(i0Var, et2, str, null, hashMap, z13);
    }
}
