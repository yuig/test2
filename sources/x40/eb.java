package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eb implements z40.s, z40.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f132323a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f132324b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132325c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132326d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132327e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f132328f;

    /* renamed from: g, reason: collision with root package name */
    public final db f132329g;

    /* renamed from: h, reason: collision with root package name */
    public final la f132330h;

    /* renamed from: i, reason: collision with root package name */
    public final ma f132331i;

    /* renamed from: j, reason: collision with root package name */
    public final w9 f132332j;

    /* renamed from: k, reason: collision with root package name */
    public final ja f132333k;

    public eb(String __typename, Object obj, String id3, String entityId, String str, Date date, db dbVar, la laVar, ma maVar, w9 w9Var, ja jaVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132323a = __typename;
        this.f132324b = obj;
        this.f132325c = id3;
        this.f132326d = entityId;
        this.f132327e = str;
        this.f132328f = date;
        this.f132329g = dbVar;
        this.f132330h = laVar;
        this.f132331i = maVar;
        this.f132332j = w9Var;
        this.f132333k = jaVar;
    }

    @Override // z40.h
    public final String a() {
        return this.f132326d;
    }

    @Override // z40.s
    public final z40.q b() {
        return this.f132331i;
    }

    @Override // z40.h
    public final z40.g c() {
        return this.f132330h;
    }

    @Override // z40.h
    public final Date d() {
        return this.f132328f;
    }

    @Override // z40.s
    public final z40.o e() {
        return this.f132332j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return Intrinsics.d(this.f132323a, ebVar.f132323a) && Intrinsics.d(this.f132324b, ebVar.f132324b) && Intrinsics.d(this.f132325c, ebVar.f132325c) && Intrinsics.d(this.f132326d, ebVar.f132326d) && Intrinsics.d(this.f132327e, ebVar.f132327e) && Intrinsics.d(this.f132328f, ebVar.f132328f) && Intrinsics.d(this.f132329g, ebVar.f132329g) && Intrinsics.d(this.f132330h, ebVar.f132330h) && Intrinsics.d(this.f132331i, ebVar.f132331i) && Intrinsics.d(this.f132332j, ebVar.f132332j) && Intrinsics.d(this.f132333k, ebVar.f132333k);
    }

    @Override // z40.s
    public final String f() {
        return this.f132327e;
    }

    @Override // z40.s
    public final z40.r g() {
        return this.f132329g;
    }

    @Override // z40.s
    public final z40.p getPin() {
        return this.f132333k;
    }

    public final int hashCode() {
        int hashCode = this.f132323a.hashCode() * 31;
        Object obj = this.f132324b;
        int d2 = a.cb.d(this.f132326d, a.cb.d(this.f132325c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31);
        String str = this.f132327e;
        int hashCode2 = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f132328f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        db dbVar = this.f132329g;
        int hashCode4 = (hashCode3 + (dbVar == null ? 0 : dbVar.hashCode())) * 31;
        la laVar = this.f132330h;
        int hashCode5 = (hashCode4 + (laVar == null ? 0 : laVar.hashCode())) * 31;
        ma maVar = this.f132331i;
        int hashCode6 = (hashCode5 + (maVar == null ? 0 : maVar.hashCode())) * 31;
        w9 w9Var = this.f132332j;
        int hashCode7 = (hashCode6 + (w9Var == null ? 0 : w9Var.hashCode())) * 31;
        ja jaVar = this.f132333k;
        return hashCode7 + (jaVar != null ? jaVar.hashCode() : 0);
    }

    public final String toString() {
        return "LastMessage(__typename=" + this.f132323a + ", type=" + this.f132324b + ", id=" + this.f132325c + ", entityId=" + this.f132326d + ", text=" + this.f132327e + ", createdAt=" + this.f132328f + ", userDidItData=" + this.f132329g + ", sender=" + this.f132330h + ", user=" + this.f132331i + ", board=" + this.f132332j + ", pin=" + this.f132333k + ")";
    }
}
