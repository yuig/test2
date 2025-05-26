package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class pe {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40940a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40941b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("position")
    private Integer f40942c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("text")
    private String f40943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40944e;

    public /* synthetic */ pe(String str, String str2, Integer num, String str3, boolean[] zArr, int i13) {
        this(str, str2, num, str3, zArr);
    }

    public final Integer e() {
        Integer num = this.f40942c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pe peVar = (pe) obj;
        return Objects.equals(this.f40942c, peVar.f40942c) && Objects.equals(this.f40940a, peVar.f40940a) && Objects.equals(this.f40941b, peVar.f40941b) && Objects.equals(this.f40943d, peVar.f40943d);
    }

    public final boolean f() {
        boolean[] zArr = this.f40944e;
        return zArr.length > 2 && zArr[2];
    }

    public final String g() {
        return this.f40943d;
    }

    public final int hashCode() {
        return Objects.hash(this.f40940a, this.f40941b, this.f40942c, this.f40943d);
    }

    public pe() {
        this.f40944e = new boolean[4];
    }

    private pe(@NonNull String str, String str2, Integer num, String str3, boolean[] zArr) {
        this.f40940a = str;
        this.f40941b = str2;
        this.f40942c = num;
        this.f40943d = str3;
        this.f40944e = zArr;
    }
}
