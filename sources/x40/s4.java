package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s4 implements z40.s, z40.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f133227a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f133228b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133229c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133230d;

    /* renamed from: e, reason: collision with root package name */
    public final String f133231e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f133232f;

    /* renamed from: g, reason: collision with root package name */
    public final r4 f133233g;

    /* renamed from: h, reason: collision with root package name */
    public final z3 f133234h;

    /* renamed from: i, reason: collision with root package name */
    public final a4 f133235i;

    /* renamed from: j, reason: collision with root package name */
    public final k3 f133236j;

    /* renamed from: k, reason: collision with root package name */
    public final x3 f133237k;

    public s4(String __typename, Object obj, String id3, String entityId, String str, Date date, r4 r4Var, z3 z3Var, a4 a4Var, k3 k3Var, x3 x3Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133227a = __typename;
        this.f133228b = obj;
        this.f133229c = id3;
        this.f133230d = entityId;
        this.f133231e = str;
        this.f133232f = date;
        this.f133233g = r4Var;
        this.f133234h = z3Var;
        this.f133235i = a4Var;
        this.f133236j = k3Var;
        this.f133237k = x3Var;
    }

    @Override // z40.h
    public final String a() {
        return this.f133230d;
    }

    @Override // z40.s
    public final z40.q b() {
        return this.f133235i;
    }

    @Override // z40.h
    public final z40.g c() {
        return this.f133234h;
    }

    @Override // z40.h
    public final Date d() {
        return this.f133232f;
    }

    @Override // z40.s
    public final z40.o e() {
        return this.f133236j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return Intrinsics.d(this.f133227a, s4Var.f133227a) && Intrinsics.d(this.f133228b, s4Var.f133228b) && Intrinsics.d(this.f133229c, s4Var.f133229c) && Intrinsics.d(this.f133230d, s4Var.f133230d) && Intrinsics.d(this.f133231e, s4Var.f133231e) && Intrinsics.d(this.f133232f, s4Var.f133232f) && Intrinsics.d(this.f133233g, s4Var.f133233g) && Intrinsics.d(this.f133234h, s4Var.f133234h) && Intrinsics.d(this.f133235i, s4Var.f133235i) && Intrinsics.d(this.f133236j, s4Var.f133236j) && Intrinsics.d(this.f133237k, s4Var.f133237k);
    }

    @Override // z40.s
    public final String f() {
        return this.f133231e;
    }

    @Override // z40.s
    public final z40.r g() {
        return this.f133233g;
    }

    @Override // z40.s
    public final z40.p getPin() {
        return this.f133237k;
    }

    public final int hashCode() {
        int hashCode = this.f133227a.hashCode() * 31;
        Object obj = this.f133228b;
        int d2 = a.cb.d(this.f133230d, a.cb.d(this.f133229c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31);
        String str = this.f133231e;
        int hashCode2 = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f133232f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        r4 r4Var = this.f133233g;
        int hashCode4 = (hashCode3 + (r4Var == null ? 0 : r4Var.hashCode())) * 31;
        z3 z3Var = this.f133234h;
        int hashCode5 = (hashCode4 + (z3Var == null ? 0 : z3Var.hashCode())) * 31;
        a4 a4Var = this.f133235i;
        int hashCode6 = (hashCode5 + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
        k3 k3Var = this.f133236j;
        int hashCode7 = (hashCode6 + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        x3 x3Var = this.f133237k;
        return hashCode7 + (x3Var != null ? x3Var.hashCode() : 0);
    }

    public final String toString() {
        return "LastMessage(__typename=" + this.f133227a + ", type=" + this.f133228b + ", id=" + this.f133229c + ", entityId=" + this.f133230d + ", text=" + this.f133231e + ", createdAt=" + this.f133232f + ", userDidItData=" + this.f133233g + ", sender=" + this.f133234h + ", user=" + this.f133235i + ", board=" + this.f133236j + ", pin=" + this.f133237k + ")";
    }
}
