package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v2 implements z40.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f133525a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f133526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133527c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133528d;

    /* renamed from: e, reason: collision with root package name */
    public final String f133529e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f133530f;

    /* renamed from: g, reason: collision with root package name */
    public final u2 f133531g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f133532h;

    /* renamed from: i, reason: collision with root package name */
    public final d2 f133533i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f133534j;

    /* renamed from: k, reason: collision with root package name */
    public final a2 f133535k;

    public v2(String __typename, Object obj, String id3, String entityId, String str, Date date, u2 u2Var, c2 c2Var, d2 d2Var, n1 n1Var, a2 a2Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133525a = __typename;
        this.f133526b = obj;
        this.f133527c = id3;
        this.f133528d = entityId;
        this.f133529e = str;
        this.f133530f = date;
        this.f133531g = u2Var;
        this.f133532h = c2Var;
        this.f133533i = d2Var;
        this.f133534j = n1Var;
        this.f133535k = a2Var;
    }

    @Override // z40.s
    public final z40.q b() {
        return this.f133533i;
    }

    @Override // z40.s
    public final z40.o e() {
        return this.f133534j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.d(this.f133525a, v2Var.f133525a) && Intrinsics.d(this.f133526b, v2Var.f133526b) && Intrinsics.d(this.f133527c, v2Var.f133527c) && Intrinsics.d(this.f133528d, v2Var.f133528d) && Intrinsics.d(this.f133529e, v2Var.f133529e) && Intrinsics.d(this.f133530f, v2Var.f133530f) && Intrinsics.d(this.f133531g, v2Var.f133531g) && Intrinsics.d(this.f133532h, v2Var.f133532h) && Intrinsics.d(this.f133533i, v2Var.f133533i) && Intrinsics.d(this.f133534j, v2Var.f133534j) && Intrinsics.d(this.f133535k, v2Var.f133535k);
    }

    @Override // z40.s
    public final String f() {
        return this.f133529e;
    }

    @Override // z40.s
    public final z40.r g() {
        return this.f133531g;
    }

    @Override // z40.s
    public final z40.p getPin() {
        return this.f133535k;
    }

    public final int hashCode() {
        int hashCode = this.f133525a.hashCode() * 31;
        Object obj = this.f133526b;
        int d2 = a.cb.d(this.f133528d, a.cb.d(this.f133527c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31);
        String str = this.f133529e;
        int hashCode2 = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f133530f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        u2 u2Var = this.f133531g;
        int hashCode4 = (hashCode3 + (u2Var == null ? 0 : u2Var.hashCode())) * 31;
        c2 c2Var = this.f133532h;
        int hashCode5 = (hashCode4 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        d2 d2Var = this.f133533i;
        int hashCode6 = (hashCode5 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        n1 n1Var = this.f133534j;
        int hashCode7 = (hashCode6 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        a2 a2Var = this.f133535k;
        return hashCode7 + (a2Var != null ? a2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LastMessage(__typename=" + this.f133525a + ", type=" + this.f133526b + ", id=" + this.f133527c + ", entityId=" + this.f133528d + ", text=" + this.f133529e + ", createdAt=" + this.f133530f + ", userDidItData=" + this.f133531g + ", sender=" + this.f133532h + ", user=" + this.f133533i + ", board=" + this.f133534j + ", pin=" + this.f133535k + ")";
    }
}
