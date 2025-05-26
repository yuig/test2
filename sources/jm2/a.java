package jm2;

import bn2.o;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ln2.u;

/* loaded from: classes2.dex */
public final class a extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f77042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f77043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f77044c;

    public a(u uVar, LinkedHashSet linkedHashSet, boolean z13) {
        this.f77042a = uVar;
        this.f77043b = linkedHashSet;
        this.f77044c = z13;
    }

    public static /* synthetic */ void F0(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "fromSuper";
        } else if (i13 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i13 == 3) {
            objArr[0] = "member";
        } else if (i13 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i13 == 1 || i13 == 2) {
            objArr[2] = "conflict";
        } else if (i13 == 3 || i13 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.bumptech.glide.d
    public final void f(am2.d dVar) {
        if (dVar == null) {
            F0(0);
            throw null;
        }
        o.t(dVar, new xl2.i(this, 2));
        this.f77043b.add(dVar);
    }

    @Override // com.bumptech.glide.d
    public final void w0(am2.d dVar, Collection collection) {
        if (dVar == null) {
            F0(3);
            throw null;
        }
        if (!this.f77044c || dVar.c() == am2.c.FAKE_OVERRIDE) {
            super.w0(dVar, collection);
        }
    }

    @Override // com.bumptech.glide.d
    public final void x(am2.d dVar, am2.d dVar2) {
        if (dVar == null) {
            F0(1);
            throw null;
        }
        if (dVar2 != null) {
            return;
        }
        F0(2);
        throw null;
    }
}
