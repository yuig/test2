package i91;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f71789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71790b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f71791c;

    /* renamed from: d, reason: collision with root package name */
    public final fd1.m f71792d;

    /* renamed from: e, reason: collision with root package name */
    public final fd1.k0 f71793e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71794f;

    public a(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f71789a = board;
        this.f71790b = i13;
        this.f71791c = board;
        this.f71792d = fd1.m.BOARD_LINK;
        this.f71793e = fd1.k0.LINK;
        this.f71794f = a62.e.share_board_link_title;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71794f;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71793e;
    }

    @Override // i91.c0
    public final int c() {
        return this.f71790b;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71791c;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71792d;
    }
}
