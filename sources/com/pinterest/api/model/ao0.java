package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ao0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("text")
    private String f35824a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private Integer f35825b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f35826c;

    public /* synthetic */ ao0(String str, Integer num, boolean[] zArr, int i13) {
        this(str, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ao0 ao0Var = (ao0) obj;
        return Objects.equals(this.f35825b, ao0Var.f35825b) && Objects.equals(this.f35824a, ao0Var.f35824a);
    }

    public final int hashCode() {
        return Objects.hash(this.f35824a, this.f35825b);
    }

    public ao0() {
        this.f35826c = new boolean[2];
    }

    private ao0(@NonNull String str, Integer num, boolean[] zArr) {
        this.f35824a = str;
        this.f35825b = num;
        this.f35826c = zArr;
    }
}
