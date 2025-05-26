package t10;

import a.cb;
import com.pinterest.api.model.r40;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f extends r40 {

    /* renamed from: r, reason: collision with root package name */
    public static final e f115769r = new e(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f115770b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115771c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115772d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115773e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115774f;

    /* renamed from: g, reason: collision with root package name */
    public final String f115775g;

    /* renamed from: h, reason: collision with root package name */
    public final String f115776h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f115777i;

    /* renamed from: j, reason: collision with root package name */
    public final List f115778j;

    /* renamed from: k, reason: collision with root package name */
    public final c f115779k;

    /* renamed from: l, reason: collision with root package name */
    public final List f115780l;

    /* renamed from: m, reason: collision with root package name */
    public final String f115781m;

    /* renamed from: n, reason: collision with root package name */
    public final String f115782n;

    /* renamed from: o, reason: collision with root package name */
    public String f115783o;

    /* renamed from: p, reason: collision with root package name */
    public final int f115784p;

    /* renamed from: q, reason: collision with root package name */
    public final int f115785q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3, String str4, String str5, String str6, @NotNull String _pinUid, boolean z13, List<a> list, c cVar, @NotNull List<String> diets, @NotNull String id3, String str7, @NotNull String recipeYield, int i13, int i14) {
        super(str, str2, str3, str4, str5, str6, _pinUid);
        Intrinsics.checkNotNullParameter(_pinUid, "_pinUid");
        Intrinsics.checkNotNullParameter(diets, "diets");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(recipeYield, "recipeYield");
        this.f115770b = str;
        this.f115771c = str2;
        this.f115772d = str3;
        this.f115773e = str4;
        this.f115774f = str5;
        this.f115775g = str6;
        this.f115776h = _pinUid;
        this.f115777i = z13;
        this.f115778j = list;
        this.f115779k = cVar;
        this.f115780l = diets;
        this.f115781m = id3;
        this.f115782n = str7;
        this.f115783o = recipeYield;
        this.f115784p = i13;
        this.f115785q = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f115770b, fVar.f115770b) && Intrinsics.d(this.f115771c, fVar.f115771c) && Intrinsics.d(this.f115772d, fVar.f115772d) && Intrinsics.d(this.f115773e, fVar.f115773e) && Intrinsics.d(this.f115774f, fVar.f115774f) && Intrinsics.d(this.f115775g, fVar.f115775g) && Intrinsics.d(this.f115776h, fVar.f115776h) && this.f115777i == fVar.f115777i && Intrinsics.d(this.f115778j, fVar.f115778j) && Intrinsics.d(this.f115779k, fVar.f115779k) && Intrinsics.d(this.f115780l, fVar.f115780l) && Intrinsics.d(this.f115781m, fVar.f115781m) && Intrinsics.d(this.f115782n, fVar.f115782n) && Intrinsics.d(this.f115783o, fVar.f115783o) && this.f115784p == fVar.f115784p && this.f115785q == fVar.f115785q;
    }

    public final int hashCode() {
        String str = this.f115770b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f115771c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f115772d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f115773e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f115774f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f115775g;
        int e13 = ep.b.e(this.f115777i, cb.d(this.f115776h, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        List list = this.f115778j;
        int hashCode6 = (e13 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.f115779k;
        int d2 = cb.d(this.f115781m, ep.b.c(this.f115780l, (hashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31);
        String str7 = this.f115782n;
        return Integer.hashCode(this.f115785q) + ep.b.b(this.f115784p, cb.d(this.f115783o, (d2 + (str7 != null ? str7.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f115783o;
        StringBuilder sb3 = new StringBuilder("Recipe(_imageLargeUrl=");
        sb3.append(this.f115770b);
        sb3.append(", _imageSmallUrl=");
        sb3.append(this.f115771c);
        sb3.append(", _locale=");
        sb3.append(this.f115772d);
        sb3.append(", _websiteName=");
        sb3.append(this.f115773e);
        sb3.append(", _title=");
        sb3.append(this.f115774f);
        sb3.append(", _url=");
        sb3.append(this.f115775g);
        sb3.append(", _pinUid=");
        sb3.append(this.f115776h);
        sb3.append(", isFromAggregatedData=");
        sb3.append(this.f115777i);
        sb3.append(", categorizedIngredients=");
        sb3.append(this.f115778j);
        sb3.append(", cookTimes=");
        sb3.append(this.f115779k);
        sb3.append(", diets=");
        sb3.append(this.f115780l);
        sb3.append(", id=");
        sb3.append(this.f115781m);
        sb3.append(", name=");
        a.a.B(sb3, this.f115782n, ", recipeYield=", str, ", serves=");
        sb3.append(this.f115784p);
        sb3.append(", ingredientCount=");
        return a.a.n(sb3, this.f115785q, ")");
    }
}
