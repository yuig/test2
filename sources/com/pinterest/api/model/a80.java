package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a80 {

    /* renamed from: a, reason: collision with root package name */
    public String f35664a;

    /* renamed from: b, reason: collision with root package name */
    public String f35665b;

    /* renamed from: c, reason: collision with root package name */
    public String f35666c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f35667d;

    /* renamed from: e, reason: collision with root package name */
    public String f35668e;

    /* renamed from: f, reason: collision with root package name */
    public String f35669f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35670g;

    public /* synthetic */ a80(int i13) {
        this();
    }

    private a80() {
        this.f35670g = new boolean[6];
    }

    private a80(@NonNull d80 d80Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        str = d80Var.f36675a;
        this.f35664a = str;
        str2 = d80Var.f36676b;
        this.f35665b = str2;
        str3 = d80Var.f36677c;
        this.f35666c = str3;
        num = d80Var.f36678d;
        this.f35667d = num;
        str4 = d80Var.f36679e;
        this.f35668e = str4;
        str5 = d80Var.f36680f;
        this.f35669f = str5;
        boolean[] zArr = d80Var.f36681g;
        this.f35670g = Arrays.copyOf(zArr, zArr.length);
    }
}
