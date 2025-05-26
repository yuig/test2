package pn2;

import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f100764b;

    /* renamed from: c, reason: collision with root package name */
    public final sn2.k f100765c;

    /* renamed from: d, reason: collision with root package name */
    public final qn2.g f100766d;

    /* renamed from: e, reason: collision with root package name */
    public final qn2.i f100767e;

    /* renamed from: f, reason: collision with root package name */
    public int f100768f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayDeque f100769g;

    /* renamed from: h, reason: collision with root package name */
    public wn2.i f100770h;

    public a1(boolean z13, boolean z14, sn2.k typeSystemContext, qn2.g kotlinTypePreparator, qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f100763a = z13;
        this.f100764b = z14;
        this.f100765c = typeSystemContext;
        this.f100766d = kotlinTypePreparator;
        this.f100767e = kotlinTypeRefiner;
    }

    public static void a(a1 a1Var, sn2.g subType, sn2.g superType) {
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
    }

    public static w0 d(sn2.g subType, sn2.c superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return w0.CHECK_SUBTYPE_AND_LOWER;
    }

    public static boolean h(f block) {
        Intrinsics.checkNotNullParameter(block, "block");
        v0 v0Var = new v0();
        block.invoke(v0Var);
        return v0Var.f100852a;
    }

    public final void b() {
        ArrayDeque arrayDeque = this.f100769g;
        Intrinsics.f(arrayDeque);
        arrayDeque.clear();
        wn2.i iVar = this.f100770h;
        Intrinsics.f(iVar);
        iVar.clear();
    }

    public boolean c(sn2.f subType, sn2.f superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    public final void e() {
        if (this.f100769g == null) {
            this.f100769g = new ArrayDeque(4);
        }
        if (this.f100770h == null) {
            this.f100770h = new wn2.i();
        }
    }

    public final v1 f(sn2.f type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f100766d.a(type);
    }

    public final b0 g(sn2.f type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return ((qn2.h) this.f100767e).a(type);
    }
}
