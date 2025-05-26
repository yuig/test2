package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131299d;

    /* renamed from: e, reason: collision with root package name */
    public String f131300e;

    /* renamed from: f, reason: collision with root package name */
    public String f131301f;

    /* renamed from: g, reason: collision with root package name */
    public String f131302g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f131303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f131304i;

    /* renamed from: j, reason: collision with root package name */
    public String f131305j;

    /* renamed from: k, reason: collision with root package name */
    public String f131306k;

    /* renamed from: l, reason: collision with root package name */
    public int f131307l;

    /* renamed from: m, reason: collision with root package name */
    public String f131308m;

    /* renamed from: n, reason: collision with root package name */
    public String f131309n;

    /* renamed from: o, reason: collision with root package name */
    public String f131310o;

    /* renamed from: p, reason: collision with root package name */
    public h32.k2 f131311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(String pinId) {
        super(pinId);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f131299d = pinId;
    }

    public final void b(String str) {
        this.f131300e = str;
    }

    public final void c(int i13) {
        this.f131307l = i13;
    }

    public final void d(String str) {
        this.f131308m = str;
    }

    public final void e(String str) {
        this.f131306k = str;
    }

    @Override // dl1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        if (!Intrinsics.d(this.f131299d, c2Var.f131299d) || !Intrinsics.d(this.f131300e, c2Var.f131300e) || !Intrinsics.d(this.f131301f, c2Var.f131301f) || !Intrinsics.d(this.f131305j, c2Var.f131305j)) {
            return false;
        }
        c2Var.getClass();
        return Intrinsics.d(null, null);
    }

    public final void f(String str) {
        this.f131305j = str;
    }

    public final void g(String str) {
        this.f131309n = str;
    }

    public final void h(boolean z13) {
        this.f131303h = z13;
    }

    @Override // dl1.u
    public final int hashCode() {
        int hashCode = this.f131299d.hashCode() * 31;
        String str = this.f131300e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131301f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131305j;
        return (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final void i() {
        this.f131304i = false;
    }

    public final void j(String str) {
        this.f131302g = str;
    }
}
