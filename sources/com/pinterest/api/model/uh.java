package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class uh implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42559a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42560b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("closeup")
    private Integer f42561c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("follow")
    private Integer f42562d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("long_press")
    private Integer f42563e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("undo")
    private Integer f42564f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42565g;

    public /* synthetic */ uh(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr, int i13) {
        this(str, str2, num, num2, num3, num4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42559a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uh uhVar = (uh) obj;
        return Objects.equals(this.f42564f, uhVar.f42564f) && Objects.equals(this.f42563e, uhVar.f42563e) && Objects.equals(this.f42562d, uhVar.f42562d) && Objects.equals(this.f42561c, uhVar.f42561c) && Objects.equals(this.f42559a, uhVar.f42559a) && Objects.equals(this.f42560b, uhVar.f42560b);
    }

    public final int hashCode() {
        return Objects.hash(this.f42559a, this.f42560b, this.f42561c, this.f42562d, this.f42563e, this.f42564f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42560b;
    }

    public uh() {
        this.f42565g = new boolean[6];
    }

    private uh(@NonNull String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr) {
        this.f42559a = str;
        this.f42560b = str2;
        this.f42561c = num;
        this.f42562d = num2;
        this.f42563e = num3;
        this.f42564f = num4;
        this.f42565g = zArr;
    }
}
