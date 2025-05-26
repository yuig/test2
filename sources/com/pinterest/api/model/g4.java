package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("delta")
    private Double f37958a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f37959b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("value")
    private Integer f37960c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37961d;

    public /* synthetic */ g4(Double d2, String str, Integer num, boolean[] zArr, int i13) {
        this(d2, str, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Objects.equals(this.f37960c, g4Var.f37960c) && Objects.equals(this.f37958a, g4Var.f37958a) && Objects.equals(this.f37959b, g4Var.f37959b);
    }

    public final int hashCode() {
        return Objects.hash(this.f37958a, this.f37959b, this.f37960c);
    }

    private g4(Double d2, String str, Integer num, boolean[] zArr) {
        this.f37958a = d2;
        this.f37959b = str;
        this.f37960c = num;
        this.f37961d = zArr;
    }
}
