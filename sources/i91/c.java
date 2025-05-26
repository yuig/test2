package i91;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f71802a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f71803b;

    /* renamed from: c, reason: collision with root package name */
    public final fd1.m f71804c;

    /* renamed from: d, reason: collision with root package name */
    public final fd1.k0 f71805d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71806e;

    public c(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f71802a = board;
        this.f71803b = board;
        this.f71804c = fd1.m.UPSELLS;
        this.f71805d = fd1.k0.LINK;
        this.f71806e = a62.e.share_board_link_title;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71806e;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71805d;
    }

    @Override // i91.c0
    public final int c() {
        return 0;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71803b;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71804c;
    }
}
