package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w8 implements z40.s, z40.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f133597a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f133598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133599c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133600d;

    /* renamed from: e, reason: collision with root package name */
    public final String f133601e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f133602f;

    /* renamed from: g, reason: collision with root package name */
    public final v8 f133603g;

    /* renamed from: h, reason: collision with root package name */
    public final d8 f133604h;

    /* renamed from: i, reason: collision with root package name */
    public final e8 f133605i;

    /* renamed from: j, reason: collision with root package name */
    public final o7 f133606j;

    /* renamed from: k, reason: collision with root package name */
    public final b8 f133607k;

    public w8(String __typename, Object obj, String id3, String entityId, String str, Date date, v8 v8Var, d8 d8Var, e8 e8Var, o7 o7Var, b8 b8Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133597a = __typename;
        this.f133598b = obj;
        this.f133599c = id3;
        this.f133600d = entityId;
        this.f133601e = str;
        this.f133602f = date;
        this.f133603g = v8Var;
        this.f133604h = d8Var;
        this.f133605i = e8Var;
        this.f133606j = o7Var;
        this.f133607k = b8Var;
    }

    @Override // z40.h
    public final String a() {
        return this.f133600d;
    }

    @Override // z40.s
    public final z40.q b() {
        return this.f133605i;
    }

    @Override // z40.h
    public final z40.g c() {
        return this.f133604h;
    }

    @Override // z40.h
    public final Date d() {
        return this.f133602f;
    }

    @Override // z40.s
    public final z40.o e() {
        return this.f133606j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return Intrinsics.d(this.f133597a, w8Var.f133597a) && Intrinsics.d(this.f133598b, w8Var.f133598b) && Intrinsics.d(this.f133599c, w8Var.f133599c) && Intrinsics.d(this.f133600d, w8Var.f133600d) && Intrinsics.d(this.f133601e, w8Var.f133601e) && Intrinsics.d(this.f133602f, w8Var.f133602f) && Intrinsics.d(this.f133603g, w8Var.f133603g) && Intrinsics.d(this.f133604h, w8Var.f133604h) && Intrinsics.d(this.f133605i, w8Var.f133605i) && Intrinsics.d(this.f133606j, w8Var.f133606j) && Intrinsics.d(this.f133607k, w8Var.f133607k);
    }

    @Override // z40.s
    public final String f() {
        return this.f133601e;
    }

    @Override // z40.s
    public final z40.r g() {
        return this.f133603g;
    }

    @Override // z40.s
    public final z40.p getPin() {
        return this.f133607k;
    }

    public final int hashCode() {
        int hashCode = this.f133597a.hashCode() * 31;
        Object obj = this.f133598b;
        int d2 = a.cb.d(this.f133600d, a.cb.d(this.f133599c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31);
        String str = this.f133601e;
        int hashCode2 = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f133602f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        v8 v8Var = this.f133603g;
        int hashCode4 = (hashCode3 + (v8Var == null ? 0 : v8Var.hashCode())) * 31;
        d8 d8Var = this.f133604h;
        int hashCode5 = (hashCode4 + (d8Var == null ? 0 : d8Var.hashCode())) * 31;
        e8 e8Var = this.f133605i;
        int hashCode6 = (hashCode5 + (e8Var == null ? 0 : e8Var.hashCode())) * 31;
        o7 o7Var = this.f133606j;
        int hashCode7 = (hashCode6 + (o7Var == null ? 0 : o7Var.hashCode())) * 31;
        b8 b8Var = this.f133607k;
        return hashCode7 + (b8Var != null ? b8Var.hashCode() : 0);
    }

    public final String toString() {
        return "LastMessage(__typename=" + this.f133597a + ", type=" + this.f133598b + ", id=" + this.f133599c + ", entityId=" + this.f133600d + ", text=" + this.f133601e + ", createdAt=" + this.f133602f + ", userDidItData=" + this.f133603g + ", sender=" + this.f133604h + ", user=" + this.f133605i + ", board=" + this.f133606j + ", pin=" + this.f133607k + ")";
    }
}
