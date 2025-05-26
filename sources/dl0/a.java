package dl0;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f55173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55174b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55175c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f55176d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f55177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f55178f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f55179g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f55180h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55181i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f55182j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f55183k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f55184l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f55185m;

    /* renamed from: n, reason: collision with root package name */
    public final wy0 f55186n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f55187o;

    /* renamed from: p, reason: collision with root package name */
    public final int f55188p;

    public a(String boardId, String boardName, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, wy0 wy0Var, boolean z27, int i13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f55173a = boardId;
        this.f55174b = boardName;
        this.f55175c = z13;
        this.f55176d = z14;
        this.f55177e = z15;
        this.f55178f = z16;
        this.f55179g = z17;
        this.f55180h = z18;
        this.f55181i = z19;
        this.f55182j = z23;
        this.f55183k = z24;
        this.f55184l = z25;
        this.f55185m = z26;
        this.f55186n = wy0Var;
        this.f55187o = z27;
        this.f55188p = i13;
    }

    public final boolean a() {
        return (this.f55175c || this.f55178f || !this.f55183k || this.f55180h) ? false : true;
    }

    public final boolean b() {
        return (this.f55175c || !this.f55176d || this.f55182j || this.f55184l) ? false : true;
    }
}
