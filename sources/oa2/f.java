package oa2;

import com.pinterest.api.model.wy0;
import kh2.m2;
import kh2.u2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import m60.x0;
import z40.y;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f93878j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f93879k = new f(2);

    /* renamed from: l, reason: collision with root package name */
    public static final f f93880l = new f(3);

    /* renamed from: m, reason: collision with root package name */
    public static final f f93881m = new f(5);

    /* renamed from: n, reason: collision with root package name */
    public static final f f93882n = new f(6);

    /* renamed from: o, reason: collision with root package name */
    public static final f f93883o = new f(7);

    /* renamed from: p, reason: collision with root package name */
    public static final f f93884p = new f(8);

    /* renamed from: q, reason: collision with root package name */
    public static final f f93885q = new f(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93886i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(2);
        this.f93886i = i13;
    }

    public final String b(wy0 user, yk1.v resources) {
        switch (this.f93886i) {
            case 6:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return m2.M0(resources, (String) r.f93955d.invoke(user, resources), ((a) r.f93959h.invoke(user)).f93846c);
            case 7:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return u2.Q(user, resources);
            case 8:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "<anonymous parameter 1>");
                String Z2 = user.Z2();
                if (Z2 == null) {
                    Z2 = user.U2();
                }
                if (Z2 != null) {
                    return Z2;
                }
                String P3 = user.P3();
                return P3 == null ? "" : P3;
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return ((yk1.a) resources).f139224a.getString(x0.accessibility_user_recommendation, r.f93955d.invoke(user, resources), r.f93957f.invoke(user, resources));
        }
    }

    public final String e(y user, yk1.v resources) {
        e eVar = e.f93867q;
        switch (this.f93886i) {
            case 2:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return m2.M0(resources, (String) eVar.invoke(user), ((a) e.f93865o.invoke(user)).f93846c);
            case 3:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                e formatter = e.f93869s;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                Intrinsics.checkNotNullParameter(formatter, "formatter");
                Integer c13 = user.c();
                if (c13 != null) {
                    int intValue = c13.intValue();
                    String quantityString = ((yk1.a) resources).f139224a.getQuantityString(w0.plural_followers_string, intValue, formatter.invoke(Integer.valueOf(intValue)));
                    if (quantityString != null) {
                        return quantityString;
                    }
                }
                return "";
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(resources, "resources");
                return ((yk1.a) resources).f139224a.getString(x0.accessibility_user_recommendation, eVar.invoke(user), f93880l.invoke(user, resources));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f93886i) {
            case 0:
                y user = (y) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user, "user");
                break;
            case 1:
                Intrinsics.checkNotNullParameter((y) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((Function0) obj2, "<anonymous parameter 1>");
                break;
            case 5:
                Intrinsics.checkNotNullParameter((wy0) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((Function0) obj2, "<anonymous parameter 1>");
                break;
        }
        return b((wy0) obj, (yk1.v) obj2);
    }
}
