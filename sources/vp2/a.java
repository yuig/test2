package vp2;

import androidx.datastore.preferences.protobuf.l0;
import ri2.h;
import t72.j;
import up2.b;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public Object f126395a;

    @Override // up2.b
    public final void a(up2.a aVar) {
        Object obj = this.f126395a;
        j jVar = (j) aVar;
        if (obj == null) {
            jVar.e("null");
            return;
        }
        jVar.getClass();
        int i13 = 0;
        if (obj instanceof String) {
            String str = (String) obj;
            jVar.d('\"');
            while (i13 < str.length()) {
                jVar.o(str.charAt(i13));
                i13++;
            }
            jVar.d('\"');
            return;
        }
        if (obj instanceof Character) {
            jVar.d('\"');
            jVar.o(((Character) obj).charValue());
            jVar.d('\"');
            return;
        }
        if (obj instanceof Short) {
            jVar.d('<');
            jVar.e(j.h(obj));
            jVar.e("s>");
            return;
        }
        if (obj instanceof Long) {
            jVar.d('<');
            jVar.e(j.h(obj));
            jVar.e("L>");
            return;
        }
        if (obj instanceof Float) {
            jVar.d('<');
            jVar.e(j.h(obj));
            jVar.e("F>");
        } else {
            if (!obj.getClass().isArray()) {
                jVar.d('<');
                jVar.e(j.h(obj));
                jVar.d('>');
                return;
            }
            l0 l0Var = new l0(new h(obj), 5);
            jVar.e("[");
            while (l0Var.hasNext()) {
                if (i13 != 0) {
                    jVar.e(", ");
                }
                jVar.f((b) l0Var.next());
                i13 = 1;
            }
            jVar.e("]");
        }
    }
}
