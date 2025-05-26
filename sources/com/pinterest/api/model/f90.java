package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class f90 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37616a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37617b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("cover_image")
    private String f37618c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f37619d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("dominant_color")
    private List<Integer> f37620e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("highlight_item_count")
    private Integer f37621f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f37622g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("updated_at")
    private Date f37623h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f37624i;

    public /* synthetic */ f90(String str, String str2, String str3, Date date, List list, Integer num, String str4, Date date2, boolean[] zArr, int i13) {
        this(str, str2, str3, date, list, num, str4, date2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37616a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f90 f90Var = (f90) obj;
        return Objects.equals(this.f37621f, f90Var.f37621f) && Objects.equals(this.f37616a, f90Var.f37616a) && Objects.equals(this.f37617b, f90Var.f37617b) && Objects.equals(this.f37618c, f90Var.f37618c) && Objects.equals(this.f37619d, f90Var.f37619d) && Objects.equals(this.f37620e, f90Var.f37620e) && Objects.equals(this.f37622g, f90Var.f37622g) && Objects.equals(this.f37623h, f90Var.f37623h);
    }

    public final int hashCode() {
        return Objects.hash(this.f37616a, this.f37617b, this.f37618c, this.f37619d, this.f37620e, this.f37621f, this.f37622g, this.f37623h);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37617b;
    }

    public f90() {
        this.f37624i = new boolean[8];
    }

    private f90(@NonNull String str, String str2, @NonNull String str3, Date date, List<Integer> list, Integer num, @NonNull String str4, Date date2, boolean[] zArr) {
        this.f37616a = str;
        this.f37617b = str2;
        this.f37618c = str3;
        this.f37619d = date;
        this.f37620e = list;
        this.f37621f = num;
        this.f37622g = str4;
        this.f37623h = date2;
        this.f37624i = zArr;
    }
}
