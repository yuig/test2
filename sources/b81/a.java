package b81;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import nm.s;
import nm.u;
import nm.w;

/* loaded from: classes5.dex */
public final class a implements w {
    @Override // nm.w
    public final s serialize(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        u uVar = new u();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        String encodeToString = Base64.encodeToString(byteArray, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        uVar.u("bitmap", encodeToString);
        return uVar;
    }
}
