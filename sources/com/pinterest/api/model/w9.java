package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class w9 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43191a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43192b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board_note")
    private g9 f43193c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f43194d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("creator")
    private wy0 f43195e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pins")
    private List<f30> f43196f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("updated_at")
    private Date f43197g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43198h;

    public /* synthetic */ w9(String str, String str2, g9 g9Var, Date date, wy0 wy0Var, List list, Date date2, boolean[] zArr, int i13) {
        this(str, str2, g9Var, date, wy0Var, list, date2, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f43191a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return Objects.equals(this.f43191a, w9Var.f43191a) && Objects.equals(this.f43192b, w9Var.f43192b) && Objects.equals(this.f43193c, w9Var.f43193c) && Objects.equals(this.f43194d, w9Var.f43194d) && Objects.equals(this.f43195e, w9Var.f43195e) && Objects.equals(this.f43196f, w9Var.f43196f) && Objects.equals(this.f43197g, w9Var.f43197g);
    }

    public final int hashCode() {
        return Objects.hash(this.f43191a, this.f43192b, this.f43193c, this.f43194d, this.f43195e, this.f43196f, this.f43197g);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43192b;
    }

    public w9() {
        this.f43198h = new boolean[7];
    }

    private w9(@NonNull String str, String str2, g9 g9Var, Date date, wy0 wy0Var, List<f30> list, Date date2, boolean[] zArr) {
        this.f43191a = str;
        this.f43192b = str2;
        this.f43193c = g9Var;
        this.f43194d = date;
        this.f43195e = wy0Var;
        this.f43196f = list;
        this.f43197g = date2;
        this.f43198h = zArr;
    }
}
