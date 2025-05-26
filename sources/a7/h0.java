package a7;

import a.cb;
import android.net.Uri;
import java.util.Objects;

/* loaded from: classes3.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1056c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1057d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1059f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1060g;

    static {
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
        d7.n0.Q(6);
    }

    public h0(g0 g0Var) {
        this.f1054a = (Uri) g0Var.f1022c;
        this.f1055b = (String) g0Var.f1023d;
        this.f1056c = (String) g0Var.f1024e;
        this.f1057d = g0Var.f1020a;
        this.f1058e = g0Var.f1021b;
        this.f1059f = (String) g0Var.f1025f;
        this.f1060g = (String) g0Var.f1026g;
    }

    public final g0 a() {
        g0 g0Var = new g0();
        g0Var.f1022c = this.f1054a;
        g0Var.f1023d = this.f1055b;
        g0Var.f1024e = this.f1056c;
        g0Var.f1020a = this.f1057d;
        g0Var.f1021b = this.f1058e;
        g0Var.f1025f = this.f1059f;
        g0Var.f1026g = this.f1060g;
        return g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f1054a.equals(h0Var.f1054a) && Objects.equals(this.f1055b, h0Var.f1055b) && Objects.equals(this.f1056c, h0Var.f1056c) && this.f1057d == h0Var.f1057d && this.f1058e == h0Var.f1058e && Objects.equals(this.f1059f, h0Var.f1059f) && Objects.equals(this.f1060g, h0Var.f1060g);
    }

    public final int hashCode() {
        int hashCode = this.f1054a.hashCode() * 31;
        String str = this.f1055b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1056c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1057d) * 31) + this.f1058e) * 31;
        String str3 = this.f1059f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1060g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
