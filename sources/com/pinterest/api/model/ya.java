package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ya {

    /* renamed from: a, reason: collision with root package name */
    @om.b("pin_bookmark")
    private String f43986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43987b;

    public /* synthetic */ ya(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f43986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f43986a, ((ya) obj).f43986a);
    }

    public final int hashCode() {
        return Objects.hash(this.f43986a);
    }

    public ya() {
        this.f43987b = new boolean[1];
    }

    private ya(String str, boolean[] zArr) {
        this.f43986a = str;
        this.f43987b = zArr;
    }
}
