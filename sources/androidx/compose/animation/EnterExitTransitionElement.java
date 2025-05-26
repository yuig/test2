package androidx.compose.animation;

import d7.g;
import i1.m1;
import i1.n1;
import i1.o1;
import i1.x0;
import j1.g2;
import j1.y1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Ls3/e1;", "Li1/m1;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final g2 f17058b;

    /* renamed from: c, reason: collision with root package name */
    public final y1 f17059c;

    /* renamed from: d, reason: collision with root package name */
    public final y1 f17060d;

    /* renamed from: e, reason: collision with root package name */
    public final y1 f17061e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f17062f;

    /* renamed from: g, reason: collision with root package name */
    public final o1 f17063g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f17064h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f17065i;

    public EnterExitTransitionElement(g2 g2Var, y1 y1Var, y1 y1Var2, y1 y1Var3, n1 n1Var, o1 o1Var, Function0 function0, x0 x0Var) {
        this.f17058b = g2Var;
        this.f17059c = y1Var;
        this.f17060d = y1Var2;
        this.f17061e = y1Var3;
        this.f17062f = n1Var;
        this.f17063g = o1Var;
        this.f17064h = function0;
        this.f17065i = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.d(this.f17058b, enterExitTransitionElement.f17058b) && Intrinsics.d(this.f17059c, enterExitTransitionElement.f17059c) && Intrinsics.d(this.f17060d, enterExitTransitionElement.f17060d) && Intrinsics.d(this.f17061e, enterExitTransitionElement.f17061e) && Intrinsics.d(this.f17062f, enterExitTransitionElement.f17062f) && Intrinsics.d(this.f17063g, enterExitTransitionElement.f17063g) && Intrinsics.d(this.f17064h, enterExitTransitionElement.f17064h) && Intrinsics.d(this.f17065i, enterExitTransitionElement.f17065i);
    }

    public final int hashCode() {
        int hashCode = this.f17058b.hashCode() * 31;
        y1 y1Var = this.f17059c;
        int hashCode2 = (hashCode + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        y1 y1Var2 = this.f17060d;
        int hashCode3 = (hashCode2 + (y1Var2 == null ? 0 : y1Var2.hashCode())) * 31;
        y1 y1Var3 = this.f17061e;
        return this.f17065i.hashCode() + g.b(this.f17064h, (this.f17063g.f70860a.hashCode() + ((this.f17062f.f70855a.hashCode() + ((hashCode3 + (y1Var3 != null ? y1Var3.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        return new m1(this.f17058b, this.f17059c, this.f17060d, this.f17061e, this.f17062f, this.f17063g, this.f17064h, this.f17065i);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        m1 m1Var = (m1) pVar;
        m1Var.f70832n = this.f17058b;
        m1Var.f70833o = this.f17059c;
        m1Var.f70834p = this.f17060d;
        m1Var.f70835q = this.f17061e;
        m1Var.f70836r = this.f17062f;
        m1Var.f70837s = this.f17063g;
        m1Var.f70838t = this.f17064h;
        m1Var.f70839u = this.f17065i;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f17058b + ", sizeAnimation=" + this.f17059c + ", offsetAnimation=" + this.f17060d + ", slideAnimation=" + this.f17061e + ", enter=" + this.f17062f + ", exit=" + this.f17063g + ", isEnabled=" + this.f17064h + ", graphicsLayerBlock=" + this.f17065i + ')';
    }
}
