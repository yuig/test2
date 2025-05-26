package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class sn {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("displayName")
    private String f41944a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("interestData")
    private Map<String, Object> f41945b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("isSelected")
    private Boolean f41946c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41947d;

    public /* synthetic */ sn(String str, Map map, Boolean bool, boolean[] zArr, int i13) {
        this(str, map, bool, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sn snVar = (sn) obj;
        return Objects.equals(this.f41946c, snVar.f41946c) && Objects.equals(this.f41944a, snVar.f41944a) && Objects.equals(this.f41945b, snVar.f41945b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41944a, this.f41945b, this.f41946c);
    }

    public sn() {
        this.f41947d = new boolean[3];
    }

    private sn(@NonNull String str, @NonNull Map<String, Object> map, Boolean bool, boolean[] zArr) {
        this.f41944a = str;
        this.f41945b = map;
        this.f41946c = bool;
        this.f41947d = zArr;
    }
}
