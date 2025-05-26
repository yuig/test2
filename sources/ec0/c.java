package ec0;

import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.k;
import sl1.q;
import u50.k0;
import yl1.l;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f58371j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f58372k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f58373l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f58374m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f58375n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f58376o = new c(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58377i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f58377i = i13;
    }

    public final void b(k bind) {
        switch (this.f58377i) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(vn1.c.SUBTLE);
                break;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = View.generateViewId();
                bind.f108891f = 1;
                bind.c(rn1.b.END);
                bind.h(vn1.g.BODY_100);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = le0.h.sensitive_content;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                k0 text = new k0(i13, new ArrayList(0));
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f108886a = text;
                bind.a(e0.b(vn1.b.CENTER));
                bind.b(vn1.c.LIGHT);
                bind.d(e0.b(vn1.e.BOLD));
                bind.h(vn1.g.BODY_200);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58377i) {
            case 0:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f139356i = ga2.d.create_button;
                bind.a(yl1.i.b());
                bind.b(yl1.c.SMALL);
                int i13 = ga2.f.create;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                k0 text = new k0(i13, new ArrayList(0));
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f139348a = text;
                bind.e(fm1.c.GONE);
                break;
            case 1:
                b((k) obj);
                break;
            case 2:
                q bind2 = (q) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.f113218g = View.generateViewId();
                fm1.c visibility = fm1.c.GONE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind2.f113217f = visibility;
                break;
            case 3:
                b((k) obj);
                break;
            case 4:
                om1.q bind3 = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.f96684i = View.generateViewId();
                bind3.e(fm1.c.GONE);
                bind3.c(om1.e.XL);
                bind3.d(om1.f.DEFAULT_LIGHT_GRAY);
                break;
            default:
                b((k) obj);
                break;
        }
        return Unit.f80348a;
    }
}
