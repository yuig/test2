package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class wn {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43295a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43296b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("interests")
    private List<sn> f43297c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43298d;

    public /* synthetic */ wn(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wn wnVar = (wn) obj;
        return Objects.equals(this.f43295a, wnVar.f43295a) && Objects.equals(this.f43296b, wnVar.f43296b) && Objects.equals(this.f43297c, wnVar.f43297c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43295a, this.f43296b, this.f43297c);
    }

    public wn() {
        this.f43298d = new boolean[3];
    }

    private wn(@NonNull String str, String str2, @NonNull List<sn> list, boolean[] zArr) {
        this.f43295a = str;
        this.f43296b = str2;
        this.f43297c = list;
        this.f43298d = zArr;
    }
}
