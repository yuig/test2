package xt;

import android.graphics.Color;
import android.text.TextUtils;
import com.pinterest.ads.feature.owc.presenter.showcase.ShowcaseException;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.st;
import h32.c1;
import h32.f1;
import h32.p2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh2.m2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import t3.s1;
import tb0.p;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f135858a;

    /* renamed from: b, reason: collision with root package name */
    public final es.h f135859b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f135860c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f135861d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f135862e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f135863f;

    /* renamed from: g, reason: collision with root package name */
    public int f135864g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f135865h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f135866i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f135867j;

    /* renamed from: k, reason: collision with root package name */
    public List f135868k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f135869l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f135870m;

    /* renamed from: n, reason: collision with root package name */
    public d f135871n;

    /* renamed from: o, reason: collision with root package name */
    public f30 f135872o;

    /* renamed from: p, reason: collision with root package name */
    public long f135873p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f135874q;

    /* renamed from: r, reason: collision with root package name */
    public final uk2.d f135875r;

    /* renamed from: s, reason: collision with root package name */
    public final uk2.d f135876s;

    public f(d0 pinalytics, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f135858a = pinalytics;
        this.f135859b = adsCommonDisplay;
        this.f135862e = new ArrayList();
        this.f135863f = new HashMap();
        this.f135865h = true;
        this.f135868k = new ArrayList();
        this.f135871n = d.NONE;
        this.f135875r = s1.h("create(...)");
        this.f135876s = s1.h("create(...)");
    }

    public static c1 a(f30 f30Var, f30 f30Var2, f30 f30Var3) {
        p2 p2Var;
        Long l13;
        Long l14;
        Long l15;
        String id3;
        String id4;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if (f30Var != null) {
            String id5 = f30Var.getId();
            String str = null;
            if (id5 == null || !TextUtils.isDigitsOnly(id5)) {
                l13 = null;
            } else {
                String id6 = f30Var.getId();
                Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                l13 = Long.valueOf(Long.parseLong(id6));
            }
            if (f30Var2 == null || (id4 = f30Var2.getId()) == null || !TextUtils.isDigitsOnly(id4)) {
                l14 = null;
            } else {
                String id7 = f30Var2.getId();
                Intrinsics.checkNotNullExpressionValue(id7, "getUid(...)");
                l14 = Long.valueOf(Long.parseLong(id7));
            }
            if (f30Var3 == null || (id3 = f30Var3.getId()) == null || !TextUtils.isDigitsOnly(id3)) {
                l15 = null;
            } else {
                String id8 = f30Var3.getId();
                Intrinsics.checkNotNullExpressionValue(id8, "getUid(...)");
                l15 = Long.valueOf(Long.parseLong(id8));
            }
            String id9 = f30Var.getId();
            if (f30Var3 != null) {
                str = f30Var3.z4();
            } else if (f30Var2 != null) {
                str = f30Var2.z4();
            }
            p2Var = new p2(l14, l15, str, id9, l13);
        } else {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(new ShowcaseException(), "createSubpinEventData cannot have a null parentPagePin", p.SHOWCASE_ADS);
            p2Var = null;
        }
        return new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, p2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static int b(f fVar, int i13) {
        fVar.getClass();
        float[] fArr = new float[3];
        Color.colorToHSV(i13, fArr);
        if (fArr[1] > 0.1f) {
            fArr[1] = 0.1f;
        }
        fArr[2] = 0.95f;
        return Color.HSVToColor(fArr);
    }

    public static boolean d(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        md O3 = pin.O3();
        return (O3 != null ? O3.m() : null) != null;
    }

    public static ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            st stVar = (st) it.next();
            e30 r33 = f30.r3();
            r33.n1(stVar.r());
            r33.j0(stVar.o());
            r33.q2(stVar.w());
            String s13 = stVar.s();
            if (s13 == null) {
                s13 = "";
            }
            r33.x2(s13);
            f30 a13 = r33.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            arrayList.add(a13);
        }
        return arrayList;
    }

    public final f30 c() {
        return this.f135860c;
    }

    public final void f(boolean z13, boolean z14) {
        boolean isEmpty = this.f135862e.isEmpty();
        uk2.d dVar = this.f135875r;
        if (isEmpty) {
            dVar.c(new h("ERROR: pages cannot be empty"));
            return;
        }
        if (this.f135861d == null) {
            dVar.c(new h("ERROR: parent page cannot be null"));
            return;
        }
        if (this.f135864g > this.f135862e.size()) {
            dVar.c(new h("ERROR: page index cannot exceed pages size"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f135862e.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            arrayList.add(new pt.a((f30) next, i13 == this.f135864g));
            i13 = i14;
        }
        f30 f30Var = ((pt.a) arrayList.get(this.f135864g)).f101326a;
        this.f135860c = f30Var;
        if (f30Var != null) {
            Object orDefault = this.f135863f.getOrDefault(f30Var.getId(), q0.f80391a);
            Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
            List y03 = CollectionsKt.y0((Iterable) orDefault, 3);
            if (f30Var.i4() != null) {
                this.f135870m = Integer.valueOf(Color.parseColor(f30Var.i4()));
            }
            Integer num = this.f135870m;
            Integer num2 = this.f135869l;
            if (num2 != null) {
                num = Integer.valueOf(num2.intValue());
            }
            Integer num3 = num;
            Integer num4 = this.f135870m;
            this.f135869l = num4;
            f30 f30Var2 = this.f135861d;
            int i15 = this.f135864g;
            f30 f30Var3 = this.f135860c;
            boolean z15 = this.f135865h;
            boolean z16 = this.f135867j && !this.f135866i;
            ArrayList arrayList2 = new ArrayList();
            f30 f30Var4 = this.f135861d;
            es.h hVar = this.f135859b;
            List X0 = f30Var4 != null ? m2.X0(f30Var4, hVar) : null;
            m21.a aVar = X0 != null ? (m21.a) X0.get(0) : null;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            Iterator it2 = this.f135868k.iterator();
            while (it2.hasNext()) {
                List X02 = m2.X0((f30) it2.next(), hVar);
                es.h hVar2 = hVar;
                if (!X02.isEmpty()) {
                    arrayList2.add(X02.get(0));
                }
                hVar = hVar2;
            }
            if (this.f135868k.size() > 0) {
                this.f135867j = true;
            }
            dVar.c(new i(f30Var2, arrayList, i15, f30Var3, y03, num3, num4, z15, z13, z16, z14, arrayList2));
            if (this.f135864g != 0 && !z13 && z14) {
                this.f135858a.u(f1.SHOWCASE_SUBPAGE_CLOSEUP, f30Var.getId(), a(this.f135861d, f30Var, null), null, false);
            }
            if (this.f135865h) {
                this.f135865h = false;
            }
        }
    }

    public final void g(int i13, boolean z13) {
        int i14 = this.f135864g;
        if (i14 == i13) {
            return;
        }
        boolean z14 = i13 > i14;
        this.f135864g = i13;
        f(z13, true);
        if (z13 && i13 != 0) {
            f1 f1Var = z14 ? f1.SHOWCASE_SUBPAGE_SWIPE_RIGHT : f1.SHOWCASE_SUBPAGE_SWIPE_LEFT;
            f30 f30Var = this.f135861d;
            this.f135858a.u(f1Var, f30Var != null ? f30Var.getId() : null, a(this.f135861d, this.f135860c, null), null, false);
        }
        this.f135876s.c(Boolean.FALSE);
    }
}
