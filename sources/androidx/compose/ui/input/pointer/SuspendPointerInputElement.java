package androidx.compose.ui.input.pointer;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n3.o0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Ls3/e1;", "Ln3/o0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17439c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f17440d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f17441e;

    public SuspendPointerInputElement(Object obj, Object obj2, Function2 function2, int i13) {
        obj2 = (i13 & 2) != 0 ? null : obj2;
        this.f17438b = obj;
        this.f17439c = obj2;
        this.f17440d = null;
        this.f17441e = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.d(this.f17438b, suspendPointerInputElement.f17438b) || !Intrinsics.d(this.f17439c, suspendPointerInputElement.f17439c)) {
            return false;
        }
        Object[] objArr = this.f17440d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f17440d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f17440d != null) {
            return false;
        }
        return this.f17441e == suspendPointerInputElement.f17441e;
    }

    public final int hashCode() {
        Object obj = this.f17438b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f17439c;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f17440d;
        return this.f17441e.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new o0(this.f17438b, this.f17439c, this.f17440d, this.f17441e);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        o0 o0Var = (o0) pVar;
        Object obj = o0Var.f89096n;
        Object obj2 = this.f17438b;
        boolean z13 = !Intrinsics.d(obj, obj2);
        o0Var.f89096n = obj2;
        Object obj3 = o0Var.f89097o;
        Object obj4 = this.f17439c;
        if (!Intrinsics.d(obj3, obj4)) {
            z13 = true;
        }
        o0Var.f89097o = obj4;
        Object[] objArr = o0Var.f89098p;
        Object[] objArr2 = this.f17440d;
        if (objArr != null && objArr2 == null) {
            z13 = true;
        }
        if (objArr == null && objArr2 != null) {
            z13 = true;
        }
        boolean z14 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z13 : true;
        o0Var.f89098p = objArr2;
        if (z14) {
            o0Var.O0();
        }
        o0Var.f89099q = this.f17441e;
    }
}
