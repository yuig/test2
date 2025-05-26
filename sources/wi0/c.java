package wi0;

import android.content.Context;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.xk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import uk1.d;
import vn1.g;
import x02.x2;
import xi0.h;
import xi0.i;
import yk1.n;
import yn2.c0;
import z32.o;

/* loaded from: classes5.dex */
public final class c extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f130005a;

    /* renamed from: b, reason: collision with root package name */
    public final j f130006b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f130007c;

    /* renamed from: d, reason: collision with root package name */
    public String f130008d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f130009e;

    /* renamed from: f, reason: collision with root package name */
    public List f130010f;

    /* renamed from: g, reason: collision with root package name */
    public ih f130011g;

    /* renamed from: h, reason: collision with root package name */
    public b42.c f130012h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f130013i;

    /* renamed from: j, reason: collision with root package name */
    public String f130014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d presenterPinalytics, j storyImpressionHelper, x2 x2Var) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        this.f130005a = presenterPinalytics;
        this.f130006b = storyImpressionHelper;
        this.f130007c = x2Var;
        this.f130008d = "";
        this.f130010f = q0.f80391a;
        this.f130012h = b42.c.EVEN_BLOCK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, android.view.ViewGroup, xi0.i] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View, xi0.a] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v1, types: [yk1.j] */
    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        g21.a aVar;
        ?? aVar2;
        vi0.d view = (vi0.d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        ?? r122 = (i) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        r122.f135019c = this;
        ih ihVar = this.f130011g;
        if (ihVar != null) {
            String g13 = ihVar.g();
            Intrinsics.checkNotNullExpressionValue(g13, "getActionText(...)");
            String e13 = ihVar.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getActionDeepLink(...)");
            o c13 = ihVar.c();
            Intrinsics.checkNotNullExpressionValue(c13, "getActionButtonStyle(...)");
            aVar = new g21.a(g13, e13, c13);
        } else {
            aVar = null;
        }
        int i13 = 0;
        r122.f135021e.d(new h(aVar, i13));
        if (aVar != null) {
            r122.f135020d = aVar.f63387i;
        }
        List list = this.f130010f;
        ArrayList presenters = new ArrayList(g0.q(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            xk article = (xk) obj;
            b bVar = new b(this.f130005a, this.f130007c, null, 12);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = this.f130013i;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            Intrinsics.checkNotNullParameter(article, "article");
            bVar.f130002e = article;
            bVar.f130003f = i14;
            bVar.f130004g = hashMap;
            presenters.add(bVar);
            i14 = i15;
        }
        Intrinsics.checkNotNullParameter(presenters, "presenters");
        Iterator it = presenters.iterator();
        int i16 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                f0.p();
                throw null;
            }
            b bVar2 = (b) next;
            if (presenters.size() < r122.getChildCount()) {
                aVar2 = r122.getChildAt(i16);
            } else {
                Context context = r122.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                aVar2 = new xi0.a(context);
                aVar2.Y(g.UI_400);
                r122.addView(aVar2, r122.getChildCount() - 1);
                r122.a(aVar2);
            }
            yk1.j.a().d(aVar2, bVar2);
            aVar2.setVisibility(0);
            i16 = i17;
        }
        b42.c pattern = this.f130012h;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        List t13 = c0.t(d7.b.O(r122));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : t13) {
            if (obj2 instanceof xi0.a) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i18 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            xi0.a aVar3 = (xi0.a) next2;
            int i19 = xi0.g.f135015a[pattern.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    aVar3.X(1.0f);
                    aVar3.Y(g.UI_400);
                    r122.a(aVar3);
                } else if (i13 % 3 == 0) {
                    aVar3.X(0.5f);
                    aVar3.Y(g.UI_400);
                    r122.b(aVar3);
                } else {
                    aVar3.X(1.0f);
                    aVar3.Y(g.UI_400);
                    r122.a(aVar3);
                }
            } else if (i13 % 3 == 0) {
                aVar3.X(1.0f);
                aVar3.Y(g.HEADING_XL);
                r122.b(aVar3);
            } else {
                aVar3.X(1.0f);
                aVar3.Y(g.UI_400);
                r122.a(aVar3);
            }
            i13 = i18;
        }
    }
}
