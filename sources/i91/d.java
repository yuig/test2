package i91;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f71807a;

    /* renamed from: b, reason: collision with root package name */
    public final b f71808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71809c;

    /* renamed from: d, reason: collision with root package name */
    public final v7 f71810d;

    /* renamed from: e, reason: collision with root package name */
    public final fd1.m f71811e;

    /* renamed from: f, reason: collision with root package name */
    public final fd1.k0 f71812f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71813g;

    public d(v7 board, b boardPreviewState, int i13) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        this.f71807a = board;
        this.f71808b = boardPreviewState;
        this.f71809c = i13;
        this.f71810d = board;
        this.f71811e = fd1.m.BOARD_VIDEO;
        this.f71812f = fd1.k0.BOARD_VIDEO;
        this.f71813g = a62.e.share_board_video;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71813g;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71812f;
    }

    @Override // i91.c0
    public final int c() {
        return this.f71809c;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71810d;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71811e;
    }
}
