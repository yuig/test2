package z9;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f141146j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f141147k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f141148l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f141149m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f141150n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f141151o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f141152p = new b(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b f141153q = new b(7);

    /* renamed from: r, reason: collision with root package name */
    public static final b f141154r = new b(8);

    /* renamed from: s, reason: collision with root package name */
    public static final b f141155s = new b(9);

    /* renamed from: t, reason: collision with root package name */
    public static final b f141156t = new b(10);

    /* renamed from: u, reason: collision with root package name */
    public static final b f141157u = new b(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f141158i = i13;
    }

    public final Context b(Context it) {
        switch (this.f141158i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    break;
                }
                break;
        }
        return ((ContextWrapper) it).getBaseContext();
    }

    public final z e(z destination) {
        switch (this.f141158i) {
            case 3:
                Intrinsics.checkNotNullParameter(destination, "destination");
                b0 b0Var = destination.f141323b;
                if (b0Var == null || b0Var.f141161l != destination.f141329h) {
                    return null;
                }
                return b0Var;
            case 4:
                Intrinsics.checkNotNullParameter(destination, "destination");
                b0 b0Var2 = destination.f141323b;
                if (b0Var2 == null || b0Var2.f141161l != destination.f141329h) {
                    return null;
                }
                return b0Var2;
            case 5:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(destination, "it");
                if (!(destination instanceof b0)) {
                    return null;
                }
                b0 b0Var3 = (b0) destination;
                return b0Var3.s(b0Var3.f141161l, true);
            case 7:
                Intrinsics.checkNotNullParameter(destination, "it");
                return destination.f141323b;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f141158i;
        switch (i13) {
            case 0:
                return b((Context) obj);
            case 1:
                return b((Context) obj);
            case 2:
                h0 navOptions = (h0) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                        navOptions.f141202c = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                        navOptions.f141201b = true;
                        break;
                }
                return Unit.f80348a;
            case 3:
                return e((z) obj);
            case 4:
                return e((z) obj);
            case 5:
                d anim = (d) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f141175a = 0;
                anim.f141176b = 0;
                return Unit.f80348a;
            case 6:
                t0 popUpTo = (t0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f141290a = true;
                return Unit.f80348a;
            case 7:
                return e((z) obj);
            case 8:
                return e((z) obj);
            case 9:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 10:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag(u0.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (p) ((WeakReference) tag).get();
                }
                if (tag instanceof p) {
                    return (p) tag;
                }
                return null;
            default:
                h0 navOptions2 = (h0) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                        navOptions2.f141202c = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                        navOptions2.f141201b = true;
                        break;
                }
                return Unit.f80348a;
        }
    }
}
