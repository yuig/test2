package wi0;

import android.content.Context;
import ck2.i;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.xk;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.j;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.u;
import nx.d0;
import uk1.d;
import x02.x2;
import xi0.f;
import xo0.o;

/* loaded from: classes5.dex */
public class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f129998a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f129999b;

    /* renamed from: c, reason: collision with root package name */
    public final o f130000c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130001d;

    /* renamed from: e, reason: collision with root package name */
    public xk f130002e;

    /* renamed from: f, reason: collision with root package name */
    public int f130003f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f130004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d presenterPinalytics, x2 x2Var, String str, int i13) {
        super(0);
        x2Var = (i13 & 2) != 0 ? null : x2Var;
        str = (i13 & 8) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f129998a = presenterPinalytics;
        this.f129999b = x2Var;
        this.f130000c = null;
        this.f130001d = str;
        this.f130003f = -1;
    }

    @Override // yk1.b
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public void r3(vi0.b view) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        xk xkVar = this.f130002e;
        if (xkVar == null) {
            return;
        }
        String n13 = xkVar.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
        List e13 = xkVar.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getLargeCoverImageList(...)");
        view.j1(new vi0.c(n13, e13, n10.b.d(xkVar, n10.b.f88918a), xkVar.k()));
        view.c(xkVar.l());
        x2 x2Var = this.f129999b;
        if (x2Var != null) {
            String str = xkVar.f43721m;
            if (str != null) {
                xj2.c F = x2Var.L(str).F(new dh0.a(19, new a(view, 0)), new dh0.a(20, new a(view, 1)), i.f27923c, i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
                unit2 = Unit.f80348a;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                view.f();
            }
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            view.f();
        }
        xk xkVar2 = this.f130002e;
        view.U2(xkVar2 != null ? xkVar2.n() : null);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((f) view).f135011h = this;
    }

    public void q3() {
        HashMap hashMap;
        String url;
        String uid;
        d0 d0Var = this.f129998a.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        HashMap hashMap2 = this.f130004g;
        if (hashMap2 != null) {
            xk xkVar = this.f130002e;
            if (xkVar != null && (uid = xkVar.getUid()) != null) {
            }
            hashMap2.put("grid_index", String.valueOf(this.f130003f));
            String str = this.f130001d;
            if (str != null) {
                hashMap2.put("story_type", str);
            }
            Unit unit = Unit.f80348a;
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        d0.B(d0Var, null, null, null, hashMap, 21);
        xk xkVar2 = this.f130002e;
        if (xkVar2 != null) {
            ih ihVar = xkVar2.f43728t;
            if (ihVar != null && (url = ihVar.e()) != null) {
                Pair[] pairArr = new Pair[2];
                HashMap hashMap3 = this.f130004g;
                pairArr[0] = new Pair("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", hashMap3 != null ? (String) hashMap3.get("entered_query") : null);
                pairArr[1] = new Pair("com.pinterest.EXTRA_SEARCH_ARTICLE", xkVar2.getUid());
                HashMap f13 = z0.f(pairArr);
                f fVar = (f) ((vi0.b) getView());
                fVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                l D = fVar.D();
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                l.b(D, context, url, false, false, null, f13, 92);
                r8 = Unit.f80348a;
            }
            if (r8 == null) {
                u.f85943a.d(Navigation.z0((ScreenLocation) j.f50997a.getValue(), xkVar2.getUid()));
            }
        }
    }

    public Object r3() {
        o oVar;
        xk xkVar = this.f130002e;
        if (xkVar == null || (oVar = this.f130000c) == null) {
            return null;
        }
        oVar.a(xkVar);
        return null;
    }

    public Object s3() {
        o oVar;
        xk xkVar = this.f130002e;
        if (xkVar == null || (oVar = this.f130000c) == null) {
            return null;
        }
        oVar.b(this.f130003f, xkVar);
        return null;
    }
}
