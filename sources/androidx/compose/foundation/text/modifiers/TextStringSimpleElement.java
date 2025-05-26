package androidx.compose.foundation.text.modifiers;

import a.c;
import a2.k;
import b3.x;
import b4.q0;
import ep.b;
import g4.d;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Ls3/e1;", "La2/k;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TextStringSimpleElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f17373b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f17374c;

    /* renamed from: d, reason: collision with root package name */
    public final d f17375d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17376e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17377f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17378g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17379h;

    /* renamed from: i, reason: collision with root package name */
    public final x f17380i;

    public TextStringSimpleElement(String str, q0 q0Var, d dVar, int i13, boolean z13, int i14, int i15, x xVar) {
        this.f17373b = str;
        this.f17374c = q0Var;
        this.f17375d = dVar;
        this.f17376e = i13;
        this.f17377f = z13;
        this.f17378g = i14;
        this.f17379h = i15;
        this.f17380i = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.d(this.f17380i, textStringSimpleElement.f17380i) && Intrinsics.d(this.f17373b, textStringSimpleElement.f17373b) && Intrinsics.d(this.f17374c, textStringSimpleElement.f17374c) && Intrinsics.d(this.f17375d, textStringSimpleElement.f17375d) && s0.B(this.f17376e, textStringSimpleElement.f17376e) && this.f17377f == textStringSimpleElement.f17377f && this.f17378g == textStringSimpleElement.f17378g && this.f17379h == textStringSimpleElement.f17379h;
    }

    public final int hashCode() {
        int e13 = (((b.e(this.f17377f, b.b(this.f17376e, (this.f17375d.hashCode() + c.c(this.f17374c, this.f17373b.hashCode() * 31, 31)) * 31, 31), 31) + this.f17378g) * 31) + this.f17379h) * 31;
        x xVar = this.f17380i;
        return e13 + (xVar != null ? xVar.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        k kVar = new k();
        kVar.f447n = this.f17373b;
        kVar.f448o = this.f17374c;
        kVar.f449p = this.f17375d;
        kVar.f450q = this.f17376e;
        kVar.f451r = this.f17377f;
        kVar.f452s = this.f17378g;
        kVar.f453t = this.f17379h;
        kVar.f454u = this.f17380i;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3.f21648a.b(r0.f21648a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    @Override // s3.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(u2.p r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.m(u2.p):void");
    }
}
