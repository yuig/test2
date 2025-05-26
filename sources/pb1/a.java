package pb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99435a;

    /* renamed from: b, reason: collision with root package name */
    public final yn1.f f99436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99437c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99438d;

    public a(boolean z13, yn1.f passcodeInputVariant, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(passcodeInputVariant, "passcodeInputVariant");
        this.f99435a = z13;
        this.f99436b = passcodeInputVariant;
        this.f99437c = z14;
        this.f99438d = z15;
    }

    public static a e(a aVar, boolean z13, yn1.f passcodeInputVariant, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            z13 = aVar.f99435a;
        }
        if ((i13 & 2) != 0) {
            passcodeInputVariant = aVar.f99436b;
        }
        if ((i13 & 4) != 0) {
            z14 = aVar.f99437c;
        }
        boolean z15 = (i13 & 8) != 0 ? aVar.f99438d : false;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(passcodeInputVariant, "passcodeInputVariant");
        return new a(z13, passcodeInputVariant, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99435a == aVar.f99435a && this.f99436b == aVar.f99436b && this.f99437c == aVar.f99437c && this.f99438d == aVar.f99438d;
    }

    public final boolean f() {
        return this.f99438d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99438d) + ep.b.e(this.f99437c, (this.f99436b.hashCode() + (Boolean.hashCode(this.f99435a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BasePasscodeRequiredDisplayState(isSubmitButtonEnabled=");
        sb3.append(this.f99435a);
        sb3.append(", passcodeInputVariant=");
        sb3.append(this.f99436b);
        sb3.append(", isPasscodeInputErrorHelperTextVisible=");
        sb3.append(this.f99437c);
        sb3.append(", isConfirmingPasscodeCurtainVisible=");
        return a.a.r(sb3, this.f99438d, ")");
    }
}
