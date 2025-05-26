package x40;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uc implements z40.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f133464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133465b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133466c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133467d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133468e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f133469f;

    /* renamed from: g, reason: collision with root package name */
    public final oc f133470g;

    /* renamed from: h, reason: collision with root package name */
    public final rc f133471h;

    /* renamed from: i, reason: collision with root package name */
    public final tc f133472i;

    public uc(String __typename, String entityId, String id3, String str, Boolean bool, Date date, oc ocVar, rc rcVar, tc tcVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f133464a = __typename;
        this.f133465b = entityId;
        this.f133466c = id3;
        this.f133467d = str;
        this.f133468e = bool;
        this.f133469f = date;
        this.f133470g = ocVar;
        this.f133471h = rcVar;
        this.f133472i = tcVar;
    }

    public final rc a() {
        return this.f133471h;
    }

    public final String b() {
        return this.f133465b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return Intrinsics.d(this.f133464a, ucVar.f133464a) && Intrinsics.d(this.f133465b, ucVar.f133465b) && Intrinsics.d(this.f133466c, ucVar.f133466c) && Intrinsics.d(this.f133467d, ucVar.f133467d) && Intrinsics.d(this.f133468e, ucVar.f133468e) && Intrinsics.d(this.f133469f, ucVar.f133469f) && Intrinsics.d(this.f133470g, ucVar.f133470g) && Intrinsics.d(this.f133471h, ucVar.f133471h) && Intrinsics.d(this.f133472i, ucVar.f133472i);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133466c, a.cb.d(this.f133465b, this.f133464a.hashCode() * 31, 31), 31);
        String str = this.f133467d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f133468e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.f133469f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        oc ocVar = this.f133470g;
        int hashCode4 = (hashCode3 + (ocVar == null ? 0 : ocVar.hashCode())) * 31;
        rc rcVar = this.f133471h;
        int hashCode5 = (hashCode4 + (rcVar == null ? 0 : rcVar.hashCode())) * 31;
        tc tcVar = this.f133472i;
        return hashCode5 + (tcVar != null ? tcVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.f133464a + ", entityId=" + this.f133465b + ", id=" + this.f133466c + ", type=" + this.f133467d + ", read=" + this.f133468e + ", createdAt=" + this.f133469f + ", board=" + this.f133470g + ", conversation=" + this.f133471h + ", sender=" + this.f133472i + ")";
    }
}
