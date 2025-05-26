package a7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import pk.v2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public String f1217a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f1218b;

    /* renamed from: c, reason: collision with root package name */
    public String f1219c;

    /* renamed from: g, reason: collision with root package name */
    public String f1223g;

    /* renamed from: i, reason: collision with root package name */
    public Object f1225i;

    /* renamed from: k, reason: collision with root package name */
    public l0 f1227k;

    /* renamed from: d, reason: collision with root package name */
    public w f1220d = new w();

    /* renamed from: e, reason: collision with root package name */
    public z f1221e = new z();

    /* renamed from: f, reason: collision with root package name */
    public List f1222f = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    public pk.c1 f1224h = v2.f100502e;

    /* renamed from: l, reason: collision with root package name */
    public b0 f1228l = new b0();

    /* renamed from: m, reason: collision with root package name */
    public e0 f1229m = e0.f982d;

    /* renamed from: j, reason: collision with root package name */
    public long f1226j = -9223372036854775807L;

    public final i0 a() {
        d0 d0Var;
        z zVar = this.f1221e;
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        Uri uri = this.f1218b;
        if (uri != null) {
            String str = this.f1219c;
            z zVar2 = this.f1221e;
            d0Var = new d0(uri, str, zVar2.f1243a != null ? zVar2.a() : null, this.f1222f, this.f1223g, this.f1224h, this.f1225i, this.f1226j);
        } else {
            d0Var = null;
        }
        String str2 = this.f1217a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        w wVar = this.f1220d;
        wVar.getClass();
        y yVar = new y(wVar);
        b0 b0Var = this.f1228l;
        b0Var.getClass();
        c0 c0Var = new c0(b0Var);
        l0 l0Var = this.f1227k;
        if (l0Var == null) {
            l0Var = l0.I;
        }
        return new i0(str3, yVar, d0Var, c0Var, l0Var, this.f1229m);
    }

    public final void b(x xVar) {
        w wVar = new w();
        wVar.f1230a = xVar.f1235a;
        wVar.f1231b = xVar.f1236b;
        wVar.f1232c = xVar.f1237c;
        wVar.f1233d = xVar.f1238d;
        wVar.f1234e = xVar.f1239e;
        this.f1220d = wVar;
    }

    public final void c(List list) {
        this.f1224h = pk.c1.r(list);
    }
}
