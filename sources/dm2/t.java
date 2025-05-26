package dm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55524a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f55525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in2.o f55526c;

    public t(u uVar, LinkedHashSet linkedHashSet) {
        this.f55526c = uVar;
        this.f55525b = linkedHashSet;
    }

    public static /* synthetic */ void F0(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "fromSuper";
        } else if (i13 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i13 == 1 || i13 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.bumptech.glide.d
    public final void f(am2.d fakeOverride) {
        int i13 = this.f55524a;
        Collection collection = this.f55525b;
        switch (i13) {
            case 0:
                if (fakeOverride == null) {
                    F0(0);
                    throw null;
                }
                bn2.o.t(fakeOverride, null);
                ((Set) collection).add(fakeOverride);
                return;
            default:
                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                bn2.o.t(fakeOverride, null);
                ((ArrayList) collection).add(fakeOverride);
                return;
        }
    }

    @Override // com.bumptech.glide.d
    public final void x(am2.d fromSuper, am2.d fromCurrent) {
        switch (this.f55524a) {
            case 0:
                if (fromSuper == null) {
                    F0(1);
                    throw null;
                }
                if (fromCurrent != null) {
                    return;
                }
                F0(2);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                throw new IllegalStateException(("Conflict in scope of " + ((in2.h) this.f55526c).f72868b + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public t(ArrayList arrayList, in2.h hVar) {
        this.f55525b = arrayList;
        this.f55526c = hVar;
    }
}
