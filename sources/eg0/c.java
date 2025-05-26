package eg0;

import i32.u;
import i32.w1;
import java.util.ArrayList;
import pk.a0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f58882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58883b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58884c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58885d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58886e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58887f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58888g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58889h;

    /* renamed from: i, reason: collision with root package name */
    public final int f58890i;

    /* renamed from: j, reason: collision with root package name */
    public final int f58891j;

    /* renamed from: k, reason: collision with root package name */
    public final int f58892k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f58893l = new ArrayList();

    public c(vd0.c cVar) {
        this.f58888g = cVar.j(0, "id");
        this.f58882a = cVar.o("title_text", "");
        this.f58883b = cVar.o("description_text", "");
        this.f58884c = cVar.o("dismiss_button_text", "");
        this.f58885d = cVar.o("complete_button_text", "");
        this.f58887f = cVar.o("complete_button_uri", "");
        this.f58889h = cVar.j(u.DONT_COMPLETE_AND_HIDE.value(), "dismiss_action");
        this.f58890i = cVar.j(u.COMPLETE.value(), "complete_action");
        this.f58891j = cVar.j(0, "anchor_to");
        w1 w1Var = w1.IMMEDIATE;
        this.f58892k = cVar.j(w1Var.value(), "display_type");
        cVar.j(w1Var.value(), "display_timer_in_millis");
        this.f58886e = cVar.o("complete_button_aux_data", "");
        vd0.a k13 = cVar.k("thumbnail_urls");
        int d2 = k13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            String l13 = k13.l(i13);
            if (a0.D0(l13)) {
                this.f58893l.add(l13);
            }
        }
    }
}
