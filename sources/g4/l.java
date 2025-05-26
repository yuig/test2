package g4;

import a.cb;
import com.google.android.gms.ads.AdSize;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final l f63467b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f63468c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f63469d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f63470e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f63471f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f63472g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f63473h;

    /* renamed from: a, reason: collision with root package name */
    public final int f63474a;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(AdSize.MEDIUM_RECTANGLE_WIDTH);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(AdSize.WIDE_SKYSCRAPER_HEIGHT);
        f63467b = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f63468c = lVar3;
        f63469d = lVar4;
        f63470e = lVar5;
        f63471f = lVar6;
        f63472g = lVar7;
        f63473h = f0.j(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i13) {
        this.f63474a = i13;
        if (1 > i13 || i13 >= 1001) {
            throw new IllegalArgumentException(a.a.d("Font weight can be in range [1, 1000]. Current value: ", i13).toString());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        return Intrinsics.i(this.f63474a, lVar.f63474a);
    }

    public final int b() {
        return this.f63474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f63474a == ((l) obj).f63474a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f63474a;
    }

    public final String toString() {
        return cb.l(new StringBuilder("FontWeight(weight="), this.f63474a, ')');
    }
}
