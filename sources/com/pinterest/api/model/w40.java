package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class w40 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43170a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43171b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("created_at")
    private Date f43172c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("text")
    private String f43173d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("updated_at")
    private Date f43174e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43175f;

    public /* synthetic */ w40(String str, String str2, Date date, String str3, Date date2, boolean[] zArr, int i13) {
        this(str, str2, date, str3, date2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43170a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w40 w40Var = (w40) obj;
        return Objects.equals(this.f43170a, w40Var.f43170a) && Objects.equals(this.f43171b, w40Var.f43171b) && Objects.equals(this.f43172c, w40Var.f43172c) && Objects.equals(this.f43173d, w40Var.f43173d) && Objects.equals(this.f43174e, w40Var.f43174e);
    }

    public final int hashCode() {
        return Objects.hash(this.f43170a, this.f43171b, this.f43172c, this.f43173d, this.f43174e);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43171b;
    }

    public w40() {
        this.f43175f = new boolean[5];
    }

    private w40(@NonNull String str, String str2, Date date, String str3, Date date2, boolean[] zArr) {
        this.f43170a = str;
        this.f43171b = str2;
        this.f43172c = date;
        this.f43173d = str3;
        this.f43174e = date2;
        this.f43175f = zArr;
    }
}
