package p0;

import a.z0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.z2;
import c0.p0;
import c0.s1;
import e0.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kh2.m0;
import l0.s;
import l0.w;
import v.c1;
import v.r;

/* loaded from: classes2.dex */
public final class d extends s1 {
    public j2 A;

    /* renamed from: o, reason: collision with root package name */
    public final e f98310o;

    /* renamed from: p, reason: collision with root package name */
    public final g f98311p;

    /* renamed from: q, reason: collision with root package name */
    public final p0 f98312q;

    /* renamed from: r, reason: collision with root package name */
    public final p0 f98313r;

    /* renamed from: s, reason: collision with root package name */
    public m.h f98314s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.camera.core.impl.j f98315t;

    /* renamed from: u, reason: collision with root package name */
    public s f98316u;

    /* renamed from: v, reason: collision with root package name */
    public s f98317v;

    /* renamed from: w, reason: collision with root package name */
    public s f98318w;

    /* renamed from: x, reason: collision with root package name */
    public s f98319x;

    /* renamed from: y, reason: collision with root package name */
    public i2 f98320y;

    /* renamed from: z, reason: collision with root package name */
    public i2 f98321z;

    public d(j0 j0Var, j0 j0Var2, p0 p0Var, p0 p0Var2, HashSet hashSet, c3 c3Var) {
        super(G(hashSet));
        this.f98310o = G(hashSet);
        this.f98312q = p0Var;
        this.f98313r = p0Var2;
        this.f98311p = new g(j0Var, j0Var2, hashSet, c3Var, new z0(this, 15));
    }

    public static ArrayList F(s1 s1Var) {
        ArrayList arrayList = new ArrayList();
        if (s1Var instanceof d) {
            Iterator it = ((d) s1Var).f98311p.f98328a.iterator();
            while (it.hasNext()) {
                arrayList.add(((s1) it.next()).f24339f.A());
            }
        } else {
            arrayList.add(s1Var.f24339f.A());
        }
        return arrayList;
    }

    public static e G(HashSet hashSet) {
        u.a aVar = new u.a(5);
        androidx.camera.core.impl.c cVar = i1.f16872an;
        q1 q1Var = aVar.f119717b;
        q1Var.s(cVar, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            if (s1Var.f24339f.d(z2.f17024vn)) {
                arrayList.add(s1Var.f24339f.A());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        q1Var.s(e.f98322b, arrayList);
        q1Var.s(j1.f16883fn, 2);
        return new e(v1.b(q1Var));
    }

    public final void B() {
        j2 j2Var = this.A;
        if (j2Var != null) {
            j2Var.b();
            this.A = null;
        }
        s sVar = this.f98316u;
        if (sVar != null) {
            sVar.c();
            this.f98316u = null;
        }
        s sVar2 = this.f98317v;
        if (sVar2 != null) {
            sVar2.c();
            this.f98317v = null;
        }
        s sVar3 = this.f98318w;
        if (sVar3 != null) {
            sVar3.c();
            this.f98318w = null;
        }
        s sVar4 = this.f98319x;
        if (sVar4 != null) {
            sVar4.c();
            this.f98319x = null;
        }
        m.h hVar = this.f98314s;
        if (hVar != null) {
            hVar.H();
            this.f98314s = null;
        }
        androidx.camera.core.impl.j jVar = this.f98315t;
        if (jVar != null) {
            jVar.l();
            this.f98315t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List C(String str, String str2, z2 z2Var, k kVar, k kVar2) {
        String str3;
        f0.h.s();
        g gVar = this.f98311p;
        int i13 = 1;
        boolean z13 = false;
        if (kVar2 == null) {
            D(str, str2, z2Var, kVar, null);
            j0 c13 = c();
            Objects.requireNonNull(c13);
            this.f98314s = new m.h(c13, new l0.i(kVar.f16894b));
            boolean z14 = this.f24342i != null;
            s sVar = this.f98318w;
            int n13 = ((j1) this.f24339f).n();
            gVar.getClass();
            HashMap hashMap = new HashMap();
            for (s1 s1Var : gVar.f98328a) {
                hashMap.put(s1Var, gVar.p(s1Var, gVar.f98338k, gVar.f98333f, sVar, n13, z14));
                gVar = gVar;
                i13 = i13;
                z13 = false;
            }
            int i14 = i13;
            g gVar2 = gVar;
            w M = this.f98314s.M(new l0.c(this.f98318w, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((s1) entry.getKey(), (s) M.get(entry.getValue()));
            }
            gVar2.u(hashMap2);
            Object[] objArr = {this.f98320y.c()};
            ArrayList arrayList = new ArrayList(i14);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        D(str, str2, z2Var, kVar, kVar2);
        Matrix matrix = this.f24343j;
        j0 i15 = i();
        Objects.requireNonNull(i15);
        boolean m13 = i15.m();
        Rect rect = this.f24342i;
        if (rect == null) {
            Size size = kVar2.f16893a;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        j0 i16 = i();
        Objects.requireNonNull(i16);
        int h10 = h(i16, false);
        j0 i17 = i();
        Objects.requireNonNull(i17);
        s sVar2 = new s(3, 34, kVar2, matrix, m13, rect2, h10, -1, l(i17));
        this.f98317v = sVar2;
        Objects.requireNonNull(i());
        this.f98319x = sVar2;
        i2 E = E(this.f98317v, z2Var, kVar2);
        this.f98321z = E;
        j2 j2Var = this.A;
        if (j2Var != null) {
            j2Var.b();
        }
        boolean z15 = false;
        boolean z16 = true;
        String str4 = "DualSurfaceProcessorNode";
        String str5 = "Failed to send SurfaceRequest to SurfaceProcessor.";
        j2 j2Var2 = new j2(new c(this, str, str2, z2Var, kVar, kVar2));
        this.A = j2Var2;
        E.f16867f = j2Var2;
        this.f98315t = new androidx.camera.core.impl.j(c(), i(), new m0.e(kVar.f16894b, this.f98312q, this.f98313r));
        boolean z17 = this.f24342i != null;
        s sVar3 = this.f98318w;
        s sVar4 = this.f98319x;
        int n14 = ((j1) this.f24339f).n();
        gVar.getClass();
        HashMap hashMap3 = new HashMap();
        for (Iterator it = gVar.f98328a.iterator(); it.hasNext(); it = it) {
            s1 s1Var2 = (s1) it.next();
            n0.c p13 = gVar.p(s1Var2, gVar.f98338k, gVar.f98333f, sVar3, n14, z17);
            j0 j0Var = gVar.f98334g;
            Objects.requireNonNull(j0Var);
            hashMap3.put(s1Var2, new m0.a(p13, gVar.p(s1Var2, gVar.f98339l, j0Var, sVar4, n14, z17)));
            str5 = str5;
            sVar3 = sVar3;
            str4 = str4;
            z16 = true;
            z15 = false;
        }
        String str6 = str5;
        String str7 = str4;
        androidx.camera.core.impl.j jVar = this.f98315t;
        m0.b bVar = new m0.b(this.f98318w, this.f98319x, new ArrayList(hashMap3.values()));
        jVar.getClass();
        f0.h.s();
        jVar.f16879f = bVar;
        jVar.f16878e = new w();
        m0.b bVar2 = (m0.b) jVar.f16879f;
        s sVar5 = bVar2.f85250a;
        Iterator it2 = bVar2.f85252c.iterator();
        while (it2.hasNext()) {
            m0.a aVar = (m0.a) it2.next();
            w wVar = (w) jVar.f16878e;
            n0.c cVar = aVar.f85248a;
            Rect rect3 = cVar.f88736d;
            Matrix matrix2 = new Matrix();
            Size e13 = u.e(rect3);
            int i18 = cVar.f88738f;
            Size g13 = u.g(i18, e13);
            Size size2 = cVar.f88737e;
            com.bumptech.glide.d.h(u.d(g13, false, size2));
            Iterator it3 = it2;
            Rect rect4 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            androidx.camera.core.impl.j a13 = sVar5.f81273g.a();
            a13.f16875b = size2;
            wVar.put(aVar, new s(cVar.f88734b, cVar.f88735c, a13.b(), matrix2, false, rect4, sVar5.f81275i - i18, -1, sVar5.f81271e != cVar.f88739g));
            it2 = it3;
        }
        try {
            ((l0.u) jVar.f16875b).d(sVar5.d((j0) jVar.f16876c, true));
            str3 = str7;
        } catch (ProcessingException e14) {
            str3 = str7;
            m0.t(str3, str6, e14);
        }
        j0 j0Var2 = (j0) jVar.f16877d;
        s sVar6 = bVar2.f85251b;
        try {
            ((l0.u) jVar.f16875b).d(sVar6.d(j0Var2, false));
        } catch (ProcessingException e15) {
            m0.t(str3, str6, e15);
        }
        j0 j0Var3 = (j0) jVar.f16876c;
        j0 j0Var4 = (j0) jVar.f16877d;
        for (Map.Entry entry2 : ((w) jVar.f16878e).entrySet()) {
            jVar.d(j0Var3, j0Var4, sVar5, sVar6, entry2);
            ((s) entry2.getValue()).a(new r(jVar, j0Var3, j0Var4, sVar5, sVar6, entry2, 3));
        }
        w wVar2 = (w) jVar.f16878e;
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            hashMap4.put((s1) entry3.getKey(), (s) wVar2.get(entry3.getValue()));
        }
        gVar.u(hashMap4);
        Object[] objArr2 = {this.f98320y.c(), this.f98321z.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i19 = 0; i19 < 2; i19++) {
            Object obj2 = objArr2[i19];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void D(String str, String str2, z2 z2Var, k kVar, k kVar2) {
        Matrix matrix = this.f24343j;
        j0 c13 = c();
        Objects.requireNonNull(c13);
        boolean m13 = c13.m();
        Size size = kVar.f16893a;
        Rect rect = this.f24342i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        j0 c14 = c();
        Objects.requireNonNull(c14);
        int h10 = h(c14, false);
        j0 c15 = c();
        Objects.requireNonNull(c15);
        s sVar = new s(3, 34, kVar, matrix, m13, rect2, h10, -1, l(c15));
        this.f98316u = sVar;
        Objects.requireNonNull(c());
        this.f98318w = sVar;
        i2 E = E(this.f98316u, z2Var, kVar);
        this.f98320y = E;
        j2 j2Var = this.A;
        if (j2Var != null) {
            j2Var.b();
        }
        j2 j2Var2 = new j2(new c(this, str, str2, z2Var, kVar, kVar2));
        this.A = j2Var2;
        E.f16867f = j2Var2;
    }

    public final i2 E(s sVar, z2 z2Var, k kVar) {
        i2 d2 = i2.d(kVar.f16893a, z2Var);
        g gVar = this.f98311p;
        Iterator it = gVar.f98328a.iterator();
        int i13 = -1;
        while (it.hasNext()) {
            int i14 = ((o2) ((s1) it.next()).f24339f.f(z2.f17016nn)).f16937g.f16969c;
            Integer valueOf = Integer.valueOf(i13);
            List list = o2.f16930j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i14))) {
                i13 = i14;
            }
        }
        c1 c1Var = d2.f16863b;
        if (i13 != -1) {
            c1Var.f123384a = i13;
        }
        Iterator it2 = gVar.f98328a.iterator();
        while (it2.hasNext()) {
            o2 c13 = i2.d(kVar.f16893a, ((s1) it2.next()).f24339f).c();
            s0 s0Var = c13.f16937g;
            c1Var.a(s0Var.f16971e);
            for (n nVar : c13.f16935e) {
                c1Var.b(nVar);
                ArrayList arrayList = d2.f16866e;
                if (!arrayList.contains(nVar)) {
                    arrayList.add(nVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c13.f16934d) {
                ArrayList arrayList2 = d2.f16865d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c13.f16933c) {
                ArrayList arrayList3 = d2.f16864c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            d2.a(s0Var.f16968b);
        }
        sVar.getClass();
        f0.h.s();
        sVar.b();
        com.bumptech.glide.d.v("Consumer can only be linked once.", !sVar.f81276j);
        sVar.f81276j = true;
        d2.b(sVar.f81278l, kVar.f16894b, -1);
        c1Var.b(gVar.f98335h);
        v0 v0Var = kVar.f16896d;
        if (v0Var != null) {
            c1Var.c(v0Var);
        }
        return d2;
    }

    @Override // c0.s1
    public final z2 f(boolean z13, c3 c3Var) {
        e eVar = this.f98310o;
        v0 a13 = c3Var.a(eVar.A(), 1);
        if (z13) {
            a13 = v0.B(a13, eVar.f98323a);
        }
        if (a13 == null) {
            return null;
        }
        return k(a13).e();
    }

    @Override // c0.s1
    public final HashSet j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // c0.s1
    public final u.a k(v0 v0Var) {
        return new u.a(q1.k(v0Var), 5);
    }

    @Override // c0.s1
    public final void q() {
        g gVar = this.f98311p;
        for (s1 s1Var : gVar.f98328a) {
            f fVar = (f) gVar.f98330c.get(s1Var);
            Objects.requireNonNull(fVar);
            s1Var.a(fVar, null, null, s1Var.f(true, gVar.f98332e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    @Override // c0.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.z2 s(androidx.camera.core.impl.h0 r13, androidx.camera.core.impl.y2 r14) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.d.s(androidx.camera.core.impl.h0, androidx.camera.core.impl.y2):androidx.camera.core.impl.z2");
    }

    @Override // c0.s1
    public final void t() {
        for (s1 s1Var : this.f98311p.f98328a) {
            s1Var.t();
            s1Var.r();
        }
    }

    @Override // c0.s1
    public final void u() {
        Iterator it = this.f98311p.f98328a.iterator();
        while (it.hasNext()) {
            ((s1) it.next()).u();
        }
    }

    @Override // c0.s1
    public final k v(v0 v0Var) {
        this.f98320y.f16863b.c(v0Var);
        Object[] objArr = {this.f98320y.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.j a13 = this.f24340g.a();
        a13.f16878e = v0Var;
        return a13.b();
    }

    @Override // c0.s1
    public final k w(k kVar, k kVar2) {
        A(C(e(), i() == null ? null : i().g().c(), this.f24339f, kVar, kVar2));
        n();
        return kVar;
    }

    @Override // c0.s1
    public final void x() {
        B();
        g gVar = this.f98311p;
        for (s1 s1Var : gVar.f98328a) {
            f fVar = (f) gVar.f98330c.get(s1Var);
            Objects.requireNonNull(fVar);
            s1Var.z(fVar);
        }
    }
}
