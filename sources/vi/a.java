package vi;

import com.google.android.gms.ads.AdSize;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f125856f = new a(320, 50, "320x50_mb");

    /* renamed from: a, reason: collision with root package name */
    public final int f125857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125858b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125859c = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125860d = false;

    /* renamed from: e, reason: collision with root package name */
    public final String f125861e;

    static {
        new a(AdSize.FULL_BANNER_WIDTH, 60, null);
        new a(320, 100, null);
        new a(AdSize.LEADERBOARD_WIDTH, 90, null);
        new a(AdSize.MEDIUM_RECTANGLE_WIDTH, 250, null);
        new a(-3, -4, "320x50_mb");
    }

    public a(int i13, int i14, String str) {
        this.f125857a = i13;
        this.f125858b = i14;
        if (str == null) {
            str = i13 + "x" + i14 + "_as";
        }
        this.f125861e = str;
        if (i13 < 0 && i13 != -3) {
            throw new IllegalArgumentException(a.a.d("Invalid width for AdSize: ", i13).toString());
        }
        if (i14 < 0 && i14 != -4) {
            throw new IllegalArgumentException(a.a.d("Invalid height for AdSize: ", i14).toString());
        }
    }

    public final boolean a() {
        return this.f125857a == -3 && this.f125858b == -4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f125857a == aVar.f125857a && this.f125858b == aVar.f125858b && Intrinsics.d(this.f125861e, aVar.f125861e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f125861e, Boolean.valueOf(a()));
    }

    public final String toString() {
        return this.f125861e + " " + (a() ? "fluid" : "");
    }
}
