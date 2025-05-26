package j61;

import en1.f;
import en1.g;
import en1.h;
import en1.i;
import en1.j;
import en1.k;
import en1.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f74817f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f74818g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f74819h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f74820i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f74821j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f74822k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f74823l;

    /* renamed from: a, reason: collision with root package name */
    public String f74824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74826c;

    /* renamed from: d, reason: collision with root package name */
    public final l f74827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74828e;

    static {
        j jVar = j.f59676b;
        f74817f = new a("Palettes", 0, jVar);
        f74818g = new a("Cool neutrals", 1, jVar);
        f74819h = new a("Earth tones", 2, h.f59671b);
        f74820i = new a("Jewel tones", 3, i.f59674b);
        f74821j = new a("Neons", 4, g.f59668b);
        f74822k = new a("Pastels", 5, k.f59678b);
        f74823l = new a("Warm neutrals", 6, f.f59667b);
    }

    public a(String displayName, int i13, l startItem) {
        String apiTerm = "fmc_palette_category_id:" + i13;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(apiTerm, "apiTerm");
        Intrinsics.checkNotNullParameter(startItem, "startItem");
        this.f74824a = displayName;
        this.f74825b = i13;
        this.f74826c = apiTerm;
        this.f74827d = startItem;
        this.f74828e = false;
    }
}
