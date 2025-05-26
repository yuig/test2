package uk1;

import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.w0;
import h32.w3;
import h32.x3;
import java.util.HashMap;
import kotlin.collections.z0;
import nx.d0;
import nx.f0;
import nx.i1;
import nx.m;
import pk.a0;

/* loaded from: classes2.dex */
public class d implements i1 {

    /* renamed from: a */
    public final d0 f122379a;

    /* renamed from: b */
    public String f122380b;

    /* renamed from: c */
    public final e3.a f122381c;

    /* renamed from: d */
    public String f122382d;

    /* renamed from: e */
    public String f122383e;

    /* renamed from: f */
    public String f122384f;

    public d(String str, e3.a aVar, f0 f0Var) {
        this.f122383e = null;
        this.f122384f = null;
        this.f122379a = ((m) f0Var).a(this);
        this.f122380b = str;
        this.f122381c = aVar;
    }

    @Override // nx.i1
    public g0 b2() {
        return null;
    }

    public final void c(a4 a4Var, d4 d4Var, String str) {
        d(d4Var, a4Var, str, null, null);
    }

    public final void d(d4 d4Var, a4 a4Var, String str, g0 g0Var, String str2) {
        this.f122381c.p(d4Var, a4Var, g0Var, null);
        this.f122382d = str;
        String str3 = this.f122380b;
        if (str3 != null) {
            str2 = str3;
        }
        this.f122380b = str2;
    }

    @Override // nx.i1
    public w0 e() {
        if (this.f122384f == null) {
            return null;
        }
        z0.d();
        return new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, this.f122384f, null, null, null, null);
    }

    public g0 f() {
        return (g0) this.f122381c.f56998d;
    }

    public String g() {
        return this.f122380b;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        String g13 = g();
        return new i0(j(), i(), h(g13), f(), null, null);
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f122382d;
    }

    public x3 h(String str) {
        if (a0.s0(str)) {
            return null;
        }
        w3 w3Var = new w3();
        w3Var.f67367f = str;
        w3Var.f67378q = this.f122383e;
        return w3Var.a();
    }

    public a4 i() {
        return (a4) this.f122381c.f56997c;
    }

    public d4 j() {
        return (d4) this.f122381c.f56996b;
    }

    public final void k() {
        this.f122381c.f56995a = false;
    }

    @Override // nx.i1
    /* renamed from: t5 */
    public HashMap getF63135d0() {
        return (HashMap) this.f122381c.f56999e;
    }

    public d(e3.a aVar, d0 d0Var, String str) {
        this.f122383e = null;
        this.f122384f = null;
        this.f122379a = d0Var;
        this.f122380b = str;
        this.f122381c = aVar;
    }

    public d(f0 f0Var) {
        this.f122383e = null;
        this.f122384f = null;
        this.f122379a = ((m) f0Var).a(this);
        this.f122380b = "";
        this.f122381c = new e3.a(5);
    }
}
