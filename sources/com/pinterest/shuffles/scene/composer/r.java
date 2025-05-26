package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r72.i1;

/* loaded from: classes4.dex */
public final class r extends wd.d {

    /* renamed from: b, reason: collision with root package name */
    public final i1 f52132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52133c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52134d;

    /* renamed from: e, reason: collision with root package name */
    public final String f52135e;

    public r(i1 mask, boolean z13, boolean z14, String cacheSalt) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(cacheSalt, "cacheSalt");
        this.f52132b = mask;
        this.f52133c = z13;
        this.f52134d = z14;
        String str = mask.f106498a;
        str = str == null ? null : str;
        str = str == null ? "" : str;
        CRC32 crc32 = new CRC32();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        crc32.update(bytes);
        long value = crc32.getValue();
        r72.a aVar = mask.f106499b;
        String str2 = aVar != null ? aVar.f106432b : null;
        String str3 = str2 != null ? str2 : "";
        CRC32 crc322 = new CRC32();
        byte[] bytes2 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        crc322.update(bytes2);
        long value2 = crc322.getValue();
        this.f52135e = r.class.getName() + "-" + value + "-" + value2 + "-" + cacheSalt;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        byte[] bytes = this.f52135e.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }

    @Override // wd.d
    public final Bitmap c(qd.d pool, Bitmap toTransform, int i13, int i14) {
        Bitmap b13;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int i15 = j.f52062a;
        Intrinsics.checkNotNullParameter(toTransform, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        i1 mask = this.f52132b;
        Intrinsics.checkNotNullParameter(mask, "mask");
        boolean z13 = this.f52133c;
        boolean z14 = this.f52134d;
        Bitmap bitmap = null;
        if (z13) {
            r72.a aVar = mask.f106499b;
            if (aVar == null || (b13 = j.a(toTransform, pool, aVar, z14)) == null) {
                String str = mask.f106498a;
                if (str != null) {
                    bitmap = j.b(toTransform, pool, str, z14);
                }
            }
            bitmap = b13;
        } else {
            String str2 = mask.f106498a;
            if (str2 == null || (b13 = j.b(toTransform, pool, str2, z14)) == null) {
                r72.a aVar2 = mask.f106499b;
                if (aVar2 != null) {
                    bitmap = j.a(toTransform, pool, aVar2, z14);
                }
            }
            bitmap = b13;
        }
        return bitmap == null ? toTransform : bitmap;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.ExtractStickerTransformation");
        return Intrinsics.d(this.f52132b, ((r) obj).f52132b);
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f52132b.hashCode();
    }
}
