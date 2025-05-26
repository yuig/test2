package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class wt {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43369a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43370b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("labels")
    private List<String> f43371c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43372d;

    public /* synthetic */ wt(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final List d() {
        return this.f43371c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wt wtVar = (wt) obj;
        return Objects.equals(this.f43369a, wtVar.f43369a) && Objects.equals(this.f43370b, wtVar.f43370b) && Objects.equals(this.f43371c, wtVar.f43371c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43369a, this.f43370b, this.f43371c);
    }

    public wt() {
        this.f43372d = new boolean[3];
    }

    private wt(@NonNull String str, String str2, List<String> list, boolean[] zArr) {
        this.f43369a = str;
        this.f43370b = str2;
        this.f43371c = list;
        this.f43372d = zArr;
    }
}
