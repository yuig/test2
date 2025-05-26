package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class p2 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29415c;

    /* renamed from: d, reason: collision with root package name */
    public final Severity f29416d;

    /* renamed from: e, reason: collision with root package name */
    public Severity f29417e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29418f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29419g;

    public p2(String str, Severity severity, boolean z13, boolean z14, String str2, String str3) {
        this.f29413a = str;
        this.f29418f = z13;
        this.f29419g = z14;
        this.f29416d = severity;
        this.f29417e = severity;
        this.f29415c = str2;
        this.f29414b = str3;
    }

    public static p2 a(Severity severity, String str, String str2) {
        if (str.equals("strictMode") && (str2 == null || str2.length() == 0)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (!str.equals("strictMode") && !str.equals("log") && str2 != null && str2.length() != 0) {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
        str.hashCode();
        switch (str) {
            case "strictMode":
                return new p2(str, Severity.WARNING, true, true, str2, "violationType");
            case "userCallbackSetSeverity":
            case "userSpecifiedSeverity":
                return new p2(str, severity, false, false, null, null);
            case "unhandledException":
            case "signal":
            case "anrError":
            case "unhandledPromiseRejection":
                return new p2(str, Severity.ERROR, true, true, null, null);
            case "handledError":
            case "handledException":
                return new p2(str, Severity.WARNING, false, false, null, null);
            case "log":
                return new p2(str, severity, false, false, str2, "level");
            default:
                throw new IllegalArgumentException(t3.s1.b("Invalid argument for severityReason: '", str, '\''));
        }
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        String str;
        o1Var.d();
        o1Var.K("type");
        o1Var.z(this.f29416d == this.f29417e ? this.f29413a : "userCallbackSetSeverity");
        o1Var.K("unhandledOverridden");
        o1Var.A(this.f29418f != this.f29419g);
        String str2 = this.f29414b;
        if (str2 != null && (str = this.f29415c) != null) {
            o1Var.K("attributes");
            o1Var.d();
            o1Var.K(str2);
            o1Var.z(str);
            o1Var.g();
        }
        o1Var.g();
    }
}
