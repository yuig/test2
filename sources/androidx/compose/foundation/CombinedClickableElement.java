package androidx.compose.foundation;

import k1.i0;
import k1.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n3.h0;
import n3.o0;
import o1.l;
import s3.e1;
import u2.p;
import z3.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Ls3/e1;", "Lk1/i0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CombinedClickableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f17084b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17085c = null;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17086d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17087e;

    /* renamed from: f, reason: collision with root package name */
    public final g f17088f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f17089g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17090h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f17091i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f17092j;

    public CombinedClickableElement(l lVar, g gVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z13) {
        this.f17084b = lVar;
        this.f17086d = z13;
        this.f17087e = str;
        this.f17088f = gVar;
        this.f17089g = function0;
        this.f17090h = str2;
        this.f17091i = function02;
        this.f17092j = function03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.d(this.f17084b, combinedClickableElement.f17084b) && Intrinsics.d(this.f17085c, combinedClickableElement.f17085c) && this.f17086d == combinedClickableElement.f17086d && Intrinsics.d(this.f17087e, combinedClickableElement.f17087e) && Intrinsics.d(this.f17088f, combinedClickableElement.f17088f) && this.f17089g == combinedClickableElement.f17089g && Intrinsics.d(this.f17090h, combinedClickableElement.f17090h) && this.f17091i == combinedClickableElement.f17091i && this.f17092j == combinedClickableElement.f17092j;
    }

    public final int hashCode() {
        l lVar = this.f17084b;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        q1 q1Var = this.f17085c;
        int e13 = ep.b.e(this.f17086d, (hashCode + (q1Var != null ? q1Var.hashCode() : 0)) * 31, 31);
        String str = this.f17087e;
        int hashCode2 = (e13 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f17088f;
        int b13 = d7.g.b(this.f17089g, (hashCode2 + (gVar != null ? Integer.hashCode(gVar.f140670a) : 0)) * 31, 31);
        String str2 = this.f17090h;
        int hashCode3 = (b13 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.f17091i;
        int hashCode4 = (hashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0 function02 = this.f17092j;
        return hashCode4 + (function02 != null ? function02.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        i0 i0Var = new i0(this.f17084b, this.f17085c, this.f17086d, this.f17087e, this.f17088f, this.f17089g);
        i0Var.H = this.f17090h;
        i0Var.I = this.f17091i;
        i0Var.f77879J = this.f17092j;
        return i0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        boolean z13;
        h0 h0Var;
        i0 i0Var = (i0) pVar;
        String str = i0Var.H;
        String str2 = this.f17090h;
        if (!Intrinsics.d(str, str2)) {
            i0Var.H = str2;
            com.bumptech.glide.c.m0(i0Var);
        }
        boolean z14 = i0Var.I == null;
        Function0 function0 = this.f17091i;
        if (z14 != (function0 == null)) {
            i0Var.R0();
            com.bumptech.glide.c.m0(i0Var);
            z13 = true;
        } else {
            z13 = false;
        }
        i0Var.I = function0;
        boolean z15 = i0Var.f77879J == null;
        Function0 function02 = this.f17092j;
        if (z15 != (function02 == null)) {
            z13 = true;
        }
        i0Var.f77879J = function02;
        boolean z16 = i0Var.f77894t;
        boolean z17 = this.f17086d;
        boolean z18 = z16 != z17 ? true : z13;
        i0Var.T0(this.f17084b, this.f17085c, z17, this.f17087e, this.f17088f, this.f17089g);
        if (!z18 || (h0Var = i0Var.f77898x) == null) {
            return;
        }
        ((o0) h0Var).O0();
        Unit unit = Unit.f80348a;
    }
}
