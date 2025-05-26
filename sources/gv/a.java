package gv;

import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kl0.z;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import uk1.d;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66155g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Object f66156h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f66157i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d4 d4Var, a4 a4Var, f0 pinalyticsFactory) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f66156h = d4Var;
        this.f66157i = a4Var;
    }

    @Override // uk1.d
    public final a4 i() {
        switch (this.f66155g) {
            case 0:
                return (a4) this.f66157i;
            default:
                return super.i();
        }
    }

    @Override // uk1.d
    public final d4 j() {
        switch (this.f66155g) {
            case 0:
                return (d4) this.f66156h;
            default:
                return super.j();
        }
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        switch (this.f66155g) {
            case 1:
                HashMap f63135d0 = super.getF63135d0();
                if (f63135d0 == null) {
                    f63135d0 = new HashMap();
                }
                z zVar = (z) this.f66156h;
                String str = (String) this.f66157i;
                int i13 = z.f80128e2;
                f63135d0.put("board_id", zVar.n9());
                f63135d0.put("board_session_id", str);
                Navigation navigation = zVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE") : null;
                if (v03 == null) {
                    v03 = "other";
                }
                f63135d0.put("entry_type", v03);
                return f63135d0;
            default:
                return super.getF63135d0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z zVar, String str, f0 f0Var) {
        super(f0Var);
        this.f66156h = zVar;
        this.f66157i = str;
    }
}
