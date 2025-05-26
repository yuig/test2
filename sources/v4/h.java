package v4;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class h implements e {

    /* renamed from: d */
    public final u f123993d;

    /* renamed from: f */
    public int f123995f;

    /* renamed from: g */
    public int f123996g;

    /* renamed from: a */
    public u f123990a = null;

    /* renamed from: b */
    public boolean f123991b = false;

    /* renamed from: c */
    public boolean f123992c = false;

    /* renamed from: e */
    public g f123994e = g.UNKNOWN;

    /* renamed from: h */
    public int f123997h = 1;

    /* renamed from: i */
    public i f123998i = null;

    /* renamed from: j */
    public boolean f123999j = false;

    /* renamed from: k */
    public final ArrayList f124000k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f124001l = new ArrayList();

    public h(u uVar) {
        this.f123993d = uVar;
    }

    @Override // v4.e
    public final void a(e eVar) {
        ArrayList arrayList = this.f124001l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).f123999j) {
                return;
            }
        }
        this.f123992c = true;
        u uVar = this.f123990a;
        if (uVar != null) {
            uVar.a(this);
        }
        if (this.f123991b) {
            this.f123993d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        h hVar = null;
        int i13 = 0;
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (!(hVar2 instanceof i)) {
                i13++;
                hVar = hVar2;
            }
        }
        if (hVar != null && i13 == 1 && hVar.f123999j) {
            i iVar = this.f123998i;
            if (iVar != null) {
                if (!iVar.f123999j) {
                    return;
                } else {
                    this.f123995f = this.f123997h * iVar.f123996g;
                }
            }
            d(hVar.f123996g + this.f123995f);
        }
        u uVar2 = this.f123990a;
        if (uVar2 != null) {
            uVar2.a(this);
        }
    }

    public final void b(e eVar) {
        this.f124000k.add(eVar);
        if (this.f123999j) {
            eVar.a(eVar);
        }
    }

    public final void c() {
        this.f124001l.clear();
        this.f124000k.clear();
        this.f123999j = false;
        this.f123996g = 0;
        this.f123992c = false;
        this.f123991b = false;
    }

    public void d(int i13) {
        if (this.f123999j) {
            return;
        }
        this.f123999j = true;
        this.f123996g = i13;
        Iterator it = this.f124000k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.a(eVar);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f123993d.f124019b.f120217k0);
        sb3.append(":");
        sb3.append(this.f123994e);
        sb3.append("(");
        sb3.append(this.f123999j ? Integer.valueOf(this.f123996g) : "unresolved");
        sb3.append(") <t=");
        sb3.append(this.f124001l.size());
        sb3.append(":d=");
        sb3.append(this.f124000k.size());
        sb3.append(">");
        return sb3.toString();
    }
}
