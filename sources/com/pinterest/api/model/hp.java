package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class hp {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("board_id")
    private String f38509a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38510b;

    public /* synthetic */ hp(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f38509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38509a, ((hp) obj).f38509a);
    }

    public final int hashCode() {
        return Objects.hash(this.f38509a);
    }

    public hp() {
        this.f38510b = new boolean[1];
    }

    private hp(@NonNull String str, boolean[] zArr) {
        this.f38509a = str;
        this.f38510b = zArr;
    }
}
