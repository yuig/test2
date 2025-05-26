package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class tn {

    /* renamed from: a, reason: collision with root package name */
    public String f42243a;

    /* renamed from: b, reason: collision with root package name */
    public String f42244b;

    /* renamed from: c, reason: collision with root package name */
    public List f42245c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42246d;

    public /* synthetic */ tn(int i13) {
        this();
    }

    private tn() {
        this.f42246d = new boolean[3];
    }

    private tn(@NonNull wn wnVar) {
        String str;
        String str2;
        List list;
        str = wnVar.f43295a;
        this.f42243a = str;
        str2 = wnVar.f43296b;
        this.f42244b = str2;
        list = wnVar.f43297c;
        this.f42245c = list;
        boolean[] zArr = wnVar.f43298d;
        this.f42246d = Arrays.copyOf(zArr, zArr.length);
    }
}
