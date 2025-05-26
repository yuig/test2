package a7;

import a.cb;
import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f919a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f920b;

    /* renamed from: c, reason: collision with root package name */
    public final pk.h1 f921c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f922d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f923e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f924f;

    /* renamed from: g, reason: collision with root package name */
    public final pk.c1 f925g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f926h;

    static {
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
        d7.n0.Q(6);
        d7.n0.Q(7);
    }

    public a0(z zVar) {
        boolean z13 = zVar.f1248f;
        Uri uri = zVar.f1244b;
        bf.b.t((z13 && uri == null) ? false : true);
        UUID uuid = zVar.f1243a;
        uuid.getClass();
        this.f919a = uuid;
        this.f920b = uri;
        this.f921c = zVar.f1245c;
        this.f922d = zVar.f1246d;
        this.f924f = zVar.f1248f;
        this.f923e = zVar.f1247e;
        this.f925g = zVar.f1249g;
        byte[] bArr = zVar.f1250h;
        this.f926h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final z b() {
        z zVar = new z();
        zVar.f1243a = this.f919a;
        zVar.f1244b = this.f920b;
        zVar.f1245c = this.f921c;
        zVar.f1246d = this.f922d;
        zVar.f1247e = this.f923e;
        zVar.f1248f = this.f924f;
        zVar.f1249g = this.f925g;
        zVar.f1250h = this.f926h;
        return zVar;
    }

    public final byte[] c() {
        byte[] bArr = this.f926h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f919a.equals(a0Var.f919a) && Objects.equals(this.f920b, a0Var.f920b) && Objects.equals(this.f921c, a0Var.f921c) && this.f922d == a0Var.f922d && this.f924f == a0Var.f924f && this.f923e == a0Var.f923e && this.f925g.equals(a0Var.f925g) && Arrays.equals(this.f926h, a0Var.f926h);
    }

    public final int hashCode() {
        int hashCode = this.f919a.hashCode() * 31;
        Uri uri = this.f920b;
        return Arrays.hashCode(this.f926h) + ((this.f925g.hashCode() + ((((((((this.f921c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f922d ? 1 : 0)) * 31) + (this.f924f ? 1 : 0)) * 31) + (this.f923e ? 1 : 0)) * 31)) * 31);
    }
}
