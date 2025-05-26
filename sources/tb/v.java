package tb;

import android.database.Cursor;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kb.s0;

/* loaded from: classes3.dex */
public final class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f117044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f117045c;

    public /* synthetic */ v(y yVar, f0 f0Var, int i13) {
        this.f117043a = i13;
        this.f117045c = yVar;
        this.f117044b = f0Var;
    }

    /* JADX WARN: Finally extract failed */
    public final ArrayList a() {
        d0 d0Var;
        int i13 = this.f117043a;
        int i14 = 15;
        f0 f0Var = this.f117044b;
        y yVar = this.f117045c;
        switch (i13) {
            case 0:
                d0Var = yVar.f117050a;
                d0Var.c();
                try {
                    Cursor m03 = d7.b.m0(d0Var, f0Var, true);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (m03.moveToNext()) {
                            String string = m03.getString(0);
                            if (!hashMap.containsKey(string)) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = m03.getString(0);
                            if (!hashMap2.containsKey(string2)) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        m03.moveToPosition(-1);
                        yVar.b(hashMap);
                        yVar.a(hashMap2);
                        ArrayList arrayList = new ArrayList(m03.getCount());
                        while (m03.moveToNext()) {
                            String string3 = m03.getString(0);
                            s0 v13 = dl2.b.v1(m03.getInt(1));
                            kb.l a13 = kb.l.a(m03.getBlob(2));
                            int i15 = m03.getInt(3);
                            int i16 = m03.getInt(4);
                            arrayList.add(new r(string3, v13, a13, m03.getLong(14), m03.getLong(i14), m03.getLong(16), new kb.g(dl2.b.U2(m03.getBlob(6)), dl2.b.t1(m03.getInt(5)), m03.getInt(7) != 0, m03.getInt(8) != 0, m03.getInt(9) != 0, m03.getInt(10) != 0, m03.getLong(11), m03.getLong(12), dl2.b.C(m03.getBlob(13))), i15, dl2.b.s1(m03.getInt(17)), m03.getLong(18), m03.getLong(19), m03.getInt(20), i16, m03.getLong(21), m03.getInt(22), (ArrayList) hashMap.get(m03.getString(0)), (ArrayList) hashMap2.get(m03.getString(0))));
                            i14 = 15;
                        }
                        d0Var.r();
                        m03.close();
                        return arrayList;
                    } catch (Throwable th3) {
                        m03.close();
                        throw th3;
                    }
                } finally {
                }
            default:
                d0Var = yVar.f117050a;
                d0Var.c();
                try {
                    Cursor m04 = d7.b.m0(d0Var, f0Var, true);
                    try {
                        HashMap hashMap3 = new HashMap();
                        HashMap hashMap4 = new HashMap();
                        while (m04.moveToNext()) {
                            String string4 = m04.getString(0);
                            if (!hashMap3.containsKey(string4)) {
                                hashMap3.put(string4, new ArrayList());
                            }
                            String string5 = m04.getString(0);
                            if (!hashMap4.containsKey(string5)) {
                                hashMap4.put(string5, new ArrayList());
                            }
                        }
                        m04.moveToPosition(-1);
                        yVar.b(hashMap3);
                        yVar.a(hashMap4);
                        ArrayList arrayList2 = new ArrayList(m04.getCount());
                        while (m04.moveToNext()) {
                            String string6 = m04.getString(0);
                            s0 v14 = dl2.b.v1(m04.getInt(1));
                            kb.l a14 = kb.l.a(m04.getBlob(2));
                            int i17 = m04.getInt(3);
                            int i18 = m04.getInt(4);
                            arrayList2.add(new r(string6, v14, a14, m04.getLong(14), m04.getLong(15), m04.getLong(16), new kb.g(dl2.b.U2(m04.getBlob(6)), dl2.b.t1(m04.getInt(5)), m04.getInt(7) != 0, m04.getInt(8) != 0, m04.getInt(9) != 0, m04.getInt(10) != 0, m04.getLong(11), m04.getLong(12), dl2.b.C(m04.getBlob(13))), i17, dl2.b.s1(m04.getInt(17)), m04.getLong(18), m04.getLong(19), m04.getInt(20), i18, m04.getLong(21), m04.getInt(22), (ArrayList) hashMap3.get(m04.getString(0)), (ArrayList) hashMap4.get(m04.getString(0))));
                        }
                        d0Var.r();
                        m04.close();
                        return arrayList2;
                    } catch (Throwable th4) {
                        m04.close();
                        throw th4;
                    }
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f117043a) {
        }
        return a();
    }

    public final void finalize() {
        int i13 = this.f117043a;
        f0 f0Var = this.f117044b;
        switch (i13) {
            case 0:
                f0Var.e();
                break;
            default:
                f0Var.e();
                break;
        }
    }
}
