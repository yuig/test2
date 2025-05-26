package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public String f36039a;

    /* renamed from: b, reason: collision with root package name */
    public String f36040b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f36041c;

    /* renamed from: d, reason: collision with root package name */
    public String f36042d;

    /* renamed from: e, reason: collision with root package name */
    public String f36043e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36044f;

    public /* synthetic */ bb(int i13) {
        this();
    }

    public final void a(String str) {
        this.f36040b = str;
        boolean[] zArr = this.f36044f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private bb() {
        this.f36044f = new boolean[5];
    }

    private bb(@NonNull cb cbVar) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        str = cbVar.f36338a;
        this.f36039a = str;
        str2 = cbVar.f36339b;
        this.f36040b = str2;
        bool = cbVar.f36340c;
        this.f36041c = bool;
        str3 = cbVar.f36341d;
        this.f36042d = str3;
        str4 = cbVar.f36342e;
        this.f36043e = str4;
        boolean[] zArr = cbVar.f36343f;
        this.f36044f = Arrays.copyOf(zArr, zArr.length);
    }
}
