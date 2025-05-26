package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class nz {

    /* renamed from: a, reason: collision with root package name */
    public String f40547a;

    /* renamed from: b, reason: collision with root package name */
    public String f40548b;

    /* renamed from: c, reason: collision with root package name */
    public String f40549c;

    /* renamed from: d, reason: collision with root package name */
    public String f40550d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f40551e;

    /* renamed from: f, reason: collision with root package name */
    public List f40552f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40553g;

    public /* synthetic */ nz(int i13) {
        this();
    }

    private nz() {
        this.f40553g = new boolean[6];
    }

    private nz(@NonNull qz qzVar) {
        String str;
        String str2;
        String str3;
        String str4;
        f30 f30Var;
        List list;
        str = qzVar.f41442a;
        this.f40547a = str;
        str2 = qzVar.f41443b;
        this.f40548b = str2;
        str3 = qzVar.f41444c;
        this.f40549c = str3;
        str4 = qzVar.f41445d;
        this.f40550d = str4;
        f30Var = qzVar.f41446e;
        this.f40551e = f30Var;
        list = qzVar.f41447f;
        this.f40552f = list;
        boolean[] zArr = qzVar.f41448g;
        this.f40553g = Arrays.copyOf(zArr, zArr.length);
    }
}
