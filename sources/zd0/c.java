package zd0;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import xa0.j;

/* loaded from: classes5.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f141664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f141665c;

    public /* synthetic */ c(d dVar, f0 f0Var, int i13) {
        this.f141663a = i13;
        this.f141665c = dVar;
        this.f141664b = f0Var;
    }

    public final ArrayList a() {
        Cursor m03;
        int i13 = this.f141663a;
        f0 f0Var = this.f141664b;
        d dVar = this.f141665c;
        switch (i13) {
            case 0:
                m03 = d7.b.m0(dVar.f141666a, f0Var, false);
                try {
                    int w13 = b7.c.w(m03, "id");
                    int w14 = b7.c.w(m03, "key");
                    int w15 = b7.c.w(m03, "type");
                    int w16 = b7.c.w(m03, "lineHeight");
                    int w17 = b7.c.w(m03, "name");
                    int w18 = b7.c.w(m03, "path");
                    ArrayList arrayList = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        String string = m03.getString(w13);
                        String string2 = m03.getString(w14);
                        int i14 = m03.getInt(w15);
                        dVar.f141668c.getClass();
                        arrayList.add(new e(string, string2, j.g(i14), m03.getDouble(w16), m03.getString(w17), m03.getString(w18)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                m03 = d7.b.m0(dVar.f141666a, f0Var, false);
                try {
                    int w19 = b7.c.w(m03, "id");
                    int w23 = b7.c.w(m03, "key");
                    int w24 = b7.c.w(m03, "type");
                    int w25 = b7.c.w(m03, "lineHeight");
                    int w26 = b7.c.w(m03, "name");
                    int w27 = b7.c.w(m03, "path");
                    ArrayList arrayList2 = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        String string3 = m03.getString(w19);
                        String string4 = m03.getString(w23);
                        int i15 = m03.getInt(w24);
                        dVar.f141668c.getClass();
                        arrayList2.add(new e(string3, string4, j.g(i15), m03.getDouble(w25), m03.getString(w26), m03.getString(w27)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e eVar;
        switch (this.f141663a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                d dVar = this.f141665c;
                d0 d0Var = dVar.f141666a;
                f0 f0Var = this.f141664b;
                Cursor m03 = d7.b.m0(d0Var, f0Var, false);
                try {
                    int w13 = b7.c.w(m03, "id");
                    int w14 = b7.c.w(m03, "key");
                    int w15 = b7.c.w(m03, "type");
                    int w16 = b7.c.w(m03, "lineHeight");
                    int w17 = b7.c.w(m03, "name");
                    int w18 = b7.c.w(m03, "path");
                    if (m03.moveToFirst()) {
                        String string = m03.getString(w13);
                        String string2 = m03.getString(w14);
                        int i13 = m03.getInt(w15);
                        dVar.f141668c.getClass();
                        eVar = new e(string, string2, j.g(i13), m03.getDouble(w16), m03.getString(w17), m03.getString(w18));
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        return eVar;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: ".concat(f0Var.c()));
                } finally {
                    m03.close();
                }
        }
    }

    public final void finalize() {
        int i13 = this.f141663a;
        f0 f0Var = this.f141664b;
        switch (i13) {
            case 0:
                f0Var.e();
                break;
            case 1:
                f0Var.e();
                break;
            default:
                f0Var.e();
                break;
        }
    }
}
