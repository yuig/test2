package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class no0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f40448a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("audio")
    private mk0 f40449b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("provider_recording_id")
    private String f40450c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f40451d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40452e;

    public /* synthetic */ no0(Integer num, mk0 mk0Var, String str, String str2, boolean[] zArr, int i13) {
        this(num, mk0Var, str, str2, zArr);
    }

    public final mk0 e() {
        return this.f40449b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        no0 no0Var = (no0) obj;
        return Objects.equals(this.f40448a, no0Var.f40448a) && Objects.equals(this.f40449b, no0Var.f40449b) && Objects.equals(this.f40450c, no0Var.f40450c) && Objects.equals(this.f40451d, no0Var.f40451d);
    }

    public final String f() {
        return this.f40450c;
    }

    public final int hashCode() {
        return Objects.hash(this.f40448a, this.f40449b, this.f40450c, this.f40451d);
    }

    public no0() {
        this.f40452e = new boolean[4];
    }

    private no0(Integer num, mk0 mk0Var, @NonNull String str, @NonNull String str2, boolean[] zArr) {
        this.f40448a = num;
        this.f40449b = mk0Var;
        this.f40450c = str;
        this.f40451d = str2;
        this.f40452e = zArr;
    }
}
