package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class nx {

    /* renamed from: a, reason: collision with root package name */
    @om.b("num_clickthroughs")
    private Integer f40523a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("num_closeups")
    private Integer f40524b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("num_impressions")
    private Integer f40525c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("num_repins")
    private Integer f40526d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40527e;

    public /* synthetic */ nx(Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr, int i13) {
        this(num, num2, num3, num4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nx nxVar = (nx) obj;
        return Objects.equals(this.f40526d, nxVar.f40526d) && Objects.equals(this.f40525c, nxVar.f40525c) && Objects.equals(this.f40524b, nxVar.f40524b) && Objects.equals(this.f40523a, nxVar.f40523a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40523a, this.f40524b, this.f40525c, this.f40526d);
    }

    public nx() {
        this.f40527e = new boolean[4];
    }

    private nx(Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr) {
        this.f40523a = num;
        this.f40524b = num2;
        this.f40525c = num3;
        this.f40526d = num4;
        this.f40527e = zArr;
    }
}
