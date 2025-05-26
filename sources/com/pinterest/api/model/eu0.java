package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.fu0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class eu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f37349a;

    /* renamed from: b, reason: collision with root package name */
    public String f37350b;

    /* renamed from: c, reason: collision with root package name */
    public fu0.a f37351c;

    /* renamed from: d, reason: collision with root package name */
    public e70 f37352d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37353e;

    public /* synthetic */ eu0(int i13) {
        this();
    }

    private eu0() {
        this.f37353e = new boolean[4];
    }

    private eu0(@NonNull fu0 fu0Var) {
        String str;
        String str2;
        fu0.a aVar;
        e70 e70Var;
        str = fu0Var.f37809a;
        this.f37349a = str;
        str2 = fu0Var.f37810b;
        this.f37350b = str2;
        aVar = fu0Var.f37811c;
        this.f37351c = aVar;
        e70Var = fu0Var.f37812d;
        this.f37352d = e70Var;
        boolean[] zArr = fu0Var.f37813e;
        this.f37353e = Arrays.copyOf(zArr, zArr.length);
    }
}
