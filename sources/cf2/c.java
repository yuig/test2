package cf2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.os.Build;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Picture f27657r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ df2.a f27658s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Picture picture, df2.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f27657r = picture;
        this.f27658s = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f27657r, this.f27658s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Bitmap createBitmap;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Bitmap.Config config = this.f27658s.f54896b;
        int i13 = Build.VERSION.SDK_INT;
        Picture picture = this.f27657r;
        if (i13 >= 28) {
            createBitmap = Bitmap.createBitmap(picture);
            Intrinsics.f(createBitmap);
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), config);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawColor(-1);
        canvas.drawPicture(picture);
        return createBitmap2;
    }
}
