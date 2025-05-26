package vo;

import com.pinterest.activity.PinterestActivity;
import hs1.y;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;

/* loaded from: classes.dex */
public final class o extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f126375e;

    public o(PinterestActivity pinterestActivity) {
        this.f126374d = 0;
        this.f126375e = pinterestActivity;
    }

    @Override // hb0.c
    public final void c() {
        int i13 = this.f126374d;
        Object obj = this.f126375e;
        switch (i13) {
            case 0:
                g1 g1Var = ((PinterestActivity) obj).f34816i;
                if (g1Var != null) {
                    g1Var.n();
                    return;
                } else {
                    Intrinsics.r("experimentsManager");
                    throw null;
                }
            case 1:
                ((Runnable) obj).run();
                return;
            default:
                rd.c cVar = ((y) obj).f70082b;
                if (cVar != null) {
                    cVar.l(new td.t("http://i.pinimg.com/img_not_exists"));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, hb0.a aVar, int i13) {
        super(aVar);
        this.f126374d = i13;
        this.f126375e = obj;
    }
}
