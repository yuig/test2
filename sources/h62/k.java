package h62;

import android.graphics.Bitmap;
import android.net.Uri;
import do2.a2;
import do2.t2;
import do2.u2;
import fk1.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;
import r72.f2;
import r72.m1;
import r72.q1;
import r72.u1;
import r72.z1;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n72.m f67839a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f67840b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f67841c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f67842d;

    /* renamed from: e, reason: collision with root package name */
    public final a2 f67843e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f67844f;

    /* renamed from: g, reason: collision with root package name */
    public final kv0.p f67845g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f67846h;

    /* renamed from: i, reason: collision with root package name */
    public m1 f67847i;

    public k(m72.a coreLogger) {
        Intrinsics.checkNotNullParameter(coreLogger, "coreLogger");
        this.f67839a = coreLogger;
        t2 a13 = u2.a(f2.f106468j);
        this.f67840b = a13;
        this.f67841c = new a2(a13);
        t2 a14 = u2.a(new l(0, 0));
        this.f67842d = a14;
        this.f67843e = new a2(a14);
        i listener = new i(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        kv0.p pVar = new kv0.p();
        pVar.f80994a = listener;
        pVar.f80995b = new LinkedList();
        pVar.f80996c = new LinkedList();
        this.f67845g = pVar;
    }

    public static List d(h hVar) {
        if (hVar instanceof a) {
            return e0.b(((a) hVar).f67821b);
        }
        if (hVar instanceof e) {
            e eVar = (e) hVar;
            return f0.j(eVar.f67829b, eVar.f67830c);
        }
        if (hVar instanceof b) {
            List list = ((b) hVar).f67822a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k0.u(d((h) it.next()), arrayList);
            }
            return arrayList;
        }
        if (hVar instanceof d) {
            return e0.b(((d) hVar).f67827b);
        }
        if (!(hVar instanceof f)) {
            return q0.f80391a;
        }
        f fVar = (f) hVar;
        return f0.j(fVar.f67832b, fVar.f67833c);
    }

    public static void f(u1 u1Var) {
        Uri parse = Uri.parse(u1Var.f106687s.f106716a);
        if (Intrinsics.d(parse.getScheme(), "file")) {
            try {
                String path = parse.getPath();
                Intrinsics.f(path);
                new File(path).delete();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(h command, boolean z13) {
        t2 t2Var;
        Object value;
        do {
            t2Var = this.f67840b;
            value = t2Var.getValue();
        } while (!t2Var.h(value, command.a((f2) value)));
        if (z13) {
            kv0.p pVar = this.f67845g;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(command, "command");
            ((LinkedList) pVar.f80995b).push(command.b());
            ((LinkedList) pVar.f80996c).clear();
            pVar.i();
        }
    }

    public final IndexedValue b(String id3) {
        Object obj;
        Intrinsics.checkNotNullParameter(id3, "id");
        Iterator it = CollectionsKt.M0(((f2) this.f67840b.getValue()).f106470b).iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                obj = null;
                break;
            }
            obj = x0Var.next();
            String b13 = ((z1) ((IndexedValue) obj).f80350b).b();
            int i13 = r72.a2.f106437b;
            if (Intrinsics.d(b13, id3)) {
                break;
            }
        }
        return (IndexedValue) obj;
    }

    public final int c() {
        return ((f2) this.f67840b.getValue()).f106470b.size();
    }

    public final void e(m1 shuffle, boolean z13) {
        Object value;
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        t2 t2Var = this.f67840b;
        if (!z13) {
            do {
                value = t2Var.getValue();
            } while (!t2Var.h(value, f2.a((f2) value, null, shuffle.f106576z, null, shuffle.f106556f, shuffle.f106570t, 373)));
            return;
        }
        if (this.f67844f != null) {
            throw new IllegalStateException("startBatch(): Cannot start batch in the middle of a batch");
        }
        kv0.p pVar = this.f67845g;
        this.f67844f = Integer.valueOf(((LinkedList) pVar.f80995b).size());
        for (z1 item : shuffle.f106576z) {
            Intrinsics.checkNotNullParameter(item, "item");
            a(new a(((f2) t2Var.getValue()).f106470b.size(), item), true);
        }
        j(new s12.a(shuffle, 15));
        Integer num = this.f67844f;
        if (num == null) {
            throw new IllegalStateException("clearBatch(): No batch has been started to commit");
        }
        int intValue = num.intValue();
        ArrayList arrayList = new ArrayList();
        while (intValue < ((LinkedList) pVar.f80995b).size()) {
            pVar.m(new u(arrayList, 12));
        }
        b command = new b(arrayList);
        Intrinsics.checkNotNullParameter(command, "command");
        ((LinkedList) pVar.f80995b).push(command.b());
        ((LinkedList) pVar.f80996c).clear();
        pVar.i();
        this.f67844f = null;
    }

    public final void g(String id3, int i13, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        IndexedValue b13 = b(id3);
        if (b13 == null) {
            return;
        }
        a(new c(i13, b13.f80349a, i14), z13 && i13 != i14);
    }

    public final void h(String id3, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        IndexedValue b13 = b(id3);
        if (b13 == null) {
            return;
        }
        a(new d(b13.f80349a, (z1) b13.f80350b), z13);
    }

    public final void i(String id3) {
        t2 t2Var;
        Object value;
        Intrinsics.checkNotNullParameter(id3, "id");
        do {
            t2Var = this.f67840b;
            value = t2Var.getValue();
        } while (!t2Var.h(value, f2.a((f2) value, id3, null, null, null, null, 510)));
    }

    public final void j(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        q1 q1Var = ((f2) this.f67840b.getValue()).f106476h;
        q1 q1Var2 = (q1) block.invoke(q1Var);
        if (Intrinsics.d(q1Var, q1Var2)) {
            return;
        }
        a(new g(q1Var, q1Var2), true);
    }

    public final void k(String id3, boolean z13, Function1 block) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        IndexedValue b13 = b(id3);
        if (b13 == null) {
            return;
        }
        Object obj = b13.f80350b;
        z1 z1Var = (z1) block.invoke(obj);
        if (Intrinsics.d(obj, z1Var)) {
            return;
        }
        a(new f(b13.f80349a, (z1) obj, z1Var), z13);
    }
}
