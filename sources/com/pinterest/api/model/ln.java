package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ln {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39824a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39825b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cta_description")
    private String f39826c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("icon")
    private Integer f39827d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("promo_ad_type")
    private Integer f39828e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("text")
    private String f39829f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39830g;

    public /* synthetic */ ln(String str, String str2, String str3, Integer num, Integer num2, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, num, num2, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ln lnVar = (ln) obj;
        return Objects.equals(this.f39828e, lnVar.f39828e) && Objects.equals(this.f39827d, lnVar.f39827d) && Objects.equals(this.f39824a, lnVar.f39824a) && Objects.equals(this.f39825b, lnVar.f39825b) && Objects.equals(this.f39826c, lnVar.f39826c) && Objects.equals(this.f39829f, lnVar.f39829f);
    }

    public final String g() {
        return this.f39826c;
    }

    public final Integer h() {
        Integer num = this.f39827d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f39824a, this.f39825b, this.f39826c, this.f39827d, this.f39828e, this.f39829f);
    }

    public final Integer i() {
        Integer num = this.f39828e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f39829f;
    }

    public ln() {
        this.f39830g = new boolean[6];
    }

    private ln(@NonNull String str, String str2, String str3, Integer num, Integer num2, String str4, boolean[] zArr) {
        this.f39824a = str;
        this.f39825b = str2;
        this.f39826c = str3;
        this.f39827d = num;
        this.f39828e = num2;
        this.f39829f = str4;
        this.f39830g = zArr;
    }
}
