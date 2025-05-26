package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class eq0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("text")
    private String f37332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37333b;

    public /* synthetic */ eq0(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f37332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f37332a, ((eq0) obj).f37332a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37332a);
    }

    public eq0() {
        this.f37333b = new boolean[1];
    }

    private eq0(@NonNull String str, boolean[] zArr) {
        this.f37332a = str;
        this.f37333b = zArr;
    }
}
