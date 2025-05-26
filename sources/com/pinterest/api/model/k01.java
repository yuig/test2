package com.pinterest.api.model;

import android.media.MediaMetadataRetriever;
import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k01 extends pu {

    /* renamed from: g, reason: collision with root package name */
    public static final j01 f39239g = new j01(null);

    /* renamed from: c, reason: collision with root package name */
    public xk2.w f39240c;

    /* renamed from: d, reason: collision with root package name */
    public String f39241d;

    /* renamed from: e, reason: collision with root package name */
    public long f39242e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumSet f39243f;

    public k01() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.pinterest.api.model.pu
    public final boolean g() {
        return (this.f39243f.contains(i01.FAILED_TO_LOAD_THUMBNAIL) || ((Number) this.f39240c.f135234a).intValue() <= 0 || ((Number) this.f39240c.f135235b).intValue() <= 0 || ((Number) this.f39240c.f135236c).intValue() == -1 || this.f39242e == -1 || this.f39241d == null) ? false : true;
    }

    public final xk2.w h() {
        return this.f39240c;
    }

    public final long j() {
        return this.f39242e;
    }

    public final void k() {
        EnumSet enumSet = this.f39243f;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(e());
                j01 j01Var = f39239g;
                String e13 = e();
                j01Var.getClass();
                this.f39240c = j01.a(j01.e(e13, 18, mediaMetadataRetriever), j01.e(e(), 19, mediaMetadataRetriever), j01.e(e(), 24, mediaMetadataRetriever));
                this.f39242e = j01.f(e(), mediaMetadataRetriever);
                this.f39241d = j01.d(e(), 12, mediaMetadataRetriever);
            } catch (IllegalStateException unused) {
                df.j1.U("Metadata not found in media file: %s", new Object[]{e()});
                enumSet.add(i01.NO_METADATA);
            } catch (RuntimeException unused2) {
                df.j1.U("File is corrupt or unable to parse: %s", new Object[]{e()});
                enumSet.add(i01.BAD_MEDIA);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(@NotNull String path) {
        super(path);
        Intrinsics.checkNotNullParameter(path, "path");
        this.f39240c = new xk2.w(0, 0, 0);
        this.f39243f = EnumSet.noneOf(i01.class);
        k();
    }

    public /* synthetic */ k01(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str);
    }
}
