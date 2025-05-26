package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vc {

    /* renamed from: a, reason: collision with root package name */
    public String f42818a;

    /* renamed from: b, reason: collision with root package name */
    public String f42819b;

    /* renamed from: c, reason: collision with root package name */
    public cd f42820c;

    /* renamed from: d, reason: collision with root package name */
    public String f42821d;

    /* renamed from: e, reason: collision with root package name */
    public gd f42822e;

    /* renamed from: f, reason: collision with root package name */
    public f30 f42823f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42824g;

    public /* synthetic */ vc(int i13) {
        this();
    }

    private vc() {
        this.f42824g = new boolean[6];
    }

    private vc(@NonNull yc ycVar) {
        String str;
        String str2;
        cd cdVar;
        String str3;
        gd gdVar;
        f30 f30Var;
        str = ycVar.f44001a;
        this.f42818a = str;
        str2 = ycVar.f44002b;
        this.f42819b = str2;
        cdVar = ycVar.f44003c;
        this.f42820c = cdVar;
        str3 = ycVar.f44004d;
        this.f42821d = str3;
        gdVar = ycVar.f44005e;
        this.f42822e = gdVar;
        f30Var = ycVar.f44006f;
        this.f42823f = f30Var;
        boolean[] zArr = ycVar.f44007g;
        this.f42824g = Arrays.copyOf(zArr, zArr.length);
    }
}
