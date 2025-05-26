package m71;

import android.database.Cursor;
import com.pinterest.api.model.eh0;
import com.pinterest.typeaheadroom.AppDatabase;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import kk2.b;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import x92.c;
import x92.d;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final eh0 f86522a;

    public a(eh0 eh0Var) {
        this.f86522a = eh0Var;
    }

    public final b a(String q13, boolean z13, j22.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (z13 && aVar != j22.a.TYPEAHEAD_MY_BOARD) {
            int i13 = hf0.b.q() ? 4 : 2;
            ((c) this.f86522a).getClass();
            Intrinsics.checkNotNullParameter(q13, "q");
            AppDatabase appDatabase = c.f134369b;
            if (!(appDatabase != null)) {
                arrayList = new ArrayList();
            } else {
                if (appDatabase == null) {
                    Intrinsics.r("db");
                    throw null;
                }
                x92.b t13 = appDatabase.t();
                t13.getClass();
                f0 d2 = f0.d(2, "SELECT * FROM SearchTypeaheadSuggestionRoom WHERE suggestion LIKE ? ORDER BY score DESC LIMIT ?");
                d2.c1(1, q13 + "%");
                d2.u1(2, i13);
                ((d0) t13.f134365b).b();
                Cursor m03 = d7.b.m0((d0) t13.f134365b, d2, false);
                try {
                    int w13 = b7.c.w(m03, "id");
                    int w14 = b7.c.w(m03, "suggestion");
                    int w15 = b7.c.w(m03, "score");
                    arrayList = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        arrayList.add(new d(m03.getLong(w13), m03.getString(w14), m03.getFloat(w15)));
                    }
                } finally {
                    m03.close();
                    d2.e();
                }
            }
            int min = Math.min(arrayList.size(), i13);
            for (int i14 = 0; i14 < min; i14++) {
                br.d dVar = new br.d();
                dVar.f23704b = ((d) arrayList.get(i14)).f134371b;
                dVar.f23707e = br.c.PIN_LOCAL_CACHE;
                dVar.f23712j = 1;
                arrayList2.add(dVar);
            }
        }
        return arrayList2.isEmpty() ? b0.j(new ArrayList()) : b0.j(arrayList2);
    }
}
