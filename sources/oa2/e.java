package oa2;

import a.cb;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z40.w;
import z40.y;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93877i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f93860j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f93861k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f93862l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f93863m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f93864n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f93865o = new e(6);

    /* renamed from: p, reason: collision with root package name */
    public static final e f93866p = new e(7);

    /* renamed from: q, reason: collision with root package name */
    public static final e f93867q = new e(8);

    /* renamed from: r, reason: collision with root package name */
    public static final e f93868r = new e(9);

    /* renamed from: s, reason: collision with root package name */
    public static final e f93869s = new e(10);

    /* renamed from: t, reason: collision with root package name */
    public static final e f93870t = new e(11);

    /* renamed from: u, reason: collision with root package name */
    public static final e f93871u = new e(12);

    /* renamed from: v, reason: collision with root package name */
    public static final e f93872v = new e(13);

    /* renamed from: w, reason: collision with root package name */
    public static final e f93873w = new e(14);

    /* renamed from: x, reason: collision with root package name */
    public static final e f93874x = new e(15);

    /* renamed from: y, reason: collision with root package name */
    public static final e f93875y = new e(16);

    /* renamed from: z, reason: collision with root package name */
    public static final e f93876z = new e(17);
    public static final e A = new e(18);
    public static final e B = new e(19);
    public static final e C = new e(20);
    public static final e D = new e(21);
    public static final e E = new e(22);
    public static final e F = new e(23);
    public static final e G = new e(24);
    public static final e H = new e(25);
    public static final e I = new e(26);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f93877i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f93877i) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_HORIZONTAL), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
    }

    public final void e(Throwable th3) {
        switch (this.f93877i) {
            case 1:
                break;
            case 2:
                th3.getMessage();
                xk2.f.b(th3);
                break;
            case 18:
                break;
            case 19:
                th3.getMessage();
                break;
            default:
                th3.getMessage();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String R2;
        Map e13;
        Collection values;
        int i13 = this.f93877i;
        switch (i13) {
            case 0:
                return Unit.f80348a;
            case 1:
                e((Throwable) obj);
                return Unit.f80348a;
            case 2:
                e((Throwable) obj);
                return Unit.f80348a;
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                return Unit.f80348a;
            case 4:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                switch (i13) {
                    case 4:
                        return new HashMap();
                    default:
                        return new HashMap();
                }
            case 5:
                Intrinsics.checkNotNullParameter((y) obj, "it");
                return Unit.f80348a;
            case 6:
                y user = (y) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                String b13 = user.b();
                String str = b13 == null ? "" : b13;
                String f13 = user.f();
                return new a(0, str, (f13 == null || (R2 = dl2.b.R2(f13)) == null) ? "" : R2, user.a(), false);
            case 7:
                y user2 = (y) obj;
                Intrinsics.checkNotNullParameter(user2, "user");
                List n13 = user2.n();
                if (n13 == null) {
                    return q0.f80391a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = n13.iterator();
                while (it.hasNext()) {
                    String a13 = ((w) it.next()).a();
                    if (a13 != null) {
                        arrayList.add(a13);
                    }
                }
                return arrayList;
            case 8:
                y user3 = (y) obj;
                Intrinsics.checkNotNullParameter(user3, "user");
                String f14 = user3.f();
                return f14 == null ? "" : f14;
            case 9:
                y user4 = (y) obj;
                Intrinsics.checkNotNullParameter(user4, "user");
                Boolean j13 = user4.j();
                if (j13 != null && j13.booleanValue()) {
                    return new Pair(Integer.valueOf(sm1.b.ic_lock_gestalt), Integer.valueOf(eo1.b.color_themed_text_default));
                }
                Boolean h10 = user4.h();
                return (h10 == null || !h10.booleanValue()) ? new Pair(0, null) : new Pair(Integer.valueOf(sm1.b.ic_check_circle_gestalt), Integer.valueOf(eo1.b.color_blue_500));
            case 10:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 10:
                        return qb0.j.b(intValue);
                    default:
                        return qb0.j.b(intValue);
                }
            case 11:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, bs1.c.h2(""), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
            case 12:
                return b((rn1.a) obj);
            case 13:
                return b((rn1.a) obj);
            case 14:
                return b((rn1.a) obj);
            case 15:
                return b((rn1.a) obj);
            case 16:
                return b((rn1.a) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                e((Throwable) obj);
                return Unit.f80348a;
            case 19:
                e((Throwable) obj);
                return Unit.f80348a;
            case 20:
                e((Throwable) obj);
                return Unit.f80348a;
            case 21:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                return Unit.f80348a;
            case 22:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                switch (i13) {
                    case 4:
                        return new HashMap();
                    default:
                        return new HashMap();
                }
            case 23:
                wy0 user5 = (wy0) obj;
                Intrinsics.checkNotNullParameter(user5, "user");
                String u03 = dl2.b.u0(user5);
                String M0 = dl2.b.M0(user5);
                boolean z13 = dl2.b.W1(user5) && !user5.O3().booleanValue();
                String id3 = user5.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                Integer q23 = user5.q2();
                Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                return new a(q23.intValue(), u03, M0, id3, z13);
            case 24:
                wy0 user6 = (wy0) obj;
                Intrinsics.checkNotNullParameter(user6, "user");
                if (!dl2.b.Z0(user6).isEmpty()) {
                    return dl2.b.Z0(user6);
                }
                b90 f43 = user6.f4();
                if (f43 != null && (e13 = f43.e()) != null && (values = e13.values()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        String j14 = ((sr) it3.next()).j();
                        if (j14 != null) {
                            arrayList2.add(j14);
                        }
                    }
                    List subList = arrayList2.subList(0, 1);
                    if (subList != null) {
                        return subList;
                    }
                }
                return q0.f80391a;
            case 25:
                wy0 user7 = (wy0) obj;
                Intrinsics.checkNotNullParameter(user7, "user");
                Boolean J3 = user7.J3();
                Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
                return J3.booleanValue() ? new Pair(Integer.valueOf(sm1.b.ic_lock_gestalt), Integer.valueOf(eo1.b.color_themed_icon_default)) : cb.y(user7, "getIsVerifiedMerchant(...)") ? new Pair(Integer.valueOf(sm1.b.ic_check_circle_gestalt), Integer.valueOf(eo1.b.color_blue_500)) : dl2.b.W1(user7) ? new Pair(Integer.valueOf(sm1.b.ic_check_circle_gestalt), Integer.valueOf(eo1.b.color_themed_base_red_300)) : new Pair(0, null);
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 10:
                        return qb0.j.b(intValue2);
                    default:
                        return qb0.j.b(intValue2);
                }
        }
    }
}
