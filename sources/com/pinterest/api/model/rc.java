package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public String f41540a;

    /* renamed from: b, reason: collision with root package name */
    public String f41541b;

    /* renamed from: c, reason: collision with root package name */
    public kd f41542c;

    /* renamed from: d, reason: collision with root package name */
    public List f41543d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f41544e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41545f;

    public /* synthetic */ rc(int i13) {
        this();
    }

    private rc() {
        this.f41545f = new boolean[5];
    }

    private rc(@NonNull uc ucVar) {
        String str;
        String str2;
        kd kdVar;
        List list;
        f30 f30Var;
        str = ucVar.f42503a;
        this.f41540a = str;
        str2 = ucVar.f42504b;
        this.f41541b = str2;
        kdVar = ucVar.f42505c;
        this.f41542c = kdVar;
        list = ucVar.f42506d;
        this.f41543d = list;
        f30Var = ucVar.f42507e;
        this.f41544e = f30Var;
        boolean[] zArr = ucVar.f42508f;
        this.f41545f = Arrays.copyOf(zArr, zArr.length);
    }
}
