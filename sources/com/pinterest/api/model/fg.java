package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class fg {

    /* renamed from: a, reason: collision with root package name */
    @om.b("engagement_count")
    private Integer f37659a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("engagement_goal")
    private Integer f37660b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37661c;

    public /* synthetic */ fg(Integer num, Integer num2, boolean[] zArr, int i13) {
        this(num, num2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fg fgVar = (fg) obj;
        return Objects.equals(this.f37660b, fgVar.f37660b) && Objects.equals(this.f37659a, fgVar.f37659a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37659a, this.f37660b);
    }

    public fg() {
        this.f37661c = new boolean[2];
    }

    private fg(Integer num, Integer num2, boolean[] zArr) {
        this.f37659a = num;
        this.f37660b = num2;
        this.f37661c = zArr;
    }
}
