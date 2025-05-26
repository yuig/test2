package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class w00 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43124a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43125b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("current_status")
    private String f43126c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("formatted_create_date")
    private String f43127d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("order_confirmation_number")
    private String f43128e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("order_line_items")
    private List<a10> f43129f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("partner_order_id")
    private String f43130g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43131h;

    public /* synthetic */ w00(String str, String str2, String str3, String str4, String str5, List list, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, list, str6, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43124a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return Objects.equals(this.f43124a, w00Var.f43124a) && Objects.equals(this.f43125b, w00Var.f43125b) && Objects.equals(this.f43126c, w00Var.f43126c) && Objects.equals(this.f43127d, w00Var.f43127d) && Objects.equals(this.f43128e, w00Var.f43128e) && Objects.equals(this.f43129f, w00Var.f43129f) && Objects.equals(this.f43130g, w00Var.f43130g);
    }

    public final int hashCode() {
        return Objects.hash(this.f43124a, this.f43125b, this.f43126c, this.f43127d, this.f43128e, this.f43129f, this.f43130g);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43125b;
    }

    public w00() {
        this.f43131h = new boolean[7];
    }

    private w00(@NonNull String str, String str2, String str3, String str4, String str5, List<a10> list, String str6, boolean[] zArr) {
        this.f43124a = str;
        this.f43125b = str2;
        this.f43126c = str3;
        this.f43127d = str4;
        this.f43128e = str5;
        this.f43129f = list;
        this.f43130g = str6;
        this.f43131h = zArr;
    }
}
