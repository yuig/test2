package h72;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f67950r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f67951s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Uri uri, bl2.c cVar) {
        super(2, cVar);
        this.f67950r = bVar;
        this.f67951s = uri;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f67950r, this.f67951s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Size size;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        int i13 = t62.a.f116456a;
        Context context = this.f67950r.f67952a;
        Intrinsics.checkNotNullParameter(context, "context");
        Uri imageUri = this.f67951s;
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String scheme = imageUri.getScheme();
        if (scheme != null && StringsKt.E(scheme, "http", false)) {
            try {
                Bitmap bitmap = (Bitmap) com.bumptech.glide.b.f(context).c().J(imageUri).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                return new Size(bitmap.getWidth(), bitmap.getHeight());
            } catch (Exception unused) {
                return new Size(0, 0);
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(imageUri), null, options);
            size = new Size(options.outWidth, options.outHeight);
        } catch (Exception unused2) {
            size = new Size(0, 0);
        }
        return size;
    }
}
