package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class cf implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36402a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36403b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("anchor_message")
    private mv f36404c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f36405d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("replies_count")
    private Integer f36406e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36407f;

    public /* synthetic */ cf(String str, String str2, mv mvVar, Date date, Integer num, boolean[] zArr, int i13) {
        this(str, str2, mvVar, date, num, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f36402a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cf cfVar = (cf) obj;
        return Objects.equals(this.f36406e, cfVar.f36406e) && Objects.equals(this.f36402a, cfVar.f36402a) && Objects.equals(this.f36403b, cfVar.f36403b) && Objects.equals(this.f36404c, cfVar.f36404c) && Objects.equals(this.f36405d, cfVar.f36405d);
    }

    public final int hashCode() {
        return Objects.hash(this.f36402a, this.f36403b, this.f36404c, this.f36405d, this.f36406e);
    }

    public final mv j() {
        return this.f36404c;
    }

    public final Integer k() {
        Integer num = this.f36406e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    @Override // dl1.s
    public final String o() {
        return this.f36403b;
    }

    public cf() {
        this.f36407f = new boolean[5];
    }

    private cf(@NonNull String str, String str2, mv mvVar, Date date, Integer num, boolean[] zArr) {
        this.f36402a = str;
        this.f36403b = str2;
        this.f36404c = mvVar;
        this.f36405d = date;
        this.f36406e = num;
        this.f36407f = zArr;
    }
}
