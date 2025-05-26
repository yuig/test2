package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class p0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final long f108079c;

    /* renamed from: d, reason: collision with root package name */
    public final o0[] f108080d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108081e;

    public p0(vd0.c cVar) {
        super(null, null);
        if (cVar != null) {
            this.f15163a = cVar.o("title_text", "");
            String o13 = cVar.o("toast_text", "");
            Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
            Intrinsics.checkNotNullParameter(o13, "<set-?>");
            String o14 = cVar.o("subtitle_text", "");
            Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
            Intrinsics.checkNotNullParameter(o14, "<set-?>");
            this.f108081e = o14;
            this.f108079c = cVar.n(1000L, "delay");
            this.f15164b = cVar.o("detailed_text", "");
            vd0.a k13 = cVar.k("buttons");
            Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
            this.f108080d = new o0[k13.d()];
            int d2 = k13.d();
            for (int i13 = 0; i13 < d2; i13++) {
                vd0.c b13 = k13.b(i13);
                if (b13 != null) {
                    o0[] o0VarArr = this.f108080d;
                    Intrinsics.f(o0VarArr);
                    String text = b13.o("text", "");
                    Intrinsics.checkNotNullExpressionValue(text, "optString(...)");
                    String uri = b13.o("uri", "");
                    Intrinsics.checkNotNullExpressionValue(uri, "optString(...)");
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    o0 o0Var = new o0();
                    o0Var.f108076a = text;
                    o0Var.f108077b = uri;
                    o0VarArr[i13] = o0Var;
                }
            }
        }
    }

    public String c() {
        o0[] o0VarArr = this.f108080d;
        if (o0VarArr != null) {
            Intrinsics.f(o0VarArr);
            if (o0VarArr.length > 0) {
                Intrinsics.f(o0VarArr);
                o0 o0Var = o0VarArr[0];
                if (o0Var != null) {
                    return o0Var.f108076a;
                }
                return null;
            }
        }
        return "";
    }

    public final String d() {
        o0[] o0VarArr = this.f108080d;
        if (o0VarArr != null) {
            Intrinsics.f(o0VarArr);
            if (o0VarArr.length > 0) {
                Intrinsics.f(o0VarArr);
                o0 o0Var = o0VarArr[0];
                return String.valueOf(o0Var != null ? o0Var.f108077b : null);
            }
        }
        return "";
    }

    public String e() {
        o0[] o0VarArr = this.f108080d;
        if (o0VarArr != null) {
            Intrinsics.f(o0VarArr);
            if (o0VarArr.length > 1) {
                Intrinsics.f(o0VarArr);
                o0 o0Var = o0VarArr[1];
                if (o0Var != null) {
                    return o0Var.f108076a;
                }
                return null;
            }
        }
        return "";
    }
}
