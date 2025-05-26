package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class ot {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40795a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40796b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board")
    private v7 f40797c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f40798d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("email_address")
    private String f40799e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("from_user_id")
    private String f40800f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_url")
    private String f40801g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("invite_category")
    private String f40802h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("invite_channel")
    private String f40803i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_accepted")
    private Boolean f40804j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("sender")
    private wy0 f40805k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f40806l;

    public /* synthetic */ ot(String str, String str2, v7 v7Var, Date date, String str3, String str4, String str5, String str6, String str7, Boolean bool, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, v7Var, date, str3, str4, str5, str6, str7, bool, wy0Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ot otVar = (ot) obj;
        return Objects.equals(this.f40804j, otVar.f40804j) && Objects.equals(this.f40795a, otVar.f40795a) && Objects.equals(this.f40796b, otVar.f40796b) && Objects.equals(this.f40797c, otVar.f40797c) && Objects.equals(this.f40798d, otVar.f40798d) && Objects.equals(this.f40799e, otVar.f40799e) && Objects.equals(this.f40800f, otVar.f40800f) && Objects.equals(this.f40801g, otVar.f40801g) && Objects.equals(this.f40802h, otVar.f40802h) && Objects.equals(this.f40803i, otVar.f40803i) && Objects.equals(this.f40805k, otVar.f40805k);
    }

    public final int hashCode() {
        return Objects.hash(this.f40795a, this.f40796b, this.f40797c, this.f40798d, this.f40799e, this.f40800f, this.f40801g, this.f40802h, this.f40803i, this.f40804j, this.f40805k);
    }

    public ot() {
        this.f40806l = new boolean[11];
    }

    private ot(@NonNull String str, String str2, v7 v7Var, Date date, String str3, String str4, String str5, String str6, String str7, Boolean bool, wy0 wy0Var, boolean[] zArr) {
        this.f40795a = str;
        this.f40796b = str2;
        this.f40797c = v7Var;
        this.f40798d = date;
        this.f40799e = str3;
        this.f40800f = str4;
        this.f40801g = str5;
        this.f40802h = str6;
        this.f40803i = str7;
        this.f40804j = bool;
        this.f40805k = wy0Var;
        this.f40806l = zArr;
    }
}
