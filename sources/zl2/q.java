package zl2;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;

/* loaded from: classes2.dex */
public final class q extends wn2.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f142141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f142142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f142143d;

    public q(Serializable serializable, Serializable serializable2, int i13) {
        this.f142141b = i13;
        this.f142143d = serializable;
        this.f142142c = serializable2;
    }

    @Override // wn2.k
    public final void c(Object obj) {
        switch (this.f142141b) {
            case 1:
                am2.d current = (am2.d) obj;
                Intrinsics.checkNotNullParameter(current, "current");
                j0 j0Var = (j0) this.f142142c;
                if (j0Var.f80434a == null && ((Boolean) ((Function1) this.f142143d).invoke(current)).booleanValue()) {
                    j0Var.f80434a = current;
                    break;
                }
                break;
        }
    }

    @Override // wn2.k
    public final boolean d(Object obj) {
        int i13 = this.f142141b;
        Object obj2 = this.f142143d;
        Object obj3 = this.f142142c;
        switch (i13) {
            case 0:
                am2.g javaClassDescriptor = (am2.g) obj;
                Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
                String p13 = l0.p1(javaClassDescriptor, (String) obj2);
                if (u.f142155b.contains(p13)) {
                    ((j0) obj3).f80434a = l.HIDDEN;
                } else if (u.f142157d.contains(p13)) {
                    ((j0) obj3).f80434a = l.VISIBLE;
                } else if (u.f142156c.contains(p13)) {
                    ((j0) obj3).f80434a = l.DEPRECATED_LIST_METHODS;
                } else if (u.f142154a.contains(p13)) {
                    ((j0) obj3).f80434a = l.DROP;
                }
                return ((j0) obj3).f80434a == null;
            case 1:
                am2.d current = (am2.d) obj;
                Intrinsics.checkNotNullParameter(current, "current");
                return ((j0) obj3).f80434a == null;
            default:
                if (((Boolean) ((Function1) obj2).invoke(obj)).booleanValue()) {
                    ((boolean[]) obj3)[0] = true;
                }
                return !((boolean[]) obj3)[0];
        }
    }

    @Override // wn2.k
    public final Object j() {
        int i13 = this.f142141b;
        Object obj = this.f142142c;
        switch (i13) {
            case 0:
                l lVar = (l) ((j0) obj).f80434a;
                return lVar == null ? l.NOT_CONSIDERED : lVar;
            case 1:
                return (am2.d) ((j0) obj).f80434a;
            default:
                return Boolean.valueOf(((boolean[]) obj)[0]);
        }
    }

    public q(Function1 function1, j0 j0Var) {
        this.f142141b = 1;
        this.f142142c = j0Var;
        this.f142143d = function1;
    }
}
