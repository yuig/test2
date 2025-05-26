package android.support.v4.media;

import a.cb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.recyclerview.widget.a2;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.y2;
import c72.o;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.material.datepicker.s;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fj.m;
import fn.g;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.w;
import m60.x0;
import nx.d0;
import pe.i;
import q4.h;
import qf1.e0;
import rx0.f;
import x02.i2;
import x81.h0;
import yb0.k;
import yb0.n;
import yd2.b;
import yd2.e;
import yd2.j;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f15837a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15838b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15839c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15840d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15841e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15842f;

    /* renamed from: g, reason: collision with root package name */
    public Object f15843g;

    /* renamed from: h, reason: collision with root package name */
    public Object f15844h;

    public a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.Y0(fj.c.materialCalendarStyle, context, s.class.getCanonicalName()).data, m.MaterialCalendar);
        this.f15837a = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_dayStyle, 0));
        this.f15843g = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_dayInvalidStyle, 0));
        this.f15838b = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_daySelectedStyle, 0));
        this.f15839c = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList H = d.H(context, obtainStyledAttributes, m.MaterialCalendar_rangeFillColor);
        this.f15840d = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_yearStyle, 0));
        this.f15841e = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_yearSelectedStyle, 0));
        this.f15842f = a0.a.a(context, obtainStyledAttributes.getResourceId(m.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f15844h = paint;
        paint.setColor(H.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public static final void a(a aVar, ae2.d dVar, ae2.d dVar2) {
        j jVar = (j) aVar.f15842f;
        jVar.b(new yd2.c(dVar2));
        jVar.a();
        j jVar2 = (j) aVar.f15843g;
        e readAttachments = new e(dVar);
        jVar2.getClass();
        Intrinsics.checkNotNullParameter(readAttachments, "readAttachments");
        jVar2.f138808c = readAttachments;
        jVar2.f138807b = b.READ;
        jVar2.a();
        i.J(new com.pinterest.xrenderer.legacy.multipass_processing.b(aVar, dVar, dVar2, 0), "copy offscreen color texture to view surface");
    }

    public static final void b(a aVar, com.pinterest.xrenderer.legacy.multipass_processing.e eVar, ae2.d dVar, ae2.d dVar2, ae2.d dVar3) {
        aVar.getClass();
        String tag = eVar.f52876a.f117472a + '#' + eVar.f52877b;
        h block = new h(aVar, dVar3, eVar, dVar, dVar2, 11);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
    }

    public static a e(g gVar, String str, ArrayList arrayList) {
        fn.a aVar = fn.a.NATIVE;
        a aVar2 = new a();
        ArrayList arrayList2 = new ArrayList();
        aVar2.f15840d = arrayList2;
        aVar2.f15841e = new HashMap();
        aVar2.f15838b = gVar;
        aVar2.f15839c = null;
        aVar2.f15837a = str;
        aVar2.f15844h = aVar;
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fn.h hVar = (fn.h) it.next();
            ((Map) aVar2.f15841e).put(UUID.randomUUID().toString(), hVar);
        }
        aVar2.f15843g = "pinterest.com";
        aVar2.f15842f = null;
        return aVar2;
    }

    public final void c() {
        a2 a2Var;
        Iterator it = ((List) this.f15841e).iterator();
        while (true) {
            if (!it.hasNext()) {
                a2Var = a2.ALLOW;
                break;
            }
            i1 i1Var = (i1) it.next();
            a2 a2Var2 = i1Var.f19449c.f19333c;
            a2Var = a2.PREVENT;
            if (a2Var2 == a2Var || (a2Var2 == a2.PREVENT_WHEN_EMPTY && i1Var.f19451e == 0)) {
                break;
            }
        }
        Object obj = this.f15837a;
        if (a2Var != ((l) obj).f19333c) {
            l lVar = (l) obj;
            lVar.f19333c = a2Var;
            lVar.f19331a.g();
        }
    }

    public final int d(i1 i1Var) {
        i1 i1Var2;
        Iterator it = ((List) this.f15841e).iterator();
        int i13 = 0;
        while (it.hasNext() && (i1Var2 = (i1) it.next()) != i1Var) {
            i13 += i1Var2.f19451e;
        }
        return i13;
    }

    public final void f(Context context) {
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        new kk2.m(((i2) this.f15839c).L((String) this.f15837a).s(), new t81.a(8, new f(j0Var, j0Var2, this, 19)), 0).l(tk2.e.f118017c).k(new t81.a(9, i91.g.f71826m)).l(wj2.c.a()).o(new h0(11, new aw0.j(j0Var, j0Var2, this, context, 12)), new h0(12, new j41.i(this, 23)));
    }

    public final androidx.appcompat.widget.a g(int i13) {
        androidx.appcompat.widget.a aVar;
        Object obj = this.f15842f;
        if (((androidx.appcompat.widget.a) obj).f16503b) {
            aVar = new androidx.appcompat.widget.a();
        } else {
            ((androidx.appcompat.widget.a) obj).f16503b = true;
            aVar = (androidx.appcompat.widget.a) obj;
        }
        Iterator it = ((List) this.f15841e).iterator();
        int i14 = i13;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i1 i1Var = (i1) it.next();
            int i15 = i1Var.f19451e;
            if (i15 > i14) {
                aVar.f16504c = i1Var;
                aVar.f16502a = i14;
                break;
            }
            i14 -= i15;
        }
        if (((i1) aVar.f16504c) != null) {
            return aVar;
        }
        throw new IllegalArgumentException(a.a.d("Cannot find wrapper for ", i13));
    }

    public final i1 h(y2 y2Var) {
        i1 i1Var = (i1) ((IdentityHashMap) this.f15840d).get(y2Var);
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + y2Var + ", seems like it is not bound by this adapter: " + this);
    }

    public final void i(f30 f30Var, String subtitle, xj2.b disposables, boolean z13) {
        n a13;
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        ((d0) this.f15839c).X(u0.REMOVE_SPONSORSHIP_OPTION);
        int i13 = n.f138503p;
        Context context = (Context) this.f15838b;
        a13 = xa0.j.a(context, bs1.c.d2(context, q82.a.sponsored_pins_remove_partnership_alert_title), subtitle, bs1.c.d2((Context) this.f15838b, x0.remove), (r20 & 16) != 0 ? "" : bs1.c.d2((Context) this.f15838b, x0.cancel), (r20 & 32) != 0 ? k.f138491j : new e0(this, f30Var, disposables, z13), (r20 & 64) != 0 ? k.f138492k : new o(this, 24), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        cb.x(a13, (w) this.f15837a);
    }

    public final int j(b2 b2Var) {
        int size = ((List) this.f15841e).size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((i1) ((List) this.f15841e).get(i13)).f19449c == b2Var) {
                return i13;
            }
        }
        return -1;
    }
}
