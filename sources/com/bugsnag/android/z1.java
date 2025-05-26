package com.bugsnag.android;

import java.util.List;

/* loaded from: classes3.dex */
public final class z1 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Severity f29734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29736c;

    public z1(Severity severity, String str, String str2) {
        this.f29734a = severity;
        this.f29735b = str;
        this.f29736c = str2;
    }

    @Override // com.bugsnag.android.f2
    public final boolean a(x0 x0Var) {
        z0 z0Var = x0Var.f29685a;
        p2 p2Var = z0Var.f29716a;
        String str = p2Var.f29413a;
        boolean z13 = p2Var.f29418f;
        z0Var.f29716a = new p2(str, this.f29734a, z13, z13 != p2Var.f29419g, p2Var.f29415c, p2Var.f29414b);
        List<t0> list = z0Var.f29727l;
        t0 t0Var = (t0) list.get(0);
        if (!list.isEmpty()) {
            String str2 = this.f29735b;
            if (str2 != null) {
                t0Var.f29640a.f29655a = str2;
            } else {
                t0Var.f29641b.h("Invalid null value supplied to error.errorClass, ignoring");
            }
            t0Var.f29640a.f29656b = this.f29736c;
            for (t0 t0Var2 : list) {
                ErrorType errorType = ErrorType.C;
                if (errorType != null) {
                    t0Var2.f29640a.f29657c = errorType;
                } else {
                    t0Var2.getClass();
                    t0Var2.f29641b.h("Invalid null value supplied to error.type, ignoring");
                }
            }
        }
        return true;
    }
}
