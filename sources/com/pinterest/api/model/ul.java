package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ul {

    /* renamed from: a, reason: collision with root package name */
    public String f42572a;

    /* renamed from: b, reason: collision with root package name */
    public String f42573b;

    /* renamed from: c, reason: collision with root package name */
    public k00 f42574c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f42575d;

    /* renamed from: e, reason: collision with root package name */
    public o00 f42576e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f42577f;

    /* renamed from: g, reason: collision with root package name */
    public String f42578g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f42579h;

    public /* synthetic */ ul(int i13) {
        this();
    }

    public final xl a() {
        return new xl(this.f42572a, this.f42573b, this.f42574c, this.f42575d, this.f42576e, this.f42577f, this.f42578g, this.f42579h, 0);
    }

    private ul() {
        this.f42579h = new boolean[7];
    }

    private ul(@NonNull xl xlVar) {
        String str;
        String str2;
        k00 k00Var;
        Boolean bool;
        o00 o00Var;
        Boolean bool2;
        String str3;
        str = xlVar.f43735a;
        this.f42572a = str;
        str2 = xlVar.f43736b;
        this.f42573b = str2;
        k00Var = xlVar.f43737c;
        this.f42574c = k00Var;
        bool = xlVar.f43738d;
        this.f42575d = bool;
        o00Var = xlVar.f43739e;
        this.f42576e = o00Var;
        bool2 = xlVar.f43740f;
        this.f42577f = bool2;
        str3 = xlVar.f43741g;
        this.f42578g = str3;
        boolean[] zArr = xlVar.f43742h;
        this.f42579h = Arrays.copyOf(zArr, zArr.length);
    }
}
