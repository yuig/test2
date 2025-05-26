package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class yu {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("access_key_id")
    private String f44122a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("expiration")
    private Integer f44123b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("secret_access_key")
    private String f44124c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("session_token")
    private String f44125d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44126e;

    public /* synthetic */ yu(String str, Integer num, String str2, String str3, boolean[] zArr, int i13) {
        this(str, num, str2, str3, zArr);
    }

    public final String e() {
        return this.f44122a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yu yuVar = (yu) obj;
        return Objects.equals(this.f44123b, yuVar.f44123b) && Objects.equals(this.f44122a, yuVar.f44122a) && Objects.equals(this.f44124c, yuVar.f44124c) && Objects.equals(this.f44125d, yuVar.f44125d);
    }

    public final Integer f() {
        Integer num = this.f44123b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String g() {
        return this.f44124c;
    }

    public final String h() {
        return this.f44125d;
    }

    public final int hashCode() {
        return Objects.hash(this.f44122a, this.f44123b, this.f44124c, this.f44125d);
    }

    public yu() {
        this.f44126e = new boolean[4];
    }

    private yu(@NonNull String str, Integer num, @NonNull String str2, @NonNull String str3, boolean[] zArr) {
        this.f44122a = str;
        this.f44123b = num;
        this.f44124c = str2;
        this.f44125d = str3;
        this.f44126e = zArr;
    }
}
