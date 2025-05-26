package a7;

import a.cb;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import pk.v2;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1071g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f1072a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f1073b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f1074c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f1075d;

    /* renamed from: e, reason: collision with root package name */
    public final y f1076e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f1077f;

    static {
        w wVar = new w();
        pk.y0 y0Var = pk.c1.f100372b;
        v2 v2Var = v2.f100502e;
        Collections.emptyList();
        v2 v2Var2 = v2.f100502e;
        b0 b0Var = new b0();
        e0 e0Var = e0.f982d;
        wVar.a();
        b0Var.a();
        l0 l0Var = l0.I;
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
    }

    public i0(String str, y yVar, d0 d0Var, c0 c0Var, l0 l0Var, e0 e0Var) {
        this.f1072a = str;
        this.f1073b = d0Var;
        this.f1074c = c0Var;
        this.f1075d = l0Var;
        this.f1076e = yVar;
        this.f1077f = e0Var;
    }

    public static i0 b(String str) {
        d0 d0Var;
        w wVar = new w();
        z zVar = new z();
        List emptyList = Collections.emptyList();
        v2 v2Var = v2.f100502e;
        b0 b0Var = new b0();
        e0 e0Var = e0.f982d;
        Uri parse = str == null ? null : Uri.parse(str);
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        if (parse != null) {
            d0Var = new d0(parse, null, zVar.f1243a != null ? new a0(zVar) : null, emptyList, null, v2Var, null, -9223372036854775807L);
        } else {
            d0Var = null;
        }
        return new i0("", new y(wVar), d0Var, new c0(b0Var), l0.I, e0Var);
    }

    public final v a() {
        v vVar = new v();
        w wVar = new w();
        y yVar = this.f1076e;
        wVar.f1230a = yVar.f1235a;
        wVar.f1231b = yVar.f1236b;
        wVar.f1232c = yVar.f1237c;
        wVar.f1233d = yVar.f1238d;
        wVar.f1234e = yVar.f1239e;
        vVar.f1220d = wVar;
        vVar.f1217a = this.f1072a;
        vVar.f1227k = this.f1075d;
        vVar.f1228l = this.f1074c.a();
        vVar.f1229m = this.f1077f;
        d0 d0Var = this.f1073b;
        if (d0Var != null) {
            vVar.f1223g = d0Var.f973e;
            vVar.f1219c = d0Var.f970b;
            vVar.f1218b = d0Var.f969a;
            vVar.f1222f = d0Var.f972d;
            vVar.f1224h = d0Var.f974f;
            vVar.f1225i = d0Var.f975g;
            a0 a0Var = d0Var.f971c;
            vVar.f1221e = a0Var != null ? a0Var.b() : new z();
            vVar.f1226j = d0Var.f976h;
        }
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Objects.equals(this.f1072a, i0Var.f1072a) && this.f1076e.equals(i0Var.f1076e) && Objects.equals(this.f1073b, i0Var.f1073b) && Objects.equals(this.f1074c, i0Var.f1074c) && Objects.equals(this.f1075d, i0Var.f1075d) && Objects.equals(this.f1077f, i0Var.f1077f);
    }

    public final int hashCode() {
        int hashCode = this.f1072a.hashCode() * 31;
        d0 d0Var = this.f1073b;
        return this.f1077f.hashCode() + ((this.f1075d.hashCode() + ((this.f1076e.hashCode() + ((this.f1074c.hashCode() + ((hashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
