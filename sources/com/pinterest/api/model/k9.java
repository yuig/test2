package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class k9 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39338a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39339b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board_note")
    private g9 f39340c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f39341d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("creator")
    private wy0 f39342e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("items")
    private List<o9> f39343f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("updated_at")
    private Date f39344g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39345h;

    public /* synthetic */ k9(String str, String str2, g9 g9Var, Date date, wy0 wy0Var, List list, Date date2, boolean[] zArr, int i13) {
        this(str, str2, g9Var, date, wy0Var, list, date2, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f39338a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k9 k9Var = (k9) obj;
        return Objects.equals(this.f39338a, k9Var.f39338a) && Objects.equals(this.f39339b, k9Var.f39339b) && Objects.equals(this.f39340c, k9Var.f39340c) && Objects.equals(this.f39341d, k9Var.f39341d) && Objects.equals(this.f39342e, k9Var.f39342e) && Objects.equals(this.f39343f, k9Var.f39343f) && Objects.equals(this.f39344g, k9Var.f39344g);
    }

    public final int hashCode() {
        return Objects.hash(this.f39338a, this.f39339b, this.f39340c, this.f39341d, this.f39342e, this.f39343f, this.f39344g);
    }

    @Override // dl1.s
    public final String o() {
        return this.f39339b;
    }

    public k9() {
        this.f39345h = new boolean[7];
    }

    private k9(@NonNull String str, String str2, g9 g9Var, Date date, wy0 wy0Var, List<o9> list, Date date2, boolean[] zArr) {
        this.f39338a = str;
        this.f39339b = str2;
        this.f39340c = g9Var;
        this.f39341d = date;
        this.f39342e = wy0Var;
        this.f39343f = list;
        this.f39344g = date2;
        this.f39345h = zArr;
    }
}
