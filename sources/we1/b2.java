package we1;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b2 f129285j = new b2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b2 f129286k = new b2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b2 f129287l = new b2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b2 f129288m = new b2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b2 f129289n = new b2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b2 f129290o = new b2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b2 f129291p = new b2(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b2 f129292q = new b2(7);

    /* renamed from: r, reason: collision with root package name */
    public static final b2 f129293r = new b2(8);

    /* renamed from: s, reason: collision with root package name */
    public static final b2 f129294s = new b2(9);

    /* renamed from: t, reason: collision with root package name */
    public static final b2 f129295t = new b2(10);

    /* renamed from: u, reason: collision with root package name */
    public static final b2 f129296u = new b2(11);

    /* renamed from: v, reason: collision with root package name */
    public static final b2 f129297v = new b2(12);

    /* renamed from: w, reason: collision with root package name */
    public static final b2 f129298w = new b2(13);

    /* renamed from: x, reason: collision with root package name */
    public static final b2 f129299x = new b2(14);

    /* renamed from: y, reason: collision with root package name */
    public static final b2 f129300y = new b2(15);

    /* renamed from: z, reason: collision with root package name */
    public static final b2 f129301z = new b2(16);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129302i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i13) {
        super(1);
        this.f129302i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f129302i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    public final List e(List list) {
        switch (this.f129302i) {
            case 2:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.h)) {
                    break;
                } else {
                    break;
                }
            case 6:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.j)) {
                    break;
                } else {
                    break;
                }
            case 9:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.k)) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
        }
        return kotlin.collections.q0.f80391a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        switch (this.f129302i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int generateViewId = View.generateViewId();
                return rn1.a.y(it, null, vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, generateViewId, null, null, null, null, null, false, null, null, 2095081);
            case 1:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                return Boolean.valueOf(view instanceof nx.v);
            case 2:
                return e((List) obj);
            case 3:
                return b((List) obj);
            case 4:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2;
            case 5:
                return Unit.f80348a;
            case 6:
                return e((List) obj);
            case 7:
                return b((List) obj);
            case 8:
                return b((List) obj);
            case 9:
                return e((List) obj);
            case 10:
                return b((List) obj);
            case 11:
                return b((List) obj);
            case 12:
                return e((List) obj);
            case 13:
                return b((List) obj);
            case 14:
                List it3 = (List) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return (gb2.i) d7.b.j0(it3);
            case 15:
                gb2.i it4 = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                wa2.p pVar = it4.f64754b;
                if (pVar == wa2.p.STATE_REPORTED || pVar == wa2.p.STATE_UNFOLLOWED_USER || pVar == wa2.p.STATE_NO_FEEDBACK) {
                    wa2.o oVar = wa2.o.UI_ONLY;
                    wa2.o oVar2 = it4.f64755c;
                    if (oVar2 == oVar || oVar2 == wa2.o.BOTH) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            default:
                return Unit.f80348a;
        }
    }
}
