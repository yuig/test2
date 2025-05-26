package xm2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends vm2.a {

    /* renamed from: g, reason: collision with root package name */
    public static final g f135403g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f135404h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135405f;

    static {
        g gVar = new g(1, 9, 0);
        f135403g = gVar;
        int i13 = gVar.f126212c;
        int i14 = gVar.f126211b;
        f135404h = (i14 == 1 && i13 == 9) ? new g(2, 0, 0) : new g(i14, i13 + 1, 0);
        new g(new int[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public final boolean c(g metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        g gVar = f135403g;
        int i13 = this.f126211b;
        int i14 = this.f126212c;
        if (i13 == 2 && i14 == 0 && gVar.f126211b == 1 && gVar.f126212c == 8) {
            return true;
        }
        metadataVersionFromLanguageVersion.getClass();
        if (!this.f135405f) {
            gVar = f135404h;
        }
        gVar.getClass();
        int i15 = metadataVersionFromLanguageVersion.f126211b;
        int i16 = gVar.f126211b;
        if (i16 > i15 || (i16 >= i15 && gVar.f126212c > metadataVersionFromLanguageVersion.f126212c)) {
            metadataVersionFromLanguageVersion = gVar;
        }
        boolean z13 = false;
        if ((i13 == 1 && i14 == 0) || i13 == 0) {
            return false;
        }
        int i17 = metadataVersionFromLanguageVersion.f126211b;
        if (i13 > i17 || (i13 >= i17 && i14 > metadataVersionFromLanguageVersion.f126212c)) {
            z13 = true;
        }
        return !z13;
    }

    public final boolean d() {
        return this.f135405f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int[] versionArray, boolean z13) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f135405f = z13;
    }
}
