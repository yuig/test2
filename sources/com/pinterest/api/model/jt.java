package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class jt {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39141a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39142b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("args")
    private List<Map<String, Object>> f39143c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("format")
    private String f39144d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("text")
    private String f39145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39146f;

    public /* synthetic */ jt(String str, String str2, List list, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, list, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jt jtVar = (jt) obj;
        return Objects.equals(this.f39141a, jtVar.f39141a) && Objects.equals(this.f39142b, jtVar.f39142b) && Objects.equals(this.f39143c, jtVar.f39143c) && Objects.equals(this.f39144d, jtVar.f39144d) && Objects.equals(this.f39145e, jtVar.f39145e);
    }

    public final int hashCode() {
        return Objects.hash(this.f39141a, this.f39142b, this.f39143c, this.f39144d, this.f39145e);
    }

    public jt() {
        this.f39146f = new boolean[5];
    }

    private jt(@NonNull String str, String str2, List<Map<String, Object>> list, String str3, String str4, boolean[] zArr) {
        this.f39141a = str;
        this.f39142b = str2;
        this.f39143c = list;
        this.f39144d = str3;
        this.f39145e = str4;
        this.f39146f = zArr;
    }
}
