package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class m40 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ancestors_text")
    private List<String> f39991a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39992b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("isFreeformTag")
    private Boolean f39993c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("level")
    private Integer f39994d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("taxonomy_minimal_text")
    private String f39995e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("taxonomy_text")
    private String f39996f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("text")
    private String f39997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39998h;

    public /* synthetic */ m40(List list, String str, Boolean bool, Integer num, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(list, str, bool, num, str2, str3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39992b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return Objects.equals(this.f39994d, m40Var.f39994d) && Objects.equals(this.f39993c, m40Var.f39993c) && Objects.equals(this.f39991a, m40Var.f39991a) && Objects.equals(this.f39992b, m40Var.f39992b) && Objects.equals(this.f39995e, m40Var.f39995e) && Objects.equals(this.f39996f, m40Var.f39996f) && Objects.equals(this.f39997g, m40Var.f39997g);
    }

    public final int hashCode() {
        return Objects.hash(this.f39991a, this.f39992b, this.f39993c, this.f39994d, this.f39995e, this.f39996f, this.f39997g);
    }

    public final Boolean l() {
        Boolean bool = this.f39993c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String n() {
        return this.f39997g;
    }

    public m40() {
        this.f39998h = new boolean[7];
    }

    private m40(List<String> list, @NonNull String str, Boolean bool, Integer num, String str2, String str3, String str4, boolean[] zArr) {
        this.f39991a = list;
        this.f39992b = str;
        this.f39993c = bool;
        this.f39994d = num;
        this.f39995e = str2;
        this.f39996f = str3;
        this.f39997g = str4;
        this.f39998h = zArr;
    }
}
