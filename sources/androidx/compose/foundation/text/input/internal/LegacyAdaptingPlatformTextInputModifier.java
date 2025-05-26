package androidx.compose.foundation.text.input.internal;

import b2.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import w1.l1;
import y1.c0;
import y1.g;
import y1.z;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Ls3/e1;", "Ly1/z;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f17358b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f17359c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f17360d;

    public LegacyAdaptingPlatformTextInputModifier(c0 c0Var, l1 l1Var, t0 t0Var) {
        this.f17358b = c0Var;
        this.f17359c = l1Var;
        this.f17360d = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.d(this.f17358b, legacyAdaptingPlatformTextInputModifier.f17358b) && Intrinsics.d(this.f17359c, legacyAdaptingPlatformTextInputModifier.f17359c) && Intrinsics.d(this.f17360d, legacyAdaptingPlatformTextInputModifier.f17360d);
    }

    public final int hashCode() {
        return this.f17360d.hashCode() + ((this.f17359c.hashCode() + (this.f17358b.hashCode() * 31)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new z(this.f17358b, this.f17359c, this.f17360d);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        z zVar = (z) pVar;
        if (zVar.f120054m) {
            ((g) zVar.f136610n).b();
            zVar.f136610n.i(zVar);
        }
        c0 c0Var = this.f17358b;
        zVar.f136610n = c0Var;
        if (zVar.f120054m) {
            if (c0Var.f136540a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
            }
            c0Var.f136540a = zVar;
        }
        zVar.f136611o = this.f17359c;
        zVar.f136612p = this.f17360d;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f17358b + ", legacyTextFieldState=" + this.f17359c + ", textFieldSelectionManager=" + this.f17360d + ')';
    }
}
