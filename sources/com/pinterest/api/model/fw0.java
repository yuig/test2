package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class fw0 implements dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f37822a;

    /* renamed from: b */
    @om.b("node_id")
    private String f37823b;

    /* renamed from: c */
    @om.b("aggregated_comment")
    private z2 f37824c;

    /* renamed from: d */
    @om.b("content")
    private String f37825d;

    /* renamed from: e */
    @om.b("parent_id")
    private String f37826e;

    /* renamed from: f */
    @om.b("pin")
    private f30 f37827f;

    /* renamed from: g */
    @om.b("seen")
    private Boolean f37828g;

    /* renamed from: h */
    @om.b("source_id")
    private String f37829h;

    /* renamed from: i */
    @om.b("source_type")
    private a f37830i;

    /* renamed from: j */
    @om.b("timestamp")
    private Integer f37831j;

    /* renamed from: k */
    @om.b("type")
    private String f37832k;

    /* renamed from: l */
    @om.b("user")
    private wy0 f37833l;

    /* renamed from: m */
    @om.b("user_did_it_data")
    private az0 f37834m;

    /* renamed from: n */
    public final boolean[] f37835n;

    /* loaded from: classes3.dex */
    public enum a {
        TRY,
        PIN_COMMENT,
        PIN_MENTION,
        COMMENT_MENTION,
        UNKNOWN
    }

    public /* synthetic */ fw0(String str, String str2, z2 z2Var, String str3, String str4, f30 f30Var, Boolean bool, String str5, a aVar, Integer num, String str6, wy0 wy0Var, az0 az0Var, boolean[] zArr, int i13) {
        this(str, str2, z2Var, str3, str4, f30Var, bool, str5, aVar, num, str6, wy0Var, az0Var, zArr);
    }

    public final Boolean A() {
        Boolean bool = this.f37828g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String B() {
        return this.f37829h;
    }

    public final a C() {
        return this.f37830i;
    }

    public final Integer D() {
        Integer num = this.f37831j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final wy0 E() {
        return this.f37833l;
    }

    public final az0 F() {
        return this.f37834m;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f37822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fw0 fw0Var = (fw0) obj;
        return Objects.equals(this.f37831j, fw0Var.f37831j) && Objects.equals(this.f37830i, fw0Var.f37830i) && Objects.equals(this.f37828g, fw0Var.f37828g) && Objects.equals(this.f37822a, fw0Var.f37822a) && Objects.equals(this.f37823b, fw0Var.f37823b) && Objects.equals(this.f37824c, fw0Var.f37824c) && Objects.equals(this.f37825d, fw0Var.f37825d) && Objects.equals(this.f37826e, fw0Var.f37826e) && Objects.equals(this.f37827f, fw0Var.f37827f) && Objects.equals(this.f37829h, fw0Var.f37829h) && Objects.equals(this.f37832k, fw0Var.f37832k) && Objects.equals(this.f37833l, fw0Var.f37833l) && Objects.equals(this.f37834m, fw0Var.f37834m);
    }

    public final int hashCode() {
        return Objects.hash(this.f37822a, this.f37823b, this.f37824c, this.f37825d, this.f37826e, this.f37827f, this.f37828g, this.f37829h, this.f37830i, this.f37831j, this.f37832k, this.f37833l, this.f37834m);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37823b;
    }

    public final z2 w() {
        return this.f37824c;
    }

    public final String x() {
        return this.f37825d;
    }

    public final String y() {
        return this.f37826e;
    }

    public final f30 z() {
        return this.f37827f;
    }

    public fw0() {
        this.f37835n = new boolean[13];
    }

    private fw0(@NonNull String str, String str2, z2 z2Var, String str3, String str4, f30 f30Var, Boolean bool, String str5, a aVar, Integer num, String str6, wy0 wy0Var, az0 az0Var, boolean[] zArr) {
        this.f37822a = str;
        this.f37823b = str2;
        this.f37824c = z2Var;
        this.f37825d = str3;
        this.f37826e = str4;
        this.f37827f = f30Var;
        this.f37828g = bool;
        this.f37829h = str5;
        this.f37830i = aVar;
        this.f37831j = num;
        this.f37832k = str6;
        this.f37833l = wy0Var;
        this.f37834m = az0Var;
        this.f37835n = zArr;
    }
}
