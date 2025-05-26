package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("answers")
    private List<String> f38208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38209b;

    public /* synthetic */ h0(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38208a, ((h0) obj).f38208a);
    }

    public final int hashCode() {
        return Objects.hash(this.f38208a);
    }

    public h0() {
        this.f38209b = new boolean[1];
    }

    private h0(@NonNull List<String> list, boolean[] zArr) {
        this.f38208a = list;
        this.f38209b = zArr;
    }
}
