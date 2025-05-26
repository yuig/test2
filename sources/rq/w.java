package rq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final double f109606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f109607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f109608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109609d;

    /* renamed from: e, reason: collision with root package name */
    public final String f109610e;

    public w(double d2, double d13, double d14, double d15, String label, String str, String requestParams) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f109606a = d2;
        this.f109607b = label;
        this.f109608c = str;
        this.f109609d = true;
        this.f109610e = requestParams;
    }
}
