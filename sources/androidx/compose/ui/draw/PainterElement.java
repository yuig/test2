package androidx.compose.ui.draw;

import a3.f;
import b3.p;
import com.bumptech.glide.c;
import g3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q3.n;
import s3.e1;
import u2.e;
import y2.i;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Ls3/e1;", "Ly2/i;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class PainterElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final b f17388b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17389c;

    /* renamed from: d, reason: collision with root package name */
    public final e f17390d;

    /* renamed from: e, reason: collision with root package name */
    public final n f17391e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17392f;

    /* renamed from: g, reason: collision with root package name */
    public final p f17393g;

    public PainterElement(b bVar, boolean z13, e eVar, n nVar, float f13, p pVar) {
        this.f17388b = bVar;
        this.f17389c = z13;
        this.f17390d = eVar;
        this.f17391e = nVar;
        this.f17392f = f13;
        this.f17393g = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.d(this.f17388b, painterElement.f17388b) && this.f17389c == painterElement.f17389c && Intrinsics.d(this.f17390d, painterElement.f17390d) && Intrinsics.d(this.f17391e, painterElement.f17391e) && Float.compare(this.f17392f, painterElement.f17392f) == 0 && Intrinsics.d(this.f17393g, painterElement.f17393g);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f17392f, (this.f17391e.hashCode() + ((this.f17390d.hashCode() + ep.b.e(this.f17389c, this.f17388b.hashCode() * 31, 31)) * 31)) * 31, 31);
        p pVar = this.f17393g;
        return a13 + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // s3.e1
    public final u2.p l() {
        i iVar = new i();
        iVar.f136673n = this.f17388b;
        iVar.f136674o = this.f17389c;
        iVar.f136675p = this.f17390d;
        iVar.f136676q = this.f17391e;
        iVar.f136677r = this.f17392f;
        iVar.f136678s = this.f17393g;
        return iVar;
    }

    @Override // s3.e1
    public final void m(u2.p pVar) {
        i iVar = (i) pVar;
        boolean z13 = iVar.f136674o;
        b bVar = this.f17388b;
        boolean z14 = this.f17389c;
        boolean z15 = z13 != z14 || (z14 && !f.a(iVar.f136673n.d(), bVar.d()));
        iVar.f136673n = bVar;
        iVar.f136674o = z14;
        iVar.f136675p = this.f17390d;
        iVar.f136676q = this.f17391e;
        iVar.f136677r = this.f17392f;
        iVar.f136678s = this.f17393g;
        if (z15) {
            c.l0(iVar);
        }
        c.k0(iVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f17388b + ", sizeToIntrinsics=" + this.f17389c + ", alignment=" + this.f17390d + ", contentScale=" + this.f17391e + ", alpha=" + this.f17392f + ", colorFilter=" + this.f17393g + ')';
    }
}
