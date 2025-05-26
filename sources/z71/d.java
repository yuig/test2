package z71;

import a.cb;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lz71/d;", "", "", "a", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "uid", "b", "getMask", "mask", "Landroid/graphics/Bitmap;", "c", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("uid")
    @NotNull
    private final String uid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("mask")
    @NotNull
    private final String mask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("bitmap")
    private final Bitmap bitmap;

    public d(String uid, String mask, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.uid = uid;
        this.mask = mask;
        this.bitmap = bitmap;
    }

    public static d a(d dVar, Bitmap bitmap) {
        String uid = dVar.uid;
        String mask = dVar.mask;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new d(uid, mask, bitmap);
    }

    /* renamed from: b, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.uid, dVar.uid) && Intrinsics.d(this.mask, dVar.mask) && Intrinsics.d(this.bitmap, dVar.bitmap);
    }

    public final int hashCode() {
        int d2 = cb.d(this.mask, this.uid.hashCode() * 31, 31);
        Bitmap bitmap = this.bitmap;
        return d2 + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        String str = this.uid;
        String str2 = this.mask;
        Bitmap bitmap = this.bitmap;
        StringBuilder w13 = a.a.w("CollageLocalItem(uid=", str, ", mask=", str2, ", bitmap=");
        w13.append(bitmap);
        w13.append(")");
        return w13.toString();
    }
}
