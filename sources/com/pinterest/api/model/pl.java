package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class pl {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41016a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41018c;

    public /* synthetic */ pl(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pl plVar = (pl) obj;
        return Objects.equals(this.f41016a, plVar.f41016a) && Objects.equals(this.f41017b, plVar.f41017b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41016a, this.f41017b);
    }

    public pl() {
        this.f41018c = new boolean[2];
    }

    private pl(@NonNull String str, String str2, boolean[] zArr) {
        this.f41016a = str;
        this.f41017b = str2;
        this.f41018c = zArr;
    }
}
