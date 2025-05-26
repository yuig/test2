package qz;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class d implements dl1.s {

    /* renamed from: h */
    public static final List f105380h = Collections.unmodifiableList(Arrays.asList(2, 30, 80, 85, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE)));

    /* renamed from: a */
    public Object f105381a;

    /* renamed from: b */
    public String f105382b;

    /* renamed from: c */
    public String f105383c;

    /* renamed from: d */
    public String f105384d;

    /* renamed from: e */
    public String f105385e;

    /* renamed from: f */
    public final vd0.c f105386f;

    /* renamed from: g */
    public int f105387g;

    public d(vd0.c cVar) {
        this.f105387g = -1;
        if (cVar == null) {
            return;
        }
        this.f105382b = cVar.o("status", "");
        this.f105387g = cVar.j(0, "code");
        this.f105383c = cVar.o("bookmark", "");
        this.f105384d = cVar.o("message", "");
        this.f105385e = cVar.o("message_detail", "");
        this.f105386f = cVar.m("error");
        g(cVar.f125623a.v("data"));
        cVar.c("taxonomy");
        cVar.d("selected_taxonomy");
        String d2 = cVar.d("last_level");
        if (d2 != null) {
            Boolean.parseBoolean(d2);
        }
        vd0.c m13 = cVar.m("sensitivity");
        if (m13 != null) {
        }
        try {
            vd0.c m14 = cVar.m("search_nag");
            m14 = m14 != null ? m14.m("nag") : m14;
            if (m14 != null) {
                vd0.a c13 = m14.c("messages");
                if (c13 != null && c13.d() > 0) {
                    int d13 = c13.d();
                    String str = "";
                    for (int i13 = 0; i13 < d13; i13++) {
                        if (i13 > 0) {
                            str = str + "<br/><br/>";
                        }
                        str = str + c13.l(i13);
                    }
                }
                m14.o("theme", "");
            }
        } catch (Exception e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(e13);
        }
    }

    public final int a() {
        return this.f105387g;
    }

    @Override // dl1.s
    /* renamed from: b */
    public String getId() {
        Object obj = this.f105381a;
        return obj != null ? Integer.toString(obj.hashCode()) : "-1_ABC";
    }

    public final String e() {
        return j1.d1(this.f105385e) ? this.f105385e : this.f105384d;
    }

    public final void g(Object obj) {
        this.f105381a = vd0.c.a(obj);
    }

    public final String toString() {
        return "ApiResponse{_status='" + this.f105382b + "', _code=" + this.f105387g + ", _data=" + this.f105381a + ", _message=" + e() + '}';
    }

    public d() {
        this.f105387g = -1;
    }
}
