package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.d0;
import p1.f0;
import s3.e1;
import u2.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Ls3/e1;", "Lp1/f0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FillElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f17149b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17150c;

    public FillElement(d0 d0Var, float f13) {
        this.f17149b = d0Var;
        this.f17150c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f17149b == fillElement.f17149b && this.f17150c == fillElement.f17150c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17150c) + (this.f17149b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        f0 f0Var = new f0();
        f0Var.f98507n = this.f17149b;
        f0Var.f98508o = this.f17150c;
        return f0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        f0 f0Var = (f0) pVar;
        f0Var.f98507n = this.f17149b;
        f0Var.f98508o = this.f17150c;
    }
}
