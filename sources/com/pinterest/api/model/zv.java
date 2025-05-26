package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class zv {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44467a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44468b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("developer_name")
    private String f44469c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44470d;

    public /* synthetic */ zv(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zv zvVar = (zv) obj;
        return Objects.equals(this.f44467a, zvVar.f44467a) && Objects.equals(this.f44468b, zvVar.f44468b) && Objects.equals(this.f44469c, zvVar.f44469c);
    }

    public final int hashCode() {
        return Objects.hash(this.f44467a, this.f44468b, this.f44469c);
    }

    public zv() {
        this.f44470d = new boolean[3];
    }

    private zv(@NonNull String str, String str2, String str3, boolean[] zArr) {
        this.f44467a = str;
        this.f44468b = str2;
        this.f44469c = str3;
        this.f44470d = zArr;
    }
}
