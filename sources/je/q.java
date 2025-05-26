package je;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final f f75742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75743b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f75744c = null;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f75745d = null;

    public q(f fVar, String str) {
        this.f75742a = null;
        this.f75743b = null;
        this.f75742a = fVar == null ? f.DESCENDANT : fVar;
        this.f75743b = str;
    }

    public final void a(String str, d dVar, String str2) {
        if (this.f75744c == null) {
            this.f75744c = new ArrayList();
        }
        this.f75744c.add(new c(str, dVar, str2));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        f fVar = f.CHILD;
        f fVar2 = this.f75742a;
        if (fVar2 == fVar) {
            sb3.append("> ");
        } else if (fVar2 == f.FOLLOWS) {
            sb3.append("+ ");
        }
        String str = this.f75743b;
        if (str == null) {
            str = "*";
        }
        sb3.append(str);
        ArrayList arrayList = this.f75744c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                sb3.append('[');
                sb3.append(cVar.f75563a);
                int i13 = b.f75559a[cVar.f75564b.ordinal()];
                String str2 = cVar.f75565c;
                if (i13 == 1) {
                    sb3.append('=');
                    sb3.append(str2);
                } else if (i13 == 2) {
                    sb3.append("~=");
                    sb3.append(str2);
                } else if (i13 == 3) {
                    sb3.append("|=");
                    sb3.append(str2);
                }
                sb3.append(']');
            }
        }
        ArrayList arrayList2 = this.f75745d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                sb3.append(':');
                sb3.append(hVar);
            }
        }
        return sb3.toString();
    }
}
