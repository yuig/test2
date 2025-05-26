package a7;

import a.cb;
import android.net.Uri;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import pk.v2;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: q */
    public static final Object f927q = new Object();

    /* renamed from: r */
    public static final i0 f928r;

    /* renamed from: b */
    public Object f930b;

    /* renamed from: d */
    public Object f932d;

    /* renamed from: e */
    public long f933e;

    /* renamed from: f */
    public long f934f;

    /* renamed from: g */
    public long f935g;

    /* renamed from: h */
    public boolean f936h;

    /* renamed from: i */
    public boolean f937i;

    /* renamed from: j */
    public c0 f938j;

    /* renamed from: k */
    public boolean f939k;

    /* renamed from: l */
    public long f940l;

    /* renamed from: m */
    public long f941m;

    /* renamed from: n */
    public int f942n;

    /* renamed from: o */
    public int f943o;

    /* renamed from: p */
    public long f944p;

    /* renamed from: a */
    public Object f929a = f927q;

    /* renamed from: c */
    public i0 f931c = f928r;

    static {
        d0 d0Var;
        w wVar = new w();
        z zVar = new z();
        List emptyList = Collections.emptyList();
        v2 v2Var = v2.f100502e;
        b0 b0Var = new b0();
        e0 e0Var = e0.f982d;
        Uri uri = Uri.EMPTY;
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        if (uri != null) {
            d0Var = new d0(uri, null, zVar.f1243a != null ? zVar.a() : null, emptyList, null, v2Var, null, -9223372036854775807L);
        } else {
            d0Var = null;
        }
        f928r = new i0("androidx.media3.common.Timeline", new y(wVar), d0Var, new c0(b0Var), l0.I, e0Var);
        cb.s(1, 2, 3, 4, 5);
        cb.s(6, 7, 8, 9, 10);
        d7.n0.Q(11);
        d7.n0.Q(12);
        d7.n0.Q(13);
    }

    public final long a() {
        return d7.n0.o0(this.f940l);
    }

    public final boolean b() {
        return this.f938j != null;
    }

    public final void c(i0 i0Var, Object obj, long j13, long j14, long j15, boolean z13, boolean z14, c0 c0Var, long j16, long j17, int i13, long j18) {
        d0 d0Var;
        this.f929a = f927q;
        this.f931c = i0Var != null ? i0Var : f928r;
        this.f930b = (i0Var == null || (d0Var = i0Var.f1073b) == null) ? null : d0Var.f975g;
        this.f932d = obj;
        this.f933e = j13;
        this.f934f = j14;
        this.f935g = j15;
        this.f936h = z13;
        this.f937i = z14;
        this.f938j = c0Var;
        this.f940l = j16;
        this.f941m = j17;
        this.f942n = 0;
        this.f943o = i13;
        this.f944p = j18;
        this.f939k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a1.class.equals(obj.getClass())) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Objects.equals(this.f929a, a1Var.f929a) && Objects.equals(this.f931c, a1Var.f931c) && Objects.equals(this.f932d, a1Var.f932d) && Objects.equals(this.f938j, a1Var.f938j) && this.f933e == a1Var.f933e && this.f934f == a1Var.f934f && this.f935g == a1Var.f935g && this.f936h == a1Var.f936h && this.f937i == a1Var.f937i && this.f939k == a1Var.f939k && this.f940l == a1Var.f940l && this.f941m == a1Var.f941m && this.f942n == a1Var.f942n && this.f943o == a1Var.f943o && this.f944p == a1Var.f944p;
    }

    public final int hashCode() {
        int hashCode = (this.f931c.hashCode() + ((this.f929a.hashCode() + RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER) * 31)) * 31;
        Object obj = this.f932d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        c0 c0Var = this.f938j;
        int hashCode3 = (hashCode2 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        long j13 = this.f933e;
        int i13 = (hashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f934f;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f935g;
        int i15 = (((((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f936h ? 1 : 0)) * 31) + (this.f937i ? 1 : 0)) * 31) + (this.f939k ? 1 : 0)) * 31;
        long j16 = this.f940l;
        int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        long j17 = this.f941m;
        int i17 = (((((i16 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + this.f942n) * 31) + this.f943o) * 31;
        long j18 = this.f944p;
        return i17 + ((int) (j18 ^ (j18 >>> 32)));
    }
}
