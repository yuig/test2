package androidx.compose.foundation.text.modifiers;

import a.c;
import a2.h;
import b3.x;
import b4.g;
import b4.q0;
import ep.b;
import g4.d;
import java.util.List;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Ls3/e1;", "La2/h;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TextAnnotatedStringElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final g f17361b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f17362c;

    /* renamed from: d, reason: collision with root package name */
    public final d f17363d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f17364e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17365f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17366g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17367h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17368i;

    /* renamed from: j, reason: collision with root package name */
    public final List f17369j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f17370k;

    /* renamed from: l, reason: collision with root package name */
    public final x f17371l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f17372m;

    public TextAnnotatedStringElement(g gVar, q0 q0Var, d dVar, Function1 function1, int i13, boolean z13, int i14, int i15, List list, Function1 function12, x xVar, Function1 function13) {
        this.f17361b = gVar;
        this.f17362c = q0Var;
        this.f17363d = dVar;
        this.f17364e = function1;
        this.f17365f = i13;
        this.f17366g = z13;
        this.f17367h = i14;
        this.f17368i = i15;
        this.f17369j = list;
        this.f17370k = function12;
        this.f17371l = xVar;
        this.f17372m = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.d(this.f17371l, textAnnotatedStringElement.f17371l) && Intrinsics.d(this.f17361b, textAnnotatedStringElement.f17361b) && Intrinsics.d(this.f17362c, textAnnotatedStringElement.f17362c) && Intrinsics.d(this.f17369j, textAnnotatedStringElement.f17369j) && Intrinsics.d(this.f17363d, textAnnotatedStringElement.f17363d) && this.f17364e == textAnnotatedStringElement.f17364e && this.f17372m == textAnnotatedStringElement.f17372m && s0.B(this.f17365f, textAnnotatedStringElement.f17365f) && this.f17366g == textAnnotatedStringElement.f17366g && this.f17367h == textAnnotatedStringElement.f17367h && this.f17368i == textAnnotatedStringElement.f17368i && this.f17370k == textAnnotatedStringElement.f17370k && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.f17363d.hashCode() + c.c(this.f17362c, this.f17361b.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.f17364e;
        int e13 = (((b.e(this.f17366g, b.b(this.f17365f, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31) + this.f17367h) * 31) + this.f17368i) * 31;
        List list = this.f17369j;
        int hashCode2 = (e13 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.f17370k;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        x xVar = this.f17371l;
        int hashCode4 = (hashCode3 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        Function1 function13 = this.f17372m;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        return new h(this.f17361b, this.f17362c, this.f17363d, this.f17364e, this.f17365f, this.f17366g, this.f17367h, this.f17368i, this.f17369j, this.f17370k, this.f17371l, this.f17372m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.f21648a.b(r0.f21648a) != false) goto L10;
     */
    @Override // s3.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(u2.p r11) {
        /*
            r10 = this;
            a2.h r11 = (a2.h) r11
            b3.x r0 = r11.f438x
            b3.x r1 = r10.f17371l
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            r2 = 1
            r0 = r0 ^ r2
            r11.f438x = r1
            if (r0 != 0) goto L25
            b4.q0 r0 = r11.f429o
            b4.q0 r1 = r10.f17362c
            if (r1 == r0) goto L21
            b4.g0 r1 = r1.f21648a
            b4.g0 r0 = r0.f21648a
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L25
            goto L24
        L21:
            r1.getClass()
        L24:
            r2 = 0
        L25:
            r8 = r2
            b4.g r0 = r10.f17361b
            boolean r9 = r11.R0(r0)
            g4.d r6 = r10.f17363d
            int r7 = r10.f17365f
            b4.q0 r1 = r10.f17362c
            java.util.List r2 = r10.f17369j
            int r3 = r10.f17368i
            int r4 = r10.f17367h
            boolean r5 = r10.f17366g
            r0 = r11
            boolean r0 = r0.Q0(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function1 r1 = r10.f17370k
            kotlin.jvm.functions.Function1 r2 = r10.f17372m
            kotlin.jvm.functions.Function1 r3 = r10.f17364e
            boolean r1 = r11.P0(r3, r1, r2)
            r11.M0(r8, r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.m(u2.p):void");
    }
}
