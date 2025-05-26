package w71;

import android.database.Cursor;
import com.pinterest.feature.search.visual.collage.database.CollageDatabase;
import com.pinterest.feature.search.visual.collage.database.converters.CollageItemTypeConverter$toCollageOverlayItem$itemType$1;
import g1.k;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.Iterator;
import n60.o;
import rl2.g0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f128168a;

    /* renamed from: b, reason: collision with root package name */
    public final zd0.a f128169b;

    /* renamed from: c, reason: collision with root package name */
    public v71.a f128170c;

    /* renamed from: d, reason: collision with root package name */
    public final ae0.b f128171d;

    /* renamed from: e, reason: collision with root package name */
    public final zd0.b f128172e;

    /* renamed from: f, reason: collision with root package name */
    public v71.c f128173f;

    public d(CollageDatabase collageDatabase) {
        this.f128168a = collageDatabase;
        this.f128169b = new zd0.a(this, collageDatabase, 3);
        this.f128171d = new ae0.b(this, collageDatabase, 1);
        this.f128172e = new zd0.b(collageDatabase, 6);
        new zd0.b(collageDatabase, 7);
    }

    public static v71.a a(d dVar) {
        v71.a aVar;
        synchronized (dVar) {
            try {
                if (dVar.f128170c == null) {
                    dVar.f128170c = (v71.a) dVar.f128168a.l(v71.a.class);
                }
                aVar = dVar.f128170c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVar;
    }

    public final synchronized v71.c b() {
        try {
            if (this.f128173f == null) {
                this.f128173f = (v71.c) this.f128168a.l(v71.c.class);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f128173f;
    }

    public final void c(g1.g gVar) {
        g1.c cVar = (g1.c) gVar.keySet();
        g1.g gVar2 = cVar.f63237a;
        if (gVar2.isEmpty()) {
            return;
        }
        if (gVar.f63294c > 999) {
            g0.c0(gVar, true, new a(this, 1));
            return;
        }
        StringBuilder i13 = o.i("SELECT `id`,`overlay_item`,`page_id` FROM `collage_item` WHERE `page_id` IN (");
        int i14 = gVar2.f63294c;
        g0.l(i14, i13);
        i13.append(")");
        f0 d2 = f0.d(i14, i13.toString());
        Iterator it = cVar.iterator();
        int i15 = 1;
        while (true) {
            k kVar = (k) it;
            if (!kVar.hasNext()) {
                break;
            }
            d2.c1(i15, (String) kVar.next());
            i15++;
        }
        Cursor m03 = d7.b.m0(this.f128168a, d2, false);
        try {
            int v13 = b7.c.v(m03, "page_id");
            if (v13 == -1) {
                m03.close();
                return;
            }
            while (m03.moveToNext()) {
                ArrayList arrayList = (ArrayList) gVar.get(m03.getString(v13));
                if (arrayList != null) {
                    String string = m03.getString(0);
                    String string2 = m03.isNull(1) ? null : m03.getString(1);
                    v71.c b13 = b();
                    b13.getClass();
                    z71.i iVar = (z71.i) ((nm.o) b13.f124394c.getValue()).d(string2, new CollageItemTypeConverter$toCollageOverlayItem$itemType$1().f33847b);
                    if (iVar == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.pinterest.feature.search.visual.collage.model.CollageOverlayItems', but it was NULL.");
                    }
                    arrayList.add(new x71.b(iVar, string, m03.getString(2)));
                }
            }
            m03.close();
        } catch (Throwable th3) {
            m03.close();
            throw th3;
        }
    }

    public final void d(g1.g gVar) {
        g1.c cVar = (g1.c) gVar.keySet();
        g1.g gVar2 = cVar.f63237a;
        if (gVar2.isEmpty()) {
            return;
        }
        if (gVar.f63294c > 999) {
            g0.c0(gVar, false, new a(this, 0));
            return;
        }
        StringBuilder i13 = o.i("SELECT `id`,`draft_id`,`background_image` FROM `collage_page` WHERE `draft_id` IN (");
        int i14 = gVar2.f63294c;
        g0.l(i14, i13);
        i13.append(")");
        f0 d2 = f0.d(i14, i13.toString());
        Iterator it = cVar.iterator();
        int i15 = 1;
        while (true) {
            k kVar = (k) it;
            if (!kVar.hasNext()) {
                break;
            }
            d2.c1(i15, (String) kVar.next());
            i15++;
        }
        Cursor m03 = d7.b.m0(this.f128168a, d2, true);
        try {
            int v13 = b7.c.v(m03, "draft_id");
            if (v13 == -1) {
                m03.close();
                return;
            }
            g1.g gVar3 = new g1.g(0);
            while (m03.moveToNext()) {
                String string = m03.getString(0);
                if (!gVar3.containsKey(string)) {
                    gVar3.put(string, new ArrayList());
                }
            }
            m03.moveToPosition(-1);
            c(gVar3);
            while (m03.moveToNext()) {
                String string2 = m03.getString(v13);
                if (gVar.containsKey(string2)) {
                    String string3 = m03.getString(0);
                    String string4 = m03.getString(1);
                    String string5 = m03.isNull(2) ? null : m03.getString(2);
                    v71.c b13 = b();
                    b13.getClass();
                    gVar.put(string2, new x71.e(new x71.c((z71.i) ((nm.o) b13.f124394c.getValue()).d(string5, new CollageItemTypeConverter$toCollageOverlayItem$itemType$1().f33847b), string3, string4), (ArrayList) gVar3.get(m03.getString(0))));
                }
            }
            m03.close();
        } catch (Throwable th3) {
            m03.close();
            throw th3;
        }
    }
}
