package r0;

import android.util.Size;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k0 implements o0 {

    /* renamed from: b, reason: collision with root package name */
    public final a1.a f105592b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f105593c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f105594d;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(int i13, androidx.camera.core.impl.h0 h0Var) {
        v.l0 l0Var = y0.g0.f136340d;
        this.f105593c = new HashMap();
        this.f105594d = new HashMap();
        com.bumptech.glide.d.g("Not a supported video capabilities source: " + i13, i13 == 0 || i13 == 1);
        androidx.camera.core.impl.c1 p13 = h0Var.p();
        androidx.camera.core.impl.r rVar = w0.a.f126951a;
        q4 q4Var = new q4(p13, rVar, h0Var);
        if (i13 == 1) {
            h hVar = r.f105629a;
            ArrayList arrayList = new ArrayList(r.f105637i);
            Set<c0.z> singleton = Collections.singleton(c0.z.f24401d);
            List h10 = h0Var.h(34);
            jf2.c cVar = new jf2.c();
            cVar.f75877f = new HashMap();
            cVar.f75878g = new HashMap();
            for (c0.z zVar : singleton) {
                if (!zVar.b()) {
                    throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + zVar);
                }
            }
            cVar.f75872a = q4Var;
            cVar.f75873b = new HashSet(arrayList);
            cVar.f75875d = new HashSet(singleton);
            cVar.f75874c = new HashSet(h10);
            cVar.f75876e = l0Var;
            q4Var = cVar;
        }
        androidx.appcompat.app.d dVar = new androidx.appcompat.app.d(q4Var, rVar);
        Iterator it = h0Var.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c0.z zVar2 = (c0.z) it.next();
            if (Integer.valueOf(zVar2.f24407a).equals(3) && zVar2.f24408b == 10) {
                dVar = new androidx.appcompat.app.d(dVar);
                break;
            }
        }
        this.f105592b = new a1.a(dVar, h0Var, rVar);
        for (c0.z zVar3 : h0Var.a()) {
            n nVar = new n(new androidx.appcompat.app.d(this.f105592b, zVar3));
            if (!new ArrayList(nVar.f105611a.keySet()).isEmpty()) {
                this.f105593c.put(zVar3, nVar);
            }
        }
        h0Var.j();
    }

    @Override // r0.o0
    public final t0.a a(r rVar, c0.z zVar) {
        n d2 = d(zVar);
        if (d2 == null) {
            return null;
        }
        return d2.b(rVar);
    }

    @Override // r0.o0
    public final t0.a b(Size size, c0.z zVar) {
        n d2 = d(zVar);
        if (d2 == null) {
            return null;
        }
        return d2.a(size);
    }

    @Override // r0.o0
    public final ArrayList c(c0.z zVar) {
        n d2 = d(zVar);
        return d2 == null ? new ArrayList() : new ArrayList(d2.f105611a.keySet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r1.contains(r9) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        r3 = new r0.n(new androidx.appcompat.app.d(r8.f105592b, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r0.put(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r2 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r0.n d(c0.z r9) {
        /*
            r8 = this;
            boolean r0 = r9.b()
            java.util.HashMap r1 = r8.f105593c
            if (r0 == 0) goto Lf
            java.lang.Object r9 = r1.get(r9)
            r0.n r9 = (r0.n) r9
            return r9
        Lf:
            java.util.HashMap r0 = r8.f105594d
            boolean r2 = r0.containsKey(r9)
            if (r2 == 0) goto L1e
            java.lang.Object r9 = r0.get(r9)
            r0.n r9 = (r0.n) r9
            return r9
        L1e:
            java.util.Set r1 = r1.keySet()
            java.lang.String r2 = "dynamicRangeToTest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "fullySpecifiedDynamicRanges"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r9.b()
            r3 = 0
            if (r2 == 0) goto L3a
            boolean r1 = r1.contains(r9)
            if (r1 != 0) goto L7a
            goto L86
        L3a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r1.next()
            r4 = r2
            c0.z r4 = (c0.z) r4
            boolean r5 = r4.b()
            java.lang.String r6 = "Fully specified range is not actually fully specified."
            com.bumptech.glide.d.v(r6, r5)
            int r5 = r9.f24408b
            if (r5 != 0) goto L5b
            goto L5f
        L5b:
            int r7 = r4.f24408b
            if (r5 != r7) goto L40
        L5f:
            boolean r5 = r4.b()
            com.bumptech.glide.d.v(r6, r5)
            int r5 = r9.f24407a
            if (r5 != 0) goto L6b
            goto L78
        L6b:
            r6 = 2
            int r4 = r4.f24407a
            if (r5 != r6) goto L74
            r6 = 1
            if (r4 == r6) goto L74
            goto L78
        L74:
            if (r5 != r4) goto L40
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L86
        L7a:
            androidx.appcompat.app.d r1 = new androidx.appcompat.app.d
            a1.a r2 = r8.f105592b
            r1.<init>(r2, r9)
            r0.n r3 = new r0.n
            r3.<init>(r1)
        L86:
            r0.put(r9, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.k0.d(c0.z):r0.n");
    }
}
