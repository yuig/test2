package androidx.compose.ui.input.pointer;

import a.cb;
import androidx.compose.foundation.lazy.layout.z0;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import n3.a;
import n3.l;
import n3.n;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Ls3/e1;", "Ln3/l;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final /* data */ class PointerHoverIconModifierElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final n f17436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17437c;

    public PointerHoverIconModifierElement(a aVar, boolean z13) {
        this.f17436b = aVar;
        this.f17437c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return Intrinsics.d(this.f17436b, pointerHoverIconModifierElement.f17436b) && this.f17437c == pointerHoverIconModifierElement.f17437c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17437c) + (((a) this.f17436b).f89028b * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new l(this.f17436b, this.f17437c);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        l lVar = (l) pVar;
        n nVar = lVar.f89080n;
        n nVar2 = this.f17436b;
        if (!Intrinsics.d(nVar, nVar2)) {
            lVar.f89080n = nVar2;
            if (lVar.f89082p) {
                lVar.N0();
            }
        }
        boolean z13 = lVar.f89081o;
        boolean z14 = this.f17437c;
        if (z13 != z14) {
            lVar.f89081o = z14;
            if (z14) {
                if (lVar.f89082p) {
                    lVar.M0();
                    return;
                }
                return;
            }
            boolean z15 = lVar.f89082p;
            if (z15 && z15) {
                if (!z14) {
                    j0 j0Var = new j0();
                    b0.X1(lVar, new z0(2, j0Var));
                    l lVar2 = (l) j0Var.f80434a;
                    if (lVar2 != null) {
                        lVar = lVar2;
                    }
                }
                lVar.M0();
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb3.append(this.f17436b);
        sb3.append(", overrideDescendants=");
        return cb.m(sb3, this.f17437c, ')');
    }
}
