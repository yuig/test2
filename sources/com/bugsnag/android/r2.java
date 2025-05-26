package com.bugsnag.android;

import java.util.Map;

/* loaded from: classes3.dex */
public final class r2 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public String f29466a;

    /* renamed from: b, reason: collision with root package name */
    public String f29467b;

    /* renamed from: c, reason: collision with root package name */
    public Number f29468c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f29469d;

    /* renamed from: e, reason: collision with root package name */
    public Map f29470e;

    /* renamed from: f, reason: collision with root package name */
    public Number f29471f;

    /* renamed from: g, reason: collision with root package name */
    public Long f29472g;

    /* renamed from: h, reason: collision with root package name */
    public Long f29473h;

    /* renamed from: i, reason: collision with root package name */
    public Long f29474i;

    /* renamed from: j, reason: collision with root package name */
    public String f29475j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f29476k;

    /* renamed from: l, reason: collision with root package name */
    public ErrorType f29477l;

    public r2(String str, String str2, Number number, Boolean bool, int i13) {
        this.f29466a = str;
        this.f29467b = str2;
        this.f29468c = number;
        this.f29469d = bool;
        this.f29470e = null;
        this.f29471f = null;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("method");
        o1Var.z(this.f29466a);
        o1Var.K("file");
        o1Var.z(this.f29467b);
        o1Var.K("lineNumber");
        o1Var.w(this.f29468c);
        Boolean bool = this.f29469d;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            o1Var.K("inProject");
            o1Var.A(booleanValue);
        }
        o1Var.K("columnNumber");
        o1Var.w(this.f29471f);
        Long l13 = this.f29472g;
        if (l13 != null) {
            o1Var.K("frameAddress");
            o1Var.z(hd.l.d(l13));
        }
        Long l14 = this.f29473h;
        if (l14 != null) {
            o1Var.K("symbolAddress");
            o1Var.z(hd.l.d(l14));
        }
        Long l15 = this.f29474i;
        if (l15 != null) {
            o1Var.K("loadAddress");
            o1Var.z(hd.l.d(l15));
        }
        String str = this.f29475j;
        if (str != null) {
            o1Var.K("codeIdentifier");
            o1Var.z(str);
        }
        Boolean bool2 = this.f29476k;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            o1Var.K("isPC");
            o1Var.A(booleanValue2);
        }
        ErrorType errorType = this.f29477l;
        if (errorType != null) {
            o1Var.K("type");
            o1Var.z(errorType.getDesc());
        }
        Map map = this.f29470e;
        if (map != null) {
            o1Var.K("code");
            for (Map.Entry entry : map.entrySet()) {
                o1Var.d();
                o1Var.K((String) entry.getKey());
                o1Var.z((String) entry.getValue());
                o1Var.g();
            }
        }
        o1Var.g();
    }

    public r2(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), null, 32);
        this.f29472g = nativeStackframe.getFrameAddress();
        this.f29473h = nativeStackframe.getSymbolAddress();
        this.f29474i = nativeStackframe.getLoadAddress();
        this.f29475j = nativeStackframe.getCodeIdentifier();
        this.f29476k = nativeStackframe.getIsPC();
        this.f29477l = nativeStackframe.getType();
    }
}
