package dr;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import e0.t;
import java.util.ArrayList;
import java.util.HashSet;
import m60.w;
import q8.m0;
import v.z1;

/* loaded from: classes3.dex */
public final class j extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f56183d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f56185f;

    public j(w wVar, lz1.a aVar) {
        this.f56184e = aVar;
        this.f56185f = wVar;
    }

    @Override // hb0.c
    public final void c() {
        int i13 = this.f56183d;
        Object obj = this.f56185f;
        Object obj2 = this.f56184e;
        switch (i13) {
            case 0:
                try {
                    z1.a((z1) obj, (vd0.a) obj2);
                    break;
                } catch (SecurityException unused) {
                    z1 z1Var = (z1) obj;
                    z1Var.getClass();
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.h("Contacts permission denied.");
                    TypeAheadItem typeAheadItem = new TypeAheadItem();
                    typeAheadItem.f35145f = er.c.CONTACT_NOT_FOUND_MISSING_PERMISSION;
                    typeAheadItem.f35142c = ((k) z1Var.f123758c).f56199n.getString(w42.c.contacts_search_place_holder);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(typeAheadItem);
                    ((k) z1Var.f123758c).a((String) z1Var.f123757b, arrayList, null);
                    return;
                }
            default:
                boolean z13 = true;
                if (t.f56753k) {
                    lz1.c cVar = (lz1.c) ((lz1.a) obj2);
                    cVar.f85179a.h("PREF_SENT_MESSAGE_COUNT", cVar.f85179a.g("PREF_SENT_MESSAGE_COUNT", 0) + 1);
                }
                if (t.f56752j) {
                    lz1.c cVar2 = (lz1.c) ((lz1.a) obj2);
                    cVar2.f85179a.h("PREF_SHARED_EXTERNALLY_COUNT", cVar2.f85179a.g("PREF_SHARED_EXTERNALLY_COUNT", 0) + 1);
                }
                if (t.f56750h) {
                    if (t.f56752j || t.f56753k || t.f56754l) {
                        ((w) obj).d(new m0(true));
                        ((lz1.c) ((lz1.a) obj2)).f85179a.i("PREF_POST_CREATE_UPSELL_DISMISSED", false);
                    } else {
                        ((lz1.c) ((lz1.a) obj2)).f85179a.i("PREF_POST_CREATE_UPSELL_DISMISSED", true);
                        ((w) obj).d(new m0(false));
                    }
                    t.f56750h = false;
                }
                if (t.f56748f) {
                    ((lz1.c) ((lz1.a) obj2)).f85179a.i("PREF_UPSELL_SENT_LAST_UPSELL_2022_V1", t.f56752j || t.f56753k || t.f56754l);
                    t.f56748f = false;
                }
                if (t.f56749g) {
                    ((lz1.c) ((lz1.a) obj2)).f85179a.i("PREF_UPSELL_SENT_LAST_UPSELL_2022_V1_BOARD", t.f56752j || t.f56753k || t.f56754l);
                    t.f56749g = false;
                }
                if (t.f56751i) {
                    if (!t.f56752j && !t.f56753k && !t.f56754l) {
                        z13 = false;
                    }
                    ((lz1.c) ((lz1.a) obj2)).f85179a.i("PREF_DOWNLOAD_UPSELL_SENT_LAST_UPSELL_2022_V1", z13);
                    t.f56751i = false;
                }
                t.f56752j = false;
                t.f56753k = false;
                t.f56754l = false;
                break;
        }
    }

    public j(z1 z1Var, vd0.a aVar) {
        this.f56185f = z1Var;
        this.f56184e = aVar;
    }
}
