package tp;

import android.content.Context;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import so.oa;

/* loaded from: classes3.dex */
public final class e extends rk2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118730c;

    public /* synthetic */ e(Object obj, int i13) {
        this.f118729b = i13;
        this.f118730c = obj;
    }

    @Override // uj2.d
    public final void a() {
        switch (this.f118729b) {
            case 0:
                g gVar = (g) this.f118730c;
                gVar.f118738f.b(new rp0.b(gVar.f118734b));
                a.c.y(u.f85943a);
                break;
        }
    }

    @Override // uj2.d
    public final void onError(Throwable error) {
        switch (this.f118729b) {
            case 0:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(error.getMessage());
                return;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                se2.a aVar = ((PinCloseupFragment) this.f118730c).Z0;
                if (aVar != null) {
                    ((i92.k) ((bf2.b) aVar).get()).i(error.getMessage());
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
        }
    }
}
