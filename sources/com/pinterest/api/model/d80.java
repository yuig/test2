package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class d80 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36675a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36676b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("post_time_since")
    private String f36677c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("rating")
    private Integer f36678d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("review_text")
    private String f36679e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f36680f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36681g;

    public /* synthetic */ d80(String str, String str2, String str3, Integer num, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36675a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return Objects.equals(this.f36678d, d80Var.f36678d) && Objects.equals(this.f36675a, d80Var.f36675a) && Objects.equals(this.f36676b, d80Var.f36676b) && Objects.equals(this.f36677c, d80Var.f36677c) && Objects.equals(this.f36679e, d80Var.f36679e) && Objects.equals(this.f36680f, d80Var.f36680f);
    }

    public final int hashCode() {
        return Objects.hash(this.f36675a, this.f36676b, this.f36677c, this.f36678d, this.f36679e, this.f36680f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36676b;
    }

    public d80() {
        this.f36681g = new boolean[6];
    }

    private d80(@NonNull String str, String str2, String str3, Integer num, String str4, String str5, boolean[] zArr) {
        this.f36675a = str;
        this.f36676b = str2;
        this.f36677c = str3;
        this.f36678d = num;
        this.f36679e = str4;
        this.f36680f = str5;
        this.f36681g = zArr;
    }
}
