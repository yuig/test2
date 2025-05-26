package s7;

import a7.a0;
import a7.i0;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import pk.n3;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f111319a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public a0 f111320b;

    /* renamed from: c, reason: collision with root package name */
    public h f111321c;

    public static h a(a0 a0Var) {
        g7.l lVar = new g7.l();
        lVar.f63810b = null;
        Uri uri = a0Var.f920b;
        z zVar = new z(uri != null ? uri.toString() : null, a0Var.f924f, lVar);
        n3 it = a0Var.f921c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zVar.e((String) entry.getKey(), (String) entry.getValue());
        }
        HashMap hashMap = new HashMap();
        UUID uuid = a7.i.f1066a;
        t.a aVar = y.f111341d;
        a10.e eVar = new a10.e();
        UUID uuid2 = a0Var.f919a;
        uuid2.getClass();
        int[] B0 = d7.b.B0(a0Var.f925g);
        for (int i13 : B0) {
            boolean z13 = true;
            if (i13 != 2 && i13 != 1) {
                z13 = false;
            }
            bf.b.i(z13);
        }
        h hVar = new h(uuid2, aVar, zVar, hashMap, a0Var.f922d, (int[]) B0.clone(), a0Var.f923e, eVar, 300000L);
        hVar.m(a0Var.c());
        return hVar;
    }

    public final q b(i0 i0Var) {
        h hVar;
        i0Var.f1073b.getClass();
        a0 a0Var = i0Var.f1073b.f971c;
        if (a0Var == null) {
            return q.f111330a;
        }
        synchronized (this.f111319a) {
            try {
                if (!a0Var.equals(this.f111320b)) {
                    this.f111320b = a0Var;
                    this.f111321c = a(a0Var);
                }
                hVar = this.f111321c;
                hVar.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return hVar;
    }
}
