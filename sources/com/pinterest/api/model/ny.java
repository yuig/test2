package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ny {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40532a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40533b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("safety_root")
    private yy f40534c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40535d;

    public /* synthetic */ ny(String str, String str2, yy yyVar, boolean[] zArr, int i13) {
        this(str, str2, yyVar, zArr);
    }

    public final yy d() {
        return this.f40534c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ny nyVar = (ny) obj;
        return Objects.equals(this.f40532a, nyVar.f40532a) && Objects.equals(this.f40533b, nyVar.f40533b) && Objects.equals(this.f40534c, nyVar.f40534c);
    }

    public final int hashCode() {
        return Objects.hash(this.f40532a, this.f40533b, this.f40534c);
    }

    public ny() {
        this.f40535d = new boolean[3];
    }

    private ny(@NonNull String str, String str2, yy yyVar, boolean[] zArr) {
        this.f40532a = str;
        this.f40533b = str2;
        this.f40534c = yyVar;
        this.f40535d = zArr;
    }
}
