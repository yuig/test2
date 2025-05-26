package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class xx0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43827a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43828b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("data")
    private List<px0> f43829c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43830d;

    public /* synthetic */ xx0(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xx0 xx0Var = (xx0) obj;
        return Objects.equals(this.f43827a, xx0Var.f43827a) && Objects.equals(this.f43828b, xx0Var.f43828b) && Objects.equals(this.f43829c, xx0Var.f43829c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43827a, this.f43828b, this.f43829c);
    }

    public xx0() {
        this.f43830d = new boolean[3];
    }

    private xx0(@NonNull String str, String str2, @NonNull List<px0> list, boolean[] zArr) {
        this.f43827a = str;
        this.f43828b = str2;
        this.f43829c = list;
        this.f43830d = zArr;
    }
}
