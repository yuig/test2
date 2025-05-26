package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class j90 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39012a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39013b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("is_default")
    private Boolean f39014c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f39015d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("tab_type")
    private Integer f39016e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39017f;

    public /* synthetic */ j90(String str, String str2, Boolean bool, String str3, Integer num, boolean[] zArr, int i13) {
        this(str, str2, bool, str3, num, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return Objects.equals(this.f39016e, j90Var.f39016e) && Objects.equals(this.f39014c, j90Var.f39014c) && Objects.equals(this.f39012a, j90Var.f39012a) && Objects.equals(this.f39013b, j90Var.f39013b) && Objects.equals(this.f39015d, j90Var.f39015d);
    }

    public final int hashCode() {
        return Objects.hash(this.f39012a, this.f39013b, this.f39014c, this.f39015d, this.f39016e);
    }

    public final Boolean j() {
        Boolean bool = this.f39014c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String k() {
        return this.f39015d;
    }

    public final Integer l() {
        Integer num = this.f39016e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    @Override // dl1.s
    public final String o() {
        return this.f39013b;
    }

    public j90() {
        this.f39017f = new boolean[5];
    }

    private j90(@NonNull String str, String str2, Boolean bool, String str3, Integer num, boolean[] zArr) {
        this.f39012a = str;
        this.f39013b = str2;
        this.f39014c = bool;
        this.f39015d = str3;
        this.f39016e = num;
        this.f39017f = zArr;
    }
}
