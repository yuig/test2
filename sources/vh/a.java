package vh;

import ao2.j0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import h62.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l62.f0;
import l62.m0;
import l62.n0;
import r72.f2;
import r72.u1;
import r72.z1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f125799a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f125800b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f125801c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Object f125802d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f125803e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Object f125804f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f125805g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public Object f125806h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public Object f125807i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public Object f125808j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public Object f125809k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public Object f125810l;

    public a(PinDeserializer pinDeserializer) {
        this.f125810l = pinDeserializer;
    }

    public final void a(z1 item, boolean z13) {
        Intrinsics.checkNotNullParameter(item, "item");
        k kVar = (k) this.f125799a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        kVar.a(new h62.a(((f2) kVar.f67840b.getValue()).f106470b.size(), item), z13);
    }

    public final f30 b(vd0.c json) {
        PinDeserializer pinDeserializer = (PinDeserializer) this.f125810l;
        pinDeserializer.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        f30 a13 = pinDeserializer.e(json, false, false).R6().a();
        ((List) this.f125800b).add(a13);
        ((List) this.f125799a).add(a13.getUid());
        v7 D3 = a13.D3();
        if (D3 != null) {
            ((List) this.f125802d).add(D3);
            ((List) this.f125801c).add(D3.getUid());
        }
        ba j63 = a13.j6();
        if (j63 != null) {
            ((List) this.f125803e).add(j63);
        }
        zs t63 = a13.t6();
        if (t63 != null) {
            ((List) this.f125807i).add(t63);
        }
        hh t53 = a13.t5();
        if (t53 != null) {
            ((List) this.f125809k).add(t53);
            wy0 d2 = t53.d();
            if (d2 != null) {
                ((List) this.f125805g).add(d2);
                ((List) this.f125804f).add(d2.getUid());
            }
        }
        oc0 d63 = a13.d6();
        if (d63 != null) {
            v7 g13 = d63.g();
            if (g13 != null) {
                ((List) this.f125802d).add(g13);
                ((List) this.f125801c).add(g13.getUid());
            }
            f30 i13 = d63.i();
            if (i13 != null) {
                ((List) this.f125806h).add(i13);
            }
            zs h10 = d63.h();
            if (h10 != null) {
                ((List) this.f125807i).add(h10);
            }
        }
        wy0 I5 = a13.I5();
        if (I5 != null) {
            ((List) this.f125805g).add(I5);
            ((List) this.f125804f).add(I5.getUid());
            v10 Y3 = I5.Y3();
            if (Y3 != null) {
                ((List) this.f125808j).add(Y3);
            }
        }
        wy0 C5 = a13.C5();
        if (C5 != null) {
            ((List) this.f125805g).add(C5);
            ((List) this.f125804f).add(C5.getUid());
            v10 Y32 = C5.Y3();
            if (Y32 != null) {
                ((List) this.f125808j).add(Y32);
            }
        }
        wy0 N = b40.N(a13);
        if (N != null) {
            ((List) this.f125805g).add(N);
            ((List) this.f125804f).add(N.getUid());
            v10 Y33 = N.Y3();
            if (Y33 != null) {
                ((List) this.f125808j).add(Y33);
            }
        }
        return a13;
    }

    public final void c(String id3) {
        Intrinsics.checkNotNullParameter(id3, "shuffleItemId");
        n0 n0Var = (n0) this.f125801c;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        k kVar = n0Var.f81667a;
        IndexedValue b13 = kVar.b(id3);
        z1 z1Var = b13 != null ? (z1) b13.f80350b : null;
        u1 u1Var = z1Var instanceof u1 ? (u1) z1Var : null;
        if (u1Var != null) {
            kVar.k(id3, false, f0.f81635m);
            j0 j0Var = n0Var.f81675i;
            if (j0Var != null) {
                j.z(j0Var, null, null, new m0(n0Var, u1Var, id3, null), 3);
            } else {
                Intrinsics.r("coroutineScope");
                throw null;
            }
        }
    }
}
