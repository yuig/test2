package dv0;

import com.pinterest.api.model.ln0;
import com.pinterest.api.model.m40;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f56296j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f56297k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f56298l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f56299m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f56300n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f56301o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f56302p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f56303q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f56304r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f56305s = new c(9);

    /* renamed from: t, reason: collision with root package name */
    public static final c f56306t = new c(10);

    /* renamed from: u, reason: collision with root package name */
    public static final c f56307u = new c(11);

    /* renamed from: v, reason: collision with root package name */
    public static final c f56308v = new c(12);

    /* renamed from: w, reason: collision with root package name */
    public static final c f56309w = new c(13);

    /* renamed from: x, reason: collision with root package name */
    public static final c f56310x = new c(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56311i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f56311i = i13;
    }

    public final String b(m40 t13) {
        switch (this.f56311i) {
            case 1:
                Intrinsics.checkNotNullParameter(t13, "t");
                return String.valueOf(t13.n());
            case 2:
                Intrinsics.checkNotNullParameter(t13, "t");
                String id3 = t13.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                return id3;
            default:
                Intrinsics.checkNotNullParameter(t13, "t");
                return String.valueOf(t13.n());
        }
    }

    public final String e(String str) {
        switch (this.f56311i) {
            case 8:
                return str == null ? "-1" : str;
            case 9:
            case 10:
            case 11:
                return null;
            default:
                return "-1";
        }
    }

    public final void f(Throwable th3) {
        switch (this.f56311i) {
            case 0:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(th3, "Load Data error", tb0.p.IDEA_ADS);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56311i) {
            case 0:
                f((Throwable) obj);
                return Unit.f80348a;
            case 1:
                return b((m40) obj);
            case 2:
                return b((m40) obj);
            case 3:
                return b((m40) obj);
            case 4:
                f((Throwable) obj);
                return Unit.f80348a;
            case 5:
                f((Throwable) obj);
                return Unit.f80348a;
            case 6:
                Intrinsics.checkNotNullParameter((ln0) obj, "it");
                return Unit.f80348a;
            case 7:
                return Unit.f80348a;
            case 8:
                return e((String) obj);
            case 9:
                return e((String) obj);
            case 10:
                return e((String) obj);
            case 11:
                return e((String) obj);
            case 12:
                return e((String) obj);
            case 13:
                ln0 it = (ln0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            default:
                f((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
